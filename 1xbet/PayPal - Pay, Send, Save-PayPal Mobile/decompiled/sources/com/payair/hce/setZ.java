package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u000e\u0010\u0011R\"\u0010\u0012\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0012\u0010\u0015"}, d2 = {"Lcom/payair/hce/setZ;", "", "<init>", "()V", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "AlternateContactlessPaymentDataJson", "Ljava/lang/String;", "writeReplace", "()Ljava/lang/String;", "values", "(Ljava/lang/String;)V", "valueOf", "DigitizedCardProfile", com.visa.cbp.getEncExpo.warmup, "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setZ {
    private static int valueOf = 1;
    private static int values;
    private java.lang.String AlternateContactlessPaymentDataJson;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    private int valueOf;
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        switch ((i * 567) + (i2 * (-565)) + (((~(i2 | i4)) | (~(i4 | i3))) * (-566)) + ((~(i | i5)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST) + ((~(i4 | i5 | i3)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST)) {
            case 1:
                return DigitizedCardProfile(objArr);
            case 2:
                return writeReplace(objArr);
            case 3:
                return valueOf(objArr);
            case 4:
                return AlternateContactlessPaymentDataJson(objArr);
            case 5:
                com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                int i6 = (valueOf + 43) % 128;
                values = i6;
                setz.writeReplace = str;
                valueOf = (i6 + 109) % 128;
                return null;
            case 6:
                return RecordsJson(objArr);
            case 7:
                return getAid(objArr);
            default:
                return values(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[0];
        int i = valueOf;
        int i2 = ((i | 119) << 1) - (i ^ 119);
        int i3 = i2 % 128;
        values = i3;
        int i4 = setz.valueOf;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i5 = (i3 | 47) << 1;
        int i6 = -(i3 ^ 47);
        valueOf = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        return java.lang.Integer.valueOf(i4);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = values;
        int i2 = i ^ 119;
        int i3 = (i & 119) << 1;
        valueOf = ((i2 & i3) + (i2 | i3)) % 128;
        setz.valueOf = intValue;
        int i4 = i & 121;
        int i5 = i | 121;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        valueOf = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = valueOf;
        int i2 = (((i | 12) << 1) - (i ^ 12)) - 1;
        values = i2 % 128;
        setz.AlternateContactlessPaymentDataJson = str;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[0];
        int i = values;
        int i2 = i & 35;
        int i3 = i2 + ((i ^ 35) | i2);
        int i4 = i3 % 128;
        valueOf = i4;
        java.lang.String str = setz.AlternateContactlessPaymentDataJson;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = ((i4 ^ 101) | (i4 & 101)) << 1;
        int i6 = -((i4 & (-102)) | ((~i4) & 101));
        values = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[0];
        int i = values;
        int i2 = i & 21;
        int i3 = ((((i ^ 21) | i2) << 1) - (~(-((~i2) & (i | 21))))) - 1;
        valueOf = i3 % 128;
        java.lang.String str = setz.writeReplace;
        if (i3 % 2 == 0) {
            throw null;
        }
        valueOf = (((((i ^ 3) | (i & 3)) << 1) - (~(-((i & (-4)) | ((~i) & 3))))) - 1) % 128;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        int i;
        int i2;
        java.lang.String str;
        int i3;
        int i4;
        int i5;
        int i6;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i7 = values;
        int i8 = ((i7 ^ 29) + ((i7 & 29) << 1)) % 128;
        valueOf = i8;
        if (setz == obj) {
            int i9 = i8 & 47;
            values = (((((i8 ^ 47) | i9) << 1) - (~(-((~i9) & (i8 | 47))))) - 1) % 128;
            int i10 = i8 & 109;
            values = ((((i8 ^ 109) | i10) << 1) - ((~i10) & (i8 | 109))) % 128;
            return bool2;
        }
        if (obj != null) {
            int i11 = i7 ^ 109;
            int i12 = ((i7 & 109) | i11) << 1;
            int i13 = -i11;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            valueOf = i14 % 128;
            if (i14 % 2 == 0) {
                kotlin.jvm.internal.Intrinsics.areEqual(setz.getClass(), obj.getClass());
                throw new java.lang.ArithmeticException();
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(setz.getClass(), obj.getClass())) {
                com.payair.hce.setZ setz2 = (com.payair.hce.setZ) obj;
                if (setz.valueOf != setz2.valueOf) {
                    int i15 = valueOf;
                    int i16 = i15 & 101;
                    int i17 = (i15 ^ 101) | i16;
                    int i18 = ((i16 & i17) + (i17 | i16)) % 128;
                    values = i18;
                    int i19 = (((i18 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1) - (i18 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) - 1;
                    valueOf = i19 % 128;
                    if (i19 % 2 != 0) {
                        return bool;
                    }
                    throw null;
                }
                java.lang.String str2 = setz.AlternateContactlessPaymentDataJson;
                if (str2 != null) {
                    int i20 = valueOf + 87;
                    values = i20 % 128;
                    if (i20 % 2 != 0) {
                        kotlin.jvm.internal.Intrinsics.areEqual(str2, setz2.AlternateContactlessPaymentDataJson);
                        throw new java.lang.ArithmeticException();
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, setz2.AlternateContactlessPaymentDataJson)) {
                        int i21 = valueOf;
                        i = i21 ^ 126;
                        i2 = i21 & 126;
                        int i22 = i + (i2 << 1);
                        values = ((~i22) + (i22 << 1)) % 128;
                        int i23 = values;
                        int i24 = i23 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        int i25 = (i23 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i24;
                        int i26 = (i24 & i25) + (i25 | i24);
                        valueOf = i26 % 128;
                        boolean z = i26 % 2 == 0;
                        int i27 = ~java.lang.System.identityHashCode(setz);
                        int i28 = (i27 ^ 1100294564) | (i27 & 1100294564);
                        int i29 = i28 * 495;
                        int i30 = i29 & (-1524170724);
                        int i31 = -(-((i29 ^ (-1524170724)) | i30));
                        i3 = ((i30 | i31) << 1) - (i31 ^ i30);
                        int i32 = ~i28;
                        int i33 = i32 & 1075052576;
                        int i34 = (i32 | 1075052576) & (~i33);
                        i4 = ((i34 ^ i33) | (i34 & i33)) * 495;
                        int identityHashCode = java.lang.System.identityHashCode(setz);
                        int i35 = ((identityHashCode ^ (-427409477)) | (identityHashCode & (-427409477))) * (-859);
                        int i36 = i35 & 789427760;
                        int i37 = ~identityHashCode;
                        int i38 = i37 ^ (-427409477);
                        int i39 = (-427409477) & i37;
                        int i40 = ~((i39 ^ i38) | (i39 & i38));
                        int i41 = ~((identityHashCode & (-1064949494)) | (1064949493 & i37) | (identityHashCode & 1064949493));
                        int i42 = i40 & i41;
                        int i43 = (i41 | i40) & (~i42);
                        i5 = ((i36 - (~((i35 ^ 789427760) | i36))) - 1) + (((i43 ^ i42) | (i43 & i42)) * 859);
                        int i44 = 924898997 ^ i37;
                        int i45 = 924898997 & i37;
                        int i46 = (i44 ^ i45) | (i45 & i44);
                        int i47 = ~i46;
                        int i48 = (i46 | i47) & i47;
                        int i49 = 140050496 & i48;
                        i6 = -(-((((i48 | 140050496) & (~i49)) | i49) * 859));
                        if (((i3 | i4) << 1) - (i4 ^ i3) > ((i5 | i6) << 1) - (i6 ^ i5)) {
                            return java.lang.Boolean.valueOf(z);
                        }
                        throw null;
                    }
                    valueOf = (values + 43) % 128;
                    str = setz.writeReplace;
                    if (str == null) {
                        int i50 = values;
                        int i51 = i50 & 43;
                        int i52 = (i50 | 43) & (~i51);
                        int i53 = -(-(i51 << 1));
                        int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                        valueOf = i54 % 128;
                        java.lang.String str3 = setz2.writeReplace;
                        if (i54 % 2 != 0) {
                            return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(str, str3));
                        }
                        kotlin.jvm.internal.Intrinsics.areEqual(str, str3);
                        throw null;
                    }
                    if (setz2.writeReplace == null) {
                        int i55 = valueOf;
                        int i56 = (i55 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + (i55 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        int i57 = ((~i56) + (i56 << 1)) % 128;
                        values = i57;
                        int i58 = ((i57 & (-116)) | ((~i57) & 115)) + ((i57 & 115) << 1);
                        valueOf = i58 % 128;
                        if (i58 % 2 != 0) {
                            return bool2;
                        }
                        throw null;
                    }
                    int i59 = valueOf;
                    int i60 = (i59 & 49) + (i59 | 49);
                    values = i60 % 128;
                    if (i60 % 2 == 0) {
                        return bool;
                    }
                } else if (setz2.AlternateContactlessPaymentDataJson != null) {
                    int i61 = (values + 59) % 128;
                    valueOf = i61;
                    i = i61 ^ 74;
                    i2 = i61 & 74;
                    int i222 = i + (i2 << 1);
                    values = ((~i222) + (i222 << 1)) % 128;
                    int i232 = values;
                    int i242 = i232 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    int i252 = (i232 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i242;
                    int i262 = (i242 & i252) + (i252 | i242);
                    valueOf = i262 % 128;
                    if (i262 % 2 == 0) {
                    }
                    int i272 = ~java.lang.System.identityHashCode(setz);
                    int i282 = (i272 ^ 1100294564) | (i272 & 1100294564);
                    int i292 = i282 * 495;
                    int i302 = i292 & (-1524170724);
                    int i312 = -(-((i292 ^ (-1524170724)) | i302));
                    i3 = ((i302 | i312) << 1) - (i312 ^ i302);
                    int i322 = ~i282;
                    int i332 = i322 & 1075052576;
                    int i342 = (i322 | 1075052576) & (~i332);
                    i4 = ((i342 ^ i332) | (i342 & i332)) * 495;
                    int identityHashCode2 = java.lang.System.identityHashCode(setz);
                    int i352 = ((identityHashCode2 ^ (-427409477)) | (identityHashCode2 & (-427409477))) * (-859);
                    int i362 = i352 & 789427760;
                    int i372 = ~identityHashCode2;
                    int i382 = i372 ^ (-427409477);
                    int i392 = (-427409477) & i372;
                    int i402 = ~((i392 ^ i382) | (i392 & i382));
                    int i412 = ~((identityHashCode2 & (-1064949494)) | (1064949493 & i372) | (identityHashCode2 & 1064949493));
                    int i422 = i402 & i412;
                    int i432 = (i412 | i402) & (~i422);
                    i5 = ((i362 - (~((i352 ^ 789427760) | i362))) - 1) + (((i432 ^ i422) | (i432 & i422)) * 859);
                    int i442 = 924898997 ^ i372;
                    int i452 = 924898997 & i372;
                    int i462 = (i442 ^ i452) | (i452 & i442);
                    int i472 = ~i462;
                    int i482 = (i462 | i472) & i472;
                    int i492 = 140050496 & i482;
                    i6 = -(-((((i482 | 140050496) & (~i492)) | i492) * 859));
                    if (((i3 | i4) << 1) - (i4 ^ i3) > ((i5 | i6) << 1) - (i6 ^ i5)) {
                    }
                } else {
                    int i62 = values;
                    valueOf = ((i62 & 45) + (i62 | 45)) % 128;
                    str = setz.writeReplace;
                    if (str == null) {
                    }
                }
                throw new java.lang.ArithmeticException();
            }
        }
        int i63 = values + 27;
        valueOf = i63 % 128;
        if (i63 % 2 != 0) {
            return bool;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        int i;
        java.lang.String str;
        int i2;
        int i3 = 0;
        com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[0];
        int i4 = values;
        int i5 = (((i4 & 17) - (~(i4 | 17))) - 1) % 128;
        valueOf = i5;
        int i6 = setz.valueOf;
        int i7 = i6 * 31;
        java.lang.String str2 = setz.AlternateContactlessPaymentDataJson;
        if (str2 != null) {
            int i8 = ((i5 ^ 15) + ((i5 & 15) << 1)) % 128;
            values = i8;
            if (str2 != null) {
                values = ((-2) - (~(i5 + 40))) % 128;
                i = str2.hashCode();
                int i9 = valueOf;
                int i10 = i9 & 93;
                int i11 = -(-(i9 | 93));
                values = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
                int identityHashCode = java.lang.System.identityHashCode(setz);
                int i12 = i * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                int i13 = -(-(i6 * (-6789)));
                int i14 = i12 & i13;
                int i15 = (i13 | i12) & (~i14);
                int i16 = -(-(i14 << 1));
                int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                int i18 = ~i;
                int i19 = i18 & (i18 | i);
                int i20 = ~i7;
                int i21 = ~((i19 ^ i20) | (i19 & i20));
                int i22 = ~identityHashCode;
                int i23 = i22 & (i22 | identityHashCode);
                int i24 = i23 & i;
                int i25 = (i23 | i) & (~i24);
                int i26 = (i24 ^ i25) | (i25 & i24) | i7;
                int i27 = ~i26;
                int i28 = (i26 | i27) & i27;
                int i29 = i21 ^ i28;
                int i30 = i21 & i28;
                int i31 = -(-(((i30 ^ i29) | (i30 & i29)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                int i32 = ((((~i31) & i17) | ((~i17) & i31)) - (~(-(-((i31 & i17) << 1))))) - 1;
                int i33 = i23 & i7;
                int i34 = (i23 | i7) & (~i33);
                int i35 = ~((i33 ^ i34) | (i34 & i33));
                int i36 = i & i35;
                int i37 = -(~(-(-((((i35 | i) & (~i36)) | i36) * (-440)))));
                int i38 = ((i32 ^ i37) + ((i37 & i32) << 1)) - 1;
                int i39 = i & i7;
                int i40 = (i | i7) & (~i39);
                int i41 = (i39 ^ i40) | (i40 & i39);
                int i42 = ((i41 ^ identityHashCode) | (i41 & identityHashCode)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                int i43 = i38 & i42;
                int i44 = (i42 ^ i38) | i43;
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                int i46 = i45 * 31;
                str = setz.writeReplace;
                if (str != null) {
                    int i47 = values;
                    int i48 = i47 ^ 103;
                    int i49 = (i47 & 103) << 1;
                    valueOf = ((i48 ^ i49) + ((i48 & i49) << 1)) % 128;
                    if (str != null) {
                        int i50 = i47 ^ 19;
                        int i51 = ((i47 & 19) | i50) << 1;
                        int i52 = -i50;
                        int i53 = (i51 & i52) + (i52 | i51);
                        valueOf = i53 % 128;
                        if (i53 % 2 == 0) {
                            str.hashCode();
                            throw new java.lang.ArithmeticException();
                        }
                        i3 = str.hashCode();
                        int identityHashCode2 = java.lang.System.identityHashCode(setz);
                        int i54 = i3 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                        int i55 = -(-(i45 * 7843));
                        int i56 = ((((~i55) & i54) | ((~i54) & i55)) - (~((i54 & i55) << 1))) - 1;
                        int i57 = ~i3;
                        int i58 = ~i46;
                        int i59 = (i57 & i58) | (i57 ^ i58);
                        int i60 = ~i59;
                        int i61 = (i59 | i60) & i60;
                        int i62 = ~identityHashCode2;
                        int i63 = (i62 | identityHashCode2) & i62;
                        int i64 = ~((i63 ^ i58) | (i63 & i58));
                        int i65 = ((~i64) & i61) | ((~i61) & i64);
                        int i66 = i61 & i64;
                        int i67 = i3 | i46;
                        int i68 = i67 & identityHashCode2;
                        int i69 = (i67 | identityHashCode2) & (~i68);
                        int i70 = (i69 ^ i68) | (i69 & i68);
                        int i71 = (i66 ^ i65) | (i66 & i65);
                        int i72 = ~i70;
                        int i73 = (i71 | ((i70 | i72) & i72)) * (-252);
                        int i74 = ((i56 | i73) << 1) - (i56 ^ i73);
                        int i75 = (i3 & i58) | (i46 & i57);
                        int i76 = i3 & i46;
                        int i77 = ((i75 ^ i76) | (i75 & i76)) * (-252);
                        int i78 = i74 ^ i77;
                        int i79 = -(-((i77 & i74) << 1));
                        int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                        int i81 = ((~i62) & i58) | ((~i58) & i62);
                        int i82 = i58 & i62;
                        int i83 = (i82 ^ i81) | (i82 & i81);
                        int i84 = ~((i57 & i83) | ((~i83) & i3) | (i83 & i3));
                        int i85 = i3 ^ i46;
                        int i86 = (i85 ^ i76) | (i85 & i76);
                        int i87 = ~((identityHashCode2 & (~i86)) | (i86 & i62) | (identityHashCode2 & i86));
                        int i88 = ((i87 ^ i84) | (i87 & i84)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                        int i89 = valueOf;
                        int i90 = i89 & 37;
                        int i91 = -(-((i89 ^ 37) | i90));
                        i2 = ((i90 | i91) << 1) - (i91 ^ i90);
                        values = i2 % 128;
                        if (i2 % 2 == 0) {
                            return java.lang.Integer.valueOf((i80 ^ i88) + ((i88 & i80) << 1));
                        }
                        throw null;
                    }
                    int i92 = i47 & 47;
                    valueOf = (((((i47 ^ 47) | i92) << 1) - (~(-((~i92) & (i47 | 47))))) - 1) % 128;
                }
                int i93 = values;
                int i94 = (i93 & (-54)) | ((~i93) & 53);
                int i95 = -(-((i93 & 53) << 1));
                valueOf = ((i94 ^ i95) + ((i95 & i94) << 1)) % 128;
                int identityHashCode22 = java.lang.System.identityHashCode(setz);
                int i542 = i3 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                int i552 = -(-(i45 * 7843));
                int i562 = ((((~i552) & i542) | ((~i542) & i552)) - (~((i542 & i552) << 1))) - 1;
                int i572 = ~i3;
                int i582 = ~i46;
                int i592 = (i572 & i582) | (i572 ^ i582);
                int i602 = ~i592;
                int i612 = (i592 | i602) & i602;
                int i622 = ~identityHashCode22;
                int i632 = (i622 | identityHashCode22) & i622;
                int i642 = ~((i632 ^ i582) | (i632 & i582));
                int i652 = ((~i642) & i612) | ((~i612) & i642);
                int i662 = i612 & i642;
                int i672 = i3 | i46;
                int i682 = i672 & identityHashCode22;
                int i692 = (i672 | identityHashCode22) & (~i682);
                int i702 = (i692 ^ i682) | (i692 & i682);
                int i712 = (i662 ^ i652) | (i662 & i652);
                int i722 = ~i702;
                int i732 = (i712 | ((i702 | i722) & i722)) * (-252);
                int i742 = ((i562 | i732) << 1) - (i562 ^ i732);
                int i752 = (i3 & i582) | (i46 & i572);
                int i762 = i3 & i46;
                int i772 = ((i752 ^ i762) | (i752 & i762)) * (-252);
                int i782 = i742 ^ i772;
                int i792 = -(-((i772 & i742) << 1));
                int i802 = ((i782 | i792) << 1) - (i792 ^ i782);
                int i812 = ((~i622) & i582) | ((~i582) & i622);
                int i822 = i582 & i622;
                int i832 = (i822 ^ i812) | (i822 & i812);
                int i842 = ~((i572 & i832) | ((~i832) & i3) | (i832 & i3));
                int i852 = i3 ^ i46;
                int i862 = (i852 ^ i762) | (i852 & i762);
                int i872 = ~((identityHashCode22 & (~i862)) | (i862 & i622) | (identityHashCode22 & i862));
                int i882 = ((i872 ^ i842) | (i872 & i842)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                int i892 = valueOf;
                int i902 = i892 & 37;
                int i912 = -(-((i892 ^ 37) | i902));
                i2 = ((i902 | i912) << 1) - (i912 ^ i902);
                values = i2 % 128;
                if (i2 % 2 == 0) {
                }
            } else {
                int i96 = i8 & 125;
                int i97 = (~i96) & (i8 | 125);
                int i98 = i96 << 1;
                valueOf = ((i97 & i98) + (i98 | i97)) % 128;
            }
        }
        int i99 = valueOf;
        values = ((i99 & 81) + (i99 | 81)) % 128;
        i = 0;
        int identityHashCode3 = java.lang.System.identityHashCode(setz);
        int i122 = i * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
        int i132 = -(-(i6 * (-6789)));
        int i142 = i122 & i132;
        int i152 = (i132 | i122) & (~i142);
        int i162 = -(-(i142 << 1));
        int i172 = ((i152 | i162) << 1) - (i152 ^ i162);
        int i182 = ~i;
        int i192 = i182 & (i182 | i);
        int i202 = ~i7;
        int i212 = ~((i192 ^ i202) | (i192 & i202));
        int i222 = ~identityHashCode3;
        int i232 = i222 & (i222 | identityHashCode3);
        int i242 = i232 & i;
        int i252 = (i232 | i) & (~i242);
        int i262 = (i242 ^ i252) | (i252 & i242) | i7;
        int i272 = ~i262;
        int i282 = (i262 | i272) & i272;
        int i292 = i212 ^ i282;
        int i302 = i212 & i282;
        int i312 = -(-(((i302 ^ i292) | (i302 & i292)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
        int i322 = ((((~i312) & i172) | ((~i172) & i312)) - (~(-(-((i312 & i172) << 1))))) - 1;
        int i332 = i232 & i7;
        int i342 = (i232 | i7) & (~i332);
        int i352 = ~((i332 ^ i342) | (i342 & i332));
        int i362 = i & i352;
        int i372 = -(~(-(-((((i352 | i) & (~i362)) | i362) * (-440)))));
        int i382 = ((i322 ^ i372) + ((i372 & i322) << 1)) - 1;
        int i392 = i & i7;
        int i402 = (i | i7) & (~i392);
        int i412 = (i392 ^ i402) | (i402 & i392);
        int i422 = ((i412 ^ identityHashCode3) | (i412 & identityHashCode3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
        int i432 = i382 & i422;
        int i442 = (i422 ^ i382) | i432;
        int i452 = ((i432 | i442) << 1) - (i442 ^ i432);
        int i462 = i452 * 31;
        str = setz.writeReplace;
        if (str != null) {
        }
        int i932 = values;
        int i942 = (i932 & (-54)) | ((~i932) & 53);
        int i952 = -(-((i932 & 53) << 1));
        valueOf = ((i942 ^ i952) + ((i952 & i942) << 1)) % 128;
        int identityHashCode222 = java.lang.System.identityHashCode(setz);
        int i5422 = i3 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
        int i5522 = -(-(i452 * 7843));
        int i5622 = ((((~i5522) & i5422) | ((~i5422) & i5522)) - (~((i5422 & i5522) << 1))) - 1;
        int i5722 = ~i3;
        int i5822 = ~i462;
        int i5922 = (i5722 & i5822) | (i5722 ^ i5822);
        int i6022 = ~i5922;
        int i6122 = (i5922 | i6022) & i6022;
        int i6222 = ~identityHashCode222;
        int i6322 = (i6222 | identityHashCode222) & i6222;
        int i6422 = ~((i6322 ^ i5822) | (i6322 & i5822));
        int i6522 = ((~i6422) & i6122) | ((~i6122) & i6422);
        int i6622 = i6122 & i6422;
        int i6722 = i3 | i462;
        int i6822 = i6722 & identityHashCode222;
        int i6922 = (i6722 | identityHashCode222) & (~i6822);
        int i7022 = (i6922 ^ i6822) | (i6922 & i6822);
        int i7122 = (i6622 ^ i6522) | (i6622 & i6522);
        int i7222 = ~i7022;
        int i7322 = (i7122 | ((i7022 | i7222) & i7222)) * (-252);
        int i7422 = ((i5622 | i7322) << 1) - (i5622 ^ i7322);
        int i7522 = (i3 & i5822) | (i462 & i5722);
        int i7622 = i3 & i462;
        int i7722 = ((i7522 ^ i7622) | (i7522 & i7622)) * (-252);
        int i7822 = i7422 ^ i7722;
        int i7922 = -(-((i7722 & i7422) << 1));
        int i8022 = ((i7822 | i7922) << 1) - (i7922 ^ i7822);
        int i8122 = ((~i6222) & i5822) | ((~i5822) & i6222);
        int i8222 = i5822 & i6222;
        int i8322 = (i8222 ^ i8122) | (i8222 & i8122);
        int i8422 = ~((i5722 & i8322) | ((~i8322) & i3) | (i8322 & i3));
        int i8522 = i3 ^ i462;
        int i8622 = (i8522 ^ i7622) | (i8522 & i7622);
        int i8722 = ~((identityHashCode222 & (~i8622)) | (i8622 & i6222) | (identityHashCode222 & i8622));
        int i8822 = ((i8722 ^ i8422) | (i8722 & i8422)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
        int i8922 = valueOf;
        int i9022 = i8922 & 37;
        int i9122 = -(-((i8922 ^ 37) | i9022));
        i2 = ((i9022 | i9122) << 1) - (i9122 ^ i9022);
        values = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    public final int hashCode() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, -1825047590, 1825047597, java.lang.System.identityHashCode(this))).intValue();
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this, p0}, -561228201, 561228207, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void writeReplace(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 12451017, -12451012, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -978270362, 978270363, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 1625632204, -1625632201, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -302657026, 302657028, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(int i) {
        values(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 1948378219, -1948378219, i);
    }

    public final int DigitizedCardProfile() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, -2076611405, 2076611409, java.lang.System.identityHashCode(this))).intValue();
    }
}
