package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class t extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.Page f6798a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(financial.atomic.muppet.Page page, java.lang.Object obj, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6798a = page;
        this.b = obj;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.t(this.f6798a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.a.t) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.muppet.Page.access$get_wv(this.f6798a).addJavascriptInterface(this.b, this.c);
        return kotlin.Unit.INSTANCE;
    }
}
