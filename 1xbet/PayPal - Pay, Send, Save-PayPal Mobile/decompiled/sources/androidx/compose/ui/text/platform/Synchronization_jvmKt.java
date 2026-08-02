package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "ref", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "makeSynchronizedObject", "(Ljava/lang/Object;)Landroidx/compose/ui/text/platform/SynchronizedObject;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "lock", "Lkotlin/Function0;", "block", "synchronized", "(Landroidx/compose/ui/text/platform/SynchronizedObject;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Synchronization_jvmKt {
    public static final androidx.compose.ui.text.platform.SynchronizedObject makeSynchronizedObject(java.lang.Object obj) {
        return new androidx.compose.ui.text.platform.SynchronizedObject();
    }

    public static /* synthetic */ androidx.compose.ui.text.platform.SynchronizedObject makeSynchronizedObject$default(java.lang.Object obj, int i, java.lang.Object obj2) {
        return new androidx.compose.ui.text.platform.SynchronizedObject();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m8297synchronized(androidx.compose.ui.text.platform.SynchronizedObject synchronizedObject, kotlin.jvm.functions.Function0<? extends R> function0) {
        R invoke;
        synchronized (synchronizedObject) {
            invoke = function0.invoke();
        }
        return invoke;
    }
}
