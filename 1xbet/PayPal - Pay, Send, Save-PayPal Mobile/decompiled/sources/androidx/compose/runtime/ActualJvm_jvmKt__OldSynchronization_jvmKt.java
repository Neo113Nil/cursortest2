package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081\b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "p0", "Lkotlin/Function0;", "p1", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/ActualJvm_jvmKt")
/* loaded from: classes.dex */
final /* synthetic */ class ActualJvm_jvmKt__OldSynchronization_jvmKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "not expected to be referenced directly as the old version had to be inlined")
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m5233synchronized(java.lang.Object obj, kotlin.jvm.functions.Function0<? extends R> function0) {
        R invoke;
        synchronized (obj) {
            invoke = function0.invoke();
        }
        return invoke;
    }
}
