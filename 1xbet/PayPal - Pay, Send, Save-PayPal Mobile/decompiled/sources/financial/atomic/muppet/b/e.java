package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6817a;
    public final /* synthetic */ financial.atomic.muppet.bridge.Bridge b;
    public final /* synthetic */ int c;
    public final /* synthetic */ financial.atomic.muppet.inter.Browser d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(financial.atomic.muppet.bridge.Bridge bridge, int i, financial.atomic.muppet.inter.Browser browser, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = bridge;
        this.c = i;
        this.d = browser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.e(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.b.e) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6817a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return "true";
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.b.getStore().getBrowsers().remove(kotlin.coroutines.jvm.internal.Boxing.boxInt(this.c));
        financial.atomic.muppet.inter.Browser browser = this.d;
        this.f6817a = 1;
        return browser.close(this) == coroutine_suspended ? coroutine_suspended : "true";
    }
}
