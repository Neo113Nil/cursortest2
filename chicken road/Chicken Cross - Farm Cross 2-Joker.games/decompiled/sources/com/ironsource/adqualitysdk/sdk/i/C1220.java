package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.internal.Constants;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺓ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1220 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1015 f3423;

    public C1220(C1015 c1015) {
        this.f3423 = c1015;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r6.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("QqlZzScEOg==\n", "F+cSg2hTdL4=\n")) != false) goto L24;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1015 c1015 = this.f3423;
        char c = 0;
        String str = (String) arrayList.get(0);
        c1015.getClass();
        int hashCode = str.hashCode();
        if (hashCode == -1372958932) {
            if (str.equals(StringFog.decrypt("+95FkAzAxDvm2VCZ\n", "spAR1V6TkHI=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 433141802) {
            if (hashCode != 543046670) {
                if (hashCode == 1951953708 && str.equals(StringFog.decrypt("DH9MmcH6\n", "Tj4C14SoSWI=\n"))) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals(StringFog.decrypt("VFzqJorrK54=\n", "Bhm9Z9ivbto=\n"))) {
                    c = 3;
                }
                c = 65535;
            }
        }
        if (c == 0) {
            return Constants.AdType.UNKNOWN;
        }
        if (c == 1) {
            return Constants.AdType.BANNER;
        }
        if (c == 2) {
            return Constants.AdType.INTERSTITIAL;
        }
        if (c != 3) {
            return null;
        }
        return Constants.AdType.REWARDED;
    }
}
