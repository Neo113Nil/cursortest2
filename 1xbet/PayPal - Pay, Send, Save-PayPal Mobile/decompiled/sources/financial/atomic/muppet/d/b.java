package financial.atomic.muppet.d;

/* loaded from: classes17.dex */
public final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.impl.Browser f6860a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(financial.atomic.muppet.impl.Browser browser, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6860a = browser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.d.b(this.f6860a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.d.b(this.f6860a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Iterator it = this.f6860a.b().iterator();
        while (it.hasNext()) {
            financial.atomic.muppet.inter.Page page = (financial.atomic.muppet.inter.Page) it.next();
            this.f6860a.a(page, true);
            it.remove();
            page.close();
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new financial.atomic.muppet.impl.b(this.f6860a, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }
}
