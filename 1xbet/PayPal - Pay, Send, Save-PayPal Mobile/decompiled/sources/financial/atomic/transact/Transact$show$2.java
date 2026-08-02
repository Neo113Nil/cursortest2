package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "financial.atomic.transact.Transact$show$2", f = "Transact.kt", i = {}, l = {348, 350}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class Transact$show$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean $animate;
    int label;
    final /* synthetic */ financial.atomic.transact.Transact this$0;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r5.show(r1, r4) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r5.await(r4) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        financial.atomic.muppet.Page page;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            completableDeferred = this.this$0.n;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.this$0.view().bringToFront();
        page = this.this$0.h;
        if (page == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            page = null;
        }
        boolean z = this.$animate;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.transact.Transact$show$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new financial.atomic.transact.Transact$show$2(this.this$0, this.$animate, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transact$show$2(financial.atomic.transact.Transact transact, boolean z, kotlin.coroutines.Continuation<? super financial.atomic.transact.Transact$show$2> continuation) {
        super(2, continuation);
        this.this$0 = transact;
        this.$animate = z;
    }
}
