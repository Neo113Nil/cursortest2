package androidx.compose.foundation.text;

/* compiled from: KeyMapping.android.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"platformDefaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final androidx.compose.foundation.text.KeyMapping platformDefaultKeyMapping = new androidx.compose.foundation.text.KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public androidx.compose.foundation.text.KeyCommand mo874mapZmokQxo(android.view.KeyEvent event) {
            androidx.compose.foundation.text.KeyCommand keyCommand = null;
            if (androidx.compose.ui.input.key.KeyEvent_androidKt.m3140isShiftPressedZmokQxo(event) && androidx.compose.ui.input.key.KeyEvent_androidKt.m3137isAltPressedZmokQxo(event)) {
                long m3134getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event);
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m896getDirectionLeftEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_LEFT;
                } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m897getDirectionRightEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_RIGHT;
                } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m898getDirectionUpEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_HOME;
                } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m895getDirectionDownEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_END;
                }
            } else if (androidx.compose.ui.input.key.KeyEvent_androidKt.m3137isAltPressedZmokQxo(event)) {
                long m3134getKeyZmokQxo2 = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event);
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m896getDirectionLeftEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.LINE_LEFT;
                } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m897getDirectionRightEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.LINE_RIGHT;
                } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m898getDirectionUpEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.HOME;
                } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m895getDirectionDownEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.END;
                }
            }
            return keyCommand == null ? androidx.compose.foundation.text.KeyMappingKt.getDefaultKeyMapping().mo874mapZmokQxo(event) : keyCommand;
        }
    };

    public static final androidx.compose.foundation.text.KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
