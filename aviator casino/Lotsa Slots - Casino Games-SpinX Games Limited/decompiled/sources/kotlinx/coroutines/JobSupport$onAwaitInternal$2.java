package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class JobSupport$onAwaitInternal$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.JobSupport, java.lang.Object, java.lang.Object, java.lang.Object> {
    public static final kotlinx.coroutines.JobSupport$onAwaitInternal$2 INSTANCE = new kotlinx.coroutines.JobSupport$onAwaitInternal$2();

    JobSupport$onAwaitInternal$2() {
        super(3, kotlinx.coroutines.JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.JobSupport jobSupport, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object onAwaitInternalProcessResFunc;
        onAwaitInternalProcessResFunc = jobSupport.onAwaitInternalProcessResFunc(obj, obj2);
        return onAwaitInternalProcessResFunc;
    }
}
