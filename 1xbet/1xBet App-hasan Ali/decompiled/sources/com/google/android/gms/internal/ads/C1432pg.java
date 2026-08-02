package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432pg implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15015k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1477qg f15016l;

    public /* synthetic */ C1432pg(C1477qg c1477qg, int i) {
        this.f15015k = i;
        this.f15016l = c1477qg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        switch (this.f15015k) {
            case 0:
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str)) {
                        C1477qg c1477qg = this.f15016l;
                        if (str.equals(c1477qg.f15147a)) {
                            c1477qg.f15149c.execute(new K4(18, this));
                            break;
                        }
                    }
                }
                break;
            default:
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2)) {
                        C1477qg c1477qg2 = this.f15016l;
                        if (str2.equals(c1477qg2.f15147a)) {
                            c1477qg2.f15149c.execute(new K4(19, this));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
