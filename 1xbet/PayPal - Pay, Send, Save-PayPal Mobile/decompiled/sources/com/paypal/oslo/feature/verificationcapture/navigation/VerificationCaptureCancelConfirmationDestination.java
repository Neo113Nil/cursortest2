package com.paypal.oslo.feature.verificationcapture.navigation;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002&%B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/VerificationCaptureCancelConfirmationDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "reviewHours", "<init>", "(I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/verificationcapture/navigation/VerificationCaptureCancelConfirmationDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/navigation/VerificationCaptureCancelConfirmationDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getReviewHours", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class VerificationCaptureCancelConfirmationDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination.Companion(null);
    private final int reviewHours;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/VerificationCaptureCancelConfirmationDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/VerificationCaptureCancelConfirmationDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination> serializer() {
            return com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public VerificationCaptureCancelConfirmationDestination(int i) {
        this.reviewHours = i;
    }

    public /* synthetic */ VerificationCaptureCancelConfirmationDestination(int i, int i2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.reviewHours = i2;
    }

    public final int getReviewHours() {
        return this.reviewHours;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.CancelConfirmation.SCREEN, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.PRODUCT, "verification_capture", com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.CancelConfirmation.ACTION_VIEW), kotlin.collections.SetsKt.emptySet());
    }

    public final java.lang.String toString() {
        int i = this.reviewHours;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationCaptureCancelConfirmationDestination(reviewHours=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.reviewHours);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination) && this.reviewHours == ((com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination) other).reviewHours;
    }

    public final com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination copy(int reviewHours) {
        return new com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination(reviewHours);
    }

    /* renamed from: component1, reason: from getter */
    public final int getReviewHours() {
        return this.reviewHours;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination copy$default(com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination verificationCaptureCancelConfirmationDestination, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = verificationCaptureCancelConfirmationDestination.reviewHours;
        }
        return verificationCaptureCancelConfirmationDestination.copy(i);
    }
}
