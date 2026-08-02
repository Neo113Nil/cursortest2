package com.paypal.oslo.feature.activity.api.navigation;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityWidgetFScreenDestinationKey;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;", "widgetFsDto", "<init>", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;", "copy", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;)Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityWidgetFScreenDestinationKey;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_api_prodRelease", "(Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityWidgetFScreenDestinationKey;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;", "getWidgetFsDto", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PayPalActivityWidgetFScreenDestinationKey implements androidx.navigation3.runtime.NavKey {
    private final com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto widgetFsDto;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey.Companion INSTANCE = new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityWidgetFScreenDestinationKey$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityWidgetFScreenDestinationKey;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey> serializer() {
            return com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PayPalActivityWidgetFScreenDestinationKey(int i, com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto activityFilteredLandingScreenDto, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.widgetFsDto = null;
        } else {
            this.widgetFsDto = activityFilteredLandingScreenDto;
        }
    }

    public PayPalActivityWidgetFScreenDestinationKey(com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto activityFilteredLandingScreenDto) {
        this.widgetFsDto = activityFilteredLandingScreenDto;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_api_prodRelease(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.widgetFsDto != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto$$serializer.INSTANCE, self.widgetFsDto);
        }
    }

    public /* synthetic */ PayPalActivityWidgetFScreenDestinationKey(com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto activityFilteredLandingScreenDto, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : activityFilteredLandingScreenDto);
    }

    public final com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto getWidgetFsDto() {
        return this.widgetFsDto;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto activityFilteredLandingScreenDto = this.widgetFsDto;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalActivityWidgetFScreenDestinationKey(widgetFsDto=");
        sb.append(activityFilteredLandingScreenDto);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto activityFilteredLandingScreenDto = this.widgetFsDto;
        if (activityFilteredLandingScreenDto == null) {
            return 0;
        }
        return activityFilteredLandingScreenDto.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.widgetFsDto, ((com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey) other).widgetFsDto);
    }

    public final com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey copy(com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto widgetFsDto) {
        return new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey(widgetFsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto getWidgetFsDto() {
        return this.widgetFsDto;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey copy$default(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey payPalActivityWidgetFScreenDestinationKey, com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto activityFilteredLandingScreenDto, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activityFilteredLandingScreenDto = payPalActivityWidgetFScreenDestinationKey.widgetFsDto;
        }
        return payPalActivityWidgetFScreenDestinationKey.copy(activityFilteredLandingScreenDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PayPalActivityWidgetFScreenDestinationKey() {
        this((com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
