package io.flutter.plugin.editing;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback f7683a;

    public b(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        this.f7683a = imeSyncDeferringInsetsCallback;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.view.WindowInsets windowInsets2;
        io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f7683a;
        imeSyncDeferringInsetsCallback.view = view;
        if (imeSyncDeferringInsetsCallback.needsSave) {
            imeSyncDeferringInsetsCallback.lastWindowInsets = windowInsets;
            imeSyncDeferringInsetsCallback.needsSave = false;
        }
        if (!imeSyncDeferringInsetsCallback.animating) {
            return view.onApplyWindowInsets(windowInsets);
        }
        windowInsets2 = android.view.WindowInsets.CONSUMED;
        return windowInsets2;
    }
}
