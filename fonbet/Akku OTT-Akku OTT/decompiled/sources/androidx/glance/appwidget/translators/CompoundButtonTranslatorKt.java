package androidx.glance.appwidget.translators;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.RemoteViews;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.unit.CheckableColorProvider;
import androidx.glance.appwidget.unit.CheckedUncheckedColorProvider;
import androidx.glance.appwidget.unit.ColorProviderKt;
import androidx.glance.appwidget.unit.ResourceCheckableColorProvider;
import androidx.glance.color.DayNightColorProvidersKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a$\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"checkableColorProviderFallbackColor", "Landroidx/compose/ui/graphics/Color;", "getCheckableColorProviderFallbackColor", "()J", "J", "createCheckedColorStateList", "Landroid/content/res/ColorStateList;", "checked", "unchecked", "createCheckedColorStateList--OWjLjI", "(JJ)Landroid/content/res/ColorStateList;", "getColor", "Landroidx/glance/appwidget/unit/CheckableColorProvider;", "context", "Landroid/content/Context;", "isChecked", "", "(Landroidx/glance/appwidget/unit/CheckableColorProvider;Landroid/content/Context;Z)J", "setImageViewColorFilter", "", "Landroid/widget/RemoteViews;", "viewId", "", "color", "setImageViewColorFilter-mxwnekA", "(Landroid/widget/RemoteViews;IJ)V", "toColorStateList", "Landroidx/glance/appwidget/unit/CheckedUncheckedColorProvider;", "isNightMode", "toDayNightColorStateList", "Landroidx/glance/appwidget/translators/DayNightColorStateList;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompoundButtonTranslatorKt {
    private static final long checkableColorProviderFallbackColor = Color.INSTANCE.m533getBlack0d7_KjU();

    /* renamed from: createCheckedColorStateList--OWjLjI, reason: not valid java name */
    private static final ColorStateList m1345createCheckedColorStateListOWjLjI(long j, long j2) {
        return new ColorStateList(new int[][]{ColorProviderKt.getCheckedStateSet(), new int[0]}, new int[]{ColorKt.m562toArgb8_81llA(j), ColorKt.m562toArgb8_81llA(j2)});
    }

    public static final long getCheckableColorProviderFallbackColor() {
        return checkableColorProviderFallbackColor;
    }

    public static final long getColor(CheckableColorProvider checkableColorProvider, Context context, boolean z) {
        Color resolveCheckedColor$default;
        if (checkableColorProvider instanceof CheckedUncheckedColorProvider) {
            resolveCheckedColor$default = Color.m497boximpl(((CheckedUncheckedColorProvider) checkableColorProvider).m1351getColorXeAY9LY(context, DayNightColorProvidersKt.isNightMode(context), z));
        } else {
            if (!(checkableColorProvider instanceof ResourceCheckableColorProvider)) {
                throw new NoWhenBranchMatchedException();
            }
            resolveCheckedColor$default = ColorProviderKt.resolveCheckedColor$default(context, ((ResourceCheckableColorProvider) checkableColorProvider).getResId(), z, null, 8, null);
        }
        return resolveCheckedColor$default != null ? resolveCheckedColor$default.m517unboximpl() : checkableColorProviderFallbackColor;
    }

    /* renamed from: setImageViewColorFilter-mxwnekA, reason: not valid java name */
    public static final void m1346setImageViewColorFiltermxwnekA(RemoteViews remoteViews, int i, long j) {
        RemoteViewsCompat.setImageViewColorFilter(remoteViews, i, ColorKt.m562toArgb8_81llA(j));
    }

    private static final ColorStateList toColorStateList(CheckedUncheckedColorProvider checkedUncheckedColorProvider, Context context, boolean z) {
        return m1345createCheckedColorStateListOWjLjI(checkedUncheckedColorProvider.m1351getColorXeAY9LY(context, z, true), checkedUncheckedColorProvider.m1351getColorXeAY9LY(context, z, false));
    }

    public static final DayNightColorStateList toDayNightColorStateList(CheckedUncheckedColorProvider checkedUncheckedColorProvider, Context context) {
        return new DayNightColorStateList(toColorStateList(checkedUncheckedColorProvider, context, false), toColorStateList(checkedUncheckedColorProvider, context, true));
    }
}
