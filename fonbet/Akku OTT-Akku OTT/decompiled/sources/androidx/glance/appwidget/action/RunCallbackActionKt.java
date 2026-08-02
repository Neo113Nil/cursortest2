package androidx.glance.appwidget.action;

import androidx.exifinterface.media.ExifInterface;
import androidx.glance.action.Action;
import androidx.glance.action.ActionParameters;
import androidx.glance.action.ActionParametersKt;
import io.flutter.plugins.firebase.analytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a(\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\b"}, d2 = {"actionRunCallback", "Landroidx/glance/action/Action;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/glance/appwidget/action/ActionCallback;", Constants.PARAMETERS, "Landroidx/glance/action/ActionParameters;", "callbackClass", "Ljava/lang/Class;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RunCallbackActionKt {
    public static final <T extends ActionCallback> Action actionRunCallback(Class<T> cls, ActionParameters actionParameters) {
        return new RunCallbackAction(cls, actionParameters);
    }

    public static /* synthetic */ Action actionRunCallback$default(Class cls, ActionParameters actionParameters, int i, Object obj) {
        if ((i & 2) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        return actionRunCallback(cls, actionParameters);
    }

    public static final /* synthetic */ <T extends ActionCallback> Action actionRunCallback(ActionParameters actionParameters) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return actionRunCallback(ActionCallback.class, actionParameters);
    }

    public static /* synthetic */ Action actionRunCallback$default(ActionParameters actionParameters, int i, Object obj) {
        if ((i & 1) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return actionRunCallback(ActionCallback.class, actionParameters);
    }
}
