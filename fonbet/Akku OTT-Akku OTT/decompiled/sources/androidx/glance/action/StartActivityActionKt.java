package androidx.glance.action;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.glance.ExperimentalGlanceApi;
import androidx.glance.action.ActionParameters;
import io.flutter.plugins.firebase.analytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a+\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0087\b\u001a(\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a6\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\f"}, d2 = {"actionStartActivity", "Landroidx/glance/action/Action;", "componentName", "Landroid/content/ComponentName;", Constants.PARAMETERS, "Landroidx/glance/action/ActionParameters;", "activityOptions", "Landroid/os/Bundle;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Activity;", "activity", "Ljava/lang/Class;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StartActivityActionKt {
    public static final Action actionStartActivity(ComponentName componentName, ActionParameters actionParameters) {
        return new StartActivityComponentAction(componentName, actionParameters, null);
    }

    public static /* synthetic */ Action actionStartActivity$default(ComponentName componentName, ActionParameters actionParameters, int i, Object obj) {
        if ((i & 2) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        return actionStartActivity(componentName, actionParameters);
    }

    @ExperimentalGlanceApi
    public static final Action actionStartActivity(ComponentName componentName, ActionParameters actionParameters, Bundle bundle) {
        return new StartActivityComponentAction(componentName, actionParameters, bundle);
    }

    public static final <T extends Activity> Action actionStartActivity(Class<T> cls, ActionParameters actionParameters) {
        return new StartActivityClassAction(cls, actionParameters, null);
    }

    public static /* synthetic */ Action actionStartActivity$default(ComponentName componentName, ActionParameters actionParameters, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        return actionStartActivity(componentName, actionParameters, bundle);
    }

    @ExperimentalGlanceApi
    public static final <T extends Activity> Action actionStartActivity(Class<T> cls, ActionParameters actionParameters, Bundle bundle) {
        return new StartActivityClassAction(cls, actionParameters, bundle);
    }

    public static final /* synthetic */ <T extends Activity> Action actionStartActivity(ActionParameters actionParameters) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return actionStartActivity(Activity.class, actionParameters);
    }

    public static /* synthetic */ Action actionStartActivity$default(Class cls, ActionParameters actionParameters, int i, Object obj) {
        if ((i & 2) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        return actionStartActivity(cls, actionParameters);
    }

    @ExperimentalGlanceApi
    public static final /* synthetic */ <T extends Activity> Action actionStartActivity(ActionParameters actionParameters, Bundle bundle) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return actionStartActivity(Activity.class, actionParameters, bundle);
    }

    public static /* synthetic */ Action actionStartActivity$default(Class cls, ActionParameters actionParameters, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        return actionStartActivity(cls, actionParameters, bundle);
    }

    public static /* synthetic */ Action actionStartActivity$default(ActionParameters actionParameters, int i, Object obj) {
        if ((i & 1) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return actionStartActivity(Activity.class, actionParameters);
    }

    public static /* synthetic */ Action actionStartActivity$default(ActionParameters actionParameters, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return actionStartActivity(Activity.class, actionParameters, bundle);
    }
}
