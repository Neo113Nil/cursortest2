package androidx.lifecycle;

/* compiled from: CoroutineLiveData.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BH\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0080@¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u000bH\u0014J\b\u0010\u001d\u001a\u00020\u000bH\u0014R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", "T", "Landroidx/lifecycle/MediatorLiveData;", "context", "Lkotlin/coroutines/CoroutineContext;", "timeoutInMs", "", "block", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)V", "blockRunner", "Landroidx/lifecycle/BlockRunner;", "emittedSource", "Landroidx/lifecycle/EmittedSource;", "clearSource", "clearSource$lifecycle_livedata_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSource", "Lkotlinx/coroutines/DisposableHandle;", "source", "Landroidx/lifecycle/LiveData;", "emitSource$lifecycle_livedata_release", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActive", "onInactive", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoroutineLiveData<T> extends androidx.lifecycle.MediatorLiveData<T> {
    private androidx.lifecycle.BlockRunner<T> blockRunner;
    private androidx.lifecycle.EmittedSource emittedSource;

    public /* synthetic */ CoroutineLiveData(kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext, long j, kotlin.jvm.functions.Function2 function2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i & 2) != 0 ? 5000L : j, function2);
    }

    public CoroutineLiveData(kotlin.coroutines.CoroutineContext context, long j, kotlin.jvm.functions.Function2<? super androidx.lifecycle.LiveDataScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        this.blockRunner = new androidx.lifecycle.BlockRunner<>(this, block, j, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain().getImmediate().plus(context).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob((kotlinx.coroutines.Job) context.get(kotlinx.coroutines.Job.INSTANCE)))), new kotlin.jvm.functions.Function0<kotlin.Unit>(this) { // from class: androidx.lifecycle.CoroutineLiveData.1
            final /* synthetic */ androidx.lifecycle.CoroutineLiveData<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((androidx.lifecycle.CoroutineLiveData) this.this$0).blockRunner = null;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData<T> liveData, kotlin.coroutines.Continuation<? super kotlinx.coroutines.DisposableHandle> continuation) {
        androidx.lifecycle.CoroutineLiveData$emitSource$1 coroutineLiveData$emitSource$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.lifecycle.LiveData<T> liveData2;
        androidx.lifecycle.CoroutineLiveData<T> coroutineLiveData;
        if (continuation instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1) {
            coroutineLiveData$emitSource$1 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) continuation;
            if ((coroutineLiveData$emitSource$1.label & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$emitSource$1.label -= Integer.MIN_VALUE;
                obj = coroutineLiveData$emitSource$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutineLiveData$emitSource$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineLiveData$emitSource$1.L$0 = this;
                    coroutineLiveData$emitSource$1.L$1 = liveData;
                    coroutineLiveData$emitSource$1.label = 1;
                    if (clearSource$lifecycle_livedata_release(coroutineLiveData$emitSource$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    liveData2 = liveData;
                    coroutineLiveData = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        coroutineLiveData = (androidx.lifecycle.CoroutineLiveData) coroutineLiveData$emitSource$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.lifecycle.EmittedSource emittedSource = (androidx.lifecycle.EmittedSource) obj;
                        coroutineLiveData.emittedSource = emittedSource;
                        return emittedSource;
                    }
                    androidx.lifecycle.LiveData<T> liveData3 = (androidx.lifecycle.LiveData) coroutineLiveData$emitSource$1.L$1;
                    androidx.lifecycle.CoroutineLiveData<T> coroutineLiveData2 = (androidx.lifecycle.CoroutineLiveData) coroutineLiveData$emitSource$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    liveData2 = liveData3;
                    coroutineLiveData = coroutineLiveData2;
                }
                coroutineLiveData$emitSource$1.L$0 = coroutineLiveData;
                coroutineLiveData$emitSource$1.L$1 = null;
                coroutineLiveData$emitSource$1.label = 2;
                obj = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(coroutineLiveData, liveData2, coroutineLiveData$emitSource$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidx.lifecycle.EmittedSource emittedSource2 = (androidx.lifecycle.EmittedSource) obj;
                coroutineLiveData.emittedSource = emittedSource2;
                return emittedSource2;
            }
        }
        coroutineLiveData$emitSource$1 = new androidx.lifecycle.CoroutineLiveData$emitSource$1(this, continuation);
        obj = coroutineLiveData$emitSource$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutineLiveData$emitSource$1.label;
        if (i != 0) {
        }
        coroutineLiveData$emitSource$1.L$0 = coroutineLiveData;
        coroutineLiveData$emitSource$1.L$1 = null;
        coroutineLiveData$emitSource$1.label = 2;
        obj = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(coroutineLiveData, liveData2, coroutineLiveData$emitSource$1);
        if (obj == coroutine_suspended) {
        }
        androidx.lifecycle.EmittedSource emittedSource22 = (androidx.lifecycle.EmittedSource) obj;
        coroutineLiveData.emittedSource = emittedSource22;
        return emittedSource22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clearSource$lifecycle_livedata_release(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.lifecycle.CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        int i;
        androidx.lifecycle.CoroutineLiveData<T> coroutineLiveData;
        if (continuation instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) continuation;
            if ((coroutineLiveData$clearSource$1.label & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$clearSource$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = coroutineLiveData$clearSource$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutineLiveData$clearSource$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.lifecycle.EmittedSource emittedSource = this.emittedSource;
                    if (emittedSource != null) {
                        coroutineLiveData$clearSource$1.L$0 = this;
                        coroutineLiveData$clearSource$1.label = 1;
                        if (emittedSource.disposeNow(coroutineLiveData$clearSource$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    coroutineLiveData = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineLiveData = (androidx.lifecycle.CoroutineLiveData) coroutineLiveData$clearSource$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                coroutineLiveData.emittedSource = null;
                return kotlin.Unit.INSTANCE;
            }
        }
        coroutineLiveData$clearSource$1 = new androidx.lifecycle.CoroutineLiveData$clearSource$1(this, continuation);
        java.lang.Object obj2 = coroutineLiveData$clearSource$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutineLiveData$clearSource$1.label;
        if (i != 0) {
        }
        coroutineLiveData.emittedSource = null;
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    protected void onActive() {
        super.onActive();
        androidx.lifecycle.BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    protected void onInactive() {
        super.onInactive();
        androidx.lifecycle.BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }
}
