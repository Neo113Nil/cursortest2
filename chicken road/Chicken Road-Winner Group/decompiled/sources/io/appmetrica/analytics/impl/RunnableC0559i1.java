package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0559i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f7469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7470b;

    public RunnableC0559i1(C0817s1 c0817s1, AnrListener anrListener) {
        this.f7470b = c0817s1;
        this.f7469a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f7470b).a(this.f7469a);
    }
}
