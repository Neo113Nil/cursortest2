package B0;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class D1 {
    public static final boolean a(@NotNull KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
