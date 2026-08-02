package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.bridge.Muppet f6818a;
    public final /* synthetic */ financial.atomic.muppet.bridge.Bridge b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(financial.atomic.muppet.bridge.Muppet muppet, financial.atomic.muppet.bridge.Bridge bridge, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6818a = muppet;
        this.b = bridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.f(this.f6818a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.b.f(this.f6818a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        financial.atomic.muppet.inter.Muppet muppet;
        financial.atomic.muppet.inter.Browser.Factory factory;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        muppet = this.f6818a.Camera2StreamConfigurationMap;
        factory = this.f6818a.getHighSpeedVideoFpsRanges;
        financial.atomic.muppet.inter.Browser launch = muppet.launch(factory);
        final int hashCode = launch.hashCode();
        this.b.getStore().getBrowsers().put(kotlin.coroutines.jvm.internal.Boxing.boxInt(hashCode), launch);
        financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.b.f$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String concat;
                concat = "MuppetBridge.invoke.launch: ".concat(java.lang.String.valueOf(hashCode));
                return concat;
            }
        };
        return java.lang.String.valueOf(hashCode);
    }
}
