package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0430d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7135b;

    public RunnableC0430d1(C0817s1 c0817s1, String str) {
        this.f7135b = c0817s1;
        this.f7134a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f7135b).b(this.f7134a);
    }
}
