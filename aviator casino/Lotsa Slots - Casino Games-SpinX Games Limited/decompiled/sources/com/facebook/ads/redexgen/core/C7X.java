package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7X, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7X extends com.facebook.ads.redexgen.core.AbstractC1756ik {
    public static java.lang.String[] A02 = {"eAQfPHHoyWilLfBxOFaJj1G06pGOxPq", "94FVrmFRVghPmyms9ar5cFWRdDurlkVe", "0NqQX4CUu3LD8PHaDMvmRAbh4clEtoM7", "DpSRaNejvtQ52XA7I6oeLqqk6ldlwRKU", "AVeirdKHq7BiC91JmOFjEM59wAwHTkmS", "1THCMBeh6DIPctxeAaB65wntvUu4aFha", "yEsJBiLTEnojRHdtAiiv5fZXbmAhiMSc", "YuG6RWvr5fcVmyx3SnaQUPOafyGz2fG"};
    public com.facebook.ads.redexgen.core.C1747iZ A00;
    public final com.facebook.ads.redexgen.core.C1731iI A01;

    public C7X(com.facebook.ads.redexgen.core.C1731iI c1731iI, java.lang.String str) {
        super(c1731iI.A0B, str, A00(c1731iI));
        this.A01 = c1731iI;
    }

    public static com.facebook.ads.redexgen.core.C1730iH A00(com.facebook.ads.redexgen.core.C1731iI c1731iI) {
        return new com.facebook.ads.redexgen.core.C1730iH(c1731iI);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1756ik
    public final void A08() {
        if (super.A01.A01) {
            this.A05.A5v();
        }
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AJM(com.facebook.ads.redexgen.core.OD.A03);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1756ik
    public final void A09() {
        this.A00 = new com.facebook.ads.redexgen.core.C1747iZ(this.A01, this, A04());
        this.A00.A0J(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1756ik
    public final void A0D(boolean z) {
        this.A05.AJn(z);
    }

    public final com.facebook.ads.redexgen.core.C1731iI A0E() {
        return this.A01;
    }

    public final void A0F(com.facebook.ads.Ad ad, java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType, boolean z) {
        if (super.A00.A6U()) {
            return;
        }
        this.A01.A02(ad);
        if (this.A00 != null) {
            this.A00.A0J(str, adExperienceType, z);
            return;
        }
        this.A01.A05 = str;
        this.A01.A02 = adExperienceType;
        this.A01.A08 = z;
        if (com.facebook.ads.redexgen.core.AbstractC1089Us.A09(this.A02) && com.facebook.ads.redexgen.core.AbstractC1089Us.A0B(this.A02)) {
            if (com.facebook.ads.redexgen.core.AbstractC1089Us.A0M(str)) {
                A05();
                return;
            } else {
                A09();
                return;
            }
        }
        A09();
    }

    public final void A0G(com.facebook.ads.RewardData rewardData) {
        this.A01.A03 = rewardData;
        if (super.A01.A01) {
            super.A01.A0F(2003, com.facebook.ads.redexgen.core.OY.A00(new android.os.Bundle(), rewardData));
        } else if (this.A00 != null) {
            this.A00.A0I(rewardData);
        }
    }

    public final boolean A0H() {
        if (this.A00 != null) {
            return this.A00.A0K();
        }
        return this.A01.A01 > 0 && com.facebook.ads.redexgen.core.Y1.A00() > this.A01.A01;
    }

    public final boolean A0I() {
        if (this.A00 != null) {
            return this.A00.A0L();
        }
        return super.A00.A6p() == com.facebook.ads.redexgen.core.OD.A05;
    }

    public final boolean A0J(com.facebook.ads.Ad ad, com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int A00 = ((com.facebook.ads.redexgen.core.SJ) rewardedVideoShowAdConfig).A00();
        long A01 = ((com.facebook.ads.redexgen.core.SJ) rewardedVideoShowAdConfig).A01();
        if (super.A00.A6V()) {
            return false;
        }
        this.A01.A02(ad);
        java.lang.String[] strArr = A02;
        java.lang.String str = strArr[7];
        java.lang.String str2 = strArr[0];
        int length = str.length();
        int appOrientation = str2.length();
        if (length == appOrientation) {
            java.lang.String[] strArr2 = A02;
            strArr2[5] = "m9KaRECdYgffkM0tCirP5ynC5R03VfN7";
            strArr2[6] = "WVyWW47u948M29zNqYDy5rdzHxlGG88k";
            if (super.A01.A01) {
                A0A(A00);
                return true;
            }
            com.facebook.ads.redexgen.core.C1747iZ c1747iZ = this.A00;
            java.lang.String[] strArr3 = A02;
            java.lang.String str3 = strArr3[2];
            java.lang.String str4 = strArr3[1];
            int charAt = str3.charAt(27);
            int appOrientation2 = str4.charAt(27);
            if (charAt != appOrientation2) {
                java.lang.String[] strArr4 = A02;
                strArr4[7] = "SVQKcBS7FHKRAHC3EplGepZBNeGcwFJ";
                strArr4[0] = "IfCkczTPSOxE6DmqSLPQVuiWAstWVdL";
                if (c1747iZ != null) {
                    return this.A00.A0M(A00, A01);
                }
                this.A00 = new com.facebook.ads.redexgen.core.C1747iZ(this.A01, this, A04());
                this.A00.A0M(A00, A01);
                return false;
            }
        }
        throw new java.lang.RuntimeException();
    }
}
