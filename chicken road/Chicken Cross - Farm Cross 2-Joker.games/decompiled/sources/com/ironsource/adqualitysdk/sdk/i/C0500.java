package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ѓ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0500 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0337 f1144;

    public C0500(C0337 c0337) {
        this.f1144 = c0337;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r3.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("eZbb4IpXLBdkkc7p\n", "MNiPpdgEeF4=\n")) != false) goto L30;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0337 c0337 = this.f1144;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0337.getClass();
        switch (str.hashCode()) {
            case -2032180703:
                if (str.equals(StringFog.decrypt("2c5mUq7J9Q==\n", "nYsgE/uFod0=\n"))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1841345251:
                if (str.equals(StringFog.decrypt("BC1GnHEq\n", "V3wT3SNvjq4=\n"))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                break;
            case -1201514634:
                if (str.equals(StringFog.decrypt("X/T6fp4mSbs=\n", "CbGoKtdlCPc=\n"))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -77725029:
                if (str.equals(StringFog.decrypt("OAD7D5IfxfAx\n", "dEG1S8FchKA=\n"))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 73622449:
                if (str.equals(StringFog.decrypt("GAtnHYg=\n", "VVkiXtzVkCU=\n"))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals(StringFog.decrypt("cBphoaSd0OI=\n", "Il824PbZlaY=\n"))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals(StringFog.decrypt("7fFQaZjl\n", "r7AeJ923Vjs=\n"))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return UnitDisplayType.INTERSTITIAL;
            case 1:
                return UnitDisplayType.LANDSCAPE;
            case 2:
                return UnitDisplayType.MRECT;
            case 3:
                return UnitDisplayType.BANNER;
            case 4:
                return UnitDisplayType.REWARDED;
            case 5:
                return UnitDisplayType.SQUARE;
            case 6:
                return UnitDisplayType.VERTICAL;
            case 7:
                return UnitDisplayType.DEFAULT;
            default:
                return null;
        }
    }
}
