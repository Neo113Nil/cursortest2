package kotlinx.coroutines;

/* compiled from: Job.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    JobKt__JobKt$invokeOnCompletion$1(java.lang.Object obj) {
        super(1, obj, kotlinx.coroutines.JobNode.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        invoke2(th);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.Throwable th) {
        ((kotlinx.coroutines.JobNode) this.receiver).invoke(th);
    }
}
