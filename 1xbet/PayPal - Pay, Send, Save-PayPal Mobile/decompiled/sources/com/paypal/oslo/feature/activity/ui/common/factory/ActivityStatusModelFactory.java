package com.paypal.oslo.feature.activity.ui.common.factory;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u00020\f2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/common/factory/ActivityStatusModelFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityStatus;", "activityStatus", "", "displayMessage", "", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage;", "shipmentPackages", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityStatusModel;", "create$activity_prodRelease", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityStatusModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityStatusModelFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.ui.common.factory.ActivityStatusModelFactory INSTANCE = new com.paypal.oslo.feature.activity.ui.common.factory.ActivityStatusModelFactory();

    private ActivityStatusModelFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel create$activity_prodRelease$default(com.paypal.oslo.feature.activity.ui.common.factory.ActivityStatusModelFactory activityStatusModelFactory, com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return activityStatusModelFactory.create$activity_prodRelease(activityStatus, str, list);
    }

    public final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel create$activity_prodRelease(com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, java.lang.String displayMessage, java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> shipmentPackages) {
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel activityStatusModel;
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel activityStatusModel2;
        com.paypal.pds.core.Icon.ArrowUUpLeft arrowUUpLeft = null;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage activityShipmentPackage = shipmentPackages != null ? (com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) shipmentPackages) : null;
        java.lang.String statusMessage = activityShipmentPackage != null ? activityShipmentPackage.getStatusMessage() : null;
        if (statusMessage == null || kotlin.text.StringsKt.isBlank(statusMessage)) {
            activityStatusModel = null;
        } else {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus shipmentStatus = activityShipmentPackage.getShipmentStatus();
            java.lang.String statusMessage2 = activityShipmentPackage.getStatusMessage();
            int i = com.paypal.oslo.feature.activity.ui.common.factory.ActivityStatusModelFactory.WhenMappings.$EnumSwitchMapping$0[shipmentStatus.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                activityStatusModel2 = new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel(com.paypal.pds.components.BadgeStyle.Info.INSTANCE, com.paypal.pds.core.Icon.Package.INSTANCE, statusMessage2);
            } else if (i == 4) {
                activityStatusModel2 = new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel(com.paypal.pds.components.BadgeStyle.Positive.INSTANCE, com.paypal.pds.core.Icon.Package.INSTANCE, statusMessage2);
            } else if (i == 5) {
                activityStatusModel2 = new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel(com.paypal.pds.components.BadgeStyle.Warning.INSTANCE, com.paypal.pds.core.Icon.Package.INSTANCE, statusMessage2);
            } else {
                activityStatusModel = new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel(com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE, (com.paypal.pds.core.Icon) null, (java.lang.String) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
            activityStatusModel = activityStatusModel2;
        }
        if (activityStatusModel != null) {
            return activityStatusModel;
        }
        com.paypal.pds.components.BadgeStyle.Neutral neutral = com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE;
        java.lang.String str = displayMessage;
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            switch (activityStatus == null ? -1 : com.paypal.oslo.feature.activity.ui.common.factory.ActivityStatusModelFactory.WhenMappings.$EnumSwitchMapping$1[activityStatus.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    neutral = com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE;
                    arrowUUpLeft = com.paypal.pds.core.Icon.ArrowUUpLeft.INSTANCE;
                    break;
                case 4:
                case 5:
                case 6:
                    neutral = com.paypal.pds.components.BadgeStyle.Warning.INSTANCE;
                    arrowUUpLeft = com.paypal.pds.core.Icon.XCircle.INSTANCE;
                    break;
                case 7:
                    neutral = com.paypal.pds.components.BadgeStyle.Warning.INSTANCE;
                    arrowUUpLeft = com.paypal.pds.core.Icon.EyeSlash.INSTANCE;
                    break;
                case 8:
                    neutral = com.paypal.pds.components.BadgeStyle.Warning.INSTANCE;
                    arrowUUpLeft = com.paypal.pds.core.Icon.Warning.INSTANCE;
                    break;
                case 9:
                case 10:
                    neutral = com.paypal.pds.components.BadgeStyle.Warning.INSTANCE;
                    arrowUUpLeft = com.paypal.pds.core.Icon.Clock.INSTANCE;
                    break;
                case 11:
                    neutral = com.paypal.pds.components.BadgeStyle.Positive.INSTANCE;
                    arrowUUpLeft = com.paypal.pds.core.Icon.CheckCircle.INSTANCE;
                    break;
                default:
                    neutral = com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE;
                    break;
            }
        }
        kotlin.Pair pair = new kotlin.Pair(neutral, arrowUUpLeft);
        return new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel((com.paypal.pds.components.BadgeStyle) pair.component1(), (com.paypal.pds.core.Icon) pair.component2(), displayMessage);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.INFORMATION_RECEIVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.IN_TRANSIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.OUT_FOR_DELIVERY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.DELIVERED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.EXCEPTION.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.REFUNDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.PARTIALLY_REFUNDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.REVERSED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.CANCELED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.DENIED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.FAILED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.BLOCKED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.HELD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.PENDING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.UNCLAIMED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityStatus.COMPLETED.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
