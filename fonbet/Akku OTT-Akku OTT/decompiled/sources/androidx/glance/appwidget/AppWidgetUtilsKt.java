package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.a;
import android.util.DisplayMetrics;
import android.util.SizeF;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.GlanceId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.C1058c;
import kotlinx.coroutines.flow.InterfaceC1060e;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0019\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001d\u001a\u00020\u001a*\u00020\u0006H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010#\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a-\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u00062\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u001e\u0010*\u001a\u00020\u0006*\u00020)2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060$H\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102\u001a\u0017\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b4\u00105\u001a\u0013\u00107\u001a\u000203*\u000206H\u0000¢\u0006\u0004\b7\u00108\u001a;\u0010A\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000200\u0018\u00010\n¢\u0006\u0002\b?¢\u0006\u0002\b@0>*\u0002092\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0000¢\u0006\u0004\bA\u0010B\"\u0014\u0010C\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010D\"\u0018\u0010\u0003\u001a\u00020\u0002*\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Landroid/util/DisplayMetrics;", "displayMetrics", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetId", "Landroidx/compose/ui/unit/DpSize;", "appWidgetMinSize", "(Landroid/util/DisplayMetrics;Landroid/appwidget/AppWidgetManager;I)J", "Landroid/os/Bundle;", "Lkotlin/Function0;", "minSize", "", "extractAllSizes", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function0;)Ljava/util/List;", "estimateSizes", "extractLandscapeSize", "(Landroid/os/Bundle;)Landroidx/compose/ui/unit/DpSize;", "extractPortraitSize", "extractOrientationSizes", "(Landroid/os/Bundle;)Ljava/util/List;", "other", "", "fitsIn-KscErT0", "(JJ)Z", "fitsIn", "Landroid/util/SizeF;", "toSizeF-EaSLcWc", "(J)Landroid/util/SizeF;", "toSizeF", "widgetSize", "layoutSize", "", "squareDistance-KscErT0", "(JJ)F", "squareDistance", "", "layoutSizes", "findBestSize-itqla9I", "(JLjava/util/Collection;)Landroidx/compose/ui/unit/DpSize;", "findBestSize", "Landroid/appwidget/AppWidgetProviderInfo;", "getMinSize", "(Landroid/appwidget/AppWidgetProviderInfo;Landroid/util/DisplayMetrics;)J", "sortedBySize", "(Ljava/util/Collection;)Ljava/util/List;", "", "throwable", "", "logException", "(Ljava/lang/Throwable;)V", "", "createUniqueRemoteUiName", "(I)Ljava/lang/String;", "Landroidx/glance/appwidget/AppWidgetId;", "toSessionKey", "(Landroidx/glance/appwidget/AppWidgetId;)Ljava/lang/String;", "Landroidx/glance/appwidget/GlanceAppWidget;", "Landroid/content/Context;", "context", "Landroidx/glance/GlanceId;", "id", "Lkotlinx/coroutines/flow/e;", "Landroidx/glance/GlanceComposable;", "Landroidx/compose/runtime/Composable;", "runGlance", "(Landroidx/glance/appwidget/GlanceAppWidget;Landroid/content/Context;Landroidx/glance/GlanceId;)Lkotlinx/coroutines/flow/e;", "MaxComposeTreeDepth", "I", "getAppWidgetManager", "(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppWidgetUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppWidgetUtils.kt\nandroidx/glance/appwidget/AppWidgetUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1549#2:255\n1620#2,2:256\n1622#2:259\n1603#2,9:263\n1855#2:272\n1856#2:274\n1612#2:275\n2333#2,14:276\n175#3:258\n155#3:260\n155#3:261\n155#3:262\n1#4:273\n*S KotlinDebug\n*F\n+ 1 AppWidgetUtils.kt\nandroidx/glance/appwidget/AppWidgetUtilsKt\n*L\n88#1:255\n88#1:256,2\n88#1:259\n140#1:263,9\n140#1:272\n140#1:274\n140#1:275\n146#1:276,14\n88#1:258\n105#1:260\n112#1:261\n119#1:262\n140#1:273\n*E\n"})
/* loaded from: classes.dex */
public final class AppWidgetUtilsKt {
    public static final int MaxComposeTreeDepth = 50;

