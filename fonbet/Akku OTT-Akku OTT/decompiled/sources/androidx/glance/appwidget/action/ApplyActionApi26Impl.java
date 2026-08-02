package androidx.glance.appwidget.action;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi(26)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/action/ApplyActionApi26Impl;", "", "()V", "getForegroundServicePendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ApplyActionApi26Impl {
    public static final ApplyActionApi26Impl INSTANCE = new ApplyActionApi26Impl();

    private ApplyActionApi26Impl() {
    }

    @DoNotInline
    public final PendingIntent getForegroundServicePendingIntent(Context context, Intent intent) {
        return PendingIntent.getForegroundService(context, 0, intent, 167772160);
    }
}
