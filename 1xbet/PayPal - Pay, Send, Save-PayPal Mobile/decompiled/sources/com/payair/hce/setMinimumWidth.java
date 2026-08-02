package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u000e\u0010\n"}, d2 = {"Lcom/payair/hce/setMinimumWidth;", "", "Lcom/payair/hce/setAnimation;", "p0", "", "p1", "p2", "<init>", "(Lcom/payair/hce/setAnimation;Ljava/lang/String;Ljava/lang/String;)V", "AlternateContactlessPaymentDataJson", "()Lcom/payair/hce/setAnimation;", "writeReplace", "()Ljava/lang/String;", "getAid", "valueOf", "(Lcom/payair/hce/setAnimation;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/hce/setMinimumWidth;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "DigitizedCardProfile", "Ljava/lang/String;", "values", "Lcom/payair/hce/setAnimation;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class setMinimumWidth {
    private static int values = 1;
    private static int writeReplace;
    private final com.payair.hce.setAnimation AlternateContactlessPaymentDataJson;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    private final java.lang.String values;

    /* renamed from: valueOf, reason: from kotlin metadata */
    private final java.lang.String DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i2;
        switch ((i * 758) + (i2 * (-756)) + ((i | i4) * (-757)) + ((~(i5 | i | i3)) * 1514) + (((~((~i) | i5)) | (~(i4 | i5)) | (~(i2 | i | i3))) * 757)) {
            case 1:
                com.payair.hce.setMinimumWidth setminimumwidth = (com.payair.hce.setMinimumWidth) objArr[0];
                int i6 = writeReplace;
                int i7 = ((i6 & 45) + (i6 | 45)) % 128;
                values = i7;
                com.payair.hce.setAnimation setanimation = setminimumwidth.AlternateContactlessPaymentDataJson;
                int i8 = i7 & 97;
                int i9 = -(-((i7 ^ 97) | i8));
                writeReplace = ((i8 & i9) + (i8 | i9)) % 128;
                return setanimation;
            case 2:
                return writeReplace(objArr);
            case 3:
                return DigitizedCardProfile(objArr);
            case 4:
                return AlternateContactlessPaymentDataJson(objArr);
            case 5:
                return values(objArr);
            case 6:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 7:
                return RecordsJson(objArr);
            case 8:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 9:
                com.payair.hce.setMinimumWidth setminimumwidth2 = (com.payair.hce.setMinimumWidth) objArr[0];
                int i10 = values;
                int i11 = i10 & 113;
                int i12 = (~i11) & (i10 | 113);
                int i13 = i11 << 1;
                writeReplace = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                java.lang.String str = setminimumwidth2.DigitizedCardProfile;
                writeReplace = ((-2) - (~((i10 ^ 74) + ((i10 & 74) << 1)))) % 128;
                return str;
            default:
                return valueOf(objArr);
        }
    }

    public setMinimumWidth(com.payair.hce.setAnimation setanimation, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setanimation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.AlternateContactlessPaymentDataJson = setanimation;
        this.values = str;
        this.DigitizedCardProfile = str2;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setMinimumWidth setminimumwidth = (com.payair.hce.setMinimumWidth) objArr[0];
        int i = writeReplace;
        int i2 = i ^ 97;
        int i3 = (i & 97) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        values = i5;
        com.payair.hce.setAnimation setanimation = setminimumwidth.AlternateContactlessPaymentDataJson;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i6 = (i5 ^ 69) + ((i5 & 69) << 1);
        writeReplace = i6 % 128;
        if (i6 % 2 == 0) {
            return setanimation;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setMinimumWidth setminimumwidth = (com.payair.hce.setMinimumWidth) objArr[0];
        int i = values + 45;
        writeReplace = i % 128;
        java.lang.String str = setminimumwidth.values;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setMinimumWidth setminimumwidth = (com.payair.hce.setMinimumWidth) objArr[0];
        int i = writeReplace;
        int i2 = i & 41;
        int i3 = (((~i2) & (i | 41)) - (~(i2 << 1))) - 1;
        values = i3 % 128;
        java.lang.String str = setminimumwidth.DigitizedCardProfile;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i ^ 59;
        int i5 = (i & 59) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setMinimumWidth setminimumwidth = (com.payair.hce.setMinimumWidth) objArr[0];
        int i = values;
        int i2 = (i | 121) << 1;
        int i3 = -((i & (-122)) | ((~i) & 121));
        writeReplace = ((i2 & i3) + (i3 | i2)) % 128;
        int hashCode = setminimumwidth.AlternateContactlessPaymentDataJson.hashCode();
        int i4 = hashCode * 31;
        int hashCode2 = setminimumwidth.values.hashCode();
        int identityHashCode = java.lang.System.identityHashCode(setminimumwidth);
        int i5 = hashCode2 * 628;
        int i6 = -(~(-(-(hashCode * 19468))));
        int i7 = ((i5 ^ i6) + ((i6 & i5) << 1)) - 1;
        int i8 = ~i4;
        int i9 = ~identityHashCode;
        int i10 = i9 & i4;
        int i11 = identityHashCode & i8;
        int i12 = i10 | i11;
        int i13 = i4 & identityHashCode;
        int i14 = (i12 ^ i13) | (i12 & i13);
        int i15 = ~hashCode2;
        int i16 = i14 & i15;
        int i17 = (i14 | i15) & (~i16);
        int i18 = -(~(((i17 ^ i16) | (i17 & i16)) * (-627)));
        int i19 = ((i7 ^ i18) + ((i7 & i18) << 1)) - 1;
        int i20 = (~i11) & (i8 | identityHashCode);
        int i21 = ~((i20 ^ i11) | (i11 & i20));
        int i22 = ((~i21) & hashCode2) | (i15 & i21);
        int i23 = i21 & hashCode2;
        int i24 = -(-(((i23 ^ i22) | (i23 & i22)) * (-627)));
        int i25 = i19 ^ i24;
        int i26 = ((i24 & i19) | i25) << 1;
        int i27 = -i25;
        int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
        int i29 = (i8 & i9) | (i4 & (~i9));
        int i30 = ~((i29 ^ i10) | (i10 & i29));
        int i31 = hashCode2 & identityHashCode;
        int i32 = (hashCode2 | identityHashCode) & (~i31);
        int i33 = ~((i31 ^ i32) | (i31 & i32));
        int i34 = -(~(-(-((((~i30) & i33) | ((~i33) & i30) | (i30 & i33)) * 627))));
        int i35 = (i28 ^ i34) + ((i34 & i28) << 1);
        int i36 = (~i35) + (i35 << 1);
        int i37 = i36 * 31;
        int hashCode3 = setminimumwidth.DigitizedCardProfile.hashCode();
        int identityHashCode2 = java.lang.System.identityHashCode(setminimumwidth);
        int i38 = hashCode3 * com.knotapi.knot.utilities.Constants.ID_KROGER;
        int i39 = -(-(i36 * 11470));
        int i40 = ((i38 ^ i39) | (i38 & i39)) << 1;
        int i41 = -(((~i39) & i38) | ((~i38) & i39));
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        int i43 = (hashCode3 ^ i37) | (hashCode3 & i37);
        int i44 = ~identityHashCode2;
        int i45 = (i44 | identityHashCode2) & i44;
        int i46 = i43 & i45;
        int i47 = -(~((((i43 | i45) & (~i46)) | i46) * (-369)));
        int i48 = ((i42 & i47) + (i47 | i42)) - 1;
        int i49 = ~hashCode3;
        int i50 = ((~i44) & i49) | ((~i49) & i44);
        int i51 = i49 & i44;
        int i52 = ~((i50 ^ i51) | (i51 & i50));
        int i53 = ~i37;
        int i54 = ((~i52) & i37) | (i52 & i53);
        int i55 = i52 & i37;
        int i56 = -(-(((i55 ^ i54) | (i55 & i54)) * (-369)));
        int i57 = (i48 & i56) + (i56 | i48);
        int i58 = ~(i53 | hashCode3);
        int i59 = hashCode3 ^ identityHashCode2;
        int i60 = identityHashCode2 & hashCode3;
        int i61 = ~((i60 ^ i59) | (i60 & i59));
        int i62 = (i61 ^ i58) | (i61 & i58);
        int i63 = (i49 ^ i44) | i51;
        int i64 = ~((i63 ^ i37) | (i63 & i37));
        int i65 = i62 ^ i64;
        int i66 = i62 & i64;
        int i67 = -(i57 ^ (-(-(((i66 ^ i65) | (i66 & i65)) * 369))));
        int i68 = writeReplace;
        int i69 = i68 & 69;
        int i70 = ((i68 ^ 69) | i69) << 1;
        int i71 = -((i68 | 69) & (~i69));
        int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
        values = i72 % 128;
        if (i72 % 2 != 0) {
            return java.lang.Integer.valueOf(((((r12 & i57) | r0) << 1) - (~i67)) - 1);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setMinimumWidth setminimumwidth = (com.payair.hce.setMinimumWidth) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = writeReplace;
        int i2 = (i & 75) + (i | 75);
        int i3 = i2 % 128;
        values = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (setminimumwidth == obj) {
            int i4 = (((i3 ^ 74) + ((i3 & 74) << 1)) - 1) % 128;
            writeReplace = i4;
            values = (((i4 | 89) << 1) - (i4 ^ 89)) % 128;
            return bool2;
        }
        if (!(obj instanceof com.payair.hce.setMinimumWidth)) {
            int i5 = ((((i ^ 51) | (i & 51)) << 1) - (~(-((i & (-52)) | ((~i) & 51))))) - 1;
            int i6 = i5 % 128;
            values = i6;
            boolean z = i5 % 2 == 0;
            int i7 = (i6 & 7) + (i6 | 7);
            writeReplace = i7 % 128;
            if (i7 % 2 == 0) {
                return java.lang.Boolean.valueOf(z);
            }
            throw null;
        }
        com.payair.hce.setMinimumWidth setminimumwidth2 = (com.payair.hce.setMinimumWidth) obj;
        if (setminimumwidth.AlternateContactlessPaymentDataJson != setminimumwidth2.AlternateContactlessPaymentDataJson) {
            int i8 = i & 43;
            values = (((((i ^ 43) | i8) << 1) - (~(-((~i8) & (i | 43))))) - 1) % 128;
            int i9 = i & 125;
            int i10 = (i ^ 125) | i9;
            int i11 = (i9 & i10) + (i9 | i10);
            values = i11 % 128;
            if (i11 % 2 != 0) {
                return bool;
            }
            throw null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setminimumwidth.values, setminimumwidth2.values)) {
            int i12 = values;
            writeReplace = (((i12 | 45) << 1) - (i12 ^ 45)) % 128;
            writeReplace = (i12 + 31) % 128;
            return bool;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(setminimumwidth.DigitizedCardProfile, setminimumwidth2.DigitizedCardProfile)) {
            int i13 = writeReplace;
            int i14 = (-2) - (~(((i13 | 82) << 1) - (i13 ^ 82)));
            values = i14 % 128;
            if (i14 % 2 != 0) {
                return bool2;
            }
            throw new java.lang.ArithmeticException();
        }
        int i15 = writeReplace;
        int i16 = i15 & 113;
        int i17 = ((i15 ^ 113) | i16) << 1;
        int i18 = -((i15 | 113) & (~i16));
        int i19 = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
        values = i19;
        int i20 = i19 & 65;
        int i21 = -(-((i19 ^ 65) | i20));
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        writeReplace = i22 % 128;
        if (i22 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setMinimumWidth setminimumwidth = (com.payair.hce.setMinimumWidth) objArr[0];
        com.payair.hce.setAnimation setanimation = (com.payair.hce.setAnimation) objArr[1];
        java.lang.String str = (java.lang.String) objArr[2];
        java.lang.String str2 = (java.lang.String) objArr[3];
        int intValue = ((java.lang.Number) objArr[4]).intValue();
        java.lang.Object obj = objArr[5];
        int i = values;
        int i2 = ((i ^ 95) + ((i & 95) << 1)) % 128;
        writeReplace = i2;
        if ((intValue & 1) != 0) {
            int i3 = i2 ^ 93;
            int i4 = ((i2 & 93) | i3) << 1;
            int i5 = -i3;
            values = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
            setanimation = setminimumwidth.AlternateContactlessPaymentDataJson;
            int i6 = (i2 & 66) + (i2 | 66);
            values = ((~i6) + (i6 << 1)) % 128;
        }
        if ((intValue & 2) != 0) {
            values = ((i2 ^ 47) + ((i2 & 47) << 1)) % 128;
            str = setminimumwidth.values;
            int i7 = i2 & 45;
            int i8 = (i2 ^ 45) | i7;
            values = ((i7 & i8) + (i7 | i8)) % 128;
        }
        if ((intValue & 4) != 0) {
            int i9 = i2 & 95;
            int i10 = (i2 ^ 95) | i9;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            values = i11 % 128;
            if (i11 % 2 == 0) {
                java.lang.String str3 = setminimumwidth.DigitizedCardProfile;
                throw null;
            }
            str2 = setminimumwidth.DigitizedCardProfile;
        }
        com.payair.hce.setMinimumWidth setminimumwidth2 = (com.payair.hce.setMinimumWidth) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setminimumwidth, setanimation, str, str2}, -619362369, 619362369, java.lang.System.identityHashCode(setminimumwidth));
        int i12 = writeReplace;
        int i13 = i12 & 27;
        int i14 = -(-((i12 ^ 27) | i13));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        values = i15 % 128;
        if (i15 % 2 != 0) {
            return setminimumwidth2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setMinimumWidth setminimumwidth = (com.payair.hce.setMinimumWidth) objArr[0];
        int i = writeReplace;
        int i2 = (i ^ 95) + ((i & 95) << 1);
        values = i2 % 128;
        java.lang.String str = setminimumwidth.values;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setAnimation setanimation = (com.payair.hce.setAnimation) objArr[1];
        java.lang.String str = (java.lang.String) objArr[2];
        java.lang.String str2 = (java.lang.String) objArr[3];
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setanimation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.payair.hce.setMinimumWidth setminimumwidth = new com.payair.hce.setMinimumWidth(setanimation, str, str2);
        int i = values;
        int i2 = ((i | 16) << 1) - (i ^ 16);
        int i3 = (~i2) + (i2 << 1);
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            return setminimumwidth;
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, p0}, 531786586, -531786579, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1491985304, 1491985312, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = values;
        writeReplace = ((((i ^ 73) | (i & 73)) << 1) - ((i & (-74)) | ((~i) & 73))) % 128;
        com.payair.hce.setAnimation setanimation = this.AlternateContactlessPaymentDataJson;
        java.lang.String str = this.values;
        java.lang.String str2 = this.DigitizedCardProfile;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VisaCertificate(visaCertificateType=");
        sb.append(setanimation);
        sb.append(", certId=");
        sb.append(str);
        sb.append(", certPEM=");
        sb.append(str2);
        sb.append(")");
        java.lang.String obj = sb.toString();
        values = (writeReplace + 1) % 128;
        return obj;
    }

    public static /* synthetic */ com.payair.hce.setMinimumWidth valueOf$default(com.payair.hce.setMinimumWidth setminimumwidth, com.payair.hce.setAnimation setanimation, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        return (com.payair.hce.setMinimumWidth) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setminimumwidth, setanimation, str, str2, java.lang.Integer.valueOf(i), obj}, 62452033, -62452028, i);
    }

    public final com.payair.hce.setMinimumWidth valueOf(com.payair.hce.setAnimation p0, java.lang.String p1, java.lang.String p2) {
        return (com.payair.hce.setMinimumWidth) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, p0, p1, p2}, -619362369, 619362369, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getAid() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1588950705, 1588950714, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 359231209, -359231205, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setAnimation AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.setAnimation) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 809822060, -809822059, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 375297055, -375297053, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1153151309, 1153151315, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setAnimation valueOf() {
        return (com.payair.hce.setAnimation) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 85761349, -85761346, java.lang.System.identityHashCode(this));
    }
}
