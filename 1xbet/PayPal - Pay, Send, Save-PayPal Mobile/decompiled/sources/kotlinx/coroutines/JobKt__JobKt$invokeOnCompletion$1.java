package kotlinx.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(java.lang.Throwable th) {
        ((kotlinx.coroutines.JobNode) this.receiver).invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        getHighSpeedVideoSizes(th);
        return kotlin.Unit.INSTANCE;
    }

    JobKt__JobKt$invokeOnCompletion$1(java.lang.Object obj) {
        super(1, obj, kotlinx.coroutines.JobNode.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }
}
