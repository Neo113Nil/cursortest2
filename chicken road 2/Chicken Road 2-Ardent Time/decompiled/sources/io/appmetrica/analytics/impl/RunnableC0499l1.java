package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0499l1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f6319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f6320b;

    public RunnableC0499l1(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.util.List list) {
        this.f6320b = c0706t1;
        this.f6319a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f6320b).reportAnr(io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromList(this.f6319a));
    }
}
