package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class GB {

    /* renamed from: a, reason: collision with root package name */
    public static volatile GB f9177a;

    /* renamed from: b, reason: collision with root package name */
    public static final GB f9178b;

    static {
        GB gb = new GB();
        Map map = Collections.EMPTY_MAP;
        f9178b = gb;
    }

    public static GB a() {
        C1285mC c1285mC = C1285mC.f14484c;
        return f9178b;
    }

    public static GB b() {
        GB gb = f9177a;
        if (gb != null) {
            return gb;
        }
        synchronized (GB.class) {
            try {
                GB gb2 = f9177a;
                if (gb2 != null) {
                    return gb2;
                }
                C1285mC c1285mC = C1285mC.f14484c;
                GB c5 = JB.c();
                f9177a = c5;
                return c5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
