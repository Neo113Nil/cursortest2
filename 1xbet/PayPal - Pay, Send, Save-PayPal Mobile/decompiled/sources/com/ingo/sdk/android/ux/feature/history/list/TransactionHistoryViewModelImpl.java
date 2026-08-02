package com.ingo.sdk.android.ux.feature.history.list;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/history/list/TransactionHistoryViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/history/TransactionHistoryViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "pageNumber", "pageSize", "", "transactionReferenceNumber", "", "getTransactionHistory", "(IILjava/lang/String;)V", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionHistoryResponse;", "historyResponseData", "Landroidx/lifecycle/MutableLiveData;", "getHistoryResponseData", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionHistoryViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.history.TransactionHistoryViewModel {
    public static final int $stable = 8;
    private final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse> historyResponseData;

    public /* synthetic */ TransactionHistoryViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public TransactionHistoryViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.historyResponseData = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse> getHistoryResponseData() {
        return this.historyResponseData;
    }

    @Override // com.ingo.sdk.kotlin.common.features.history.TransactionHistoryViewModel
    public final void getTransactionHistory(final int pageNumber, final int pageSize, final java.lang.String transactionReferenceNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl.$r8$lambda$RzIMS9ChlbDrFz17T7ExUCtoIXc(transactionReferenceNumber, pageSize, pageNumber, this);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3vMwv5kSGdn9yMhjqfvpcXFMWps(com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl transactionHistoryViewModelImpl, com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse transactionHistoryResponse) {
        transactionHistoryViewModelImpl.historyResponseData.postValue(transactionHistoryResponse);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QrpYlWTIgktgTCNp5jztwlpsn1M(final com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl transactionHistoryViewModelImpl, final com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse transactionHistoryResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHistoryResponse, "");
        transactionHistoryViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl.$r8$lambda$3vMwv5kSGdn9yMhjqfvpcXFMWps(com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl.this, transactionHistoryResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RzIMS9ChlbDrFz17T7ExUCtoIXc(java.lang.String str, int i, int i2, final com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl transactionHistoryViewModelImpl) {
        new com.ingo.sdk.kotlin.common.features.history.GetTransactionHistoryUseCase().invoke(new com.ingo.sdk.kotlin.common.features.history.GetTransactionHistoryUseCaseParameters(str, i, i2), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl.$r8$lambda$b9QtwsMGh4aQxWuqqEF0kGOvKpw(com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b9QtwsMGh4aQxWuqqEF0kGOvKpw(final com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl transactionHistoryViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl.$r8$lambda$nFubaTZQ8e8nN8UMfNZRrWSPkdo(com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl.$r8$lambda$QrpYlWTIgktgTCNp5jztwlpsn1M(com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl.this, (com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nFubaTZQ8e8nN8UMfNZRrWSPkdo(com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl transactionHistoryViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(transactionHistoryViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionHistoryViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
