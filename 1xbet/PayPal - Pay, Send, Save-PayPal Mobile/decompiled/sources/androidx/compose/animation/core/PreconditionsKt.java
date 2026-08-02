package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0004\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\n\u001a?\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0080\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"", "message", "", "throwIllegalArgumentException", "(Ljava/lang/String;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/Function0;", "lazyMessage", "requirePrecondition", "(ZLkotlin/jvm/functions/Function0;)V", "throwIllegalStateException", "", "throwIllegalStateExceptionForNullCheck", "(Ljava/lang/String;)Ljava/lang/Void;", "checkPrecondition", "", "T", "checkPreconditionNotNull", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreconditionsKt {
    public static final void throwIllegalArgumentException(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void requirePrecondition(boolean z, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        if (z) {
            return;
        }
        throwIllegalArgumentException(function0.invoke());
    }

    public static final void throwIllegalStateException(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final java.lang.Void throwIllegalStateExceptionForNullCheck(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void checkPrecondition(boolean z, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        if (z) {
            return;
        }
        throwIllegalStateException(function0.invoke());
    }

    public static final <T> T checkPreconditionNotNull(T t, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck(function0.invoke());
        throw new kotlin.KotlinNothingValueException();
    }
}
