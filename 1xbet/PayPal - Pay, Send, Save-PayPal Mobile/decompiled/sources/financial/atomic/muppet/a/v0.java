package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class v0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6803a;
    public final /* synthetic */ financial.atomic.muppet.Page b;
    public final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(financial.atomic.muppet.Page page, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.v0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.v0(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6803a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.Page page = this.b;
            financial.atomic.muppet.impl.Page.Event event = financial.atomic.muppet.impl.Page.Event.visible;
            java.lang.String str = this.c;
            this.f6803a = 1;
            if (page.emit((java.lang.Enum) event, (financial.atomic.muppet.impl.Page.Event) str, (kotlin.coroutines.Continuation<? super financial.atomic.muppet.Emitter.Event<financial.atomic.muppet.impl.Page.Event>>) this) == coroutine_suspended) {
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
}
