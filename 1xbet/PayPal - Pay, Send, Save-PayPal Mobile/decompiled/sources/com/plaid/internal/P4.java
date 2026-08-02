package com.plaid.internal;

/* loaded from: classes16.dex */
public final class P4 {
    public static java.lang.String a(java.lang.String str) {
        java.lang.String obj;
        java.lang.String obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.google.gson.JsonElement parseString = com.google.gson.JsonParser.parseString(str);
        if (parseString.isJsonArray()) {
            com.google.gson.JsonArray asJsonArray = parseString.getAsJsonArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
            java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                com.google.gson.JsonElement next = it.next();
                if (next.isJsonObject()) {
                    com.google.gson.JsonObject asJsonObject = next.getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(asJsonObject);
                    if (asJsonObject.has(com.adjust.sdk.Constants.REFERRER_API_META)) {
                        com.google.gson.JsonElement remove = asJsonObject.remove(com.adjust.sdk.Constants.REFERRER_API_META);
                        if (remove.isJsonObject()) {
                            java.util.Set<java.lang.String> keySet = remove.getAsJsonObject().keySet();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
                            obj2 = kotlin.collections.CollectionsKt.joinToString$default(keySet, null, null, null, 0, null, null, 63, null);
                        } else {
                            obj2 = remove.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                        }
                        asJsonObject.addProperty(com.adjust.sdk.Constants.REFERRER_API_META, obj2);
                    }
                    if (asJsonObject.has("balance")) {
                        com.google.gson.JsonElement remove2 = asJsonObject.remove("balance");
                        if (remove2.isJsonObject()) {
                            java.util.Set<java.lang.String> keySet2 = remove2.getAsJsonObject().keySet();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet2, "");
                            obj = kotlin.collections.CollectionsKt.joinToString$default(keySet2, null, null, null, 0, null, null, 63, null);
                        } else {
                            obj = remove2.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                        }
                        asJsonObject.addProperty("balance", obj);
                    }
                }
            }
        } else if (parseString.isJsonObject()) {
            com.google.gson.JsonObject asJsonObject2 = parseString.getAsJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject2, "");
            a(asJsonObject2, com.adjust.sdk.Constants.REFERRER_API_META);
            a(asJsonObject2, "balance");
        }
        java.lang.String obj3 = parseString.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
        return obj3;
    }

    public static void a(com.google.gson.JsonObject jsonObject, java.lang.String str) {
        java.lang.String obj;
        if (jsonObject.has(str)) {
            com.google.gson.JsonElement remove = jsonObject.remove(str);
            if (remove.isJsonObject()) {
                java.util.Set<java.lang.String> keySet = remove.getAsJsonObject().keySet();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
                obj = kotlin.collections.CollectionsKt.joinToString$default(keySet, null, null, null, 0, null, null, 63, null);
            } else {
                obj = remove.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            }
            jsonObject.addProperty(str, obj);
        }
    }
}
