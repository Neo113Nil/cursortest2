package androidx.glance.appwidget;

import androidx.collection.i;
import androidx.glance.GlanceId;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/glance/appwidget/AppWidgetId;", "Landroidx/glance/GlanceId;", "appWidgetId", "", "(I)V", "getAppWidgetId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppWidgetId implements GlanceId {
    private final int appWidgetId;

    public AppWidgetId(int i) {
        this.appWidgetId = i;
    }

    public static /* synthetic */ AppWidgetId copy$default(AppWidgetId appWidgetId, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = appWidgetId.appWidgetId;
        }
        return appWidgetId.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAppWidgetId() {
        return this.appWidgetId;
    }

    public final AppWidgetId copy(int appWidgetId) {
        return new AppWidgetId(appWidgetId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppWidgetId) && this.appWidgetId == ((AppWidgetId) other).appWidgetId;
    }

    public final int getAppWidgetId() {
        return this.appWidgetId;
    }

    public int hashCode() {
        return Integer.hashCode(this.appWidgetId);
    }

    public String toString() {
        return i.c(new StringBuilder("AppWidgetId(appWidgetId="), this.appWidgetId, ')');
    }
}
