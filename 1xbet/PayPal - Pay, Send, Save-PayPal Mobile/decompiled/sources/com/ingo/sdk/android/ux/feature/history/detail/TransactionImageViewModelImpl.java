package com.ingo.sdk.android.ux.feature.history.detail;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/history/detail/TransactionImageViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/transaction_image/TransactionImageViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "url", "", "getTransactionImage", "(Ljava/lang/String;)V", "Landroidx/lifecycle/MutableLiveData;", "", "imageBytes", "Landroidx/lifecycle/MutableLiveData;", "getImageBytes", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionImageViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageViewModel {
    public static final int $stable = 8;
    private final androidx.view.MutableLiveData<byte[]> imageBytes;

    public /* synthetic */ TransactionImageViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public TransactionImageViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.imageBytes = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<byte[]> getImageBytes() {
        return this.imageBytes;
    }

    @Override // com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageViewModel
    public final void getTransactionImage(final java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl.m10661$r8$lambda$srOKj3PFjU9Vsowep_jCqtr15k(url, this);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2M0HausnkIMZ5LqB5JSrDTDQ24c(com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl transactionImageViewModelImpl, byte[] bArr) {
        transactionImageViewModelImpl.imageBytes.postValue(bArr);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E8Yd9aK0z9ZUBqf0u36kA6CgI9M(final com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl transactionImageViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl.$r8$lambda$TgZlNo0BxF1fzLFCYv94h4gEJkk(com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl.$r8$lambda$rTvElvJisnwDcS00Ou3fkk5aie0(com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl.this, (byte[]) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TgZlNo0BxF1fzLFCYv94h4gEJkk(com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl transactionImageViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(transactionImageViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rTvElvJisnwDcS00Ou3fkk5aie0(final com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl transactionImageViewModelImpl, final byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        transactionImageViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl.$r8$lambda$2M0HausnkIMZ5LqB5JSrDTDQ24c(com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl.this, bArr);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$srOKj3PFjU9Vsowep_jC-qtr15k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10661$r8$lambda$srOKj3PFjU9Vsowep_jCqtr15k(java.lang.String str, final com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl transactionImageViewModelImpl) {
        new com.ingo.sdk.kotlin.common.features.transaction_image.GetTransactionImageUseCase().invoke(str, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl.$r8$lambda$E8Yd9aK0z9ZUBqf0u36kA6CgI9M(com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionImageViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
