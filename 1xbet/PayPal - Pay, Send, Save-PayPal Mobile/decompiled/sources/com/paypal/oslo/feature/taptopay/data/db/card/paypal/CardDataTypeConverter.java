package com.paypal.oslo.feature.taptopay.data.db.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardDataTypeConverter;", "", "<init>", "()V", "", "", "map", "fromMap", "(Ljava/util/Map;)Ljava/lang/String;", "jsonString", "toMap", "(Ljava/lang/String;)Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDataTypeConverter {
    public static final int $stable = 0;

    public final java.lang.String fromMap(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map != null) {
            return com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt.getJson().encodeToString(kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE)), map);
        }
        return null;
    }

    public final java.util.Map<java.lang.String, java.lang.String> toMap(java.lang.String jsonString) {
        if (jsonString == null) {
            return null;
        }
        try {
            return (java.util.Map) com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt.getJson().decodeFromString(kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE)), jsonString);
        } catch (kotlinx.serialization.SerializationException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to parse card extras JSON due to serialization error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("method", "toMap")), null, e, 4, null);
            return null;
        } catch (java.lang.IllegalArgumentException e2) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to parse card extras JSON due to illegal argument", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("method", "toMap")), null, e2, 4, null);
            return null;
        }
    }
}
