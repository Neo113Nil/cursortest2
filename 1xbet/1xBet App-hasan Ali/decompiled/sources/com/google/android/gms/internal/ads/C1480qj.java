package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1480qj implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15159k;

    /* renamed from: l, reason: collision with root package name */
    public final WeakReference f15160l;

    public /* synthetic */ C1480qj(C1524rj c1524rj, int i) {
        this.f15159k = i;
        switch (i) {
            case 1:
                this.f15160l = new WeakReference(c1524rj);
                break;
            default:
                this.f15160l = new WeakReference(c1524rj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        switch (this.f15159k) {
            case 0:
                C1524rj c1524rj = (C1524rj) this.f15160l.get();
                if (c1524rj != null && "_ac".equals((String) map.get("eventName"))) {
                    c1524rj.f15349h.z();
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.pa)).booleanValue()) {
                        Ui ui = c1524rj.i;
                        ui.E();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            ui.u();
                            break;
                        }
                    }
                }
                break;
            default:
                C1524rj c1524rj2 = (C1524rj) this.f15160l.get();
                if (c1524rj2 != null) {
                    c1524rj2.f15349h.z();
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.pa)).booleanValue()) {
                        Ui ui2 = c1524rj2.i;
                        ui2.E();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            ui2.u();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
