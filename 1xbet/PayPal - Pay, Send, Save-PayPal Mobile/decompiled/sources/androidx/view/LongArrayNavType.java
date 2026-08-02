package androidx.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J#\u0010\u0016\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/navigation/LongArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "parseValue", "(Ljava/lang/String;)[J", "previousValue", "(Ljava/lang/String;[J)[J", "other", "", "valueEquals", "([J[J)Z", "", "serializeAsValues", "([J)Ljava/util/List;", "emptyCollection", "()[J", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LongArrayNavType extends androidx.view.CollectionNavType<long[]> {
    public LongArrayNavType() {
        super(true);
    }

    @Override // androidx.view.NavType
    public final java.lang.String getName() {
        return "long[]";
    }

    @Override // androidx.view.NavType
    public final long[] parseValue(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new long[]{androidx.view.NavType.LongType.parseValue(value).longValue()};
    }

    @Override // androidx.view.NavType
    public final long[] parseValue(java.lang.String value, long[] previousValue) {
        long[] plus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return (previousValue == null || (plus = kotlin.collections.ArraysKt.plus(previousValue, parseValue(value))) == null) ? parseValue(value) : plus;
    }

    @Override // androidx.view.NavType
    public final boolean valueEquals(long[] value, long[] other) {
        return kotlin.collections.ArraysKt.contentDeepEquals(value != null ? kotlin.collections.ArraysKt.toTypedArray(value) : null, other != null ? kotlin.collections.ArraysKt.toTypedArray(other) : null);
    }

    @Override // androidx.view.CollectionNavType
    public final java.util.List<java.lang.String> serializeAsValues(long[] value) {
        java.util.List<java.lang.Long> list;
        if (value == null || (list = kotlin.collections.ArraysKt.toList(value)) == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<java.lang.Long> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
        }
        return arrayList;
    }

    @Override // androidx.view.NavType
    public final void put(android.os.Bundle bundle, java.lang.String key, long[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundle);
        if (value != null) {
            androidx.view.SavedStateWriter.m9404putLongArrayimpl(m9382constructorimpl, key, value);
        } else {
            androidx.view.SavedStateWriter.m9405putNullimpl(m9382constructorimpl, key);
        }
    }

    @Override // androidx.view.NavType
    public final long[] get(android.os.Bundle bundle, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
        if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
            return null;
        }
        return androidx.view.SavedStateReader.m9338getLongArrayimpl(m9296constructorimpl, key);
    }

    @Override // androidx.view.CollectionNavType
    public final long[] emptyCollection() {
        return new long[0];
    }
}
