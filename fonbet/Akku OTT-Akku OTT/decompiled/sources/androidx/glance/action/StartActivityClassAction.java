package androidx.glance.action;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import io.flutter.plugins.firebase.analytics.Constants;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/glance/action/StartActivityClassAction;", "Landroidx/glance/action/StartActivityAction;", "activityClass", "Ljava/lang/Class;", "Landroid/app/Activity;", Constants.PARAMETERS, "Landroidx/glance/action/ActionParameters;", "activityOptions", "Landroid/os/Bundle;", "(Ljava/lang/Class;Landroidx/glance/action/ActionParameters;Landroid/os/Bundle;)V", "getActivityClass", "()Ljava/lang/Class;", "getActivityOptions", "()Landroid/os/Bundle;", "getParameters", "()Landroidx/glance/action/ActionParameters;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class StartActivityClassAction implements StartActivityAction {
    public static final int $stable = 8;
    private final Class<? extends Activity> activityClass;
    private final Bundle activityOptions;
    private final ActionParameters parameters;

    public StartActivityClassAction(Class<? extends Activity> cls, ActionParameters actionParameters, Bundle bundle) {
        this.activityClass = cls;
        this.parameters = actionParameters;
        this.activityOptions = bundle;
    }

    public final Class<? extends Activity> getActivityClass() {
        return this.activityClass;
    }

    @Override // androidx.glance.action.StartActivityAction
    public Bundle getActivityOptions() {
        return this.activityOptions;
    }

    @Override // androidx.glance.action.StartActivityAction
    public ActionParameters getParameters() {
        return this.parameters;
    }
}
