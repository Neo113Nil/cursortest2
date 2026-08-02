package androidx.glance.appwidget;

import android.util.SizeF;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Map;
import kotlin.Metadata;

@RequiresApi(31)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¨\u0006\b"}, d2 = {"Landroidx/glance/appwidget/Api31Impl;", "", "()V", "createRemoteViews", "Landroid/widget/RemoteViews;", "sizeMap", "", "Landroid/util/SizeF;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Api31Impl {
    public static final Api31Impl INSTANCE = new Api31Impl();

    private Api31Impl() {
    }

    @DoNotInline
    public final RemoteViews createRemoteViews(Map<SizeF, ? extends RemoteViews> sizeMap) {
        return new RemoteViews((Map<SizeF, RemoteViews>) sizeMap);
    }
}
