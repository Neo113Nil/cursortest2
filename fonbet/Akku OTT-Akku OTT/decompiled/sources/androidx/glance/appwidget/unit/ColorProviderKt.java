package androidx.glance.appwidget.unit;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.annotation.ColorRes;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a8\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000f\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"CheckedStateSet", "", "getCheckedStateSet", "()[I", "UncheckedStateSet", "getUncheckedStateSet", "resolveCheckedColor", "Landroidx/compose/ui/graphics/Color;", "context", "Landroid/content/Context;", "resId", "", "isChecked", "", "isNightMode", "(Landroid/content/Context;IZLjava/lang/Boolean;)Landroidx/compose/ui/graphics/Color;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorProviderKt {
    private static final int[] CheckedStateSet = {R.attr.state_checked};
    private static final int[] UncheckedStateSet = {-16842912};

    public static final int[] getCheckedStateSet() {
        return CheckedStateSet;
    }

    public static final int[] getUncheckedStateSet() {
        return UncheckedStateSet;
    }

    public static final Color resolveCheckedColor(Context context, @ColorRes int i, boolean z, Boolean bool) {
        if (i == 0) {
            return null;
        }
        if (bool != null) {
            Configuration configuration = new Configuration();
            configuration.uiMode = bool.booleanValue() ? 32 : 16;
            context = context.createConfigurationContext(configuration);
        }
        try {
            ColorStateList colorStateList = ContextCompat.getColorStateList(context, i);
            if (colorStateList == null) {
                return null;
            }
            return Color.m497boximpl(ColorKt.Color(colorStateList.getColorForState(z ? CheckedStateSet : UncheckedStateSet, colorStateList.getDefaultColor())));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static /* synthetic */ Color resolveCheckedColor$default(Context context, int i, boolean z, Boolean bool, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            bool = null;
        }
        return resolveCheckedColor(context, i, z, bool);
    }
}
