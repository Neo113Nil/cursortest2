package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rR7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;", "", "<init>", "()V", "", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "prefilled", "", "seedIfEmpty", "(Ljava/util/List;)V", "newAddress", com.visa.cbp.DeviceInfo.valueOf, "updateAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "<set-?>", "addresses$delegate", "Landroidx/compose/runtime/MutableState;", "getAddresses", "()Ljava/util/List;", "setAddresses", "addresses"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressCollectionStateHolder {
    public static final int $stable = 0;

    /* renamed from: addresses$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState addresses = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.CollectionsKt.emptyList(), null, 2, null);

    @javax.inject.Inject
    public AddressCollectionStateHolder() {
    }

    private final void setAddresses(java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> list) {
        this.addresses.setValue(list);
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> getAddresses() {
        return (java.util.List) this.addresses.getValue();
    }

    public final void seedIfEmpty(java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> prefilled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefilled, "");
        if (getAddresses().isEmpty()) {
            setAddresses(prefilled);
        }
    }

    public final void updateAddress(com.paypal.oslo.core.i18n.domain.model.Address newAddress, com.paypal.oslo.core.i18n.domain.model.Address original) {
        java.util.ArrayList plus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newAddress, "");
        if (original != null && getAddresses().contains(original)) {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> addresses = getAddresses();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(addresses, 10));
            for (com.paypal.oslo.core.i18n.domain.model.Address address : addresses) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(address, original)) {
                    address = newAddress;
                }
                arrayList.add(address);
            }
            plus = arrayList;
        } else {
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(newAddress);
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> addresses2 = getAddresses();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : addresses2) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual((com.paypal.oslo.core.i18n.domain.model.Address) obj, newAddress)) {
                    arrayList2.add(obj);
                }
            }
            plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) listOf, (java.lang.Iterable) arrayList2);
        }
        setAddresses(plus);
    }
}
