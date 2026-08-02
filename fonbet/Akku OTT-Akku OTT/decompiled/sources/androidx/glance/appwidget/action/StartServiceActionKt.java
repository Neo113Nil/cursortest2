package androidx.glance.appwidget.action;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.glance.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a(\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0086\b¨\u0006\f"}, d2 = {"actionStartService", "Landroidx/glance/action/Action;", "componentName", "Landroid/content/ComponentName;", "isForegroundService", "", "intent", "Landroid/content/Intent;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Service;", NotificationCompat.CATEGORY_SERVICE, "Ljava/lang/Class;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StartServiceActionKt {
    public static final Action actionStartService(Intent intent, boolean z) {
        return new StartServiceIntentAction(intent, z);
    }

    public static /* synthetic */ Action actionStartService$default(Intent intent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return actionStartService(intent, z);
    }

    public static final Action actionStartService(ComponentName componentName, boolean z) {
        return new StartServiceComponentAction(componentName, z);
    }

    public static /* synthetic */ Action actionStartService$default(ComponentName componentName, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return actionStartService(componentName, z);
    }

    public static final <T extends Service> Action actionStartService(Class<T> cls, boolean z) {
        return new StartServiceClassAction(cls, z);
    }

    public static /* synthetic */ Action actionStartService$default(Class cls, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return actionStartService(cls, z);
    }

    public static final /* synthetic */ <T extends Service> Action actionStartService(boolean z) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return actionStartService(Service.class, z);
    }

    public static /* synthetic */ Action actionStartService$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return actionStartService(Service.class, z);
    }
}
