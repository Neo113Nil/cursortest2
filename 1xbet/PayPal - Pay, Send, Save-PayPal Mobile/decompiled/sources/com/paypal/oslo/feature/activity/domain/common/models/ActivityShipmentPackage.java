package com.paypal.oslo.feature.activity.domain.common.models;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJf\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J'\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001dR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage;", "", "", "trackingNumber", "logoImageUrl", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityPackageTrackingStatus;", "shipmentStatus", "statusMessage", "deliveryTime", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShippingCarrier;", "shippingCarrier", "", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentItem;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityPackageTrackingStatus;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShippingCarrier;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityPackageTrackingStatus;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShippingCarrier;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityPackageTrackingStatus;", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShippingCarrier;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityPackageTrackingStatus;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShippingCarrier;Ljava/util/List;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTrackingNumber", "getLogoImageUrl", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityPackageTrackingStatus;", "getShipmentStatus", "getStatusMessage", "getDeliveryTime", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShippingCarrier;", "getShippingCarrier", "Ljava/util/List;", "getItems", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ActivityShipmentPackage {
    private final java.lang.String deliveryTime;
    private final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentItem> items;
    private final java.lang.String logoImageUrl;
    private final com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus shipmentStatus;
    private final com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier shippingCarrier;
    private final java.lang.String statusMessage;
    private final java.lang.String trackingNumber;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage.Companion INSTANCE = new com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage.m11778$r8$lambda$eEilP65u6MELNqX5qYm67MPpPE();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> serializer() {
            return com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivityShipmentPackage(int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 5, com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage$$serializer.INSTANCE.getDescriptor());
        }
        this.trackingNumber = str;
        if ((i & 2) == 0) {
            this.logoImageUrl = null;
        } else {
            this.logoImageUrl = str2;
        }
        this.shipmentStatus = activityPackageTrackingStatus;
        if ((i & 8) == 0) {
            this.statusMessage = null;
        } else {
            this.statusMessage = str3;
        }
        if ((i & 16) == 0) {
            this.deliveryTime = null;
        } else {
            this.deliveryTime = str4;
        }
        if ((i & 32) == 0) {
            this.shippingCarrier = null;
        } else {
            this.shippingCarrier = activityShippingCarrier;
        }
        if ((i & 64) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
    }

    public ActivityShipmentPackage(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier, java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentItem> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityPackageTrackingStatus, "");
        this.trackingNumber = str;
        this.logoImageUrl = str2;
        this.shipmentStatus = activityPackageTrackingStatus;
        this.statusMessage = str3;
        this.deliveryTime = str4;
        this.shippingCarrier = activityShippingCarrier;
        this.items = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_prodRelease(com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.trackingNumber);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.logoImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.logoImageUrl);
        }
        output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.shipmentStatus);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.statusMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.statusMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.deliveryTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.deliveryTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.shippingCarrier != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier$$serializer.INSTANCE, self.shippingCarrier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.items != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.items);
        }
    }

    public /* synthetic */ ActivityShipmentPackage(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, activityPackageTrackingStatus, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : activityShippingCarrier, (i & 64) != 0 ? null : list);
    }

    public final java.lang.String getTrackingNumber() {
        return this.trackingNumber;
    }

    public final java.lang.String getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus getShipmentStatus() {
        return this.shipmentStatus;
    }

    public final java.lang.String getStatusMessage() {
        return this.statusMessage;
    }

    public final java.lang.String getDeliveryTime() {
        return this.deliveryTime;
    }

    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier getShippingCarrier() {
        return this.shippingCarrier;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentItem> getItems() {
        return this.items;
    }

    /* renamed from: $r8$lambda$eEilP65u6MELN-qX5qYm67MPpPE, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m11778$r8$lambda$eEilP65u6MELNqX5qYm67MPpPE() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentItem$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.trackingNumber;
        java.lang.String str2 = this.logoImageUrl;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus = this.shipmentStatus;
        java.lang.String str3 = this.statusMessage;
        java.lang.String str4 = this.deliveryTime;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier = this.shippingCarrier;
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentItem> list = this.items;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityShipmentPackage(trackingNumber=");
        sb.append(str);
        sb.append(", logoImageUrl=");
        sb.append(str2);
        sb.append(", shipmentStatus=");
        sb.append(activityPackageTrackingStatus);
        sb.append(", statusMessage=");
        sb.append(str3);
        sb.append(", deliveryTime=");
        sb.append(str4);
        sb.append(", shippingCarrier=");
        sb.append(activityShippingCarrier);
        sb.append(", items=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.trackingNumber.hashCode();
        java.lang.String str = this.logoImageUrl;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.shipmentStatus.hashCode();
        java.lang.String str2 = this.statusMessage;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.deliveryTime;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier = this.shippingCarrier;
        int hashCode6 = activityShippingCarrier == null ? 0 : activityShippingCarrier.hashCode();
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentItem> list = this.items;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage activityShipmentPackage = (com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.trackingNumber, activityShipmentPackage.trackingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoImageUrl, activityShipmentPackage.logoImageUrl) && this.shipmentStatus == activityShipmentPackage.shipmentStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.statusMessage, activityShipmentPackage.statusMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.deliveryTime, activityShipmentPackage.deliveryTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingCarrier, activityShipmentPackage.shippingCarrier) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, activityShipmentPackage.items);
    }

    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage copy(java.lang.String trackingNumber, java.lang.String logoImageUrl, com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus shipmentStatus, java.lang.String statusMessage, java.lang.String deliveryTime, com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier shippingCarrier, java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentItem> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shipmentStatus, "");
        return new com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage(trackingNumber, logoImageUrl, shipmentStatus, statusMessage, deliveryTime, shippingCarrier, items);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentItem> component7() {
        return this.items;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier getShippingCarrier() {
        return this.shippingCarrier;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDeliveryTime() {
        return this.deliveryTime;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getStatusMessage() {
        return this.statusMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus getShipmentStatus() {
        return this.shipmentStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLogoImageUrl() {
        return this.logoImageUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTrackingNumber() {
        return this.trackingNumber;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage copy$default(com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage activityShipmentPackage, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityShipmentPackage.trackingNumber;
        }
        if ((i & 2) != 0) {
            str2 = activityShipmentPackage.logoImageUrl;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            activityPackageTrackingStatus = activityShipmentPackage.shipmentStatus;
        }
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus2 = activityPackageTrackingStatus;
        if ((i & 8) != 0) {
            str3 = activityShipmentPackage.statusMessage;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = activityShipmentPackage.deliveryTime;
        }
        java.lang.String str7 = str4;
        if ((i & 32) != 0) {
            activityShippingCarrier = activityShipmentPackage.shippingCarrier;
        }
        com.paypal.oslo.feature.activity.domain.common.models.ActivityShippingCarrier activityShippingCarrier2 = activityShippingCarrier;
        if ((i & 64) != 0) {
            list = activityShipmentPackage.items;
        }
        return activityShipmentPackage.copy(str, str5, activityPackageTrackingStatus2, str6, str7, activityShippingCarrier2, list);
    }
}
