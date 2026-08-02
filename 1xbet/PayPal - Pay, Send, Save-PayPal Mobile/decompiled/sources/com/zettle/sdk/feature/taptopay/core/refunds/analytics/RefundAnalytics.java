package com.zettle.sdk.feature.taptopay.core.refunds.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundAnalytics;", "", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects;", "effects", "", "track", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RefundAnalytics {
    java.lang.Object track(kotlinx.coroutines.flow.SharedFlow<? extends com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects> sharedFlow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
