package androidx.compose.runtime.platform;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a=\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n*\f\b\u0000\u0010\u000b\"\u00020\u00002\u00020\u0000"}, d2 = {"", "ref", "makeSynchronizedObject", "(Ljava/lang/Object;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "SynchronizedObject"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Synchronization_androidKt {
    public static final java.lang.Object makeSynchronizedObject(java.lang.Object obj) {
        return obj == null ? new java.lang.Object() : obj;
    }

    public static /* synthetic */ java.lang.Object makeSynchronizedObject$default(java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return obj == null ? new java.lang.Object() : obj;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m5438synchronized(java.lang.Object obj, kotlin.jvm.functions.Function0<? extends R> function0) {
        R invoke;
        synchronized (obj) {
            invoke = function0.invoke();
        }
        return invoke;
    }
}
