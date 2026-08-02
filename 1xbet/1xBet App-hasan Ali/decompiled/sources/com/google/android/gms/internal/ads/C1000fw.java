package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000fw {

    /* renamed from: d, reason: collision with root package name */
    public static final C1000fw f13528d = new C1000fw();

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f13529a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f13530b;

    /* renamed from: c, reason: collision with root package name */
    public C1000fw f13531c;

    public C1000fw() {
        this.f13529a = null;
        this.f13530b = null;
    }

    public C1000fw(Runnable runnable, Executor executor) {
        this.f13529a = runnable;
        this.f13530b = executor;
    }
}
