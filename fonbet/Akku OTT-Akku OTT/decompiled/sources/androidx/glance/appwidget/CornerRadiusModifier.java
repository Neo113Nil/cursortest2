package androidx.glance.appwidget;

import androidx.glance.GlanceModifier;
import androidx.glance.unit.Dimension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/glance/appwidget/CornerRadiusModifier;", "Landroidx/glance/GlanceModifier$Element;", "radius", "Landroidx/glance/unit/Dimension;", "(Landroidx/glance/unit/Dimension;)V", "getRadius", "()Landroidx/glance/unit/Dimension;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CornerRadiusModifier implements GlanceModifier.Element {
    private final Dimension radius;

    public CornerRadiusModifier(Dimension dimension) {
        this.radius = dimension;
    }

    public static /* synthetic */ CornerRadiusModifier copy$default(CornerRadiusModifier cornerRadiusModifier, Dimension dimension, int i, Object obj) {
        if ((i & 1) != 0) {
            dimension = cornerRadiusModifier.radius;
        }
        return cornerRadiusModifier.copy(dimension);
    }

    /* renamed from: component1, reason: from getter */
    public final Dimension getRadius() {
        return this.radius;
    }

    public final CornerRadiusModifier copy(Dimension radius) {
        return new CornerRadiusModifier(radius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CornerRadiusModifier) && Intrinsics.areEqual(this.radius, ((CornerRadiusModifier) other).radius);
    }

    public final Dimension getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return this.radius.hashCode();
    }

    public String toString() {
        return "CornerRadiusModifier(radius=" + this.radius + ')';
    }
}
