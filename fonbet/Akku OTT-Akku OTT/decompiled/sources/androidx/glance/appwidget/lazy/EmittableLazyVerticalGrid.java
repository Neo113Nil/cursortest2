package androidx.glance.appwidget.lazy;

import androidx.glance.Emittable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/lazy/EmittableLazyVerticalGrid;", "Landroidx/glance/appwidget/lazy/EmittableLazyVerticalGridList;", "()V", "copy", "Landroidx/glance/Emittable;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyVerticalGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyVerticalGrid.kt\nandroidx/glance/appwidget/lazy/EmittableLazyVerticalGrid\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,379:1\n1549#2:380\n1620#2,3:381\n*S KotlinDebug\n*F\n+ 1 LazyVerticalGrid.kt\nandroidx/glance/appwidget/lazy/EmittableLazyVerticalGrid\n*L\n317#1:380\n317#1:381,3\n*E\n"})
/* loaded from: classes.dex */
public final class EmittableLazyVerticalGrid extends EmittableLazyVerticalGridList {
    @Override // androidx.glance.Emittable
    public Emittable copy() {
        int collectionSizeOrDefault;
        EmittableLazyVerticalGrid emittableLazyVerticalGrid = new EmittableLazyVerticalGrid();
        emittableLazyVerticalGrid.setModifier(getModifier());
        emittableLazyVerticalGrid.m1333setHorizontalAlignmentuMT220(getHorizontalAlignment());
        emittableLazyVerticalGrid.setGridCells(getNumColumn());
        emittableLazyVerticalGrid.setActivityOptions(getActivityOptions());
        List<Emittable> children = emittableLazyVerticalGrid.getChildren();
        List<Emittable> children2 = getChildren();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(children2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = children2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Emittable) it.next()).copy());
        }
        children.addAll(arrayList);
        return emittableLazyVerticalGrid;
    }
}
