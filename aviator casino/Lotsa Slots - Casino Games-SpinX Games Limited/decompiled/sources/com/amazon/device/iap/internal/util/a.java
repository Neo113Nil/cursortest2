package com.amazon.device.iap.internal.util;

/* compiled from: ReceiptHelper.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3492a = "a";

    public static com.amazon.device.iap.model.Receipt a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws com.amazon.device.iap.internal.b.a, com.amazon.device.iap.internal.b.d, java.lang.IllegalArgumentException {
        int i = com.amazon.device.iap.internal.util.a.AnonymousClass1.f3493a[b(jSONObject).ordinal()];
        if (i == 1) {
            return c(jSONObject, str, str2);
        }
        if (i == 2) {
            return b(jSONObject, str, str2);
        }
        return d(jSONObject, str, str2);
    }

    /* compiled from: ReceiptHelper.java */
    /* renamed from: com.amazon.device.iap.internal.util.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3493a;

        static {
            int[] iArr = new int[com.amazon.device.iap.internal.util.c.values().length];
            f3493a = iArr;
            try {
                iArr[com.amazon.device.iap.internal.util.c.V1.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3493a[com.amazon.device.iap.internal.util.c.LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3493a[com.amazon.device.iap.internal.util.c.V2.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static com.amazon.device.iap.model.Receipt b(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws com.amazon.device.iap.internal.b.a, com.amazon.device.iap.internal.b.d {
        java.lang.String optString = jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE);
        if (com.amazon.device.iap.internal.util.d.a(optString)) {
            com.amazon.device.iap.internal.util.e.b(f3492a, "a signature was not found in the receipt for request ID " + str2);
            com.amazon.device.iap.internal.util.MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString);
            throw new com.amazon.device.iap.internal.b.d(str2, null, optString);
        }
        try {
            com.amazon.device.iap.model.Receipt a2 = a(jSONObject);
            java.lang.String str3 = str + "-" + a2.getReceiptId();
            boolean isSignedByKiwi = com.amazon.android.Kiwi.isSignedByKiwi(str3, optString);
            com.amazon.device.iap.internal.util.e.a(f3492a, "stringToVerify/legacy:\n" + str3 + "\nsignature:\n" + optString);
            if (isSignedByKiwi) {
                return a2;
            }
            com.amazon.device.iap.internal.util.MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, optString);
            throw new com.amazon.device.iap.internal.b.d(str2, str3, optString);
        } catch (org.json.JSONException e) {
            throw new com.amazon.device.iap.internal.b.a(str2, jSONObject.toString(), e);
        }
    }

    private static com.amazon.device.iap.model.Receipt a(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.lang.String optString = jSONObject.optString("token");
        java.lang.String string = jSONObject.getString(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_SKU);
        com.amazon.device.iap.model.ProductType valueOf = com.amazon.device.iap.model.ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
        java.lang.String optString2 = jSONObject.optString("startDate");
        java.util.Date b = a(optString2) ? null : b(optString2);
        java.lang.String optString3 = jSONObject.optString("endDate");
        return new com.amazon.device.iap.internal.model.ReceiptBuilder().setReceiptId(optString).setSku(string).setProductType(valueOf).setPurchaseDate(b).setCancelDate(a(optString3) ? null : b(optString3)).build();
    }

    private static com.amazon.device.iap.model.Receipt c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws com.amazon.device.iap.internal.b.a, com.amazon.device.iap.internal.b.d {
        java.lang.String optString = jSONObject.optString("DeviceId");
        java.lang.String optString2 = jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE);
        if (com.amazon.device.iap.internal.util.d.a(optString2)) {
            com.amazon.device.iap.internal.util.e.b(f3492a, "a signature was not found in the receipt for request ID " + str2);
            com.amazon.device.iap.internal.util.MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new com.amazon.device.iap.internal.b.d(str2, null, optString2);
        }
        try {
            com.amazon.device.iap.model.Receipt a2 = a(jSONObject);
            java.lang.Object[] objArr = new java.lang.Object[9];
            objArr[0] = com.amazon.device.iap.PurchasingService.SDK_VERSION;
            objArr[1] = str;
            objArr[2] = optString;
            objArr[3] = a2.getProductType();
            objArr[4] = a2.getSku();
            objArr[5] = a2.getReceiptId();
            objArr[6] = str2;
            objArr[7] = com.amazon.device.iap.model.ProductType.SUBSCRIPTION == a2.getProductType() ? a2.getPurchaseDate() : null;
            objArr[8] = com.amazon.device.iap.model.ProductType.SUBSCRIPTION == a2.getProductType() ? a2.getCancelDate() : null;
            java.lang.String format = java.lang.String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ", objArr);
            com.amazon.device.iap.internal.util.e.a(f3492a, "stringToVerify/v1:\n" + format + "\nsignature:\n" + optString2);
            if (com.amazon.android.Kiwi.isSignedByKiwi(format, optString2)) {
                return a2;
            }
            com.amazon.device.iap.internal.util.MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
            throw new com.amazon.device.iap.internal.b.d(str2, format, optString2);
        } catch (org.json.JSONException e) {
            throw new com.amazon.device.iap.internal.b.a(str2, jSONObject.toString(), e);
        }
    }

    private static com.amazon.device.iap.model.Receipt d(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws com.amazon.device.iap.internal.b.a, com.amazon.device.iap.internal.b.d {
        java.lang.String optString = jSONObject.optString("DeviceId");
        java.lang.String optString2 = jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE);
        java.util.Date date = null;
        if (com.amazon.device.iap.internal.util.d.a(optString2)) {
            com.amazon.device.iap.internal.util.e.b(f3492a, "a signature was not found in the receipt for request ID " + str2);
            com.amazon.device.iap.internal.util.MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new com.amazon.device.iap.internal.b.d(str2, null, optString2);
        }
        try {
            java.lang.String string = jSONObject.getString("receiptId");
            java.lang.String string2 = jSONObject.getString(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_SKU);
            com.amazon.device.iap.model.ProductType valueOf = com.amazon.device.iap.model.ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
            java.lang.String optString3 = jSONObject.optString("purchaseDate");
            java.util.Date b = a(optString3) ? null : b(optString3);
            java.lang.String optString4 = jSONObject.optString("cancelDate");
            if (!a(optString4)) {
                date = b(optString4);
            }
            com.amazon.device.iap.model.Receipt build = new com.amazon.device.iap.internal.model.ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(valueOf).setPurchaseDate(b).setCancelDate(date).build();
            java.lang.String format = java.lang.String.format("%s|%s|%s|%s|%s|%tQ|%tQ", str, optString, build.getProductType(), build.getSku(), build.getReceiptId(), build.getPurchaseDate(), build.getCancelDate());
            com.amazon.device.iap.internal.util.e.a(f3492a, "stringToVerify/v2:\n" + format + "\nsignature:\n" + optString2);
            if (com.amazon.android.Kiwi.isSignedByKiwi(format, optString2)) {
                return build;
            }
            com.amazon.device.iap.internal.util.MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
            throw new com.amazon.device.iap.internal.b.d(str2, format, optString2);
        } catch (org.json.JSONException e) {
            throw new com.amazon.device.iap.internal.b.a(str2, jSONObject.toString(), e);
        }
    }

    protected static boolean a(java.lang.String str) {
        return str == null || str.trim().length() == 0;
    }

    protected static java.util.Date b(java.lang.String str) throws org.json.JSONException {
        try {
            java.util.Date parse = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(str);
            if (0 == parse.getTime()) {
                return null;
            }
            return parse;
        } catch (java.text.ParseException e) {
            throw new org.json.JSONException(e.getMessage());
        }
    }

    private static com.amazon.device.iap.internal.util.c b(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("DeviceId");
        if (!com.amazon.device.iap.internal.util.d.a(jSONObject.optString("receiptId"))) {
            return com.amazon.device.iap.internal.util.c.V2;
        }
        if (com.amazon.device.iap.internal.util.d.a(optString)) {
            return com.amazon.device.iap.internal.util.c.LEGACY;
        }
        return com.amazon.device.iap.internal.util.c.V1;
    }
}
