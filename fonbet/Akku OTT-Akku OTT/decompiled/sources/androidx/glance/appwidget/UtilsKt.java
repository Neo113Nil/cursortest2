package androidx.glance.appwidget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RemoteViews;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.compose.ui.unit.Dp;
import androidx.core.widget.RemoteViewsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a!\u0010\u0015\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u0015\u001a\u00020\u0003*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"GlanceAppWidgetTag", "", "inflateViewStub", "", "Landroid/widget/RemoteViews;", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "viewStubId", "layoutId", "inflatedId", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;IILjava/lang/Integer;)I", "pixelsToDp", "Landroidx/compose/ui/unit/Dp;", "displayMetrics", "Landroid/util/DisplayMetrics;", "(ILandroid/util/DisplayMetrics;)F", "setViewEnabled", "", "viewId", "enabled", "", "toPixels", "context", "Landroid/content/Context;", "toPixels-D5KLDUw", "(FLandroid/content/Context;)I", "(FLandroid/util/DisplayMetrics;)I", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nandroidx/glance/appwidget/UtilsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n175#2:71\n1#3:72\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nandroidx/glance/appwidget/UtilsKt\n*L\n37#1:71\n*E\n"})
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final String GlanceAppWidgetTag = "GlanceAppWidget";

    @IdRes
    public static final int inflateViewStub(RemoteViews remoteViews, TranslationContext translationContext, @IdRes int i, @LayoutRes int i2, @IdRes Integer num) {
        if (i == -1) {
            throw new IllegalArgumentException("viewStubId must not be View.NO_ID");
        }
        int intValue = num != null ? num.intValue() : translationContext.nextViewId();
        if (intValue != -1) {
            RemoteViewsCompat.setViewStubInflatedId(remoteViews, i, intValue);
        }
        if (i2 != 0) {
            RemoteViewsCompat.setViewStubLayoutResource(remoteViews, i, i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return intValue;
    }

    public static /* synthetic */ int inflateViewStub$default(RemoteViews remoteViews, TranslationContext translationContext, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            num = null;
        }
        return inflateViewStub(remoteViews, translationContext, i, i2, num);
    }

    public static final float pixelsToDp(int i, DisplayMetrics displayMetrics) {
        return Dp.m1021constructorimpl(i / displayMetrics.density);
    }

    public static final void setViewEnabled(RemoteViews remoteViews, int i, boolean z) {
        remoteViews.setBoolean(i, "setEnabled", z);
    }

    /* renamed from: toPixels-D5KLDUw, reason: not valid java name */
    public static final int m1326toPixelsD5KLDUw(float f, Context context) {
        return m1327toPixelsD5KLDUw(f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: toPixels-D5KLDUw, reason: not valid java name */
    public static final int m1327toPixelsD5KLDUw(float f, DisplayMetrics displayMetrics) {
        return (int) TypedValue.applyDimension(1, f, displayMetrics);
    }
}
