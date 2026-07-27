package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class Dd {

    /* renamed from: a, reason: collision with root package name */
    public static E9 f5845a;

    public static final synchronized E9 a(Context context) {
        E9 e9;
        synchronized (Dd.class) {
            e9 = f5845a;
            if (e9 == null) {
                e9 = new E9(context, "uuid.dat");
                f5845a = e9;
            }
        }
        return e9;
    }
}
