package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f5434b;

    public Zh(io.appmetrica.analytics.impl.C0387gi c0387gi, java.util.List list) {
        this.f5434b = c0387gi;
        this.f5433a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f5434b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportAnr(io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromList(this.f5433a));
    }
}
