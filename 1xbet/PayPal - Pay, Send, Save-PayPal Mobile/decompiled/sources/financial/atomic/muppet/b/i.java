package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class i extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.bridge.Page f6821a;
    public final /* synthetic */ financial.atomic.muppet.inter.Page b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(financial.atomic.muppet.bridge.Page page, financial.atomic.muppet.inter.Page page2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6821a = page;
        this.b = page2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.i(this.f6821a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        new financial.atomic.muppet.b.i(this.f6821a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        financial.atomic.muppet.bridge.Bridge bridge;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        bridge = this.f6821a.Camera2StreamConfigurationMap;
        bridge.getStore().getPages().remove(kotlin.coroutines.jvm.internal.Boxing.boxInt(this.b.hashCode()));
        this.b.close();
        return null;
    }
}
