package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class j extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.inter.Page f6881a;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.j(this.f6881a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.j$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return financial.atomic.muppet.j.$r8$lambda$ExDJyQwstguk8PPVk_lZjbQqfWw();
            }
        };
        ((financial.atomic.muppet.Page) this.f6881a).close();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$ExDJyQwstguk8PPVk_lZjbQqfWw() {
        return "onCreateWindow: blocked new window, closing page";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.j(this.f6881a, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(financial.atomic.muppet.inter.Page page, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6881a = page;
    }
}
