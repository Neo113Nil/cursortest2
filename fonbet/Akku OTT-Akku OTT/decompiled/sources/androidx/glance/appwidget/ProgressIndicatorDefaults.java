package androidx.glance.appwidget;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.ColorProviderKt;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/glance/appwidget/ProgressIndicatorDefaults;", "", "()V", "BackgroundColorProvider", "Landroidx/glance/unit/ColorProvider;", "getBackgroundColorProvider", "()Landroidx/glance/unit/ColorProvider;", "Color", "Landroidx/compose/ui/graphics/Color;", "J", "IndicatorColorProvider", "getIndicatorColorProvider", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorDefaults {
    public static final int $stable;
    private static final ColorProvider BackgroundColorProvider;
    private static final long Color;
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    private static final ColorProvider IndicatorColorProvider;

    static {
        long Color2 = ColorKt.Color(4284612846L);
        Color = Color2;
        IndicatorColorProvider = ColorProviderKt.m1505ColorProvider8_81llA(Color2);
        BackgroundColorProvider = ColorProviderKt.m1505ColorProvider8_81llA(Color.m506copywmQWz5c$default(Color2, 0.24f, 0.0f, 0.0f, 0.0f, 14, null));
        $stable = 8;
    }

    private ProgressIndicatorDefaults() {
    }

    public final ColorProvider getBackgroundColorProvider() {
        return BackgroundColorProvider;
    }

    public final ColorProvider getIndicatorColorProvider() {
        return IndicatorColorProvider;
    }
}
