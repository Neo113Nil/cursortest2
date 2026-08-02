package androidx.glance.appwidget.action;

import android.content.ComponentName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/glance/appwidget/action/SendBroadcastActionAction;", "Landroidx/glance/appwidget/action/SendBroadcastAction;", "action", "", "componentName", "Landroid/content/ComponentName;", "(Ljava/lang/String;Landroid/content/ComponentName;)V", "getAction", "()Ljava/lang/String;", "getComponentName", "()Landroid/content/ComponentName;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SendBroadcastActionAction implements SendBroadcastAction {
    private final String action;
    private final ComponentName componentName;

    public SendBroadcastActionAction(String str, ComponentName componentName) {
        this.action = str;
        this.componentName = componentName;
    }

    public final String getAction() {
        return this.action;
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public /* synthetic */ SendBroadcastActionAction(String str, ComponentName componentName, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : componentName);
    }
}
