package com.payair.hce;

/* loaded from: classes4.dex */
public final class setRemoteViewsAdapter implements java.util.Iterator {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;
    private java.util.Iterator[] AlternateContactlessPaymentDataJson;
    private int valueOf = 0;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = i4 | i;
        int i6 = (i * 624) + (i2 * (-622)) + ((~(i5 | i3)) * 623) + (((~(i2 | (~i))) | (~i3)) * (-623)) + (((~(i | i3)) | (~i5) | (~(i3 | i4))) * 623);
        return i6 != 1 ? i6 != 2 ? values(objArr) : valueOf(objArr) : writeReplace(objArr);
    }

    public setRemoteViewsAdapter(java.util.Set... setArr) {
        int i = 0;
        this.AlternateContactlessPaymentDataJson = new java.util.Iterator[setArr.length];
        while (i < setArr.length) {
            this.AlternateContactlessPaymentDataJson[i] = setArr[i].iterator();
            int i2 = i + androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING;
            int i3 = (i2 ^ 112) + ((i2 & 112) << 1);
            i = (~i3) + (i3 << 1);
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setRemoteViewsAdapter setremoteviewsadapter = (com.payair.hce.setRemoteViewsAdapter) objArr[0];
        int i = values;
        int i2 = i & 39;
        int i3 = (i | 39) & (~i2);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i4 = -(-(i2 << 1));
        DigitizedCardProfile = ((i3 & i4) + (i3 | i4)) % 128;
        if (setremoteviewsadapter.AlternateContactlessPaymentDataJson[setremoteviewsadapter.valueOf].hasNext()) {
            int i5 = DigitizedCardProfile;
            int i6 = (((i5 | 93) << 1) - (i5 ^ 93)) % 128;
            values = i6;
            int i7 = (i6 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i6) & 109);
            int i8 = (i6 & 109) << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            DigitizedCardProfile = i9 % 128;
            if (i9 % 2 == 0) {
                return bool;
            }
            throw null;
        }
        int i10 = setremoteviewsadapter.valueOf;
        int identityHashCode = java.lang.System.identityHashCode(setremoteviewsadapter);
        int i11 = i10 * (-712);
        int i12 = (i11 ^ 714) | (i11 & 714);
        int i13 = ~identityHashCode;
        int i14 = ((~i13) & (-2)) | (i13 & 1);
        int i15 = i13 & (-2);
        int i16 = ~((i14 ^ i15) | (i14 & i15));
        int i17 = i10 & (-2);
        int i18 = ~i10;
        int i19 = i17 | ((i10 | (-2)) & (~i17));
        int i20 = ~i19;
        int i21 = (i19 | i20) & i20;
        int i22 = (i16 ^ i21) | (i16 & i21);
        int i23 = (i10 | i18) & i18;
        int i24 = i23 & 1;
        int i25 = (~i24) & (i23 | 1);
        int i26 = (i24 ^ i25) | (i25 & i24);
        int i27 = ((~i26) & identityHashCode) | (i26 & i13);
        int i28 = i26 & identityHashCode;
        int i29 = ~((i28 ^ i27) | (i28 & i27));
        int i30 = (i22 | i29) & (~(i22 & i29));
        int i31 = (i18 ^ 1) | (i18 & 1);
        int i32 = (i31 & i13) | ((~i31) & identityHashCode);
        int i33 = i31 & identityHashCode;
        int i34 = (identityHashCode | i13) & i13;
        int i35 = i23 & i34;
        int i36 = (((((r5 & i12) + (i12 | r5)) + (((i30 & r10) | (i30 ^ r10)) * (-713))) - (~(-(~((~((i33 ^ i32) | (i33 & i32))) * 1426))))) - 2) + ((~(((i23 | i34) & (~i35)) | i35)) * 713);
        setremoteviewsadapter.valueOf = i36;
        java.util.Iterator[] itArr = setremoteviewsadapter.AlternateContactlessPaymentDataJson;
        if (i36 < itArr.length) {
            int i37 = DigitizedCardProfile;
            int i38 = (i37 ^ 71) + ((i37 & 71) << 1);
            values = i38 % 128;
            if (i38 % 2 == 0) {
                itArr[i36].hasNext();
                throw null;
            }
            if (itArr[i36].hasNext()) {
                int i39 = values;
                int i40 = i39 & 121;
                int i41 = i39 | 121;
                DigitizedCardProfile = (((i40 | i41) << 1) - (i41 ^ i40)) % 128;
                return bool;
            }
        }
        int i42 = DigitizedCardProfile;
        int i43 = i42 & 13;
        int i44 = (i42 ^ 13) | i43;
        int i45 = (i43 & i44) + (i44 | i43);
        values = i45 % 128;
        if (i45 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setRemoteViewsAdapter setremoteviewsadapter = (com.payair.hce.setRemoteViewsAdapter) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = (i & (-106)) | ((~i) & 105);
        int i3 = (i & 105) << 1;
        values = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        java.lang.Object next = setremoteviewsadapter.AlternateContactlessPaymentDataJson[setremoteviewsadapter.valueOf].next();
        int i4 = values;
        int i5 = i4 & 121;
        int i6 = (i4 | 121) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        DigitizedCardProfile = i8 % 128;
        if (i8 % 2 == 0) {
            return next;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setRemoteViewsAdapter setremoteviewsadapter = (com.payair.hce.setRemoteViewsAdapter) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i ^ 45;
        int i3 = (i & 45) << 1;
        values = ((i2 & i3) + (i3 | i2)) % 128;
        setremoteviewsadapter.AlternateContactlessPaymentDataJson[setremoteviewsadapter.valueOf].remove();
        int i4 = values;
        int i5 = i4 & 89;
        int i6 = (i4 | 89) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        DigitizedCardProfile = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        writeReplace(new java.lang.Object[]{this}, -1431138969, 1431138970, java.lang.System.identityHashCode(this));
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return writeReplace(new java.lang.Object[]{this}, -573491830, 573491830, java.lang.System.identityHashCode(this));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, -1437295801, 1437295803, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
