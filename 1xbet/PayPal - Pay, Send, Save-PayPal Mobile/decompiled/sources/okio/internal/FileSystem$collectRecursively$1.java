package okio.internal;

@kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {116, 135, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "path", "children", "symlinkPath", "child", "followSymlinks", "postorder", "symlinkCount", "$this$collectRecursively", "fileSystem", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "path", "children", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "Z$0", "Z$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "Z$1"}, v = 1)
/* renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class FileSystem$collectRecursively$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return okio.internal.FileSystem.collectRecursively(null, null, null, null, false, false, this);
    }

    FileSystem$collectRecursively$1(kotlin.coroutines.Continuation<? super okio.internal.FileSystem$collectRecursively$1> continuation) {
        super(continuation);
    }
}
