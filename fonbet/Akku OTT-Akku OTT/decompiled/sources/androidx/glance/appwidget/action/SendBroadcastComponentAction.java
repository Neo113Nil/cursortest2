package androidx.glance.appwidget.action;

import android.content.ComponentName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/action/SendBroadcastComponentAction;", "Landroidx/glance/appwidget/action/SendBroadcastAction;", "componentName", "Landroid/content/ComponentName;", "(Landroid/content/ComponentName;)V", "getComponentName", "()Landroid/content/ComponentName;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SendBroadcastComponentAction implements SendBroadcastAction {
    private final ComponentName componentName;

    public SendBroadcastComponentAction(ComponentName componentName) {
        this.componentName = componentName;
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }
}
