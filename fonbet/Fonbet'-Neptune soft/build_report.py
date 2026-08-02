#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Fonbet' (Neptune soft)."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import (Paragraph, SimpleDocTemplate, Spacer, Table,
                                TableStyle)

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20,
                    spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16,
                    spaceBefore=12, spaceAfter=6,
                    textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4,
                      alignment=TA_LEFT, spaceAfter=5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
SMALL = ParagraphStyle("SMALL", fontName="DJ", fontSize=8.4, leading=11.6,
                       textColor=colors.HexColor("#444444"), spaceAfter=6)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (str(text).replace("&", "&amp;").replace("<", "&lt;")
            .replace(">", "&gt;"))


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append([
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B),
        ])
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
    "android.permission.SCHEDULE_EXACT_ALARM, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.READ_MEDIA_IMAGES, "
    "android.permission.READ_MEDIA_VIDEO, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.WAKE_LOCK, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.gms.permission.AD_ID, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "com.neptunesoft.bacdz.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

AD_NETWORKS = (
    "AdMob / Google Mobile Ads (interstitial), "
    "Meta Audience Network (Facebook mediation adapter)"
)

ANALYTICS = (
    "Firebase Analytics (connector / measurement), "
    "Firebase Cloud Messaging, Firebase Installations, "
    "Firebase Realtime Database (обратная связь), "
    "Firebase Storage (скачивание PDF), "
    "Firebase App Check, Google Play Services datatransport / measurement"
)

LIBRARIES = (
    "androidx.appcompat 1.7.1, androidx.activity 1.8.0, androidx.fragment 1.5.4, "
    "androidx.core / core-ktx 1.13.0, androidx.browser 1.8.0, androidx.webkit "
    "1.11.0-alpha02, androidx.cardview, androidx.constraintlayout 2.2.1, "
    "androidx.coordinatorlayout, androidx.recyclerview 1.4.0, "
    "androidx.viewpager / viewpager2, androidx.room 2.7.2, androidx.sqlite 2.5.1, "
    "androidx.datastore 1.1.3, androidx.lifecycle, androidx.startup, "
    "androidx.swiperefreshlayout, androidx.work 2.7.0, androidx.emoji2, "
    "androidx.print, androidx.media, androidx.privacysandbox.ads, "
    "androidx.profileinstaller, com.google.android.material 1.12.0, "
    "Kotlin stdlib + kotlinx-coroutines 1.9.0, okio, "
    "Google Play Services (ads, ads-identifier, appset, base, basement, "
    "cloud-messaging, measurement, tasks, auth), "
    "Firebase (common, analytics, messaging, database, storage, installations, "
    "appcheck, datatransport, iid), "
    "Google Play In-App Review (com.google.android.play.core.review), "
    "com.github.barteksc.pdfviewer, com.shockwave.pdfium, "
    "com.makeramen.roundedimageview, Meta Audience Network (com.facebook.ads)"
)

SHARED_PREFS = (
    "DARKMODE — флаг тёмной темы (ключ switchkey1); "
    "USEAPP — счётчик запусков (ключ switchkey2), после 20 запусков "
    "показывается окно оценки в Google Play"
)

SUSPICIOUS_DOMAINS = [
    "bacalgeria.com",
    "config.ru",
    "dzetude.com",
    "eddirasa.com",
    "ency-education.com",
    "neptune-soft.com",
]

DOMAIN_NOTES = {
    "bacalgeria.com": (
        "В приложении это обычная ссылка из раздела «ресурсы» "
        "(экран ResourcesActivity): человек сам нажимает пункт "
        "«موقع بكالوريا الجزائر», и телефон открывает сайт во внешнем браузере. "
        "По готовой проверке пайплайна адрес сейчас уводит на трекер кликов "
        "click-v4.exmainclcknew.com — это поведение самого сайта, а не скрытая "
        "проверка внутри программы. В VirusTotal детекций нет (0/91)."
    ),
    "config.ru": (
        "В коде и строках приложения такого адреса нет: имя попало в список "
        "из-за файла языкового сплита config.ru.apk (язык «ru»), а не как "
        "живой сайт внутри программы. Проверка пайплайна показывает "
        "парковку у RU-CENTER, страницу открыть не удалось (таймаут). "
        "К работе приложения этот домен не подключён."
    ),
    "dzetude.com": (
        "Это алжирский образовательный сайт из того же списка ресурсов: "
        "пункт «موقع التعليم الجزائري» открывает раздел для старшеклассников. "
        "Человек переходит по ссылке сам, после нажатия. По проверке сайт "
        "открывается без вредоносных вердиктов (0/91) и выглядит как "
        "учебный портал."
    ),
    "eddirasa.com": (
        "Ссылка «موقع الدراسة الجزائري» в разделе ресурсов и имена PDF-файлов "
        "с префиксом eddirasa в списках прошлых экзаменов. Сайт нужен как "
        "внешний учебный источник; открывается во внешнем браузере по желанию "
        "человека. VirusTotal: 0/91, страница — образовательный портал "
        "Алжира без редиректа."
    ),
    "ency-education.com": (
        "Ещё один пункт в списке учебных сайтов: «الموقع الأول لدراسة في الجزائر», "
        "открывается раздел secondaire. Это справочный внешний ресурс, не "
        "тихий «gate» и не рекламный оффер после фильтра. По проверке "
        "детекций нет, контент — образовательный сайт."
    ),
    "neptune-soft.com": (
        "Сайт разработчика Neptune soft: кнопка «веб» на экране «О приложении» "
        "и проект Firebase (neptune-soft.firebaseio.com / appspot). "
        "Отсюда же качают PDF через Firebase Storage и принимают отзывы "
        "в Realtime Database. По проверке домен чистый (0/91); это "
        "витрина разработчика, а не скрытый оффер."
    ),
}

MAIN_ROWS = [
    ("Название приложения", "Fonbet'"),
    ("Android Gradle Plugin", "8.12.1"),
    ("minSdk", "23"),
    ("targetSdk", "35"),
    ("Kotlin", "да (Kotlin + kotlinx-coroutines 1.9.0)"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", ", ".join(SUSPICIOUS_DOMAINS)),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", "нет"),
]


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Fonbet'",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "Fonbet' &mdash; Neptune soft &mdash; com.neptunesoft.bacdz "
        "(на экране: بكالوريا علوم تجريبية)", BODY))
    story.append(Paragraph(
        "Разобраны: xapk/apk-сплиты, meta.json, domain_checks, "
        "AndroidManifest.xml, strings.xml и decompiled/sources "
        "(точка входа SplashScreen → HomeActivity, ResourcesActivity, "
        "FeedbackActivity, Firebase Storage/Messaging, AdMob).", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    story.append(Paragraph("Проверка подозрительных доменов", H2))
    story.append(Paragraph(
        "Данные ниже взяты как есть из готовых проверок пайплайна "
        "(domain_checks.json / domain_checks.md): сводка VirusTotal, полный список "
        "Security vendors' analysis и три дополнительных пункта в конце.", SMALL))

    for dom in SUSPICIOUS_DOMAINS:
        rec = by_domain.get(dom)
        if not rec:
            continue
        rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
        story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
        story.append(kv_table(rows, widths=(62 * mm, 108 * mm),
                              header=("Параметр / движок", "Значение / вердикт")))
        note = DOMAIN_NOTES.get(dom)
        if note:
            story.append(Paragraph(esc(note), BODY))
        story.append(Spacer(1, 3 * mm))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
