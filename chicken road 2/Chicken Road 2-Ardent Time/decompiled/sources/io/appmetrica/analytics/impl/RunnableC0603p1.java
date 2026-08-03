package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0603p1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f6622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f6623c;

    public RunnableC0603p1(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str, java.util.List list) {
        this.f6623c = c0706t1;
        this.f6621a = str;
        this.f6622b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f6623c).reportEvent(this.f6621a, io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromList(this.f6622b));
    }
}
