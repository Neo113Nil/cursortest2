package financial.atomic.muppet.d;

/* loaded from: classes17.dex */
public final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6859a;
    public final /* synthetic */ financial.atomic.muppet.impl.Browser b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(financial.atomic.muppet.impl.Browser browser, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = browser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        financial.atomic.muppet.d.a aVar = new financial.atomic.muppet.d.a(this.b, continuation);
        aVar.f6859a = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        financial.atomic.muppet.d.a aVar = new financial.atomic.muppet.d.a(this.b, (kotlin.coroutines.Continuation) obj2);
        aVar.f6859a = (financial.atomic.muppet.Emitter.Event) obj;
        return aVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.muppet.Emitter.Event event = (financial.atomic.muppet.Emitter.Event) this.f6859a;
        java.util.Iterator it = this.b.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((financial.atomic.muppet.inter.Page) obj2).handle(), (java.lang.String) event.getData())) {
                break;
            }
        }
        financial.atomic.muppet.inter.Page page = (financial.atomic.muppet.inter.Page) obj2;
        if (page != null) {
            financial.atomic.muppet.impl.Browser.removePage$default(this.b, page, false, 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
