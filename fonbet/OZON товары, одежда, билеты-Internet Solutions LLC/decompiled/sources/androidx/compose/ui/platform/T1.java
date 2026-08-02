package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class T1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final T1 f40739a = new T1();

    public final void a(@NotNull ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(@NotNull View view, @NotNull ActionMode.Callback callback, int i11) {
        return view.startActionMode(callback, i11);
    }
}
