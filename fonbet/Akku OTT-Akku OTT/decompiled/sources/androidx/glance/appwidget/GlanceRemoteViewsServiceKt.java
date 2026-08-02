package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¨\u0006\f"}, d2 = {"setRemoteAdapter", "", "Landroid/widget/RemoteViews;", "context", "Landroid/content/Context;", "appWidgetId", "", "viewId", "sizeInfo", "", FirebaseAnalytics.Param.ITEMS, "Landroidx/glance/appwidget/RemoteCollectionItems;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GlanceRemoteViewsServiceKt {
    @DoNotInline
    public static final void setRemoteAdapter(RemoteViews remoteViews, Context context, int i, int i2, String str, RemoteCollectionItems remoteCollectionItems) {
        if (Build.VERSION.SDK_INT > 31) {
            CollectionItemsApi31Impl.INSTANCE.setRemoteAdapter(remoteViews, i2, remoteCollectionItems);
            return;
        }
        Intent putExtra = new Intent(context, (Class<?>) GlanceRemoteViewsService.class).putExtra("appWidgetId", i).putExtra(GlanceRemoteViewsService.EXTRA_VIEW_ID, i2).putExtra(GlanceRemoteViewsService.EXTRA_SIZE_INFO, str);
        putExtra.setData(Uri.parse(putExtra.toUri(1)));
        if (context.getPackageManager().resolveService(putExtra, 0) == null) {
            throw new IllegalStateException("GlanceRemoteViewsService could not be resolved, check the app manifest.");
        }
        remoteViews.setRemoteAdapter(i2, putExtra);
        GlanceRemoteViewsService.INSTANCE.saveItems$glance_appwidget_release(i, i2, str, remoteCollectionItems);
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, i2);
    }
}
