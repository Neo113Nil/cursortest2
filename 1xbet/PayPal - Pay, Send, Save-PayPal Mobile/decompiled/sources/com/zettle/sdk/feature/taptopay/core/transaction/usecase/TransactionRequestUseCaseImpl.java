package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJV\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/TransactionRequestUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/TransactionRequestUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;", "service", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/meta/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/Platform;)V", "Lcom/zettle/sdk/commons/network/NetworkClient;", "networkClient", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "Lcom/zettle/sdk/feature/taptopay/core/transaction/PinBlock;", "pinBlock", "Lcom/zettle/sdk/core/os/LocationInfo;", "locationInfo", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/TransactionRequestUseCase$Result;", "", "block", "invoke", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;Lcom/zettle/sdk/feature/taptopay/core/transaction/PinBlock;Lcom/zettle/sdk/core/os/LocationInfo;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/meta/AppInfo;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/meta/Platform;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionRequestUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.TransactionService getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.Platform getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo Camera2StreamConfigurationMap;

    public TransactionRequestUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, com.zettle.sdk.feature.taptopay.core.transaction.TransactionService transactionService, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.Platform platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        this.getHighSpeedVideoFpsRangesFor = softspaceProxy;
        this.getHighResolutionOutputSizeshNQ4ISI = transactionService;
        this.Camera2StreamConfigurationMap = appInfo;
        this.getHighSpeedVideoFpsRanges = platform;
    }

    @Override // kotlin.jvm.functions.Function7
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, com.zettle.sdk.feature.taptopay.core.transaction.PinBlock pinBlock, com.zettle.sdk.core.os.LocationInfo locationInfo, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(networkClient, transactionInfo, transactionConfig, onlineHostRequestMessage, pinBlock, locationInfo, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.zettle.sdk.commons.network.NetworkClient networkClient, final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, com.zettle.sdk.feature.taptopay.core.transaction.PinBlock pinBlock, com.zettle.sdk.core.os.LocationInfo locationInfo, final kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.String getHighSpeedVideoFpsRanges = config.getGetHighSpeedVideoFpsRanges();
        long getHighSpeedVideoFpsRangesFor = info.getGetHighSpeedVideoFpsRangesFor();
        java.util.UUID getHighSpeedVideoSizes = info.getGetHighSpeedVideoSizes();
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getOutputFormats = info.getGetOutputFormats();
        com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo = this.getHighSpeedVideoFpsRangesFor.getSoftspaceReaderInfo();
        com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties camera2StreamConfigurationMap = info.getCamera2StreamConfigurationMap();
        if (softspaceReaderInfo == null) {
            block.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result.Failed(getHighSpeedVideoSizes, com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidArguments.INSTANCE));
            return;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest pinBlock2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest.INSTANCE.create(this.Camera2StreamConfigurationMap, softspaceReaderInfo, this.getHighSpeedVideoFpsRanges.getInfo(), locationInfo.getLastKnown()).amount(getHighSpeedVideoFpsRangesFor).localId(getHighSpeedVideoSizes).references(getOutputFormats).paymentProperties(camera2StreamConfigurationMap).context(getHighSpeedVideoFpsRanges).identifier("com.softspace.1").deviceIdentifier(softspaceReaderInfo.getCotsId()).protocolState(com.zettle.sdk.commons.network.JsonKt.EMV_STATE_RESPONSE_FROM_READER).onlineHostRequestMessage(onlineHostRequestMessage).pinBlock(pinBlock);
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault());
        com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest timeZoneOffset = pinBlock2.timeZoneOffset(calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 1000);
        if (info.getGetHighResolutionOutputSizeshNQ4ISI() > 0) {
            timeZoneOffset.gratuityAmount(info.getGetHighResolutionOutputSizeshNQ4ISI());
        }
        this.getHighResolutionOutputSizeshNQ4ISI.payment(networkClient, info, timeZoneOffset, new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCaseImpl$invoke$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult, ? extends java.lang.Throwable> result) {
                Camera2StreamConfigurationMap(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult, ? extends java.lang.Throwable> result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result, kotlin.Unit> function1 = block;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult transactionCardPaymentResult = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult) ((com.izettle.android.core.data.result.Success) result).getValue();
                    if (transactionCardPaymentResult instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Success) {
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result.Success(((com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Success) transactionCardPaymentResult).getPayload()));
                    } else if (transactionCardPaymentResult instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Failed) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Failed failed = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Failed) transactionCardPaymentResult;
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result.Failed(failed.getInfo().getGetHighSpeedVideoSizes(), failed.getReason()));
                    }
                }
                kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result, kotlin.Unit> function12 = block;
                com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo = info;
                if (result instanceof com.izettle.android.core.data.result.Failure) {
                    function12.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result.Failed(transactionInfo.getGetHighSpeedVideoSizes(), new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError(((java.lang.Throwable) ((com.izettle.android.core.data.result.Failure) result).getError()).getMessage())));
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
