package androidx.appcompat.app;

/* loaded from: classes3.dex */
public interface AppCompatCallback {
    void onSupportActionModeFinished(androidx.appcompat.view.ActionMode actionMode);

    void onSupportActionModeStarted(androidx.appcompat.view.ActionMode actionMode);

    androidx.appcompat.view.ActionMode onWindowStartingSupportActionMode(androidx.appcompat.view.ActionMode.Callback callback);
}
