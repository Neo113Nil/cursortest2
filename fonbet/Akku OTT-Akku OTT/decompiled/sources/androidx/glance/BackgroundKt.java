package androidx.glance;

import androidx.annotation.ColorRes;
import androidx.glance.layout.ContentScale;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.ColorProviderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"background", "Landroidx/glance/GlanceModifier;", "color", "Landroidx/compose/ui/graphics/Color;", "background-4WTKRHQ", "(Landroidx/glance/GlanceModifier;J)Landroidx/glance/GlanceModifier;", "imageProvider", "Landroidx/glance/ImageProvider;", "contentScale", "Landroidx/glance/layout/ContentScale;", "background-l7F5y5Q", "(Landroidx/glance/GlanceModifier;Landroidx/glance/ImageProvider;I)Landroidx/glance/GlanceModifier;", "colorProvider", "Landroidx/glance/unit/ColorProvider;", "", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackgroundKt {
    public static final GlanceModifier background(GlanceModifier glanceModifier, @ColorRes int i) {
        return background(glanceModifier, ColorProviderKt.ColorProvider(i));
    }

    /* renamed from: background-4WTKRHQ, reason: not valid java name */
    public static final GlanceModifier m1269background4WTKRHQ(GlanceModifier glanceModifier, long j) {
        return background(glanceModifier, ColorProviderKt.m1505ColorProvider8_81llA(j));
    }

    /* renamed from: background-l7F5y5Q, reason: not valid java name */
    public static final GlanceModifier m1270backgroundl7F5y5Q(GlanceModifier glanceModifier, ImageProvider imageProvider, int i) {
        return glanceModifier.then(new BackgroundModifier(imageProvider, i, (DefaultConstructorMarker) null));
    }

    /* renamed from: background-l7F5y5Q$default, reason: not valid java name */
    public static /* synthetic */ GlanceModifier m1271backgroundl7F5y5Q$default(GlanceModifier glanceModifier, ImageProvider imageProvider, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ContentScale.INSTANCE.m1400getFillBoundsAe3V0ko();
        }
        return m1270backgroundl7F5y5Q(glanceModifier, imageProvider, i);
    }

    public static final GlanceModifier background(GlanceModifier glanceModifier, ColorProvider colorProvider) {
        return glanceModifier.then(new BackgroundModifier(colorProvider));
    }
}
