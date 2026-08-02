package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardJsonParser;", "", "<init>", "()V", "Lkotlinx/serialization/json/JsonObject;", "addressObj", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/SavedAddressDTO;", "parseAddressDTO", "(Lkotlinx/serialization/json/JsonObject;)Lcom/paypal/oslo/feature/inappcheckout/data/dto/SavedAddressDTO;", "typeObj", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataType;", "parseMetadataType", "(Lkotlinx/serialization/json/JsonObject;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataType;", "p0", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MetadataAttribute;", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlinx/serialization/json/JsonObject;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MetadataAttribute;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockCardJsonParser {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockCardJsonParser() {
    }

    public final com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO parseAddressDTO(kotlinx.serialization.json.JsonObject addressObj) {
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonElement jsonElement2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        kotlinx.serialization.json.JsonElement jsonElement3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        kotlinx.serialization.json.JsonElement jsonElement4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        kotlinx.serialization.json.JsonElement jsonElement5;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive5;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressObj, "");
        kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) addressObj.get("address");
        java.lang.String str = null;
        kotlinx.serialization.json.JsonObject jsonObject = jsonElement6 != null ? kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement6) : null;
        kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) addressObj.get("id");
        java.lang.String content = (jsonElement7 == null || (jsonPrimitive6 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement7)) == null) ? null : jsonPrimitive6.getContent();
        java.lang.String content2 = (jsonObject == null || (jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "addressLine1")) == null || (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) == null) ? null : jsonPrimitive5.getContent();
        java.lang.String content3 = (jsonObject == null || (jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "addressLine2")) == null || (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) == null) ? null : jsonPrimitive4.getContent();
        java.lang.String content4 = (jsonObject == null || (jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "adminArea2")) == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : jsonPrimitive3.getContent();
        java.lang.String content5 = (jsonObject == null || (jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "adminArea1")) == null || (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive2.getContent();
        if (jsonObject != null && (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE)) != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
            str = jsonPrimitive.getContent();
        }
        return new com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO(content, content2, content3, content4, content5, str);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType parseMetadataType(kotlinx.serialization.json.JsonObject typeObj) {
        kotlinx.serialization.json.JsonObject jsonObject;
        kotlinx.serialization.json.JsonArray jsonArray;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        java.lang.String content3;
        kotlinx.serialization.json.JsonArray jsonArray2;
        kotlinx.serialization.json.JsonObject jsonObject2;
        kotlinx.serialization.json.JsonArray jsonArray3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        java.lang.String content4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive5;
        java.lang.String content5;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive6;
        java.lang.String content6;
        kotlinx.serialization.json.JsonArray jsonArray4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive7;
        java.lang.String content7;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive8;
        java.lang.String content8;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive9;
        java.lang.String content9;
        kotlinx.serialization.json.JsonArray jsonArray5;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive10;
        java.lang.String content10;
        kotlinx.serialization.json.JsonObject jsonObject3;
        kotlinx.serialization.json.JsonObject jsonObject4;
        kotlinx.serialization.json.JsonObject jsonObject5;
        kotlinx.serialization.json.JsonObject jsonObject6;
        kotlinx.serialization.json.JsonObject jsonObject7;
        kotlinx.serialization.json.JsonObject jsonObject8;
        kotlinx.serialization.json.JsonObject jsonObject9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeObj, "");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) typeObj.get("instrumentType");
        if (jsonElement == null || (jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) == null) {
            throw new java.lang.IllegalStateException("Missing required field: instrumentType".toString());
        }
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) typeObj.get("financialInstrumentMetadataActionList");
        if (jsonElement2 == null || (jsonArray = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement2)) == null) {
            throw new java.lang.IllegalStateException("Missing required field: financialInstrumentMetadataActionList".toString());
        }
        java.lang.String str = "type";
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "type");
        if (jsonElement3 == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) == null || (content = jsonPrimitive.getContent()) == null) {
            throw new java.lang.IllegalStateException("Missing required field: type".toString());
        }
        java.lang.String str2 = "displayText";
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "displayText");
        if (jsonElement4 == null || (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) == null || (content2 = jsonPrimitive2.getContent()) == null) {
            throw new java.lang.IllegalStateException("Missing required field: displayText".toString());
        }
        kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
        if (jsonElement5 == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) == null || (content3 = jsonPrimitive3.getContent()) == null) {
            throw new java.lang.IllegalStateException("Missing required field: description".toString());
        }
        kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "enumValues");
        if (jsonElement6 == null || (jsonArray2 = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement6)) == null) {
            throw new java.lang.IllegalStateException("Missing required field: enumValues".toString());
        }
        kotlinx.serialization.json.JsonArray jsonArray6 = jsonArray2;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray6, 10));
        java.util.Iterator<kotlinx.serialization.json.JsonElement> it = jsonArray6.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(it.next()).getContent());
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType instrumentType = new com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType(content, content2, content3, arrayList);
        kotlinx.serialization.json.JsonArray jsonArray7 = jsonArray;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray7, 10));
        java.util.Iterator<kotlinx.serialization.json.JsonElement> it2 = jsonArray7.iterator();
        while (it2.hasNext()) {
            kotlinx.serialization.json.JsonObject jsonObject10 = kotlinx.serialization.json.JsonElementKt.getJsonObject(it2.next());
            kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) jsonObject10.get((java.lang.Object) com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY);
            if (jsonElement7 == null || (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement7)) == null) {
                throw new java.lang.IllegalStateException("Missing required field: actionType".toString());
            }
            kotlinx.serialization.json.JsonElement jsonElement8 = (kotlinx.serialization.json.JsonElement) jsonObject10.get((java.lang.Object) "financialInstrumentMetadataDefinitionList");
            if (jsonElement8 == null || (jsonArray3 = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement8)) == null) {
                throw new java.lang.IllegalStateException("Missing required field: financialInstrumentMetadataDefinitionList".toString());
            }
            kotlinx.serialization.json.JsonElement jsonElement9 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) str);
            if (jsonElement9 == null || (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement9)) == null || (content4 = jsonPrimitive4.getContent()) == null) {
                throw new java.lang.IllegalStateException("Missing required field: type".toString());
            }
            kotlinx.serialization.json.JsonElement jsonElement10 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) str2);
            if (jsonElement10 == null || (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement10)) == null || (content5 = jsonPrimitive5.getContent()) == null) {
                throw new java.lang.IllegalStateException("Missing required field: displayText".toString());
            }
            kotlinx.serialization.json.JsonElement jsonElement11 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            if (jsonElement11 == null || (jsonPrimitive6 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement11)) == null || (content6 = jsonPrimitive6.getContent()) == null) {
                throw new java.lang.IllegalStateException("Missing required field: description".toString());
            }
            kotlinx.serialization.json.JsonElement jsonElement12 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "enumValues");
            if (jsonElement12 == null || (jsonArray4 = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement12)) == null) {
                throw new java.lang.IllegalStateException("Missing required field: enumValues".toString());
            }
            kotlinx.serialization.json.JsonArray jsonArray8 = jsonArray4;
            java.util.Iterator<kotlinx.serialization.json.JsonElement> it3 = it2;
            java.lang.String str3 = str;
            java.lang.String str4 = str2;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray8, 10));
            java.util.Iterator<kotlinx.serialization.json.JsonElement> it4 = jsonArray8.iterator();
            while (it4.hasNext()) {
                arrayList3.add(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(it4.next()).getContent());
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.ActionType actionType = new com.paypal.oslo.feature.inappcheckout.domain.entity.ActionType(content4, content5, content6, arrayList3);
            kotlinx.serialization.json.JsonArray jsonArray9 = jsonArray3;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray9, 10));
            java.util.Iterator<kotlinx.serialization.json.JsonElement> it5 = jsonArray9.iterator();
            while (it5.hasNext()) {
                kotlinx.serialization.json.JsonObject jsonObject11 = kotlinx.serialization.json.JsonElementKt.getJsonObject(it5.next());
                kotlinx.serialization.json.JsonElement jsonElement13 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) "imageUrl");
                if (jsonElement13 == null || (jsonPrimitive7 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement13)) == null || (content7 = jsonPrimitive7.getContent()) == null) {
                    throw new java.lang.IllegalStateException("Missing required field: imageUrl".toString());
                }
                kotlinx.serialization.json.JsonElement jsonElement14 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) "brand");
                if (jsonElement14 == null || (jsonPrimitive8 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement14)) == null || (content8 = jsonPrimitive8.getContent()) == null) {
                    throw new java.lang.IllegalStateException("Missing required field: brand".toString());
                }
                kotlinx.serialization.json.JsonElement jsonElement15 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) "localizedBrandName");
                if (jsonElement15 == null || (jsonPrimitive9 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement15)) == null || (content9 = jsonPrimitive9.getContent()) == null) {
                    throw new java.lang.IllegalStateException("Missing required field: localizedBrandName".toString());
                }
                kotlinx.serialization.json.JsonElement jsonElement16 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) "grouping");
                if (jsonElement16 == null || (jsonArray5 = kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement16)) == null) {
                    throw new java.lang.IllegalStateException("Missing required field: grouping".toString());
                }
                kotlinx.serialization.json.JsonArray jsonArray10 = jsonArray5;
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray10, 10));
                java.util.Iterator<kotlinx.serialization.json.JsonElement> it6 = jsonArray10.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(it6.next()).getContent())));
                }
                java.util.ArrayList arrayList6 = arrayList5;
                kotlinx.serialization.json.JsonElement jsonElement17 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) "regex");
                if (jsonElement17 == null || (jsonPrimitive10 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement17)) == null || (content10 = jsonPrimitive10.getContent()) == null) {
                    throw new java.lang.IllegalStateException("Missing required field: regex".toString());
                }
                kotlinx.serialization.json.JsonElement jsonElement18 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) "firstName");
                if (jsonElement18 != null && (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement18)) != null) {
                    com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(jsonObject3);
                    kotlinx.serialization.json.JsonElement jsonElement19 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) "lastName");
                    if (jsonElement19 != null && (jsonObject4 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement19)) != null) {
                        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(jsonObject4);
                        kotlinx.serialization.json.JsonElement jsonElement20 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber);
                        if (jsonElement20 != null && (jsonObject5 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement20)) != null) {
                            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(jsonObject5);
                            kotlinx.serialization.json.JsonElement jsonElement21 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) "expiryMonth");
                            if (jsonElement21 != null && (jsonObject6 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement21)) != null) {
                                com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(jsonObject6);
                                kotlinx.serialization.json.JsonElement jsonElement22 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) "expiryYear");
                                if (jsonElement22 != null && (jsonObject7 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement22)) != null) {
                                    com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(jsonObject7);
                                    kotlinx.serialization.json.JsonElement jsonElement23 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv);
                                    if (jsonElement23 != null && (jsonObject8 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement23)) != null) {
                                        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(jsonObject8);
                                        kotlinx.serialization.json.JsonElement jsonElement24 = (kotlinx.serialization.json.JsonElement) jsonObject11.get((java.lang.Object) "addressRequired");
                                        if (jsonElement24 != null && (jsonObject9 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement24)) != null) {
                                            arrayList4.add(new com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition(content7, content8, content9, arrayList6, content10, highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI3, highResolutionOutputSizeshNQ4ISI4, highResolutionOutputSizeshNQ4ISI5, highResolutionOutputSizeshNQ4ISI6, getHighResolutionOutputSizeshNQ4ISI(jsonObject9)));
                                        } else {
                                            throw new java.lang.IllegalStateException("Missing required field: addressRequired".toString());
                                        }
                                    } else {
                                        throw new java.lang.IllegalStateException("Missing required field: cvv".toString());
                                    }
                                } else {
                                    throw new java.lang.IllegalStateException("Missing required field: expiryYear".toString());
                                }
                            } else {
                                throw new java.lang.IllegalStateException("Missing required field: expiryMonth".toString());
                            }
                        } else {
                            throw new java.lang.IllegalStateException("Missing required field: accountNumber".toString());
                        }
                    } else {
                        throw new java.lang.IllegalStateException("Missing required field: lastName".toString());
                    }
                } else {
                    throw new java.lang.IllegalStateException("Missing required field: firstName".toString());
                }
            }
            arrayList2.add(new com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataAction(actionType, arrayList4));
            it2 = it3;
            str = str3;
            str2 = str4;
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType(instrumentType, arrayList2);
    }

    private static com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute getHighResolutionOutputSizeshNQ4ISI(kotlinx.serialization.json.JsonObject p0) {
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
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) p0.get("minimumLength");
        if (jsonElement == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null || (content = jsonPrimitive.getContent()) == null) {
            throw new java.lang.IllegalStateException("Missing required field: minimumLength".toString());
        }
        int parseInt = java.lang.Integer.parseInt(content);
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) p0.get("maximumLength");
        if (jsonElement2 == null || (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (content2 = jsonPrimitive2.getContent()) == null) {
            throw new java.lang.IllegalStateException("Missing required field: maximumLength".toString());
        }
        int parseInt2 = java.lang.Integer.parseInt(content2);
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) p0.get("isRequired");
        if (jsonElement3 == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) == null || (content3 = jsonPrimitive3.getContent()) == null) {
            throw new java.lang.IllegalStateException("Missing required field: isRequired".toString());
        }
        boolean parseBoolean = java.lang.Boolean.parseBoolean(content3);
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) p0.get("isEditable");
        if (jsonElement4 == null || (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) == null || (content4 = jsonPrimitive4.getContent()) == null) {
            throw new java.lang.IllegalStateException("Missing required field: isEditable".toString());
        }
        boolean parseBoolean2 = java.lang.Boolean.parseBoolean(content4);
        kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) p0.get("regex");
        if (jsonElement5 == null || (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) == null || (content5 = jsonPrimitive5.getContent()) == null) {
            throw new java.lang.IllegalStateException("Missing required field: regex".toString());
        }
        kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) p0.get("labelKey");
        if (jsonElement6 == null || (jsonPrimitive6 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement6)) == null || (content6 = jsonPrimitive6.getContent()) == null) {
            throw new java.lang.IllegalStateException("Missing required field: labelKey".toString());
        }
        kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) p0.get("group");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute(parseInt, parseInt2, parseBoolean, parseBoolean2, content5, content6, (jsonElement7 == null || (jsonPrimitive7 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement7)) == null) ? null : jsonPrimitive7.getContent());
    }
}
