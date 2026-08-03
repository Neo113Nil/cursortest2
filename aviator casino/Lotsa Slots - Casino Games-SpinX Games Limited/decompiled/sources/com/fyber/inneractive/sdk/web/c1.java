package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class c1 {
    public static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("max-age=(\\d+)");
    public static final java.text.SimpleDateFormat h = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", java.util.Locale.ENGLISH);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4328a;
    public final java.util.Map b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final int e;
    public final java.lang.String f;

    public c1(byte[] bArr, java.util.HashMap hashMap, java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        this.f4328a = bArr;
        this.b = hashMap;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
    }

    public final boolean a() {
        boolean z;
        java.lang.String str;
        if (android.text.TextUtils.isEmpty(this.f)) {
            return false;
        }
        loop0: while (true) {
            z = true;
            for (java.lang.String str2 : this.b.keySet()) {
                if (!z) {
                    break loop0;
                }
                if (str2 == null || !str2.equalsIgnoreCase(com.google.common.net.HttpHeaders.CACHE_CONTROL)) {
                    if (str2 == null || !str2.equalsIgnoreCase(com.google.common.net.HttpHeaders.VARY)) {
                        if (str2 != null && str2.equalsIgnoreCase(com.google.common.net.HttpHeaders.PRAGMA)) {
                            java.lang.String str3 = (java.lang.String) this.b.get(str2);
                            if (str3 != null) {
                                z = !str3.equalsIgnoreCase(io.ktor.client.utils.CacheControl.NO_CACHE);
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase(com.google.common.net.HttpHeaders.EXPIRES) && (str = (java.lang.String) this.b.get(str2)) != null) {
                            try {
                                java.util.Date parse = h.parse(str);
                                if (parse != null && parse.getTime() + java.util.concurrent.TimeUnit.MILLISECONDS.convert(1L, java.util.concurrent.TimeUnit.HOURS) > java.lang.System.currentTimeMillis()) {
                                    break;
                                }
                            } catch (java.text.ParseException unused) {
                            }
                        }
                    }
                    z = false;
                } else {
                    java.lang.String str4 = (java.lang.String) this.b.get(str2);
                    if (str4 != null) {
                        java.util.regex.Pattern pattern = g;
                        java.util.Locale locale = java.util.Locale.ENGLISH;
                        java.util.regex.Matcher matcher = pattern.matcher(str4.toLowerCase(locale));
                        int a2 = (matcher.find() && matcher.groupCount() == 1) ? com.fyber.inneractive.sdk.util.v.a(matcher.group(1), 0) : 0;
                        if ((str4.toLowerCase(locale).contains(io.ktor.client.utils.CacheControl.PUBLIC) || str4.toLowerCase(locale).contains(io.ktor.client.utils.CacheControl.PRIVATE) || a2 > java.util.concurrent.TimeUnit.SECONDS.convert(1L, java.util.concurrent.TimeUnit.HOURS)) && !str4.toLowerCase(locale).contains("no-") && !str4.toLowerCase(locale).contains("must-")) {
                            break;
                        }
                        z = false;
                    } else {
                        continue;
                    }
                }
            }
        }
        return z;
    }
}
