package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0553c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7967c;

    public RunnableC0553c1(C0966s1 c0966s1, String str, String str2) {
        this.f7967c = c0966s1;
        this.f7965a = str;
        this.f7966b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f7967c).b(this.f7965a, this.f7966b);
    }
}