    public static final long appWidgetMinSize(DisplayMetrics displayMetrics, AppWidgetManager appWidgetManager, int i) {
        AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i);
        if (appWidgetInfo == null) {
            return DpSize.INSTANCE.m1129getZeroMYxV2XQ();
        }
        return DpKt.m1043DpSizeYgX7TsA(UtilsKt.pixelsToDp(Math.min(appWidgetInfo.minWidth, (appWidgetInfo.resizeMode & 1) != 0 ? appWidgetInfo.minResizeWidth : Integer.MAX_VALUE), displayMetrics), UtilsKt.pixelsToDp(Math.min(appWidgetInfo.minHeight, (appWidgetInfo.resizeMode & 2) != 0 ? appWidgetInfo.minResizeHeight : Integer.MAX_VALUE), displayMetrics));
    }

    public static final String createUniqueRemoteUiName(int i) {
        return a.a(i, "appWidget-");
    }

    private static final List<DpSize> estimateSizes(Bundle bundle, Function0<DpSize> function0) {
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxHeight", 0);
        int i3 = bundle.getInt("appWidgetMinWidth", 0);
        int i4 = bundle.getInt("appWidgetMaxWidth", 0);
        return (i == 0 || i2 == 0 || i3 == 0 || i4 == 0) ? CollectionsKt.listOf(function0.invoke()) : CollectionsKt.listOf((Object[]) new DpSize[]{DpSize.m1107boximpl(DpKt.m1043DpSizeYgX7TsA(Dp.m1021constructorimpl(i3), Dp.m1021constructorimpl(i2))), DpSize.m1107boximpl(DpKt.m1043DpSizeYgX7TsA(Dp.m1021constructorimpl(i4), Dp.m1021constructorimpl(i)))});
    }

    public static final List<DpSize> extractAllSizes(Bundle bundle, Function0<DpSize> function0) {
        int collectionSizeOrDefault;
        ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            return estimateSizes(bundle, function0);
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(parcelableArrayList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (SizeF sizeF : parcelableArrayList) {
            arrayList.add(DpSize.m1107boximpl(DpKt.m1043DpSizeYgX7TsA(Dp.m1021constructorimpl(sizeF.getWidth()), Dp.m1021constructorimpl(sizeF.getHeight()))));
        }
        return arrayList;
    }

    private static final DpSize extractLandscapeSize(Bundle bundle) {
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxWidth", 0);
        if (i == 0 || i2 == 0) {
            return null;
        }
        return DpSize.m1107boximpl(DpKt.m1043DpSizeYgX7TsA(Dp.m1021constructorimpl(i2), Dp.m1021constructorimpl(i)));
    }

    public static final List<DpSize> extractOrientationSizes(Bundle bundle) {
        return CollectionsKt.listOfNotNull((Object[]) new DpSize[]{extractLandscapeSize(bundle), extractPortraitSize(bundle)});
    }

    private static final DpSize extractPortraitSize(Bundle bundle) {
        int i = bundle.getInt("appWidgetMaxHeight", 0);
        int i2 = bundle.getInt("appWidgetMinWidth", 0);
        if (i == 0 || i2 == 0) {
            return null;
        }
        return DpSize.m1107boximpl(DpKt.m1043DpSizeYgX7TsA(Dp.m1021constructorimpl(i2), Dp.m1021constructorimpl(i)));
    }

    /* renamed from: findBestSize-itqla9I, reason: not valid java name */
    public static final DpSize m1283findBestSizeitqla9I(long j, Collection<DpSize> collection) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            long packedValue = ((DpSize) it.next()).getPackedValue();
            Pair pair = m1284fitsInKscErT0(packedValue, j) ? TuplesKt.to(DpSize.m1107boximpl(packedValue), Float.valueOf(m1285squareDistanceKscErT0(j, packedValue))) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float floatValue = ((Number) ((Pair) next).getSecond()).floatValue();
                do {
                    Object next2 = it2.next();
                    float floatValue2 = ((Number) ((Pair) next2).getSecond()).floatValue();
                    if (Float.compare(floatValue, floatValue2) > 0) {
                        next = next2;
                        floatValue = floatValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair2 = (Pair) next;
        if (pair2 != null) {
            return (DpSize) pair2.getFirst();
        }
        return null;
    }

    /* renamed from: fitsIn-KscErT0, reason: not valid java name */
    private static final boolean m1284fitsInKscErT0(long j, long j2) {
        float f = 1;
        return ((float) Math.ceil((double) DpSize.m1119getWidthD9Ej5fM(j2))) + f > DpSize.m1119getWidthD9Ej5fM(j) && ((float) Math.ceil((double) DpSize.m1117getHeightD9Ej5fM(j2))) + f > DpSize.m1117getHeightD9Ej5fM(j);
    }

    public static final AppWidgetManager getAppWidgetManager(Context context) {
        Object systemService = context.getSystemService("appwidget");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.appwidget.AppWidgetManager");
        return (AppWidgetManager) systemService;
    }

    public static final long getMinSize(AppWidgetProviderInfo appWidgetProviderInfo, DisplayMetrics displayMetrics) {
        return DpKt.m1043DpSizeYgX7TsA(UtilsKt.pixelsToDp(Math.min(appWidgetProviderInfo.minWidth, (appWidgetProviderInfo.resizeMode & 1) != 0 ? appWidgetProviderInfo.minResizeWidth : Integer.MAX_VALUE), displayMetrics), UtilsKt.pixelsToDp(Math.min(appWidgetProviderInfo.minHeight, (appWidgetProviderInfo.resizeMode & 2) != 0 ? appWidgetProviderInfo.minResizeHeight : Integer.MAX_VALUE), displayMetrics));
    }

    public static final void logException(Throwable th) {
    }

    public static final InterfaceC1060e<Function2<Composer, Integer, Unit>> runGlance(GlanceAppWidget glanceAppWidget, Context context, GlanceId glanceId) {
        return new C1058c(new AppWidgetUtilsKt$runGlance$1(glanceAppWidget, context, glanceId, null), EmptyCoroutineContext.INSTANCE, -2, kotlinx.coroutines.channels.a.a);
    }

    public static final List<DpSize> sortedBySize(Collection<DpSize> collection) {
        return CollectionsKt.sortedWith(collection, ComparisonsKt.compareBy(new Function1<DpSize, Comparable<?>>() { // from class: androidx.glance.appwidget.AppWidgetUtilsKt$sortedBySize$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Comparable<?> invoke(DpSize dpSize) {
                return m1287invokeEaSLcWc(dpSize.getPackedValue());
            }

            /* renamed from: invoke-EaSLcWc, reason: not valid java name */
            public final Comparable<?> m1287invokeEaSLcWc(long j) {
                return Float.valueOf(DpSize.m1117getHeightD9Ej5fM(j) * DpSize.m1119getWidthD9Ej5fM(j));
            }
        }, new Function1<DpSize, Comparable<?>>() { // from class: androidx.glance.appwidget.AppWidgetUtilsKt$sortedBySize$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Comparable<?> invoke(DpSize dpSize) {
                return m1288invokeEaSLcWc(dpSize.getPackedValue());
            }

            /* renamed from: invoke-EaSLcWc, reason: not valid java name */
            public final Comparable<?> m1288invokeEaSLcWc(long j) {
                return Float.valueOf(DpSize.m1119getWidthD9Ej5fM(j));
            }
        }));
    }

    /* renamed from: squareDistance-KscErT0, reason: not valid java name */
    private static final float m1285squareDistanceKscErT0(long j, long j2) {
        float m1119getWidthD9Ej5fM = DpSize.m1119getWidthD9Ej5fM(j) - DpSize.m1119getWidthD9Ej5fM(j2);
        float m1117getHeightD9Ej5fM = DpSize.m1117getHeightD9Ej5fM(j) - DpSize.m1117getHeightD9Ej5fM(j2);
        return (m1117getHeightD9Ej5fM * m1117getHeightD9Ej5fM) + (m1119getWidthD9Ej5fM * m1119getWidthD9Ej5fM);
    }

    public static final String toSessionKey(AppWidgetId appWidgetId) {
        return createUniqueRemoteUiName(appWidgetId.getAppWidgetId());
    }

    /* renamed from: toSizeF-EaSLcWc, reason: not valid java name */
    public static final SizeF m1286toSizeFEaSLcWc(long j) {
        return new SizeF(DpSize.m1119getWidthD9Ej5fM(j), DpSize.m1117getHeightD9Ej5fM(j));
    }
}
