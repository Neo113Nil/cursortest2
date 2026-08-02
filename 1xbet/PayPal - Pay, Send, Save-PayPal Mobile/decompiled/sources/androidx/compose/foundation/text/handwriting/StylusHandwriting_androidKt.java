package androidx.compose.foundation.text.handwriting;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003"}, d2 = {"", "isStylusHandwritingSupported", "Z", "()Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StylusHandwriting_androidKt {
    private static final boolean isStylusHandwritingSupported;

    public static final boolean isStylusHandwritingSupported() {
        return isStylusHandwritingSupported;
    }

    static {
        isStylusHandwritingSupported = android.os.Build.VERSION.SDK_INT >= 34;
    }
}
