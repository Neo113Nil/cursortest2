package androidx.glance.appwidget.action;

import android.app.Service;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/glance/appwidget/action/StartServiceClassAction;", "Landroidx/glance/appwidget/action/StartServiceAction;", "serviceClass", "Ljava/lang/Class;", "Landroid/app/Service;", "isForegroundService", "", "(Ljava/lang/Class;Z)V", "()Z", "getServiceClass", "()Ljava/lang/Class;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StartServiceClassAction implements StartServiceAction {
    private final boolean isForegroundService;
    private final Class<? extends Service> serviceClass;

    public StartServiceClassAction(Class<? extends Service> cls, boolean z) {
        this.serviceClass = cls;
        this.isForegroundService = z;
    }

    public final Class<? extends Service> getServiceClass() {
        return this.serviceClass;
    }

    @Override // androidx.glance.appwidget.action.StartServiceAction
    /* renamed from: isForegroundService, reason: from getter */
    public boolean getIsForegroundService() {
        return this.isForegroundService;
    }
}
