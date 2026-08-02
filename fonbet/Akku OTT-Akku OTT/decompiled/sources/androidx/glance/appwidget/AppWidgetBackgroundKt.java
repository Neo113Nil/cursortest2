package androidx.glance.appwidget;

import androidx.glance.GlanceModifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"appWidgetBackground", "Landroidx/glance/GlanceModifier;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppWidgetBackgroundKt {
    public static final GlanceModifier appWidgetBackground(GlanceModifier glanceModifier) {
        return glanceModifier.then(AppWidgetBackgroundModifier.INSTANCE);
    }
}
