package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "", "<init>", "()V", "", "resetCachedX", "", "cachedX", "Ljava/lang/Float;", "getCachedX", "()Ljava/lang/Float;", "setCachedX", "(Ljava/lang/Float;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextPreparedSelectionState {
    public static final int $stable = 8;
    private java.lang.Float cachedX;

    public final java.lang.Float getCachedX() {
        return this.cachedX;
    }

    public final void setCachedX(java.lang.Float f) {
        this.cachedX = f;
    }

    public final void resetCachedX() {
        this.cachedX = null;
    }
}
