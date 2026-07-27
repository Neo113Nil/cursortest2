package com.applovin.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f4256a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f4256a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static synchronized String a(long j) {
        String format;
        synchronized (j1.class) {
            format = f4256a.format(new Date(j));
        }
        return format;
    }
}
