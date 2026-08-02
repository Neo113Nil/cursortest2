package androidx.glance.appwidget.action;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/glance/appwidget/action/LambdaActionBroadcasts;", "", "()V", "ActionTriggerLambda", "", "ExtraActionKey", "ExtraAppWidgetId", "createIntent", "Landroid/content/Intent;", "receiver", "Landroid/content/ComponentName;", "actionKey", "appWidgetId", "", "createIntent$glance_appwidget_release", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LambdaActionBroadcasts {
    public static final String ActionTriggerLambda = "ACTION_TRIGGER_LAMBDA";
    public static final String ExtraActionKey = "EXTRA_ACTION_KEY";
    public static final String ExtraAppWidgetId = "EXTRA_APPWIDGET_ID";
    public static final LambdaActionBroadcasts INSTANCE = new LambdaActionBroadcasts();

    private LambdaActionBroadcasts() {
    }

    public final Intent createIntent$glance_appwidget_release(ComponentName receiver, String actionKey, int appWidgetId) {
        return new Intent().setComponent(receiver).setAction(ActionTriggerLambda).putExtra(ExtraActionKey, actionKey).putExtra(ExtraAppWidgetId, appWidgetId);
    }
}
