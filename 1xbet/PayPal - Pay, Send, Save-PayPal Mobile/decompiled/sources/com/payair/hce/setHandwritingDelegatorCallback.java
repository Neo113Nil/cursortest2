package com.payair.hce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\u000b"}, d2 = {"Lcom/payair/hce/setHandwritingDelegatorCallback;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "DigitizedCardProfile", "Ljava/lang/String;", "writeReplace", "()Ljava/lang/String;", "valueOf", "values"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setHandwritingDelegatorCallback {

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    private final java.lang.String valueOf;
    public static final com.payair.hce.setHandwritingDelegatorCallback writeReplace = new com.payair.hce.setHandwritingDelegatorCallback("MASTERCARD", 0, "MASTERCARD");
    public static final com.payair.hce.setHandwritingDelegatorCallback values = new com.payair.hce.setHandwritingDelegatorCallback("VISA", 1, "VISA");
    private static final /* synthetic */ com.payair.hce.setHandwritingDelegatorCallback[] AlternateContactlessPaymentDataJson = valueOf();

    /* renamed from: valueOf, reason: from kotlin metadata */
    public static final com.payair.hce.setHandwritingDelegatorCallback.Companion INSTANCE = new com.payair.hce.setHandwritingDelegatorCallback.Companion(null);
    private static int getAid;
    private static int IccPrivateKeyCrtComponentsJson = (getAid + 91) % 128;

    private setHandwritingDelegatorCallback(java.lang.String str, int i, java.lang.String str2) {
        this.valueOf = str2;
    }

    public final java.lang.String writeReplace() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i ^ 29) + ((i & 29) << 1);
        getAid = i2 % 128;
        java.lang.String str = this.valueOf;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/hce/setHandwritingDelegatorCallback$valueOf;", "", "<init>", "()V", "", "p0", "Lcom/payair/hce/setHandwritingDelegatorCallback;", "values", "(Ljava/lang/String;)Lcom/payair/hce/setHandwritingDelegatorCallback;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.payair.hce.setHandwritingDelegatorCallback$valueOf, reason: from kotlin metadata */
    public static final class Companion {
        private static int values = 1;
        private static int writeReplace;

        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = 0;
            java.lang.String str = (java.lang.String) objArr[0];
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.payair.hce.setHandwritingDelegatorCallback[] values2 = com.payair.hce.setHandwritingDelegatorCallback.values();
            int length = values2.length;
            writeReplace = (values + 33) % 128;
            while (i4 < length) {
                int i5 = writeReplace;
                int i6 = i5 ^ 121;
                int i7 = -(-((i5 & 121) << 1));
                values = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
                com.payair.hce.setHandwritingDelegatorCallback sethandwritingdelegatorcallback = values2[i4];
                if (kotlin.jvm.internal.Intrinsics.areEqual(sethandwritingdelegatorcallback.writeReplace(), str)) {
                    int i8 = writeReplace;
                    int i9 = ((i8 ^ 67) | (i8 & 67)) << 1;
                    int i10 = -((i8 & (-68)) | ((~i8) & 67));
                    int i11 = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
                    values = i11;
                    int i12 = i11 & 33;
                    writeReplace = (i12 + ((i11 ^ 33) | i12)) % 128;
                    return sethandwritingdelegatorcallback;
                }
                i4 = (-2) - (~(i4 + 2));
                values = (writeReplace + 85) % 128;
            }
            int i13 = values;
            writeReplace = (((i13 | 31) << 1) - (i13 ^ 31)) % 128;
            return null;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static com.payair.hce.setHandwritingDelegatorCallback values(java.lang.String p0) {
            return (com.payair.hce.setHandwritingDelegatorCallback) writeReplace(new java.lang.Object[]{p0}, -400385885, 400385885, (int) java.lang.System.currentTimeMillis());
        }
    }

    private static final /* synthetic */ com.payair.hce.setHandwritingDelegatorCallback[] valueOf() {
        int i = IccPrivateKeyCrtComponentsJson;
        getAid = ((i ^ 43) + ((i & 43) << 1)) % 128;
        com.payair.hce.setHandwritingDelegatorCallback[] sethandwritingdelegatorcallbackArr = {writeReplace, values};
        int i2 = (i & (-102)) | ((~i) & 101);
        int i3 = (i & 101) << 1;
        getAid = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return sethandwritingdelegatorcallbackArr;
    }

    public static com.payair.hce.setHandwritingDelegatorCallback valueOf(java.lang.String str) {
        IccPrivateKeyCrtComponentsJson = (getAid + 75) % 128;
        com.payair.hce.setHandwritingDelegatorCallback sethandwritingdelegatorcallback = (com.payair.hce.setHandwritingDelegatorCallback) java.lang.Enum.valueOf(com.payair.hce.setHandwritingDelegatorCallback.class, str);
        getAid = (IccPrivateKeyCrtComponentsJson + 95) % 128;
        return sethandwritingdelegatorcallback;
    }

    public static com.payair.hce.setHandwritingDelegatorCallback[] values() {
        int i = IccPrivateKeyCrtComponentsJson;
        getAid = (((i ^ 54) + ((i & 54) << 1)) - 1) % 128;
        com.payair.hce.setHandwritingDelegatorCallback[] sethandwritingdelegatorcallbackArr = (com.payair.hce.setHandwritingDelegatorCallback[]) AlternateContactlessPaymentDataJson.clone();
        int i2 = IccPrivateKeyCrtComponentsJson;
        int i3 = i2 & 55;
        int i4 = (((i2 | 55) & (~i3)) - (~(i3 << 1))) - 1;
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            return sethandwritingdelegatorcallbackArr;
        }
        throw null;
    }
}
