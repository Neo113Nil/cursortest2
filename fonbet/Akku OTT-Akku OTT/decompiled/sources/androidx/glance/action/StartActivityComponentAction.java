package androidx.glance.action;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import io.flutter.plugins.firebase.analytics.Constants;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/action/StartActivityComponentAction;", "Landroidx/glance/action/StartActivityAction;", "componentName", "Landroid/content/ComponentName;", Constants.PARAMETERS, "Landroidx/glance/action/ActionParameters;", "activityOptions", "Landroid/os/Bundle;", "(Landroid/content/ComponentName;Landroidx/glance/action/ActionParameters;Landroid/os/Bundle;)V", "getActivityOptions", "()Landroid/os/Bundle;", "getComponentName", "()Landroid/content/ComponentName;", "getParameters", "()Landroidx/glance/action/ActionParameters;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class StartActivityComponentAction implements StartActivityAction {
    public static final int $stable = 8;
    private final Bundle activityOptions;
    private final ComponentName componentName;
    private final ActionParameters parameters;

    public StartActivityComponentAction(ComponentName componentName, ActionParameters actionParameters, Bundle bundle) {
        this.componentName = componentName;
        this.parameters = actionParameters;
        this.activityOptions = bundle;
    }

    @Override // androidx.glance.action.StartActivityAction
    public Bundle getActivityOptions() {
        return this.activityOptions;
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    @Override // androidx.glance.action.StartActivityAction
    public ActionParameters getParameters() {
        return this.parameters;
    }
}
