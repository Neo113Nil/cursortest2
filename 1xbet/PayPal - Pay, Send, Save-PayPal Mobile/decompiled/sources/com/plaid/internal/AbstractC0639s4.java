package com.plaid.internal;

/* renamed from: com.plaid.internal.s4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0639s4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6566a;

    /* renamed from: com.plaid.internal.s4$a */
    /* loaded from: classes16.dex */
    public static final class a {
        public static com.plaid.internal.AbstractC0639s4 a(java.lang.String str) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
            java.lang.Integer intOrNull;
            kotlinx.serialization.json.JsonElement jsonElement;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlinx.serialization.json.JsonObject jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(kotlinx.serialization.json.Json.INSTANCE.parseToJsonElement(str));
            kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "url");
            java.lang.String str2 = null;
            java.lang.String content = (jsonElement2 == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive3.getContent();
            kotlin.jvm.internal.Intrinsics.checkNotNull(content);
            kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "mobile_sdk_url_open_message");
            kotlinx.serialization.json.JsonObject jsonObject2 = jsonElement3 != null ? kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement3) : null;
            if (jsonObject2 != null && (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "android_url_open_behavior")) != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                str2 = jsonPrimitive2.getContent();
            }
            if (str2 != null) {
                int hashCode = str2.hashCode();
                int i = 0;
                if (hashCode != -1436496974) {
                    if (hashCode != -844381507) {
                        if (hashCode != 1225038860) {
                            if (hashCode == 1926770975 && str2.equals("ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB")) {
                                return new com.plaid.internal.AbstractC0639s4.c(content);
                            }
                        } else if (str2.equals("ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER")) {
                            return new com.plaid.internal.AbstractC0639s4.b(content);
                        }
                    } else if (str2.equals("ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB")) {
                        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "android_partial_custom_tab_screen_height_pixels");
                        if (jsonElement4 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) != null && (intOrNull = kotlinx.serialization.json.JsonElementKt.getIntOrNull(jsonPrimitive)) != null) {
                            i = intOrNull.intValue();
                        }
                        return new com.plaid.internal.AbstractC0639s4.d(content, i);
                    }
                } else if (str2.equals("ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN")) {
                    return new com.plaid.internal.AbstractC0639s4.d(content, 0);
                }
            }
            throw new java.lang.Exception("android_url_open_behavior not supported :".concat(java.lang.String.valueOf(str2)));
        }
    }

    /* renamed from: com.plaid.internal.s4$b */
    public static final class b extends com.plaid.internal.AbstractC0639s4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str) {
            super(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* renamed from: com.plaid.internal.s4$c */
    public static final class c extends com.plaid.internal.AbstractC0639s4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(java.lang.String str) {
            super(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* renamed from: com.plaid.internal.s4$d */
    public static final class d extends com.plaid.internal.AbstractC0639s4 {
        public final int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(java.lang.String str, int i) {
            super(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.b = i;
        }
    }

    public AbstractC0639s4(java.lang.String str) {
        this.f6566a = str;
    }
}
