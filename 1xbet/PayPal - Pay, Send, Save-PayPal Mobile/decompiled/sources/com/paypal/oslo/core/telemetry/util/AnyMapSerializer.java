package com.paypal.oslo.core.telemetry.util;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/telemetry/util/AnyMapSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/core/telemetry/util/AnyMap;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnyMapSerializer implements kotlinx.serialization.KSerializer<com.paypal.oslo.core.telemetry.util.AnyMap> {
    public static final com.paypal.oslo.core.telemetry.util.AnyMapSerializer INSTANCE = new com.paypal.oslo.core.telemetry.util.AnyMapSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), kotlinx.serialization.json.JsonElement.INSTANCE.serializer()).getDescriptor();
    public static final int $stable = 8;

    private AnyMapSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.core.telemetry.util.AnyMap value) {
        kotlinx.serialization.json.JsonPrimitive JsonPrimitive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.Map<java.lang.String, java.lang.Object> value2 = value.getValue();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(value2.size()));
        java.util.Iterator<T> it = value2.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value3 = entry.getValue();
            if (value3 instanceof java.lang.String) {
                JsonPrimitive = kotlinx.serialization.json.JsonElementKt.JsonPrimitive((java.lang.String) value3);
            } else if (value3 instanceof java.lang.Number) {
                JsonPrimitive = kotlinx.serialization.json.JsonElementKt.JsonPrimitive((java.lang.Number) value3);
            } else {
                JsonPrimitive = value3 instanceof java.lang.Boolean ? kotlinx.serialization.json.JsonElementKt.JsonPrimitive((java.lang.Boolean) value3) : kotlinx.serialization.json.JsonElementKt.JsonPrimitive(value3.toString());
            }
            linkedHashMap.put(key, JsonPrimitive);
        }
        encoder.encodeSerializableValue(kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), kotlinx.serialization.json.JsonElement.INSTANCE.serializer()), linkedHashMap);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.core.telemetry.util.AnyMap deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        java.util.Map map = (java.util.Map) decoder.decodeSerializableValue(kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), kotlinx.serialization.json.JsonElement.INSTANCE.serializer()));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object obj = (kotlinx.serialization.json.JsonElement) entry.getValue();
            if (obj instanceof kotlinx.serialization.json.JsonPrimitive) {
                kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) obj;
                if (jsonPrimitive.getIsString()) {
                    obj = jsonPrimitive.getContent();
                } else if (kotlinx.serialization.json.JsonElementKt.getBooleanOrNull(jsonPrimitive) != null) {
                    obj = java.lang.Boolean.valueOf(kotlinx.serialization.json.JsonElementKt.getBoolean(jsonPrimitive));
                } else if (kotlinx.serialization.json.JsonElementKt.getIntOrNull(jsonPrimitive) != null) {
                    obj = java.lang.Integer.valueOf(kotlinx.serialization.json.JsonElementKt.getInt(jsonPrimitive));
                } else {
                    obj = kotlinx.serialization.json.JsonElementKt.getDoubleOrNull(jsonPrimitive) != null ? java.lang.Double.valueOf(kotlinx.serialization.json.JsonElementKt.getDouble(jsonPrimitive)) : jsonPrimitive.getContent();
                }
            } else if (!(obj instanceof kotlinx.serialization.json.JsonObject) && !(obj instanceof kotlinx.serialization.json.JsonArray)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            linkedHashMap.put(key, obj);
        }
        return new com.paypal.oslo.core.telemetry.util.AnyMap(linkedHashMap);
    }
}
