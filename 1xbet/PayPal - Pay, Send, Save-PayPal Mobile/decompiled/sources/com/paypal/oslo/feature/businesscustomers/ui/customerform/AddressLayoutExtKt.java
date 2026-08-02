package com.paypal.oslo.feature.businesscustomers.ui.customerform;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "Lcom/paypal/oslo/core/i18n/domain/model/StateList;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "containsFieldValue", "(Ljava/util/List;Ljava/lang/String;)Z", "Lcom/paypal/oslo/core/i18n/domain/model/AddressComponent;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "addressFields", "withDefault", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressComponent;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;)Lcom/paypal/oslo/core/i18n/domain/model/AddressComponent;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "copyWithAddressFields", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;)Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressLayoutExtKt {
    public static final boolean containsFieldValue(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.StateList> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        for (com.paypal.oslo.core.i18n.domain.model.StateList stateList : list) {
            if (!(stateList instanceof com.paypal.oslo.core.i18n.domain.model.StateList.MapValue)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (((com.paypal.oslo.core.i18n.domain.model.StateList.MapValue) stateList).getValue().containsKey(str)) {
                return true;
            }
        }
        return false;
    }

    private static final java.lang.String Camera2StreamConfigurationMap(com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent, java.lang.String str) {
        java.util.List<com.paypal.oslo.core.i18n.domain.model.StateList> stateList = addressComponent.getStateList();
        if (stateList == null || stateList.isEmpty()) {
            return str;
        }
        if (str == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.core.i18n.domain.model.StateList> stateList2 = addressComponent.getStateList();
        kotlin.jvm.internal.Intrinsics.checkNotNull(stateList2, "");
        if (containsFieldValue(stateList2, str)) {
            return str;
        }
        return null;
    }

    public static final com.paypal.oslo.core.i18n.domain.model.AddressComponent withDefault(com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
        com.paypal.oslo.core.i18n.domain.model.Field field = addressComponent.getField();
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine1) {
            java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(addressComponent, addressFields.getLine1());
            return com.paypal.oslo.core.i18n.domain.model.AddressComponent.copy$default(addressComponent, com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11272boximpl(com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(Camera2StreamConfigurationMap != null ? Camera2StreamConfigurationMap : "")), null, false, false, null, 30, null);
        }
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine2) {
            java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(addressComponent, addressFields.getLine2());
            return com.paypal.oslo.core.i18n.domain.model.AddressComponent.copy$default(addressComponent, com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11281boximpl(com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(Camera2StreamConfigurationMap2 != null ? Camera2StreamConfigurationMap2 : "")), null, false, false, null, 30, null);
        }
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea1) {
            java.lang.String Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(addressComponent, addressFields.getState());
            return com.paypal.oslo.core.i18n.domain.model.AddressComponent.copy$default(addressComponent, com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11299boximpl(com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(Camera2StreamConfigurationMap3 != null ? Camera2StreamConfigurationMap3 : "")), null, false, false, null, 30, null);
        }
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea2) {
            java.lang.String Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(addressComponent, addressFields.getCity());
            return com.paypal.oslo.core.i18n.domain.model.AddressComponent.copy$default(addressComponent, com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11308boximpl(com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(Camera2StreamConfigurationMap4 != null ? Camera2StreamConfigurationMap4 : "")), null, false, false, null, 30, null);
        }
        if (!(field instanceof com.paypal.oslo.core.i18n.domain.model.PostalCode)) {
            return addressComponent;
        }
        java.lang.String Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(addressComponent, addressFields.getZipCode());
        return com.paypal.oslo.core.i18n.domain.model.AddressComponent.copy$default(addressComponent, com.paypal.oslo.core.i18n.domain.model.PostalCode.m11459boximpl(com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(Camera2StreamConfigurationMap5 != null ? Camera2StreamConfigurationMap5 : "")), null, false, false, null, 30, null);
    }

    public static final com.paypal.oslo.core.i18n.domain.model.AddressLayout copyWithAddressFields(com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLayout, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
        java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> rows = addressLayout.getRows();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(rows, 10));
        java.util.Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressComponent> components = ((com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row) it.next()).getComponents();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(components, 10));
            java.util.Iterator<T> it2 = components.iterator();
            while (it2.hasNext()) {
                arrayList2.add(withDefault((com.paypal.oslo.core.i18n.domain.model.AddressComponent) it2.next(), addressFields));
            }
            arrayList.add(new com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row(arrayList2));
        }
        return new com.paypal.oslo.core.i18n.domain.model.AddressLayout(arrayList);
    }
}
