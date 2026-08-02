package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "width", "height", "", "checkMeasuredSize", "(II)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LookaheadDelegateKt {
    public static final void checkMeasuredSize(int i, int i2) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Size(");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
    }
}
