package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0352a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6931c;

    public RunnableC0352a1(C0817s1 c0817s1, String str, String str2) {
        this.f6931c = c0817s1;
        this.f6929a = str;
        this.f6930b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0946x0 c0946x0 = this.f6931c.f8271a;
        String str = this.f6929a;
        String str2 = this.f6930b;
        c0946x0.getClass();
        C0920w0.c().a(str, str2);
    }
}
