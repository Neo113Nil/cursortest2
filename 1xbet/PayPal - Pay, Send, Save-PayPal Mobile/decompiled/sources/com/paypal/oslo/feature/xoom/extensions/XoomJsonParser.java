package com.paypal.oslo.feature.xoom.extensions;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/xoom/extensions/XoomJsonParser;", "", "<init>", "()V", "T", "", "jsonString", "Lkotlinx/serialization/KSerializer;", "serializer", "fromJson", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/json/Json;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class XoomJsonParser {
    public static final com.paypal.oslo.feature.xoom.extensions.XoomJsonParser INSTANCE = new com.paypal.oslo.feature.xoom.extensions.XoomJsonParser();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlinx.serialization.json.Json Camera2StreamConfigurationMap = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.extensions.XoomJsonParser$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.xoom.extensions.XoomJsonParser.$r8$lambda$Xni_CLY6tcRAolQHaFFpviZUSLo((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);
    public static final int $stable = 8;

    private XoomJsonParser() {
    }

    public final <T> T fromJson(java.lang.String jsonString, kotlinx.serialization.KSerializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        if (jsonString == null) {
            return null;
        }
        try {
            return (T) Camera2StreamConfigurationMap.decodeFromString(serializer, jsonString);
        } catch (kotlinx.serialization.SerializationException e) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.xoom.LoggerKt.log, com.paypal.android.logger.categories.App.Error.INSTANCE, "Failed to Serialize JSON: ".concat(java.lang.String.valueOf(e.getMessage())), null, null, null, 28, null);
            return null;
        } catch (java.lang.IllegalArgumentException e2) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.xoom.LoggerKt.log, com.paypal.android.logger.categories.App.Error.INSTANCE, "Failed to parse JSON - invalid format", null, null, e2, 12, null);
            return null;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xni_CLY6tcRAolQHaFFpviZUSLo(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setEncodeDefaults(false);
        jsonBuilder.setExplicitNulls(false);
        return kotlin.Unit.INSTANCE;
    }
}
