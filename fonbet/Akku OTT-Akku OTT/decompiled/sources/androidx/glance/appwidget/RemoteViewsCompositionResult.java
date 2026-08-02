package androidx.glance.appwidget;

import android.widget.RemoteViews;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@ExperimentalGlanceRemoteViewsApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/RemoteViewsCompositionResult;", "", "remoteViews", "Landroid/widget/RemoteViews;", "(Landroid/widget/RemoteViews;)V", "getRemoteViews", "()Landroid/widget/RemoteViews;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteViewsCompositionResult {
    public static final int $stable = 8;
    private final RemoteViews remoteViews;

    public RemoteViewsCompositionResult(RemoteViews remoteViews) {
        this.remoteViews = remoteViews;
    }

    public final RemoteViews getRemoteViews() {
        return this.remoteViews;
    }
}
