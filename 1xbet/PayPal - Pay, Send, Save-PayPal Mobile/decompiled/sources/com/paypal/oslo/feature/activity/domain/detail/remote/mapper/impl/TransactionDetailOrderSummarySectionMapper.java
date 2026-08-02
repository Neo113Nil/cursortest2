package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailOrderSummarySectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailOrderSummarySectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailOrderSummarySectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailOrderSummarySectionMapper();

    private TransactionDetailOrderSummarySectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment activityShipmentPackagesFragment;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item> items;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentCarrierFragment activityShipmentCarrierFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem> skuItems = input.getResult().getSkuItems();
        if (skuItems != null && !skuItems.isEmpty()) {
            return true;
        }
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages shipmentPackages = input.getShipmentPackages();
        if (shipmentPackages == null || (activityShipmentPackagesFragment = shipmentPackages.getActivityShipmentPackagesFragment()) == null || (items = activityShipmentPackagesFragment.getItems()) == null) {
            return false;
        }
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment activityShipmentPackageItemFragment = ((com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item) it.next()).getActivityShipmentPackageItemFragment();
            if (activityShipmentPackageItemFragment.getTrackingNumber().length() > 0) {
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment.Carrier carrier = activityShipmentPackageItemFragment.getCarrier();
                java.lang.String id = (carrier == null || (activityShipmentCarrierFragment = carrier.getActivityShipmentCarrierFragment()) == null) ? null : activityShipmentCarrierFragment.getId();
                if (id != null && id.length() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment activityShipmentPackagesFragment;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item> items;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentCarrierFragment activityShipmentCarrierFragment;
        java.lang.String valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem> skuItems = input.getResult().getSkuItems();
        if (skuItems != null) {
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem> list = skuItems;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.activity.graphql.fragment.ActivitySkuItemFragment activitySkuItemFragment = ((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem) it.next()).getActivitySkuItemFragment();
                java.lang.String name2 = activitySkuItemFragment.getName();
                java.lang.Object imageUrl = activitySkuItemFragment.getImageUrl();
                java.lang.String obj = imageUrl != null ? imageUrl.toString() : null;
                java.lang.Integer quantity = activitySkuItemFragment.getQuantity();
                arrayList2.add(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection(obj, name2, (quantity == null || (valueOf = java.lang.String.valueOf(quantity.intValue())) == null) ? null : com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.MULTIPLIER_SIGN.concat(java.lang.String.valueOf(valueOf)), null, 8, null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        int i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_order_summary_label;
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages shipmentPackages = input.getShipmentPackages();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (shipmentPackages != null && (activityShipmentPackagesFragment = shipmentPackages.getActivityShipmentPackagesFragment()) != null && (items = activityShipmentPackagesFragment.getItems()) != null) {
            java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item> list2 = items;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment activityShipmentPackageItemFragment = ((com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item) it2.next()).getActivityShipmentPackageItemFragment();
                if (activityShipmentPackageItemFragment.getTrackingNumber().length() > 0) {
                    com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment.Carrier carrier = activityShipmentPackageItemFragment.getCarrier();
                    java.lang.String id = (carrier == null || (activityShipmentCarrierFragment = carrier.getActivityShipmentCarrierFragment()) == null) ? null : activityShipmentCarrierFragment.getId();
                    if (id != null && id.length() != 0) {
                        arrayList3.add(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem(activityShipmentPackageItemFragment.getTrackingNumber(), activityShipmentPackageItemFragment.getCarrier().getActivityShipmentCarrierFragment().getId()));
                    }
                }
                arrayList4.add(kotlin.Unit.INSTANCE);
            }
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel(arrayList, arrayList3, java.lang.Integer.valueOf(i), true));
    }
}
