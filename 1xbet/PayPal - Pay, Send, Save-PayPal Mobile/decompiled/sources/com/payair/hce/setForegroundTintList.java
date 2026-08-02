package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000eR$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\t\"\u0004\b\f\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b"}, d2 = {"Lcom/payair/hce/setForegroundTintList;", "Lcom/payair/hce/communication/JsonResponse;", "<init>", "()V", "", "isDataValid", "()Z", "", "toString", "()Ljava/lang/String;", "writeReplace", "Ljava/lang/String;", "values", "valueOf", "(Ljava/lang/String;)V", "DigitizedCardProfile", "AlternateContactlessPaymentDataJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setForegroundTintList extends com.payair.hce.communication.JsonResponse {
    private static int valueOf = 0;
    private static int values = 1;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "sha256Fingerprint")
    public java.lang.String AlternateContactlessPaymentDataJson;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "sha1Fingerprint")
    private java.lang.String valueOf;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "certificateData")
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~((~i3) | i2);
        int i6 = ~i;
        int i7 = (i * (-1939)) + (i2 * 971) + (((~(i | i4)) | i5) * (-970)) + ((~(i2 | i6)) * 1940) + (((~(i6 | i4)) | i5) * 970);
        if (i7 == 1) {
            return valueOf(objArr);
        }
        if (i7 == 2) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i7 == 3) {
            com.payair.hce.setForegroundTintList setforegroundtintlist = (com.payair.hce.setForegroundTintList) objArr[0];
            int i8 = values;
            int i9 = i8 & 39;
            int i10 = (i8 ^ 39) | i9;
            int i11 = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
            valueOf = i11;
            java.lang.String str = setforegroundtintlist.writeReplace;
            values = (i11 + 3) % 128;
            return str;
        }
        if (i7 == 4) {
            return writeReplace(objArr);
        }
        if (i7 == 5) {
            return values(objArr);
        }
        com.payair.hce.setForegroundTintList setforegroundtintlist2 = (com.payair.hce.setForegroundTintList) objArr[0];
        java.lang.String str2 = (java.lang.String) objArr[1];
        int i12 = valueOf;
        values = ((i12 & 71) + (i12 | 71)) % 128;
        setforegroundtintlist2.writeReplace = str2;
        return null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setForegroundTintList setforegroundtintlist = (com.payair.hce.setForegroundTintList) objArr[0];
        int i = values;
        int i2 = i & 77;
        int i3 = -(-((i ^ 77) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        java.lang.String str = setforegroundtintlist.valueOf;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setForegroundTintList setforegroundtintlist = (com.payair.hce.setForegroundTintList) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = valueOf;
        int i2 = i & 23;
        int i3 = -(-((i ^ 23) | i2));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        values = i4;
        setforegroundtintlist.valueOf = str;
        int i5 = ((i4 & (-32)) | ((~i4) & 31)) + ((i4 & 31) << 1);
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setForegroundTintList setforegroundtintlist = (com.payair.hce.setForegroundTintList) objArr[0];
        int i = values;
        int i2 = (i | 13) << 1;
        int i3 = -(i ^ 13);
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            java.lang.String str = setforegroundtintlist.writeReplace;
            java.lang.String str2 = setforegroundtintlist.valueOf;
            java.lang.String str3 = setforegroundtintlist.AlternateContactlessPaymentDataJson;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetrieveConfigurationPkCertResponse{certificateData='");
            sb.append(str);
            sb.append("', sha1Fingerprint='");
            sb.append(str2);
            sb.append("', sha256Fingerprint='");
            sb.append(str3);
            sb.append("'}");
            return sb.toString();
        }
        java.lang.String str4 = setforegroundtintlist.writeReplace;
        java.lang.String str5 = setforegroundtintlist.valueOf;
        java.lang.String str6 = setforegroundtintlist.AlternateContactlessPaymentDataJson;
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = values & 85;
        int i2 = ((i - (~(-(-((r1 ^ 85) | i))))) - 1) % 128;
        valueOf = i2;
        int i3 = (i2 & 39) + (i2 | 39);
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Boolean.TRUE;
        }
        throw null;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final boolean isDataValid() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -207387775, 207387780, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -946870502, 946870504, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 2130613978, -2130613974, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 191304866, -191304865, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 633780937, -633780937, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 837914199, -837914196, java.lang.System.identityHashCode(this));
    }
}
