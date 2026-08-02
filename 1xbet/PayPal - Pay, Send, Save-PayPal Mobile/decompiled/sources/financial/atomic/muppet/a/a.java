package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6750a;
    public final /* synthetic */ financial.atomic.muppet.Page b;
    public final /* synthetic */ financial.atomic.muppet.bridge.Bridge c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(financial.atomic.muppet.Page page, financial.atomic.muppet.bridge.Bridge bridge, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
        this.c = bridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.a(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.a(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6750a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.Page page = this.b;
            java.lang.String str = financial.atomic.muppet.Constants.BRIDGE_NAME.getCom.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE java.lang.String();
            final financial.atomic.muppet.bridge.Bridge bridge = this.c;
            java.lang.Object obj2 = new java.lang.Object() { // from class: financial.atomic.muppet.BridgeKt$inject$1$1
                @android.webkit.JavascriptInterface
                public final java.lang.String postMessage(java.lang.String message) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                    return financial.atomic.muppet.bridge.Bridge.this.postMessage(message);
                }
            };
            this.f6750a = 1;
            if (page.exposeObject(str, obj2, this) == coroutine_suspended) {
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
