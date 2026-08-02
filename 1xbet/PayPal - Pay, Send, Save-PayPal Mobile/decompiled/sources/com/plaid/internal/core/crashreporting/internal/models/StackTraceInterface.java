package com.plaid.internal.core.crashreporting.internal.models;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceInterface;", "", "", "Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "stackTrace", "<init>", "([Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "frames", "[Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StackTraceInterface {
    public static final java.lang.String STACKTRACE_INTERFACE = "sentry.interfaces.Stacktrace";
    private final com.plaid.internal.core.crashreporting.internal.models.StackTraceElement[] frames;

    public StackTraceInterface(com.plaid.internal.core.crashreporting.internal.models.StackTraceElement[] stackTraceElementArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTraceElementArr, "");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(stackTraceElementArr, stackTraceElementArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        this.frames = (com.plaid.internal.core.crashreporting.internal.models.StackTraceElement[]) copyOf;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(com.plaid.internal.core.crashreporting.internal.models.StackTraceInterface.class, other.getClass())) {
            return false;
        }
        return java.util.Arrays.equals(this.frames, ((com.plaid.internal.core.crashreporting.internal.models.StackTraceInterface) other).frames);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.frames);
    }

    public final java.lang.String toString() {
        java.lang.String arrays = java.util.Arrays.toString(this.frames);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StackTraceInterface{frames=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
