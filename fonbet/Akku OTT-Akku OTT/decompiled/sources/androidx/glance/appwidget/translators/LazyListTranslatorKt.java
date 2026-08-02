package androidx.glance.appwidget.translators;

import android.app.PendingIntent;
import android.content.Intent;
import android.widget.RemoteViews;
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
import androidx.glance.appwidget.lazy.EmittableLazyColumn;
import androidx.glance.appwidget.lazy.EmittableLazyList;
import androidx.glance.appwidget.lazy.EmittableLazyListItem;
import androidx.glance.layout.Alignment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a$\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"LazyListItemStartingViewId", "", "translateEmittableLazyColumn", "", "Landroid/widget/RemoteViews;", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "element", "Landroidx/glance/appwidget/lazy/EmittableLazyColumn;", "translateEmittableLazyList", "Landroidx/glance/appwidget/lazy/EmittableLazyList;", "viewDef", "Landroidx/glance/appwidget/InsertedViewInfo;", "translateEmittableLazyListItem", "Landroidx/glance/appwidget/lazy/EmittableLazyListItem;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListTranslator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListTranslator.kt\nandroidx/glance/appwidget/translators/LazyListTranslatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1804#2,4:125\n1#3:129\n*S KotlinDebug\n*F\n+ 1 LazyListTranslator.kt\nandroidx/glance/appwidget/translators/LazyListTranslatorKt\n*L\n78#1:125,4\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListTranslatorKt {
    private static final int LazyListItemStartingViewId = 1048576;

    public static final void translateEmittableLazyColumn(RemoteViews remoteViews, TranslationContext translationContext, EmittableLazyColumn emittableLazyColumn) {
        translateEmittableLazyList(remoteViews, translationContext, emittableLazyColumn, LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.List, emittableLazyColumn.getModifier()));
    }

    private static final void translateEmittableLazyList(RemoteViews remoteViews, TranslationContext translationContext, EmittableLazyList emittableLazyList, InsertedViewInfo insertedViewInfo) {
        if (translationContext.isLazyCollectionDescendant()) {
            throw new IllegalStateException("Glance does not support nested list views.");
        }
        remoteViews.setPendingIntentTemplate(insertedViewInfo.getMainViewId(), PendingIntent.getActivity(translationContext.getContext(), 0, new Intent(), 184549384, emittableLazyList.getActivityOptions()));
        RemoteCollectionItems.Builder builder = new RemoteCollectionItems.Builder();
        TranslationContext forLazyCollection = translationContext.forLazyCollection(insertedViewInfo.getMainViewId());
        boolean z = false;
        int i = 0;
        for (Object obj : emittableLazyList.getChildren()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Emittable emittable = (Emittable) obj;
            Intrinsics.checkNotNull(emittable, "null cannot be cast to non-null type androidx.glance.appwidget.lazy.EmittableLazyListItem");
            long itemId = ((EmittableLazyListItem) emittable).getItemId();
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
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableLazyList.getModifier(), insertedViewInfo);
    }

    public static final void translateEmittableLazyListItem(RemoteViews remoteViews, TranslationContext translationContext, EmittableLazyListItem emittableLazyListItem) {
        if (emittableLazyListItem.getChildren().size() != 1 || !Intrinsics.areEqual(emittableLazyListItem.getAlignment(), Alignment.INSTANCE.getCenterStart())) {
            throw new IllegalArgumentException("Lazy list items can only have a single child align at the center start of the view. The normalization of the composition tree failed.");
        }
        RemoteViewsTranslatorKt.translateChild(remoteViews, translationContext, (Emittable) CollectionsKt.first((List) emittableLazyListItem.getChildren()));
    }
}
