package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\u0018\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/PermissiveSignatureUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/PermissiveSignatureUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;", "service", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/meta/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/Platform;)V", "Lcom/zettle/sdk/commons/network/NetworkClient;", "networkClient", "Lcom/zettle/sdk/core/os/LocationInfo;", "locationInfo", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "approvedPayload", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/PermissiveSignatureUseCase$Result;", "", "block", "invoke", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/core/os/LocationInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/meta/Platform;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PermissiveSignatureUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.TransactionService getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.Platform Camera2StreamConfigurationMap;

    public PermissiveSignatureUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, com.zettle.sdk.feature.taptopay.core.transaction.TransactionService transactionService, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.Platform platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        this.getHighResolutionOutputSizeshNQ4ISI = softspaceProxy;
        this.getHighSpeedVideoFpsRanges = transactionService;
        this.getHighSpeedVideoSizes = appInfo;
        this.Camera2StreamConfigurationMap = platform;
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.core.os.LocationInfo locationInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(networkClient, locationInfo, transactionInfo, transactionApprovedPayload, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.core.os.LocationInfo locationInfo, final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload approvedPayload, final kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approvedPayload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getOutputFormats = info.getGetOutputFormats();
        java.util.UUID getHighSpeedVideoSizes = info.getGetHighSpeedVideoSizes();
        com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo = this.getHighResolutionOutputSizeshNQ4ISI.getSoftspaceReaderInfo();
        if (softspaceReaderInfo == null) {
            block.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result.Failed(getHighSpeedVideoSizes, com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidArguments.INSTANCE));
        } else {
            this.getHighSpeedVideoFpsRanges.signatureRequest(networkClient, com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest.INSTANCE.create(this.getHighSpeedVideoSizes, softspaceReaderInfo, this.Camera2StreamConfigurationMap.getInfo(), locationInfo.getLastKnown()).references(getOutputFormats).localId(getHighSpeedVideoSizes).skipSignature().identifier("com.softspace.1").protocolState(com.zettle.sdk.commons.network.JsonKt.EMV_STATE_READY_TO_ISSUE_COMMAND), info, approvedPayload, new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCaseImpl$invoke$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult, ? extends java.lang.Throwable> result) {
                    getHighSpeedVideoSizes(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult, ? extends java.lang.Throwable> result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result, kotlin.Unit> function1 = block;
                    if (result instanceof com.izettle.android.core.data.result.Success) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult tapToPaySignatureResult = (com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult) ((com.izettle.android.core.data.result.Success) result).getValue();
                        if (tapToPaySignatureResult instanceof com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Success) {
                            function1.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result.Success(((com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Success) tapToPaySignatureResult).getPayload()));
                        } else if (tapToPaySignatureResult instanceof com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Failed) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Failed failed = (com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Failed) tapToPaySignatureResult;
                            function1.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result.Failed(failed.getInfo().getGetHighSpeedVideoSizes(), failed.getReason()));
                        }
                    }
                    kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result, kotlin.Unit> function12 = block;
                    com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo = info;
                    if (result instanceof com.izettle.android.core.data.result.Failure) {
                        function12.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result.Failed(transactionInfo.getGetHighSpeedVideoSizes(), new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError(null)));
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
