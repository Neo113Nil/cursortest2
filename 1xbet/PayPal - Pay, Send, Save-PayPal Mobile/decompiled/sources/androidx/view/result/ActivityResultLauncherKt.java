package androidx.view.result;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/activity/result/ActivityResultLauncher;", "Ljava/lang/Void;", "Landroidx/core/app/ActivityOptionsCompat;", "options", "", "launch", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/core/app/ActivityOptionsCompat;)V", "launchUnit"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityResultLauncherKt {
    public static /* synthetic */ void launch$default(androidx.view.result.ActivityResultLauncher activityResultLauncher, androidx.core.app.ActivityOptionsCompat activityOptionsCompat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activityOptionsCompat = null;
        }
        launch(activityResultLauncher, activityOptionsCompat);
    }

    public static final void launch(androidx.view.result.ActivityResultLauncher<java.lang.Void> activityResultLauncher, androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        activityResultLauncher.launch(null, activityOptionsCompat);
    }

    public static /* synthetic */ void launchUnit$default(androidx.view.result.ActivityResultLauncher activityResultLauncher, androidx.core.app.ActivityOptionsCompat activityOptionsCompat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activityOptionsCompat = null;
        }
        launchUnit(activityResultLauncher, activityOptionsCompat);
    }

    public static final void launchUnit(androidx.view.result.ActivityResultLauncher<kotlin.Unit> activityResultLauncher, androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        activityResultLauncher.launch(kotlin.Unit.INSTANCE, activityOptionsCompat);
    }
}
