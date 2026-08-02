package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/KeyMapping;", "platformDefaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyMapping_androidKt {
    private static final androidx.compose.foundation.text.KeyMapping platformDefaultKeyMapping = new androidx.compose.foundation.text.KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public final androidx.compose.foundation.text.KeyCommand mo2054mapZmokQxo(android.view.KeyEvent event) {
            androidx.compose.foundation.text.KeyCommand keyCommand = null;
            if (androidx.compose.ui.input.key.KeyEvent_androidKt.m7095isShiftPressedZmokQxo(event) && androidx.compose.ui.input.key.KeyEvent_androidKt.m7092isAltPressedZmokQxo(event)) {
                long m7089getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.Companion.m6857getDirectionLeftEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_LEFT;
                } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.Companion.m6858getDirectionRightEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_RIGHT;
                } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.Companion.m6859getDirectionUpEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_HOME;
                } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.Companion.m6854getDirectionDownEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_END;
                }
            } else if (androidx.compose.ui.input.key.KeyEvent_androidKt.m7092isAltPressedZmokQxo(event)) {
                long m7089getKeyZmokQxo2 = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.Companion.m6857getDirectionLeftEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.LINE_LEFT;
                } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.Companion.m6858getDirectionRightEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.LINE_RIGHT;
                } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.Companion.m6859getDirectionUpEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.HOME;
                } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.Companion.m6854getDirectionDownEK5gGoQ())) {
                    keyCommand = androidx.compose.foundation.text.KeyCommand.END;
                }
            }
            return keyCommand == null ? androidx.compose.foundation.text.KeyMappingKt.getDefaultKeyMapping().mo2054mapZmokQxo(event) : keyCommand;
        }
    };

    public static final androidx.compose.foundation.text.KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
