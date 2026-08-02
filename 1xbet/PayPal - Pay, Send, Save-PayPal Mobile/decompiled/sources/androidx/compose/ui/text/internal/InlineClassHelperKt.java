package androidx.compose.ui.text.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a;\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0080\b\u0082\u0002\u0012\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0080\b\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0080\b\u0082\u0002\u0012\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u000f\u001aI\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0080\b\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0015\u0010\u0013"}, d2 = {"", "message", "", "throwIllegalStateException", "(Ljava/lang/String;)V", "", "throwIllegalStateExceptionForNullCheck", "(Ljava/lang/String;)Ljava/lang/Void;", "throwIllegalArgumentException", "throwIllegalArgumentExceptionForNullCheck", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/Function0;", "lazyMessage", "checkPrecondition", "(ZLkotlin/jvm/functions/Function0;)V", "", "T", "checkPreconditionNotNull", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "requirePrecondition", "requirePreconditionNotNull"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final void throwIllegalStateException(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final java.lang.Void throwIllegalStateExceptionForNullCheck(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void throwIllegalArgumentException(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final java.lang.Void throwIllegalArgumentExceptionForNullCheck(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
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

    public static final void requirePrecondition(boolean z, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        if (z) {
            return;
        }
        throwIllegalArgumentException(function0.invoke());
    }

    public static final <T> T requirePreconditionNotNull(T t, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        if (t != null) {
            return t;
        }
        throwIllegalArgumentExceptionForNullCheck(function0.invoke());
        throw new kotlin.KotlinNothingValueException();
    }
}
