package com.paypal.oslo.feature.inappcheckout.data.serializer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/serializer/PreAuthRequiredContingencyDTOSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/PreAuthRequiredContingencyDTO;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/inappcheckout/data/dto/PreAuthRequiredContingencyDTO;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/inappcheckout/data/dto/PreAuthRequiredContingencyDTO;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreAuthRequiredContingencyDTOSerializer implements kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO> {
    public static final com.paypal.oslo.feature.inappcheckout.data.serializer.PreAuthRequiredContingencyDTOSerializer INSTANCE = new com.paypal.oslo.feature.inappcheckout.data.serializer.PreAuthRequiredContingencyDTOSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor$default("PreAuthRequiredContingencyDTO", new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 4, null);
    public static final int $stable = 8;

    private PreAuthRequiredContingencyDTOSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO value) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (!(encoder instanceof kotlinx.serialization.json.JsonEncoder)) {
            throw new java.lang.IllegalArgumentException("This serializer can only be used with Json format".toString());
        }
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO name2 = value.getName();
        if (name2 == null || (str = name2.name()) == null) {
            str = "PRE_AUTH_REQUIRED";
        }
        createMapBuilder.put("name", str);
        java.lang.String authorizationAmount = value.getAuthorizationAmount();
        if (authorizationAmount != null) {
        }
        java.lang.String fundingInstrument = value.getFundingInstrument();
        if (fundingInstrument != null) {
        }
        java.lang.String currencyCode = value.getCurrencyCode();
        if (currencyCode != null) {
        }
        java.lang.String originApi = value.getOriginApi();
        if (originApi != null) {
        }
        java.lang.String typename = value.getTypename();
        if (typename != null) {
            createMapBuilder.put("__typename", typename);
        }
        java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
        kotlinx.serialization.json.JsonEncoder jsonEncoder = (kotlinx.serialization.json.JsonEncoder) encoder;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(build.size()));
        for (java.util.Map.Entry entry : build.entrySet()) {
            linkedHashMap.put(entry.getKey(), kotlinx.serialization.json.JsonElementKt.JsonPrimitive((java.lang.String) entry.getValue()));
        }
        jsonEncoder.encodeJsonElement(new kotlinx.serialization.json.JsonObject(linkedHashMap));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a7  */
    @Override // kotlinx.serialization.DeserializationStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonElement jsonElement2;
        java.lang.String str3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonElement jsonElement3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive5;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive6;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive7;
        kotlinx.serialization.json.JsonElement jsonElement4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive8;
        kotlinx.serialization.json.JsonElement jsonElement5;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        if (!(decoder instanceof kotlinx.serialization.json.JsonDecoder)) {
            throw new java.lang.IllegalArgumentException("This serializer can only be used with Json format".toString());
        }
        kotlinx.serialization.json.JsonObject jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(((kotlinx.serialization.json.JsonDecoder) decoder).decodeJsonElement());
        kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "authorizedAmount");
        java.lang.String str4 = null;
        kotlinx.serialization.json.JsonObject jsonObject2 = jsonElement6 != null ? kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement6) : null;
        java.lang.String content2 = (jsonObject2 == null || (jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE)) == null || (jsonPrimitive9 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) == null) ? null : jsonPrimitive9.getContent();
        java.lang.String content3 = (jsonObject2 == null || (jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "currencyCode")) == null || (jsonPrimitive8 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) == null) ? null : jsonPrimitive8.getContent();
        if (content2 == null) {
            kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "authorizationAmount");
            if (jsonElement7 == null || (jsonPrimitive7 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement7)) == null) {
                str = null;
                if (content3 == null) {
                    kotlinx.serialization.json.JsonElement jsonElement8 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "currencyCode");
                    if (jsonElement8 == null || (jsonPrimitive6 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement8)) == null) {
                        str2 = null;
                        jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "fundingInstrument");
                        if (jsonElement != null || (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null || (content = jsonPrimitive5.getContent()) == null) {
                            jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "id");
                            if (jsonElement2 != null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null) {
                                str3 = null;
                                kotlinx.serialization.json.JsonElement jsonElement9 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "originApi");
                                java.lang.String content4 = (jsonElement9 != null || (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement9)) == null) ? null : jsonPrimitive4.getContent();
                                kotlinx.serialization.json.JsonElement jsonElement10 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "__typename");
                                java.lang.String content5 = (jsonElement10 != null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement10)) == null) ? null : jsonPrimitive3.getContent();
                                jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "name");
                                if (jsonElement3 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) != null) {
                                    str4 = jsonPrimitive2.getContent();
                                }
                                return new com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO((kotlin.jvm.internal.Intrinsics.areEqual(str4, "PRE_AUTH_REQUIRED") && kotlin.jvm.internal.Intrinsics.areEqual(str4, "PRE_AUTHORIZATION_REQUIRED")) ? com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.PRE_AUTHORIZATION_REQUIRED : com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.PRE_AUTH_REQUIRED, str, str3, str2, content4, content5);
                            }
                            content = jsonPrimitive.getContent();
                        }
                        str3 = content;
                        kotlinx.serialization.json.JsonElement jsonElement92 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "originApi");
                        if (jsonElement92 != null) {
                        }
                        kotlinx.serialization.json.JsonElement jsonElement102 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "__typename");
                        if (jsonElement102 != null) {
                        }
                        jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "name");
                        if (jsonElement3 != null) {
                            str4 = jsonPrimitive2.getContent();
                        }
                        return new com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO((kotlin.jvm.internal.Intrinsics.areEqual(str4, "PRE_AUTH_REQUIRED") && kotlin.jvm.internal.Intrinsics.areEqual(str4, "PRE_AUTHORIZATION_REQUIRED")) ? com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.PRE_AUTHORIZATION_REQUIRED : com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.PRE_AUTH_REQUIRED, str, str3, str2, content4, content5);
                    }
                    content3 = jsonPrimitive6.getContent();
                }
                str2 = content3;
                jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "fundingInstrument");
                if (jsonElement != null) {
                }
                jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "id");
                if (jsonElement2 != null) {
                }
                str3 = null;
                kotlinx.serialization.json.JsonElement jsonElement922 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "originApi");
                if (jsonElement922 != null) {
                }
                kotlinx.serialization.json.JsonElement jsonElement1022 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "__typename");
                if (jsonElement1022 != null) {
                }
                jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "name");
                if (jsonElement3 != null) {
                }
                return new com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO((kotlin.jvm.internal.Intrinsics.areEqual(str4, "PRE_AUTH_REQUIRED") && kotlin.jvm.internal.Intrinsics.areEqual(str4, "PRE_AUTHORIZATION_REQUIRED")) ? com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.PRE_AUTHORIZATION_REQUIRED : com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.PRE_AUTH_REQUIRED, str, str3, str2, content4, content5);
            }
            content2 = jsonPrimitive7.getContent();
        }
        str = content2;
        if (content3 == null) {
        }
        str2 = content3;
        jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "fundingInstrument");
        if (jsonElement != null) {
        }
        jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "id");
        if (jsonElement2 != null) {
        }
        str3 = null;
        kotlinx.serialization.json.JsonElement jsonElement9222 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "originApi");
        if (jsonElement9222 != null) {
        }
        kotlinx.serialization.json.JsonElement jsonElement10222 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "__typename");
        if (jsonElement10222 != null) {
        }
        jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "name");
        if (jsonElement3 != null) {
        }
        return new com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO((kotlin.jvm.internal.Intrinsics.areEqual(str4, "PRE_AUTH_REQUIRED") && kotlin.jvm.internal.Intrinsics.areEqual(str4, "PRE_AUTHORIZATION_REQUIRED")) ? com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.PRE_AUTHORIZATION_REQUIRED : com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.PRE_AUTH_REQUIRED, str, str3, str2, content4, content5);
    }
}
