package androidx.glance.appwidget.translators;

import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.widget.RemoteViewsCompat;
import kotlin.Metadata;

@RequiresApi(31)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/glance/appwidget/translators/TextTranslatorApi31Impl;", "", "()V", "setTextViewGravity", "", "rv", "Landroid/widget/RemoteViews;", "viewId", "", "gravity", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextTranslatorApi31Impl {
    public static final TextTranslatorApi31Impl INSTANCE = new TextTranslatorApi31Impl();

    private TextTranslatorApi31Impl() {
    }

    @DoNotInline
    public final void setTextViewGravity(RemoteViews rv, int viewId, int gravity) {
        RemoteViewsCompat.setTextViewGravity(rv, viewId, gravity);
    }
}
