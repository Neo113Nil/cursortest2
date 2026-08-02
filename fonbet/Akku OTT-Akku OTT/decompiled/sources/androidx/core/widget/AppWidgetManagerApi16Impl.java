package androidx.core.widget;

import android.appwidget.AppWidgetManager;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.util.SizeFCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi(16)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\tH\u0002J,\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\tH\u0007J:\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\tH\u0007J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0014"}, d2 = {"Landroidx/core/widget/AppWidgetManagerApi16Impl;", "", "()V", "createAppWidget", "Landroid/widget/RemoteViews;", "landscapeSize", "Landroidx/core/util/SizeFCompat;", "portraitSize", "factory", "Lkotlin/Function1;", "createExactSizeAppWidget", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "createResponsiveSizeAppWidget", "sizes", "", "getSizesFromOptionsBundle", "Landroidx/core/widget/LandscapePortraitSizes;", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppWidgetManagerCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppWidgetManagerCompat.kt\nandroidx/core/widget/AppWidgetManagerApi16Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,336:1\n2333#2,14:337\n766#2:351\n857#2,2:352\n1963#2,14:354\n766#2:368\n857#2,2:369\n1963#2,14:371\n*S KotlinDebug\n*F\n+ 1 AppWidgetManagerCompat.kt\nandroidx/core/widget/AppWidgetManagerApi16Impl\n*L\n259#1:337,14\n271#1:351\n271#1:352,2\n271#1:354,14\n273#1:368\n273#1:369,2\n273#1:371,14\n*E\n"})
/* loaded from: classes.dex */
final class AppWidgetManagerApi16Impl {
    public static final AppWidgetManagerApi16Impl INSTANCE = new AppWidgetManagerApi16Impl();

    private AppWidgetManagerApi16Impl() {
    }

    private final RemoteViews createAppWidget(SizeFCompat landscapeSize, SizeFCompat portraitSize, Function1<? super SizeFCompat, ? extends RemoteViews> factory) {
        return Intrinsics.areEqual(landscapeSize, portraitSize) ? factory.invoke(landscapeSize) : new RemoteViews(factory.invoke(landscapeSize), factory.invoke(portraitSize));
    }

    private final LandscapePortraitSizes getSizesFromOptionsBundle(AppWidgetManager appWidgetManager, int appWidgetId) {
        Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(appWidgetId);
        int i = appWidgetOptions.getInt("appWidgetMinWidth", -1);
        int i2 = appWidgetOptions.getInt("appWidgetMaxHeight", -1);
        if (i >= 0 && i2 >= 0) {
            int i3 = appWidgetOptions.getInt("appWidgetMaxWidth", -1);
            int i4 = appWidgetOptions.getInt("appWidgetMinHeight", -1);
            if (i3 >= 0 && i4 >= 0) {
                return new LandscapePortraitSizes(new SizeFCompat(i3, i4), new SizeFCompat(i, i2));
            }
        }
        return null;
    }

    @DoNotInline
    public final RemoteViews createExactSizeAppWidget(AppWidgetManager appWidgetManager, int appWidgetId, Function1<? super SizeFCompat, ? extends RemoteViews> factory) {
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(factory, "factory");
        LandscapePortraitSizes sizesFromOptionsBundle = getSizesFromOptionsBundle(appWidgetManager, appWidgetId);
        return sizesFromOptionsBundle == null ? AppWidgetManagerCompat.createAppWidgetFromProviderInfo(appWidgetManager, appWidgetId, factory) : createAppWidget(sizesFromOptionsBundle.getLandscape(), sizesFromOptionsBundle.getPortrait(), factory);
    }

    @DoNotInline
    public final RemoteViews createResponsiveSizeAppWidget(AppWidgetManager appWidgetManager, int appWidgetId, Collection<SizeFCompat> sizes, Function1<? super SizeFCompat, ? extends RemoteViews> factory) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(sizes, "sizes");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Collection<SizeFCompat> collection = sizes;
        Iterator<T> it = collection.iterator();
        Object obj = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float area = AppWidgetManagerCompat.getArea((SizeFCompat) next);
                do {
                    Object next3 = it.next();
                    float area2 = AppWidgetManagerCompat.getArea((SizeFCompat) next3);
                    if (Float.compare(area, area2) > 0) {
                        next = next3;
                        area = area2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) next;
        if (sizeFCompat == null) {
            throw new IllegalStateException("Sizes cannot be empty");
        }
        LandscapePortraitSizes sizesFromOptionsBundle = getSizesFromOptionsBundle(appWidgetManager, appWidgetId);
        if (sizesFromOptionsBundle == null) {
            sizeFCompat.toString();
            sizesFromOptionsBundle = new LandscapePortraitSizes(sizeFCompat, sizeFCompat);
        }
        SizeFCompat landscape = sizesFromOptionsBundle.getLandscape();
        SizeFCompat portrait = sizesFromOptionsBundle.getPortrait();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            if (AppWidgetManagerCompat.approxDominates(landscape, (SizeFCompat) obj2)) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                float area3 = AppWidgetManagerCompat.getArea((SizeFCompat) next2);
                do {
                    Object next4 = it2.next();
                    float area4 = AppWidgetManagerCompat.getArea((SizeFCompat) next4);
                    if (Float.compare(area3, area4) < 0) {
                        next2 = next4;
                        area3 = area4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        SizeFCompat sizeFCompat2 = (SizeFCompat) next2;
        SizeFCompat sizeFCompat3 = sizeFCompat2 == null ? sizeFCompat : sizeFCompat2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collection) {
            if (AppWidgetManagerCompat.approxDominates(portrait, (SizeFCompat) obj3)) {
                arrayList2.add(obj3);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            obj = it3.next();
            if (it3.hasNext()) {
                float area5 = AppWidgetManagerCompat.getArea((SizeFCompat) obj);
                do {
                    Object next5 = it3.next();
                    float area6 = AppWidgetManagerCompat.getArea((SizeFCompat) next5);
                    if (Float.compare(area5, area6) < 0) {
                        obj = next5;
                        area5 = area6;
                    }
                } while (it3.hasNext());
            }
        }
        SizeFCompat sizeFCompat4 = (SizeFCompat) obj;
        if (sizeFCompat4 != null) {
            sizeFCompat = sizeFCompat4;
        }
        return createAppWidget(sizeFCompat3, sizeFCompat, factory);
    }
}
