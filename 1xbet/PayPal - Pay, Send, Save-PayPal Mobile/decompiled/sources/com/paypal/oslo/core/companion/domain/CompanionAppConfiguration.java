package com.paypal.oslo.core.companion.domain;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "", "", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "sections", "<init>", "(Ljava/util/List;)V", "Lkotlinx/serialization/json/Json;", "json", "", "toJson", "(Lkotlinx/serialization/json/Json;)Ljava/lang/String;", "p0", "Lkotlinx/serialization/json/JsonObject;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/companion/domain/ConfigSection;)Lkotlinx/serialization/json/JsonObject;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSections", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CompanionAppConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.Companion INSTANCE = new com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.Companion(null);
    private final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public CompanionAppConfiguration(java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.sections = list;
    }

    public /* synthetic */ CompanionAppConfiguration(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> getSections() {
        return this.sections;
    }

    public static /* synthetic */ java.lang.String toJson$default(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration, kotlinx.serialization.json.Json json, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            json = kotlinx.serialization.json.Json.INSTANCE;
        }
        return companionAppConfiguration.toJson(json);
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0015\u001a\u00020\b2\u0019\b\u0001\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration$Companion;", "", "<init>", "()V", "", "jsonString", "Lkotlinx/serialization/json/Json;", "json", "Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "fromJson", "(Ljava/lang/String;Lkotlinx/serialization/json/Json;)Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "Lkotlinx/serialization/json/JsonObject;", "p0", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "Camera2StreamConfigurationMap", "(Lkotlinx/serialization/json/JsonObject;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/companion/domain/CompanionConfigBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "from", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.paypal.oslo.core.companion.domain.CompanionAppConfiguration fromJson$default(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.Companion companion, java.lang.String str, kotlinx.serialization.json.Json json, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                json = kotlinx.serialization.json.Json.INSTANCE;
            }
            return companion.fromJson(str, json);
        }

        public final com.paypal.oslo.core.companion.domain.CompanionAppConfiguration fromJson(java.lang.String jsonString, kotlinx.serialization.json.Json json) {
            java.util.ArrayList arrayList;
            kotlinx.serialization.json.JsonArray jsonArray;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
            kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) kotlinx.serialization.json.JsonElementKt.getJsonObject(json.parseToJsonElement(jsonString)).get((java.lang.Object) "sections");
            if (jsonElement == null || (jsonArray = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement)) == null) {
                arrayList = null;
            } else {
                kotlinx.serialization.json.JsonArray jsonArray2 = jsonArray;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray2, 10));
                for (kotlinx.serialization.json.JsonElement jsonElement2 : jsonArray2) {
                    com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.Companion companion = com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.INSTANCE;
                    arrayList2.add(Camera2StreamConfigurationMap(kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)));
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            return new com.paypal.oslo.core.companion.domain.CompanionAppConfiguration(arrayList);
        }

        private static com.paypal.oslo.core.companion.domain.ConfigSection Camera2StreamConfigurationMap(kotlinx.serialization.json.JsonObject p0) {
            java.lang.String str;
            java.lang.String str2;
            final java.util.ArrayList arrayList;
            final java.util.ArrayList arrayList2;
            kotlinx.serialization.json.JsonArray jsonArray;
            kotlinx.serialization.json.JsonArray jsonArray2;
            com.paypal.oslo.core.companion.domain.FieldType fieldType;
            com.paypal.oslo.core.companion.domain.ConfigField configField;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
            java.lang.Boolean booleanOrNull;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
            java.lang.Boolean booleanOrNull2;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive5;
            java.lang.Integer intOrNull;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive6;
            java.lang.Integer intOrNull2;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive7;
            java.lang.Double doubleOrNull;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive8;
            java.lang.Double doubleOrNull2;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive9;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive10;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive11;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive12;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive13;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive14;
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive15;
            kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) p0.get("id");
            java.lang.String content = (jsonElement == null || (jsonPrimitive15 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive15.getContent();
            if (content == null) {
                content = "";
            }
            kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) p0.get("name");
            if (jsonElement2 == null || (jsonPrimitive14 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (str = jsonPrimitive14.getContent()) == null || kotlin.text.StringsKt.isBlank(str)) {
                str = null;
            }
            kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) p0.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            if (jsonElement3 == null || (jsonPrimitive13 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) == null || (str2 = jsonPrimitive13.getContent()) == null || kotlin.text.StringsKt.isBlank(str2)) {
                str2 = null;
            }
            kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) p0.get("fields");
            if (jsonElement4 == null || (jsonArray2 = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement4)) == null) {
                arrayList = null;
            } else {
                kotlinx.serialization.json.JsonArray jsonArray3 = jsonArray2;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray3, 10));
                for (kotlinx.serialization.json.JsonElement jsonElement5 : jsonArray3) {
                    com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.Companion companion = com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.INSTANCE;
                    kotlinx.serialization.json.JsonObject jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement5);
                    kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "id");
                    java.lang.String content2 = (jsonElement6 == null || (jsonPrimitive12 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement6)) == null) ? null : jsonPrimitive12.getContent();
                    java.lang.String str3 = content2 == null ? "" : content2;
                    kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "name");
                    java.lang.String content3 = (jsonElement7 == null || (jsonPrimitive11 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement7)) == null) ? null : jsonPrimitive11.getContent();
                    java.lang.String str4 = content3 == null ? "" : content3;
                    kotlinx.serialization.json.JsonElement jsonElement8 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
                    java.lang.String content4 = (jsonElement8 == null || (jsonPrimitive10 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement8)) == null) ? null : jsonPrimitive10.getContent();
                    java.lang.String str5 = content4 == null ? "" : content4;
                    kotlinx.serialization.json.JsonElement jsonElement9 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "fieldType");
                    java.lang.String content5 = (jsonElement9 == null || (jsonPrimitive9 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement9)) == null) ? null : jsonPrimitive9.getContent();
                    if (content5 == null || (fieldType = com.paypal.oslo.core.companion.domain.FieldType.valueOf(content5)) == null) {
                        fieldType = com.paypal.oslo.core.companion.domain.FieldType.STRING;
                    }
                    com.paypal.oslo.core.companion.domain.FieldType fieldType2 = fieldType;
                    int i = com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.Companion.WhenMappings.$EnumSwitchMapping$0[fieldType2.ordinal()];
                    if (i != 1) {
                        boolean z = false;
                        r18 = 0;
                        r18 = 0;
                        int i2 = 0;
                        z = false;
                        z = false;
                        if (i == 2) {
                            kotlinx.serialization.json.JsonElement jsonElement10 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                            boolean booleanValue = (jsonElement10 == null || (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement10)) == null || (booleanOrNull2 = kotlinx.serialization.json.JsonElementKt.getBooleanOrNull(jsonPrimitive4)) == null) ? false : booleanOrNull2.booleanValue();
                            kotlinx.serialization.json.JsonElement jsonElement11 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "defaultValue");
                            if (jsonElement11 != null && (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement11)) != null && (booleanOrNull = kotlinx.serialization.json.JsonElementKt.getBooleanOrNull(jsonPrimitive3)) != null) {
                                z = booleanOrNull.booleanValue();
                            }
                            configField = new com.paypal.oslo.core.companion.domain.ConfigField(str3, str4, str5, java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(z), fieldType2);
                        } else if (i == 3) {
                            kotlinx.serialization.json.JsonElement jsonElement12 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                            int intValue = (jsonElement12 == null || (jsonPrimitive6 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement12)) == null || (intOrNull2 = kotlinx.serialization.json.JsonElementKt.getIntOrNull(jsonPrimitive6)) == null) ? 0 : intOrNull2.intValue();
                            kotlinx.serialization.json.JsonElement jsonElement13 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "defaultValue");
                            if (jsonElement13 != null && (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement13)) != null && (intOrNull = kotlinx.serialization.json.JsonElementKt.getIntOrNull(jsonPrimitive5)) != null) {
                                i2 = intOrNull.intValue();
                            }
                            configField = new com.paypal.oslo.core.companion.domain.ConfigField(str3, str4, str5, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i2), fieldType2);
                        } else {
                            if (i != 4) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            kotlinx.serialization.json.JsonElement jsonElement14 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                            double d = 0.0d;
                            double doubleValue = (jsonElement14 == null || (jsonPrimitive8 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement14)) == null || (doubleOrNull2 = kotlinx.serialization.json.JsonElementKt.getDoubleOrNull(jsonPrimitive8)) == null) ? 0.0d : doubleOrNull2.doubleValue();
                            kotlinx.serialization.json.JsonElement jsonElement15 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "defaultValue");
                            if (jsonElement15 != null && (jsonPrimitive7 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement15)) != null && (doubleOrNull = kotlinx.serialization.json.JsonElementKt.getDoubleOrNull(jsonPrimitive7)) != null) {
                                d = doubleOrNull.doubleValue();
                            }
                            configField = new com.paypal.oslo.core.companion.domain.ConfigField(str3, str4, str5, java.lang.Double.valueOf(doubleValue), java.lang.Double.valueOf(d), fieldType2);
                        }
                    } else {
                        kotlinx.serialization.json.JsonElement jsonElement16 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                        java.lang.String contentOrNull = (jsonElement16 == null || (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement16)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive2);
                        java.lang.String str6 = contentOrNull == null ? "" : contentOrNull;
                        kotlinx.serialization.json.JsonElement jsonElement17 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "defaultValue");
                        java.lang.String contentOrNull2 = (jsonElement17 == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement17)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive);
                        configField = new com.paypal.oslo.core.companion.domain.ConfigField(str3, str4, str5, str6, contentOrNull2 == null ? "" : contentOrNull2, fieldType2);
                    }
                    arrayList3.add(configField);
                }
                arrayList = arrayList3;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            kotlinx.serialization.json.JsonElement jsonElement18 = (kotlinx.serialization.json.JsonElement) p0.get("subsections");
            if (jsonElement18 == null || (jsonArray = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement18)) == null) {
                arrayList2 = null;
            } else {
                kotlinx.serialization.json.JsonArray jsonArray4 = jsonArray;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray4, 10));
                for (kotlinx.serialization.json.JsonElement jsonElement19 : jsonArray4) {
                    com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.Companion companion2 = com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.INSTANCE;
                    arrayList4.add(Camera2StreamConfigurationMap(kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement19)));
                }
                arrayList2 = arrayList4;
            }
            if (arrayList2 == null) {
                arrayList2 = kotlin.collections.CollectionsKt.emptyList();
            }
            return com.paypal.oslo.core.companion.domain.CompanionAppDslKt.section(content, str, str2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.companion.domain.CompanionAppConfiguration$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.Companion.$r8$lambda$h8QhjJEKsmw4nsv8nbQwRI4YcGk(arrayList, arrayList2, (com.paypal.oslo.core.companion.domain.ConfigSectionBuilder) obj);
                }
            });
        }

        public final com.paypal.oslo.core.companion.domain.CompanionAppConfiguration from(@com.paypal.oslo.core.companion.domain.CompanionAppDsl kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.companion.domain.CompanionConfigBuilder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.paypal.oslo.core.companion.domain.CompanionConfigBuilder companionConfigBuilder = new com.paypal.oslo.core.companion.domain.CompanionConfigBuilder();
            block.invoke(companionConfigBuilder);
            return companionConfigBuilder.build();
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$h8QhjJEKsmw4nsv8nbQwRI4YcGk(java.util.List list, java.util.List list2, com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSectionBuilder, "");
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                configSectionBuilder.getFields().add((com.paypal.oslo.core.companion.domain.ConfigField) it.next());
            }
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                configSectionBuilder.getSubsections().add((com.paypal.oslo.core.companion.domain.ConfigSection) it2.next());
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.core.companion.domain.FieldType.values().length];
                try {
                    iArr[com.paypal.oslo.core.companion.domain.FieldType.STRING.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.core.companion.domain.FieldType.BOOLEAN.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.core.companion.domain.FieldType.INTEGER.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.paypal.oslo.core.companion.domain.FieldType.DOUBLE.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toJson(kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
        kotlinx.serialization.json.JsonElementBuildersKt.putJsonArray(jsonObjectBuilder, "sections", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.companion.domain.CompanionAppConfiguration$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.$r8$lambda$qOZjwarYDgxLGXoagF45pi_gxHM(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.this, (kotlinx.serialization.json.JsonArrayBuilder) obj);
            }
        });
        return json.encodeToString(kotlinx.serialization.json.JsonElement.INSTANCE.serializer(), jsonObjectBuilder.build());
    }

    private final kotlinx.serialization.json.JsonObject getHighSpeedVideoFpsRanges(final com.paypal.oslo.core.companion.domain.ConfigSection p0) {
        kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "id", p0.getId());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(p0.getClass()).getSimpleName());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "name", p0.getName());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, p0.getDescription());
        kotlinx.serialization.json.JsonElementBuildersKt.putJsonArray(jsonObjectBuilder, "fields", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.companion.domain.CompanionAppConfiguration$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.$r8$lambda$uncyH5wPHlQob29K9sNkYmpnB_M(com.paypal.oslo.core.companion.domain.ConfigSection.this, (kotlinx.serialization.json.JsonArrayBuilder) obj);
            }
        });
        if (!p0.getSubsections().isEmpty()) {
            kotlinx.serialization.json.JsonElementBuildersKt.putJsonArray(jsonObjectBuilder, "subsections", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.companion.domain.CompanionAppConfiguration$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.$r8$lambda$P54UZSD4eKh3sSEj4L69pSZxwy8(com.paypal.oslo.core.companion.domain.ConfigSection.this, this, (kotlinx.serialization.json.JsonArrayBuilder) obj);
                }
            });
        }
        return jsonObjectBuilder.build();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P54UZSD4eKh3sSEj4L69pSZxwy8(com.paypal.oslo.core.companion.domain.ConfigSection configSection, com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration, kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        java.util.Iterator<T> it = configSection.getSubsections().iterator();
        while (it.hasNext()) {
            jsonArrayBuilder.add(companionAppConfiguration.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.companion.domain.ConfigSection) it.next()));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Z7k2-wVOOsGBawrSmpU-D9a9sog, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11234$r8$lambda$Z7k2wVOOsGBawrSmpUD9a9sog(com.paypal.oslo.core.companion.domain.ConfigField configField, kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "id", configField.getId());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "name", configField.getName());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, configField.getDescription());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "fieldType", configField.getFieldType().name());
        int i = com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.WhenMappings.$EnumSwitchMapping$0[configField.getFieldType().ordinal()];
        if (i == 1) {
            java.lang.Object value = configField.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, (java.lang.String) value);
            java.lang.Object defaultValue = configField.getDefaultValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(defaultValue, "");
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "defaultValue", (java.lang.String) defaultValue);
        } else if (i == 2) {
            java.lang.Object value2 = configField.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value2, "");
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, (java.lang.Boolean) value2);
            java.lang.Object defaultValue2 = configField.getDefaultValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(defaultValue2, "");
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "defaultValue", (java.lang.Boolean) defaultValue2);
        } else if (i == 3) {
            java.lang.Object value3 = configField.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value3, "");
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, (java.lang.Integer) value3);
            java.lang.Object defaultValue3 = configField.getDefaultValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(defaultValue3, "");
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "defaultValue", (java.lang.Integer) defaultValue3);
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.Object value4 = configField.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value4, "");
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, (java.lang.Double) value4);
            java.lang.Object defaultValue4 = configField.getDefaultValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(defaultValue4, "");
            kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "defaultValue", (java.lang.Double) defaultValue4);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qOZjwarYDgxLGXoagF45pi_gxHM(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration, kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        java.util.Iterator<T> it = companionAppConfiguration.sections.iterator();
        while (it.hasNext()) {
            jsonArrayBuilder.add(companionAppConfiguration.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.companion.domain.ConfigSection) it.next()));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uncyH5wPHlQob29K9sNkYmpnB_M(com.paypal.oslo.core.companion.domain.ConfigSection configSection, kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        java.util.Iterator<T> it = configSection.getFields().iterator();
        while (it.hasNext()) {
            final com.paypal.oslo.core.companion.domain.ConfigField configField = (com.paypal.oslo.core.companion.domain.ConfigField) it.next();
            kotlinx.serialization.json.JsonElementBuildersKt.addJsonObject(jsonArrayBuilder, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.companion.domain.CompanionAppConfiguration$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.m11234$r8$lambda$Z7k2wVOOsGBawrSmpUD9a9sog(com.paypal.oslo.core.companion.domain.ConfigField.this, (kotlinx.serialization.json.JsonObjectBuilder) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> list = this.sections;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompanionAppConfiguration(sections=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.sections.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.companion.domain.CompanionAppConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.sections, ((com.paypal.oslo.core.companion.domain.CompanionAppConfiguration) other).sections);
    }

    public final com.paypal.oslo.core.companion.domain.CompanionAppConfiguration copy(java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> sections) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
        return new com.paypal.oslo.core.companion.domain.CompanionAppConfiguration(sections);
    }

    public final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> component1() {
        return this.sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.companion.domain.CompanionAppConfiguration copy$default(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = companionAppConfiguration.sections;
        }
        return companionAppConfiguration.copy(list);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.companion.domain.FieldType.values().length];
            try {
                iArr[com.paypal.oslo.core.companion.domain.FieldType.STRING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.companion.domain.FieldType.BOOLEAN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.companion.domain.FieldType.INTEGER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.companion.domain.FieldType.DOUBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompanionAppConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
