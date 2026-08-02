package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/text/DeadKeyCombiner;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "", "consume-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "consume", "Camera2StreamConfigurationMap", "Ljava/lang/Integer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeadKeyCombiner {
    public static final int $stable = 8;
    private java.lang.Integer Camera2StreamConfigurationMap;

    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final java.lang.Integer m2051consumeZmokQxo(android.view.KeyEvent event) {
        int m7091getUtf16CodePointZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7091getUtf16CodePointZmokQxo(event);
        if ((Integer.MIN_VALUE & m7091getUtf16CodePointZmokQxo) != 0) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(m7091getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        java.lang.Integer num = this.Camera2StreamConfigurationMap;
        if (num != null) {
            this.Camera2StreamConfigurationMap = null;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(android.view.KeyCharacterMap.getDeadChar(num.intValue(), m7091getUtf16CodePointZmokQxo));
            java.lang.Integer num2 = valueOf.intValue() != 0 ? valueOf : null;
            if (num2 != null) {
                m7091getUtf16CodePointZmokQxo = num2.intValue();
            }
            return java.lang.Integer.valueOf(m7091getUtf16CodePointZmokQxo);
        }
        return java.lang.Integer.valueOf(m7091getUtf16CodePointZmokQxo);
    }
}
