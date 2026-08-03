package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0796wd {

    /* renamed from: a, reason: collision with root package name */
    public static io.appmetrica.analytics.impl.C0818x9 f7017a;

    public static final synchronized io.appmetrica.analytics.impl.C0818x9 a(android.content.Context context) {
        io.appmetrica.analytics.impl.C0818x9 c0818x9;
        synchronized (io.appmetrica.analytics.impl.AbstractC0796wd.class) {
            c0818x9 = f7017a;
            if (c0818x9 == null) {
                c0818x9 = new io.appmetrica.analytics.impl.C0818x9(context, "uuid.dat");
                f7017a = c0818x9;
            }
        }
        return c0818x9;
    }
}
