package androidx.glance.appwidget;

import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@RequiresApi(31)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, d2 = {"Landroidx/glance/appwidget/CollectionItemsApi31Impl;", "", "()V", "setRemoteAdapter", "", "remoteViews", "Landroid/widget/RemoteViews;", "viewId", "", FirebaseAnalytics.Param.ITEMS, "Landroidx/glance/appwidget/RemoteCollectionItems;", "toPlatformCollectionItems", "Landroid/widget/RemoteViews$RemoteCollectionItems;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CollectionItemsApi31Impl {
    public static final CollectionItemsApi31Impl INSTANCE = new CollectionItemsApi31Impl();

    private CollectionItemsApi31Impl() {
    }

    @DoNotInline
    public final void setRemoteAdapter(RemoteViews remoteViews, int viewId, RemoteCollectionItems items) {
        remoteViews.setRemoteAdapter(viewId, toPlatformCollectionItems(items));
    }

    @DoNotInline
    public final RemoteViews.RemoteCollectionItems toPlatformCollectionItems(RemoteCollectionItems items) {
        RemoteViews.RemoteCollectionItems.Builder viewTypeCount = new RemoteViews.RemoteCollectionItems.Builder().setHasStableIds(items.getHasStableIds()).setViewTypeCount(items.get_viewTypeCount());
        int itemCount = items.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            viewTypeCount.addItem(items.getItemId(i), items.getItemView(i));
        }
        return viewTypeCount.build();
    }
}
