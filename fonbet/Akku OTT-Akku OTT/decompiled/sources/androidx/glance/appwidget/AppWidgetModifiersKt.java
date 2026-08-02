package androidx.glance.appwidget;

import androidx.glance.GlanceModifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"clipToOutline", "Landroidx/glance/GlanceModifier;", "clip", "", "enabled", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppWidgetModifiersKt {
    public static final GlanceModifier clipToOutline(GlanceModifier glanceModifier, boolean z) {
        return glanceModifier.then(new ClipToOutlineModifier(z));
    }

    public static final GlanceModifier enabled(GlanceModifier glanceModifier, boolean z) {
        return glanceModifier.then(new EnabledModifier(z));
    }
}
