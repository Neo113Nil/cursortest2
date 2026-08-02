package androidx.view;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BV\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00129\u0010\u000e\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\n\b\u0001\u0012\u0004\u0012\u00028\u0000`\f¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001a\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", "T", "Landroidx/lifecycle/MediatorLiveData;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "", "Landroidx/lifecycle/Block;", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)V", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/DisposableHandle;", "emitSource$lifecycle_livedata", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSource$lifecycle_livedata", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActive", "()V", "onInactive", "Landroidx/lifecycle/BlockRunner;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/BlockRunner;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/EmittedSource;", "getHighSpeedVideoSizes", "Landroidx/lifecycle/EmittedSource;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CoroutineLiveData<T> extends androidx.view.MediatorLiveData<T> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.view.BlockRunner<T> getHighResolutionOutputSizeshNQ4ISI;
    private androidx.view.EmittedSource getHighSpeedVideoSizes;

    public CoroutineLiveData(kotlin.coroutines.CoroutineContext coroutineContext, long j, kotlin.jvm.functions.Function2<? super androidx.view.LiveDataScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.BlockRunner<>(this, function2, j, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain().getImmediate().plus(coroutineContext).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob((kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE)))), new kotlin.jvm.functions.Function0() { // from class: androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.CoroutineLiveData.m9161$r8$lambda$FikBj6X7n4R2MzevGYqZrBME6M(androidx.view.CoroutineLiveData.this);
            }
        });
    }

    public /* synthetic */ CoroutineLiveData(kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext, long j, kotlin.jvm.functions.Function2 function2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i & 2) != 0 ? 5000L : j, function2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (clearSource$lifecycle_livedata(r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emitSource$lifecycle_livedata(androidx.view.LiveData<T> liveData, kotlin.coroutines.Continuation<? super kotlinx.coroutines.DisposableHandle> continuation) {
        androidx.view.CoroutineLiveData$emitSource$1 coroutineLiveData$emitSource$1;
        int i;
        if (continuation instanceof androidx.view.CoroutineLiveData$emitSource$1) {
            coroutineLiveData$emitSource$1 = (androidx.view.CoroutineLiveData$emitSource$1) continuation;
            if ((coroutineLiveData$emitSource$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$emitSource$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = coroutineLiveData$emitSource$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutineLiveData$emitSource$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineLiveData$emitSource$1.Camera2StreamConfigurationMap = liveData;
                    coroutineLiveData$emitSource$1.getHighSpeedVideoFpsRanges = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.view.EmittedSource emittedSource = (androidx.view.EmittedSource) obj;
                        this.getHighSpeedVideoSizes = emittedSource;
                        return emittedSource;
                    }
                    liveData = (androidx.view.LiveData) coroutineLiveData$emitSource$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                coroutineLiveData$emitSource$1.Camera2StreamConfigurationMap = null;
                coroutineLiveData$emitSource$1.getHighSpeedVideoFpsRanges = 2;
                obj = androidx.view.CoroutineLiveDataKt.addDisposableSource(this, liveData, coroutineLiveData$emitSource$1);
            }
        }
        coroutineLiveData$emitSource$1 = new androidx.view.CoroutineLiveData$emitSource$1(this, continuation);
        java.lang.Object obj2 = coroutineLiveData$emitSource$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutineLiveData$emitSource$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        coroutineLiveData$emitSource$1.Camera2StreamConfigurationMap = null;
        coroutineLiveData$emitSource$1.getHighSpeedVideoFpsRanges = 2;
        obj2 = androidx.view.CoroutineLiveDataKt.addDisposableSource(this, liveData, coroutineLiveData$emitSource$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clearSource$lifecycle_livedata(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.view.CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        int i;
        if (continuation instanceof androidx.view.CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (androidx.view.CoroutineLiveData$clearSource$1) continuation;
            if ((coroutineLiveData$clearSource$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$clearSource$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = coroutineLiveData$clearSource$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutineLiveData$clearSource$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.view.EmittedSource emittedSource = this.getHighSpeedVideoSizes;
                    if (emittedSource != null) {
                        coroutineLiveData$clearSource$1.getHighSpeedVideoSizes = 1;
                        if (emittedSource.disposeNow(coroutineLiveData$clearSource$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighSpeedVideoSizes = null;
                return kotlin.Unit.INSTANCE;
            }
        }
        coroutineLiveData$clearSource$1 = new androidx.view.CoroutineLiveData$clearSource$1(this, continuation);
        java.lang.Object obj2 = coroutineLiveData$clearSource$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutineLiveData$clearSource$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        this.getHighSpeedVideoSizes = null;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.MediatorLiveData, androidx.view.LiveData
    public final void onActive() {
        super.onActive();
        androidx.view.BlockRunner<T> blockRunner = this.getHighResolutionOutputSizeshNQ4ISI;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.MediatorLiveData, androidx.view.LiveData
    public final void onInactive() {
        super.onInactive();
        androidx.view.BlockRunner<T> blockRunner = this.getHighResolutionOutputSizeshNQ4ISI;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }

    /* renamed from: $r8$lambda$FikBj6X7n4R2MzevGYqZr-BME6M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9161$r8$lambda$FikBj6X7n4R2MzevGYqZrBME6M(androidx.view.CoroutineLiveData coroutineLiveData) {
        coroutineLiveData.getHighResolutionOutputSizeshNQ4ISI = null;
        return kotlin.Unit.INSTANCE;
    }
}
