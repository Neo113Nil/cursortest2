package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\n\u0010\b\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000b\u0010\b\u001a\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\f\u0010\b\u001a\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\r\u0010\b"}, d2 = {"", "requiredApi", "", "methodName", "", "checkApi", "(ILjava/lang/String;)V", "checkLOrHigher", "(Ljava/lang/String;)V", "checkMOrHigher", "checkNOrHigher", "checkOOrHigher", "checkPOrHigher", "checkQOrHigher"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugKt {
    public static final void checkApi(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (android.os.Build.VERSION.SDK_INT >= i) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" is not supported on API ");
        sb.append(android.os.Build.VERSION.SDK_INT);
        sb.append(" (requires API ");
        sb.append(i);
        sb.append(')');
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public static final void checkPOrHigher(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" is not supported on API ");
        sb.append(android.os.Build.VERSION.SDK_INT);
        sb.append(" (requires API 28)");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public static final void checkQOrHigher(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" is not supported on API ");
        sb.append(android.os.Build.VERSION.SDK_INT);
        sb.append(" (requires API 29)");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public static final void checkOOrHigher(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public static final void checkNOrHigher(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public static final void checkMOrHigher(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public static final void checkLOrHigher(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
