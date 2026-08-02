package com.paypal.oslo.feature.packagetracking.data.mapper;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b*\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\f\u001a\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentPackage;", "", "carrierId", "Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "toDomain", "(Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentPackage;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "Lcom/paypal/oslo/feature/packagetracking/graphql/type/PackageTrackingStatus;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/TrackingPackageStatus;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;)Lcom/paypal/oslo/feature/packagetracking/domain/model/TrackingPackageStatus;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;", "(Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "", "Ljava/time/ZonedDateTime;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Object;)Ljava/time/ZonedDateTime;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageGraphQLMapperKt {
    public static final com.paypal.oslo.feature.packagetracking.domain.model.PackageData toDomain(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage shipmentPackage, java.lang.String str) {
        com.paypal.oslo.feature.packagetracking.domain.model.Carrier carrier;
        java.util.ArrayList arrayList;
        java.time.ZonedDateTime zonedDateTime;
        java.lang.String str2;
        java.util.List list;
        com.paypal.oslo.feature.packagetracking.domain.model.Address address;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.packagetracking.domain.model.Merchant merchant;
        java.util.ArrayList arrayList3;
        com.paypal.oslo.feature.packagetracking.domain.model.Merchant merchant2;
        java.time.ZonedDateTime zonedDateTime2;
        java.lang.String str3;
        java.util.List list2;
        com.paypal.oslo.feature.packagetracking.domain.model.Address address2;
        java.util.ArrayList arrayList4;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate trackingStatusUpdate;
        java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI;
        java.lang.String checkPointMessage;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus;
        java.lang.Object deliveryTime;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shipmentPackage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String trackingNumber = shipmentPackage.getTrackingNumber();
        java.lang.String trackingNumber2 = shipmentPackage.getTrackingNumber();
        java.lang.String id = shipmentPackage.getId();
        com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier carrier2 = shipmentPackage.getCarrier();
        if (carrier2 != null) {
            java.lang.String name2 = carrier2.getName();
            java.lang.Object logoImageUrl = carrier2.getLogoImageUrl();
            carrier = new com.paypal.oslo.feature.packagetracking.domain.model.Carrier(str, name2, logoImageUrl != null ? logoImageUrl.toString() : null);
        } else {
            carrier = null;
        }
        java.lang.String transactionNumber = shipmentPackage.getTransactionNumber();
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus highSpeedVideoSizes = getHighSpeedVideoSizes(shipmentPackage.getStatus());
        java.lang.Object deliveryTime2 = shipmentPackage.getDeliveryTime();
        java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI2 = deliveryTime2 != null ? getHighResolutionOutputSizeshNQ4ISI(deliveryTime2) : null;
        java.lang.String statusMessage = shipmentPackage.getStatusMessage();
        java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI3 = (getHighSpeedVideoSizes(shipmentPackage.getStatus()) != com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.DELIVERED || (deliveryTime = shipmentPackage.getDeliveryTime()) == null) ? null : getHighResolutionOutputSizeshNQ4ISI(deliveryTime);
        java.lang.Object trackingLink = shipmentPackage.getTrackingLink();
        java.lang.String obj = trackingLink != null ? trackingLink.toString() : null;
        java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate> shipmentUpdates = shipmentPackage.getShipmentUpdates();
        if (shipmentUpdates != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate shipmentUpdate : shipmentUpdates) {
                java.lang.Object updateTime = shipmentUpdate.getUpdateTime();
                if (updateTime == null || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(updateTime)) == null || (checkPointMessage = shipmentUpdate.getCheckPointMessage()) == null) {
                    trackingStatusUpdate = null;
                } else {
                    com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location location = shipmentUpdate.getLocation();
                    com.paypal.oslo.feature.packagetracking.domain.model.Address address3 = location != null ? new com.paypal.oslo.feature.packagetracking.domain.model.Address(location.getAdminArea2(), location.getAdminArea1(), location.getCountryCode().toString(), location.getPostalCode(), null, null, 48, null) : null;
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus shipmentStatus = shipmentUpdate.getShipmentStatus();
                    if (shipmentStatus == null || (trackingPackageStatus = getHighSpeedVideoSizes(shipmentStatus)) == null) {
                        trackingPackageStatus = com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.UNDEFINED;
                    }
                    trackingStatusUpdate = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate(highResolutionOutputSizeshNQ4ISI, checkPointMessage, address3, trackingPackageStatus, shipmentUpdate.getUpdateTimeDescription());
                }
                if (trackingStatusUpdate != null) {
                    arrayList5.add(trackingStatusUpdate);
                }
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress destinationAddress = shipmentPackage.getDestinationAddress();
        com.paypal.oslo.feature.packagetracking.domain.model.Address address4 = destinationAddress != null ? new com.paypal.oslo.feature.packagetracking.domain.model.Address(destinationAddress.getAdminArea2(), destinationAddress.getAdminArea1(), destinationAddress.getCountryCode().toString(), destinationAddress.getPostalCode(), null, null, 48, null) : null;
        boolean markedAsDelivered = shipmentPackage.getMarkedAsDelivered();
        java.lang.String packageNickname = shipmentPackage.getPackageNickname();
        java.lang.String orderNumber = shipmentPackage.getOrderNumber();
        java.lang.Object orderManagementUrl = shipmentPackage.getOrderManagementUrl();
        java.lang.String obj2 = orderManagementUrl != null ? orderManagementUrl.toString() : null;
        java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item> items = shipmentPackage.getItems();
        if (items != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it = items.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item item = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item) it.next();
                java.util.Iterator it2 = it;
                java.lang.String name3 = item.getName();
                java.lang.Integer quantity = item.getQuantity();
                java.lang.Object imageUrl = item.getImageUrl();
                java.lang.String obj3 = imageUrl != null ? imageUrl.toString() : null;
                java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> tags = item.getTags();
                if (tags != null) {
                    address2 = address4;
                    java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list3 = tags;
                    list2 = arrayList;
                    zonedDateTime2 = highResolutionOutputSizeshNQ4ISI3;
                    str3 = obj;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    java.util.Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList7.add(((com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag) it3.next()).getRawValue());
                    }
                    arrayList4 = arrayList7;
                } else {
                    zonedDateTime2 = highResolutionOutputSizeshNQ4ISI3;
                    str3 = obj;
                    list2 = arrayList;
                    address2 = address4;
                    arrayList4 = null;
                }
                if (arrayList4 == null) {
                    arrayList4 = kotlin.collections.CollectionsKt.emptyList();
                }
                arrayList6.add(new com.paypal.oslo.feature.packagetracking.domain.model.Item(name3, quantity, obj3, arrayList4));
                arrayList = list2;
                it = it2;
                address4 = address2;
                obj = str3;
                highResolutionOutputSizeshNQ4ISI3 = zonedDateTime2;
            }
            zonedDateTime = highResolutionOutputSizeshNQ4ISI3;
            str2 = obj;
            list = arrayList;
            address = address4;
            arrayList2 = arrayList6;
        } else {
            zonedDateTime = highResolutionOutputSizeshNQ4ISI3;
            str2 = obj;
            list = arrayList;
            address = address4;
            arrayList2 = null;
        }
        java.util.List emptyList = arrayList2 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList2;
        com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant merchant3 = shipmentPackage.getMerchant();
        if (merchant3 != null) {
            if (merchant3.getOnMerchant() != null || merchant3.getOnShipmentPackageExternalMerchant() == null) {
                merchant2 = null;
            } else {
                java.lang.String name4 = merchant3.getOnShipmentPackageExternalMerchant().getName();
                java.lang.Object logoImageUrl2 = merchant3.getOnShipmentPackageExternalMerchant().getLogoImageUrl();
                merchant2 = new com.paypal.oslo.feature.packagetracking.domain.model.Merchant(name4, logoImageUrl2 != null ? logoImageUrl2.toString() : null);
            }
            merchant = merchant2;
        } else {
            merchant = null;
        }
        java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> tags2 = shipmentPackage.getTags();
        if (tags2 != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> list4 = tags2;
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            java.util.Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList8.add(((com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag) it4.next()).getRawValue());
            }
            arrayList3 = arrayList8;
        } else {
            arrayList3 = null;
        }
        java.util.List emptyList2 = arrayList3 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList3;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageSource = shipmentPackage.getPackageSource();
        return new com.paypal.oslo.feature.packagetracking.domain.model.PackageData(trackingNumber, trackingNumber2, id, str, carrier, transactionNumber, highSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI2, statusMessage, zonedDateTime, str2, list, address, markedAsDelivered, packageNickname, orderNumber, obj2, emptyList, merchant, emptyList2, packageSource != null ? packageSource.getRawValue() : null, null, null, false, null, shipmentPackage.getExceptionSummary(), shipmentPackage.getExceptionDetails(), 25165824, null);
    }

    private static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus getHighSpeedVideoSizes(com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus) {
        switch (com.paypal.oslo.feature.packagetracking.data.mapper.PackageGraphQLMapperKt.WhenMappings.$EnumSwitchMapping$0[packageTrackingStatus.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.IN_TRANSIT;
            case 2:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.OUT_FOR_DELIVERY;
            case 3:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.DELIVERED;
            case 4:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.PENDING;
            case 5:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.EXCEPTION;
            case 6:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.INFORMATION_RECEIVED;
            case 7:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.ATTEMPT_FAILED;
            case 8:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.EXPIRED;
            case 9:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.MANIFEST;
            case 10:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.PICKED_UP;
            case 11:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.PICKUP_MISSED;
            case 12:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.READY_FOR_PICKUP;
            case 13:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.UNDEFINED;
            case 14:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.CANCELED;
            case 15:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.AMAZON_ORDER_CONFIRMATION;
            case 16:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.AMAZON_SHIPMENT_CONFIRMATION;
            case 17:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.AMAZON_OUT_FOR_DELIVERY;
            case 18:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.AMAZON_DELIVERY_CONFIRMATION;
            case 19:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.AMAZON_ORDER_CANCELLATION;
            case 20:
                return com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.UNDEFINED;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.paypal.oslo.feature.packagetracking.domain.model.PackageData toDomain(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r37, java.lang.String str) {
        com.paypal.oslo.feature.packagetracking.domain.model.Carrier carrier;
        java.util.ArrayList arrayList;
        java.lang.String str2;
        java.util.List list;
        com.paypal.oslo.feature.packagetracking.domain.model.Address address;
        boolean z;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.packagetracking.domain.model.Merchant merchant;
        java.util.ArrayList arrayList3;
        com.paypal.oslo.feature.packagetracking.domain.model.Merchant merchant2;
        java.lang.String str3;
        java.util.List list2;
        com.paypal.oslo.feature.packagetracking.domain.model.Address address2;
        boolean z2;
        java.util.ArrayList arrayList4;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate trackingStatusUpdate;
        java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI;
        java.lang.String checkPointMessage;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus;
        java.lang.Object deliveryTime;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r37, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String trackingNumber = r37.getTrackingNumber();
        java.lang.String trackingNumber2 = r37.getTrackingNumber();
        com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier carrier2 = r37.getCarrier();
        if (carrier2 != null) {
            java.lang.String name2 = carrier2.getName();
            java.lang.Object logoImageUrl = carrier2.getLogoImageUrl();
            carrier = new com.paypal.oslo.feature.packagetracking.domain.model.Carrier(str, name2, logoImageUrl != null ? logoImageUrl.toString() : null);
        } else {
            carrier = null;
        }
        java.lang.String transactionNumber = r37.getTransactionNumber();
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus highSpeedVideoSizes = getHighSpeedVideoSizes(r37.getStatus());
        java.lang.Object deliveryTime2 = r37.getDeliveryTime();
        java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI2 = deliveryTime2 != null ? getHighResolutionOutputSizeshNQ4ISI(deliveryTime2) : null;
        java.lang.String statusMessage = r37.getStatusMessage();
        java.time.ZonedDateTime highResolutionOutputSizeshNQ4ISI3 = (getHighSpeedVideoSizes(r37.getStatus()) != com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.DELIVERED || (deliveryTime = r37.getDeliveryTime()) == null) ? null : getHighResolutionOutputSizeshNQ4ISI(deliveryTime);
        java.lang.Object trackingLink = r37.getTrackingLink();
        java.lang.String obj = trackingLink != null ? trackingLink.toString() : null;
        java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate> shipmentUpdates = r37.getShipmentUpdates();
        if (shipmentUpdates != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate shipmentUpdate : shipmentUpdates) {
                java.lang.Object updateTime = shipmentUpdate.getUpdateTime();
                if (updateTime == null || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(updateTime)) == null || (checkPointMessage = shipmentUpdate.getCheckPointMessage()) == null) {
                    trackingStatusUpdate = null;
                } else {
                    com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location location = shipmentUpdate.getLocation();
                    com.paypal.oslo.feature.packagetracking.domain.model.Address address3 = location != null ? new com.paypal.oslo.feature.packagetracking.domain.model.Address(location.getAdminArea2(), location.getAdminArea1(), location.getCountryCode().toString(), location.getPostalCode(), null, null, 48, null) : null;
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus shipmentStatus = shipmentUpdate.getShipmentStatus();
                    if (shipmentStatus == null || (trackingPackageStatus = getHighSpeedVideoSizes(shipmentStatus)) == null) {
                        trackingPackageStatus = com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.UNDEFINED;
                    }
                    trackingStatusUpdate = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate(highResolutionOutputSizeshNQ4ISI, checkPointMessage, address3, trackingPackageStatus, shipmentUpdate.getUpdateTimeDescription());
                }
                if (trackingStatusUpdate != null) {
                    arrayList5.add(trackingStatusUpdate);
                }
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress destinationAddress = r37.getDestinationAddress();
        com.paypal.oslo.feature.packagetracking.domain.model.Address address4 = destinationAddress != null ? new com.paypal.oslo.feature.packagetracking.domain.model.Address(destinationAddress.getAdminArea2(), destinationAddress.getAdminArea1(), destinationAddress.getCountryCode().toString(), destinationAddress.getPostalCode(), null, null, 48, null) : null;
        boolean markedAsDelivered = r37.getMarkedAsDelivered();
        java.lang.String packageNickname = r37.getPackageNickname();
        java.lang.String orderNumber = r37.getOrderNumber();
        java.lang.Object orderManagementUrl = r37.getOrderManagementUrl();
        java.lang.String obj2 = orderManagementUrl != null ? orderManagementUrl.toString() : null;
        java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item> items = r37.getItems();
        if (items != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it = items.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item item = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item) it.next();
                java.util.Iterator it2 = it;
                java.lang.String name3 = item.getName();
                java.lang.Integer quantity = item.getQuantity();
                java.lang.Object imageUrl = item.getImageUrl();
                java.lang.String obj3 = imageUrl != null ? imageUrl.toString() : null;
                java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> tags = item.getTags();
                if (tags != null) {
                    z2 = markedAsDelivered;
                    java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list3 = tags;
                    address2 = address4;
                    str3 = obj;
                    list2 = arrayList;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    java.util.Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList7.add(((com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag) it3.next()).getRawValue());
                    }
                    arrayList4 = arrayList7;
                } else {
                    str3 = obj;
                    list2 = arrayList;
                    address2 = address4;
                    z2 = markedAsDelivered;
                    arrayList4 = null;
                }
                if (arrayList4 == null) {
                    arrayList4 = kotlin.collections.CollectionsKt.emptyList();
                }
                arrayList6.add(new com.paypal.oslo.feature.packagetracking.domain.model.Item(name3, quantity, obj3, arrayList4));
                address4 = address2;
                it = it2;
                markedAsDelivered = z2;
                arrayList = list2;
                obj = str3;
            }
            str2 = obj;
            list = arrayList;
            address = address4;
            z = markedAsDelivered;
            arrayList2 = arrayList6;
        } else {
            str2 = obj;
            list = arrayList;
            address = address4;
            z = markedAsDelivered;
            arrayList2 = null;
        }
        java.util.List emptyList = arrayList2 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList2;
        com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant merchant3 = r37.getMerchant();
        if (merchant3 != null) {
            if (merchant3.getOnMerchant() != null || merchant3.getOnShipmentPackageExternalMerchant() == null) {
                merchant2 = null;
            } else {
                java.lang.String name4 = merchant3.getOnShipmentPackageExternalMerchant().getName();
                java.lang.Object logoImageUrl2 = merchant3.getOnShipmentPackageExternalMerchant().getLogoImageUrl();
                merchant2 = new com.paypal.oslo.feature.packagetracking.domain.model.Merchant(name4, logoImageUrl2 != null ? logoImageUrl2.toString() : null);
            }
            merchant = merchant2;
        } else {
            merchant = null;
        }
        java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> tags2 = r37.getTags();
        if (tags2 != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> list4 = tags2;
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            java.util.Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList8.add(((com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag) it4.next()).getRawValue());
            }
            arrayList3 = arrayList8;
        } else {
            arrayList3 = null;
        }
        java.util.List emptyList2 = arrayList3 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList3;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageSource = r37.getPackageSource();
        return new com.paypal.oslo.feature.packagetracking.domain.model.PackageData(trackingNumber, trackingNumber2, null, str, carrier, transactionNumber, highSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI2, statusMessage, highResolutionOutputSizeshNQ4ISI3, str2, list, address, z, packageNickname, orderNumber, obj2, emptyList, merchant, emptyList2, packageSource != null ? packageSource.getRawValue() : null, null, null, false, null, r37.getExceptionSummary(), r37.getExceptionDetails(), 25165828, null);
    }

    private static final java.time.ZonedDateTime getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        try {
            return java.time.ZonedDateTime.parse(obj.toString());
        } catch (java.time.format.DateTimeParseException unused) {
            return null;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.IN_TRANSIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.OUT_FOR_DELIVERY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.DELIVERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.PENDING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.EXCEPTION.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.INFORMATION_RECEIVED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.ATTEMPT_FAILED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.EXPIRED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.MANIFEST.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.PICKED_UP.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.PICKUP_MISSED.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.READY_FOR_PICKUP.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.UNDEFINED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.CANCELED.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.AMAZON_ORDER_CONFIRMATION.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.AMAZON_SHIPMENT_CONFIRMATION.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.AMAZON_OUT_FOR_DELIVERY.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.AMAZON_DELIVERY_CONFIRMATION.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.AMAZON_ORDER_CANCELLATION.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.UNKNOWN__.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
