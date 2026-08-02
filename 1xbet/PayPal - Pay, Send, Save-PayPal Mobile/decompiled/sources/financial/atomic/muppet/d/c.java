package financial.atomic.muppet.d;

/* loaded from: classes17.dex */
public final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6861a;
    public final /* synthetic */ financial.atomic.muppet.impl.Muppet b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(financial.atomic.muppet.impl.Muppet muppet, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = muppet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        financial.atomic.muppet.d.c cVar = new financial.atomic.muppet.d.c(this.b, continuation);
        cVar.f6861a = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        financial.atomic.muppet.d.c cVar = new financial.atomic.muppet.d.c(this.b, (kotlin.coroutines.Continuation) obj2);
        cVar.f6861a = (financial.atomic.muppet.Emitter.Event) obj;
        return cVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.muppet.Emitter.Event event = (financial.atomic.muppet.Emitter.Event) this.f6861a;
        java.util.Iterator it = this.b.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((financial.atomic.muppet.inter.Browser) obj2).handle(), (java.lang.String) event.getData())) {
                break;
            }
        }
        financial.atomic.muppet.inter.Browser browser = (financial.atomic.muppet.inter.Browser) obj2;
        if (browser != null) {
            this.b.removeBrowser(browser);
        }
        return kotlin.Unit.INSTANCE;
    }
}
