package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0579d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8024b;

    public RunnableC0579d1(C0966s1 c0966s1, String str) {
        this.f8024b = c0966s1;
        this.f8023a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f8024b).b(this.f8023a);
    }
}
