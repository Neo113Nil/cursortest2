package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JB\u0010\u0012\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUsecaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;)V", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;", "transactionEvents", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase$Result;", "", "result", "invoke", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StartTransactionUsecaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase, com.zettle.sdk.core.log.Loggable {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighResolutionOutputSizeshNQ4ISI;

    public StartTransactionUsecaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = softspaceProxy;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents transactionEvents, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(weakReference, transactionInfo, transactionEvents, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents transactionEvents, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result, kotlin.Unit> result) {
        java.util.Map map;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReferenceActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEvents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        long getHighSpeedVideoFpsRangesFor = info.getGetHighSpeedVideoFpsRangesFor();
        com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits = info.getGetHighSpeedVideoFpsRanges().getCvmLimits();
        if (cvmLimits == null) {
            result.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NoCvmLimits.INSTANCE);
            return;
        }
        int numericCode = info.getGetHighSpeedVideoFpsRanges().getCurrency().getNumericCode();
        com.zettle.sdk.core.user.CountryCode countryId = info.getGetHighSpeedVideoFpsRanges().getCountryId();
        map = com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCaseKt.getHighSpeedVideoFpsRanges;
        java.lang.String str = (java.lang.String) map.get(countryId);
        if (str == null) {
            result.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NotSupportedCountry.INSTANCE);
            return;
        }
        android.app.Activity activity = weakReferenceActivity.get();
        if (activity == null) {
            result.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NoActivityFound.INSTANCE);
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.startTransaction(activity, new com.zettle.sdk.feature.taptopay.core.transaction.TransactionParams(java.lang.String.valueOf(getHighSpeedVideoFpsRangesFor), new com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams(cvmLimits.getLimits(), cvmLimits.getDefaultLimitValue(), str, "0".concat(java.lang.String.valueOf(numericCode)), my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD), 60, true, false), transactionEvents);
    }
}
