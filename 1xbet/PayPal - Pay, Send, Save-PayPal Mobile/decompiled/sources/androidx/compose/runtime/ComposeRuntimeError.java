package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeRuntimeError extends java.lang.IllegalStateException {
    public static final int $stable = 8;
    private final java.lang.String message;

    public ComposeRuntimeError(java.lang.String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.message;
    }
}
