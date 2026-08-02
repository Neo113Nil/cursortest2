package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u001a\u0010\u0012"}, d2 = {"Lcom/payair/hce/setAdapter;", "Lcom/payair/hce/communication/JsonResponse;", "Lcom/payair/hce/setDrawSelectorOnTop;", "p0", "", "p1", "p2", "p3", "<init>", "(Lcom/payair/hce/setDrawSelectorOnTop;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "values", "Ljava/lang/String;", "AlternateContactlessPaymentDataJson", "valueOf", "Lcom/payair/hce/setDrawSelectorOnTop;", "()Lcom/payair/hce/setDrawSelectorOnTop;", "DigitizedCardProfile", "getProfileVersion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class setAdapter extends com.payair.hce.communication.JsonResponse {
    private static int RecordsJson = 1;
    private static int writeReplace;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "visaTokenRepersoResponse")
    private final java.lang.String AlternateContactlessPaymentDataJson;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo)
    private final java.lang.String valueOf;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "tokenInfo")
    private final com.payair.hce.setDrawSelectorOnTop DigitizedCardProfile;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "networkTokenReference")
    private final java.lang.String values;

    public /* synthetic */ setAdapter(com.payair.hce.setDrawSelectorOnTop setdrawselectorontop, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : setdrawselectorontop, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setAdapter setadapter = (com.payair.hce.setAdapter) objArr[0];
        int i = writeReplace;
        int i2 = i & 9;
        int i3 = i2 + ((i ^ 9) | i2);
        RecordsJson = i3 % 128;
        com.payair.hce.setDrawSelectorOnTop setdrawselectorontop = setadapter.DigitizedCardProfile;
        if (i3 % 2 != 0) {
            return setdrawselectorontop;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setAdapter setadapter = (com.payair.hce.setAdapter) objArr[0];
        int i = writeReplace;
        int i2 = i | 121;
        int i3 = ((i2 << 1) - (~(-((~(i & 121)) & i2)))) - 1;
        RecordsJson = i3 % 128;
        java.lang.String str = setadapter.values;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setAdapter setadapter = (com.payair.hce.setAdapter) objArr[0];
        int i = RecordsJson + 43;
        writeReplace = i % 128;
        java.lang.String str = setadapter.valueOf;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    private setAdapter(com.payair.hce.setDrawSelectorOnTop setdrawselectorontop, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.DigitizedCardProfile = setdrawselectorontop;
        this.values = str;
        this.valueOf = str2;
        this.AlternateContactlessPaymentDataJson = str3;
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i4 = ~i;
        int i5 = (i * 303) + (i2 * (-301)) + (((~((~i3) | i4 | i2)) | (~(i | i2 | i3))) * (-302)) + ((~(i4 | i2 | i3)) * (-604)) + (((~(i | (~i2))) | (~(i2 | i3))) * 302);
        if (i5 == 1) {
            return writeReplace(objArr);
        }
        if (i5 == 2) {
            return valueOf(objArr);
        }
        if (i5 == 3) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        int i6 = 0;
        if (i5 == 4) {
            com.payair.hce.setAdapter setadapter = (com.payair.hce.setAdapter) objArr[0];
            int i7 = writeReplace;
            int i8 = i7 & 41;
            int i9 = i7 | 41;
            RecordsJson = (((i8 | i9) << 1) - (i8 ^ i9)) % 128;
            java.lang.String str = setadapter.AlternateContactlessPaymentDataJson;
            RecordsJson = (i7 + 33) % 128;
            return str;
        }
        if (i5 == 5) {
            return values(objArr);
        }
        com.payair.hce.setAdapter setadapter2 = (com.payair.hce.setAdapter) objArr[0];
        int i10 = writeReplace;
        int i11 = i10 & 31;
        int i12 = (((i10 | 31) & (~i11)) + (i11 << 1)) % 128;
        RecordsJson = i12;
        com.payair.hce.setDrawSelectorOnTop setdrawselectorontop = setadapter2.DigitizedCardProfile;
        if (setdrawselectorontop == null) {
            int i13 = i12 & 111;
            writeReplace = ((((~i13) & (i12 | 111)) - (~(i13 << 1))) - 1) % 128;
            int i14 = i12 & 63;
            int i15 = ((i12 ^ 63) | i14) << 1;
            int i16 = -((i12 | 63) & (~i14));
            writeReplace = ((i15 & i16) + (i16 | i15)) % 128;
            hashCode = 0;
        } else {
            hashCode = setdrawselectorontop.hashCode();
            int i17 = writeReplace;
            RecordsJson = ((i17 & 43) + (i17 | 43)) % 128;
        }
        int i18 = hashCode * 31;
        java.lang.String str2 = setadapter2.values;
        if (str2 == null) {
            int i19 = RecordsJson;
            int i20 = i19 & 105;
            int i21 = (~i20) & (i19 | 105);
            int i22 = -(-(i20 << 1));
            writeReplace = (((i21 | i22) << 1) - (i22 ^ i21)) % 128;
            int i23 = i19 & 111;
            int i24 = (i19 | 111) & (~i23);
            int i25 = i23 << 1;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            writeReplace = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 4 / 4;
            }
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
            int i28 = writeReplace;
            RecordsJson = ((((i28 ^ 81) | (i28 & 81)) << 1) - ((i28 & (-82)) | ((~i28) & 81))) % 128;
        }
        int i29 = (((i18 | hashCode2) << 1) - (hashCode2 ^ i18)) * 31;
        java.lang.String str3 = setadapter2.valueOf;
        if (str3 == null) {
            int i30 = RecordsJson;
            int i31 = (((i30 | 46) << 1) - (i30 ^ 46)) - 1;
            writeReplace = i31 % 128;
            hashCode3 = i31 % 2 != 0 ? 1 : 0;
            int i32 = (-2) - (~((i30 ^ 62) + ((i30 & 62) << 1)));
            writeReplace = i32 % 128;
            if (i32 % 2 != 0) {
                int i33 = 4 / 3;
            }
        } else {
            hashCode3 = str3.hashCode();
            RecordsJson = (writeReplace + 111) % 128;
        }
        int i34 = -(~(-(-hashCode3)));
        int i35 = (((i29 & i34) + (i34 | i29)) - 1) * 31;
        java.lang.String str4 = setadapter2.AlternateContactlessPaymentDataJson;
        if (str4 == null) {
            int i36 = writeReplace;
            int i37 = i36 ^ 33;
            int i38 = (((((i36 & 33) | i37) << 1) - (~(-i37))) - 1) % 128;
            RecordsJson = i38;
            int i39 = i38 ^ 113;
            int i40 = (i38 & 113) << 1;
            int i41 = (i39 & i40) + (i40 | i39);
            writeReplace = i41 % 128;
            if (i41 % 2 != 0) {
                int i42 = 3 / 3;
            }
        } else {
            i6 = str4.hashCode();
            int i43 = RecordsJson;
            int i44 = i43 & 95;
            writeReplace = (((((i43 ^ 95) | i44) << 1) - (~(-((i43 | 95) & (~i44))))) - 1) % 128;
        }
        int i45 = i35 ^ i6;
        int i46 = writeReplace;
        int i47 = i46 ^ 101;
        int i48 = (i46 & 101) << 1;
        RecordsJson = ((i47 ^ i48) + ((i48 & i47) << 1)) % 128;
        return java.lang.Integer.valueOf((((i35 & i6) | i45) << 1) - i45);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        boolean z;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setAdapter setadapter = (com.payair.hce.setAdapter) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = writeReplace;
        int i2 = i & 35;
        int i3 = -(-((i ^ 35) | i2));
        RecordsJson = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        if (setadapter == obj) {
            int i4 = (i & (-102)) | ((~i) & 101);
            int i5 = -(-((i & 101) << 1));
            RecordsJson = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
            int i6 = (-2) - (~((i & 36) + (i | 36)));
            RecordsJson = i6 % 128;
            if (i6 % 2 != 0) {
                return bool2;
            }
            throw null;
        }
        if (obj instanceof com.payair.hce.setAdapter) {
            com.payair.hce.setAdapter setadapter2 = (com.payair.hce.setAdapter) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(setadapter.DigitizedCardProfile, setadapter2.DigitizedCardProfile)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(setadapter.values, setadapter2.values)) {
                    int i7 = writeReplace;
                    int i8 = i7 & 63;
                    int i9 = i8 + ((i7 ^ 63) | i8);
                    int i10 = i9 % 128;
                    RecordsJson = i10;
                    z = i9 % 2 == 0;
                    int i11 = i10 & 109;
                    int i12 = ((i10 ^ 109) | i11) << 1;
                    int i13 = -((i10 | 109) & (~i11));
                    int i14 = (i12 & i13) + (i13 | i12);
                    writeReplace = i14 % 128;
                    if (i14 % 2 == 0) {
                        return java.lang.Boolean.valueOf(z);
                    }
                    throw null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(setadapter.valueOf, setadapter2.valueOf)) {
                    int i15 = writeReplace;
                    int i16 = i15 & 117;
                    RecordsJson = ((((~i16) & (i15 | 117)) - (~(i16 << 1))) - 1) % 128;
                    int i17 = ((i15 ^ 112) + ((i15 & 112) << 1)) - 1;
                    RecordsJson = i17 % 128;
                    if (i17 % 2 != 0) {
                        return bool;
                    }
                    throw null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(setadapter.AlternateContactlessPaymentDataJson, setadapter2.AlternateContactlessPaymentDataJson)) {
                    int i18 = RecordsJson;
                    int i19 = i18 & 29;
                    writeReplace = (((((i18 ^ 29) | i19) << 1) - (~(-((i18 | 29) & (~i19))))) - 1) % 128;
                    return bool2;
                }
                int i20 = writeReplace + 99;
                int i21 = i20 % 128;
                RecordsJson = i21;
                z = i20 % 2 == 0;
                writeReplace = (i21 + 91) % 128;
                return java.lang.Boolean.valueOf(z);
            }
            int i22 = writeReplace;
            int i23 = i22 & 101;
            RecordsJson = (i23 + ((i22 ^ 101) | i23)) % 128;
        } else {
            int i24 = (i + 89) % 128;
            RecordsJson = i24;
            writeReplace = (((i24 | 85) << 1) - (i24 ^ 85)) % 128;
        }
        return bool;
    }

    public setAdapter() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, p0}, 1983044004, -1983044001, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 945214703, -945214703, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        int i = RecordsJson;
        int i2 = i & 107;
        writeReplace = (i2 + ((i ^ 107) | i2)) % 128;
        com.payair.hce.setDrawSelectorOnTop setdrawselectorontop = this.DigitizedCardProfile;
        java.lang.String str = this.values;
        java.lang.String str2 = this.valueOf;
        java.lang.String str3 = this.AlternateContactlessPaymentDataJson;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RepersoResponse(tokenInfo=");
        sb.append(setdrawselectorontop);
        sb.append(", networkTokenReference=");
        sb.append(str);
        sb.append(", tokenStatus=");
        sb.append(str2);
        sb.append(", visaTokenRepersoResponse=");
        sb.append(str3);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i3 = writeReplace;
        RecordsJson = (((((i3 ^ 87) | (i3 & 87)) << 1) - (~(-((i3 & (-88)) | ((~i3) & 87))))) - 1) % 128;
        return obj;
    }

    public final java.lang.String getProfileVersion() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -1283691499, 1283691503, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -1808478366, 1808478368, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 1461252956, -1461252955, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setDrawSelectorOnTop values() {
        return (com.payair.hce.setDrawSelectorOnTop) writeReplace(new java.lang.Object[]{this}, -739186807, 739186812, java.lang.System.identityHashCode(this));
    }
}
