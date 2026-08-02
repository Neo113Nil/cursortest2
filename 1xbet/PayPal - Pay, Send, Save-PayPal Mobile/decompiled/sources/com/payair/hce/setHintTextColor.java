package com.payair.hce;

/* loaded from: classes4.dex */
public final class setHintTextColor {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;
    private final java.util.Vector AlternateContactlessPaymentDataJson = new java.util.Vector();

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = (~i) | i4;
        int i6 = (i * com.knotapi.knot.utilities.Constants.ID_KROGER) + (i2 * com.knotapi.knot.utilities.Constants.ID_KROGER) + ((i4 | i | i2) * (-369)) + (((~i5) | i2) * (-369)) + (((~(i | (~i2))) | (~(i3 | i)) | (~(i2 | i5))) * 369);
        if (i6 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 != 2) {
            return values(objArr);
        }
        com.payair.hce.setHintTextColor sethinttextcolor = (com.payair.hce.setHintTextColor) objArr[0];
        com.payair.hce.setShadowLayer setshadowlayer = (com.payair.hce.setShadowLayer) objArr[1];
        int i7 = DigitizedCardProfile;
        valueOf = ((i7 & 23) + (i7 | 23)) % 128;
        sethinttextcolor.AlternateContactlessPaymentDataJson.addElement(setshadowlayer);
        valueOf = (DigitizedCardProfile + 91) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setHintTextColor sethinttextcolor = (com.payair.hce.setHintTextColor) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = DigitizedCardProfile + 71;
        valueOf = i % 128;
        int i2 = i % 2;
        com.payair.hce.setShadowLayer setshadowlayer = (com.payair.hce.setShadowLayer) sethinttextcolor.AlternateContactlessPaymentDataJson.elementAt(intValue);
        if (i2 != 0) {
            return setshadowlayer;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setHintTextColor sethinttextcolor = (com.payair.hce.setHintTextColor) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 87;
        int i3 = i | 87;
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        java.util.Vector vector = sethinttextcolor.AlternateContactlessPaymentDataJson;
        if (i4 % 2 == 0) {
            vector.size();
            throw null;
        }
        int size = vector.size();
        int i5 = DigitizedCardProfile;
        int i6 = i5 & 87;
        int i7 = (i6 - (~(-(-((i5 ^ 87) | i6))))) - 1;
        valueOf = i7 % 128;
        if (i7 % 2 != 0) {
            return java.lang.Integer.valueOf(size);
        }
        throw null;
    }

    public final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1832970438, 1832970438, java.lang.System.identityHashCode(this))).intValue();
    }

    public final com.payair.hce.setShadowLayer valueOf(int i) {
        return (com.payair.hce.setShadowLayer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 1016755526, -1016755525, i);
    }

    public final void AlternateContactlessPaymentDataJson(com.payair.hce.setShadowLayer setshadowlayer) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setshadowlayer}, 649338035, -649338033, java.lang.System.identityHashCode(this));
    }
}
