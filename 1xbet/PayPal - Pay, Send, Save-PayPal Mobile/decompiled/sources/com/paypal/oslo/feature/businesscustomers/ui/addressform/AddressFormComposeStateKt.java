package com.paypal.oslo.feature.businesscustomers.ui.addressform;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\"\u0010\f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\n*\u00020\u0001H\u0080\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressLayoutComposeState;", "toComposeState", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;)Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressLayoutComposeState;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout$Row;", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressLayoutRowComposeState;", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout$Row;)Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressLayoutRowComposeState;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressComponent;", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState;", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressComponent;)Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "findByType", "(Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressLayoutComposeState;)Lcom/paypal/oslo/core/i18n/domain/model/Field;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressFormComposeStateKt {
    public static final com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutComposeState toComposeState(com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLayout, "");
        java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> rows = addressLayout.getRows();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(rows, 10));
        java.util.Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            arrayList.add(toComposeState((com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!((com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutRowComposeState) obj).getComponents().isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return new com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutComposeState(arrayList2);
    }

    public static final com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutRowComposeState toComposeState(com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row row) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(row, "");
        java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressComponent> components = row.getComponents();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : components) {
            com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent = (com.paypal.oslo.core.i18n.domain.model.AddressComponent) obj;
            if (!addressComponent.getHidden() && com.paypal.oslo.feature.businesscustomers.ui.addressform.FieldExtKt.isSupportedForCustomers(addressComponent.getField())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(toComposeState((com.paypal.oslo.core.i18n.domain.model.AddressComponent) it.next()));
        }
        return new com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutRowComposeState(arrayList3);
    }

    public static final com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState toComposeState(com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressComponent, "");
        java.util.List<com.paypal.oslo.core.i18n.domain.model.StateList> stateList = addressComponent.getStateList();
        if (stateList != null) {
            com.paypal.oslo.core.i18n.domain.model.Field field = addressComponent.getField();
            java.lang.String label = addressComponent.getLabel();
            boolean required = addressComponent.getRequired();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.paypal.oslo.core.i18n.domain.model.StateList stateList2 : stateList) {
                if (!(stateList2 instanceof com.paypal.oslo.core.i18n.domain.model.StateList.MapValue)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.util.Map<java.lang.String, java.lang.String> value = ((com.paypal.oslo.core.i18n.domain.model.StateList.MapValue) stateList2).getValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(value.size());
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : value.entrySet()) {
                    arrayList2.add(kotlin.TuplesKt.to(entry.getKey(), entry.getValue()));
                }
                kotlin.collections.CollectionsKt.addAll(arrayList, arrayList2);
            }
            return new com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown(field, label, required, kotlin.collections.MapsKt.toMap(arrayList));
        }
        return new com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput(addressComponent.getField(), addressComponent.getLabel(), addressComponent.getRequired());
    }

    public static final /* synthetic */ <R extends com.paypal.oslo.core.i18n.domain.model.Field> R findByType(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutComposeState addressLayoutComposeState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLayoutComposeState, "");
        java.util.Iterator<com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutRowComposeState> it = addressLayoutComposeState.getRows().iterator();
        while (it.hasNext()) {
            for (com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState addressComponentComposeState : it.next().getComponents()) {
                com.paypal.oslo.core.i18n.domain.model.Field field = addressComponentComposeState.getField();
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE);
                if (field instanceof com.paypal.oslo.core.i18n.domain.model.Field) {
                    R r = (R) addressComponentComposeState.getField();
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE);
                    return r;
                }
            }
        }
        return null;
    }
}
