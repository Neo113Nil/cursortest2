package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class s extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6796a;
    public final /* synthetic */ financial.atomic.muppet.Page b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ kotlin.jvm.functions.Function1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(financial.atomic.muppet.Page page, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
        this.c = str;
        this.d = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.s(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.a.s) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r7 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6796a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.Page page = this.b;
            java.lang.String str = this.c;
            this.f6796a = 1;
            obj = page.evaluate(str, this);
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
            financial.atomic.muppet.a.r rVar = new financial.atomic.muppet.a.r(this.d, (java.lang.String) obj, null);
            this.f6796a = 3;
        }
        this.f6796a = 2;
        obj = ((kotlinx.coroutines.Deferred) obj).await(this);
    }
}
