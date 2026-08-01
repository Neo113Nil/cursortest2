package com.mbridge.msdk.mbsignalcommon.windvane;

import androidx.media3.common.MimeTypes;

/* compiled from: MimeTypeEnum.java */
/* loaded from: classes6.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", MimeTypes.IMAGE_PNG),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* renamed from: a, reason: collision with root package name */
    private String f9629a;
    private String b;

    d(String str, String str2) {
        this.f9629a = str;
        this.b = str2;
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.f9629a;
    }
}
