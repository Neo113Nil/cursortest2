package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class a0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f6751a;
    public java.lang.Object b;
    public int c;
    public final /* synthetic */ financial.atomic.muppet.Page d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(financial.atomic.muppet.Page page, boolean z, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.d = page;
        this.e = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.a0(this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.a0(this.d, this.e, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.webkit.WebView view = this.d.view();
            if (this.e) {
                android.view.ViewPropertyAnimator animate = view.animate();
                animate.setDuration(250L);
                animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                animate.translationX(view.getWidth());
                this.f6751a = animate;
                this.b = animate;
                this.c = 1;
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this));
                animate.setListener(new financial.atomic.muppet.a.z(animate, safeContinuation));
                animate.start();
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                view.setX(view.getWidth());
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
