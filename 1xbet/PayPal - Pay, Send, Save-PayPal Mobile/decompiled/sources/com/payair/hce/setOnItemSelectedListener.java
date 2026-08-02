package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnItemSelectedListener<T> {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;
    private java.util.Map<java.lang.Class, com.payair.hce.setSelectedGroup> writeReplace = new java.util.HashMap();
    private java.util.Map<com.payair.hce.setChildIndicator, com.payair.hce.setSelectedGroup> AlternateContactlessPaymentDataJson = new java.util.HashMap();

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        switch ((i * (-183)) + (i2 * 185) + ((i2 | i4) * (-368)) + ((i | i5 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (((~(i | i6)) | (~(i4 | i5)) | (~(i2 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) {
            case 1:
                com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = (com.payair.hce.setOnItemSelectedListener) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                com.payair.hce.setSelectedGroup setselectedgroup = (com.payair.hce.setSelectedGroup) objArr[2];
                int i7 = valueOf;
                DigitizedCardProfile = ((i7 ^ 9) + ((i7 & 9) << 1)) % 128;
                setonitemselectedlistener.AlternateContactlessPaymentDataJson.put(com.payair.hce.setChildIndicator.values(str), setselectedgroup);
                int i8 = valueOf;
                int i9 = i8 & 95;
                DigitizedCardProfile = (((((i8 ^ 95) | i9) << 1) - (~(-((i8 | 95) & (~i9))))) - 1) % 128;
                return setonitemselectedlistener;
            case 2:
                return writeReplace(objArr);
            case 3:
                return DigitizedCardProfile(objArr);
            case 4:
                return values(objArr);
            case 5:
                return valueOf(objArr);
            case 6:
                return AlternateContactlessPaymentDataJson(objArr);
            case 7:
                com.payair.hce.setOnItemSelectedListener setonitemselectedlistener2 = (com.payair.hce.setOnItemSelectedListener) objArr[0];
                java.lang.String str2 = (java.lang.String) objArr[1];
                java.lang.Object writeReplace = ((com.payair.hce.setOnGroupExpandListener) values(new java.lang.Object[]{setonitemselectedlistener2}, 821264401, -821264395, java.lang.System.identityHashCode(setonitemselectedlistener2))).writeReplace(new com.payair.hce.setEmptyView(str2).AlternateContactlessPaymentDataJson(), (java.lang.Class) objArr[2]);
                int i10 = DigitizedCardProfile;
                int i11 = i10 & 33;
                int i12 = (i10 | 33) & (~i11);
                int i13 = -(-(i11 << 1));
                valueOf = ((i12 & i13) + (i12 | i13)) % 128;
                return writeReplace;
            default:
                com.payair.hce.setOnItemSelectedListener setonitemselectedlistener3 = (com.payair.hce.setOnItemSelectedListener) objArr[0];
                setonitemselectedlistener3.AlternateContactlessPaymentDataJson.put(com.payair.hce.setChildIndicator.values((java.lang.String) objArr[1]), new com.payair.hce.setTypeface((com.payair.hce.setOnItemClickListener) objArr[2]));
                int i14 = DigitizedCardProfile;
                int i15 = (i14 & (-108)) | ((~i14) & 107);
                int i16 = -(-((i14 & 107) << 1));
                valueOf = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
                return setonitemselectedlistener3;
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = (com.payair.hce.setOnItemSelectedListener) objArr[0];
        java.io.Reader reader = (java.io.Reader) objArr[1];
        java.lang.Object writeReplace = ((com.payair.hce.setOnGroupExpandListener) values(new java.lang.Object[]{setonitemselectedlistener}, 821264401, -821264395, java.lang.System.identityHashCode(setonitemselectedlistener))).writeReplace(new com.payair.hce.setEmptyView(reader).AlternateContactlessPaymentDataJson(), (java.lang.Class) objArr[2]);
        int i = valueOf;
        int i2 = ((i & 25) - (~(i | 25))) - 1;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return writeReplace;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = (com.payair.hce.setOnItemSelectedListener) objArr[0];
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener2 = (com.payair.hce.setOnItemSelectedListener) values(new java.lang.Object[]{setonitemselectedlistener, (java.lang.String) objArr[1], new com.payair.hce.setCompoundDrawableTintBlendMode((java.lang.Class) objArr[2])}, 1975740564, -1975740564, java.lang.System.identityHashCode(setonitemselectedlistener));
        int i = valueOf;
        int i2 = i ^ 65;
        int i3 = ((i & 65) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            return setonitemselectedlistener2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i;
        int i2;
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = (com.payair.hce.setOnItemSelectedListener) objArr[0];
        java.lang.Class cls = (java.lang.Class) objArr[1];
        com.payair.hce.setSelectedGroup setselectedgroup = (com.payair.hce.setSelectedGroup) objArr[2];
        DigitizedCardProfile = (valueOf + 97) % 128;
        setonitemselectedlistener.writeReplace.put(cls, setselectedgroup);
        if (cls == java.lang.Boolean.class) {
            DigitizedCardProfile = (valueOf + 9) % 128;
            setonitemselectedlistener.writeReplace.put(java.lang.Boolean.TYPE, setselectedgroup);
            int i3 = DigitizedCardProfile;
            int i4 = ((((i3 ^ 31) | (i3 & 31)) << 1) - (~(-((i3 & (-32)) | ((~i3) & 31))))) - 1;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
        } else {
            if (cls == java.lang.Integer.class) {
                int i6 = DigitizedCardProfile;
                int i7 = (i6 & (-94)) | ((~i6) & 93);
                int i8 = -(-((i6 & 93) << 1));
                valueOf = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                setonitemselectedlistener.writeReplace.put(java.lang.Integer.TYPE, setselectedgroup);
                int i9 = DigitizedCardProfile;
                i = i9 & 3;
                i2 = (i9 ^ 3) | i;
            } else if (cls == java.lang.Short.class) {
                int i10 = DigitizedCardProfile;
                int i11 = (i10 | 61) << 1;
                int i12 = -((i10 & (-62)) | ((~i10) & 61));
                valueOf = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                setonitemselectedlistener.writeReplace.put(java.lang.Short.TYPE, setselectedgroup);
                int i13 = DigitizedCardProfile;
                i = i13 & 83;
                i2 = i13 | 83;
            } else if (cls == java.lang.Long.class) {
                DigitizedCardProfile = (valueOf + 29) % 128;
                setonitemselectedlistener.writeReplace.put(java.lang.Long.TYPE, setselectedgroup);
                int i14 = valueOf;
                int i15 = (i14 & (-98)) | ((~i14) & 97);
                int i16 = (i14 & 97) << 1;
                DigitizedCardProfile = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
            } else if (cls == java.lang.Byte.class) {
                int i17 = DigitizedCardProfile;
                int i18 = ((i17 | 125) << 1) - (i17 ^ 125);
                valueOf = i18 % 128;
                if (i18 % 2 == 0) {
                    setonitemselectedlistener.writeReplace.put(java.lang.Byte.TYPE, setselectedgroup);
                    throw null;
                }
                setonitemselectedlistener.writeReplace.put(java.lang.Byte.TYPE, setselectedgroup);
                int i19 = valueOf + 24;
                DigitizedCardProfile = ((~i19) + (i19 << 1)) % 128;
            } else if (cls == java.lang.Float.class) {
                int i20 = DigitizedCardProfile + 95;
                valueOf = i20 % 128;
                if (i20 % 2 == 0) {
                    setonitemselectedlistener.writeReplace.put(java.lang.Float.TYPE, setselectedgroup);
                    throw new java.lang.ArithmeticException();
                }
                setonitemselectedlistener.writeReplace.put(java.lang.Float.TYPE, setselectedgroup);
            } else if (cls == java.lang.Double.class) {
                int i21 = valueOf;
                int i22 = (-2) - (~((i21 ^ 62) + ((i21 & 62) << 1)));
                DigitizedCardProfile = i22 % 128;
                if (i22 % 2 != 0) {
                    setonitemselectedlistener.writeReplace.put(java.lang.Double.TYPE, setselectedgroup);
                    throw null;
                }
                setonitemselectedlistener.writeReplace.put(java.lang.Double.TYPE, setselectedgroup);
            } else if (cls == java.lang.Character.class) {
                int i23 = DigitizedCardProfile;
                int i24 = i23 & 11;
                int i25 = (i23 | 11) & (~i24);
                int i26 = i24 << 1;
                valueOf = ((i25 & i26) + (i25 | i26)) % 128;
                setonitemselectedlistener.writeReplace.put(java.lang.Character.TYPE, setselectedgroup);
                DigitizedCardProfile = (valueOf + 47) % 128;
            }
            valueOf = (i + i2) % 128;
        }
        int i27 = valueOf;
        int i28 = ((i27 ^ 56) + ((i27 & 56) << 1)) - 1;
        DigitizedCardProfile = i28 % 128;
        if (i28 % 2 == 0) {
            return setonitemselectedlistener;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = (com.payair.hce.setOnItemSelectedListener) objArr[0];
        com.payair.hce.setSelectedGroup setselectedgroup = (com.payair.hce.setSelectedGroup) objArr[1];
        java.lang.String[] strArr = (java.lang.String[]) objArr[2];
        int i = valueOf;
        int i2 = i & 19;
        int i3 = ((i ^ 19) | i2) << 1;
        int i4 = -((i | 19) & (~i2));
        DigitizedCardProfile = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        int length = strArr.length;
        int i5 = 0;
        while (i5 <= 0) {
            int i6 = valueOf;
            int i7 = (((i6 | 112) << 1) - (i6 ^ 112)) - 1;
            DigitizedCardProfile = i7 % 128;
            if (i7 % 2 != 0) {
                i5 += com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            } else {
                i5++;
            }
            int i8 = DigitizedCardProfile;
            valueOf = (((((i8 ^ 119) | (i8 & 119)) << 1) - (~(-((i8 & (-120)) | ((~i8) & 119))))) - 1) % 128;
        }
        int i9 = DigitizedCardProfile;
        int i10 = (i9 & 25) + (i9 | 25);
        valueOf = i10 % 128;
        if (i10 % 2 != 0) {
            return setonitemselectedlistener;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = (com.payair.hce.setOnItemSelectedListener) objArr[0];
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = new com.payair.hce.setOnGroupExpandListener();
        java.util.Iterator<java.lang.Class> it = setonitemselectedlistener.writeReplace.keySet().iterator();
        int i = valueOf;
        int i2 = ((i | 89) << 1) - (i ^ 89);
        while (true) {
            DigitizedCardProfile = i2 % 128;
            if (!it.hasNext()) {
                break;
            }
            int i3 = DigitizedCardProfile;
            valueOf = (((i3 | 13) << 1) - (i3 ^ 13)) % 128;
            java.lang.Class next = it.next();
            int i4 = valueOf;
            int i5 = i4 & 19;
            i2 = i5 + ((i4 ^ 19) | i5);
        }
        int i6 = DigitizedCardProfile;
        valueOf = ((-2) - (~((i6 & 100) + (i6 | 100)))) % 128;
        for (com.payair.hce.setChildIndicator setchildindicator : setonitemselectedlistener.AlternateContactlessPaymentDataJson.keySet()) {
            int i7 = valueOf;
            DigitizedCardProfile = ((i7 & 113) + (i7 | 113)) % 128;
            setongroupexpandlistener.values(setchildindicator, setonitemselectedlistener.AlternateContactlessPaymentDataJson.get(setchildindicator));
            int i8 = DigitizedCardProfile;
            int i9 = (i8 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i8) & 109);
            int i10 = (i8 & 109) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            valueOf = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = DigitizedCardProfile;
        int i14 = i13 | 61;
        int i15 = ((i14 << 1) - (~(-((~(i13 & 61)) & i14)))) - 1;
        valueOf = i15 % 128;
        if (i15 % 2 != 0) {
            return setongroupexpandlistener;
        }
        throw new java.lang.ArithmeticException();
    }

    private com.payair.hce.setOnGroupExpandListener AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.setOnGroupExpandListener) values(new java.lang.Object[]{this}, 821264401, -821264395, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setOnItemSelectedListener<T> values(com.payair.hce.setSelectedGroup setselectedgroup, java.lang.String... strArr) {
        return (com.payair.hce.setOnItemSelectedListener) values(new java.lang.Object[]{this, setselectedgroup, strArr}, 1908633719, -1908633716, java.lang.System.identityHashCode(this));
    }

    private com.payair.hce.setOnItemSelectedListener<T> DigitizedCardProfile(java.lang.String str, com.payair.hce.setSelectedGroup setselectedgroup) {
        return (com.payair.hce.setOnItemSelectedListener) values(new java.lang.Object[]{this, str, setselectedgroup}, 499246652, -499246651, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setOnItemSelectedListener<T> valueOf(java.lang.Class cls, com.payair.hce.setSelectedGroup setselectedgroup) {
        return (com.payair.hce.setOnItemSelectedListener) values(new java.lang.Object[]{this, cls, setselectedgroup}, -976499511, 976499513, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setOnItemSelectedListener<T> values(java.lang.String str, java.lang.Class cls) {
        return (com.payair.hce.setOnItemSelectedListener) values(new java.lang.Object[]{this, str, cls}, -767319137, 767319142, java.lang.System.identityHashCode(this));
    }

    private com.payair.hce.setOnItemSelectedListener<T> AlternateContactlessPaymentDataJson(java.lang.String str, com.payair.hce.setOnItemClickListener setonitemclicklistener) {
        return (com.payair.hce.setOnItemSelectedListener) values(new java.lang.Object[]{this, str, setonitemclicklistener}, 1975740564, -1975740564, java.lang.System.identityHashCode(this));
    }

    public final T writeReplace(java.io.Reader reader, java.lang.Class cls) {
        return (T) values(new java.lang.Object[]{this, reader, cls}, 509207078, -509207074, java.lang.System.identityHashCode(this));
    }

    public final T DigitizedCardProfile(java.lang.String str, java.lang.Class cls) {
        return (T) values(new java.lang.Object[]{this, str, cls}, -982165709, 982165716, java.lang.System.identityHashCode(this));
    }
}
