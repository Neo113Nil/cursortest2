package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003"}, d2 = {"Lcom/payair/hce/setDrawingCacheEnabled;", "", "<init>", "()V", "", "p0", "", "writeReplace", "(Ljava/lang/String;)V", "valueOf", "values", "Lcom/payair/hce/AuthenticationEnum;", "AlternateContactlessPaymentDataJson", "(Lcom/payair/hce/AuthenticationEnum;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setDrawingCacheEnabled {
    private static int AlternateContactlessPaymentDataJson = 0;
    public static final com.payair.hce.setDrawingCacheEnabled INSTANCE = new com.payair.hce.setDrawingCacheEnabled();
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        switch ((i * (-55)) + (i2 * (-55)) + (((~(i | i3)) | i2) * 56) + ((~(i | i2)) * (-56)) + ((i | (~(i2 | (~i3)))) * 56)) {
            case 1:
                java.lang.String str = (java.lang.String) objArr[0];
                int i4 = AlternateContactlessPaymentDataJson;
                writeReplace = (((i4 | 63) << 1) - (i4 ^ 63)) % 128;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                com.payair.hce.setRenderEffect.writeReplace(new java.lang.Object[]{str}, -788299560, 788299560, (int) java.lang.System.currentTimeMillis());
                int i5 = AlternateContactlessPaymentDataJson;
                int i6 = i5 ^ 125;
                writeReplace = ((((i5 & 125) | i6) << 1) - i6) % 128;
                return null;
            case 2:
                return AlternateContactlessPaymentDataJson(objArr);
            case 3:
                com.payair.hce.AuthenticationEnum authenticationEnum = (com.payair.hce.AuthenticationEnum) objArr[0];
                int i7 = AlternateContactlessPaymentDataJson;
                int i8 = i7 & 39;
                int i9 = (i7 | 39) & (~i8);
                int i10 = i8 << 1;
                writeReplace = ((i9 & i10) + (i9 | i10)) % 128;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationEnum, "");
                writeReplace = (AlternateContactlessPaymentDataJson + 97) % 128;
                return null;
            case 4:
                return writeReplace(objArr);
            case 5:
                return values(objArr);
            case 6:
                return DigitizedCardProfile(objArr);
            default:
                return valueOf(objArr);
        }
    }

    private setDrawingCacheEnabled() {
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = ((-2) - (~((i ^ 28) + ((i & 28) << 1)))) % 128;
        com.payair.hce.setRenderEffect.writeReplace(new java.lang.Object[0], -1875299898, 1875299903, (int) java.lang.System.currentTimeMillis());
        int i2 = writeReplace;
        int i3 = ((i2 | 121) << 1) - (i2 ^ 121);
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        AlternateContactlessPaymentDataJson = ((-2) - (~(writeReplace + 54))) % 128;
        com.payair.hce.setRenderEffect.writeReplace(new java.lang.Object[0], 218508374, -218508371, (int) java.lang.System.currentTimeMillis());
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 43;
        int i3 = (i ^ 43) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        writeReplace = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i ^ 120) + ((i & 120) << 1)) - 1;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.payair.hce.setRenderEffect.writeReplace(new java.lang.Object[]{str}, -79140452, 79140453, (int) java.lang.System.currentTimeMillis());
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.payair.hce.setRenderEffect.writeReplace(new java.lang.Object[]{str}, -79140452, 79140453, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = AlternateContactlessPaymentDataJson + 101;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.setRenderEffect.writeReplace(new java.lang.Object[0], -2196091, 2196093, (int) java.lang.System.currentTimeMillis());
            return null;
        }
        com.payair.hce.setRenderEffect.writeReplace(new java.lang.Object[0], -2196091, 2196093, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = (((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) - 1) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.payair.hce.setRenderEffect.writeReplace(new java.lang.Object[]{str}, 1157035584, -1157035578, (int) java.lang.System.currentTimeMillis());
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = ((i2 & 5) - (~(-(-(i2 | 5))))) - 1;
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    @kotlin.jvm.JvmStatic
    public static final void values(java.lang.String p0) {
        values(new java.lang.Object[]{p0}, -652834650, 652834650, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final void values() {
        values(new java.lang.Object[0], -1133094326, 1133094331, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final void AlternateContactlessPaymentDataJson(com.payair.hce.AuthenticationEnum p0) {
        values(new java.lang.Object[]{p0}, 1471642044, -1471642041, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final void valueOf(java.lang.String p0) {
        values(new java.lang.Object[]{p0}, 1368972204, -1368972202, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final void valueOf() {
        values(new java.lang.Object[0], 706526200, -706526194, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final void AlternateContactlessPaymentDataJson() {
        values(new java.lang.Object[0], 1056196171, -1056196167, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final void writeReplace(java.lang.String p0) {
        values(new java.lang.Object[]{p0}, -912508454, 912508455, (int) java.lang.System.currentTimeMillis());
    }
}
