package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u00032\u0006\u0010\u0007\u001a\u00020\bH\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/wallet/me/ui/AccountsViewModel$UiState;", "components", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/me/domain/ProductError;", "", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "paymentPreferences", "Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreferencesProduct;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl$uiState$1", f = "AccountsViewModelImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {88}, m = "invokeSuspend", n = {"components", "paymentPreferences", "updated", "split", "$this$mapNotNull$iv", "$this$mapNotNullTo$iv$iv", "destination$iv$iv", "$this$forEach$iv$iv$iv", "element$iv$iv$iv", "element$iv$iv", "it", "$i$f$mapNotNull", "$i$f$mapNotNullTo", "$i$f$forEach", "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv", "$i$a$-mapNotNull-AccountsViewModelImpl$uiState$1$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "L$10", "L$11", "L$12", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes16.dex */
final class AccountsViewModelImpl$uiState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<arrow.core.Either<? extends com.paypal.oslo.feature.wallet.me.domain.ProductError, ? extends java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product<?>>>, com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreferencesProduct, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    int getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    java.lang.Object isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    java.lang.Object unwrapAs;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00fb -> B:5:0x00fe). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        com.paypal.oslo.feature.wallet.me.ui.LinkedProducts linkedProducts;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase;
        java.util.Collection arrayList;
        java.util.Iterator it;
        int i;
        int i2;
        java.lang.Iterable iterable3;
        int i3;
        arrow.core.Either either = (arrow.core.Either) this.getHighSpeedVideoSizesFor;
        com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreferencesProduct paymentPreferencesProduct = (com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreferencesProduct) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (either instanceof arrow.core.Either.Left) {
                return new com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Error((com.paypal.oslo.feature.wallet.me.domain.ProductError) ((arrow.core.Either.Left) either).getValue());
            }
            if (!(either instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Pair access$extractLinkedProducts = com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImplKt.access$extractLinkedProducts((java.util.List) ((arrow.core.Either.Right) either).getValue());
            list = (java.util.List) access$extractLinkedProducts.component1();
            com.paypal.oslo.feature.wallet.me.ui.LinkedProducts linkedProducts2 = (com.paypal.oslo.feature.wallet.me.ui.LinkedProducts) access$extractLinkedProducts.component2();
            java.util.List list2 = list;
            com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase2 = this.getHighResolutionOutputSizeshNQ4ISI;
            linkedProducts = linkedProducts2;
            iterable = list2;
            iterable2 = iterable;
            formatCurrencyUseCase = formatCurrencyUseCase2;
            arrayList = new java.util.ArrayList();
            it = list2.iterator();
            i = 0;
            i2 = 0;
            iterable3 = iterable2;
            i3 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.Camera2StreamConfigurationMap;
            i3 = this.getHighSpeedVideoFpsRangesFor;
            i2 = this.getHighSpeedVideoSizes;
            it = (java.util.Iterator) this.isOutputSupportedFor;
            iterable3 = (java.lang.Iterable) this.toString;
            arrayList = (java.util.Collection) this.isOutputSupportedForhNQ4ISI;
            iterable = (java.lang.Iterable) this.unwrapAs;
            formatCurrencyUseCase = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) this.getOutputSizes;
            iterable2 = (java.lang.Iterable) this.getOutputMinFrameDurationlomOqCM;
            linkedProducts = (com.paypal.oslo.feature.wallet.me.ui.LinkedProducts) this.getOutputStallDurationlomOqCM;
            list = (java.util.List) this.getOutputStallDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object asProductOverview = obj;
            com.paypal.oslo.feature.wallet.me.ui.ProductOverview productOverview = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview) asProductOverview;
            if (productOverview != null) {
                arrayList.add(productOverview);
            }
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                com.paypal.oslo.feature.wallet.me.domain.Product product = (com.paypal.oslo.feature.wallet.me.domain.Product) next;
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = paymentPreferencesProduct;
                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                this.getOutputStallDurationlomOqCM = linkedProducts;
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                this.getOutputSizes = formatCurrencyUseCase;
                this.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                this.isOutputSupportedForhNQ4ISI = arrayList;
                this.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable3);
                this.isOutputSupportedFor = it;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(product);
                this.getHighSpeedVideoSizes = i2;
                this.getHighSpeedVideoFpsRangesFor = i3;
                this.Camera2StreamConfigurationMap = i;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getOutputFormats = 0;
                this.getValidOutputFormatsForInputhNQ4ISI = 1;
                asProductOverview = com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.asProductOverview((com.paypal.oslo.feature.wallet.me.domain.Product<?>) product, formatCurrencyUseCase, this);
                coroutine_suspended = coroutine_suspended;
                if (asProductOverview == coroutine_suspended) {
                    return coroutine_suspended;
                }
                com.paypal.oslo.feature.wallet.me.ui.ProductOverview productOverview2 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview) asProductOverview;
                if (productOverview2 != null) {
                }
                if (it.hasNext()) {
                    return new com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Success((java.util.List) arrayList, linkedProducts.getHighSpeedVideoFpsRanges, linkedProducts.getHighSpeedVideoSizes, linkedProducts.Camera2StreamConfigurationMap, paymentPreferencesProduct);
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(arrow.core.Either<? extends com.paypal.oslo.feature.wallet.me.domain.ProductError, ? extends java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product<?>>> either, com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreferencesProduct paymentPreferencesProduct, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState> continuation) {
        com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl$uiState$1 accountsViewModelImpl$uiState$1 = new com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl$uiState$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        accountsViewModelImpl$uiState$1.getHighSpeedVideoSizesFor = either;
        accountsViewModelImpl$uiState$1.getInputSizeshNQ4ISI = paymentPreferencesProduct;
        return accountsViewModelImpl$uiState$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountsViewModelImpl$uiState$1(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl$uiState$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = formatCurrencyUseCase;
    }
}
