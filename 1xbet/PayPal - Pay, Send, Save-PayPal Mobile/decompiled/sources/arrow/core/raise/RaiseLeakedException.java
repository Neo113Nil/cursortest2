package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Larrow/core/raise/RaiseLeakedException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RaiseLeakedException extends java.lang.IllegalStateException {
    public RaiseLeakedException() {
        super("'raise' or 'bind' was leaked outside of its context scope.\nMake sure all calls to 'raise' and 'bind' occur within the lifecycle of nullable { }, either { } or similar builders.\n\nSee Arrow documentation on 'Typed errors' for further information.");
    }
}
