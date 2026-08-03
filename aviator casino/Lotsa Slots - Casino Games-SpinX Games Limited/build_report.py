#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Lotsa Slots - Casino Online (SpinX Games Limited)."""

import json
import os
import re

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Spacer, Table, TableStyle

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")
CHECKS_MD = os.path.join(BASE, "domain_checks.md")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20, spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16, spaceBefore=12, spaceAfter=6, textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4, alignment=TA_LEFT, spaceAfter=5)
SMALL = ParagraphStyle("SMALL", fontName="DJ", fontSize=8.2, leading=11.2, alignment=TA_LEFT, spaceAfter=4, textColor=colors.HexColor("#334155"))
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")

PERMISSIONS = (
    "android.permission.INTERNET, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.CHANGE_WIFI_STATE, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.WAKE_LOCK, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.android.launcher.permission.INSTALL_SHORTCUT, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.VIBRATE, "
    "android.permission.READ_LOGS, "
    "com.google.android.gms.permission.AD_ID, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "com.android.vending.BILLING, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.amazon.privacypass.ATTEST, "
    "android.permission.FOREGROUND_SERVICE, "
    "com.diamondlife.slots.vegas.free.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

LIBRARIES = (
    "org.cocos2dx (Lua / bole), androidx.* (appcompat, browser, webkit, compose, datastore, media), "
    "com.google.android.gms (ads, auth, games, measurement), com.google.firebase, "
    "com.adjust.sdk, com.facebook (core, ads), com.ironsource, com.unity3d.ads/services, "
    "com.vungle, com.inmobi, com.fyber, com.moloco, com.digitalturbine.ignite, "
    "com.helpshift, okhttp3, okio, coil, kotlinx.coroutines, io.ktor"
)

AD_NETWORKS = (
    "AdMob, ironSource, Unity Ads, Vungle, InMobi, Fyber, Moloco, "
    "Digital Turbine, Facebook Audience Network"
)

ANALYTICS = (
    "Adjust, Firebase Analytics, Firebase Crashlytics, "
    "Facebook App Events, Google Analytics, OneSignal"
)

SHARED_PREFS = (
    "bole_referrer_preferences (install referrer), "
    "default SharedPreferences (isAppInstalled, notification_authorization, reject_notify, fcm_type_*, fcm_track, произвольные ключ/значение через BoleJavaUtil), "
    "google.analytics.deferred.deeplink.prefs (deferred deeplink), "
    "Amazon IAP prefs ORANGES_*, "
    "Cocos2dxLocalStorage (SQLite key/value для игровых настроек)"
)

SUSPICIOUS_WORDS = (
    "casino, slots, offer, redirect, landing, WebView, deposit, "
    "withdraw, gambling (в брендинге/игровых строках и SDK), "
    "WebpageRecallController"
)


def esc(text):
    return str(text).replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append(
            [
                Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
                Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B),
            ]
        )
    for k, v in rows:
        data.append([Paragraph(esc(k), CELL_B), Paragraph(esc(v), CELL)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 5),
        ("RIGHTPADDING", (0, 0), (-1, -1), 5),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
    ]
    if header:
        style += [("BACKGROUND", (0, 0), (-1, 0), HEAD_BG)]
        start = 1
    else:
        start = 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


def parse_domain_checks_md(path):
    text = open(path, encoding="utf-8").read()
    parts = re.split(r"(?m)^## Проверка домена:\s*", text)
    domains = []
    for part in parts[1:]:
        lines = part.strip().splitlines()
        domain = lines[0].strip()
        rows = []
        for line in lines:
            m = re.match(r"^\|\s*(.*?)\s*\|\s*(.*?)\s*\|$", line)
            if not m:
                continue
            k, v = m.group(1).strip(), m.group(2).strip()
            if k.startswith("---") or k in ("Параметр / движок",):
                continue
            rows.append((k, v))
        domains.append((domain, rows))
    return domains


DOMAIN_NOTES = {
    "123.com": (
        "Строка https://www.123.com встречается в рекламных ассетах рядом с "
        "адресом InMobi и похожа на заглушку/пример, а не на рабочий игровой "
        "сервер. DNS снаружи не резолвится, страницы нет. VirusTotal даёт "
        "1/91 (Chong Lua Dao — Malicious), остальные отмеченные движки — Clean "
        "или Unrated. К запуску Lotsa Slots, серверной «проверке кого пустить» "
        "и показу внешнего оффера этот хост не привязан: после старта открывается "
        "сама слот-игра SpinX/Bole на Cocos2d-x, а не развилка white/offer."
    ),
}


def main():
    checks = json.load(open(CHECKS, encoding="utf-8"))
    report_domains = checks.get("report_domains") or [
        c["domain"] for c in checks.get("checked", [])
    ]

    sdk_rows = [
        ("Название приложения", "Lotsa Slots - Casino Online"),
        ("Android Gradle Plugin", "7.4.2"),
        ("minSdk", "21"),
        ("targetSdk", "35"),
        ("Kotlin", "да 2.1"),
        ("Web View", "да"),
        ("Custom Tabs", "да"),
        ("Рекламные сети", AD_NETWORKS),
        ("Аналитика", ANALYTICS),
        ("Permissions", PERMISSIONS),
        ("Libraries", LIBRARIES),
        ("Подозрительные домены", ", ".join(report_domains) if report_domains else "нет"),
        ("SharedPreferences", SHARED_PREFS),
        ("Есть ли клоака", "нет"),
        ("Подозрительные слова", SUSPICIOUS_WORDS),
    ]

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=16 * mm,
        rightMargin=16 * mm,
        topMargin=14 * mm,
        bottomMargin=14 * mm,
        title="Отчёт по анализу APK — Lotsa Slots - Casino Online",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "Lotsa Slots - Casino Online — SpinX Games Limited — "
            "com.diamondlife.slots.vegas.free (версия 4.90 / 534)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: XAPK и splits (base, arm64_v8a, en, hdpi), meta.json, "
            "domain_checks, AndroidManifest.xml, strings.xml, assets/src/config.plist, "
            "Lua-ассеты, org.cocos2dx.bole / lua / lib / plugin, рекламные и "
            "аналитические SDK. Точка входа: BoleApplication → AppActivity "
            "(Cocos2d-x Lua).",
            SMALL,
        )
    )

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(sdk_rows, header=("Параметр", "Значение")))

    md_domains = parse_domain_checks_md(CHECKS_MD)
    if md_domains:
        for domain, rows in md_domains:
            story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
            story.append(
                kv_table(
                    rows,
                    widths=(62 * mm, 108 * mm),
                    header=("Параметр / движок", "Значение / вердикт"),
                )
            )
            note = DOMAIN_NOTES.get(domain)
            if note:
                story.append(Paragraph(esc(note), BODY))
            story.append(Spacer(1, 2 * mm))

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
