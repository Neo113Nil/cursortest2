package com.paypal.oslo.feature.activity.domain.common.extensions;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\"\u001a\u0004\u0018\u00010 *\u00060\u001dj\u0002`\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010&\u001a\u00060$j\u0002`%*\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010'*\n\u0010(\"\u00020$2\u00020$"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;", "toDto", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "toPackageDetailsDestinationsKey", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "", "sourcePage", "Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityTransactionDetailScreenDestinationKey;", "toActivityDetailDestinationKey", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityTransactionDetailScreenDestinationKey;", "Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityLedgerTabbedScreenDestinationKey;", "Lcom/paypal/oslo/feature/activity/domain/common/deeplink/ActivityLedgerDeepLinkDto;", "toActivityLedgerDeepLinkDto", "(Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityLedgerTabbedScreenDestinationKey;)Lcom/paypal/oslo/feature/activity/domain/common/deeplink/ActivityLedgerDeepLinkDto;", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "", "shouldShowFilterEmptyState", "(Ljava/util/List;)Z", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;", "toActivityWidgetFullScreenDto", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;)Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;", "Lcom/paypal/oslo/core/userstore/model/User;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityUserProfile;", "toUserProfile", "(Lcom/paypal/oslo/core/userstore/model/User;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityUserProfile;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", "", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "supportedActions", "getActionHandlerType", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;Ljava/util/Set;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "Lcom/paypal/oslo/feature/activity/domain/common/extensions/XoomTransactionDestinationKey;", "toXoomTransactionDestinationKey", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "XoomTransactionDestinationKey"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityExtensionsKt {
    public static final com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto toDto(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        java.lang.String id = activityTransactionModel.getId();
        java.lang.String groupId = activityTransactionModel.getGroupId();
        java.lang.String name2 = activityTransactionModel.getType().name();
        java.lang.String transactionShortDescription = activityTransactionModel.getTransactionShortDescription();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain subdomain = activityTransactionModel.getSubdomain();
        java.lang.String id2 = subdomain != null ? subdomain.getId() : null;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain subdomain2 = activityTransactionModel.getSubdomain();
        return new com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto(id, groupId, name2, transactionShortDescription, (java.lang.String) null, (java.lang.String) null, id2, (subdomain2 == null || (type = subdomain2.getType()) == null) ? null : type.getRawValue(), 48, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination toPackageDetailsDestinationsKey(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier shippingCarrier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> shipmentPackages = activityTransactionModel.getShipmentPackages();
        java.lang.String str = null;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage activityShipmentPackage = shipmentPackages != null ? (com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) shipmentPackages) : null;
        java.lang.String trackingNumber = activityShipmentPackage != null ? activityShipmentPackage.getTrackingNumber() : null;
        java.lang.String str2 = trackingNumber == null ? "" : trackingNumber;
        if (activityShipmentPackage != null && (shippingCarrier = activityShipmentPackage.getShippingCarrier()) != null) {
            str = shippingCarrier.getId();
        }
        return new com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination("activity_details", str2, str == null ? "" : str, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey toActivityDetailDestinationKey(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, java.lang.String str) {
        com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String id = activityTransactionModel.getId();
        java.lang.String id2 = activityTransactionModel.getId();
        java.lang.String groupId = activityTransactionModel.getGroupId();
        java.lang.String name2 = activityTransactionModel.getType().name();
        java.lang.String name3 = activityTransactionModel.getType().name();
        java.lang.String transactionShortDescription = activityTransactionModel.getTransactionShortDescription();
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> shipmentPackages = activityTransactionModel.getShipmentPackages();
        boolean z = shipmentPackages == null || shipmentPackages.isEmpty();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain subdomain = activityTransactionModel.getSubdomain();
        java.lang.String id3 = subdomain != null ? subdomain.getId() : null;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain subdomain2 = activityTransactionModel.getSubdomain();
        return new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey((java.lang.String) null, id, id2, groupId, name2, name3, transactionShortDescription, str, str, java.lang.String.valueOf(!z), id3, (subdomain2 == null || (type = subdomain2.getType()) == null) ? null : type.toString(), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto toActivityLedgerDeepLinkDto(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey payPalActivityLedgerTabbedScreenDestinationKey) {
        return new com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto(payPalActivityLedgerTabbedScreenDestinationKey != null ? payPalActivityLedgerTabbedScreenDestinationKey.getStartDate() : null, payPalActivityLedgerTabbedScreenDestinationKey != null ? payPalActivityLedgerTabbedScreenDestinationKey.getEndDate() : null);
    }

    public static final boolean shouldShowFilterEmptyState(java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) it.next()) instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader) {
                return list.size() <= 1;
            }
        }
        return false;
    }

    public static final com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto toActivityWidgetFullScreenDto(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetConfiguration, "");
        return new com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto(activityWidgetConfiguration.getSource(), activityWidgetConfiguration.getFiltersConfig(), activityWidgetConfiguration.getContentConfig(), activityWidgetConfiguration.getDataTransformer());
    }

    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile toUserProfile(com.paypal.oslo.core.userstore.model.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        return new com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile(com.paypal.oslo.feature.activity.domain.common.models.AccountType.INSTANCE.fromString(user.getAccountType()));
    }

    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType getActionHandlerType(com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, java.util.Set<? extends com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType> set) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType) obj).getActions().contains(activityActionType)) {
                break;
            }
        }
        return (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType) obj;
    }

    public static final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination toXoomTransactionDestinationKey(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        java.lang.String id;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        java.lang.String invoiceId = activityTransactionModel.getInvoiceId();
        if (invoiceId == null) {
            invoiceId = activityTransactionModel.getId();
        }
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo = activityTransactionModel.getActivityPartnerInfo();
        if (activityPartnerInfo == null || (id = activityPartnerInfo.getPartnerId()) == null) {
            id = activityTransactionModel.getId();
        }
        return new com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination(invoiceId, id, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_XOOM_SOURCE);
    }
}
