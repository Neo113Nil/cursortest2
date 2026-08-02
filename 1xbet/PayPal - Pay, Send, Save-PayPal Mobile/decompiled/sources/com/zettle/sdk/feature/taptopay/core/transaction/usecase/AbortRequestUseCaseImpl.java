package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;", "service", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/meta/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/Platform;)V", "Lcom/zettle/sdk/commons/network/NetworkClient;", "networkClient", "Lcom/zettle/sdk/core/os/LocationInfo;", "locationInfo", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase$Result;", "", "block", "invoke", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/core/os/LocationInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/FailureReason;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/meta/AppInfo;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/meta/Platform;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AbortRequestUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.Platform getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighSpeedVideoFpsRangesFor;
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.TransactionService getHighResolutionOutputSizeshNQ4ISI;

    public AbortRequestUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, com.zettle.sdk.feature.taptopay.core.transaction.TransactionService transactionService, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.Platform platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        this.getHighSpeedVideoFpsRangesFor = softspaceProxy;
        this.getHighResolutionOutputSizeshNQ4ISI = transactionService;
        this.getHighSpeedVideoFpsRanges = appInfo;
        this.getHighSpeedVideoSizes = platform;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.core.os.LocationInfo locationInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.FailureReason failureReason, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(networkClient, locationInfo, transactionInfo, failureReason, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.core.os.LocationInfo locationInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, com.zettle.sdk.feature.taptopay.core.FailureReason reason, final kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getOutputFormats = info.getGetOutputFormats();
        java.util.UUID getHighSpeedVideoSizes = info.getGetHighSpeedVideoSizes();
        com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo = this.getHighSpeedVideoFpsRangesFor.getSoftspaceReaderInfo();
        if (softspaceReaderInfo == null) {
            block.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result.Failed.INSTANCE);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.abortPayment(networkClient, com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest.INSTANCE.create(this.getHighSpeedVideoFpsRanges, softspaceReaderInfo, this.getHighSpeedVideoSizes.getInfo(), locationInfo.getLastKnown()).identifier("com.softspace.1").localId(getHighSpeedVideoSizes).references(getOutputFormats).reason(reason.toString()), info, new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCaseImpl$invoke$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult, ? extends java.lang.Throwable> result) {
                    getHighSpeedVideoFpsRanges(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult, ? extends java.lang.Throwable> result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCaseImpl abortRequestUseCaseImpl = com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCaseImpl.this;
                    kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, kotlin.Unit> function1 = block;
                    if (result instanceof com.izettle.android.core.data.result.Success) {
                        com.zettle.sdk.core.log.LogKt.debug(abortRequestUseCaseImpl, "Aborted");
                        function1.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result.Success.INSTANCE);
                    }
                    com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCaseImpl abortRequestUseCaseImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCaseImpl.this;
                    kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, kotlin.Unit> function12 = block;
                    if (result instanceof com.izettle.android.core.data.result.Failure) {
                        com.zettle.sdk.core.log.LogKt.warn(abortRequestUseCaseImpl2, "Error aborting payment", (java.lang.Throwable) ((com.izettle.android.core.data.result.Failure) result).getError());
                        function12.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result.Failed.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            });
        }
    }
}
