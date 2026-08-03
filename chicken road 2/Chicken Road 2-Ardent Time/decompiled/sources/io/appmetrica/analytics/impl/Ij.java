package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ij implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f4463a;

    public Ij(java.util.Map map) {
        this.f4463a = map;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportAnr(this.f4463a);
    }
}
