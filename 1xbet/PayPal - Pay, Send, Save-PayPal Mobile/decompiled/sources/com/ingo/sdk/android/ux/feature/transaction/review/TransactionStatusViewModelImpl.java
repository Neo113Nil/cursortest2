package com.ingo.sdk.android.ux.feature.transaction.review;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/review/TransactionStatusViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusViewModel;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "transactionId", "", "poll", "(Ljava/lang/String;)V", "stopPolling", "()V", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/model/TransactionStatusResponse;", "transactionStatusResponse", "Landroidx/lifecycle/MutableLiveData;", "getTransactionStatusResponse", "()Landroidx/lifecycle/MutableLiveData;", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusUseCase;", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusUseCase;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionStatusViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase getHighSpeedVideoSizes;
    private final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse> transactionStatusResponse;

    public /* synthetic */ TransactionStatusViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public TransactionStatusViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.transactionStatusResponse = new androidx.view.MutableLiveData<>();
        this.getHighSpeedVideoSizes = new com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase(0L, 1, null);
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse> getTransactionStatusResponse() {
        return this.transactionStatusResponse;
    }

    @Override // com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusViewModel
    public final void poll(final java.lang.String transactionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionStatusViewModelImpl poll(");
        sb.append(transactionId);
        sb.append(")");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, sb.toString(), null, 2, null);
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl.m10699$r8$lambda$OyFQA_3D2J4J_vtWUUN5q1xCSc(com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl.this, transactionId);
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusViewModel
    public final void stopPolling() {
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "TransactionStatusViewModelImpl stopPolling()", null, 2, null);
        com.ingo.sdk.kotlin.common.core.interactor.UseCase.cancel$default(this.getHighSpeedVideoSizes, null, 1, null);
        workComplete();
    }

    /* renamed from: $r8$lambda$OyFQA_3D-2J4J_vtWUUN5q1xCSc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10699$r8$lambda$OyFQA_3D2J4J_vtWUUN5q1xCSc(final com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl transactionStatusViewModelImpl, java.lang.String str) {
        com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase transactionStatusUseCase = new com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase(0L, 1, null);
        transactionStatusViewModelImpl.getHighSpeedVideoSizes = transactionStatusUseCase;
        transactionStatusUseCase.invoke(str, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl.$r8$lambda$bc7FcTWCYfvBhYAokGzUya31K4Q(com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_VlnCOr-AVhipFDhjQRa4XrSXoY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10700$r8$lambda$_VlnCOrAVhipFDhjQRa4XrSXoY(com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl transactionStatusViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(transactionStatusViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$anUUk04XA1_urVUrNgH8JHu_Gmk(com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl transactionStatusViewModelImpl, com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse transactionStatusResponse) {
        transactionStatusViewModelImpl.transactionStatusResponse.postValue(transactionStatusResponse);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bc7FcTWCYfvBhYAokGzUya31K4Q(final com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl transactionStatusViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Use Case ".concat(java.lang.String.valueOf(either)), null, 2, null);
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl.m10700$r8$lambda$_VlnCOrAVhipFDhjQRa4XrSXoY(com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl.$r8$lambda$pMC0eFU7Hl_ObhiajK0nVFtZhY0(com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl.this, (com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pMC0eFU7Hl_ObhiajK0nVFtZhY0(final com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl transactionStatusViewModelImpl, final com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse transactionStatusResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionStatusResponse, "");
        transactionStatusViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl.$r8$lambda$anUUk04XA1_urVUrNgH8JHu_Gmk(com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl.this, transactionStatusResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionStatusViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
