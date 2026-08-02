package androidx.glance.appwidget.action;

import android.app.PendingIntent;
import android.content.Intent;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi(31)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Landroidx/glance/appwidget/action/ApplyActionApi31Impl;", "", "()V", "setOnCheckedChangeResponse", "", "rv", "Landroid/widget/RemoteViews;", "viewId", "", "intent", "Landroid/app/PendingIntent;", "Landroid/content/Intent;", "unsetOnCheckedChangeResponse", "unsetOnClickResponse", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ApplyActionApi31Impl {
    public static final ApplyActionApi31Impl INSTANCE = new ApplyActionApi31Impl();

    private ApplyActionApi31Impl() {
    }

    @DoNotInline
    public final void setOnCheckedChangeResponse(RemoteViews rv, int viewId, PendingIntent intent) {
        rv.setOnCheckedChangeResponse(viewId, RemoteViews.RemoteResponse.fromPendingIntent(intent));
    }

    @DoNotInline
    public final void unsetOnCheckedChangeResponse(RemoteViews rv, int viewId) {
        rv.setOnCheckedChangeResponse(viewId, new RemoteViews.RemoteResponse());
    }

    @DoNotInline
    public final void unsetOnClickResponse(RemoteViews rv, int viewId) {
        rv.setOnClickResponse(viewId, new RemoteViews.RemoteResponse());
    }

    @DoNotInline
    public final void setOnCheckedChangeResponse(RemoteViews rv, int viewId, Intent intent) {
        rv.setOnCheckedChangeResponse(viewId, RemoteViews.RemoteResponse.fromFillInIntent(intent));
    }
}
