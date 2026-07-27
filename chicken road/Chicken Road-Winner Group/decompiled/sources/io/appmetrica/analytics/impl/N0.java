package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6309b;

    public N0(C0817s1 c0817s1, String str) {
        this.f6309b = c0817s1;
        this.f6308a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f6309b).c(this.f6308a);
    }
}
