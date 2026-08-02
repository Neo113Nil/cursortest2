package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "Landroidx/compose/runtime/tooling/ComposeStackTrace;", "trace", "<init>", "(Landroidx/compose/runtime/tooling/ComposeStackTrace;)V", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/tooling/ComposeStackTrace;", "", "getMessage", "()Ljava/lang/String;", "message"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiagnosticComposeException extends java.lang.RuntimeException {
    public static final int $stable = 8;
    private final androidx.compose.runtime.tooling.ComposeStackTrace Camera2StreamConfigurationMap;

    public DiagnosticComposeException(androidx.compose.runtime.tooling.ComposeStackTrace composeStackTrace) {
        this.Camera2StreamConfigurationMap = composeStackTrace;
        if (composeStackTrace.getHasSourceInformation()) {
            return;
        }
        java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> filterInternalFramesByGroupKey = androidx.compose.runtime.tooling.ComposeStackTraceKt.filterInternalFramesByGroupKey(composeStackTrace);
        int size = filterInternalFramesByGroupKey.size();
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[size];
        for (int i = 0; i < size; i++) {
            androidx.compose.runtime.tooling.ComposeStackTraceFrame composeStackTraceFrame = filterInternalFramesByGroupKey.get(i);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("m$");
            sb.append(composeStackTraceFrame.getGroupKey());
            stackTraceElementArr[i] = new java.lang.StackTraceElement("$$compose", sb.toString(), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        if (!this.Camera2StreamConfigurationMap.getHasSourceInformation()) {
            return "Composition stack when thrown:";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Composition stack when thrown:");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        androidx.compose.runtime.tooling.ComposeStackTraceKt.appendStackTrace(sb, this.Camera2StreamConfigurationMap);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
