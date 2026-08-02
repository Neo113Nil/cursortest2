package androidx.glance.layout;

import androidx.annotation.DimenRes;
import androidx.glance.GlanceModifier;
import androidx.glance.unit.Dimension;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\u001f\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\b\u001a\u001f\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a'\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\b\u001a\u001e\u0010\t\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\b\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0007\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u000b\u001a\u00020\b\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"fillMaxHeight", "Landroidx/glance/GlanceModifier;", "fillMaxSize", "fillMaxWidth", "height", "Landroidx/compose/ui/unit/Dp;", "height-3ABfNKs", "(Landroidx/glance/GlanceModifier;F)Landroidx/glance/GlanceModifier;", "", "size", "size-3ABfNKs", "width", "size-VpY3zN4", "(Landroidx/glance/GlanceModifier;FF)Landroidx/glance/GlanceModifier;", "width-3ABfNKs", "wrapContentHeight", "wrapContentSize", "wrapContentWidth", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SizeModifiersKt {
    public static final GlanceModifier fillMaxHeight(GlanceModifier glanceModifier) {
        return glanceModifier.then(new HeightModifier(Dimension.Fill.INSTANCE));
    }

    public static final GlanceModifier fillMaxSize(GlanceModifier glanceModifier) {
        return fillMaxHeight(fillMaxWidth(glanceModifier));
    }

    public static final GlanceModifier fillMaxWidth(GlanceModifier glanceModifier) {
        return glanceModifier.then(new WidthModifier(Dimension.Fill.INSTANCE));
    }

    public static final GlanceModifier height(GlanceModifier glanceModifier, @DimenRes int i) {
        return glanceModifier.then(new HeightModifier(new Dimension.Resource(i)));
    }

    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final GlanceModifier m1439height3ABfNKs(GlanceModifier glanceModifier, float f) {
        return glanceModifier.then(new HeightModifier(new Dimension.Dp(f, null)));
    }

    public static final GlanceModifier size(GlanceModifier glanceModifier, @DimenRes int i) {
        return height(width(glanceModifier, i), i);
    }

    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final GlanceModifier m1440size3ABfNKs(GlanceModifier glanceModifier, float f) {
        return m1439height3ABfNKs(m1442width3ABfNKs(glanceModifier, f), f);
    }

    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final GlanceModifier m1441sizeVpY3zN4(GlanceModifier glanceModifier, float f, float f2) {
        return m1439height3ABfNKs(m1442width3ABfNKs(glanceModifier, f), f2);
    }

    public static final GlanceModifier width(GlanceModifier glanceModifier, @DimenRes int i) {
        return glanceModifier.then(new WidthModifier(new Dimension.Resource(i)));
    }

    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final GlanceModifier m1442width3ABfNKs(GlanceModifier glanceModifier, float f) {
        return glanceModifier.then(new WidthModifier(new Dimension.Dp(f, null)));
    }

    public static final GlanceModifier wrapContentHeight(GlanceModifier glanceModifier) {
        return glanceModifier.then(new HeightModifier(Dimension.Wrap.INSTANCE));
    }

    public static final GlanceModifier wrapContentSize(GlanceModifier glanceModifier) {
        return wrapContentWidth(wrapContentHeight(glanceModifier));
    }

    public static final GlanceModifier wrapContentWidth(GlanceModifier glanceModifier) {
        return glanceModifier.then(new WidthModifier(Dimension.Wrap.INSTANCE));
    }

    public static final GlanceModifier size(GlanceModifier glanceModifier, @DimenRes int i, @DimenRes int i2) {
        return height(width(glanceModifier, i), i2);
    }
}
