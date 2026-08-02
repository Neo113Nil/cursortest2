package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u0014J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0007\u0010\u0015R\u0018\u0010\u0007\u001a\u0006*\u00020\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017"}, d2 = {"Lcom/payair/hce/setRight;", "Lcom/payair/hce/setForceDarkAllowed;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "AlternateContactlessPaymentDataJson", "()V", "RecordsJson", "getProfileVersion", "SdkCoreAlternateContactlessPaymentDataImpl", "Lcom/payair/hce/setHandwritingDelegatorCallback;", "values", "()Lcom/payair/hce/setHandwritingDelegatorCallback;", "", "DigitizedCardProfile", "()Ljava/lang/String;", "valueOf", "writeReplace", "(Lcom/payair/hce/setHandwritingDelegatorCallback;)V", "(Ljava/lang/String;)V", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setRight implements com.payair.hce.setForceDarkAllowed {
    private static int AlternateContactlessPaymentDataJson = 0;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    public static final com.payair.hce.setRight.Companion INSTANCE = new com.payair.hce.setRight.Companion(null);
    private static int writeReplace = 1;

    /* renamed from: values, reason: from kotlin metadata */
    private final android.content.SharedPreferences AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~i3;
        switch ((i * (-1975)) + (i2 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + ((i3 | i4) * 988) + (((~(i | i5)) | (~(i | i6))) * (-1976)) + (((~(i5 | i3)) | i4 | (~(i2 | i6))) * 988)) {
            case 1:
                com.payair.hce.setRight setright = (com.payair.hce.setRight) objArr[0];
                int i7 = AlternateContactlessPaymentDataJson;
                writeReplace = (((i7 & 112) + (i7 | 112)) - 1) % 128;
                setright.AlternateContactlessPaymentDataJson.edit().remove("default_visa_ntr").apply();
                int i8 = writeReplace;
                int i9 = i8 & 109;
                AlternateContactlessPaymentDataJson = (((i8 | 109) & (~i9)) + (i9 << 1)) % 128;
                return null;
            case 2:
                return values(objArr);
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return writeReplace(objArr);
            case 5:
                return valueOf(objArr);
            case 6:
                return DigitizedCardProfile(objArr);
            case 7:
                return getProfileVersion(objArr);
            case 8:
                com.payair.hce.setRight setright2 = (com.payair.hce.setRight) objArr[0];
                com.payair.hce.setHandwritingDelegatorCallback sethandwritingdelegatorcallback = (com.payair.hce.setHandwritingDelegatorCallback) objArr[1];
                int i10 = AlternateContactlessPaymentDataJson;
                writeReplace = ((i10 ^ 117) + ((i10 & 117) << 1)) % 128;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sethandwritingdelegatorcallback, "");
                setright2.AlternateContactlessPaymentDataJson.edit().putString("selected_scheme", sethandwritingdelegatorcallback.writeReplace()).apply();
                writeReplace = (AlternateContactlessPaymentDataJson + 3) % 128;
                return null;
            case 9:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 10:
                com.payair.hce.setRight setright3 = (com.payair.hce.setRight) objArr[0];
                com.payair.hce.setHandwritingDelegatorCallback sethandwritingdelegatorcallback2 = (com.payair.hce.setHandwritingDelegatorCallback) objArr[1];
                int i11 = AlternateContactlessPaymentDataJson;
                writeReplace = (((i11 & (-122)) | ((~i11) & 121)) + ((i11 & 121) << 1)) % 128;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sethandwritingdelegatorcallback2, "");
                setright3.AlternateContactlessPaymentDataJson.edit().putString("default_scheme", sethandwritingdelegatorcallback2.writeReplace()).apply();
                int i12 = writeReplace;
                AlternateContactlessPaymentDataJson = ((i12 ^ 13) + ((i12 & 13) << 1)) % 128;
                return null;
            case 11:
                com.payair.hce.setRight setright4 = (com.payair.hce.setRight) objArr[0];
                int i13 = AlternateContactlessPaymentDataJson;
                int i14 = i13 ^ 67;
                int i15 = (i13 & 67) << 1;
                writeReplace = ((i14 & i15) + (i15 | i14)) % 128;
                setright4.AlternateContactlessPaymentDataJson.edit().remove("selected_visa_ntr").apply();
                int i16 = writeReplace;
                AlternateContactlessPaymentDataJson = ((i16 & 101) + (i16 | 101)) % 128;
                return null;
            default:
                com.payair.hce.setRight setright5 = (com.payair.hce.setRight) objArr[0];
                int i17 = AlternateContactlessPaymentDataJson;
                writeReplace = ((i17 & 125) + (i17 | 125)) % 128;
                java.lang.String string = setright5.AlternateContactlessPaymentDataJson.getString("default_visa_ntr", null);
                int i18 = AlternateContactlessPaymentDataJson + 116;
                writeReplace = ((~i18) + (i18 << 1)) % 128;
                return string;
        }
    }

    public setRight(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.AlternateContactlessPaymentDataJson = context.getSharedPreferences("csdk", 0);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/hce/setRight$DigitizedCardProfile;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.payair.hce.setRight$DigitizedCardProfile, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setRight setright = (com.payair.hce.setRight) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = (((i & 20) + (i | 20)) - 1) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        setright.AlternateContactlessPaymentDataJson.edit().putString("selected_visa_ntr", str).apply();
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = (((i2 & (-48)) | ((~i2) & 47)) - (~((i2 & 47) << 1))) - 1;
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.setRight setright = (com.payair.hce.setRight) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 103;
        int i3 = (((i ^ 103) | i2) << 1) - ((i | 103) & (~i2));
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            setright.AlternateContactlessPaymentDataJson.edit().putString("default_visa_ntr", str).apply();
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        setright.AlternateContactlessPaymentDataJson.edit().putString("default_visa_ntr", str).apply();
        int i4 = AlternateContactlessPaymentDataJson;
        int i5 = i4 & 115;
        int i6 = (i4 | 115) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        writeReplace = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setRight setright = (com.payair.hce.setRight) objArr[0];
        int identityHashCode = java.lang.System.identityHashCode(setright);
        int i = ((~identityHashCode) & 150843158) | ((-150843159) & identityHashCode);
        int i2 = identityHashCode & 150843158;
        int i3 = ~((i ^ i2) | (i & i2));
        int i4 = ((i3 & (-16558613)) | (16558612 & (~i3)) | (i3 & 16558612)) * (-196);
        int i5 = ((~i4) & 1930333232) | ((-1930333233) & i4);
        int i6 = -(-((i4 & 1930333232) << 1));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        int i8 = i7 & (-811820624);
        int i9 = i8 + (((-811820624) ^ i7) | i8);
        int i10 = ~(identityHashCode | 150843158);
        int i11 = i10 & 134284546;
        int i12 = -(~((((i10 | 134284546) & (~i11)) | i11) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
        int identityHashCode2 = java.lang.System.identityHashCode(setright);
        int i13 = ~identityHashCode2;
        int i14 = i13 & 1142874818;
        int i15 = (-946467108) - (~(-(-((~(((1142874818 | i13) & (~i14)) | i14)) * (-560)))));
        int i16 = identityHashCode2 ^ (-308283434);
        int i17 = identityHashCode2 & (-308283434);
        int i18 = (i17 ^ i16) | (i17 & i16);
        int i19 = ~i18;
        int i20 = -(-(((i18 | i19) & i19) * (-560)));
        int i21 = i15 & i20;
        int i22 = -(-(i20 | i15));
        int i23 = (~((i13 ^ 310274667) | (i13 & 310274667))) & 1140883584;
        android.content.SharedPreferences sharedPreferences = setright.AlternateContactlessPaymentDataJson;
        if (((i9 ^ i12) + ((i12 & i9) << 1)) - 1 > (((i21 ^ i22) + ((i22 & i21) << 1)) - (~((((r2 | 1140883584) & (~i23)) | i23) * 560))) - 1) {
            sharedPreferences.getString("selected_scheme", null);
            throw null;
        }
        java.lang.String string = sharedPreferences.getString("selected_scheme", null);
        if (string == null) {
            int i24 = AlternateContactlessPaymentDataJson + 49;
            writeReplace = i24 % 128;
            if (i24 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i25 = writeReplace;
        AlternateContactlessPaymentDataJson = (((i25 & 116) + (i25 | 116)) - 1) % 128;
        com.payair.hce.setHandwritingDelegatorCallback.Companion companion = com.payair.hce.setHandwritingDelegatorCallback.INSTANCE;
        com.payair.hce.setHandwritingDelegatorCallback sethandwritingdelegatorcallback = (com.payair.hce.setHandwritingDelegatorCallback) com.payair.hce.setHandwritingDelegatorCallback.Companion.writeReplace(new java.lang.Object[]{string}, -400385885, 400385885, (int) java.lang.System.currentTimeMillis());
        int i26 = AlternateContactlessPaymentDataJson;
        int i27 = (i26 ^ 21) + ((i26 & 21) << 1);
        writeReplace = i27 % 128;
        if (i27 % 2 != 0) {
            return sethandwritingdelegatorcallback;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setRight setright = (com.payair.hce.setRight) objArr[0];
        int i = writeReplace;
        int i2 = i & 27;
        int i3 = ((i ^ 27) | i2) << 1;
        int i4 = -((i | 27) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AlternateContactlessPaymentDataJson = i5 % 128;
        android.content.SharedPreferences sharedPreferences = setright.AlternateContactlessPaymentDataJson;
        if (i5 % 2 != 0) {
            sharedPreferences.getString("default_scheme", null);
            throw null;
        }
        java.lang.String string = sharedPreferences.getString("default_scheme", null);
        if (string != null) {
            com.payair.hce.setHandwritingDelegatorCallback.Companion companion = com.payair.hce.setHandwritingDelegatorCallback.INSTANCE;
            com.payair.hce.setHandwritingDelegatorCallback sethandwritingdelegatorcallback = (com.payair.hce.setHandwritingDelegatorCallback) com.payair.hce.setHandwritingDelegatorCallback.Companion.writeReplace(new java.lang.Object[]{string}, -400385885, 400385885, (int) java.lang.System.currentTimeMillis());
            AlternateContactlessPaymentDataJson = (writeReplace + 93) % 128;
            return sethandwritingdelegatorcallback;
        }
        int i6 = writeReplace;
        int i7 = i6 & 73;
        int i8 = (i6 | 73) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 & i9) + (i8 | i9);
        AlternateContactlessPaymentDataJson = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setRight setright = (com.payair.hce.setRight) objArr[0];
        int i = writeReplace + 27;
        AlternateContactlessPaymentDataJson = i % 128;
        android.content.SharedPreferences sharedPreferences = setright.AlternateContactlessPaymentDataJson;
        if (i % 2 == 0) {
            return sharedPreferences.getString("selected_visa_ntr", null);
        }
        sharedPreferences.getString("selected_visa_ntr", null);
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setRight setright = (com.payair.hce.setRight) objArr[0];
        int i = writeReplace;
        int i2 = ((i ^ 80) + ((i & 80) << 1)) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            setright.AlternateContactlessPaymentDataJson.edit().remove("default_scheme").apply();
            return null;
        }
        setright.AlternateContactlessPaymentDataJson.edit().remove("default_scheme").apply();
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setRight setright = (com.payair.hce.setRight) objArr[0];
        int i = writeReplace;
        int i2 = i ^ 63;
        AlternateContactlessPaymentDataJson = ((((i & 63) | i2) << 1) - i2) % 128;
        setright.AlternateContactlessPaymentDataJson.edit().remove("selected_scheme").apply();
        int i3 = writeReplace;
        int i4 = i3 ^ 73;
        int i5 = (((i3 & 73) | i4) << 1) - i4;
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        int i = writeReplace;
        int i2 = i & 85;
        int i3 = i2 + ((i ^ 85) | i2);
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final void RecordsJson() {
        valueOf(new java.lang.Object[]{this}, -428671214, 428671215, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final void SdkCoreAlternateContactlessPaymentDataImpl() {
        valueOf(new java.lang.Object[]{this}, -936844538, 936844549, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final void getProfileVersion() {
        valueOf(new java.lang.Object[]{this}, 1326460389, -1326460386, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final void AlternateContactlessPaymentDataJson() {
        valueOf(new java.lang.Object[]{this}, 1594741361, -1594741359, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -1058980714, 1058980714, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final java.lang.String writeReplace() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -1961438335, 1961438344, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final com.payair.hce.setHandwritingDelegatorCallback values() {
        return (com.payair.hce.setHandwritingDelegatorCallback) valueOf(new java.lang.Object[]{this}, -154287131, 154287137, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final com.payair.hce.setHandwritingDelegatorCallback valueOf() {
        return (com.payair.hce.setHandwritingDelegatorCallback) valueOf(new java.lang.Object[]{this}, 1616137688, -1616137683, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final void valueOf(java.lang.String p0) {
        valueOf(new java.lang.Object[]{this, p0}, 1741632874, -1741632867, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final void AlternateContactlessPaymentDataJson(java.lang.String p0) {
        valueOf(new java.lang.Object[]{this, p0}, 125585430, -125585426, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final void writeReplace(com.payair.hce.setHandwritingDelegatorCallback p0) {
        valueOf(new java.lang.Object[]{this, p0}, 879047889, -879047879, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setForceDarkAllowed
    public final void values(com.payair.hce.setHandwritingDelegatorCallback p0) {
        valueOf(new java.lang.Object[]{this, p0}, -1898173561, 1898173569, java.lang.System.identityHashCode(this));
    }
}
