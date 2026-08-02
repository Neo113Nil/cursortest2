package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0004R*\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/activity/compose/ActivityResultLauncherHolder;", com.visa.cbp.getEncExpo.warmup, "", "<init>", "()V", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "", "launch", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "Landroidx/activity/result/ActivityResultLauncher;", com.datadog.android.profiling.DdProfilingContentProvider.TELEMETRY_APP_START_INFO_LAUNCHER, "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityResultLauncherHolder<I> {
    public static final int $stable = 8;
    private androidx.view.result.ActivityResultLauncher<I> launcher;

    public final androidx.view.result.ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void setLauncher(androidx.view.result.ActivityResultLauncher<I> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void launch(I input, androidx.core.app.ActivityOptionsCompat options) {
        androidx.view.result.ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher == null) {
            throw new java.lang.IllegalStateException("Launcher has not been initialized".toString());
        }
        activityResultLauncher.launch(input, options);
    }

    public final void unregister() {
        androidx.view.result.ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher == null) {
            throw new java.lang.IllegalStateException("Launcher has not been initialized".toString());
        }
        activityResultLauncher.unregister();
    }
}
