package androidx.glance.color;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"isNightMode", "", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "ColorProvider", "Landroidx/glance/unit/ColorProvider;", "day", "Landroidx/compose/ui/graphics/Color;", "night", "ColorProvider--OWjLjI", "(JJ)Landroidx/glance/unit/ColorProvider;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DayNightColorProvidersKt {
    /* renamed from: ColorProvider--OWjLjI, reason: not valid java name */
    public static final ColorProvider m1360ColorProviderOWjLjI(long j, long j2) {
        return new DayNightColorProvider(j, j2, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final boolean isNightMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
