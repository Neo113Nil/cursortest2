package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/payair/hce/setWebViewClient;", "Lcom/payair/hce/communication/JsonResponse;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "writeReplace", "Ljava/lang/String;", "values", "()Ljava/lang/String;", "AlternateContactlessPaymentDataJson", "DigitizedCardProfile", "valueOf", "IccPrivateKeyCrtComponentsJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setWebViewClient extends com.payair.hce.communication.JsonResponse {
    private static int DigitizedCardProfile = 0;
    private static int getAid = 1;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getApplicationLabel)
    private final java.lang.String valueOf;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "xviaHint")
    private final java.lang.String DigitizedCardProfile;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getIssuerDiscretionaryData)
    private final java.lang.String values;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceID")
    private final java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (i * 567) + (i2 * (-565)) + (((~(i2 | i4)) | (~(i4 | i3))) * (-566)) + ((~(i | i5)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST) + ((~(i4 | i5 | i3)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST);
        if (i6 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 != 2) {
            return i6 != 3 ? AlternateContactlessPaymentDataJson(objArr) : writeReplace(objArr);
        }
        com.payair.hce.setWebViewClient setwebviewclient = (com.payair.hce.setWebViewClient) objArr[0];
        int i7 = DigitizedCardProfile;
        int i8 = i7 ^ 121;
        int i9 = -(-((i7 & 121) << 1));
        getAid = (((i8 | i9) << 1) - (i8 ^ i9)) % 128;
        java.lang.String str = setwebviewclient.values;
        int i10 = i7 & 119;
        int i11 = -(-((i7 ^ 119) | i10));
        getAid = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
        return str;
    }

    public /* synthetic */ setWebViewClient(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setWebViewClient setwebviewclient = (com.payair.hce.setWebViewClient) objArr[0];
        int i = getAid;
        int i2 = ((((i ^ 117) | (i & 117)) << 1) - (~(-((i & (-118)) | ((~i) & 117))))) - 1;
        DigitizedCardProfile = i2 % 128;
        java.lang.String str = setwebviewclient.writeReplace;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = i & 75;
        DigitizedCardProfile = ((((i | 75) & (~i3)) - (~(-(-(i3 << 1))))) - 1) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setWebViewClient setwebviewclient = (com.payair.hce.setWebViewClient) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i ^ 65;
        int i3 = ((i & 65) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        getAid = i5 % 128;
        java.lang.String str = setwebviewclient.valueOf;
        if (i5 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setWebViewClient setwebviewclient = (com.payair.hce.setWebViewClient) objArr[0];
        int i = getAid;
        int i2 = i ^ 13;
        int i3 = (i & 13) << 1;
        DigitizedCardProfile = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        java.lang.String str = setwebviewclient.DigitizedCardProfile;
        int i4 = ((i ^ 121) | (i & 121)) << 1;
        int i5 = -((i & (-122)) | ((~i) & 121));
        int i6 = (i4 & i5) + (i5 | i4);
        DigitizedCardProfile = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private setWebViewClient(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.writeReplace = str;
        this.values = str2;
        this.valueOf = str3;
        this.DigitizedCardProfile = str4;
    }

    public setWebViewClient() {
        this(null, null, null, null, 15, null);
    }

    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 124157864, -124157864, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -1338399582, 1338399585, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -563440649, 563440651, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1806366470, -1806366469, java.lang.System.identityHashCode(this));
    }
}
