package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class h1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f6772a;
    public java.lang.Object b;
    public int c;
    public final /* synthetic */ financial.atomic.muppet.Page d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(financial.atomic.muppet.Page page, boolean z, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.d = page;
        this.e = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.h1(this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.h1(this.d, this.e, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a9, code lost:
    
        if (r9 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r9.bringToFront(r8) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator viewPropertyAnimator;
        java.lang.Object orThrow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    animate = (android.view.ViewPropertyAnimator) this.b;
                    viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f6772a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    animate.setDuration(500L);
                    animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                    animate.translationX(0.0f);
                    animate.alpha(1.0f);
                    this.f6772a = viewPropertyAnimator;
                    this.b = animate;
                    this.c = 3;
                    kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this));
                    animate.setListener(new financial.atomic.muppet.a.g1(animate, safeContinuation));
                    animate.start();
                    orThrow = safeContinuation.getOrThrow();
                    if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(this);
                    }
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.webkit.WebView view = this.d.view();
        if (this.e) {
            view.setX(view.getWidth());
            animate = view.animate();
            financial.atomic.muppet.Page page = this.d;
            this.f6772a = animate;
            this.b = animate;
            this.c = 2;
            if (page.bringToFront(this) != coroutine_suspended) {
                viewPropertyAnimator = animate;
                animate.setDuration(500L);
                animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                animate.translationX(0.0f);
                animate.alpha(1.0f);
                this.f6772a = viewPropertyAnimator;
                this.b = animate;
                this.c = 3;
                kotlin.coroutines.SafeContinuation safeContinuation2 = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this));
                animate.setListener(new financial.atomic.muppet.a.g1(animate, safeContinuation2));
                animate.start();
                orThrow = safeContinuation2.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
            }
        } else {
            view.setX(0.0f);
            view.setAlpha(1.0f);
            financial.atomic.muppet.Page page2 = this.d;
            this.c = 1;
        }
        return coroutine_suspended;
    }
}
