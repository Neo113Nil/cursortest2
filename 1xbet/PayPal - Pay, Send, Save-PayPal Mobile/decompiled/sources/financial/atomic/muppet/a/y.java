package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class y extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6808a;
    public final /* synthetic */ financial.atomic.muppet.Page b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.util.Map d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(financial.atomic.muppet.Page page, java.lang.String str, java.util.Map map, long j, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
        this.c = str;
        this.d = map;
        this.e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.y(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.a.y) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        boolean isHostAllowed;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6808a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            completableDeferred = this.b.get_initialized();
            this.f6808a = 1;
            if (completableDeferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        isHostAllowed = this.b.isHostAllowed(this.c);
        if (!isHostAllowed) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b.getGetHighSpeedVideoSizesFor(), null, null, new financial.atomic.muppet.a.w(this.b, this.c, null), 3, null);
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(CompletableDeferred$default.complete(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
            return CompletableDeferred$default;
        }
        this.b.once(financial.atomic.muppet.impl.Page.Event.finished, new financial.atomic.muppet.h(CompletableDeferred$default, null));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b.getGetHighSpeedVideoSizesFor(), null, null, new financial.atomic.muppet.a.x(this.e, CompletableDeferred$default, null), 3, null);
        financial.atomic.muppet.Page.access$get_wv(this.b).loadUrl(this.c, this.d);
        return CompletableDeferred$default;
    }
}
