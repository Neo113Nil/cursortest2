package com.paypal.android.threeds.utils;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/threeds/utils/ArrayUtils;", "", "<init>", "()V", "Lorg/json/JSONArray;", "jsonArray", "", "", "convertJsonArrayToList", "(Lorg/json/JSONArray;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ArrayUtils {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.utils.ArrayUtils INSTANCE = new com.paypal.android.threeds.utils.ArrayUtils();

    private ArrayUtils() {
    }

    public final java.util.List<java.lang.String> convertJsonArrayToList(org.json.JSONArray jsonArray) {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Converting JSONArray to List of String", null, null, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jsonArray != null) {
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jsonArray.getString(i));
            }
        }
        com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
        int size = arrayList.size();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Returning list with ");
        sb.append(size);
        sb.append(" items");
        com.paypal.android.logger.Logger.i$default(logger, sb.toString(), null, null, 6, null);
        return arrayList;
    }
}
