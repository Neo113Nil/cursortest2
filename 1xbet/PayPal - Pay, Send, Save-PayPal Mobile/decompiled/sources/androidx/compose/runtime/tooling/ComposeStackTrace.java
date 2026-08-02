package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8G¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/runtime/tooling/ComposeStackTrace;", "", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "frames", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getFrames", "()Ljava/util/List;", "", "getHasSourceInformation", "()Z", "getHasSourceInformation$annotations", "()V", "hasSourceInformation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeStackTrace {
    public static final int $stable = 8;
    private final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> frames;

    public static /* synthetic */ void getHasSourceInformation$annotations() {
    }

    public ComposeStackTrace(java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> list) {
        this.frames = list;
    }

    public final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> getFrames() {
        return this.frames;
    }

    public final boolean getHasSourceInformation() {
        java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> list = this.frames;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getSourceInfo() != null) {
                return true;
            }
        }
        return false;
    }
}
