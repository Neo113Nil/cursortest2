package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerView;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˍ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0450 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f835 = StringFog.decrypt("TL7kuUrmqjp5s8e+V+s=\n", "Ddqx1yOS61k=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f834 = StringFog.decrypt("T/taUPSrFD5Vp1NQ8qAPPEX3Ug2vpBk5AvVTC++sCWRt8GIQ6LE8KVj9QRf1vA==\n", "LJQ3foHFfUo=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f833 = StringFog.decrypt("XQnHxfRHGZN6Hw==\n", "H2ipq5E1T/o=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f832 = StringFog.decrypt("E/a5VN6ex1QJqrBU2JXcVhn6sQmFks9OHvymCYWyz04e/KYswpXZ\n", "cJnUeqvwriA=\n");

    public C0450(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        String version = UnityAds.getVersion();
        if (version != null) {
            return version.split(StringFog.decrypt("sA==\n", "nfSFzFRDT1c=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        return new HashMap();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 252148886) {
            if (str.equals(f835)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 961844241) {
            if (str.equals(f833)) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 1067215379) {
            if (hashCode == 1531208100 && str.equals(f834)) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(f832)) {
                c = 3;
            }
            c = 65535;
        }
        if (c == 0 || c == 1) {
            return AdUnitActivity.class;
        }
        if (c == 2 || c == 3) {
            return BannerView.class;
        }
        return null;
    }
}
