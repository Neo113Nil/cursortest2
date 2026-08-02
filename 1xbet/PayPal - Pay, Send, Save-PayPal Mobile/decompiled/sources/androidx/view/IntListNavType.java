package androidx.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\t2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J/\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/navigation/IntListNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "parseValue", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "valueEquals", "(Ljava/util/List;Ljava/util/List;)Z", "serializeAsValues", "(Ljava/util/List;)Ljava/util/List;", "emptyCollection", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IntListNavType extends androidx.view.CollectionNavType<java.util.List<? extends java.lang.Integer>> {
    public IntListNavType() {
        super(true);
    }

    @Override // androidx.view.CollectionNavType
    public final /* bridge */ /* synthetic */ java.util.List serializeAsValues(java.util.List<? extends java.lang.Integer> list) {
        return serializeAsValues2((java.util.List<java.lang.Integer>) list);
    }

    @Override // androidx.view.NavType
    public final java.lang.String getName() {
        return "List<Int>";
    }

    @Override // androidx.view.NavType
    public final java.util.List<java.lang.Integer> parseValue(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return kotlin.collections.CollectionsKt.listOf(androidx.view.NavType.IntType.parseValue(value));
    }

    @Override // androidx.view.NavType
    public final java.util.List<java.lang.Integer> parseValue(java.lang.String value, java.util.List<java.lang.Integer> previousValue) {
        java.util.List<java.lang.Integer> plus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return (previousValue == null || (plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) previousValue, (java.lang.Iterable) parseValue(value))) == null) ? parseValue(value) : plus;
    }

    @Override // androidx.view.NavType
    public final boolean valueEquals(java.util.List<java.lang.Integer> value, java.util.List<java.lang.Integer> other) {
        return kotlin.collections.ArraysKt.contentDeepEquals(value != null ? (java.lang.Integer[]) value.toArray(new java.lang.Integer[0]) : null, other != null ? (java.lang.Integer[]) other.toArray(new java.lang.Integer[0]) : null);
    }

    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public final java.util.List<java.lang.String> serializeAsValues2(java.util.List<java.lang.Integer> value) {
        if (value != null) {
            java.util.List<java.lang.Integer> list = value;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
            }
            return arrayList;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // androidx.view.CollectionNavType
    public final java.util.List<? extends java.lang.Integer> emptyCollection() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // androidx.view.NavType
    public final void put(android.os.Bundle bundle, java.lang.String key, java.util.List<java.lang.Integer> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (value != null) {
            androidx.view.SavedStateWriter.m9400putIntArrayimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key, kotlin.collections.CollectionsKt.toIntArray(value));
        }
    }

    @Override // androidx.view.NavType
    public final java.util.List<java.lang.Integer> get(android.os.Bundle bundle, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
        if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
            return null;
        }
        return kotlin.collections.ArraysKt.toList(androidx.view.SavedStateReader.m9328getIntArrayimpl(m9296constructorimpl, key));
    }
}
