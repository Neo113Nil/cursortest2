package com.payair.hce;

/* loaded from: classes4.dex */
public final class setGroupIndicator {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;
    private com.payair.hce.setRecyclerListener AlternateContactlessPaymentDataJson;
    private int writeReplace = 0;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = (i * 69) + (i2 * (-67)) + (((~(i | i2)) | (~(i4 | i5 | i6)) | (~(i3 | i2))) * (-68)) + ((~(i4 | i6 | i2)) * (-68)) + (((~(i5 | i6)) | i4) * 68);
        if (i7 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i7 == 2) {
            return valueOf(objArr);
        }
        if (i7 == 3) {
            return values(objArr);
        }
        com.payair.hce.setGroupIndicator setgroupindicator = (com.payair.hce.setGroupIndicator) objArr[0];
        int i8 = values;
        int i9 = i8 & 63;
        int i10 = (i8 ^ 63) | i9;
        DigitizedCardProfile = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
        int i11 = setgroupindicator.writeReplace;
        setgroupindicator.writeReplace = java.lang.Math.max((~i11) + (i11 << 1), 0);
        int i12 = values;
        int i13 = i12 ^ 121;
        int i14 = (i12 & 121) << 1;
        DigitizedCardProfile = ((i13 & i14) + (i14 | i13)) % 128;
        return null;
    }

    public setGroupIndicator(com.payair.hce.setRecyclerListener setrecyclerlistener) {
        this.AlternateContactlessPaymentDataJson = setrecyclerlistener;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setGroupIndicator setgroupindicator = (com.payair.hce.setGroupIndicator) objArr[0];
        int i = (values + 81) % 128;
        DigitizedCardProfile = i;
        com.payair.hce.setRecyclerListener setrecyclerlistener = setgroupindicator.AlternateContactlessPaymentDataJson;
        int i2 = i ^ 45;
        int i3 = (i & 45) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return setrecyclerlistener;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setGroupIndicator setgroupindicator = (com.payair.hce.setGroupIndicator) objArr[0];
        int i = values;
        int i2 = i & 65;
        int i3 = i2 + ((i ^ 65) | i2);
        int i4 = i3 % 128;
        DigitizedCardProfile = i4;
        int i5 = setgroupindicator.writeReplace;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (i5 != 0) {
            int i6 = ((i4 | 13) << 1) - (i4 ^ 13);
            values = i6 % 128;
            if (i6 % 2 != 0) {
                return java.lang.Boolean.FALSE;
            }
            throw new java.lang.ArithmeticException();
        }
        int i7 = i & 43;
        int i8 = i | 43;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        DigitizedCardProfile = i9 % 128;
        if (i9 % 2 == 0) {
            return java.lang.Boolean.TRUE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setGroupIndicator setgroupindicator = (com.payair.hce.setGroupIndicator) objArr[0];
        values = (DigitizedCardProfile + 121) % 128;
        int i = setgroupindicator.writeReplace;
        int identityHashCode = java.lang.System.identityHashCode(setgroupindicator);
        int i2 = -(-(i * (-1527)));
        int i3 = i2 & 765;
        int i4 = (i3 - (~((i2 ^ 765) | i3))) - 1;
        int i5 = ~identityHashCode;
        int i6 = i5 | 1;
        int i7 = ~i6;
        int i8 = (i6 | i7) & i7;
        int i9 = ((i8 ^ i) | (i8 & i)) * 764;
        int i10 = (i4 & i9) + (i4 | i9);
        int i11 = i & (-2);
        int i12 = i | (-2);
        int i13 = (~i11) & i12;
        int i14 = ~i;
        int i15 = (i11 ^ i13) | (i11 & i13);
        int i16 = ~i15;
        int i17 = (i15 | i16) & i16;
        int i18 = ~(i | i5);
        int i19 = i17 & i18;
        int i20 = (((i18 | i17) & (~i19)) | i19) * (-1528);
        int i21 = i10 & i20;
        int i22 = ((((i10 ^ i20) | i21) << 1) - (~(-((i20 | i10) & (~i21))))) - 1;
        int i23 = ~i12;
        int i24 = i14 ^ 1;
        int i25 = i14 & 1;
        int i26 = ~((i24 ^ i25) | (i24 & i25));
        int i27 = (i23 ^ i26) | (i23 & i26);
        int i28 = (identityHashCode | i5) & i5;
        int i29 = (i28 & (-2)) | ((~i28) & 1);
        int i30 = i28 & 1;
        int i31 = ~((i30 ^ i29) | (i30 & i29));
        int i32 = i27 & i31;
        int i33 = (i27 | i31) & (~i32);
        int i34 = ((i33 ^ i32) | (i33 & i32)) * 764;
        setgroupindicator.writeReplace = (((i22 ^ i34) | (i22 & i34)) << 1) - (((~i34) & i22) | ((~i22) & i34));
        int identityHashCode2 = java.lang.System.identityHashCode(setgroupindicator);
        int i35 = ~(((-276859605) ^ identityHashCode2) | (identityHashCode2 & (-276859605)));
        int i36 = identityHashCode2 & 987299549;
        int i37 = (987299549 | identityHashCode2) & (~i36);
        int i38 = ~((i37 ^ i36) | (i37 & i36));
        int i39 = -(-(((i35 ^ i38) | (i35 & i38)) * 69));
        int i40 = i39 & 1622518734;
        int i41 = (i39 | 1622518734) & (~i40);
        int i42 = i40 << 1;
        int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
        int i44 = identityHashCode2 ^ (-852537046);
        int i45 = (-852537046) & identityHashCode2;
        int i46 = ~((i45 ^ i44) | (i45 & i44));
        int i47 = (i46 & (-575677442)) | (575677441 & (~i46)) | (i46 & 575677441);
        int i48 = identityHashCode2 ^ 411622108;
        int i49 = identityHashCode2 & 411622108;
        int i50 = (i49 ^ i48) | (i49 & i48);
        int i51 = ~i50;
        int i52 = (i50 | i51) & i51;
        int i53 = ((~i52) & i47) | ((~i47) & i52);
        int i54 = i52 & i47;
        int i55 = ((i54 ^ i53) | (i54 & i53)) * (-69);
        int i56 = i43 & i55;
        int i57 = i56 + ((i55 ^ i43) | i56);
        int identityHashCode3 = java.lang.System.identityHashCode(setgroupindicator);
        int i58 = ~identityHashCode3;
        int i59 = (i58 & 1814697869) | (identityHashCode3 & (-1814697870));
        int i60 = identityHashCode3 & 1814697869;
        int i61 = ~((i59 ^ i60) | (i59 & i60));
        int i62 = i61 ^ 306487296;
        int i63 = i61 & 306487296;
        int i64 = ((i63 ^ i62) | (i63 & i62)) * 992;
        int i65 = (i64 ^ 2056146159) + ((i64 & 2056146159) << 1);
        int i66 = (1814697869 | identityHashCode3) & (~i60);
        int i67 = ~((i66 ^ i60) | (i66 & i60));
        int i68 = i58 ^ (-1814697870);
        int i69 = i58 & (-1814697870);
        int i70 = (i69 ^ i68) | (i69 & i68);
        int i71 = i70 & 977580685;
        int i72 = (i70 | 977580685) & (~i71);
        int i73 = -(-(((~((i72 ^ i71) | (i72 & i71))) | (i67 ^ 306487296) | (i67 & 306487296)) * (-496)));
        int i74 = i65 & i73;
        int i75 = i74 + ((i73 ^ i65) | i74);
        int i76 = -(~(((identityHashCode3 ^ 977580685) | (identityHashCode3 & 977580685)) * 496));
        if (((i57 | 708678184) << 1) - (708678184 ^ i57) > (-2) - (~((i75 & i76) + (i76 | i75)))) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void AlternateContactlessPaymentDataJson() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1431129342, -1431129340, java.lang.System.identityHashCode(this));
    }

    public final void valueOf() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1520778698, 1520778698, java.lang.System.identityHashCode(this));
    }

    public final boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1811763571, -1811763570, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final com.payair.hce.setRecyclerListener values() {
        return (com.payair.hce.setRecyclerListener) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -366730235, 366730238, java.lang.System.identityHashCode(this));
    }
}
