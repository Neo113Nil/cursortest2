package dagger.hilt.android.lifecycle;

/* loaded from: classes17.dex */
public interface RetainedLifecycle {

    public interface OnClearedListener {
        void onCleared();
    }

    void addOnClearedListener(dagger.hilt.android.lifecycle.RetainedLifecycle.OnClearedListener onClearedListener);

    void removeOnClearedListener(dagger.hilt.android.lifecycle.RetainedLifecycle.OnClearedListener onClearedListener);
}
