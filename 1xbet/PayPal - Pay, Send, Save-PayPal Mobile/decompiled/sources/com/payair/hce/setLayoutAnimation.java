package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u000f\u001a\u00020\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/payair/hce/setLayoutAnimation;", "", "<init>", "()V", "Lcom/payair/hce/communication/JsonResponse;", "T", "Lcom/payair/hce/communication/JsonRequest;", "p0", "p1", "", "p2", "writeReplace", "(Lcom/payair/hce/communication/JsonRequest;Lcom/payair/hce/communication/JsonResponse;Ljava/lang/Integer;)Lcom/payair/hce/communication/JsonResponse;", "", "p3", "valueOf", "(Lcom/payair/hce/communication/JsonRequest;Lcom/payair/hce/communication/JsonResponse;Ljava/lang/Integer;Ljava/lang/String;)Lcom/payair/hce/communication/JsonResponse;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setLayoutAnimation {
    private static int AlternateContactlessPaymentDataJson = 1;
    public static final com.payair.hce.setLayoutAnimation INSTANCE = new com.payair.hce.setLayoutAnimation();
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ~(i4 | i);
        return ((((i * 465) + (i2 * (-463))) + (((~(i5 | i)) | ((~(i5 | i4)) | i6)) * 464)) + ((((~i) | i3) | i4) * (-464))) + (((~(i | i3)) | i6) * 464) != 1 ? valueOf(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    private setLayoutAnimation() {
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.communication.JsonRequest jsonRequest = (com.payair.hce.communication.JsonRequest) objArr[0];
        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) objArr[1];
        java.lang.Integer num = (java.lang.Integer) objArr[2];
        java.lang.String str = (java.lang.String) objArr[3];
        int i = writeReplace;
        int i2 = ((i ^ 107) - (~((i & 107) << 1))) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonResponse, "");
            return com.payair.hce.communication.Connection.sendRequest(jsonRequest, jsonResponse, num, str);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonResponse, "");
        com.payair.hce.communication.Connection.sendRequest(jsonRequest, jsonResponse, num, str);
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.communication.JsonRequest jsonRequest = (com.payair.hce.communication.JsonRequest) objArr[0];
        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) objArr[1];
        java.lang.Integer num = (java.lang.Integer) objArr[2];
        int i = writeReplace;
        int i2 = i & 81;
        int i3 = (i | 81) & (~i2);
        int i4 = i2 << 1;
        AlternateContactlessPaymentDataJson = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonResponse, "");
        com.payair.hce.communication.JsonResponse sendRequest = com.payair.hce.communication.Connection.sendRequest(jsonRequest, jsonResponse, num);
        int i5 = writeReplace;
        int i6 = (((i5 & (-86)) | ((~i5) & 85)) - (~(-(-((i5 & 85) << 1))))) - 1;
        AlternateContactlessPaymentDataJson = i6 % 128;
        if (i6 % 2 != 0) {
            return sendRequest;
        }
        throw null;
    }

    static {
        int i = (-2) - (~(AlternateContactlessPaymentDataJson + 28));
        writeReplace = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static <T extends com.payair.hce.communication.JsonResponse> com.payair.hce.communication.JsonResponse writeReplace(com.payair.hce.communication.JsonRequest p0, T p1, java.lang.Integer p2) {
        return (com.payair.hce.communication.JsonResponse) valueOf(new java.lang.Object[]{p0, p1, p2}, -158232939, 158232939, (int) java.lang.System.currentTimeMillis());
    }

    public static <T extends com.payair.hce.communication.JsonResponse> com.payair.hce.communication.JsonResponse valueOf(com.payair.hce.communication.JsonRequest p0, T p1, java.lang.Integer p2, java.lang.String p3) {
        return (com.payair.hce.communication.JsonResponse) valueOf(new java.lang.Object[]{p0, p1, p2, p3}, -1733898870, 1733898871, (int) java.lang.System.currentTimeMillis());
    }
}
