#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Score Republic - Live Ticker (s-tech services)."""

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
        ("LEFTPADDING", (0, 0), (-1, -1), 5),
        ("RIGHTPADDING", (0, 0), (-1, -1), 5),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
    ]
    if header:
        style += [
            ("BACKGROUND", (0, 0), (-1, 0), HEAD_BG),
            ("BACKGROUND", (0, 1), (-1, 1), ALT_BG),
        ]
        for i in range(2, len(data)):
            if i % 2 == 1:
                style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    else:
        for i in range(len(data)):
            if i % 2 == 1:
                style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


PERMISSIONS = (
    "android.permission.INTERNET, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "com.google.android.gms.permission.AD_ID, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.WAKE_LOCK, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "live.football.scorerepublic.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

LIBRARIES = (
    "Kotlin 2.3.21 + kotlinx-coroutines 1.9.0, "
    "androidx.appcompat 1.7.1, androidx.activity 1.13.0, androidx.core 1.18.0, "
    "androidx.core-splashscreen 1.2.0, androidx.browser 1.10.0, "
    "androidx.fragment (+ktx), androidx.lifecycle, androidx.datastore 1.1.7, "
    "androidx.constraintlayout 2.2.1, androidx.webkit/WebView, "
    "androidx.emoji2, androidx.profileinstaller, androidx.startup, "
    "com.google.firebase (analytics 23.2.0, messaging, inappmessaging, "
    "installations, common), Google Play Services Measurement 23.2.0 / "
    "ads-identifier 18.0.0 / basement-base-tasks, "
    "com.bumptech.glide, com.zhuinden.fragmentviewbindingdelegatekt, "
    "View Binding (AGP databinding 9.2.1)"
)

SHARED_PREFS = (
    "getPreferences(0): флаг notification_permission_denied — запоминает, "
    "что пользователь отказал в разрешении на уведомления; состояние "
    "встроенного окна сайта сохраняется в Bundle экрана (не в prefs)"
)

SUSPICIOUS_WORDS = "webview, loadUrl, redirect"

SUSPICIOUS_DOMAINS = ["config.ru", "scorerepublic.e-2.at"]

MAIN_ROWS = [
    ("Название приложения", "Score Republic - Live Ticker"),
    ("Android Gradle Plugin", "9.2.1"),
    ("minSdk", "29"),
    ("targetSdk", "35"),
    ("Kotlin", "да, 2.3.21"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", "нет"),
    (
        "Аналитика",
        "Firebase Analytics, Firebase Cloud Messaging, Firebase In-App Messaging, "
        "Firebase Installations, Google Play Services Measurement, "
        "Advertising ID / Install Referrer",
    ),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", ", ".join(SUSPICIOUS_DOMAINS)),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]

DOMAIN_BLURBS = {
    "config.ru": (
        "Имя config.ru попало в проверку из названия языкового сплита "
        "config.ru.apk (русская локаль Google Play), а не из сетевого адреса "
        "в коде. В приложении нет запросов на хост config.ru: базовый адрес "
        "контента — scorerepublic.e-2.at. Открыть страницу не удалось "
        "(таймаут); регистратор RU-CENTER. На вид это ложное срабатывание "
        "пайплайна, а не рабочий «гейт» проверки трафика."
    ),
    "scorerepublic.e-2.at": (
        "Это основной адрес приложения: сразу после заставки во встроенном "
        "окне сайта открывается https://scorerepublic.e-2.at/ (строка base_url). "
        "Сайт отдаёт страницу Score Republic (лайв-тикер / коэффициенты), без "
        "редиректа. Отдельной тихой проверки «кому оффер» перед этим адресом "
        "в коде нет — всем показывают один и тот же сайт. Регистратор — "
        "Hutchison Drei Austria GmbH; по VirusTotal детекций 0/91."
    ),
}


def domain_rows_from_check(entry):
    rows = []
    for item in entry.get("table_rows") or []:
        rows.append((item.get("param", ""), item.get("value", "")))
    return rows


def build():
    with open(CHECKS, encoding="utf-8") as f:
        checks = json.load(f)

    report_domains = checks.get("report_domains") or SUSPICIOUS_DOMAINS
    by_domain = {c["domain"]: c for c in checks.get("checked") or []}

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=12 * mm,
        bottomMargin=12 * mm,
    )
    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "Score Republic - Live Ticker — s-tech services — "
            "live.football.scorerepublic (версия 1.7.5 / 26)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: live.football.scorerepublic.xapk, apk/* (base + config splits), "
            "meta.json, domain_checks, AndroidManifest.xml, strings.xml, "
            "decompiled/sources (SRApplication, MainActivity, WebViewFragment, "
            "SRFirebaseMessagingService, yi1 WebViewClient, AnalyticsWebInterface).",
            SMALL,
        )
    )
    story.append(Paragraph("SDK / стек", H2))
    story.append(
        kv_table(MAIN_ROWS, header=("Параметр", "Значение"))
    )

    story.append(Paragraph("Проверка подозрительных доменов", H2))
    story.append(
        Paragraph(
            "Данные ниже взяты как есть из готовых проверок domain_checks "
            "(VirusTotal + редирект + контент + парковка). Хост "
            "debug.firebase.analytics.app исключён из таблицы выше как "
            "известный служебный домен Firebase Analytics.",
            SMALL,
        )
    )

    for domain in report_domains:
        entry = by_domain.get(domain)
        if not entry:
            continue
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        rows = domain_rows_from_check(entry)
        story.append(
            kv_table(
                rows,
                widths=(62 * mm, 108 * mm),
                header=("Параметр / движок", "Значение / вердикт"),
            )
        )
        blurb = DOMAIN_BLURBS.get(domain)
        if blurb:
            story.append(Spacer(1, 4))
            story.append(Paragraph(esc(blurb), BODY))

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
