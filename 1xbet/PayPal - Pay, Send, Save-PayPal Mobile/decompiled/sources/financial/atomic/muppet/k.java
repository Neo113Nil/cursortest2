package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class k extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.Page f6882a;
    public final /* synthetic */ financial.atomic.muppet.inter.Page b;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.k(this.f6882a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6882a.getGetHighSpeedVideoSizesFor(), kotlinx.coroutines.Dispatchers.getMain(), null, new financial.atomic.muppet.a.q0(this.b, null), 2, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.k(this.f6882a, this.b, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(financial.atomic.muppet.Page page, financial.atomic.muppet.inter.Page page2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6882a = page;
        this.b = page2;
    }
}
