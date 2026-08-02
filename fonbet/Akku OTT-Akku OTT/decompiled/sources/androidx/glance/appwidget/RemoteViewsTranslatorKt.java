package androidx.glance.appwidget;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.annotation.LayoutRes;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.core.view.GravityCompat;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.Emittable;
import androidx.glance.EmittableButton;
import androidx.glance.EmittableImage;
import androidx.glance.GlanceModifier;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.appwidget.lazy.EmittableLazyColumn;
import androidx.glance.appwidget.lazy.EmittableLazyListItem;
import androidx.glance.appwidget.lazy.EmittableLazyVerticalGrid;
import androidx.glance.appwidget.lazy.EmittableLazyVerticalGridListItem;
import androidx.glance.appwidget.translators.CheckBoxTranslatorKt;
import androidx.glance.appwidget.translators.CircularProgressIndicatorTranslatorKt;
import androidx.glance.appwidget.translators.ImageTranslatorKt;
import androidx.glance.appwidget.translators.LazyListTranslatorKt;
import androidx.glance.appwidget.translators.LazyVerticalGridTranslatorKt;
import androidx.glance.appwidget.translators.LinearProgressIndicatorTranslatorKt;
import androidx.glance.appwidget.translators.RadioButtonTranslatorKt;
import androidx.glance.appwidget.translators.SwitchTranslatorKt;
import androidx.glance.appwidget.translators.TextTranslatorKt;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.EmittableBox;
import androidx.glance.layout.EmittableColumn;
import androidx.glance.layout.EmittableRow;
import androidx.glance.layout.EmittableSpacer;
import androidx.glance.layout.PaddingKt;
import androidx.glance.layout.PaddingModifier;
import androidx.glance.text.EmittableText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u001a\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u0001H\u0000\u001aS\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a&\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010!\u001a\u00020\u0001H\u0000\u001a$\u0010(\u001a\u00020\u000f*\u00020\u00142\u0006\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0001H\u0000\u001a\f\u0010,\u001a\u00020\u0014*\u00020\u0014H\u0002\u001a*\u0010-\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000\u001a\f\u00100\u001a\u00020\u0001*\u000201H\u0000\u001a\u0019\u00100\u001a\u00020\u0001*\u000202H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a\u0019\u00100\u001a\u00020\u0001*\u000205H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00104\u001a\u0019\u00107\u001a\u000208*\u00020#H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001a\u001c\u0010;\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0012H\u0000\u001a\u001c\u0010<\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020=H\u0002\u001a\u001c\u0010>\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020?H\u0002\u001a\u001c\u0010@\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020AH\u0002\u001a\u001c\u0010B\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020CH\u0002\u001a\u001c\u0010D\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020EH\u0002\u001a\u001c\u0010F\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020GH\u0000\u001a\u001c\u0010H\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020IH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"(\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"\u0018\u0010\u000b\u001a\u00020\u0003*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006J"}, d2 = {"LAST_INVALID_VIEW_ID", "", "forceRtl", "", "getForceRtl$annotations", "()V", "getForceRtl", "()Ljava/lang/Boolean;", "setForceRtl", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isRtl", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "checkSelectableGroupChildren", "", "children", "", "Landroidx/glance/Emittable;", "combineLandscapeAndPortrait", "Landroid/widget/RemoteViews;", "views", "remoteViews", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "layoutId", "translateComposition", "context", "appWidgetId", "element", "Landroidx/glance/appwidget/RemoteViewsRoot;", "layoutConfiguration", "Landroidx/glance/appwidget/LayoutConfiguration;", "rootViewIndex", "layoutSize", "Landroidx/compose/ui/unit/DpSize;", "actionBroadcastReceiver", "Landroid/content/ComponentName;", "translateComposition-KpG6l20", "(Landroid/content/Context;ILandroidx/glance/appwidget/RemoteViewsRoot;Landroidx/glance/appwidget/LayoutConfiguration;IJLandroid/content/ComponentName;)Landroid/widget/RemoteViews;", "addChildView", "viewId", "childView", "stableId", "copy", "setChildren", "parentDef", "Landroidx/glance/appwidget/InsertedViewInfo;", "toGravity", "Landroidx/glance/layout/Alignment;", "Landroidx/glance/layout/Alignment$Horizontal;", "toGravity-uMT2-20", "(I)I", "Landroidx/glance/layout/Alignment$Vertical;", "toGravity-Je2gTW8", "toSizeString", "", "toSizeString-EaSLcWc", "(J)Ljava/lang/String;", "translateChild", "translateEmittableAndroidRemoteViews", "Landroidx/glance/appwidget/EmittableAndroidRemoteViews;", "translateEmittableBox", "Landroidx/glance/layout/EmittableBox;", "translateEmittableButton", "Landroidx/glance/EmittableButton;", "translateEmittableColumn", "Landroidx/glance/layout/EmittableColumn;", "translateEmittableRow", "Landroidx/glance/layout/EmittableRow;", "translateEmittableSizeBox", "Landroidx/glance/appwidget/EmittableSizeBox;", "translateEmittableSpacer", "Landroidx/glance/layout/EmittableSpacer;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRemoteViewsTranslator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteViewsTranslator.kt\nandroidx/glance/appwidget/RemoteViewsTranslatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Utils.kt\nandroidx/glance/UtilsKt\n*L\n1#1,512:1\n1726#2,3:513\n1549#2:516\n1620#2,3:517\n1549#2:521\n1620#2,3:522\n1855#2,2:526\n1774#2,4:528\n1864#2,3:532\n1864#2,3:544\n1#3:520\n474#4:525\n155#4:535\n155#4:543\n23#5,7:536\n*S KotlinDebug\n*F\n+ 1 RemoteViewsTranslator.kt\nandroidx/glance/appwidget/RemoteViewsTranslatorKt\n*L\n108#1:513,3\n114#1:516\n114#1:517,3\n132#1:521\n132#1:522,3\n310#1:526,2\n395#1:528,4\n413#1:532,3\n469#1:544,3\n206#1:525\n447#1:535\n449#1:543\n448#1:536,7\n*E\n"})
/* loaded from: classes.dex */
public final class RemoteViewsTranslatorKt {
    private static final int LAST_INVALID_VIEW_ID = 1;
    private static Boolean forceRtl;

    public static final void addChildView(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            RemoteViewsTranslatorApi31Impl.INSTANCE.addChildView(remoteViews, i, remoteViews2, i2);
        } else {
            remoteViews.addView(i, remoteViews2);
        }
    }

    private static final void checkSelectableGroupChildren(List<? extends Emittable> list) {
        int i;
        if (list == null || !list.isEmpty()) {
            i = 0;
            for (Emittable emittable : list) {
                if ((emittable instanceof EmittableRadioButton) && ((EmittableRadioButton) emittable).getChecked() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        } else {
            i = 0;
        }
        if (!(i <= 1)) {
            throw new IllegalStateException("When using GlanceModifier.selectableGroup(), no more than one RadioButton may be checked at a time.");
        }
    }

    private static final RemoteViews combineLandscapeAndPortrait(List<? extends RemoteViews> list) {
        int size = list.size();
        if (size == 1) {
            return list.get(0);
        }
        if (size == 2) {
            return new RemoteViews(list.get(0), list.get(1));
        }
        throw new IllegalArgumentException("There must be between 1 and 2 views.");
    }

    private static final RemoteViews copy(RemoteViews remoteViews) {
        return Build.VERSION.SDK_INT >= 28 ? RemoteViewsTranslatorApi28Impl.INSTANCE.copyRemoteViews(remoteViews) : remoteViews.clone();
    }

    public static final Boolean getForceRtl() {
        return forceRtl;
    }

    @VisibleForTesting
    public static /* synthetic */ void getForceRtl$annotations() {
    }

    private static final boolean isRtl(Context context) {
        Boolean bool = forceRtl;
        return bool != null ? bool.booleanValue() : context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final RemoteViews remoteViews(TranslationContext translationContext, @LayoutRes int i) {
        return new RemoteViews(translationContext.getContext().getPackageName(), i);
    }

    public static final void setChildren(RemoteViews remoteViews, TranslationContext translationContext, InsertedViewInfo insertedViewInfo, List<? extends Emittable> list) {
        List take;
        take = CollectionsKt___CollectionsKt.take(list, 10);
        int i = 0;
        for (Object obj : take) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            translateChild(remoteViews, translationContext.forChild(insertedViewInfo, i), (Emittable) obj);
            i = i2;
        }
    }

    public static final void setForceRtl(Boolean bool) {
        forceRtl = bool;
    }

    public static final int toGravity(Alignment alignment) {
        return m1312toGravityJe2gTW8(alignment.getVertical()) | m1313toGravityuMT220(alignment.getHorizontal());
    }

    /* renamed from: toGravity-Je2gTW8, reason: not valid java name */
    public static final int m1312toGravityJe2gTW8(int i) {
        Alignment.Vertical.Companion companion = Alignment.Vertical.INSTANCE;
        if (Alignment.Vertical.m1382equalsimpl0(i, companion.m1388getTopmnfRV0w())) {
            return 48;
        }
        if (Alignment.Vertical.m1382equalsimpl0(i, companion.m1386getBottommnfRV0w())) {
            return 80;
        }
        if (Alignment.Vertical.m1382equalsimpl0(i, companion.m1387getCenterVerticallymnfRV0w())) {
            return 16;
        }
        Alignment.Vertical.m1384toStringimpl(i);
        return 48;
    }

    /* renamed from: toGravity-uMT2-20, reason: not valid java name */
    public static final int m1313toGravityuMT220(int i) {
        Alignment.Horizontal.Companion companion = Alignment.Horizontal.INSTANCE;
        if (Alignment.Horizontal.m1372equalsimpl0(i, companion.m1378getStartPGIyAqw())) {
            return GravityCompat.START;
        }
        if (Alignment.Horizontal.m1372equalsimpl0(i, companion.m1377getEndPGIyAqw())) {
            return GravityCompat.END;
        }
        if (Alignment.Horizontal.m1372equalsimpl0(i, companion.m1376getCenterHorizontallyPGIyAqw())) {
            return 1;
        }
        Alignment.Horizontal.m1374toStringimpl(i);
        return GravityCompat.START;
    }

    /* renamed from: toSizeString-EaSLcWc, reason: not valid java name */
    public static final String m1314toSizeStringEaSLcWc(long j) {
        if (j == DpSize.INSTANCE.m1128getUnspecifiedMYxV2XQ()) {
            return "Unspecified";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) Dp.m1032toStringimpl(DpSize.m1119getWidthD9Ej5fM(j)));
        sb.append('x');
        sb.append((Object) Dp.m1032toStringimpl(DpSize.m1117getHeightD9Ej5fM(j)));
        return sb.toString();
    }

    public static final void translateChild(RemoteViews remoteViews, TranslationContext translationContext, Emittable emittable) {
        if (emittable instanceof EmittableBox) {
            translateEmittableBox(remoteViews, translationContext, (EmittableBox) emittable);
            return;
        }
        if (emittable instanceof EmittableButton) {
            translateEmittableButton(remoteViews, translationContext, (EmittableButton) emittable);
            return;
        }
        if (emittable instanceof EmittableRow) {
            translateEmittableRow(remoteViews, translationContext, (EmittableRow) emittable);
            return;
        }
        if (emittable instanceof EmittableColumn) {
            translateEmittableColumn(remoteViews, translationContext, (EmittableColumn) emittable);
            return;
        }
        if (emittable instanceof EmittableText) {
            TextTranslatorKt.translateEmittableText(remoteViews, translationContext, (EmittableText) emittable);
            return;
        }
        if (emittable instanceof EmittableLazyListItem) {
            LazyListTranslatorKt.translateEmittableLazyListItem(remoteViews, translationContext, (EmittableLazyListItem) emittable);
            return;
        }
        if (emittable instanceof EmittableLazyColumn) {
            LazyListTranslatorKt.translateEmittableLazyColumn(remoteViews, translationContext, (EmittableLazyColumn) emittable);
            return;
        }
        if (emittable instanceof EmittableAndroidRemoteViews) {
            translateEmittableAndroidRemoteViews(remoteViews, translationContext, (EmittableAndroidRemoteViews) emittable);
            return;
        }
        if (emittable instanceof EmittableCheckBox) {
            CheckBoxTranslatorKt.translateEmittableCheckBox(remoteViews, translationContext, (EmittableCheckBox) emittable);
            return;
        }
        if (emittable instanceof EmittableSpacer) {
            translateEmittableSpacer(remoteViews, translationContext, (EmittableSpacer) emittable);
            return;
        }
        if (emittable instanceof EmittableSwitch) {
            SwitchTranslatorKt.translateEmittableSwitch(remoteViews, translationContext, (EmittableSwitch) emittable);
            return;
        }
        if (emittable instanceof EmittableImage) {
            ImageTranslatorKt.translateEmittableImage(remoteViews, translationContext, (EmittableImage) emittable);
            return;
        }
        if (emittable instanceof EmittableLinearProgressIndicator) {
            LinearProgressIndicatorTranslatorKt.translateEmittableLinearProgressIndicator(remoteViews, translationContext, (EmittableLinearProgressIndicator) emittable);
            return;
        }
        if (emittable instanceof EmittableCircularProgressIndicator) {
            CircularProgressIndicatorTranslatorKt.translateEmittableCircularProgressIndicator(remoteViews, translationContext, (EmittableCircularProgressIndicator) emittable);
            return;
        }
        if (emittable instanceof EmittableLazyVerticalGrid) {
            LazyVerticalGridTranslatorKt.translateEmittableLazyVerticalGrid(remoteViews, translationContext, (EmittableLazyVerticalGrid) emittable);
            return;
        }
        if (emittable instanceof EmittableLazyVerticalGridListItem) {
            LazyVerticalGridTranslatorKt.translateEmittableLazyVerticalGridListItem(remoteViews, translationContext, (EmittableLazyVerticalGridListItem) emittable);
            return;
        }
        if (emittable instanceof EmittableRadioButton) {
            RadioButtonTranslatorKt.translateEmittableRadioButton(remoteViews, translationContext, (EmittableRadioButton) emittable);
        } else if (emittable instanceof EmittableSizeBox) {
            translateEmittableSizeBox(remoteViews, translationContext, (EmittableSizeBox) emittable);
        } else {
            throw new IllegalArgumentException("Unknown element type " + emittable.getClass().getCanonicalName());
        }
    }

    public static final RemoteViews translateComposition(TranslationContext translationContext, List<? extends Emittable> list, int i) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((Emittable) it.next()) instanceof EmittableSizeBox)) {
                    Emittable emittable = (Emittable) CollectionsKt.single((List) list);
                    RemoteViewsInfo createRootView = LayoutSelectionKt.createRootView(translationContext, emittable.getModifier(), i);
                    RemoteViews remoteViews = createRootView.getRemoteViews();
                    translateChild(remoteViews, translationContext.forRoot(createRootView), emittable);
                    return remoteViews;
                }
            }
        }
        Object first = CollectionsKt.first((List<? extends Object>) list);
        Intrinsics.checkNotNull(first, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
        SizeMode sizeMode = ((EmittableSizeBox) first).getSizeMode();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Emittable emittable2 : list) {
            Intrinsics.checkNotNull(emittable2, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
            long size = ((EmittableSizeBox) emittable2).getSize();
            RemoteViewsInfo createRootView2 = LayoutSelectionKt.createRootView(translationContext, emittable2.getModifier(), i);
            RemoteViews remoteViews2 = createRootView2.getRemoteViews();
            translateChild(remoteViews2, translationContext.m1324forRootAndSize6HolHcs(createRootView2, size), emittable2);
            arrayList.add(TuplesKt.to(AppWidgetUtilsKt.m1286toSizeFEaSLcWc(size), remoteViews2));
        }
        if (sizeMode instanceof SizeMode.Single) {
            return (RemoteViews) ((Pair) CollectionsKt.single((List) arrayList)).getSecond();
        }
        boolean z = true;
        if (!(sizeMode instanceof SizeMode.Responsive ? true : Intrinsics.areEqual(sizeMode, SizeMode.Exact.INSTANCE))) {
            throw new NoWhenBranchMatchedException();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.createRemoteViews(MapsKt.toMap(arrayList));
        }
        if (arrayList.size() != 1 && arrayList.size() != 2) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("unsupported views size");
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((RemoteViews) ((Pair) it2.next()).getSecond());
        }
        return combineLandscapeAndPortrait(arrayList2);
    }

    /* renamed from: translateComposition-KpG6l20, reason: not valid java name */
    public static final RemoteViews m1315translateCompositionKpG6l20(Context context, int i, RemoteViewsRoot remoteViewsRoot, LayoutConfiguration layoutConfiguration, int i2, long j, ComponentName componentName) {
        return translateComposition(new TranslationContext(context, i, isRtl(context), layoutConfiguration, -1, false, null, null, null, j, 0, 0, false, null, componentName, 15840, null), remoteViewsRoot.getChildren(), i2);
    }

    private static final void translateEmittableAndroidRemoteViews(RemoteViews remoteViews, TranslationContext translationContext, EmittableAndroidRemoteViews emittableAndroidRemoteViews) {
        RemoteViews copy;
        if (emittableAndroidRemoteViews.getChildren().isEmpty()) {
            copy = emittableAndroidRemoteViews.getRemoteViews();
        } else {
            if (emittableAndroidRemoteViews.getContainerViewId() == -1) {
                throw new IllegalStateException("To add children to an `AndroidRemoteViews`, its `containerViewId` must be set.");
            }
            copy = copy(emittableAndroidRemoteViews.getRemoteViews());
            copy.removeAllViews(emittableAndroidRemoteViews.getContainerViewId());
            int i = 0;
            for (Object obj : emittableAndroidRemoteViews.getChildren()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Emittable emittable = (Emittable) obj;
                RemoteViewsInfo createRootView = LayoutSelectionKt.createRootView(translationContext, emittable.getModifier(), i);
                RemoteViews remoteViews2 = createRootView.getRemoteViews();
                translateChild(remoteViews2, translationContext.forRoot(createRootView), emittable);
                addChildView(copy, emittableAndroidRemoteViews.getContainerViewId(), remoteViews2, i);
                i = i2;
            }
        }
        InsertedViewInfo insertView = LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.Frame, emittableAndroidRemoteViews.getModifier());
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableAndroidRemoteViews.getModifier(), insertView);
        remoteViews.removeAllViews(insertView.getMainViewId());
        addChildView(remoteViews, insertView.getMainViewId(), copy, 0);
    }

    private static final void translateEmittableBox(RemoteViews remoteViews, TranslationContext translationContext, EmittableBox emittableBox) {
        InsertedViewInfo m1310insertContainerViewnVsUan0 = LayoutSelectionKt.m1310insertContainerViewnVsUan0(remoteViews, translationContext, LayoutType.Box, emittableBox.getChildren().size(), emittableBox.getModifier(), Alignment.Horizontal.m1369boximpl(emittableBox.getContentAlignment().getHorizontal()), Alignment.Vertical.m1379boximpl(emittableBox.getContentAlignment().getVertical()));
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableBox.getModifier(), m1310insertContainerViewnVsUan0);
        for (Emittable emittable : emittableBox.getChildren()) {
            emittable.setModifier(emittable.getModifier().then(new AlignmentModifier(emittableBox.getContentAlignment())));
        }
        setChildren(remoteViews, translationContext, m1310insertContainerViewnVsUan0, emittableBox.getChildren());
    }

    private static final void translateEmittableButton(RemoteViews remoteViews, TranslationContext translationContext, EmittableButton emittableButton) {
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalStateException("Buttons in Android R and below are emulated using a EmittableBox containing the text.");
        }
        InsertedViewInfo insertView = LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.Button, emittableButton.getModifier());
        TextTranslatorKt.setText(remoteViews, translationContext, insertView.getMainViewId(), emittableButton.getText(), emittableButton.getStyle(), emittableButton.getMaxLines(), 16);
        float f = 16;
        emittableButton.setModifier(CornerRadiusKt.m1304cornerRadius3ABfNKs(AppWidgetModifiersKt.enabled(emittableButton.getModifier(), emittableButton.getEnabled()), Dp.m1021constructorimpl(f)));
        if (emittableButton.getModifier().foldIn(null, new Function2<PaddingModifier, GlanceModifier.Element, PaddingModifier>() { // from class: androidx.glance.appwidget.RemoteViewsTranslatorKt$translateEmittableButton$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final PaddingModifier invoke(PaddingModifier paddingModifier, GlanceModifier.Element element) {
                return element instanceof PaddingModifier ? element : paddingModifier;
            }
        }) == null) {
            emittableButton.setModifier(PaddingKt.m1431paddingVpY3zN4(emittableButton.getModifier(), Dp.m1021constructorimpl(f), Dp.m1021constructorimpl(8)));
        }
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableButton.getModifier(), insertView);
    }

    private static final void translateEmittableColumn(RemoteViews remoteViews, TranslationContext translationContext, EmittableColumn emittableColumn) {
        InsertedViewInfo m1310insertContainerViewnVsUan0 = LayoutSelectionKt.m1310insertContainerViewnVsUan0(remoteViews, translationContext, (Build.VERSION.SDK_INT < 31 || !RadioButtonKt.isSelectableGroup(emittableColumn.getModifier())) ? LayoutType.Column : LayoutType.RadioColumn, emittableColumn.getChildren().size(), emittableColumn.getModifier(), Alignment.Horizontal.m1369boximpl(emittableColumn.getHorizontalAlignment()), null);
        RemoteViewsCompat.setLinearLayoutGravity(remoteViews, m1310insertContainerViewnVsUan0.getMainViewId(), toGravity(new Alignment(emittableColumn.getHorizontalAlignment(), emittableColumn.getVerticalAlignment(), null)));
        ApplyModifiersKt.applyModifiers(translationContext.canUseSelectableGroup(), remoteViews, emittableColumn.getModifier(), m1310insertContainerViewnVsUan0);
        setChildren(remoteViews, translationContext, m1310insertContainerViewnVsUan0, emittableColumn.getChildren());
        if (RadioButtonKt.isSelectableGroup(emittableColumn.getModifier())) {
            checkSelectableGroupChildren(emittableColumn.getChildren());
        }
    }

    private static final void translateEmittableRow(RemoteViews remoteViews, TranslationContext translationContext, EmittableRow emittableRow) {
        InsertedViewInfo m1310insertContainerViewnVsUan0 = LayoutSelectionKt.m1310insertContainerViewnVsUan0(remoteViews, translationContext, (Build.VERSION.SDK_INT < 31 || !RadioButtonKt.isSelectableGroup(emittableRow.getModifier())) ? LayoutType.Row : LayoutType.RadioRow, emittableRow.getChildren().size(), emittableRow.getModifier(), null, Alignment.Vertical.m1379boximpl(emittableRow.getVerticalAlignment()));
        RemoteViewsCompat.setLinearLayoutGravity(remoteViews, m1310insertContainerViewnVsUan0.getMainViewId(), toGravity(new Alignment(emittableRow.getHorizontalAlignment(), emittableRow.getVerticalAlignment(), null)));
        ApplyModifiersKt.applyModifiers(translationContext.canUseSelectableGroup(), remoteViews, emittableRow.getModifier(), m1310insertContainerViewnVsUan0);
        setChildren(remoteViews, translationContext, m1310insertContainerViewnVsUan0, emittableRow.getChildren());
        if (RadioButtonKt.isSelectableGroup(emittableRow.getModifier())) {
            checkSelectableGroupChildren(emittableRow.getChildren());
        }
    }

    public static final void translateEmittableSizeBox(RemoteViews remoteViews, TranslationContext translationContext, EmittableSizeBox emittableSizeBox) {
        if (emittableSizeBox.getChildren().size() > 1) {
            throw new IllegalArgumentException(("Size boxes can only have at most one child " + emittableSizeBox.getChildren().size() + ". The normalization of the composition tree failed.").toString());
        }
        Emittable emittable = (Emittable) CollectionsKt.firstOrNull((List) emittableSizeBox.getChildren());
        if (emittable != null) {
            translateChild(remoteViews, translationContext, emittable);
        }
    }

    private static final void translateEmittableSpacer(RemoteViews remoteViews, TranslationContext translationContext, EmittableSpacer emittableSpacer) {
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableSpacer.getModifier(), LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.Frame, emittableSpacer.getModifier()));
    }
}
