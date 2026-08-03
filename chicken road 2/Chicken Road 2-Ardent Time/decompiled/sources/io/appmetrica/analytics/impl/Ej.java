package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ej implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Tj f4271a;

    public Ej(io.appmetrica.analytics.impl.Tj tj) {
        this.f4271a = tj;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        io.appmetrica.analytics.impl.Sj a2 = ((io.appmetrica.analytics.impl.C0330ed) this.f4271a).a();
        if (a2 != null) {
            ra.reportEvent(a2.f4972a, a2.f4973b);
        }
    }
}
