package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.hp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083hp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13793a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f13794b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13795c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13796d;

    /* renamed from: e, reason: collision with root package name */
    public final T2.I f13797e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final C1567sh f13798g;

    public C1083hp(Context context, Bundle bundle, String str, String str2, T2.I i, String str3, C1567sh c1567sh) {
        this.f13793a = context;
        this.f13794b = bundle;
        this.f13795c = str;
        this.f13796d = str2;
        this.f13797e = i;
        this.f = str3;
        this.f13798g = c1567sh;
    }

    public final void a(Bundle bundle) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.o5)).booleanValue()) {
            try {
                T2.L l5 = P2.o.f4767B.f4771c;
                bundle.putString("_app_id", T2.L.F(this.f13793a));
            } catch (RemoteException | RuntimeException e3) {
                P2.o.f4767B.f4774g.i("AppStatsSignal_AppId", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8050b;
        bundle.putBundle("quality_signals", this.f13794b);
        a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        bundle.putBundle("quality_signals", this.f13794b);
        bundle.putString("seq_num", this.f13795c);
        if (!this.f13797e.n()) {
            bundle.putString("session_id", this.f13796d);
        }
        bundle.putBoolean("client_purpose_one", !r0.n());
        a(bundle);
        String str = this.f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            C1567sh c1567sh = this.f13798g;
            Long l5 = (Long) c1567sh.f15570d.get(str);
            bundle2.putLong("dload", l5 == null ? -1L : l5.longValue());
            Integer num = (Integer) c1567sh.f15568b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.p9)).booleanValue()) {
            P2.o oVar = P2.o.f4767B;
            if (oVar.f4774g.f8017k.get() > 0) {
                bundle.putInt("nrwv", oVar.f4774g.f8017k.get());
            }
        }
    }
}
