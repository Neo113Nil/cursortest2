package androidx.glance.appwidget;

import androidx.annotation.DimenRes;
import androidx.glance.GlanceModifier;
import androidx.glance.unit.Dimension;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"cornerRadius", "Landroidx/glance/GlanceModifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "cornerRadius-3ABfNKs", "(Landroidx/glance/GlanceModifier;F)Landroidx/glance/GlanceModifier;", "", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CornerRadiusKt {
    public static final GlanceModifier cornerRadius(GlanceModifier glanceModifier, @DimenRes int i) {
        return glanceModifier.then(new CornerRadiusModifier(new Dimension.Resource(i)));
    }

    /* renamed from: cornerRadius-3ABfNKs, reason: not valid java name */
    public static final GlanceModifier m1304cornerRadius3ABfNKs(GlanceModifier glanceModifier, float f) {
        return glanceModifier.then(new CornerRadiusModifier(new Dimension.Dp(f, null)));
    }
}
