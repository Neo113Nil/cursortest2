package androidx.glance.appwidget.action;

import android.content.ComponentName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Landroidx/glance/appwidget/action/StartServiceComponentAction;", "Landroidx/glance/appwidget/action/StartServiceAction;", "componentName", "Landroid/content/ComponentName;", "isForegroundService", "", "(Landroid/content/ComponentName;Z)V", "getComponentName", "()Landroid/content/ComponentName;", "()Z", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StartServiceComponentAction implements StartServiceAction {
    private final ComponentName componentName;
    private final boolean isForegroundService;

    public StartServiceComponentAction(ComponentName componentName, boolean z) {
        this.componentName = componentName;
        this.isForegroundService = z;
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    @Override // androidx.glance.appwidget.action.StartServiceAction
    /* renamed from: isForegroundService, reason: from getter */
    public boolean getIsForegroundService() {
        return this.isForegroundService;
    }
}
