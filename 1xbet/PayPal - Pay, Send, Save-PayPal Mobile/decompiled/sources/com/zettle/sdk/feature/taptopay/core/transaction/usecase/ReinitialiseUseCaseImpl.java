package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/ReinitialiseUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/ReinitialiseUseCase;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;", "configurationInit", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/ReinitialiseUseCase$Result;", "", "block", "invoke", "(Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;Lkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReinitialiseUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase, com.zettle.sdk.core.log.Loggable {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighSpeedVideoSizes;

    public ReinitialiseUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoSizes = softspaceProxy;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit configurationInit, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(configurationInit, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit configurationInit, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationInit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(this.getHighSpeedVideoFpsRanges, new com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1(block, this, configurationInit, null));
    }
}
