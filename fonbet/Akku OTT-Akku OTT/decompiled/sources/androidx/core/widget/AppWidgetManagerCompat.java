package androidx.core.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.res.Resources;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.util.SizeFCompat;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000\u001a*\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000e\u001a8\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000e\u001a\u0015\u0010\u0013\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0080\u0004\u001a\u0014\u0010\u0016\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a&\u0010\u0019\u001a\u00020\u0018*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000e\u001a4\u0010\u0019\u001a\u00020\u0018*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"LogTag", "", "area", "", "Landroidx/core/util/SizeFCompat;", "getArea", "(Landroidx/core/util/SizeFCompat;)F", "createAppWidgetFromProviderInfo", "Landroid/widget/RemoteViews;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "factory", "Lkotlin/Function1;", "createExactSizeAppWidget", "createResponsiveSizeAppWidget", "dpSizes", "", "approxDominates", "", "other", "getSizeFromProviderInfo", "requireValidAppWidgetId", "", "updateAppWidget", "core-remoteviews_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = AppWidgetManagerCompat.LogTag)
@SourceDebugExtension({"SMAP\nAppWidgetManagerCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppWidgetManagerCompat.kt\nandroidx/core/widget/AppWidgetManagerCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
/* loaded from: classes.dex */
public final class AppWidgetManagerCompat {
    private static final String LogTag = "AppWidgetManagerCompat";

    public static final boolean approxDominates(SizeFCompat sizeFCompat, SizeFCompat other) {
        Intrinsics.checkNotNullParameter(sizeFCompat, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        float f = 1;
        return ((float) Math.ceil((double) sizeFCompat.getWidth())) + f >= other.getWidth() && ((float) Math.ceil((double) sizeFCompat.getHeight())) + f >= other.getHeight();
    }

    public static final RemoteViews createAppWidgetFromProviderInfo(AppWidgetManager appWidgetManager, int i, Function1<? super SizeFCompat, ? extends RemoteViews> factory) {
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.invoke(getSizeFromProviderInfo(appWidgetManager, i));
    }

    public static final RemoteViews createExactSizeAppWidget(AppWidgetManager appWidgetManager, int i, Function1<? super SizeFCompat, ? extends RemoteViews> factory) {
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(factory, "factory");
        requireValidAppWidgetId(appWidgetManager, i);
        return Build.VERSION.SDK_INT >= 31 ? AppWidgetManagerApi31Impl.INSTANCE.createExactSizeAppWidget(appWidgetManager, i, factory) : AppWidgetManagerApi16Impl.INSTANCE.createExactSizeAppWidget(appWidgetManager, i, factory);
    }

    public static final RemoteViews createResponsiveSizeAppWidget(AppWidgetManager appWidgetManager, int i, Collection<SizeFCompat> dpSizes, Function1<? super SizeFCompat, ? extends RemoteViews> factory) {
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(dpSizes, "dpSizes");
        Intrinsics.checkNotNullParameter(factory, "factory");
        requireValidAppWidgetId(appWidgetManager, i);
        if (dpSizes.isEmpty()) {
            throw new IllegalArgumentException("Sizes cannot be empty");
        }
        if (dpSizes.size() <= 16) {
            return Build.VERSION.SDK_INT >= 31 ? AppWidgetManagerApi31Impl.INSTANCE.createResponsiveSizeAppWidget(dpSizes, factory) : AppWidgetManagerApi16Impl.INSTANCE.createResponsiveSizeAppWidget(appWidgetManager, i, dpSizes, factory);
        }
        throw new IllegalArgumentException("At most 16 sizes may be provided");
    }

    public static final float getArea(SizeFCompat sizeFCompat) {
        Intrinsics.checkNotNullParameter(sizeFCompat, "<this>");
        return sizeFCompat.getHeight() * sizeFCompat.getWidth();
    }

    public static final SizeFCompat getSizeFromProviderInfo(AppWidgetManager appWidgetManager, int i) {
        Intrinsics.checkNotNullParameter(appWidgetManager, "<this>");
        AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i);
        return new SizeFCompat(getSizeFromProviderInfo$pxToDp(appWidgetInfo.minWidth), getSizeFromProviderInfo$pxToDp(appWidgetInfo.minHeight));
    }

    private static final float getSizeFromProviderInfo$pxToDp(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    private static final void requireValidAppWidgetId(AppWidgetManager appWidgetManager, int i) {
        if (appWidgetManager.getAppWidgetInfo(i) == null) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Invalid app widget id: ").toString());
        }
    }

    public static final void updateAppWidget(AppWidgetManager appWidgetManager, int i, Function1<? super SizeFCompat, ? extends RemoteViews> factory) {
        Intrinsics.checkNotNullParameter(appWidgetManager, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        appWidgetManager.updateAppWidget(i, createExactSizeAppWidget(appWidgetManager, i, factory));
    }

    public static final void updateAppWidget(AppWidgetManager appWidgetManager, int i, Collection<SizeFCompat> dpSizes, Function1<? super SizeFCompat, ? extends RemoteViews> factory) {
        Intrinsics.checkNotNullParameter(appWidgetManager, "<this>");
        Intrinsics.checkNotNullParameter(dpSizes, "dpSizes");
        Intrinsics.checkNotNullParameter(factory, "factory");
        appWidgetManager.updateAppWidget(i, createResponsiveSizeAppWidget(appWidgetManager, i, dpSizes, factory));
    }
}
