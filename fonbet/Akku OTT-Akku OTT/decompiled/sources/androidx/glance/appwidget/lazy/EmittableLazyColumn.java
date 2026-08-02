package androidx.glance.appwidget.lazy;

import androidx.glance.Emittable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/lazy/EmittableLazyColumn;", "Landroidx/glance/appwidget/lazy/EmittableLazyList;", "()V", "copy", "Landroidx/glance/Emittable;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/glance/appwidget/lazy/EmittableLazyColumn\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,316:1\n1549#2:317\n1620#2,3:318\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/glance/appwidget/lazy/EmittableLazyColumn\n*L\n313#1:317\n313#1:318,3\n*E\n"})
/* loaded from: classes.dex */
public final class EmittableLazyColumn extends EmittableLazyList {
    @Override // androidx.glance.Emittable
    public Emittable copy() {
        int collectionSizeOrDefault;
        EmittableLazyColumn emittableLazyColumn = new EmittableLazyColumn();
        emittableLazyColumn.setModifier(getModifier());
        emittableLazyColumn.m1331setHorizontalAlignmentuMT220(getHorizontalAlignment());
        emittableLazyColumn.setActivityOptions(getActivityOptions());
        List<Emittable> children = emittableLazyColumn.getChildren();
        List<Emittable> children2 = getChildren();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(children2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = children2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Emittable) it.next()).copy());
        }
        children.addAll(arrayList);
        return emittableLazyColumn;
    }
}
