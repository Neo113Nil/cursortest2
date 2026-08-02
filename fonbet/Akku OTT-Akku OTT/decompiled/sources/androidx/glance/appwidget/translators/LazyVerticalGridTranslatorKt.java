package androidx.glance.appwidget.translators;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.Emittable;
import androidx.glance.appwidget.ApplyModifiersKt;
import androidx.glance.appwidget.GlanceRemoteViewsServiceKt;
import androidx.glance.appwidget.InsertedViewInfo;
import androidx.glance.appwidget.LayoutConfiguration;
import androidx.glance.appwidget.LayoutSelectionKt;
import androidx.glance.appwidget.LayoutType;
import androidx.glance.appwidget.RemoteCollectionItems;
import androidx.glance.appwidget.RemoteViewsTranslatorKt;
import androidx.glance.appwidget.TranslationContext;
import androidx.glance.appwidget.lazy.EmittableLazyVerticalGrid;
import androidx.glance.appwidget.lazy.EmittableLazyVerticalGridListItem;
import androidx.glance.appwidget.lazy.GridCells;
import androidx.glance.layout.Alignment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a$\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u001c\u0010\u000e\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"LazyVerticalGridItemStartingViewId", "", "toLayout", "Landroidx/glance/appwidget/LayoutType;", "Landroidx/glance/appwidget/lazy/GridCells;", "translateEmittableLazyVerticalGrid", "", "Landroid/widget/RemoteViews;", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "element", "Landroidx/glance/appwidget/lazy/EmittableLazyVerticalGrid;", "viewDef", "Landroidx/glance/appwidget/InsertedViewInfo;", "translateEmittableLazyVerticalGridListItem", "Landroidx/glance/appwidget/lazy/EmittableLazyVerticalGridListItem;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyVerticalGridTranslator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyVerticalGridTranslator.kt\nandroidx/glance/appwidget/translators/LazyVerticalGridTranslatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1804#2,4:150\n1#3:154\n*S KotlinDebug\n*F\n+ 1 LazyVerticalGridTranslator.kt\nandroidx/glance/appwidget/translators/LazyVerticalGridTranslatorKt\n*L\n91#1:150,4\n*E\n"})
/* loaded from: classes.dex */
public final class LazyVerticalGridTranslatorKt {
    private static final int LazyVerticalGridItemStartingViewId = 1048576;

    private static final LayoutType toLayout(GridCells gridCells) {
        return Intrinsics.areEqual(gridCells, new GridCells.Fixed(1)) ? LayoutType.VerticalGridOneColumn : Intrinsics.areEqual(gridCells, new GridCells.Fixed(2)) ? LayoutType.VerticalGridTwoColumns : Intrinsics.areEqual(gridCells, new GridCells.Fixed(3)) ? LayoutType.VerticalGridThreeColumns : Intrinsics.areEqual(gridCells, new GridCells.Fixed(4)) ? LayoutType.VerticalGridFourColumns : Intrinsics.areEqual(gridCells, new GridCells.Fixed(5)) ? LayoutType.VerticalGridFiveColumns : LayoutType.VerticalGridAutoFit;
    }

    public static final void translateEmittableLazyVerticalGrid(RemoteViews remoteViews, TranslationContext translationContext, EmittableLazyVerticalGrid emittableLazyVerticalGrid) {
        translateEmittableLazyVerticalGrid(remoteViews, translationContext, emittableLazyVerticalGrid, LayoutSelectionKt.insertView(remoteViews, translationContext, toLayout(emittableLazyVerticalGrid.getNumColumn()), emittableLazyVerticalGrid.getModifier()));
    }

    public static final void translateEmittableLazyVerticalGridListItem(RemoteViews remoteViews, TranslationContext translationContext, EmittableLazyVerticalGridListItem emittableLazyVerticalGridListItem) {
        if (emittableLazyVerticalGridListItem.getChildren().size() != 1 || !Intrinsics.areEqual(emittableLazyVerticalGridListItem.getAlignment(), Alignment.INSTANCE.getCenterStart())) {
            throw new IllegalArgumentException("Lazy vertical grid items can only have a single child align at the center start of the view. The normalization of the composition tree failed.");
        }
        RemoteViewsTranslatorKt.translateChild(remoteViews, translationContext, (Emittable) CollectionsKt.first((List) emittableLazyVerticalGridListItem.getChildren()));
    }

    private static final void translateEmittableLazyVerticalGrid(RemoteViews remoteViews, TranslationContext translationContext, EmittableLazyVerticalGrid emittableLazyVerticalGrid, InsertedViewInfo insertedViewInfo) {
        int count;
        if (!translationContext.isLazyCollectionDescendant()) {
            GridCells numColumn = emittableLazyVerticalGrid.getNumColumn();
            if ((numColumn instanceof GridCells.Fixed) && (1 > (count = ((GridCells.Fixed) numColumn).getCount()) || count >= 6)) {
                throw new IllegalArgumentException("Only counts from 1 to 5 are supported.");
            }
            remoteViews.setPendingIntentTemplate(insertedViewInfo.getMainViewId(), PendingIntent.getActivity(translationContext.getContext(), 0, new Intent(), 184549384, emittableLazyVerticalGrid.getActivityOptions()));
            RemoteCollectionItems.Builder builder = new RemoteCollectionItems.Builder();
            TranslationContext forLazyCollection = translationContext.forLazyCollection(insertedViewInfo.getMainViewId());
            boolean z = false;
            int i = 0;
            for (Object obj : emittableLazyVerticalGrid.getChildren()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Emittable emittable = (Emittable) obj;
                Intrinsics.checkNotNull(emittable, "null cannot be cast to non-null type androidx.glance.appwidget.lazy.EmittableLazyVerticalGridListItem");
                long itemId = ((EmittableLazyVerticalGridListItem) emittable).getItemId();
                TranslationContext forLazyViewItem = forLazyCollection.forLazyViewItem(i, 1048576);
                List listOf = CollectionsKt.listOf(emittable);
                LayoutConfiguration layoutConfiguration = translationContext.getLayoutConfiguration();
                builder.addItem(itemId, RemoteViewsTranslatorKt.translateComposition(forLazyViewItem, listOf, layoutConfiguration != null ? layoutConfiguration.addLayout(emittable) : -1));
                z = z || itemId > -4611686018427387904L;
                i = i2;
            }
            builder.setHasStableIds(z);
            builder.setViewTypeCount(LayoutSelectionKt.getTopLevelLayoutsCount());
            GlanceRemoteViewsServiceKt.setRemoteAdapter(remoteViews, translationContext.getContext(), translationContext.getAppWidgetId(), insertedViewInfo.getMainViewId(), RemoteViewsTranslatorKt.m1314toSizeStringEaSLcWc(translationContext.m1325getLayoutSizeMYxV2XQ()), builder.build());
            if (Build.VERSION.SDK_INT >= 31 && (numColumn instanceof GridCells.Adaptive)) {
                RemoteViewsCompat.setGridViewColumnWidth(remoteViews, insertedViewInfo.getMainViewId(), ((GridCells.Adaptive) numColumn).getMinSize(), 1);
            }
            ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableLazyVerticalGrid.getModifier(), insertedViewInfo);
            return;
        }
        throw new IllegalStateException("Glance does not support nested list views.");
    }
}
