package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jb\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/ComputePackageDisplayDataUseCase;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "packageData", "", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "linkedEmailProviders", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "unlinkedProviders", "Lkotlin/Pair;", "", "hasSeenUnlinkList", "paypalAccountEmail", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "invoke", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDisplayData;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComputePackageDisplayDataUseCase {
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public ComputePackageDisplayDataUseCase(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.Camera2StreamConfigurationMap = featureGate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData invoke$default(com.paypal.oslo.feature.packagetracking.domain.usecase.ComputePackageDisplayDataUseCase computePackageDisplayDataUseCase, com.paypal.oslo.feature.packagetracking.domain.model.PackageData packageData, java.util.List list, java.util.List list2, java.util.List list3, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list4 = list;
        if ((i & 4) != 0) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list5 = list2;
        if ((i & 8) != 0) {
            list3 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list6 = list3;
        if ((i & 16) != 0) {
            emailProvider = null;
        }
        return computePackageDisplayDataUseCase.invoke(packageData, list4, list5, list6, emailProvider);
    }

    private final boolean getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.packagetracking.domain.model.PackageData p0) {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.INSTANCE.getPrimeShipmentEnabled()) && p0.getTags().contains("PRIME_SHIPMENT");
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.packagetracking.domain.model.PackageData p0) {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.INSTANCE.getAmazonOrdersEnabled()) && p0.getTags().contains("AMAZON_ORDER");
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x03e7, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r7) == false) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x042c A[LOOP:4: B:154:0x0426->B:156:0x042c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0455 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0533 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData invoke(com.paypal.oslo.feature.packagetracking.domain.model.PackageData packageData, java.util.List<? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> linkedEmailProviders, java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> unlinkedProviders, java.util.List<? extends kotlin.Pair<? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider, java.lang.Boolean>> hasSeenUnlinkList, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider paypalAccountEmail) {
        boolean z;
        com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo packageDetailsProgressInfo;
        com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo packageDetailsProgressInfo2;
        com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo packageDetailsProgressInfo3;
        com.paypal.oslo.feature.packagetracking.domain.model.Address location;
        java.lang.String str;
        com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource invoke;
        java.util.Iterator<T> it;
        java.lang.String str2;
        int i;
        int i2;
        java.lang.String str3;
        char c;
        java.lang.String str4;
        boolean z2;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType;
        int i3;
        java.lang.String str5 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedEmailProviders, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unlinkedProviders, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hasSeenUnlinkList, "");
        int i4 = 1;
        boolean z3 = packageData.getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.DELIVERED || packageData.getMarkedAsDelivered();
        boolean z4 = z3 ? false : !packageData.getTags().contains("PRIME_SHIPMENT");
        java.util.List<? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> list = linkedEmailProviders;
        if (list.isEmpty()) {
            list = kotlin.collections.CollectionsKt.listOfNotNull(packageData.getLinkedEmailProvider());
        }
        java.util.List<? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list3 = unlinkedProviders;
        java.util.Iterator<T> it2 = list3.iterator();
        while (true) {
            char c2 = 2;
            if (!it2.hasNext()) {
                if (linkedEmailProviders.isEmpty()) {
                    java.util.ArrayList<com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner> arrayList2 = arrayList;
                    if (!arrayList2.isEmpty()) {
                        for (com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner infoBanner : arrayList2) {
                            if (infoBanner.getType() == com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType.UNLINK_BY_SYSTEM || infoBanner.getType() == com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType.UNLINK_BY_USER) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (!(z2 | (!arrayList.isEmpty()))) {
                        z = true;
                        java.lang.String estimatedDeliveryDateDisplayText = packageData.getEstimatedDeliveryDateDisplayText();
                        switch (com.paypal.oslo.feature.packagetracking.domain.usecase.ComputePackageDisplayDataUseCase.WhenMappings.$EnumSwitchMapping$2[packageData.getStatus().ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                packageDetailsProgressInfo = new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo(0.0f, com.paypal.pds.components.ProgressBarStyle.Brand.INSTANCE, com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_status_label_prepping));
                                packageDetailsProgressInfo3 = packageDetailsProgressInfo;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                packageDetailsProgressInfo = new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo(0.0f, com.paypal.pds.components.ProgressBarStyle.Brand.INSTANCE, com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_status_label_waiting_for_info));
                                packageDetailsProgressInfo3 = packageDetailsProgressInfo;
                                break;
                            case 7:
                                packageDetailsProgressInfo2 = new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo(33.0f, com.paypal.pds.components.ProgressBarStyle.Brand.INSTANCE, com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_status_label_shipped));
                                packageDetailsProgressInfo3 = packageDetailsProgressInfo2;
                                break;
                            case 8:
                            case 9:
                            case 10:
                                packageDetailsProgressInfo = new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo(66.0f, com.paypal.pds.components.ProgressBarStyle.Warning.INSTANCE, com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_status_label_carrier_update));
                                packageDetailsProgressInfo3 = packageDetailsProgressInfo;
                                break;
                            case 11:
                                packageDetailsProgressInfo = new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo(66.0f, com.paypal.pds.components.ProgressBarStyle.Brand.INSTANCE, com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_status_label_out_for_delivery));
                                packageDetailsProgressInfo3 = packageDetailsProgressInfo;
                                break;
                            case 12:
                                packageDetailsProgressInfo = new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo(66.0f, com.paypal.pds.components.ProgressBarStyle.Brand.INSTANCE, com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_status_label_pickup_required));
                                packageDetailsProgressInfo3 = packageDetailsProgressInfo;
                                break;
                            case 13:
                                packageDetailsProgressInfo2 = new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo(100.0f, com.paypal.pds.components.ProgressBarStyle.Positive.INSTANCE, com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_status_label_delivered));
                                packageDetailsProgressInfo3 = packageDetailsProgressInfo2;
                                break;
                            default:
                                packageDetailsProgressInfo3 = null;
                                break;
                        }
                        java.lang.String exceptionDetails = packageData.getExceptionDetails();
                        boolean z5 = !(exceptionDetails != null || exceptionDetails.length() == 0);
                        java.lang.String transactionNumber = packageData.getTransactionNumber();
                        boolean z6 = transactionNumber != null || kotlin.text.StringsKt.isBlank(transactionNumber);
                        java.lang.Integer displayItemCount = packageData.getDisplayItemCount();
                        boolean z7 = z6 && !getHighResolutionOutputSizeshNQ4ISI(packageData) && (displayItemCount == null && displayItemCount.intValue() >= 2);
                        java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate> events = packageData.getEvents();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(events, 10));
                        int i5 = 0;
                        for (java.lang.Object obj : events) {
                            if (i5 < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate trackingStatusUpdate = (com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate) obj;
                            com.paypal.oslo.feature.packagetracking.domain.model.Address location2 = trackingStatusUpdate.getLocation();
                            if (location2 != null) {
                                java.lang.String[] strArr = new java.lang.String[3];
                                java.lang.String city = location2.getCity();
                                if (city == null || kotlin.text.StringsKt.isBlank(city)) {
                                    city = null;
                                }
                                strArr[0] = city;
                                java.lang.String state = location2.getState();
                                if (state == null || kotlin.text.StringsKt.isBlank(state)) {
                                    state = null;
                                }
                                strArr[1] = state;
                                java.lang.String countryCode = location2.getCountryCode();
                                if (countryCode == null || kotlin.text.StringsKt.isBlank(countryCode)) {
                                    countryCode = null;
                                }
                                c = 2;
                                strArr[2] = countryCode;
                                java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr), ", ", null, null, 0, null, null, 62, null);
                                if (joinToString$default.length() == 0) {
                                    joinToString$default = null;
                                }
                                str4 = joinToString$default;
                            } else {
                                c = c2;
                                str4 = null;
                            }
                            java.lang.String timeDisplayText = trackingStatusUpdate.getTimeDisplayText();
                            if (timeDisplayText == null || kotlin.text.StringsKt.isBlank(timeDisplayText)) {
                                timeDisplayText = null;
                            }
                            java.lang.String joinToString$default2 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{timeDisplayText, str4}), " · ", null, null, 0, null, null, 62, null);
                            if (joinToString$default2.length() == 0) {
                                joinToString$default2 = null;
                            }
                            arrayList3.add(new com.paypal.pds.components.TimelineVerticalItem(trackingStatusUpdate.getDescription(), i5 == 0 ? com.paypal.pds.components.TimelineState.Success.INSTANCE : com.paypal.pds.components.TimelineState.INSTANCE.getInProgress(), joinToString$default2, null, null, null, 56, null));
                            i5++;
                            c2 = c;
                        }
                        java.util.ArrayList arrayList4 = arrayList3;
                        com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Loading loading = com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Loading.INSTANCE;
                        boolean contains = packageData.getTags().contains("PRIME_SHIPMENT");
                        if (!z3) {
                            location = packageData.getDestinationAddress();
                        } else if (contains) {
                            location = packageData.getDestinationAddress();
                        } else {
                            com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate trackingStatusUpdate2 = (com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) packageData.getEvents());
                            location = trackingStatusUpdate2 != null ? trackingStatusUpdate2.getLocation() : null;
                        }
                        if (location != null) {
                            java.lang.String city2 = location.getCity();
                            java.lang.String state2 = location.getState();
                            java.lang.String str6 = city2;
                            if (str6 == null || kotlin.text.StringsKt.isBlank(str6) || (str3 = state2) == null || kotlin.text.StringsKt.isBlank(str3)) {
                                if (str6 != null && !kotlin.text.StringsKt.isBlank(str6)) {
                                    str = city2;
                                    if (!z3) {
                                        invoke = com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_delivered_destination);
                                    } else if (z4) {
                                        invoke = com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_current_location);
                                    } else {
                                        invoke = com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_delivery_destination);
                                    }
                                    com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource = invoke;
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                                    it = list3.iterator();
                                    while (it.hasNext()) {
                                        arrayList5.add(((com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) it.next()).getProvider());
                                    }
                                    com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData emailAccountsData = new com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData(list2, arrayList5, paypalAccountEmail);
                                    boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(packageData);
                                    boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(packageData);
                                    boolean highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(packageData);
                                    boolean z8 = (getHighResolutionOutputSizeshNQ4ISI(packageData) || z3 || !packageData.getTags().contains("AMAZON_ORDER_NOT_DELIVERED")) ? false : true;
                                    java.lang.String id = packageData.getId();
                                    java.lang.String packageSource = packageData.getPackageSource();
                                    java.lang.String carrierId = packageData.getCarrierId();
                                    com.paypal.oslo.feature.packagetracking.domain.model.Carrier carrier = packageData.getCarrier();
                                    java.lang.String name2 = carrier == null ? carrier.getName() : null;
                                    com.paypal.oslo.feature.packagetracking.domain.model.Carrier carrier2 = packageData.getCarrier();
                                    java.lang.String logoUrl = carrier2 == null ? carrier2.getLogoUrl() : null;
                                    java.lang.String transactionNumber2 = packageData.getTransactionNumber();
                                    java.lang.String trackingNumber = packageData.getTrackingNumber();
                                    java.lang.String trackingUrl = packageData.getTrackingUrl();
                                    com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus status = packageData.getStatus();
                                    com.paypal.oslo.feature.packagetracking.domain.UiString displayHeaderText = packageData.getDisplayHeaderText();
                                    java.lang.Integer displayItemCount2 = packageData.getDisplayItemCount();
                                    com.paypal.oslo.feature.packagetracking.domain.model.Merchant merchant = packageData.getMerchant();
                                    java.lang.String logoUrl2 = merchant == null ? merchant.getLogoUrl() : null;
                                    java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.Item> items = packageData.getItems();
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
                                    for (com.paypal.oslo.feature.packagetracking.domain.model.Item item : items) {
                                        java.lang.String name3 = item.getName();
                                        if (name3 == null) {
                                            name3 = str5;
                                        }
                                        java.lang.Integer quantity = item.getQuantity();
                                        if (quantity != null) {
                                            int intValue = quantity.intValue();
                                            i2 = 1;
                                            str2 = str5;
                                            i = intValue;
                                        } else {
                                            str2 = str5;
                                            i = 1;
                                            i2 = 1;
                                        }
                                        arrayList6.add(new com.paypal.oslo.feature.packagetracking.domain.model.AmazonOrderItemInfo(name3, kotlin.ranges.RangesKt.coerceAtLeast(i, i2), item.getImageUrl()));
                                        str5 = str2;
                                    }
                                    java.util.ArrayList arrayList7 = arrayList6;
                                    java.lang.String orderNumber = packageData.getOrderNumber();
                                    java.lang.String exceptionSummary = packageData.getExceptionSummary();
                                    java.lang.String exceptionDetails2 = packageData.getExceptionDetails();
                                    boolean z9 = !getHighResolutionOutputSizeshNQ4ISI(packageData) || getHighSpeedVideoFpsRanges(packageData);
                                    java.lang.String orderManagementUrl = packageData.getOrderManagementUrl();
                                    return new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData(arrayList, estimatedDeliveryDateDisplayText, z5, z7, packageDetailsProgressInfo3, z3, arrayList4, loading, str, emailAccountsData, highResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI2, z8, stringResource, z4, id, packageSource, carrierId, name2, logoUrl, transactionNumber2, trackingNumber, trackingUrl, status, displayHeaderText, displayItemCount2, z, logoUrl2, arrayList7, (orderManagementUrl == null && z9 && orderManagementUrl.length() > 0) ? orderManagementUrl : null, orderNumber, exceptionSummary, exceptionDetails2);
                                }
                                java.lang.String str7 = state2;
                                if (str7 != null) {
                                }
                            } else {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(city2);
                                sb.append(", ");
                                sb.append(state2);
                                state2 = sb.toString();
                            }
                            str = state2;
                            if (!z3) {
                            }
                            com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource2 = invoke;
                            java.util.ArrayList arrayList52 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                            it = list3.iterator();
                            while (it.hasNext()) {
                            }
                            com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData emailAccountsData2 = new com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData(list2, arrayList52, paypalAccountEmail);
                            boolean highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(packageData);
                            boolean highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(packageData);
                            boolean highResolutionOutputSizeshNQ4ISI22 = getHighResolutionOutputSizeshNQ4ISI(packageData);
                            if (getHighResolutionOutputSizeshNQ4ISI(packageData)) {
                            }
                            java.lang.String id2 = packageData.getId();
                            java.lang.String packageSource2 = packageData.getPackageSource();
                            java.lang.String carrierId2 = packageData.getCarrierId();
                            com.paypal.oslo.feature.packagetracking.domain.model.Carrier carrier3 = packageData.getCarrier();
                            if (carrier3 == null) {
                            }
                            com.paypal.oslo.feature.packagetracking.domain.model.Carrier carrier22 = packageData.getCarrier();
                            if (carrier22 == null) {
                            }
                            java.lang.String transactionNumber22 = packageData.getTransactionNumber();
                            java.lang.String trackingNumber2 = packageData.getTrackingNumber();
                            java.lang.String trackingUrl2 = packageData.getTrackingUrl();
                            com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus status2 = packageData.getStatus();
                            com.paypal.oslo.feature.packagetracking.domain.UiString displayHeaderText2 = packageData.getDisplayHeaderText();
                            java.lang.Integer displayItemCount22 = packageData.getDisplayItemCount();
                            com.paypal.oslo.feature.packagetracking.domain.model.Merchant merchant2 = packageData.getMerchant();
                            if (merchant2 == null) {
                            }
                            java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.Item> items2 = packageData.getItems();
                            java.util.ArrayList arrayList62 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items2, 10));
                            while (r7.hasNext()) {
                            }
                            java.util.ArrayList arrayList72 = arrayList62;
                            java.lang.String orderNumber2 = packageData.getOrderNumber();
                            java.lang.String exceptionSummary2 = packageData.getExceptionSummary();
                            java.lang.String exceptionDetails22 = packageData.getExceptionDetails();
                            if (getHighResolutionOutputSizeshNQ4ISI(packageData)) {
                            }
                            java.lang.String orderManagementUrl2 = packageData.getOrderManagementUrl();
                            return new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData(arrayList, estimatedDeliveryDateDisplayText, z5, z7, packageDetailsProgressInfo3, z3, arrayList4, loading, str, emailAccountsData2, highResolutionOutputSizeshNQ4ISI3, highSpeedVideoFpsRanges2, highResolutionOutputSizeshNQ4ISI22, z8, stringResource2, z4, id2, packageSource2, carrierId2, name2, logoUrl, transactionNumber22, trackingNumber2, trackingUrl2, status2, displayHeaderText2, displayItemCount22, z, logoUrl2, arrayList72, (orderManagementUrl2 == null && z9 && orderManagementUrl2.length() > 0) ? orderManagementUrl2 : null, orderNumber2, exceptionSummary2, exceptionDetails22);
                        }
                        str = null;
                        if (!z3) {
                        }
                        com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource22 = invoke;
                        java.util.ArrayList arrayList522 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                        }
                        com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData emailAccountsData22 = new com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData(list2, arrayList522, paypalAccountEmail);
                        boolean highResolutionOutputSizeshNQ4ISI32 = getHighResolutionOutputSizeshNQ4ISI(packageData);
                        boolean highSpeedVideoFpsRanges22 = getHighSpeedVideoFpsRanges(packageData);
                        boolean highResolutionOutputSizeshNQ4ISI222 = getHighResolutionOutputSizeshNQ4ISI(packageData);
                        if (getHighResolutionOutputSizeshNQ4ISI(packageData)) {
                        }
                        java.lang.String id22 = packageData.getId();
                        java.lang.String packageSource22 = packageData.getPackageSource();
                        java.lang.String carrierId22 = packageData.getCarrierId();
                        com.paypal.oslo.feature.packagetracking.domain.model.Carrier carrier32 = packageData.getCarrier();
                        if (carrier32 == null) {
                        }
                        com.paypal.oslo.feature.packagetracking.domain.model.Carrier carrier222 = packageData.getCarrier();
                        if (carrier222 == null) {
                        }
                        java.lang.String transactionNumber222 = packageData.getTransactionNumber();
                        java.lang.String trackingNumber22 = packageData.getTrackingNumber();
                        java.lang.String trackingUrl22 = packageData.getTrackingUrl();
                        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus status22 = packageData.getStatus();
                        com.paypal.oslo.feature.packagetracking.domain.UiString displayHeaderText22 = packageData.getDisplayHeaderText();
                        java.lang.Integer displayItemCount222 = packageData.getDisplayItemCount();
                        com.paypal.oslo.feature.packagetracking.domain.model.Merchant merchant22 = packageData.getMerchant();
                        if (merchant22 == null) {
                        }
                        java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.Item> items22 = packageData.getItems();
                        java.util.ArrayList arrayList622 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items22, 10));
                        while (r7.hasNext()) {
                        }
                        java.util.ArrayList arrayList722 = arrayList622;
                        java.lang.String orderNumber22 = packageData.getOrderNumber();
                        java.lang.String exceptionSummary22 = packageData.getExceptionSummary();
                        java.lang.String exceptionDetails222 = packageData.getExceptionDetails();
                        if (getHighResolutionOutputSizeshNQ4ISI(packageData)) {
                        }
                        java.lang.String orderManagementUrl22 = packageData.getOrderManagementUrl();
                        return new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData(arrayList, estimatedDeliveryDateDisplayText, z5, z7, packageDetailsProgressInfo3, z3, arrayList4, loading, str, emailAccountsData22, highResolutionOutputSizeshNQ4ISI32, highSpeedVideoFpsRanges22, highResolutionOutputSizeshNQ4ISI222, z8, stringResource22, z4, id22, packageSource22, carrierId22, name2, logoUrl, transactionNumber222, trackingNumber22, trackingUrl22, status22, displayHeaderText22, displayItemCount222, z, logoUrl2, arrayList722, (orderManagementUrl22 == null && z9 && orderManagementUrl22.length() > 0) ? orderManagementUrl22 : null, orderNumber22, exceptionSummary22, exceptionDetails222);
                    }
                }
                z = false;
                java.lang.String estimatedDeliveryDateDisplayText2 = packageData.getEstimatedDeliveryDateDisplayText();
                switch (com.paypal.oslo.feature.packagetracking.domain.usecase.ComputePackageDisplayDataUseCase.WhenMappings.$EnumSwitchMapping$2[packageData.getStatus().ordinal()]) {
                }
                java.lang.String exceptionDetails3 = packageData.getExceptionDetails();
                boolean z52 = !(exceptionDetails3 != null || exceptionDetails3.length() == 0);
                java.lang.String transactionNumber3 = packageData.getTransactionNumber();
                if (transactionNumber3 != null) {
                }
                java.lang.Integer displayItemCount3 = packageData.getDisplayItemCount();
                if (z6) {
                }
                java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate> events2 = packageData.getEvents();
                java.util.ArrayList arrayList32 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(events2, 10));
                int i52 = 0;
                while (r0.hasNext()) {
                }
                java.util.ArrayList arrayList42 = arrayList32;
                com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Loading loading2 = com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Loading.INSTANCE;
                boolean contains2 = packageData.getTags().contains("PRIME_SHIPMENT");
                if (!z3) {
                }
                if (location != null) {
                }
                str = null;
                if (!z3) {
                }
                com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource222 = invoke;
                java.util.ArrayList arrayList5222 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                }
                com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData emailAccountsData222 = new com.paypal.oslo.feature.packagetracking.domain.model.display.EmailAccountsData(list2, arrayList5222, paypalAccountEmail);
                boolean highResolutionOutputSizeshNQ4ISI322 = getHighResolutionOutputSizeshNQ4ISI(packageData);
                boolean highSpeedVideoFpsRanges222 = getHighSpeedVideoFpsRanges(packageData);
                boolean highResolutionOutputSizeshNQ4ISI2222 = getHighResolutionOutputSizeshNQ4ISI(packageData);
                if (getHighResolutionOutputSizeshNQ4ISI(packageData)) {
                }
                java.lang.String id222 = packageData.getId();
                java.lang.String packageSource222 = packageData.getPackageSource();
                java.lang.String carrierId222 = packageData.getCarrierId();
                com.paypal.oslo.feature.packagetracking.domain.model.Carrier carrier322 = packageData.getCarrier();
                if (carrier322 == null) {
                }
                com.paypal.oslo.feature.packagetracking.domain.model.Carrier carrier2222 = packageData.getCarrier();
                if (carrier2222 == null) {
                }
                java.lang.String transactionNumber2222 = packageData.getTransactionNumber();
                java.lang.String trackingNumber222 = packageData.getTrackingNumber();
                java.lang.String trackingUrl222 = packageData.getTrackingUrl();
                com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus status222 = packageData.getStatus();
                com.paypal.oslo.feature.packagetracking.domain.UiString displayHeaderText222 = packageData.getDisplayHeaderText();
                java.lang.Integer displayItemCount2222 = packageData.getDisplayItemCount();
                com.paypal.oslo.feature.packagetracking.domain.model.Merchant merchant222 = packageData.getMerchant();
                if (merchant222 == null) {
                }
                java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.Item> items222 = packageData.getItems();
                java.util.ArrayList arrayList6222 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items222, 10));
                while (r7.hasNext()) {
                }
                java.util.ArrayList arrayList7222 = arrayList6222;
                java.lang.String orderNumber222 = packageData.getOrderNumber();
                java.lang.String exceptionSummary222 = packageData.getExceptionSummary();
                java.lang.String exceptionDetails2222 = packageData.getExceptionDetails();
                if (getHighResolutionOutputSizeshNQ4ISI(packageData)) {
                }
                java.lang.String orderManagementUrl222 = packageData.getOrderManagementUrl();
                return new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData(arrayList, estimatedDeliveryDateDisplayText2, z52, z7, packageDetailsProgressInfo3, z3, arrayList42, loading2, str, emailAccountsData222, highResolutionOutputSizeshNQ4ISI322, highSpeedVideoFpsRanges222, highResolutionOutputSizeshNQ4ISI2222, z8, stringResource222, z4, id222, packageSource222, carrierId222, name2, logoUrl, transactionNumber2222, trackingNumber222, trackingUrl222, status222, displayHeaderText222, displayItemCount2222, z, logoUrl2, arrayList7222, (orderManagementUrl222 == null && z9 && orderManagementUrl222.length() > 0) ? orderManagementUrl222 : null, orderNumber222, exceptionSummary222, exceptionDetails2222);
            }
            com.paypal.oslo.feature.packagetracking.domain.model.EmailLink emailLink = (com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) it2.next();
            com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus status3 = emailLink.getStatus();
            int i6 = status3 == null ? -1 : com.paypal.oslo.feature.packagetracking.domain.usecase.ComputePackageDisplayDataUseCase.WhenMappings.$EnumSwitchMapping$0[status3.ordinal()];
            if (i6 == i4) {
                bannerType = com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType.UNLINK_BY_SYSTEM;
            } else if (i6 == 2) {
                bannerType = com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType.UNLINK_BY_USER;
            } else {
                bannerType = com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType.NONE;
            }
            com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType2 = bannerType;
            int i7 = com.paypal.oslo.feature.packagetracking.domain.usecase.ComputePackageDisplayDataUseCase.WhenMappings.$EnumSwitchMapping$1[emailLink.getProvider().ordinal()];
            if (i7 == i4) {
                i3 = com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_unlink_gmail;
            } else {
                if (i7 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                i3 = com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_unlink_outlook;
            }
            java.util.List<? extends kotlin.Pair<? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider, java.lang.Boolean>> list4 = hasSeenUnlinkList;
            if (!(list4 instanceof java.util.Collection) || !list4.isEmpty()) {
                java.util.Iterator<T> it3 = list4.iterator();
                while (it3.hasNext()) {
                    kotlin.Pair pair = (kotlin.Pair) it3.next();
                    if (pair.getFirst() != emailLink.getProvider() || !kotlin.jvm.internal.Intrinsics.areEqual(pair.getSecond(), java.lang.Boolean.TRUE)) {
                    }
                }
            }
            java.lang.String lowerCase = emailLink.getProvider().name().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unlink-");
            sb2.append(lowerCase);
            sb2.append("-banner");
            arrayList.add(new com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner(sb2.toString(), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(i3), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_unlink_description), bannerType2, emailLink.getProvider()));
            i4 = 1;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.UNLINKED_BY_SYSTEM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.UNLINKED_BY_USER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.values().length];
            try {
                iArr2[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.OUTLOOK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.values().length];
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.INFORMATION_RECEIVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.MANIFEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.PICKED_UP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.UNDEFINED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.PENDING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.EXPIRED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.IN_TRANSIT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.ATTEMPT_FAILED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.EXCEPTION.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.PICKUP_MISSED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.OUT_FOR_DELIVERY.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.READY_FOR_PICKUP.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr3[com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.DELIVERED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
