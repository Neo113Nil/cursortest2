package com.payair.hce.communication;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\n\u0010\u000eJK\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\n\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/payair/hce/communication/Connection;", "", "<init>", "()V", "Lcom/payair/hce/communication/JsonRequest;", "p0", "Lcom/payair/hce/communication/JsonResponse;", "p1", "", "p2", "sendRequest", "(Lcom/payair/hce/communication/JsonRequest;Lcom/payair/hce/communication/JsonResponse;Ljava/lang/Integer;)Lcom/payair/hce/communication/JsonResponse;", "", "p3", "(Lcom/payair/hce/communication/JsonRequest;Lcom/payair/hce/communication/JsonResponse;Ljava/lang/Integer;Ljava/lang/String;)Lcom/payair/hce/communication/JsonResponse;", "p4", "p5", "(Ljava/lang/String;Lcom/payair/hce/communication/JsonRequest;Lcom/payair/hce/communication/JsonResponse;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/hce/communication/JsonResponse;", "", "values", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Connection {
    public static final com.payair.hce.communication.Connection INSTANCE = new com.payair.hce.communication.Connection();
    private static int values = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    private Connection() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.payair.hce.communication.JsonResponse sendRequest(com.payair.hce.communication.JsonRequest p0, com.payair.hce.communication.JsonResponse p1, java.lang.Integer p2, java.lang.String p3) {
        int i = writeReplace;
        int i2 = ((i ^ 57) | (i & 57)) << 1;
        int i3 = -((i & (-58)) | ((~i) & 57));
        int i4 = (i2 & i3) + (i3 | i2);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            sendRequest("/mobile", p0, p1, p2, null, p3);
            throw null;
        }
        com.payair.hce.communication.JsonResponse sendRequest = sendRequest("/mobile", p0, p1, p2, null, p3);
        int i5 = values;
        int i6 = (i5 & (-30)) | ((~i5) & 29);
        int i7 = (i5 & 29) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        writeReplace = i8 % 128;
        if (i8 % 2 == 0) {
            return sendRequest;
        }
        throw null;
    }

    @kotlin.jvm.JvmStatic
    public static final com.payair.hce.communication.JsonResponse sendRequest(com.payair.hce.communication.JsonRequest p0, com.payair.hce.communication.JsonResponse p1, java.lang.Integer p2) {
        int i = writeReplace;
        int i2 = ((i ^ 43) | (i & 43)) << 1;
        int i3 = -((i & (-44)) | ((~i) & 43));
        values = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        com.payair.hce.communication.JsonResponse sendRequest = sendRequest("/mobile", p0, p1, p2, null, null);
        int i4 = writeReplace;
        int i5 = i4 & 63;
        int i6 = (i4 ^ 63) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        values = i7 % 128;
        if (i7 % 2 != 0) {
            return sendRequest;
        }
        throw null;
    }

    @kotlin.jvm.JvmStatic
    public static final com.payair.hce.communication.JsonResponse sendRequest(java.lang.String p0, com.payair.hce.communication.JsonRequest p1, com.payair.hce.communication.JsonResponse p2, java.lang.Integer p3, java.lang.String p4, java.lang.String p5) {
        java.lang.String str;
        int i = writeReplace + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        values = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1486464230, -1486464227, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i2 = values;
            int i3 = i2 & 67;
            int i4 = (i2 ^ 67) | i3;
            writeReplace = ((i3 & i4) + (i4 | i3)) % 128;
            str = null;
        } else {
            str = p0;
        }
        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) com.payair.hce.setScrollBarFadeDuration.writeReplace(new java.lang.Object[]{str, p1, p2, p3, p4, p5}, 2111170022, -2111170022, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setOverScrollMode setoverscrollmode = new com.payair.hce.setOverScrollMode(com.payair.hce.setSaveFromParentEnabled.getAlternateContactlessPaymentData());
        com.payair.hce.setOverScrollMode.writeReplace(new java.lang.Object[]{setoverscrollmode, jsonResponse}, 513179294, -513179292, java.lang.System.identityHashCode(setoverscrollmode));
        int i5 = values;
        int i6 = (((i5 & (-4)) | ((~i5) & 3)) - (~((i5 & 3) << 1))) - 1;
        writeReplace = i6 % 128;
        if (i6 % 2 == 0) {
            return jsonResponse;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = writeReplace;
        int i2 = (i & 90) + (i | 90);
        int i3 = (~i2) + (i2 << 1);
        values = i3 % 128;
        if (i3 % 2 == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.payair.hce.setScrollBarFadeDuration.writeReplace(new java.lang.Object[]{str}, 986077232, -986077231, (int) java.lang.System.currentTimeMillis());
            throw new java.lang.ArithmeticException();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.payair.hce.setScrollBarFadeDuration.writeReplace(new java.lang.Object[]{str}, 986077232, -986077231, (int) java.lang.System.currentTimeMillis());
        int i4 = writeReplace;
        values = ((i4 ^ 107) + ((i4 & 107) << 1)) % 128;
        return null;
    }

    static {
        int i = writeReplace;
        values = (((i & 95) - (~(i | 95))) - 1) % 128;
    }

    @kotlin.jvm.JvmStatic
    public static final void values(java.lang.String p0) {
        valueOf(new java.lang.Object[]{p0}, 1818092431, -1818092431, (int) java.lang.System.currentTimeMillis());
    }
}
