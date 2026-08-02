package androidx.glance.appwidget;

import android.content.Context;
import android.os.Build;
import android.support.v4.media.a;
import android.widget.RemoteViews;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.compose.ui.unit.Dp;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.unit.Dimension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u001a\u001aK\u0010\u001b\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\"\u001a$\u0010#\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a&\u0010$\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010%\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\u0014\u0010&\u001a\u00020'*\u00020'2\u0006\u0010(\u001a\u00020)H\u0000\u001a,\u0010*\u001a\u00020\u0003*\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0003\u001a\f\u0010,\u001a\u00020\u0016*\u00020'H\u0002\u001a\f\u0010-\u001a\u00020\u0016*\u00020\u0016H\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\b\u001a\u00020\t*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"LayoutMap", "", "Landroidx/glance/appwidget/LayoutType;", "", "RootAliasTypeCount", "TopLevelLayoutsCount", "getTopLevelLayoutsCount", "()I", "isSimple", "", "Landroidx/glance/appwidget/InsertedViewInfo;", "(Landroidx/glance/appwidget/InsertedViewInfo;)Z", "createRootView", "Landroidx/glance/appwidget/RemoteViewsInfo;", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "modifier", "Landroidx/glance/GlanceModifier;", "aliasIndex", "makeViewStubSelector", "Landroidx/glance/appwidget/SizeSelector;", "width", "Landroidx/glance/appwidget/LayoutSize;", "height", "selectLayout33", "type", "(Landroidx/glance/appwidget/LayoutType;Landroidx/glance/GlanceModifier;)Ljava/lang/Integer;", "insertContainerView", "Landroid/widget/RemoteViews;", "numChildren", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Horizontal;", "verticalAlignment", "Landroidx/glance/layout/Alignment$Vertical;", "insertContainerView-nVsUan0", "insertView", "insertViewInternal", "childLayout", "resolveDimension", "Landroidx/glance/unit/Dimension;", "context", "Landroid/content/Context;", "selectChild", "pos", "toSpecSize", "toViewStubSize", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutSelection.kt\nandroidx/glance/appwidget/LayoutSelectionKt\n+ 2 Utils.kt\nandroidx/glance/UtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,430:1\n23#2,7:431\n23#2,7:438\n23#2,7:445\n23#2,7:452\n23#2,7:459\n23#2,7:466\n23#2,7:474\n23#2,7:481\n23#2,7:488\n1#3:473\n766#4:495\n857#4,2:496\n1855#4,2:498\n175#5:500\n*S KotlinDebug\n*F\n+ 1 LayoutSelection.kt\nandroidx/glance/appwidget/LayoutSelectionKt\n*L\n214#1:431,7\n217#1:438,7\n239#1:445,7\n241#1:452,7\n260#1:459,7\n262#1:466,7\n264#1:474,7\n303#1:481,7\n304#1:488,7\n364#1:495\n364#1:496,2\n365#1:498,2\n417#1:500\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutSelectionKt {
    private static final Map<LayoutType, Integer> LayoutMap = MapsKt.mapOf(TuplesKt.to(LayoutType.Text, Integer.valueOf(R.layout.glance_text)), TuplesKt.to(LayoutType.List, Integer.valueOf(R.layout.glance_list)), TuplesKt.to(LayoutType.CheckBox, Integer.valueOf(R.layout.glance_check_box)), TuplesKt.to(LayoutType.CheckBoxBackport, Integer.valueOf(R.layout.glance_check_box_backport)), TuplesKt.to(LayoutType.Button, Integer.valueOf(R.layout.glance_button)), TuplesKt.to(LayoutType.Swtch, Integer.valueOf(R.layout.glance_swtch)), TuplesKt.to(LayoutType.SwtchBackport, Integer.valueOf(R.layout.glance_swtch_backport)), TuplesKt.to(LayoutType.Frame, Integer.valueOf(R.layout.glance_frame)), TuplesKt.to(LayoutType.ImageCrop, Integer.valueOf(R.layout.glance_image_crop)), TuplesKt.to(LayoutType.ImageCropDecorative, Integer.valueOf(R.layout.glance_image_crop_decorative)), TuplesKt.to(LayoutType.ImageFit, Integer.valueOf(R.layout.glance_image_fit)), TuplesKt.to(LayoutType.ImageFitDecorative, Integer.valueOf(R.layout.glance_image_fit_decorative)), TuplesKt.to(LayoutType.ImageFillBounds, Integer.valueOf(R.layout.glance_image_fill_bounds)), TuplesKt.to(LayoutType.ImageFillBoundsDecorative, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), TuplesKt.to(LayoutType.LinearProgressIndicator, Integer.valueOf(R.layout.glance_linear_progress_indicator)), TuplesKt.to(LayoutType.CircularProgressIndicator, Integer.valueOf(R.layout.glance_circular_progress_indicator)), TuplesKt.to(LayoutType.VerticalGridOneColumn, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), TuplesKt.to(LayoutType.VerticalGridTwoColumns, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), TuplesKt.to(LayoutType.VerticalGridThreeColumns, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), TuplesKt.to(LayoutType.VerticalGridFourColumns, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), TuplesKt.to(LayoutType.VerticalGridFiveColumns, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), TuplesKt.to(LayoutType.VerticalGridAutoFit, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), TuplesKt.to(LayoutType.RadioButton, Integer.valueOf(R.layout.glance_radio_button)), TuplesKt.to(LayoutType.RadioButtonBackport, Integer.valueOf(R.layout.glance_radio_button_backport)));
    private static final int RootAliasTypeCount;
    private static final int TopLevelLayoutsCount;

    static {
        int size = GeneratedLayoutsKt.getGeneratedRootLayoutShifts().size();
        RootAliasTypeCount = size;
        TopLevelLayoutsCount = Build.VERSION.SDK_INT >= 31 ? GeneratedLayoutsKt.getRootAliasCount() : GeneratedLayoutsKt.getRootAliasCount() / size;
    }

    public static final RemoteViewsInfo createRootView(TranslationContext translationContext, GlanceModifier glanceModifier, int i) {
        Object obj;
        Object obj2;
        Dimension height;
        Dimension width;
        Context context = translationContext.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (i >= GeneratedLayoutsKt.getRootAliasCount()) {
                throw new IllegalArgumentException(("Index of the root view cannot be more than " + GeneratedLayoutsKt.getRootAliasCount() + ", currently " + i).toString());
            }
            LayoutSize layoutSize = LayoutSize.Wrap;
            SizeSelector sizeSelector = new SizeSelector(layoutSize, layoutSize);
            RemoteViews remoteViews = RemoteViewsTranslatorKt.remoteViews(translationContext, GeneratedLayoutsKt.getFirstRootAlias() + i);
            WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, new Function2<WidthModifier, GlanceModifier.Element, WidthModifier>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$createRootView$lambda$3$$inlined$findModifier$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final WidthModifier invoke(WidthModifier widthModifier2, GlanceModifier.Element element) {
                    return element instanceof WidthModifier ? element : widthModifier2;
                }
            });
            if (widthModifier != null) {
                ApplyModifiersKt.applySimpleWidthModifier(context, remoteViews, widthModifier, R.id.rootView);
            }
            HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, new Function2<HeightModifier, GlanceModifier.Element, HeightModifier>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$createRootView$lambda$3$$inlined$findModifier$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final HeightModifier invoke(HeightModifier heightModifier2, GlanceModifier.Element element) {
                    return element instanceof HeightModifier ? element : heightModifier2;
                }
            });
            if (heightModifier != null) {
                ApplyModifiersKt.applySimpleHeightModifier(context, remoteViews, heightModifier, R.id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            return new RemoteViewsInfo(remoteViews, new InsertedViewInfo(R.id.rootView, 0, i2 >= 33 ? MapsKt.emptyMap() : MapsKt.mapOf(TuplesKt.to(0, MapsKt.mapOf(TuplesKt.to(sizeSelector, Integer.valueOf(R.id.rootStubId))))), 2, null));
        }
        int i3 = RootAliasTypeCount;
        if (i3 * i >= GeneratedLayoutsKt.getRootAliasCount()) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (GeneratedLayoutsKt.getRootAliasCount() / 4) + ", currently " + i).toString());
        }
        WidthModifier widthModifier2 = (WidthModifier) glanceModifier.foldIn(null, new Function2<WidthModifier, GlanceModifier.Element, WidthModifier>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$createRootView$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final WidthModifier invoke(WidthModifier widthModifier3, GlanceModifier.Element element) {
                return element instanceof WidthModifier ? element : widthModifier3;
            }
        });
        if (widthModifier2 == null || (width = widthModifier2.getWidth()) == null || (obj = resolveDimension(width, context)) == null) {
            obj = Dimension.Wrap.INSTANCE;
        }
        HeightModifier heightModifier2 = (HeightModifier) glanceModifier.foldIn(null, new Function2<HeightModifier, GlanceModifier.Element, HeightModifier>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$createRootView$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final HeightModifier invoke(HeightModifier heightModifier3, GlanceModifier.Element element) {
                return element instanceof HeightModifier ? element : heightModifier3;
            }
        });
        if (heightModifier2 == null || (height = heightModifier2.getHeight()) == null || (obj2 = resolveDimension(height, context)) == null) {
            obj2 = Dimension.Wrap.INSTANCE;
        }
        Dimension.Fill fill = Dimension.Fill.INSTANCE;
        LayoutSize layoutSize2 = Intrinsics.areEqual(obj, fill) ? LayoutSize.MatchParent : LayoutSize.Wrap;
        LayoutSize layoutSize3 = Intrinsics.areEqual(obj2, fill) ? LayoutSize.MatchParent : LayoutSize.Wrap;
        SizeSelector makeViewStubSelector = makeViewStubSelector(layoutSize2, layoutSize3);
        Integer num = GeneratedLayoutsKt.getGeneratedRootLayoutShifts().get(makeViewStubSelector);
        if (num != null) {
            return new RemoteViewsInfo(RemoteViewsTranslatorKt.remoteViews(translationContext, (i3 * i) + GeneratedLayoutsKt.getFirstRootAlias() + num.intValue()), new InsertedViewInfo(0, 0, MapsKt.mapOf(TuplesKt.to(0, MapsKt.mapOf(TuplesKt.to(makeViewStubSelector, Integer.valueOf(R.id.rootStubId))))), 3, null));
        }
        throw new IllegalStateException("Cannot find root element for size [" + layoutSize2 + ", " + layoutSize3 + ']');
    }

    public static final int getTopLevelLayoutsCount() {
        return TopLevelLayoutsCount;
    }

    /* renamed from: insertContainerView-nVsUan0, reason: not valid java name */
    public static final InsertedViewInfo m1310insertContainerViewnVsUan0(RemoteViews remoteViews, TranslationContext translationContext, LayoutType layoutType, int i, GlanceModifier glanceModifier, Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        LayoutType layoutType2;
        int intValue;
        if (i > 10) {
            Objects.toString(layoutType);
            new IllegalArgumentException(layoutType + " container cannot have more than 10 elements");
        }
        int coerceAtMost = RangesKt.coerceAtMost(i, 10);
        Integer selectLayout33 = selectLayout33(layoutType, glanceModifier);
        if (selectLayout33 != null) {
            intValue = selectLayout33.intValue();
            layoutType2 = layoutType;
        } else {
            layoutType2 = layoutType;
            ContainerInfo containerInfo = GeneratedLayoutsKt.getGeneratedContainers().get(new ContainerSelector(layoutType2, coerceAtMost, horizontal, vertical, null));
            Integer valueOf = containerInfo != null ? Integer.valueOf(containerInfo.getLayoutId()) : null;
            if (valueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + layoutType2 + " with " + i + " children");
            }
            intValue = valueOf.intValue();
        }
        Map<Integer, Map<SizeSelector, Integer>> map = GeneratedLayoutsKt.getGeneratedChildren().get(layoutType2);
        if (map == null) {
            throw new IllegalArgumentException("Cannot find generated children for " + layoutType2);
        }
        InsertedViewInfo copy$default = InsertedViewInfo.copy$default(insertViewInternal(remoteViews, translationContext, intValue, glanceModifier), 0, 0, map, 3, null);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(copy$default.getMainViewId());
        }
        return copy$default;
    }

    public static final InsertedViewInfo insertView(RemoteViews remoteViews, TranslationContext translationContext, LayoutType layoutType, GlanceModifier glanceModifier) {
        Integer selectLayout33 = selectLayout33(layoutType, glanceModifier);
        if (selectLayout33 != null || (selectLayout33 = LayoutMap.get(layoutType)) != null) {
            return insertViewInternal(remoteViews, translationContext, selectLayout33.intValue(), glanceModifier);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + layoutType);
    }

    private static final InsertedViewInfo insertViewInternal(RemoteViews remoteViews, TranslationContext translationContext, @LayoutRes int i, GlanceModifier glanceModifier) {
        Dimension dimension;
        Dimension dimension2;
        int itemPosition = translationContext.getItemPosition();
        Integer num = null;
        WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, new Function2<WidthModifier, GlanceModifier.Element, WidthModifier>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$insertViewInternal$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final WidthModifier invoke(WidthModifier widthModifier2, GlanceModifier.Element element) {
                return element instanceof WidthModifier ? element : widthModifier2;
            }
        });
        if (widthModifier == null || (dimension = widthModifier.getWidth()) == null) {
            dimension = Dimension.Wrap.INSTANCE;
        }
        HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, new Function2<HeightModifier, GlanceModifier.Element, HeightModifier>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$insertViewInternal$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final HeightModifier invoke(HeightModifier heightModifier2, GlanceModifier.Element element) {
                return element instanceof HeightModifier ? element : heightModifier2;
            }
        });
        if (heightModifier == null || (dimension2 = heightModifier.getHeight()) == null) {
            dimension2 = Dimension.Wrap.INSTANCE;
        }
        if (!glanceModifier.all(new Function1<GlanceModifier.Element, Boolean>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$insertViewInternal$specifiedViewId$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(GlanceModifier.Element element) {
                return Boolean.valueOf(!(element instanceof AppWidgetBackgroundModifier));
            }
        })) {
            if (translationContext.isBackgroundSpecified().getAndSet(true)) {
                throw new IllegalStateException("At most one view can be set as AppWidgetBackground.");
            }
            num = Integer.valueOf(android.R.id.background);
        }
        Integer num2 = num;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            int intValue = num2 != null ? num2.intValue() : translationContext.nextViewId();
            RemoteViewsTranslatorKt.addChildView(remoteViews, translationContext.getParentContext().getMainViewId(), LayoutSelectionApi31Impl.INSTANCE.remoteViews(translationContext.getContext().getPackageName(), i, intValue), itemPosition);
            return new InsertedViewInfo(intValue, 0, null, 6, null);
        }
        if (i2 >= 31) {
            Dimension.Expand expand = Dimension.Expand.INSTANCE;
            return new InsertedViewInfo(UtilsKt.inflateViewStub(remoteViews, translationContext, selectChild(remoteViews, translationContext, itemPosition, Intrinsics.areEqual(dimension, expand) ? LayoutSize.Expand : LayoutSize.Wrap, Intrinsics.areEqual(dimension2, expand) ? LayoutSize.Expand : LayoutSize.Wrap), i, num2), 0, null, 6, null);
        }
        Context context = translationContext.getContext();
        LayoutSize specSize = toSpecSize(resolveDimension(dimension, context));
        LayoutSize specSize2 = toSpecSize(resolveDimension(dimension2, context));
        int selectChild = selectChild(remoteViews, translationContext, itemPosition, specSize, specSize2);
        LayoutSize layoutSize = LayoutSize.Fixed;
        if (specSize != layoutSize && specSize2 != layoutSize) {
            return new InsertedViewInfo(UtilsKt.inflateViewStub(remoteViews, translationContext, selectChild, i, num2), 0, null, 6, null);
        }
        LayoutInfo layoutInfo = GeneratedLayoutsKt.getGeneratedComplexLayouts().get(new SizeSelector(specSize, specSize2));
        if (layoutInfo != null) {
            return new InsertedViewInfo(UtilsKt.inflateViewStub(remoteViews, translationContext, R.id.glanceViewStub, i, num2), UtilsKt.inflateViewStub$default(remoteViews, translationContext, selectChild, layoutInfo.getLayoutId(), null, 8, null), null, 4, null);
        }
        throw new IllegalArgumentException("Could not find complex layout for width=" + specSize + ", height=" + specSize2);
    }

    public static final boolean isSimple(InsertedViewInfo insertedViewInfo) {
        return insertedViewInfo.getComplexViewId() == -1;
    }

    private static final SizeSelector makeViewStubSelector(LayoutSize layoutSize, LayoutSize layoutSize2) {
        return new SizeSelector(toViewStubSize(layoutSize), toViewStubSize(layoutSize2));
    }

    public static final Dimension resolveDimension(Dimension dimension, Context context) {
        if (!(dimension instanceof Dimension.Resource)) {
            return dimension;
        }
        float dimension2 = context.getResources().getDimension(((Dimension.Resource) dimension).getRes());
        int i = (int) dimension2;
        return i != -2 ? i != -1 ? new Dimension.Dp(Dp.m1021constructorimpl(dimension2 / context.getResources().getDisplayMetrics().density), null) : Dimension.Fill.INSTANCE : Dimension.Wrap.INSTANCE;
    }

    @IdRes
    private static final int selectChild(RemoteViews remoteViews, TranslationContext translationContext, int i, LayoutSize layoutSize, LayoutSize layoutSize2) {
        SizeSelector makeViewStubSelector = makeViewStubSelector(layoutSize, layoutSize2);
        Map<SizeSelector, Integer> map = translationContext.getParentContext().getChildren().get(Integer.valueOf(i));
        if (map == null) {
            throw new IllegalStateException(a.a(i, "Parent doesn't have child position "));
        }
        Integer num = map.get(makeViewStubSelector);
        if (num == null) {
            throw new IllegalStateException("No child for position " + i + " and size " + layoutSize + " x " + layoutSize2);
        }
        int intValue = num.intValue();
        Collection<Integer> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((Number) obj).intValue() != intValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UtilsKt.inflateViewStub(remoteViews, translationContext, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return intValue;
    }

    @IdRes
    private static final Integer selectLayout33(LayoutType layoutType, GlanceModifier glanceModifier) {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        AlignmentModifier alignmentModifier = (AlignmentModifier) glanceModifier.foldIn(null, new Function2<AlignmentModifier, GlanceModifier.Element, AlignmentModifier>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$selectLayout33$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final AlignmentModifier invoke(AlignmentModifier alignmentModifier2, GlanceModifier.Element element) {
                return element instanceof AlignmentModifier ? element : alignmentModifier2;
            }
        });
        WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, new Function2<WidthModifier, GlanceModifier.Element, WidthModifier>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$selectLayout33$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final WidthModifier invoke(WidthModifier widthModifier2, GlanceModifier.Element element) {
                return element instanceof WidthModifier ? element : widthModifier2;
            }
        });
        boolean areEqual = widthModifier != null ? Intrinsics.areEqual(widthModifier.getWidth(), Dimension.Expand.INSTANCE) : false;
        HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, new Function2<HeightModifier, GlanceModifier.Element, HeightModifier>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$selectLayout33$$inlined$findModifier$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final HeightModifier invoke(HeightModifier heightModifier2, GlanceModifier.Element element) {
                return element instanceof HeightModifier ? element : heightModifier2;
            }
        });
        boolean areEqual2 = heightModifier != null ? Intrinsics.areEqual(heightModifier.getHeight(), Dimension.Expand.INSTANCE) : false;
        if (alignmentModifier != null) {
            LayoutInfo layoutInfo = GeneratedLayoutsKt.getGeneratedBoxChildren().get(new BoxChildSelector(layoutType, alignmentModifier.getAlignment().getHorizontal(), alignmentModifier.getAlignment().getVertical(), null));
            if (layoutInfo != null) {
                return Integer.valueOf(layoutInfo.getLayoutId());
            }
            throw new IllegalArgumentException("Cannot find " + layoutType + " with alignment " + alignmentModifier.getAlignment());
        }
        if (!areEqual && !areEqual2) {
            return null;
        }
        LayoutInfo layoutInfo2 = GeneratedLayoutsKt.getGeneratedRowColumnChildren().get(new RowColumnChildSelector(layoutType, areEqual, areEqual2));
        if (layoutInfo2 != null) {
            return Integer.valueOf(layoutInfo2.getLayoutId());
        }
        throw new IllegalArgumentException("Cannot find " + layoutType + " with defaultWeight set");
    }

    private static final LayoutSize toSpecSize(Dimension dimension) {
        if (dimension instanceof Dimension.Wrap) {
            return LayoutSize.Wrap;
        }
        if (dimension instanceof Dimension.Expand) {
            return LayoutSize.Expand;
        }
        if (dimension instanceof Dimension.Fill) {
            return LayoutSize.MatchParent;
        }
        if (dimension instanceof Dimension.Dp ? true : dimension instanceof Dimension.Resource) {
            return LayoutSize.Fixed;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final LayoutSize toViewStubSize(LayoutSize layoutSize) {
        return layoutSize == LayoutSize.Fixed ? LayoutSize.Wrap : layoutSize;
    }
}
