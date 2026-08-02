package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6815a;
    public final /* synthetic */ financial.atomic.muppet.inter.Browser b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(financial.atomic.muppet.inter.Browser browser, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = browser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.c(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.b.c(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6815a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.inter.Browser browser = this.b;
            this.f6815a = 1;
            obj = browser.newPage(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return ((financial.atomic.muppet.inter.Page) obj).handle();
    }
}
