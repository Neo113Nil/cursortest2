package androidx.glance.appwidget;

import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi(28)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/glance/appwidget/RemoteViewsTranslatorApi28Impl;", "", "()V", "copyRemoteViews", "Landroid/widget/RemoteViews;", "rv", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class RemoteViewsTranslatorApi28Impl {
    public static final RemoteViewsTranslatorApi28Impl INSTANCE = new RemoteViewsTranslatorApi28Impl();

    private RemoteViewsTranslatorApi28Impl() {
    }

    @DoNotInline
    public final RemoteViews copyRemoteViews(RemoteViews rv) {
        return new RemoteViews(rv);
    }
}
