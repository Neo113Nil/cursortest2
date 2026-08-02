package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/glance/appwidget/action/SendBroadcastClassAction;", "Landroidx/glance/appwidget/action/SendBroadcastAction;", "receiverClass", "Ljava/lang/Class;", "Landroid/content/BroadcastReceiver;", "(Ljava/lang/Class;)V", "getReceiverClass", "()Ljava/lang/Class;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SendBroadcastClassAction implements SendBroadcastAction {
    private final Class<? extends BroadcastReceiver> receiverClass;

    public SendBroadcastClassAction(Class<? extends BroadcastReceiver> cls) {
        this.receiverClass = cls;
    }

    public final Class<? extends BroadcastReceiver> getReceiverClass() {
        return this.receiverClass;
    }
}
