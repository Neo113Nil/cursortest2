package androidx.core.widget;

import android.appwidget.AppWidgetManager;
import android.util.SizeF;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.util.SizeFCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@RequiresApi(31)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0007J*\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0007J\f\u0010\u000f\u001a\u00020\u000b*\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Landroidx/core/widget/AppWidgetManagerApi31Impl;", "", "()V", "createExactSizeAppWidget", "Landroid/widget/RemoteViews;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "factory", "Lkotlin/Function1;", "Landroidx/core/util/SizeFCompat;", "createResponsiveSizeAppWidget", "dpSizes", "", "toSizeFCompat", "Landroid/util/SizeF;", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppWidgetManagerCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppWidgetManagerCompat.kt\nandroidx/core/widget/AppWidgetManagerApi31Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,336:1\n1271#2,2:337\n1285#2,4:339\n1179#2,2:343\n1253#2,4:345\n*S KotlinDebug\n*F\n+ 1 AppWidgetManagerCompat.kt\nandroidx/core/widget/AppWidgetManagerApi31Impl\n*L\n217#1:337,2\n217#1:339,4\n225#1:343,2\n225#1:345,4\n*E\n"})
/* loaded from: classes.dex */
final class AppWidgetManagerApi31Impl {
    public static final AppWidgetManagerApi31Impl INSTANCE = new AppWidgetManagerApi31Impl();

    private AppWidgetManagerApi31Impl() {
    }

    private final SizeFCompat toSizeFCompat(SizeF sizeF) {
        SizeFCompat sizeFCompat = SizeFCompat.toSizeFCompat(sizeF);
        Intrinsics.checkNotNullExpressionValue(sizeFCompat, "toSizeFCompat(this)");
        return sizeFCompat;
    }

    @DoNotInline
    public final RemoteViews createExactSizeAppWidget(AppWidgetManager appWidgetManager, int appWidgetId, Function1<? super SizeFCompat, ? extends RemoteViews> factory) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(factory, "factory");
        ArrayList parcelableArrayList = appWidgetManager.getAppWidgetOptions(appWidgetId).getParcelableArrayList("appWidgetSizes");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            return AppWidgetManagerApi16Impl.INSTANCE.createExactSizeAppWidget(appWidgetManager, appWidgetId, factory);
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(parcelableArrayList, 10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
        for (Object obj : parcelableArrayList) {
            SizeF it = (SizeF) obj;
            AppWidgetManagerApi31Impl appWidgetManagerApi31Impl = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            linkedHashMap.put(obj, factory.invoke(appWidgetManagerApi31Impl.toSizeFCompat(it)));
        }
        return new RemoteViews(linkedHashMap);
    }

    @DoNotInline
    public final RemoteViews createResponsiveSizeAppWidget(Collection<SizeFCompat> dpSizes, Function1<? super SizeFCompat, ? extends RemoteViews> factory) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(dpSizes, "dpSizes");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Collection<SizeFCompat> collection = dpSizes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
        for (SizeFCompat sizeFCompat : collection) {
            Pair pair = TuplesKt.to(sizeFCompat.toSizeF(), factory.invoke(sizeFCompat));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return new RemoteViews(linkedHashMap);
    }
}
