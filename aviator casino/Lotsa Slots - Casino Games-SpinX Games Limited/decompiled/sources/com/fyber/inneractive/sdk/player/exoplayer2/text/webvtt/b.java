package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f4068a = java.util.regex.Pattern.compile("^NOTE(( |\t).*)?$");
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static long a(java.lang.String str) {
        java.lang.String[] split = str.split("\\.", 2);
        long j = 0;
        for (java.lang.String str2 : split[0].split(":")) {
            j = (j * 60) + java.lang.Long.parseLong(str2);
        }
        return (java.lang.Long.parseLong(split[1]) + (j * 1000)) * 1000;
    }
}
