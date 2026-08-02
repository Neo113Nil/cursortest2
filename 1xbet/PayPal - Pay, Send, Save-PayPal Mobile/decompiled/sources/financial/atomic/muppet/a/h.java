package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class h implements kotlinx.coroutines.flow.Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.SharedFlow f6770a;
    public final /* synthetic */ java.lang.String b;

    public h(kotlinx.coroutines.flow.SharedFlow sharedFlow, java.lang.String str) {
        this.f6770a = sharedFlow;
        this.b = str;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = this.f6770a.collect(new financial.atomic.muppet.a.g(flowCollector, this.b), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
