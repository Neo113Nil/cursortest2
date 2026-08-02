package com.paypal.oslo.feature.activity.domain.base.utils.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/mapper/ActivityShipmentPackagesMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$ShipmentPackage;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage;", "toActivityShipmentPackages", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityShipmentPackagesMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityShipmentPackagesMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityShipmentPackagesMapper();

    private ActivityShipmentPackagesMapper() {
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> toActivityShipmentPackages(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.ShipmentPackage> list) {
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier;
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.Iterator it2;
        java.util.ArrayList arrayList3;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier2;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentCarrierFragment activityShipmentCarrierFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.ShipmentPackage> list2 = list;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.ShipmentPackage shipmentPackage = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.ShipmentPackage) it3.next();
            java.lang.String trackingNumber = shipmentPackage.getActivityShipmentPackageItemFragment().getTrackingNumber();
            java.lang.Object logoImageUrl = shipmentPackage.getActivityShipmentPackageItemFragment().getLogoImageUrl();
            java.lang.String obj = logoImageUrl != null ? logoImageUrl.toString() : null;
            int i = com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityShipmentPackagesMapper.WhenMappings.$EnumSwitchMapping$0[shipmentPackage.getActivityShipmentPackageItemFragment().getStatus().ordinal()];
            if (i == 1) {
                activityPackageTrackingStatus = com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.INFORMATION_RECEIVED;
            } else if (i == 2) {
                activityPackageTrackingStatus = com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.IN_TRANSIT;
            } else if (i == 3) {
                activityPackageTrackingStatus = com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.EXCEPTION;
            } else if (i == 4) {
                activityPackageTrackingStatus = com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.OUT_FOR_DELIVERY;
            } else if (i == 5) {
                activityPackageTrackingStatus = com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.DELIVERED;
            } else {
                activityPackageTrackingStatus = com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.UNKNOWN;
            }
            com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus2 = activityPackageTrackingStatus;
            java.lang.String statusMessage = shipmentPackage.getActivityShipmentPackageItemFragment().getStatusMessage();
            java.lang.Object deliveryTime = shipmentPackage.getActivityShipmentPackageItemFragment().getDeliveryTime();
            java.lang.String obj2 = deliveryTime != null ? deliveryTime.toString() : null;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment.Carrier carrier = shipmentPackage.getActivityShipmentPackageItemFragment().getCarrier();
            if (carrier != null) {
                if (carrier == null || (activityShipmentCarrierFragment = carrier.getActivityShipmentCarrierFragment()) == null) {
                    activityShippingCarrier2 = null;
                } else {
                    java.lang.String id = activityShipmentCarrierFragment.getId();
                    java.lang.String name2 = activityShipmentCarrierFragment.getName();
                    java.lang.Object logoImageUrl2 = activityShipmentCarrierFragment.getLogoImageUrl();
                    activityShippingCarrier2 = new com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier(id, name2, logoImageUrl2 != null ? logoImageUrl2.toString() : null);
                }
                activityShippingCarrier = activityShippingCarrier2;
            } else {
                activityShippingCarrier = null;
            }
            java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment.Item> items = shipmentPackage.getActivityShipmentPackageItemFragment().getItems();
            if (items != null) {
                if (items != null) {
                    java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment.Item> list3 = items;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment.Item item : list3) {
                        java.lang.String name3 = item.getActivityShipmentItemFragment().getName();
                        java.lang.Integer quantity = item.getActivityShipmentItemFragment().getQuantity();
                        java.lang.Object imageUrl = item.getActivityShipmentItemFragment().getImageUrl();
                        java.lang.String obj3 = imageUrl != null ? imageUrl.toString() : null;
                        java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> tags = item.getActivityShipmentItemFragment().getTags();
                        if (tags != null) {
                            java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list4 = tags;
                            it2 = it3;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                            java.util.Iterator<T> it4 = list4.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(((com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag) it4.next()).toString());
                            }
                            arrayList3 = arrayList6;
                        } else {
                            it2 = it3;
                            arrayList3 = null;
                        }
                        arrayList5.add(new com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentItem(name3, quantity, obj3, arrayList3));
                        it3 = it2;
                    }
                    it = it3;
                    arrayList2 = arrayList5;
                } else {
                    it = it3;
                    arrayList2 = null;
                }
                arrayList = arrayList2;
            } else {
                it = it3;
                arrayList = null;
            }
            arrayList4.add(new com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage(trackingNumber, obj, activityPackageTrackingStatus2, statusMessage, obj2, activityShippingCarrier, arrayList));
            it3 = it;
        }
        return arrayList4;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.INFORMATION_RECEIVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.IN_TRANSIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.EXCEPTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.OUT_FOR_DELIVERY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.DELIVERED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
