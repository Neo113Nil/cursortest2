package androidx.glance.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.GlanceModifier;
import androidx.glance.unit.Dimension;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/layout/HeightModifier;", "Landroidx/glance/GlanceModifier$Element;", "height", "Landroidx/glance/unit/Dimension;", "(Landroidx/glance/unit/Dimension;)V", "getHeight", "()Landroidx/glance/unit/Dimension;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class HeightModifier implements GlanceModifier.Element {
    public static final int $stable = 0;
    private final Dimension height;

    public HeightModifier(Dimension dimension) {
        this.height = dimension;
    }

    public final Dimension getHeight() {
        return this.height;
    }
}
