package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0584j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f7562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7563b;

    public RunnableC0584j1(C0817s1 c0817s1, ExternalAttribution externalAttribution) {
        this.f7563b = c0817s1;
        this.f7562a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f7563b).a(this.f7562a);
    }
}
