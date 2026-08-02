package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class o0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6789a;
    public final /* synthetic */ financial.atomic.muppet.Page b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(financial.atomic.muppet.Page page, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.o0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.o0(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r6.emit((java.lang.Enum) r1, (financial.atomic.muppet.impl.Page.Event) r3, (kotlin.coroutines.Continuation<? super financial.atomic.muppet.Emitter.Event<financial.atomic.muppet.impl.Page.Event>>) r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (financial.atomic.muppet.inter.Page.DefaultImpls.hide$default(r6, false, r5, 1, null) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6789a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.Page page = this.b;
            this.f6789a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.b.close();
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        financial.atomic.muppet.Page page2 = this.b;
        financial.atomic.muppet.impl.Page.Event event = financial.atomic.muppet.impl.Page.Event.close;
        java.lang.String handle = page2.handle();
        this.f6789a = 2;
    }
}
