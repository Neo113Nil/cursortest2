package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f4339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4340c;

    public Gh(io.appmetrica.analytics.impl.C0387gi c0387gi, java.lang.String str, java.util.List list) {
        this.f4340c = c0387gi;
        this.f4338a = str;
        this.f4339b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4340c;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportEvent(this.f4338a, io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromList(this.f4339b));
    }
}
