package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JS\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0016\u001a\u00020\u00062\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/AddressValidationUtil;", "", "Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;", "fieldExtractionUtil", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "", "", "pattern", "", "validationFieldList", "Lcom/paypal/oslo/core/i18n/domain/model/Label;", "label", "", "shouldMatch", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "validateFieldsAgainstPatterns", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/util/Map;Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/Label;Z)Ljava/util/List;", "validateOffensiveFieldsAgainstPatterns", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/util/Map;Lcom/paypal/oslo/core/i18n/domain/model/Label;)Ljava/util/List;", "p0", "p1", "p2", "p3", "p4", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddressValidationUtil {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AddressValidationUtil(com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldExtractionUtil, "");
        this.getHighSpeedVideoFpsRanges = fieldExtractionUtil;
    }

    public static /* synthetic */ java.util.List validateFieldsAgainstPatterns$default(com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil addressValidationUtil, com.paypal.oslo.core.i18n.domain.model.Address address, java.util.Map map, java.util.List list, com.paypal.oslo.core.i18n.domain.model.Label label, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            z = false;
        }
        return addressValidationUtil.validateFieldsAgainstPatterns(address, map, list2, label, z);
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> validateFieldsAgainstPatterns(com.paypal.oslo.core.i18n.domain.model.Address address, java.util.Map<java.lang.String, java.lang.String> pattern, java.util.List<java.lang.String> validationFieldList, com.paypal.oslo.core.i18n.domain.model.Label label, boolean shouldMatch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationFieldList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        return getHighSpeedVideoFpsRanges(address, pattern, validationFieldList, label, shouldMatch);
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> validateOffensiveFieldsAgainstPatterns(com.paypal.oslo.core.i18n.domain.model.Address address, java.util.Map<java.lang.String, java.lang.String> pattern, com.paypal.oslo.core.i18n.domain.model.Label label) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        return getHighSpeedVideoFpsRanges(address, pattern, kotlin.collections.CollectionsKt.emptyList(), label, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> getHighSpeedVideoFpsRanges(com.paypal.oslo.core.i18n.domain.model.Address p0, java.util.Map<java.lang.String, java.lang.String> p1, java.util.List<java.lang.String> p2, com.paypal.oslo.core.i18n.domain.model.Label p3, boolean p4) {
        java.util.List<java.lang.String> all_address_fields;
        com.paypal.oslo.core.i18n.domain.model.Field field;
        java.lang.String obj;
        boolean z;
        java.util.ArrayList arrayList = null;
        if (p1 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : p1.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (p2.isEmpty()) {
                    all_address_fields = kotlin.jvm.internal.Intrinsics.areEqual(key, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT) ? com.paypal.oslo.core.i18n.domain.util.MetadataConstants.INSTANCE.getALL_ADDRESS_FIELDS() : kotlin.collections.CollectionsKt.listOf(key);
                } else {
                    all_address_fields = p2;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator<T> it = all_address_fields.iterator();
                while (it.hasNext()) {
                    com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo fieldDetail = this.getHighSpeedVideoFpsRanges.getFieldDetail((java.lang.String) it.next(), p0, false, p3, "");
                    java.lang.String value2 = fieldDetail.getValue();
                    if (value2 != null && value2.length() != 0) {
                        if (p4) {
                            if (kotlin.text.StringsKt.startsWith$default(value, "^", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default(value, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, false, 2, (java.lang.Object) null)) {
                                z = new kotlin.text.Regex(value).matches(value2);
                            } else {
                                z = new kotlin.text.Regex(value).containsMatchIn(value2);
                            }
                        } else {
                            boolean startsWith$default = kotlin.text.StringsKt.startsWith$default(value, "^", false, 2, (java.lang.Object) null);
                            boolean endsWith$default = kotlin.text.StringsKt.endsWith$default(value, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, false, 2, (java.lang.Object) null);
                            if (startsWith$default && endsWith$default) {
                                obj = value;
                            } else if (startsWith$default && !endsWith$default) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(value);
                                sb.append(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
                                obj = sb.toString();
                            } else if (!startsWith$default && endsWith$default) {
                                obj = "^".concat(java.lang.String.valueOf(value));
                            } else {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("^");
                                sb2.append(value);
                                sb2.append(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
                                obj = sb2.toString();
                            }
                            z = !new kotlin.text.Regex(obj).matches(value2);
                        }
                        if (z) {
                            field = fieldDetail.getAddressField();
                            if (field == null) {
                                arrayList3.add(field);
                            }
                        }
                    }
                    field = null;
                    if (field == null) {
                    }
                }
                kotlin.collections.CollectionsKt.addAll(arrayList2, arrayList3);
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }
}
