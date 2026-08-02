package androidx.collection.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a4\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\b\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/Function0;", "", "lazyMessage", "", "checkPrecondition", "(ZLkotlin/jvm/functions/Function0;)V", "requirePrecondition", "message", "throwIllegalArgumentException", "(Ljava/lang/String;)V", "throwIllegalStateException", "throwIndexOutOfBoundsException", "throwNoSuchElementException", "", "throwNoSuchElementExceptionForInline", "(Ljava/lang/String;)Ljava/lang/Void;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RuntimeHelpersKt {
    public static final void throwIllegalStateException(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        throw new java.lang.IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static final void throwNoSuchElementException(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        throw new java.util.NoSuchElementException(str);
    }

    public static final java.lang.Void throwNoSuchElementExceptionForInline(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        throw new java.util.NoSuchElementException(str);
    }

    public static final void checkPrecondition(boolean z, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (z) {
            return;
        }
        throwIllegalStateException(function0.invoke());
    }

    public static final void throwIllegalArgumentException(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void requirePrecondition(boolean z, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (z) {
            return;
        }
        throwIllegalArgumentException(function0.invoke());
    }
}
