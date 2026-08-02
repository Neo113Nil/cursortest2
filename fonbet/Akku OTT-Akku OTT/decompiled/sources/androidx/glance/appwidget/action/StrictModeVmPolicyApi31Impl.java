package androidx.glance.appwidget.action;

import android.os.StrictMode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi(31)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/glance/appwidget/action/StrictModeVmPolicyApi31Impl;", "", "()V", "permitUnsafeIntentLaunch", "Landroid/os/StrictMode$VmPolicy$Builder;", "builder", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class StrictModeVmPolicyApi31Impl {
    public static final StrictModeVmPolicyApi31Impl INSTANCE = new StrictModeVmPolicyApi31Impl();

    private StrictModeVmPolicyApi31Impl() {
    }

    @DoNotInline
    public final StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
