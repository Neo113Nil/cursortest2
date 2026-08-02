package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u001c\u0010\u0007\u001a\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tR-\u0010\u0007\u001a\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/runtime/MovableContent;", "P", "", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "getContent", "()Lkotlin/jvm/functions/Function3;", "", "used", "Z", "getUsed$runtime", "()Z", "setUsed$runtime", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MovableContent<P> {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function3<P, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
    private boolean used;

    /* JADX WARN: Multi-variable type inference failed */
    public MovableContent(kotlin.jvm.functions.Function3<? super P, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.content = function3;
    }

    public final kotlin.jvm.functions.Function3<P, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.content;
    }

    /* renamed from: getUsed$runtime, reason: from getter */
    public final boolean getUsed() {
        return this.used;
    }

    public final void setUsed$runtime(boolean z) {
        this.used = z;
    }
}
