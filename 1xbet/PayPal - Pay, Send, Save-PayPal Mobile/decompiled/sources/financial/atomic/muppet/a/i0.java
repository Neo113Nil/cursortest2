package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6774a;
    public final /* synthetic */ financial.atomic.muppet.Page b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(financial.atomic.muppet.Page page, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.i0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.a.i0) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6774a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.webkit.CookieManager cookieManager = this.b.browser().cookieManager();
            java.lang.String str = this.c;
            java.lang.String str2 = this.d;
            this.f6774a = 1;
            kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this));
            cookieManager.setCookie(str, str2, new financial.atomic.muppet.a.h0(safeContinuation));
            java.lang.Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (orThrow == coroutine_suspended) {
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
