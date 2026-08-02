package com.paypal.oslo.feature.ads.data.repository.serialization;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/repository/serialization/SmithyJsonAdapter;", "Lcom/paypal/oslo/feature/ads/data/repository/serialization/SmithyJsonSerializer;", "<init>", "()V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/GetDisplayAdsRequest;", "request", "", "serializeRequest", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/GetDisplayAdsRequest;)Ljava/lang/String;", "jsonString", "Lcom/paypal/oslo/feature/ads/data/models/smithy/GetDisplayAdsResponse;", "deserializeResponse", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/models/smithy/GetDisplayAdsResponse;", "Lkotlinx/serialization/json/Json;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SmithyJsonAdapter implements com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonSerializer {
    public static final com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter INSTANCE = new com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter();
    private static final kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.$r8$lambda$q4H2OgsBkcadh8hv32pOXgwZPBY((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);
    public static final int $stable = 8;

    private SmithyJsonAdapter() {
    }

    @Override // com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonSerializer
    public final com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse deserializeResponse(java.lang.String jsonString) {
        final kotlinx.serialization.json.JsonObject jsonObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
        try {
            kotlinx.serialization.json.JsonElement parseToJsonElement = getHighResolutionOutputSizeshNQ4ISI.parseToJsonElement(jsonString);
            if (parseToJsonElement instanceof kotlinx.serialization.json.JsonObject) {
                jsonObject = (kotlinx.serialization.json.JsonObject) parseToJsonElement;
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(parseToJsonElement, kotlinx.serialization.json.JsonNull.INSTANCE)) {
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(parseToJsonElement.getClass()).getSimpleName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected JSON object but got ");
                    sb.append(simpleName);
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                jsonObject = new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.emptyMap());
            }
            return com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.m11974$r8$lambda$ARBeu2jl13B0QZmm0ktyoRjPbs(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse.Builder) obj);
                }
            });
        } catch (kotlinx.serialization.SerializationException e) {
            throw new java.lang.IllegalStateException("Failed to deserialize GetDisplayAdsResponse from JSON", e);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9YEdTgWseDTppT2ODTAvYAGFvQY(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonObject jsonObject2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("image");
        if (jsonElement != null && (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) != null) {
            builder.setImage(com.paypal.oslo.feature.ads.data.models.smithy.Image.INSTANCE.invoke(new com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda0(jsonObject2)));
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("rawClickUrl");
        if (jsonElement2 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) != null && (content2 = jsonPrimitive2.getContent()) != null) {
            builder.setRawClickUrl(content2);
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get("templateName");
        if (jsonElement3 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) != null && (content = jsonPrimitive.getContent()) != null) {
            builder.setTemplateName(com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.INSTANCE.fromValue(content));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ARBeu2jl13B0QZmm0ktyoRjPb-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11974$r8$lambda$ARBeu2jl13B0QZmm0ktyoRjPbs(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse.Builder builder) {
        kotlinx.serialization.json.JsonObject jsonObject2;
        java.util.ArrayList emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("ads");
        if (jsonElement == null || (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) == null) {
            jsonObject2 = new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.emptyMap());
        }
        kotlinx.serialization.json.JsonObject jsonObject3 = jsonObject2;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(jsonObject3.size()));
        java.util.Iterator<T> it = jsonObject3.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(com.paypal.oslo.feature.ads.data.models.smithy.Placement.INSTANCE.fromValue((java.lang.String) entry.getKey()), entry.getValue());
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.Object obj = (kotlinx.serialization.json.JsonElement) entry2.getValue();
            if (obj instanceof kotlinx.serialization.json.JsonArray) {
                java.lang.Iterable<kotlinx.serialization.json.JsonElement> iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (kotlinx.serialization.json.JsonElement jsonElement2 : iterable) {
                    if (!(jsonElement2 instanceof kotlinx.serialization.json.JsonObject)) {
                        throw new java.lang.IllegalStateException("Expected JSON object for ad but got ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(jsonElement2.getClass()).getSimpleName())).toString());
                    }
                    final kotlinx.serialization.json.JsonObject jsonObject4 = (kotlinx.serialization.json.JsonObject) jsonElement2;
                    arrayList.add(com.paypal.oslo.feature.ads.data.models.smithy.Ad.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.$r8$lambda$xRp_h5T5juhAjbZ3z0S9lPv29dM(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.Ad.Builder) obj2);
                        }
                    }));
                }
                emptyList = arrayList;
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlinx.serialization.json.JsonNull.INSTANCE)) {
                    throw new java.lang.IllegalStateException("Expected JSON array for ads but got ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName())).toString());
                }
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            linkedHashMap2.put(key, emptyList);
        }
        builder.setAds(linkedHashMap2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Iim8YHb6jNmAPGHbM1KGW9rOImE(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.Size.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("height");
        if (jsonElement != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
            builder.setHeight(java.lang.Integer.valueOf(kotlinx.serialization.json.JsonElementKt.getInt(jsonPrimitive2)));
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("width");
        if (jsonElement2 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) != null) {
            builder.setWidth(java.lang.Integer.valueOf(kotlinx.serialization.json.JsonElementKt.getInt(jsonPrimitive)));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Kcqr50Xma8KE5yLdGXId0g_6kd4(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.Tracker.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        java.lang.String content3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        java.lang.String content4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive5;
        java.lang.String content5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("trackerType");
        if (jsonElement == null || (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null || (content5 = jsonPrimitive5.getContent()) == null) {
            kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("type");
            if (jsonElement2 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) != null && (content = jsonPrimitive.getContent()) != null) {
                builder.setTrackerType(com.paypal.oslo.feature.ads.data.models.smithy.TrackerType.INSTANCE.fromValue(content));
            }
        } else {
            builder.setTrackerType(com.paypal.oslo.feature.ads.data.models.smithy.TrackerType.INSTANCE.fromValue(content5));
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        if (jsonElement3 == null || (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) == null || (content4 = jsonPrimitive4.getContent()) == null) {
            kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get("url");
            if (jsonElement4 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) != null && (content2 = jsonPrimitive2.getContent()) != null) {
                builder.setValue(content2);
            }
        } else {
            builder.setValue(content4);
        }
        kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get("vendor");
        if (jsonElement5 != null && (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) != null && (content3 = jsonPrimitive3.getContent()) != null) {
            builder.setVendor(com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.INSTANCE.fromValue(content3));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QD1vsWkz8tfvFs1JL9diEOs0eUI(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        java.lang.String content3;
        final kotlinx.serialization.json.JsonObject jsonObject2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        java.lang.String content4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("altText");
        if (jsonElement != null && (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null && (content4 = jsonPrimitive4.getContent()) != null) {
            builder.setAltText(content4);
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get(io.ktor.http.ContentDisposition.Parameters.Size);
        if (jsonElement2 != null && (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)) != null) {
            builder.setSize(com.paypal.oslo.feature.ads.data.models.smithy.Size.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.$r8$lambda$Iim8YHb6jNmAPGHbM1KGW9rOImE(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.Size.Builder) obj);
                }
            }));
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get("urlX1");
        if (jsonElement3 != null && (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) != null && (content3 = jsonPrimitive3.getContent()) != null) {
            builder.setUrlX1(content3);
        }
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get("urlX2");
        if (jsonElement4 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) != null && (content2 = jsonPrimitive2.getContent()) != null) {
            builder.setUrlX2(content2);
        }
        kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get("urlX3");
        if (jsonElement5 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) != null && (content = jsonPrimitive.getContent()) != null) {
            builder.setUrlX3(content);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TuCC6q_wwvaAhqqZKQjKihhgLXg(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        java.lang.String content3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        java.lang.String content4;
        kotlinx.serialization.json.JsonObject jsonObject2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive5;
        java.lang.String content5;
        final kotlinx.serialization.json.JsonObject jsonObject3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive6;
        java.lang.String content6;
        final kotlinx.serialization.json.JsonObject jsonObject4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive7;
        java.lang.String content7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("bgPrimaryColor");
        if (jsonElement != null && (jsonPrimitive7 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null && (content7 = jsonPrimitive7.getContent()) != null) {
            builder.setBgPrimaryColor(content7);
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("brand");
        if (jsonElement2 != null && (jsonObject4 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)) != null) {
            builder.setBrand(com.paypal.oslo.feature.ads.data.models.smithy.Brand.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.m11976$r8$lambda$vNenpA3PjZ4WMbodGg5M3cmyZc(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder) obj);
                }
            }));
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get("ctaText");
        if (jsonElement3 != null && (jsonPrimitive6 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) != null && (content6 = jsonPrimitive6.getContent()) != null) {
            builder.setCtaText(content6);
        }
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.DISCLAIMER);
        if (jsonElement4 != null && (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement4)) != null) {
            builder.setDisclaimer(com.paypal.oslo.feature.ads.data.models.smithy.Disclaimer.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.$r8$lambda$Uympb3pv7O86TPXB63WntFRMRkA(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.Disclaimer.Builder) obj);
                }
            }));
        }
        kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get("headline");
        if (jsonElement5 != null && (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) != null && (content5 = jsonPrimitive5.getContent()) != null) {
            builder.setHeadline(content5);
        }
        kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject.get("image");
        if (jsonElement6 != null && (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement6)) != null) {
            builder.setImage(com.paypal.oslo.feature.ads.data.models.smithy.Image.INSTANCE.invoke(new com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda0(jsonObject2)));
        }
        kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) jsonObject.get("rawClickUrl");
        if (jsonElement7 != null && (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement7)) != null && (content4 = jsonPrimitive4.getContent()) != null) {
            builder.setRawClickUrl(content4);
        }
        kotlinx.serialization.json.JsonElement jsonElement8 = (kotlinx.serialization.json.JsonElement) jsonObject.get("subline");
        if (jsonElement8 != null && (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement8)) != null && (content3 = jsonPrimitive3.getContent()) != null) {
            builder.setSubline(content3);
        }
        kotlinx.serialization.json.JsonElement jsonElement9 = (kotlinx.serialization.json.JsonElement) jsonObject.get("templateName");
        if (jsonElement9 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement9)) != null && (content2 = jsonPrimitive2.getContent()) != null) {
            builder.setTemplateName(com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.INSTANCE.fromValue(content2));
        }
        kotlinx.serialization.json.JsonElement jsonElement10 = (kotlinx.serialization.json.JsonElement) jsonObject.get(com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME);
        if (jsonElement10 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement10)) != null && (content = jsonPrimitive.getContent()) != null) {
            builder.setTheme(com.paypal.oslo.feature.ads.data.models.smithy.Theme.INSTANCE.fromValue(content));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Uympb3pv7O86TPXB63WntFRMRkA(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.Disclaimer.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        java.lang.String content3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("text");
        if (jsonElement != null && (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null && (content3 = jsonPrimitive3.getContent()) != null) {
            builder.setText(content3);
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("linkText");
        if (jsonElement2 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) != null && (content2 = jsonPrimitive2.getContent()) != null) {
            builder.setLinkText(content2);
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get("url");
        if (jsonElement3 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) != null && (content = jsonPrimitive.getContent()) != null) {
            builder.setUrl(content);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YR4j4G676U25H6hobSoNA7tbRv8(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.Cta.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        java.lang.String content3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("altText");
        if (jsonElement != null && (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null && (content3 = jsonPrimitive3.getContent()) != null) {
            builder.setAltText(content3);
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("clickThroughUrl");
        if (jsonElement2 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) != null && (content2 = jsonPrimitive2.getContent()) != null) {
            builder.setClickThroughUrl(content2);
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get("text");
        if (jsonElement3 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) != null && (content = jsonPrimitive.getContent()) != null) {
            builder.setText(content);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q4H2OgsBkcadh8hv32pOXgwZPBY(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setEncodeDefaults(false);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tiF71iqYE4l-RcHOwjC6BmTjfjo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11975$r8$lambda$tiF71iqYE4lRcHOwjC6BmTjfjo(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        java.lang.String content3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        java.lang.String content4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive5;
        java.lang.String content5;
        kotlinx.serialization.json.JsonObject jsonObject2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("image");
        if (jsonElement != null && (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) != null) {
            builder.setImage(com.paypal.oslo.feature.ads.data.models.smithy.Image.INSTANCE.invoke(new com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda0(jsonObject2)));
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("advertiserName");
        if (jsonElement2 != null && (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) != null && (content5 = jsonPrimitive5.getContent()) != null) {
            builder.setAdvertiserName(content5);
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get("impressionStrategy");
        if (jsonElement3 != null && (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) != null && (content4 = jsonPrimitive4.getContent()) != null) {
            builder.setImpressionStrategy(content4);
        }
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get("rawClickUrl");
        if (jsonElement4 != null && (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) != null && (content3 = jsonPrimitive3.getContent()) != null) {
            builder.setRawClickUrl(content3);
        }
        kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get("renderingTemplate");
        if (jsonElement5 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) != null && (content2 = jsonPrimitive2.getContent()) != null) {
            builder.setRenderingTemplate(content2);
        }
        kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject.get("templateName");
        if (jsonElement6 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement6)) != null && (content = jsonPrimitive.getContent()) != null) {
            builder.setTemplateName(com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.INSTANCE.fromValue(content));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vNenpA3PjZ4WMbodGg5M3-cmyZc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11976$r8$lambda$vNenpA3PjZ4WMbodGg5M3cmyZc(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        java.lang.String content3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        java.lang.String content4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("name");
        if (jsonElement != null && (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null && (content4 = jsonPrimitive4.getContent()) != null) {
            builder.setName(content4);
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("urlX1");
        if (jsonElement2 != null && (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) != null && (content3 = jsonPrimitive3.getContent()) != null) {
            builder.setUrlX1(content3);
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get("urlX2");
        if (jsonElement3 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) != null && (content2 = jsonPrimitive2.getContent()) != null) {
            builder.setUrlX2(content2);
        }
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get("urlX3");
        if (jsonElement4 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) != null && (content = jsonPrimitive.getContent()) != null) {
            builder.setUrlX3(content);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xRp_h5T5juhAjbZ3z0S9lPv29dM(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.Ad.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        java.lang.String content3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        java.lang.String content4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive5;
        java.lang.String content5;
        com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.SdkUnknown sdkUnknown;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("response");
        if (jsonElement != null) {
            if (jsonElement instanceof kotlinx.serialization.json.JsonNull) {
                jsonElement = null;
            }
            if (jsonElement != null) {
                kotlinx.serialization.json.JsonObject jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement);
                kotlinx.serialization.json.JsonObject jsonObject3 = jsonObject2;
                if (jsonObject3.containsKey((java.lang.Object) "imageAd")) {
                    java.lang.Object obj = jsonObject2.get((java.lang.Object) "imageAd");
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    final kotlinx.serialization.json.JsonObject jsonObject4 = kotlinx.serialization.json.JsonElementKt.getJsonObject((kotlinx.serialization.json.JsonElement) obj);
                    sdkUnknown = new com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd(com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.$r8$lambda$9YEdTgWseDTppT2ODTAvYAGFvQY(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder) obj2);
                        }
                    }));
                } else if (jsonObject3.containsKey((java.lang.Object) "nativeTextAndImageAd")) {
                    java.lang.Object obj2 = jsonObject2.get((java.lang.Object) "nativeTextAndImageAd");
                    if (obj2 == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    final kotlinx.serialization.json.JsonObject jsonObject5 = kotlinx.serialization.json.JsonElementKt.getJsonObject((kotlinx.serialization.json.JsonElement) obj2);
                    sdkUnknown = new com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd(com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.m11977$r8$lambda$y1ID9p4eWyF2KRbnMlpixvvErM(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse.Builder) obj3);
                        }
                    }));
                } else if (jsonObject3.containsKey((java.lang.Object) "nativeImageAd")) {
                    java.lang.Object obj3 = jsonObject2.get((java.lang.Object) "nativeImageAd");
                    if (obj3 == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    final kotlinx.serialization.json.JsonObject jsonObject6 = kotlinx.serialization.json.JsonElementKt.getJsonObject((kotlinx.serialization.json.JsonElement) obj3);
                    sdkUnknown = new com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd(com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.m11975$r8$lambda$tiF71iqYE4lRcHOwjC6BmTjfjo(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse.Builder) obj4);
                        }
                    }));
                } else if (jsonObject3.containsKey((java.lang.Object) "paypalShopAd")) {
                    java.lang.Object obj4 = jsonObject2.get((java.lang.Object) "paypalShopAd");
                    if (obj4 == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    final kotlinx.serialization.json.JsonObject jsonObject7 = kotlinx.serialization.json.JsonElementKt.getJsonObject((kotlinx.serialization.json.JsonElement) obj4);
                    sdkUnknown = new com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd(com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj5) {
                            return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.$r8$lambda$TuCC6q_wwvaAhqqZKQjKihhgLXg(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse.Builder) obj5);
                        }
                    }));
                } else {
                    sdkUnknown = com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.SdkUnknown.INSTANCE;
                }
                builder.setResponse(sdkUnknown);
            }
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("clickTrackingUrls");
        if (jsonElement2 != null) {
            if (jsonElement2 instanceof kotlinx.serialization.json.JsonNull) {
                jsonElement2 = null;
            }
            if (jsonElement2 != null) {
                kotlinx.serialization.json.JsonArray jsonArray = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement2);
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
                java.util.Iterator<kotlinx.serialization.json.JsonElement> it = jsonArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(it.next()).getContent());
                }
                builder.setClickTrackingUrls(arrayList);
            }
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get("clickUrls");
        if (jsonElement3 != null) {
            if (jsonElement3 instanceof kotlinx.serialization.json.JsonNull) {
                jsonElement3 = null;
            }
            if (jsonElement3 != null) {
                kotlinx.serialization.json.JsonArray jsonArray2 = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement3);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray2, 10));
                java.util.Iterator<kotlinx.serialization.json.JsonElement> it2 = jsonArray2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(it2.next()).getContent());
                }
                builder.setClickUrls(arrayList2);
            }
        }
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get("impressionUrls");
        if (jsonElement4 != null) {
            if (jsonElement4 instanceof kotlinx.serialization.json.JsonNull) {
                jsonElement4 = null;
            }
            if (jsonElement4 != null) {
                kotlinx.serialization.json.JsonArray jsonArray3 = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement4);
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray3, 10));
                java.util.Iterator<kotlinx.serialization.json.JsonElement> it3 = jsonArray3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(it3.next()).getContent());
                }
                builder.setImpressionUrls(arrayList3);
            }
        }
        kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get("thirdPartyClickTrackers");
        if (jsonElement5 != null) {
            if (jsonElement5 instanceof kotlinx.serialization.json.JsonNull) {
                jsonElement5 = null;
            }
            if (jsonElement5 != null) {
                kotlinx.serialization.json.JsonArray jsonArray4 = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement5);
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray4, 10));
                java.util.Iterator<kotlinx.serialization.json.JsonElement> it4 = jsonArray4.iterator();
                while (it4.hasNext()) {
                    final kotlinx.serialization.json.JsonObject jsonObject8 = kotlinx.serialization.json.JsonElementKt.getJsonObject(it4.next());
                    arrayList4.add(com.paypal.oslo.feature.ads.data.models.smithy.Tracker.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj5) {
                            return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.$r8$lambda$Kcqr50Xma8KE5yLdGXId0g_6kd4(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.Tracker.Builder) obj5);
                        }
                    }));
                }
                builder.setThirdPartyClickTrackers(arrayList4);
            }
        }
        kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject.get("thirdPartyImpressionTrackers");
        if (jsonElement6 != null) {
            kotlinx.serialization.json.JsonElement jsonElement7 = jsonElement6 instanceof kotlinx.serialization.json.JsonNull ? null : jsonElement6;
            if (jsonElement7 != null) {
                kotlinx.serialization.json.JsonArray jsonArray5 = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement7);
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray5, 10));
                java.util.Iterator<kotlinx.serialization.json.JsonElement> it5 = jsonArray5.iterator();
                while (it5.hasNext()) {
                    final kotlinx.serialization.json.JsonObject jsonObject9 = kotlinx.serialization.json.JsonElementKt.getJsonObject(it5.next());
                    arrayList5.add(com.paypal.oslo.feature.ads.data.models.smithy.Tracker.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj5) {
                            return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.$r8$lambda$Kcqr50Xma8KE5yLdGXId0g_6kd4(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.Tracker.Builder) obj5);
                        }
                    }));
                }
                builder.setThirdPartyImpressionTrackers(arrayList5);
            }
        }
        kotlinx.serialization.json.JsonElement jsonElement8 = (kotlinx.serialization.json.JsonElement) jsonObject.get("creativeId");
        if (jsonElement8 != null && (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement8)) != null && (content5 = jsonPrimitive5.getContent()) != null) {
            builder.setCreativeId(content5);
        }
        kotlinx.serialization.json.JsonElement jsonElement9 = (kotlinx.serialization.json.JsonElement) jsonObject.get("flightId");
        if (jsonElement9 != null && (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement9)) != null && (content4 = jsonPrimitive4.getContent()) != null) {
            builder.setFlightId(content4);
        }
        kotlinx.serialization.json.JsonElement jsonElement10 = (kotlinx.serialization.json.JsonElement) jsonObject.get("campaignId");
        if (jsonElement10 != null && (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement10)) != null && (content3 = jsonPrimitive3.getContent()) != null) {
            builder.setCampaignId(content3);
        }
        kotlinx.serialization.json.JsonElement jsonElement11 = (kotlinx.serialization.json.JsonElement) jsonObject.get("advertiserId");
        if (jsonElement11 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement11)) != null && (content2 = jsonPrimitive2.getContent()) != null) {
            builder.setAdvertiserId(content2);
        }
        kotlinx.serialization.json.JsonElement jsonElement12 = (kotlinx.serialization.json.JsonElement) jsonObject.get("storeId");
        if (jsonElement12 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement12)) != null && (content = jsonPrimitive.getContent()) != null) {
            builder.setStoreId(content);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$y1ID9-p4eWyF2KRbnMlpixvvErM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11977$r8$lambda$y1ID9p4eWyF2KRbnMlpixvvErM(kotlinx.serialization.json.JsonObject jsonObject, com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse.Builder builder) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        java.lang.String content3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        java.lang.String content4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive5;
        java.lang.String content5;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive6;
        java.lang.String content6;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive7;
        java.lang.String content7;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive8;
        java.lang.String content8;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive9;
        java.lang.String content9;
        kotlinx.serialization.json.JsonObject jsonObject2;
        final kotlinx.serialization.json.JsonObject jsonObject3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("cta");
        if (jsonElement != null && (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) != null) {
            builder.setCta(com.paypal.oslo.feature.ads.data.models.smithy.Cta.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.$r8$lambda$YR4j4G676U25H6hobSoNA7tbRv8(kotlinx.serialization.json.JsonObject.this, (com.paypal.oslo.feature.ads.data.models.smithy.Cta.Builder) obj);
                }
            }));
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("image");
        if (jsonElement2 != null && (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)) != null) {
            builder.setImage(com.paypal.oslo.feature.ads.data.models.smithy.Image.INSTANCE.invoke(new com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter$$ExternalSyntheticLambda0(jsonObject2)));
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get("advertiserLogoImageUrl");
        if (jsonElement3 != null && (jsonPrimitive9 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) != null && (content9 = jsonPrimitive9.getContent()) != null) {
            builder.setAdvertiserLogoImageUrl(content9);
        }
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get("advertiserName");
        if (jsonElement4 != null && (jsonPrimitive8 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) != null && (content8 = jsonPrimitive8.getContent()) != null) {
            builder.setAdvertiserName(content8);
        }
        kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get("impressionStrategy");
        if (jsonElement5 != null && (jsonPrimitive7 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) != null && (content7 = jsonPrimitive7.getContent()) != null) {
            builder.setImpressionStrategy(content7);
        }
        kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject.get("rawClickUrl");
        if (jsonElement6 != null && (jsonPrimitive6 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement6)) != null && (content6 = jsonPrimitive6.getContent()) != null) {
            builder.setRawClickUrl(content6);
        }
        kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) jsonObject.get("renderingTemplate");
        if (jsonElement7 != null && (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement7)) != null && (content5 = jsonPrimitive5.getContent()) != null) {
            builder.setRenderingTemplate(content5);
        }
        kotlinx.serialization.json.JsonElement jsonElement8 = (kotlinx.serialization.json.JsonElement) jsonObject.get("subtitle");
        if (jsonElement8 != null && (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement8)) != null && (content4 = jsonPrimitive4.getContent()) != null) {
            builder.setSubtitle(content4);
        }
        kotlinx.serialization.json.JsonElement jsonElement9 = (kotlinx.serialization.json.JsonElement) jsonObject.get("templateName");
        if (jsonElement9 != null && (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement9)) != null && (content3 = jsonPrimitive3.getContent()) != null) {
            builder.setTemplateName(com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.INSTANCE.fromValue(content3));
        }
        kotlinx.serialization.json.JsonElement jsonElement10 = (kotlinx.serialization.json.JsonElement) jsonObject.get(com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME);
        if (jsonElement10 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement10)) != null && (content2 = jsonPrimitive2.getContent()) != null) {
            builder.setTheme(com.paypal.oslo.feature.ads.data.models.smithy.Theme.INSTANCE.fromValue(content2));
        }
        kotlinx.serialization.json.JsonElement jsonElement11 = (kotlinx.serialization.json.JsonElement) jsonObject.get("title");
        if (jsonElement11 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement11)) != null && (content = jsonPrimitive.getContent()) != null) {
            builder.setTitle(content);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonSerializer
    public final java.lang.String serializeRequest(com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest request) {
        kotlinx.serialization.json.JsonObject jsonObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String clientIp = request.getClientIp();
        if (clientIp != null) {
            linkedHashMap.put("clientIp", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(clientIp));
        }
        java.lang.String clientIpOverride = request.getClientIpOverride();
        if (clientIpOverride != null) {
            linkedHashMap.put("clientIpOverride", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(clientIpOverride));
        }
        java.lang.String correlationId = request.getCorrelationId();
        if (correlationId != null) {
            linkedHashMap.put("correlationId", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(correlationId));
        }
        linkedHashMap.put(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(request.getCountry().getValue()));
        com.paypal.oslo.feature.ads.data.models.smithy.DeviceAttributes deviceAttributes = request.getDeviceAttributes();
        if (deviceAttributes != null) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(deviceAttributes.getPlatform().getValue()));
            java.lang.String appVersion = deviceAttributes.getAppVersion();
            if (appVersion != null) {
                linkedHashMap2.put("appVersion", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(appVersion));
            }
            linkedHashMap.put("deviceAttributes", new kotlinx.serialization.json.JsonObject(linkedHashMap2));
        }
        java.lang.Boolean gdprConsent = request.getGdprConsent();
        if (gdprConsent != null) {
            linkedHashMap.put("gdprConsent", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Boolean.valueOf(gdprConsent.booleanValue())));
        }
        linkedHashMap.put("gdprConsentRequired", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Boolean.valueOf(request.getGdprConsentRequired())));
        if (request.getIsLoadTest()) {
            linkedHashMap.put("isLoadTest", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Boolean.TRUE));
        }
        if (request.getIsTest()) {
            linkedHashMap.put("isTest", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Boolean.TRUE));
        }
        linkedHashMap.put("page", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(request.getPage().getValue()));
        java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.Placement> placements = request.getPlacements();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(placements, 10));
        java.util.Iterator<T> it = placements.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.serialization.json.JsonElementKt.JsonPrimitive(((com.paypal.oslo.feature.ads.data.models.smithy.Placement) it.next()).getValue()));
        }
        linkedHashMap.put("placements", new kotlinx.serialization.json.JsonArray(arrayList));
        linkedHashMap.put("publisher", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(request.getPublisher().getValue()));
        java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.AdFormat> supportedAdFormats = request.getSupportedAdFormats();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedAdFormats, 10));
        java.util.Iterator<T> it2 = supportedAdFormats.iterator();
        while (it2.hasNext()) {
            arrayList2.add(kotlinx.serialization.json.JsonElementKt.JsonPrimitive(((com.paypal.oslo.feature.ads.data.models.smithy.AdFormat) it2.next()).getValue()));
        }
        linkedHashMap.put("supportedAdFormats", new kotlinx.serialization.json.JsonArray(arrayList2));
        com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier userIdentifier = request.getUserIdentifier();
        if (userIdentifier != null) {
            if (userIdentifier instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal) {
                jsonObject = new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypal", new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hashedAccountId", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal) userIdentifier).getValue().getHashedAccountId())))))));
            } else if (userIdentifier instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId) {
                jsonObject = new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalPayerId", new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("payerId", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId) userIdentifier).getValue().getPayerId())))))));
            } else if (userIdentifier instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb) {
                com.paypal.oslo.feature.ads.data.models.smithy.SmbIdentifier value = ((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb) userIdentifier).getValue();
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                java.lang.String hashedEmail = value.getHashedEmail();
                if (hashedEmail != null) {
                    linkedHashMap3.put("hashedEmail", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(hashedEmail));
                }
                java.lang.String partnerId = value.getPartnerId();
                if (partnerId != null) {
                    linkedHashMap3.put("partnerId", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(partnerId));
                }
                java.lang.String publisherId = value.getPublisherId();
                if (publisherId != null) {
                    linkedHashMap3.put("publisherId", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(publisherId));
                }
                jsonObject = new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("smb", new kotlinx.serialization.json.JsonObject(linkedHashMap3))));
            } else if (userIdentifier instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo) {
                jsonObject = new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("venmo", new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("profileId", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo) userIdentifier).getValue().getProfileId())))))));
            } else {
                if (!(userIdentifier instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.SdkUnknown)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                jsonObject = new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("unknown", kotlinx.serialization.json.JsonElementKt.JsonPrimitive("SdkUnknown"))));
            }
            linkedHashMap.put("userIdentifier", jsonObject);
        }
        return getHighResolutionOutputSizeshNQ4ISI.encodeToString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), new kotlinx.serialization.json.JsonObject(linkedHashMap));
    }
}
