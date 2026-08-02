package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.bp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815bp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12911a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12912b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12913c;

    public /* synthetic */ C0815bp(int i, Object obj, boolean z3) {
        this.f12911a = i;
        this.f12912b = obj;
        this.f12913c = z3;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        switch (this.f12911a) {
            case 1:
                ((C0572Ch) obj).f8050b.putString("gct", (String) this.f12912b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        switch (this.f12911a) {
            case 0:
                C0572Ch c0572Ch = (C0572Ch) obj;
                String str = (String) this.f12912b;
                if (str != null) {
                    Bundle e3 = AbstractC1803xs.e("pii", c0572Ch.f8049a);
                    e3.putString("afai", str);
                    e3.putBoolean("is_afai_lat", this.f12913c);
                    break;
                }
                break;
            case 1:
                Bundle bundle = ((C0572Ch) obj).f8049a;
                bundle.putString("gct", (String) this.f12912b);
                if (this.f12913c) {
                    bundle.putString("de", "1");
                    break;
                }
                break;
            default:
                Bundle bundle2 = ((C0572Ch) obj).f8049a;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.d5)).booleanValue()) {
                    bundle2.putBoolean("app_switched", this.f12913c);
                }
                Q2.d1 d1Var = (Q2.d1) this.f12912b;
                if (d1Var != null) {
                    int i = d1Var.f5009k;
                    if (i != 1) {
                        if (i == 2) {
                            bundle2.putString("avo", "l");
                            break;
                        }
                    } else {
                        bundle2.putString("avo", "p");
                        break;
                    }
                }
                break;
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
