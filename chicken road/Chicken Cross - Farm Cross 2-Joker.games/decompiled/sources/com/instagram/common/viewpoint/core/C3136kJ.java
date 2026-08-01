package com.instagram.common.viewpoint.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3136kJ implements InterfaceC2185Mw {
    public final /* synthetic */ C2930gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C3136kJ(JSONObject jSONObject, C2930gi c2930gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c2930gi;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2185Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2185Mw
    public final Collection<String> A7p() {
        return AbstractC2186Mx.A03(this.A00, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2185Mw
    public final EnumC2184Mv A8K() {
        return AbstractC2186Mx.A00(this.A02);
    }
}
