package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0662m1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7833b;

    public RunnableC0662m1(C0817s1 c0817s1, String str) {
        this.f7833b = c0817s1;
        this.f7832a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f7833b).reportEvent(this.f7832a);
    }
}
