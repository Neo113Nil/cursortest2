package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3113jv extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C3112ju A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C3113jv(C3112ju c3112ju, Map map, Map map2) {
        this.A00 = c3112ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C3100ji c3100ji;
        C2930gi c2930gi;
        C3100ji c3100ji2;
        c3100ji = this.A00.A01;
        if (!TextUtils.isEmpty(c3100ji.A7O())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c2930gi = this.A00.A0A;
            VA A0A = c2930gi.A0A();
            c3100ji2 = this.A00.A01;
            A0A.AC3(c3100ji2.A7O(), hashMap);
        }
    }
}
