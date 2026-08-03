package coil.compose;

/* compiled from: AsyncImagePainter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$1", f = "AsyncImagePainter.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class AsyncImagePainter$onRemembered$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ coil.compose.AsyncImagePainter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncImagePainter$onRemembered$1$1(coil.compose.AsyncImagePainter asyncImagePainter, kotlin.coroutines.Continuation<? super coil.compose.AsyncImagePainter$onRemembered$1$1> continuation) {
        super(2, continuation);
        this.this$0 = asyncImagePainter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil.compose.AsyncImagePainter$onRemembered$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((coil.compose.AsyncImagePainter$onRemembered$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final coil.compose.AsyncImagePainter asyncImagePainter = this.this$0;
            this.label = 1;
            if (kotlinx.coroutines.flow.FlowKt.mapLatest(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: coil.compose.AsyncImagePainter$onRemembered$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    coil.request.ImageRequest request;
                    request = coil.compose.AsyncImagePainter.this.getRequest();
                    return request;
                }
            }), new coil.compose.AsyncImagePainter$onRemembered$1$1.AnonymousClass2(this.this$0, null)).collect(new coil.compose.AsyncImagePainter$onRemembered$1$1.AnonymousClass3(this.this$0), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: AsyncImagePainter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "Lcoil/compose/AsyncImagePainter$State;", "it", "Lcoil/request/ImageRequest;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$1$2", f = "AsyncImagePainter.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<coil.request.ImageRequest, kotlin.coroutines.Continuation<? super coil.compose.AsyncImagePainter.State>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ coil.compose.AsyncImagePainter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(coil.compose.AsyncImagePainter asyncImagePainter, kotlin.coroutines.Continuation<? super coil.compose.AsyncImagePainter$onRemembered$1$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = asyncImagePainter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            coil.compose.AsyncImagePainter$onRemembered$1$1.AnonymousClass2 anonymousClass2 = new coil.compose.AsyncImagePainter$onRemembered$1$1.AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(coil.request.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil.compose.AsyncImagePainter.State> continuation) {
            return ((coil.compose.AsyncImagePainter$onRemembered$1$1.AnonymousClass2) create(imageRequest, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            coil.request.ImageRequest updateRequest;
            coil.compose.AsyncImagePainter asyncImagePainter;
            coil.compose.AsyncImagePainter.State state;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                coil.request.ImageRequest imageRequest = (coil.request.ImageRequest) this.L$0;
                coil.compose.AsyncImagePainter asyncImagePainter2 = this.this$0;
                coil.ImageLoader imageLoader = asyncImagePainter2.getImageLoader();
                updateRequest = this.this$0.updateRequest(imageRequest);
                this.L$0 = asyncImagePainter2;
                this.label = 1;
                obj = imageLoader.execute(updateRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                asyncImagePainter = asyncImagePainter2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                asyncImagePainter = (coil.compose.AsyncImagePainter) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            state = asyncImagePainter.toState((coil.request.ImageResult) obj);
            return state;
        }
    }

    /* compiled from: AsyncImagePainter.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$1$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 implements kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.internal.FunctionAdapter {
        final /* synthetic */ coil.compose.AsyncImagePainter $tmp0;

        AnonymousClass3(coil.compose.AsyncImagePainter asyncImagePainter) {
            this.$tmp0 = asyncImagePainter;
        }

        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof kotlinx.coroutines.flow.FlowCollector) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final kotlin.Function<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.AdaptedFunctionReference(2, this.$tmp0, coil.compose.AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final java.lang.Object emit(coil.compose.AsyncImagePainter.State state, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object invokeSuspend$updateState = coil.compose.AsyncImagePainter$onRemembered$1$1.invokeSuspend$updateState(this.$tmp0, state, continuation);
            return invokeSuspend$updateState == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invokeSuspend$updateState : kotlin.Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return emit((coil.compose.AsyncImagePainter.State) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.lang.Object invokeSuspend$updateState(coil.compose.AsyncImagePainter asyncImagePainter, coil.compose.AsyncImagePainter.State state, kotlin.coroutines.Continuation continuation) {
        asyncImagePainter.updateState(state);
        return kotlin.Unit.INSTANCE;
    }
}
