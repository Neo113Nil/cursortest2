package com.paypal.oslo.feature.cryptocurrency.ui.common.poll;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/poll/QuotePollingManager;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollQuoteUseCase;", "pollQuote", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "action", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "fiatCurrencyCode", "quoteFiatAmount", "quoteQuantity", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;", "", "onQuoteReceived", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollQuoteUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Ljava/lang/String;)V", "stop", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollQuoteUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI", "getInputFormats", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/Job;", "pollingJob", "Lkotlinx/coroutines/Job;", "getPollingJob$cryptocurrency_prodRelease", "()Lkotlinx/coroutines/Job;", "setPollingJob$cryptocurrency_prodRelease", "(Lkotlinx/coroutines/Job;)V", "", "isActive", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QuotePollingManager {
    public static final int $stable = 8;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote, kotlin.Unit> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.lang.String getInputSizeshNQ4ISI;
    private kotlinx.coroutines.Job pollingJob;

    /* JADX WARN: Multi-variable type inference failed */
    public QuotePollingManager(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuoteUseCase, com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollQuoteUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoTradeAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = pollQuoteUseCase;
        this.getHighSpeedVideoSizes = cryptoTradeAction;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getInputSizeshNQ4ISI = str3;
        this.getHighSpeedVideoSizesFor = str4;
        this.getOutputMinFrameDuration = function1;
    }

    public /* synthetic */ QuotePollingManager(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuoteUseCase, com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, pollQuoteUseCase, cryptoTradeAction, str, str2, str3, (i & 64) != 0 ? null : str4, function1);
    }

    /* renamed from: getPollingJob$cryptocurrency_prodRelease, reason: from getter */
    public final kotlinx.coroutines.Job getPollingJob() {
        return this.pollingJob;
    }

    public final void setPollingJob$cryptocurrency_prodRelease(kotlinx.coroutines.Job job) {
        this.pollingJob = job;
    }

    public final boolean isActive() {
        kotlinx.coroutines.Job job = this.pollingJob;
        return job != null && job.isActive();
    }

    public final void start(java.lang.String fundingOptionId) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
        stop();
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new com.paypal.oslo.feature.cryptocurrency.ui.common.poll.QuotePollingManager$start$1(this, fundingOptionId, null), 3, null);
        this.pollingJob = launch$default;
    }

    public final void stop() {
        kotlinx.coroutines.Job job = this.pollingJob;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.pollingJob = null;
    }
}
