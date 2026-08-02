package financial.atomic.muppet.impl;

/* loaded from: classes17.dex */
public final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6878a;
    public final /* synthetic */ financial.atomic.muppet.impl.Browser b;
    public final /* synthetic */ financial.atomic.muppet.inter.Page c;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.impl.a(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6878a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.impl.Browser browser = this.b;
            financial.atomic.muppet.impl.Browser.Event event = financial.atomic.muppet.impl.Browser.Event.page;
            java.lang.String handle = this.c.handle();
            this.f6878a = 1;
            if (browser.emit((java.lang.Enum) event, (financial.atomic.muppet.impl.Browser.Event) handle, (kotlin.coroutines.Continuation<? super financial.atomic.muppet.Emitter.Event<financial.atomic.muppet.impl.Browser.Event>>) this) == coroutine_suspended) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.impl.a(this.b, this.c, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(financial.atomic.muppet.impl.Browser browser, financial.atomic.muppet.inter.Page page, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = browser;
        this.c = page;
    }
}
