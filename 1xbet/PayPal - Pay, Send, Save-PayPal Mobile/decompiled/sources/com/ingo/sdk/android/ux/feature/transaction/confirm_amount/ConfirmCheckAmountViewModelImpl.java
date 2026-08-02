package com.ingo.sdk.android.ux.feature.transaction.confirm_amount;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/confirm_amount/ConfirmCheckAmountViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/ConfirmCheckAmountViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "amount", "", "transactionReferenceNumber", "", "confirmAmountPressed", "(JLjava/lang/String;)V", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/ConfirmAmountUseCase;", "getHighSpeedVideoSizes", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/ConfirmAmountUseCase;", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse;", "confirmAmountResponse", "Landroidx/lifecycle/MutableLiveData;", "getConfirmAmountResponse", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConfirmCheckAmountViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmCheckAmountViewModel {
    public static final int $stable = 8;
    private final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse> confirmAmountResponse;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase getHighSpeedVideoFpsRanges;

    public /* synthetic */ ConfirmCheckAmountViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public ConfirmCheckAmountViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.getHighSpeedVideoFpsRanges = new com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase();
        this.confirmAmountResponse = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse> getConfirmAmountResponse() {
        return this.confirmAmountResponse;
    }

    @Override // com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmCheckAmountViewModel
    public final void confirmAmountPressed(final long amount, final java.lang.String transactionReferenceNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl.$r8$lambda$qj75MmaC3ozg9L097f88R16NcB8(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl.this, amount, transactionReferenceNumber);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5_GVm2YzURGVEPaORWQ8BoCUrXU(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl confirmCheckAmountViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(confirmCheckAmountViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qj75MmaC3ozg9L097f88R16NcB8(final com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl confirmCheckAmountViewModelImpl, long j, java.lang.String str) {
        confirmCheckAmountViewModelImpl.getHighSpeedVideoFpsRanges.invoke(new kotlin.Pair(java.lang.Long.valueOf(j), str), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl.m10685$r8$lambda$sWjHpXajPbenutqiIJofuuZBhM(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sWjHpXajPbenut-qiIJofuuZBhM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10685$r8$lambda$sWjHpXajPbenutqiIJofuuZBhM(final com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl confirmCheckAmountViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl.$r8$lambda$5_GVm2YzURGVEPaORWQ8BoCUrXU(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl.m10686$r8$lambda$wTOwtLhTEtRQjizCw_2_mhiPfg(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl.this, (com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wTOwtLh-TEtRQjizCw_2_mhiPfg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10686$r8$lambda$wTOwtLhTEtRQjizCw_2_mhiPfg(final com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl confirmCheckAmountViewModelImpl, final com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmAmountResponse, "");
        confirmCheckAmountViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl.m10687$r8$lambda$xAnwck_7mBfHF8EvtkaAYBOveU(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl.this, confirmAmountResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xAnwck_7mBfHF8Evt-kaAYBOveU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10687$r8$lambda$xAnwck_7mBfHF8EvtkaAYBOveU(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl confirmCheckAmountViewModelImpl, com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse) {
        confirmCheckAmountViewModelImpl.confirmAmountResponse.postValue(confirmAmountResponse);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConfirmCheckAmountViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
