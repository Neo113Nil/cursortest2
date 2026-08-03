package androidx.compose.ui.viewinterop;

/* compiled from: AndroidViewHolder.android.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {560, 565}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AndroidViewHolder$onNestedFling$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean $consumed;
    final /* synthetic */ long $viewVelocity;
    int label;
    final /* synthetic */ androidx.compose.ui.viewinterop.AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onNestedFling$1(boolean z, androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1> continuation) {
        super(2, continuation);
        this.$consumed = z;
        this.this$0 = androidViewHolder;
        this.$viewVelocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1(this.$consumed, this.this$0, this.$viewVelocity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher;
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.$consumed) {
                nestedScrollDispatcher2 = this.this$0.dispatcher;
                this.label = 1;
                if (nestedScrollDispatcher2.m3156dispatchPostFlingRZ2iAVY(androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M(), this.$viewVelocity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                nestedScrollDispatcher = this.this$0.dispatcher;
                this.label = 2;
                if (nestedScrollDispatcher.m3156dispatchPostFlingRZ2iAVY(this.$viewVelocity, androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
