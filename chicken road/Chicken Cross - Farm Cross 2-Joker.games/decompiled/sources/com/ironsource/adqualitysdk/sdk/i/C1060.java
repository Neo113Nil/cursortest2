package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.placement.PlacementType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ῖ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1060 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1012 f3164;

    public C1060(C1012 c1012) {
        this.f3164 = c1012;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r6.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("crNswxHa/YU=\n", "IPY7gkOeuME=\n")) == false) goto L23;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1012 c1012 = this.f3164;
        char c = 0;
        String str = (String) arrayList.get(0);
        c1012.getClass();
        int hashCode = str.hashCode();
        if (hashCode == -1617199657) {
            if (str.equals(StringFog.decrypt("S0220oELjA==\n", "AgPgk81CyF0=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == -1372958932) {
            if (str.equals(StringFog.decrypt("uc+YI7q6sXukyI0q\n", "8IHMZujp5TI=\n"))) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -65580248) {
            if (hashCode == 543046670) {
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("kxjqI4oKv1GUFvI1mQGy\n", "3Ve+fMNE9gU=\n"))) {
                c = 3;
            }
            c = 65535;
        }
        if (c == 0) {
            return PlacementType.REWARDED;
        }
        if (c == 1) {
            return PlacementType.INTERSTITIAL;
        }
        if (c == 2) {
            return PlacementType.INVALID;
        }
        if (c != 3) {
            return null;
        }
        return PlacementType.NOT_INITIALIZED;
    }
}
