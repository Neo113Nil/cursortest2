package com.paypal.oslo.feature.businesscustomers.api.navigation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/navigation/ViewCustomersListDestination;", "Lcom/paypal/oslo/feature/businesscustomers/api/navigation/BusinessCustomersNavKey;", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes11.dex */
public final /* data */ class ViewCustomersListDestination implements com.paypal.oslo.feature.businesscustomers.api.navigation.BusinessCustomersNavKey {
    public static final com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination();
    private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination.$r8$lambda$xXc4YtL5SVxB0ieWFpFJX4ExPYY();
        }
    });

    public final int hashCode() {
        return 526985404;
    }

    private ViewCustomersListDestination() {
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor("customers_list", new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.CUSTOMER_DIRECTORY, "customers_list", "view_customers_list"), kotlin.collections.SetsKt.setOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("view_customers", null)));
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$xXc4YtL5SVxB0ieWFpFJX4ExPYY() {
        return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination", INSTANCE, new java.lang.annotation.Annotation[0]);
    }

    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination> serializer() {
        return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
    }

    public final java.lang.String toString() {
        return "ViewCustomersListDestination";
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination)) {
            return false;
        }
        return true;
    }
}
