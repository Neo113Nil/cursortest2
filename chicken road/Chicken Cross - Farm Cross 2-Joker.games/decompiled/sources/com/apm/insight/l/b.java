package com.apm.insight.l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: DateUtils.java */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static DateFormat f4026a;

    public static DateFormat a() {
        if (f4026a == null) {
            f4026a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f4026a;
    }
}
