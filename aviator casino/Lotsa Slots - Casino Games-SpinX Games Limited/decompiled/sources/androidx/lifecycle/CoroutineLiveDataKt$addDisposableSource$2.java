package androidx.lifecycle;

/* compiled from: CoroutineLiveData.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroidx/lifecycle/EmittedSource;", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class CoroutineLiveDataKt$addDisposableSource$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.lifecycle.EmittedSource>, java.lang.Object> {
    final /* synthetic */ androidx.lifecycle.LiveData<T> $source;
    final /* synthetic */ androidx.lifecycle.MediatorLiveData<T> $this_addDisposableSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineLiveDataKt$addDisposableSource$2(androidx.lifecycle.MediatorLiveData<T> mediatorLiveData, androidx.lifecycle.LiveData<T> liveData, kotlin.coroutines.Continuation<? super androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2> continuation) {
        super(2, continuation);
        this.$this_addDisposableSource = mediatorLiveData;
        this.$source = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2(this.$this_addDisposableSource, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.lifecycle.EmittedSource> continuation) {
        return ((androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.lifecycle.MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
        java.lang.Object obj2 = this.$source;
        final androidx.lifecycle.MediatorLiveData<T> mediatorLiveData2 = this.$this_addDisposableSource;
        mediatorLiveData.addSource(obj2, new androidx.lifecycle.CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<T, kotlin.Unit>() { // from class: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj3) {
                invoke2((androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2.AnonymousClass1<T>) obj3);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                mediatorLiveData2.setValue(t);
            }
        }));
        return new androidx.lifecycle.EmittedSource(this.$source, this.$this_addDisposableSource);
    }
}
