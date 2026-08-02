package androidx.glance.appwidget.action;

import android.content.Intent;
import android.os.Bundle;
import androidx.glance.ExperimentalGlanceApi;
import androidx.glance.action.Action;
import androidx.glance.action.ActionParameters;
import androidx.glance.action.ActionParametersKt;
import io.flutter.plugins.firebase.analytics.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"actionStartActivity", "Landroidx/glance/action/Action;", "intent", "Landroid/content/Intent;", Constants.PARAMETERS, "Landroidx/glance/action/ActionParameters;", "activityOptions", "Landroid/os/Bundle;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StartActivityIntentActionKt {
    public static final Action actionStartActivity(Intent intent, ActionParameters actionParameters) {
        return new StartActivityIntentAction(intent, actionParameters, null);
    }

    public static /* synthetic */ Action actionStartActivity$default(Intent intent, ActionParameters actionParameters, int i, Object obj) {
        if ((i & 2) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        return actionStartActivity(intent, actionParameters);
    }

    @ExperimentalGlanceApi
    public static final Action actionStartActivity(Intent intent, ActionParameters actionParameters, Bundle bundle) {
        return new StartActivityIntentAction(intent, actionParameters, bundle);
    }

    public static /* synthetic */ Action actionStartActivity$default(Intent intent, ActionParameters actionParameters, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        return actionStartActivity(intent, actionParameters, bundle);
    }
}
