#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK 1xBet (AppToolio Soft / com.dogearn.dogemoney)."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import (
    KeepTogether,
    PageBreak,
    Paragraph,
    SimpleDocTemplate,
    Spacer,
    Table,
    TableStyle,
)

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle(
    "H1",
    fontName="DJ-B",
    fontSize=16,
    leading=20,
    spaceAfter=8,
    textColor=colors.HexColor("#12263f"),
)
H2 = ParagraphStyle(
    "H2",
    fontName="DJ-B",
    fontSize=12.5,
    leading=16,
    spaceBefore=12,
    spaceAfter=6,
    textColor=colors.HexColor("#12263f"),
)
BODY = ParagraphStyle(
    "BODY",
    fontName="DJ",
    fontSize=9.3,
    leading=13.4,
    alignment=TA_LEFT,
    spaceAfter=5,
)
BULLET = ParagraphStyle("BULLET", parent=BODY, leftIndent=10, spaceAfter=3.5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
SMALL = ParagraphStyle(
    "SMALL",
    fontName="DJ",
    fontSize=8.4,
    leading=11.6,
    textColor=colors.HexColor("#444444"),
    spaceAfter=6,
)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (
        str(text)
        .replace("&", "&amp;")
        .replace("<", "&lt;")
        .replace(">", "&gt;")
    )


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append(
            [
                Paragraph(
                    '<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B
                ),
                Paragraph(
                    '<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B
                ),
            ]
        )
    for k, v in rows:
        data.append([Paragraph(esc(k), CELL_B), Paragraph(esc(v), CELL)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 4),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
    ]
    if header:
        style.append(("BACKGROUND", (0, 0), (-1, 0), HEAD_BG))
    start = 1 if header else 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


PERMISSIONS = (
    "android.permission.INTERNET, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.VIBRATE, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.WAKE_LOCK, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.dogearn.dogemoney.permission.C2D_MESSAGE"
)

AD_NETWORKS = "AdMob, Google Mobile Ads (баннер, interstitial, Publisher / DoubleClick)"

ANALYTICS = (
    "Firebase Analytics, Firebase Core, Google Play Services Measurement, "
    "Firebase Auth, Firebase Database, Firebase Cloud Messaging / IID, "
    "Install Referrer"
)

LIBRARIES = (
    "androidx.appcompat 1.0.0, androidx.core 1.0.0, androidx.fragment 1.0.0, "
    "androidx.recyclerview 1.0.0, androidx.cardview 1.0.0, "
    "androidx.coordinatorlayout 1.0.0, androidx.drawerlayout 1.0.0, "
    "androidx.legacy-support-core-ui/utils 1.0.0, androidx.transition 1.0.0, "
    "androidx.vectordrawable (+animated) 1.0.0, androidx.viewpager 1.0.0, "
    "androidx.swiperefreshlayout 1.0.0, androidx.slidingpanelayout 1.0.0, "
    "androidx.loader 1.0.0, androidx.localbroadcastmanager 1.0.0, "
    "androidx.customview 1.0.0, androidx.cursoradapter 1.0.0, "
    "androidx.documentfile 1.0.0, androidx.print 1.0.0, "
    "androidx.asynclayoutinflater 1.0.0, androidx.interpolator 1.0.0, "
    "androidx.versionedparcelable 1.0.0, "
    "android.arch.lifecycle (runtime/livedata/viewmodel) 1.1.1, "
    "android.arch.core-runtime 1.1.1, "
    "android.support.design / Material Components 1.0.0-rc01, "
    "play-services-ads 15.0.0 (+ads-lite/base/gass), "
    "play-services-ads-identifier 15.0.1, "
    "play-services-base/basement/tasks/stats/flags 15.0.1, "
    "play-services-measurement-base 16.0.0, "
    "firebase-core 16.0.1, firebase-analytics 16.0.1 (+impl 16.1.1), "
    "firebase-auth 16.0.1, firebase-database 16.0.1, "
    "firebase-messaging 17.0.0, firebase-iid 16.0.0, firebase-common 16.0.0, "
    "android.support.customtabs (через AdMob)"
)

SHARED_PREFS = (
    "your_prefs/your_int_key — очки/баланс за задания; "
    "mypref/lastclicktime — время последнего клика по заданию (кулдаун); "
    "sharedUserData — имя, email, телефон, баланс, выводы, число игр; "
    "также служебные prefs Firebase Auth и флаги Google Ads"
)

SUSPICIOUS_WORDS = (
    "affiliate, withdraw, offer, Invalid Click, webview, loadUrl, "
    "redirect, VPN"
)

SUSPICIOUS_DOMAINS = [
    "dogearn.info",
    "libcore.icu.icu",
    "wwww.dogearn.info",
]

MAIN_ROWS = [
    ("Название приложения", "1xBet (в приложении: Doge Money / DOGEARN)"),
    ("Android Gradle Plugin", "нет"),
    ("minSdk", "19"),
    ("targetSdk", "28"),
    ("Kotlin", "нет"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", ", ".join(SUSPICIOUS_DOMAINS)),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]

DOMAIN_NOTES = {
    "dogearn.info": (
        "Это основной сайт проекта DOGEARN. В коде он открывается как "
        "https://www.dogearn.info во встроенном окне сайта (кнопка Website "
        "на стартовом экране) и через обычный браузер телефона из раздела "
        "контактов. По проверке пайплайна DNS сейчас не отвечает, поэтому "
        "страница недоступна; на вид это не шлюз скрытой проверки трафика, "
        "а публичный адрес «белого» сервиса заработка."
    ),
    "libcore.icu.icu": (
        "В байткоде приложения встречается имя системного класса Android "
        "libcore.icu.ICU (служебная библиотека платформы), а не сетевой "
        "вызов на этот хост. Отдельного запроса к libcore.icu.icu в логике "
        "запуска, рекламы или показа сайта нет. По VirusTotal одна отметка "
        "Suspicious, DNS не резолвится — для пользователя приложения этот "
        "«домен» по сути не используется."
    ),
    "wwww.dogearn.info": (
        "Строка wwww.dogearn.info (с четырьмя «w») нарисована текстом на "
        "кнопках экранов заданий/рекламы; в коде загрузки страницы уходит "
        "на https://www.dogearn.info (три «w»), а не на этот опечатанный "
        "хост. DNS для wwww.dogearn.info не резолвится. На вид это "
        "опечатка в макете, а не рабочий адрес проверки или оффера."
    ),
}


def domain_rows_from_check(entry):
    rows = []
    for item in entry.get("table_rows") or []:
        rows.append((item.get("param", ""), item.get("value", "")))
    if rows:
        return rows
    vt = entry.get("virustotal") or {}
    rows = [
        ("Домен", entry.get("domain", "")),
        ("VirusTotal URL", vt.get("vt_url", "")),
        ("Детекции", vt.get("detections", "")),
        ("Security vendors' analysis", "ниже построчно, как на VirusTotal"),
    ]
    for name, verdict in vt.get("vendor_rows") or []:
        rows.append((name, verdict))
    rows.append(("Куда редиректит", entry.get("redirects_to", "нет")))
    rows.append(("Что выводит (кратко)", entry.get("page_output", "нет")))
    rows.append(("Где припаркован", entry.get("parked_at", "нет")))
    return rows


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=18 * mm,
        rightMargin=18 * mm,
        topMargin=15 * mm,
        bottomMargin=15 * mm,
        title="Отчёт по анализу APK — 1xBet",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "1xBet &mdash; AppToolio Soft &mdash; com.dogearn.dogemoney "
            "(в ресурсах: Doge Money / DOGEARN, версия 5.0)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: APK, apk/, meta.json, domain_checks, "
            "AndroidManifest.xml, strings.xml, decompiled/sources "
            "(OrginalActivity, WebsiteActivity, SplashActivity, "
            "Signin/Register/Home, AdMob, Firebase).",
            SMALL,
        )
    )

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    story.append(PageBreak())
    story.append(Paragraph("Проверка подозрительных доменов", H2))
    story.append(
        Paragraph(
            "Данные ниже взяты как есть из готовых проверок пайплайна "
            "(domain_checks.json / domain_checks.md): сводка VirusTotal, "
            "полный список Security vendors' analysis и три дополнительных "
            "пункта в конце.",
            SMALL,
        )
    )

    for domain in SUSPICIOUS_DOMAINS:
        entry = by_domain.get(domain)
        if not entry:
            continue
        block = [
            Paragraph("Проверка домена: %s" % esc(domain), H2),
            kv_table(
                domain_rows_from_check(entry),
                widths=(62 * mm, 108 * mm),
                header=("Параметр / движок", "Значение / вердикт"),
            ),
            Spacer(1, 3 * mm),
            Paragraph(esc(DOMAIN_NOTES.get(domain, "")), BODY),
            Spacer(1, 4 * mm),
        ]
        story.append(KeepTogether(block[:2]))
        story.append(block[2])
        story.append(block[3])
        story.append(block[4])

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
