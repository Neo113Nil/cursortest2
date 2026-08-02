package com.google.android.gms.internal.ads;

import T2.C0435m;
import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0602Gg implements InterfaceC0808bi {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9201k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f9202l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U2.a f9203m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Lq f9204n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Wq f9205o;

    public /* synthetic */ C0602Gg(Context context, U2.a aVar, Lq lq, Wq wq, int i) {
        this.f9201k = i;
        this.f9202l = context;
        this.f9203m = aVar;
        this.f9204n = lq;
        this.f9205o = wq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final void j0() {
        switch (this.f9201k) {
            case 0:
                C0435m c0435m = P2.o.f4767B.f4780n;
                JSONObject jSONObject = this.f9204n.f10467C;
                c0435m.i(this.f9202l, this.f9203m.f5852k, jSONObject.toString(), this.f9205o.f);
                break;
            default:
                C0435m c0435m2 = P2.o.f4767B.f4780n;
                JSONObject jSONObject2 = this.f9204n.f10467C;
                c0435m2.i(this.f9202l, this.f9203m.f5852k, jSONObject2.toString(), this.f9205o.f);
                break;
        }
    }
}
