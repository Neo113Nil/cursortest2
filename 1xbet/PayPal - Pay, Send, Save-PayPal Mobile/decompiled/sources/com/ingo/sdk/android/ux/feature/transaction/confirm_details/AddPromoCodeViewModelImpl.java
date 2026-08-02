package com.ingo.sdk.android.ux.feature.transaction.confirm_details;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR)\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u00108\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/confirm_details/AddPromoCodeViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/features/add_promo_code/AddPromoCodeViewModel;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/ingo/sdk/kotlin/common/features/add_promo_code/AddPromoCodeUseCaseParameters;", "params", "", "addPromoCode", "(Lcom/ingo/sdk/kotlin/common/features/add_promo_code/AddPromoCodeUseCaseParameters;)V", "Lcom/ingo/sdk/kotlin/common/features/add_promo_code/AddPromoCodeUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/kotlin/common/features/add_promo_code/AddPromoCodeUseCase;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/ingo/sdk/kotlin/common/features/add_promo_code/model/AddPromoCodeResponse;", "promoCodeResponse", "Landroidx/lifecycle/MutableLiveData;", "getPromoCodeResponse", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AddPromoCodeViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.add_promo_code.AddPromoCodeViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.add_promo_code.AddPromoCodeUseCase getHighSpeedVideoFpsRangesFor;
    private final androidx.view.MutableLiveData<kotlin.Pair<java.lang.String, com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse>> promoCodeResponse;

    public /* synthetic */ AddPromoCodeViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public AddPromoCodeViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.getHighSpeedVideoFpsRangesFor = new com.ingo.sdk.kotlin.common.features.add_promo_code.AddPromoCodeUseCase();
        this.promoCodeResponse = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<kotlin.Pair<java.lang.String, com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse>> getPromoCodeResponse() {
        return this.promoCodeResponse;
    }

    @Override // com.ingo.sdk.kotlin.common.features.add_promo_code.AddPromoCodeViewModel
    public final void addPromoCode(final com.ingo.sdk.kotlin.common.features.add_promo_code.AddPromoCodeUseCaseParameters params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl.$r8$lambda$CerYvgqeF6Dt_3JUzrz1FdoStlQ(com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl.this, params);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CerYvgqeF6Dt_3JUzrz1FdoStlQ(final com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl addPromoCodeViewModelImpl, final com.ingo.sdk.kotlin.common.features.add_promo_code.AddPromoCodeUseCaseParameters addPromoCodeUseCaseParameters) {
        addPromoCodeViewModelImpl.getHighSpeedVideoFpsRangesFor.invoke(addPromoCodeUseCaseParameters, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl.m10689$r8$lambda$ri8PSZx4lhnZFpdNGbJGFfg2pI(com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl.this, addPromoCodeUseCaseParameters, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IS_YPBFlYBGOhY8q94LaQeuBdw0(final com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl addPromoCodeViewModelImpl, final com.ingo.sdk.kotlin.common.features.add_promo_code.AddPromoCodeUseCaseParameters addPromoCodeUseCaseParameters, final com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse addPromoCodeResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addPromoCodeResponse, "");
        addPromoCodeViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl.$r8$lambda$gjlA1bskAGfg4Eemefph2nW7RL0(com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl.this, addPromoCodeUseCaseParameters, addPromoCodeResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gjlA1bskAGfg4Eemefph2nW7RL0(com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl addPromoCodeViewModelImpl, com.ingo.sdk.kotlin.common.features.add_promo_code.AddPromoCodeUseCaseParameters addPromoCodeUseCaseParameters, com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse addPromoCodeResponse) {
        addPromoCodeViewModelImpl.promoCodeResponse.postValue(new kotlin.Pair<>(addPromoCodeUseCaseParameters.getPromoCode(), addPromoCodeResponse));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qdnYDkSLJbNey0jZ-5U4j3V9SlA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10688$r8$lambda$qdnYDkSLJbNey0jZ5U4j3V9SlA(com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl addPromoCodeViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(addPromoCodeViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ri8PSZx4lhnZFpd-NGbJGFfg2pI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10689$r8$lambda$ri8PSZx4lhnZFpdNGbJGFfg2pI(final com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl addPromoCodeViewModelImpl, final com.ingo.sdk.kotlin.common.features.add_promo_code.AddPromoCodeUseCaseParameters addPromoCodeUseCaseParameters, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl.m10688$r8$lambda$qdnYDkSLJbNey0jZ5U4j3V9SlA(com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl.$r8$lambda$IS_YPBFlYBGOhY8q94LaQeuBdw0(com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl.this, addPromoCodeUseCaseParameters, (com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddPromoCodeViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
