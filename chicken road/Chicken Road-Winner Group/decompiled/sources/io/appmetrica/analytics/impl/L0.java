package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6200b;

    public L0(C0817s1 c0817s1, String str) {
        this.f6200b = c0817s1;
        this.f6199a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6200b.d().f8151b.a(this.f6199a, false);
    }
}
