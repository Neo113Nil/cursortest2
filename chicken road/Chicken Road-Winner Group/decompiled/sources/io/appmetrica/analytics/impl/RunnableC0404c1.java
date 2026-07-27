package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0404c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7080c;

    public RunnableC0404c1(C0817s1 c0817s1, String str, String str2) {
        this.f7080c = c0817s1;
        this.f7078a = str;
        this.f7079b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f7080c).b(this.f7078a, this.f7079b);
    }
}
