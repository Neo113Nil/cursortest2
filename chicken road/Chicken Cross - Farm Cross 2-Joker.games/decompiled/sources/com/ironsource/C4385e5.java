package com.ironsource;

import java.util.Date;

/* renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4385e5 {

    /* renamed from: a, reason: collision with root package name */
    private long f8151a = new Date().getTime();

    public static long a(C4385e5 c4385e5) {
        if (c4385e5 == null) {
            return 0L;
        }
        return new Date().getTime() - c4385e5.f8151a;
    }
}
