package androidx.glance;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000e"}, d2 = {"Landroidx/glance/ButtonColors;", "", "backgroundColor", "Landroidx/glance/unit/ColorProvider;", "contentColor", "(Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;)V", "getBackgroundColor", "()Landroidx/glance/unit/ColorProvider;", "getContentColor", "equals", "", "other", "hashCode", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonColors {
    public static final int $stable = 0;
    private final ColorProvider backgroundColor;
    private final ColorProvider contentColor;

    public ButtonColors(ColorProvider colorProvider, ColorProvider colorProvider2) {
        this.backgroundColor = colorProvider;
        this.contentColor = colorProvider2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ButtonColors.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.glance.ButtonColors");
        ButtonColors buttonColors = (ButtonColors) other;
        return Intrinsics.areEqual(this.backgroundColor, buttonColors.backgroundColor) && Intrinsics.areEqual(this.contentColor, buttonColors.contentColor);
    }

    public final ColorProvider getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ColorProvider getContentColor() {
        return this.contentColor;
    }

    public int hashCode() {
        return this.contentColor.hashCode() + (this.backgroundColor.hashCode() * 31);
    }
}
