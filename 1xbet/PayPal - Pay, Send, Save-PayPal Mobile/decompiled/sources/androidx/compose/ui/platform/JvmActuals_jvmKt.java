package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u00060\u0000j\u0002`\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0081\b¢\u0006\u0004\b\r\u0010\u000e*\f\b\u0000\u0010\u0010\"\u00020\u000f2\u00020\u000f"}, d2 = {"", "obj", "", "name", "simpleIdentityToString", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "nativeClass", "(Ljava/lang/Object;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/ui/platform/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JvmActuals_jvmKt {
    public static final java.lang.String simpleIdentityToString(java.lang.Object obj, java.lang.String str) {
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append('@');
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%07x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        sb.append(format);
        return sb.toString();
    }

    public static final java.lang.Object nativeClass(java.lang.Object obj) {
        return obj.getClass();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "not expected to be referenced directly as the old version had to be inlined")
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m7761synchronized(java.lang.Object obj, kotlin.jvm.functions.Function0<? extends R> function0) {
        R invoke;
        synchronized (obj) {
            invoke = function0.invoke();
        }
        return invoke;
    }
}
