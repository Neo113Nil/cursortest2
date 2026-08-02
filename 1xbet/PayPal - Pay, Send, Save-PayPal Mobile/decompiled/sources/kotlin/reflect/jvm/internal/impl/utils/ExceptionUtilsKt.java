package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes5.dex */
public final class ExceptionUtilsKt {
    public static final java.lang.RuntimeException rethrow(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        throw th;
    }

    public static final boolean isProcessCanceledException(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        java.lang.Class<?> cls = th.getClass();
        while (!kotlin.jvm.internal.Intrinsics.areEqual(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }
}
