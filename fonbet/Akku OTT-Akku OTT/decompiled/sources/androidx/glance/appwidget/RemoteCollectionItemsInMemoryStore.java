package androidx.glance.appwidget;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J \u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/glance/appwidget/RemoteCollectionItemsInMemoryStore;", "", "()V", FirebaseAnalytics.Param.ITEMS, "", "", "Landroidx/glance/appwidget/RemoteCollectionItems;", "getItems", "appWidgetId", "", "viewId", "sizeInfo", Constants.KEY, "removeItems", "", "save", "remoteCollectionItems", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class RemoteCollectionItemsInMemoryStore {
    private final Map<String, RemoteCollectionItems> items = new LinkedHashMap();

    private final String key(int appWidgetId, int viewId, String sizeInfo) {
        return appWidgetId + '-' + viewId + '-' + sizeInfo;
    }

    public final RemoteCollectionItems getItems(int appWidgetId, int viewId, String sizeInfo) {
        RemoteCollectionItems remoteCollectionItems = this.items.get(key(appWidgetId, viewId, sizeInfo));
        return remoteCollectionItems == null ? RemoteCollectionItems.INSTANCE.getEmpty() : remoteCollectionItems;
    }

    public final void removeItems(int appWidgetId, int viewId, String sizeInfo) {
        this.items.remove(key(appWidgetId, viewId, sizeInfo));
    }

    public final void save(int appWidgetId, int viewId, String sizeInfo, RemoteCollectionItems remoteCollectionItems) {
        this.items.put(key(appWidgetId, viewId, sizeInfo), remoteCollectionItems);
    }
}
