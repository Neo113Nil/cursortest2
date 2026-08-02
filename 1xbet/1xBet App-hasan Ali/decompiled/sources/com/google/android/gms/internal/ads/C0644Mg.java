package com.google.android.gms.internal.ads;

import android.view.ViewParent;

/* renamed from: com.google.android.gms.internal.ads.Mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644Mg implements Vh {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0677Re f10686k;

    /* renamed from: l, reason: collision with root package name */
    public final C1482ql f10687l;

    /* renamed from: m, reason: collision with root package name */
    public final Lq f10688m;

    public C0644Mg(InterfaceC0677Re interfaceC0677Re, C1482ql c1482ql, Lq lq) {
        this.f10686k = interfaceC0677Re;
        this.f10687l = c1482ql;
        this.f10688m = lq;
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final void t() {
        InterfaceC0677Re interfaceC0677Re;
        String str;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.vc)).booleanValue() || (interfaceC0677Re = this.f10686k) == null) {
            return;
        }
        ViewParent parent = interfaceC0677Re.K().getParent();
        while (true) {
            if (parent == null) {
                str = "0";
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = "1";
                    break;
                }
                parent = parent.getParent();
            }
        }
        C1390oj a5 = this.f10687l.a();
        a5.k("action", "hcp");
        a5.k("hcp", str);
        a5.l(this.f10688m);
        a5.q();
    }
}
