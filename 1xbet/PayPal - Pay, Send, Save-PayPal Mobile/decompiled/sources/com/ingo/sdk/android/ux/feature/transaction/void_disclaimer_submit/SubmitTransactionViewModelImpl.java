package com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/void_disclaimer_submit/SubmitTransactionViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "transactionReferenceNumber", "promoCode", "accountIdentifier", "Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;", "fundsTiming", "", "submitTransaction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;)V", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionUseCase;", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionUseCase;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/model/SubmitTransactionResponse;", "submitTransactionResponse", "Landroidx/lifecycle/MutableLiveData;", "getSubmitTransactionResponse", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubmitTransactionViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionViewModel {
    public static final int $stable = 8;
    private final com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCase Camera2StreamConfigurationMap;
    private final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse> submitTransactionResponse;

    public /* synthetic */ SubmitTransactionViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public SubmitTransactionViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.Camera2StreamConfigurationMap = new com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCase();
        this.submitTransactionResponse = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse> getSubmitTransactionResponse() {
        return this.submitTransactionResponse;
    }

    @Override // com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionViewModel
    public final void submitTransaction(final java.lang.String transactionReferenceNumber, final java.lang.String promoCode, final java.lang.String accountIdentifier, final com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundsTiming, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl.$r8$lambda$AQnRXsKrYQ1YSi2aQsxGun1kE24(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl.this, transactionReferenceNumber, promoCode, accountIdentifier, fundsTiming);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AQnRXsKrYQ1YSi2aQsxGun1kE24(final com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl submitTransactionViewModelImpl, java.lang.String str, java.lang.String str2, java.lang.String str3, com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming) {
        submitTransactionViewModelImpl.Camera2StreamConfigurationMap.invoke(new com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters(str, str2, str3, fundsTiming), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl.$r8$lambda$mdwBlGDmNPka5UEzXe7GLN6SxLQ(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IGsldb-9ntxmtjom3XGp3ZW0q2k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10701$r8$lambda$IGsldb9ntxmtjom3XGp3ZW0q2k(final com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl submitTransactionViewModelImpl, final com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse submitTransactionResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitTransactionResponse, "");
        submitTransactionViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl.$r8$lambda$UqAY9tCmHT0ygKKnFJ1thEselL8(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl.this, submitTransactionResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UqAY9tCmHT0ygKKnFJ1thEselL8(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl submitTransactionViewModelImpl, com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse submitTransactionResponse) {
        submitTransactionViewModelImpl.submitTransactionResponse.postValue(submitTransactionResponse);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aZUOgwV8C-R8PNfOxLAxatMExbI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10702$r8$lambda$aZUOgwV8CR8PNfOxLAxatMExbI(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl submitTransactionViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(submitTransactionViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mdwBlGDmNPka5UEzXe7GLN6SxLQ(final com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl submitTransactionViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl.m10702$r8$lambda$aZUOgwV8CR8PNfOxLAxatMExbI(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl.m10701$r8$lambda$IGsldb9ntxmtjom3XGp3ZW0q2k(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl.this, (com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubmitTransactionViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
