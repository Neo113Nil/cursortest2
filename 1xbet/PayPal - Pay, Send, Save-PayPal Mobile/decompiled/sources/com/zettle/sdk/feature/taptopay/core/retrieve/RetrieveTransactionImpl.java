package com.zettle.sdk.feature.taptopay.core.retrieve;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransactionImpl;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransaction;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/RetrievePaymentUseCase;", "retrievePaymentUseCase", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "merchantConfig", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/RetrievePaymentUseCase;Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;)V", "", "referenceId", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult;", "", com.sun.jna.Callback.METHOD_NAME, "retrieveCardPaymentInfo", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "Ljava/util/Currency;", "getHighSpeedVideoSizes", "(Lcom/zettle/sdk/core/user/userconfig/UserConfig;)Ljava/util/Currency;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/RetrievePaymentUseCase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RetrieveTransactionImpl implements com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransaction, com.zettle.sdk.core.log.Loggable {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.merchant.MerchantConfig getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase Camera2StreamConfigurationMap;

    public RetrieveTransactionImpl(com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase retrievePaymentUseCase, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrievePaymentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfig, "");
        this.Camera2StreamConfigurationMap = retrievePaymentUseCase;
        this.getHighSpeedVideoSizes = merchantConfig;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransaction
    public final void retrieveCardPaymentInfo(final java.lang.String referenceId, final kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl retrieveTransactionImpl = this;
        com.zettle.sdk.core.log.LogKt.debug(retrieveTransactionImpl, "Start retrieve card payment info ".concat(java.lang.String.valueOf(referenceId)));
        if (referenceId.length() == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Retrieve card payment referenceId ");
            sb.append(referenceId);
            sb.append(" empty.");
            com.zettle.sdk.core.log.LogKt.debug(retrieveTransactionImpl, sb.toString());
            callback.invoke(new com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotFound.INSTANCE));
            return;
        }
        com.zettle.sdk.core.log.LogKt.debug(retrieveTransactionImpl, "Retrieve card payment referenceId ".concat(java.lang.String.valueOf(referenceId)));
        this.getHighSpeedVideoSizes.getUserConfigAsync(new kotlin.jvm.functions.Function1<kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl$retrieveCardPaymentInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig> result) {
                getHighResolutionOutputSizeshNQ4ISI(result.getCamera2StreamConfigurationMap());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
                java.util.Currency highSpeedVideoSizes;
                kotlin.Unit unit;
                com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl retrieveTransactionImpl2 = com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl.this;
                kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult, kotlin.Unit> function1 = callback;
                java.lang.String str = referenceId;
                if (kotlin.Result.m23442isSuccessimpl(obj)) {
                    highSpeedVideoSizes = com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl.getHighSpeedVideoSizes((com.zettle.sdk.core.user.userconfig.UserConfig) obj);
                    if (highSpeedVideoSizes != null) {
                        retrieveTransactionImpl2.Camera2StreamConfigurationMap.invoke(str, highSpeedVideoSizes, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl$doRetrieve$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result result) {
                                getHighSpeedVideoSizes(result);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void getHighSpeedVideoSizes(com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result result) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                                if (result instanceof com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Success) {
                                    com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl.this, "Success retrieve card payment info ".concat(java.lang.String.valueOf(str)));
                                    function1.invoke(new com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success(((com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Success) result).getCardPaymentPayload()));
                                } else if (result instanceof com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Failed) {
                                    com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason reason = ((com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Failed) result).getReason();
                                    com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl.this, "Failed retrieve card payment info reason : ".concat(java.lang.String.valueOf(reason)));
                                    com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl retrieveTransactionImpl3 = com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl.this;
                                    function1.invoke(new com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Failed(reason));
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        });
                        unit = kotlin.Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE));
                    }
                }
                com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl retrieveTransactionImpl3 = com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl.this;
                java.lang.String str2 = referenceId;
                kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult, kotlin.Unit> function12 = callback;
                if (kotlin.Result.m23439exceptionOrNullimpl(obj) != null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Retrieve card payment referenceId ");
                    sb2.append(str2);
                    sb2.append(" failed to get user config");
                    com.zettle.sdk.core.log.LogKt.debug(retrieveTransactionImpl3, sb2.toString());
                    function12.invoke(new com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Currency getHighSpeedVideoSizes(com.zettle.sdk.core.user.userconfig.UserConfig userConfig) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.util.Currency.getInstance(userConfig.getCurrency().name()));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        return (java.util.Currency) m23436constructorimpl;
    }
}
