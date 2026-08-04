#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта: 1xbet' / SALAMA dev / com.salamadev.nabilalawadi.kisaskoran."""

import os

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
        style.append(("BACKGROUND", (0, 0), (-1, 0), HEAD_BG))
        start = 1
    else:
        start = 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


PERMISSIONS = (
    "android.permission.INTERNET, "
    "android.permission.WRITE_SETTINGS, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK, "
    "com.google.android.gms.permission.AD_ID, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "com.google.android.providers.gsf.permission.READ_GSERVICES, "
    "com.salamadev.nabilalawadi.kisaskoran.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

LIBRARIES = (
    "Flutter 3.32.7 (Andromo builder / package:builder), "
    "Kotlin 2.1.0 + kotlinx-coroutines, "
    "audio_service / just_audio / audio_session (Ryan Heise), "
    "google_mobile_ads (AdMob) + UMP, "
    "flutter_flurry_sdk / Flurry Android SDK, "
    "firebase_core / firebase_auth / cloud_firestore / firebase_database / firebase_storage, "
    "flutter_inappwebview, webview_flutter, url_launcher, androidx.browser (Custom Tabs), "
    "sentry_flutter, "
    "shared_preferences, flutter_secure_storage, sqflite, "
    "device_info_plus, package_info_plus, android_id, connectivity_plus, share_plus, "
    "path_provider, permission_handler, ExoPlayer/media stack"
)

SHARED_PREFS = (
    "FlutterSharedPreferences — настройки приложения и согласие с условиями; "
    "FLURRY_SHARED_PREFERENCES — кэш advertising_id и ad_tracking_enabled для аналитики; "
    "IABTCF_TCString — строка согласия UMP/GDPR; "
    "admob_user_agent — кэш User-Agent для рекламы. "
    "Ключей offer/cloak/landing URL нет"
)

MAIN_ROWS = [
    ("Название приложения", "1xbet'"),
    ("Android Gradle Plugin", "8.7.3"),
    ("minSdk", "24"),
    ("targetSdk", "35"),
    ("Kotlin", "да, 2.1.0"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", "AdMob"),
    ("Аналитика", "Flurry, Sentry"),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", "нет"),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    (
        "Подозрительные слова",
        "rootcloak, OFFER_PRESENTED, whitelist, redirect",
    ),
]


def build():
    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=14 * mm,
        bottomMargin=14 * mm,
        title="Отчёт по анализу APK — 1xbet' (SALAMA dev)",
        author="Анализ Android APK",
    )
    story = []
    story.append(Paragraph("SDK / стек", H1))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))
    story.append(Spacer(1, 8))
    story.append(
        Paragraph(
            esc(
                "После разбора манифеста, jadx-исходников, Flutter-бинаря libapp.so "
                "и сетевых строк: серверной развилки «показать оффер или обычное "
                "приложение» нет. Есть обычная реклама AdMob, аналитика Flurry, "
                "сбор крашей Sentry и встроенные окна сайта для ссылок Andromo — "
                "без фильтрации трафика на оффер."
            ),
            BODY,
        )
    )
    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
