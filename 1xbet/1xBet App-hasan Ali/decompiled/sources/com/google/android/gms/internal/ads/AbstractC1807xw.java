package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.xw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1807xw extends AbstractC1223kw {

    /* renamed from: t, reason: collision with root package name */
    public static final AbstractC0952et f16349t;

    /* renamed from: u, reason: collision with root package name */
    public static final Pw f16350u = new Pw(AbstractC1807xw.class);

    /* renamed from: r, reason: collision with root package name */
    public volatile Set f16351r;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f16352s;

    static {
        Throwable th;
        AbstractC0952et c1762ww;
        try {
            c1762ww = new C1717vw(AtomicReferenceFieldUpdater.newUpdater(AbstractC1807xw.class, Set.class, "r"), AtomicIntegerFieldUpdater.newUpdater(AbstractC1807xw.class, "s"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c1762ww = new C1762ww(14);
        }
        Throwable th3 = th;
        f16349t = c1762ww;
        if (th3 != null) {
            f16350u.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
