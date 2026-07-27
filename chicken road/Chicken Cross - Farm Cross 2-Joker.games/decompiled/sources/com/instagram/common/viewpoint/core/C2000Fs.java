package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2000Fs extends AbstractC2874fo {
    public final /* synthetic */ VA A00;
    public final /* synthetic */ Y2 A01;
    public final /* synthetic */ C2768e5 A02;
    public final /* synthetic */ C1998Fq A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C2000Fs(C1998Fq c1998Fq, String str, C2768e5 c2768e5, VA va, Map map, Y2 y2) {
        this.A03 = c1998Fq;
        this.A04 = str;
        this.A02 = c2768e5;
        this.A00 = va;
        this.A05 = map;
        this.A01 = y2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2874fo
    public final void A03() {
        C2875fp c2875fp;
        SparseBooleanArray sparseBooleanArray;
        C2875fp c2875fp2;
        C2194Ng c2194Ng;
        C2930gi c2930gi;
        SparseBooleanArray sparseBooleanArray2;
        c2875fp = this.A03.A02;
        if (!c2875fp.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                VA va = this.A00;
                String str = this.A04;
                C2587b9 c2587b9 = new C2587b9(this.A05);
                c2875fp2 = this.A03.A03;
                va.ABJ(str, c2587b9.A03(c2875fp2).A02(this.A01).A05());
                c2194Ng = this.A03.A00;
                c2930gi = this.A03.A06;
                C2194Ng.A07(c2194Ng, c2930gi);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
