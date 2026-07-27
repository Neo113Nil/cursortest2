package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڑ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0624 extends C0588 {

    /* renamed from: ﺟ, reason: contains not printable characters */
    public static final String f1643 = StringFog.decrypt("d6pbU0TEellPqUY=\n", "Ic8pIC2rFBA=\n");

    public C0624(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0588, com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        return MobileAds.getVersion().toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0588, com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        return (str.hashCode() == -1938329210 && str.equals(f1643)) ? VersionInfo.class : super.mo5370(str);
    }
}
