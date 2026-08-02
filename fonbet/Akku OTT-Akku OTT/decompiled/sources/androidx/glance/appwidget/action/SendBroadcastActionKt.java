package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import androidx.exifinterface.media.ExifInterface;
import androidx.glance.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0086\b\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001e\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\f"}, d2 = {"actionSendBroadcast", "Landroidx/glance/action/Action;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/BroadcastReceiver;", "componentName", "Landroid/content/ComponentName;", "intent", "Landroid/content/Intent;", "receiver", "Ljava/lang/Class;", "action", "", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SendBroadcastActionKt {
    public static final Action actionSendBroadcast(String str, ComponentName componentName) {
        return new SendBroadcastActionAction(str, componentName);
    }

    public static /* synthetic */ Action actionSendBroadcast$default(String str, ComponentName componentName, int i, Object obj) {
        if ((i & 2) != 0) {
            componentName = null;
        }
        return actionSendBroadcast(str, componentName);
    }

    public static final Action actionSendBroadcast(Intent intent) {
        return new SendBroadcastIntentAction(intent);
    }

    public static final Action actionSendBroadcast(ComponentName componentName) {
        return new SendBroadcastComponentAction(componentName);
    }

    public static final <T extends BroadcastReceiver> Action actionSendBroadcast(Class<T> cls) {
        return new SendBroadcastClassAction(cls);
    }

    public static final /* synthetic */ <T extends BroadcastReceiver> Action actionSendBroadcast() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return actionSendBroadcast(BroadcastReceiver.class);
    }
}
