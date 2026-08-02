package com.ingo.sdk.android.ux.feature.customer_enrollment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/customer_enrollment/CustomerEnrollmentViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "dob", "ssn", "mobilePhone", "", "completeEnrollment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/model/CustomerEnrollmentResponse;", "customerEnrollmentResponseData", "Landroidx/lifecycle/MutableLiveData;", "getCustomerEnrollmentResponseData", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomerEnrollmentViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentViewModel {
    public static final int $stable = 8;
    private final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse> customerEnrollmentResponseData;

    public /* synthetic */ CustomerEnrollmentViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public CustomerEnrollmentViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.customerEnrollmentResponseData = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse> getCustomerEnrollmentResponseData() {
        return this.customerEnrollmentResponseData;
    }

    @Override // com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentViewModel
    public final void completeEnrollment(final java.lang.String dob, final java.lang.String ssn, final java.lang.String mobilePhone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dob, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ssn, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobilePhone, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl.m10659$r8$lambda$rLQ0CAh9KowN_36qs5VGzSbqM(ssn, dob, mobilePhone, this);
            }
        });
    }

    /* renamed from: $r8$lambda$-XElnoypZXinlSgO0_mnr7OqhmA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10658$r8$lambda$XElnoypZXinlSgO0_mnr7OqhmA(final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl customerEnrollmentViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl.$r8$lambda$dLTngizJuJxdw4qxkmx58UgOxYA(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl.$r8$lambda$k0Qij2b4Hq6qJSWFyBjVuBdV3LQ(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl.this, (com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xk3shB4mZWLVL75cYROIYNb1A9M(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl customerEnrollmentViewModelImpl, com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse customerEnrollmentResponse) {
        customerEnrollmentViewModelImpl.customerEnrollmentResponseData.postValue(customerEnrollmentResponse);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dLTngizJuJxdw4qxkmx58UgOxYA(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl customerEnrollmentViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(customerEnrollmentViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k0Qij2b4Hq6qJSWFyBjVuBdV3LQ(final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl customerEnrollmentViewModelImpl, final com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse customerEnrollmentResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerEnrollmentResponse, "");
        customerEnrollmentViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl.$r8$lambda$Xk3shB4mZWLVL75cYROIYNb1A9M(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl.this, customerEnrollmentResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rLQ0CAh9KowN_36qs5V-Gz-SbqM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10659$r8$lambda$rLQ0CAh9KowN_36qs5VGzSbqM(java.lang.String str, java.lang.String str2, java.lang.String str3, final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl customerEnrollmentViewModelImpl) {
        com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase customerEnrollmentUseCase = new com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentUseCase();
        java.lang.String slice = kotlin.text.StringsKt.slice(str2, new kotlin.ranges.IntRange(0, 1));
        java.lang.String slice2 = kotlin.text.StringsKt.slice(str2, new kotlin.ranges.IntRange(2, 3));
        java.lang.String slice3 = kotlin.text.StringsKt.slice(str2, new kotlin.ranges.IntRange(4, 7));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(slice);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(slice2);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(slice3);
        customerEnrollmentUseCase.invoke(new com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentParameters(str, sb.toString(), str3), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl.m10658$r8$lambda$XElnoypZXinlSgO0_mnr7OqhmA(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerEnrollmentViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
