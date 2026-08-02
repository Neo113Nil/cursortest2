package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardProvisionHandler;", "", "Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardStateDataSource;", "cardStateDataSource", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardStateDataSource;)V", "", "cardId", "Lkotlin/time/Duration;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "invoke-HG0u8IE", "(Ljava/lang/String;J)Lkotlinx/coroutines/flow/Flow;", "invoke", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardStateDataSource;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardProvisionHandler {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CardProvisionHandler(com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource cardStateDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStateDataSource, "");
        this.getHighSpeedVideoFpsRanges = cardStateDataSource;
    }

    /* renamed from: invoke-HG0u8IE$default, reason: not valid java name */
    public static /* synthetic */ kotlinx.coroutines.flow.Flow m20013invokeHG0u8IE$default(com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            j = kotlin.time.DurationKt.toDuration(30, kotlin.time.DurationUnit.SECONDS);
        }
        return cardProvisionHandler.m20014invokeHG0u8IE(str, j);
    }

    /* renamed from: invoke-HG0u8IE, reason: not valid java name */
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> m20014invokeHG0u8IE(java.lang.String cardId, long timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler$invoke$1(cardId, this, timeout, null));
    }
}
