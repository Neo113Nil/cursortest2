package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JB\u0010\u0012\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;)V", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase$Result;", "", "block", "invoke", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "getSoftspaceProxy", "()Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EnterPinUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase, com.zettle.sdk.core.log.Loggable {
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy;

    public EnterPinUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        this.softspaceProxy = softspaceProxy;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    public final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getSoftspaceProxy() {
        return this.softspaceProxy;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(weakReference, transactionInfo, onlineHostRequestMessage, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result, kotlin.Unit> block) {
        java.lang.Object m23436constructorimpl;
        java.lang.Object m23436constructorimpl2;
        java.lang.Object m23436constructorimpl3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReferenceActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.util.Currency currency = info.getGetHighSpeedVideoFpsRanges().getCurrency();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCaseImpl enterPinUseCaseImpl = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(currency.getSymbol());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        java.lang.String str = (java.lang.String) m23436constructorimpl;
        java.lang.String str2 = str == null ? "" : str;
        long getHighSpeedVideoFpsRangesFor = info.getGetHighSpeedVideoFpsRangesFor();
        com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency2 = new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder().currency(currency);
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        com.zettle.sdk.feature.taptopay.core.transaction.TransactionPINParams transactionPINParams = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionPINParams(currency2.locale(locale).build().format(getHighSpeedVideoFpsRangesFor), null, onlineHostRequestMessage.getPanToken(), str2, false, 0, 0, false, 0, 498, null);
        android.app.Activity activity = weakReferenceActivity.get();
        if (activity == null) {
            block.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.NoActivityFound.INSTANCE);
            return;
        }
        byte[] enterPin = this.softspaceProxy.enterPin(activity, transactionPINParams);
        if (enterPin != null && enterPin.length != 0) {
            try {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCaseImpl enterPinUseCaseImpl2 = this;
                m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(java.util.Arrays.copyOfRange(enterPin, 0, 12));
            } catch (java.lang.Throwable th2) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
            }
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl2)) {
                m23436constructorimpl2 = null;
            }
            byte[] bArr = (byte[]) m23436constructorimpl2;
            try {
                kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCaseImpl enterPinUseCaseImpl3 = this;
                m23436constructorimpl3 = kotlin.Result.m23436constructorimpl(java.util.Arrays.copyOfRange(enterPin, 12, enterPin.length));
            } catch (java.lang.Throwable th3) {
                kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                m23436constructorimpl3 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th3));
            }
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl3)) {
                m23436constructorimpl3 = null;
            }
            byte[] bArr2 = (byte[]) m23436constructorimpl3;
            java.lang.String hexString$default = bArr != null ? com.zettle.sdk.io.BuffersKt.toHexString$default(bArr, 0, 0, 3, null) : null;
            java.lang.String hexString$default2 = bArr2 != null ? com.zettle.sdk.io.BuffersKt.toHexString$default(bArr2, 0, 0, 3, null) : null;
            if (hexString$default == null || hexString$default2 == null) {
                com.zettle.sdk.core.log.LogKt.warn$default(this, "Canceled::invalid ksn or pinblock", null, 2, null);
                block.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.Canceled.INSTANCE);
                return;
            } else {
                block.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.Completed(hexString$default, hexString$default2));
                return;
            }
        }
        com.zettle.sdk.core.log.LogKt.warn$default(this, "Canceled", null, 2, null);
        block.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.Canceled.INSTANCE);
    }
}
