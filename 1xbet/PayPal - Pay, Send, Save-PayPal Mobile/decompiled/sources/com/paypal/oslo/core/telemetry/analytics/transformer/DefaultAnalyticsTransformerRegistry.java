package com.paypal.oslo.core.telemetry.analytics.transformer;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B.\b\u0007\u0012\u001b\u0010\u0006\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR)\u0010\u0010\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/transformer/DefaultAnalyticsTransformerRegistry;", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "transformers", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/TransformationDelegate;", "delegate", "<init>", "(Ljava/util/Set;Lcom/paypal/oslo/core/telemetry/analytics/transformer/TransformationDelegate;)V", "T", "", "contexts", "transform", "(Ljava/util/List;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/TransformationDelegate;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultAnalyticsTransformerRegistry implements com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate getHighSpeedVideoSizes;
    private final java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DefaultAnalyticsTransformerRegistry(java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> set, com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate transformationDelegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformationDelegate, "");
        this.getHighSpeedVideoFpsRanges = set;
        this.getHighSpeedVideoSizes = transformationDelegate;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry
    public final <T> T transform(java.util.List<? extends java.lang.Object> contexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
        com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate transformationDelegate = this.getHighSpeedVideoSizes;
        java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> set = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(set, "");
        return (T) transformationDelegate.execute(contexts, set);
    }
}
