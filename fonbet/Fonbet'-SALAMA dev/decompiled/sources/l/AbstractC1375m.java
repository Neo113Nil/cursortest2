package l;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1375m {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i7) {
        callback.onProvideKeyboardShortcuts(list, menu, i7);
    }
}
