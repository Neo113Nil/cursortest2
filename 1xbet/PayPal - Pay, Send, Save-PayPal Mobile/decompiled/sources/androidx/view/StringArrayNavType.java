package androidx.view;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00032\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J/\u0010\u0016\u001a\u00020\u00152\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/navigation/StringArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "parseValue", "(Ljava/lang/String;)[Ljava/lang/String;", "previousValue", "(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;", "other", "", "valueEquals", "([Ljava/lang/String;[Ljava/lang/String;)Z", "", "serializeAsValues", "([Ljava/lang/String;)Ljava/util/List;", "emptyCollection", "()[Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StringArrayNavType extends androidx.view.CollectionNavType<java.lang.String[]> {
    public StringArrayNavType() {
        super(true);
    }

    @Override // androidx.view.NavType
    public final java.lang.String getName() {
        return "string[]";
    }

    @Override // androidx.view.NavType
    public final java.lang.String[] parseValue(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new java.lang.String[]{value};
    }

    @Override // androidx.view.NavType
    public final java.lang.String[] parseValue(java.lang.String value, java.lang.String[] previousValue) {
        java.lang.String[] strArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return (previousValue == null || (strArr = (java.lang.String[]) kotlin.collections.ArraysKt.plus((java.lang.Object[]) previousValue, (java.lang.Object[]) parseValue(value))) == null) ? parseValue(value) : strArr;
    }

    @Override // androidx.view.NavType
    public final boolean valueEquals(java.lang.String[] value, java.lang.String[] other) {
        return kotlin.collections.ArraysKt.contentDeepEquals(value, other);
    }

    @Override // androidx.view.NavType
    public final void put(android.os.Bundle bundle, java.lang.String key, java.lang.String[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundle);
        if (value != null) {
            androidx.view.SavedStateWriter.m9416putStringArrayimpl(m9382constructorimpl, key, value);
        } else {
            androidx.view.SavedStateWriter.m9405putNullimpl(m9382constructorimpl, key);
        }
    }

    @Override // androidx.view.NavType
    public final java.lang.String[] get(android.os.Bundle bundle, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
        if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, key) || androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, key)) {
            return null;
        }
        return androidx.view.SavedStateReader.m9368getStringArrayimpl(m9296constructorimpl, key);
    }

    @Override // androidx.view.CollectionNavType
    public final java.util.List<java.lang.String> serializeAsValues(java.lang.String[] value) {
        if (value == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(value.length);
        for (java.lang.String str : value) {
            arrayList.add(androidx.view.NavUriUtils.encode$default(androidx.view.NavUriUtils.INSTANCE, str, null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.view.CollectionNavType
    public final java.lang.String[] emptyCollection() {
        return new java.lang.String[0];
    }
}
