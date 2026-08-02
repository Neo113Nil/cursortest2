package com.ingo.sdk.kotlin.common.platform;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0004¢\u0006\u0004\b\u0014\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u0002*\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0004¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0015\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0'8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,"}, d2 = {"Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "", "resultDelay", "<init>", "(Lkotlinx/coroutines/CoroutineScope;J)V", "", "workComplete", "()V", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "incomingFailure", "Lkotlin/Function0;", "toRun", "onUseCaseFailure", "(Lcom/ingo/sdk/kotlin/common/core/exception/Failure;Lkotlin/jvm/functions/Function0;)V", "onUseCaseSuccess", "(Lkotlin/jvm/functions/Function0;)V", "work", "runSingleUseCase", "coroutineScope", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "handleFailure", "(Lcom/ingo/sdk/kotlin/common/core/exception/Failure;)V", "Lcom/ingo/sdk/kotlin/common/core/interactor/UseCase$None;", "none", "()Lcom/ingo/sdk/kotlin/common/core/interactor/UseCase$None;", "Camera2StreamConfigurationMap", "J", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getFailure", "()Landroidx/lifecycle/MutableLiveData;", "setFailure", "(Landroidx/lifecycle/MutableLiveData;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class BaseViewModel extends androidx.view.ViewModel {
    private final long Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.core.exception.Failure> failure;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor;

    public /* synthetic */ BaseViewModel(kotlinx.coroutines.CoroutineScope coroutineScope, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope, (i & 2) != 0 ? 0L : j);
    }

    public BaseViewModel(kotlinx.coroutines.CoroutineScope coroutineScope, long j) {
        this.Camera2StreamConfigurationMap = j;
        this.coroutineScope = getViewModelScope(this, coroutineScope);
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.failure = new androidx.view.MutableLiveData<>();
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    protected final void workComplete() {
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "BaseViewModel work complete! ".concat(java.lang.String.valueOf(this)), null, 2, null);
        this.getHighSpeedVideoFpsRangesFor.set(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onUseCaseFailure$default(com.ingo.sdk.kotlin.common.platform.BaseViewModel baseViewModel, com.ingo.sdk.kotlin.common.core.exception.Failure failure, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onUseCaseFailure");
        }
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.platform.BaseViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        baseViewModel.onUseCaseFailure(failure, function0);
    }

    protected final void onUseCaseFailure(com.ingo.sdk.kotlin.common.core.exception.Failure incomingFailure, kotlin.jvm.functions.Function0<kotlin.Unit> toRun) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incomingFailure, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toRun, "");
        workComplete();
        this.failure.postValue(incomingFailure);
    }

    public final void onUseCaseSuccess(kotlin.jvm.functions.Function0<kotlin.Unit> toRun) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toRun, "");
        workComplete();
        if (this.Camera2StreamConfigurationMap != 0) {
            kotlinx.coroutines.CoroutineScope coroutineScope = this.coroutineScope;
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.IngoDispatchers.class));
            if (obj != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, ((com.ingo.sdk.kotlin.common.core.IngoDispatchers) obj).getMainDispatcher(), null, new com.ingo.sdk.kotlin.common.platform.BaseViewModel$onUseCaseSuccess$1(this, toRun, null), 2, null);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.core.IngoDispatchers");
        }
        toRun.invoke();
    }

    protected final void runSingleUseCase(kotlin.jvm.functions.Function0<kotlin.Unit> work) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(work, "");
        kotlinx.coroutines.CoroutineScope coroutineScope = this.coroutineScope;
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.IngoDispatchers.class));
        if (obj != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, ((com.ingo.sdk.kotlin.common.core.IngoDispatchers) obj).getBackgroundDispatcher(), null, new com.ingo.sdk.kotlin.common.platform.BaseViewModel$runSingleUseCase$1(this, work, null), 2, null);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.core.IngoDispatchers");
    }

    public final kotlinx.coroutines.CoroutineScope getViewModelScope(androidx.view.ViewModel viewModel, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        return coroutineScope == null ? androidx.view.ViewModelKt.getViewModelScope(viewModel) : coroutineScope;
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.core.exception.Failure> getFailure() {
        return this.failure;
    }

    public final void setFailure(androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.core.exception.Failure> mutableLiveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.failure = mutableLiveData;
    }

    protected void handleFailure(com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        this.failure.postValue(failure);
    }

    protected final com.ingo.sdk.kotlin.common.core.interactor.UseCase.None none() {
        return new com.ingo.sdk.kotlin.common.core.interactor.UseCase.None();
    }

    public BaseViewModel() {
        this(null, 0L, 3, null);
    }
}
