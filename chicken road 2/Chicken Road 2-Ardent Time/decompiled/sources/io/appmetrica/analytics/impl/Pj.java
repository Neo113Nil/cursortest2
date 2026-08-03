package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Pj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f4848b;

    public Pj(java.lang.String str, java.util.Map map) {
        this.f4847a = str;
        this.f4848b = map;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportEvent(this.f4847a, this.f4848b);
    }
}
