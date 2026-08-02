package com.payair.hce;

/* loaded from: classes4.dex */
public final class setLineBreakWordStyle extends com.payair.hce.setTextSelectHandleLeft {
    private static int DigitizedCardProfile = 1;
    private static int valueOf;
    private com.payair.hce.setTextMetricsParams AlternateContactlessPaymentDataJson;
    private java.lang.Boolean values = java.lang.Boolean.FALSE;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = i5 | i;
        if ((i * 1773) + (i2 * (-885)) + (((~(i3 | i4)) | (~((~i) | i4)) | (~(i6 | i2))) * 886) + ((i | (~(i2 | i5))) * (-1772)) + ((~i6) * 886) == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.setLineBreakWordStyle setlinebreakwordstyle = (com.payair.hce.setLineBreakWordStyle) objArr[0];
        java.lang.Object obj = objArr[1];
        DigitizedCardProfile = (valueOf + 11) % 128;
        DigitizedCardProfile().SdkCoreBusinessLogicModuleImpl().addFirst(obj);
        setlinebreakwordstyle.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(obj);
        DigitizedCardProfile().SdkCoreBusinessLogicModuleImpl().removeFirst();
        int i7 = valueOf;
        DigitizedCardProfile = ((i7 & 7) + (i7 | 7)) % 128;
        return null;
    }

    public setLineBreakWordStyle(com.payair.hce.setTextMetricsParams settextmetricsparams) {
        this.AlternateContactlessPaymentDataJson = settextmetricsparams;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        boolean z = false;
        com.payair.hce.setLineBreakWordStyle setlinebreakwordstyle = (com.payair.hce.setLineBreakWordStyle) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 125;
        int i3 = (((i | 125) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        valueOf = i3 % 128;
        com.payair.hce.setTextMetricsParams settextmetricsparams = setlinebreakwordstyle.AlternateContactlessPaymentDataJson;
        if (i3 % 2 != 0) {
            throw null;
        }
        if ((settextmetricsparams instanceof com.payair.hce.setElegantTextHeight) && ((com.payair.hce.setElegantTextHeight) settextmetricsparams).writeReplace().booleanValue()) {
            int i4 = valueOf;
            DigitizedCardProfile = ((-2) - (~(i4 + 30))) % 128;
            int i5 = ((i4 | 121) << 1) - (i4 ^ 121);
            DigitizedCardProfile = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = DigitizedCardProfile + 63;
            valueOf = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 3;
            }
        }
        int i9 = DigitizedCardProfile;
        int i10 = i9 & 125;
        int i11 = -(-(i9 | 125));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        valueOf = i12 % 128;
        if (i12 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    @Override // com.payair.hce.setTextSelectHandleLeft, com.payair.hce.setElegantTextHeight
    public final java.lang.Boolean writeReplace() {
        return (java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -12279697, 12279698, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        valueOf(new java.lang.Object[]{this, obj}, 703166701, -703166701, java.lang.System.identityHashCode(this));
    }
}
