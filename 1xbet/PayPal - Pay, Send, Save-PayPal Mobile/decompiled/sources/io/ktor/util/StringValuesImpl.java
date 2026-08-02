package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00180\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J/\u0010\u001d\u001a\u00020\u001b2\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Lio/ktor/util/StringValuesImpl;", "Lio/ktor/util/StringValues;", "", "caseInsensitiveName", "", "", "", "values", "<init>", "(ZLjava/util/Map;)V", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "contains", "(Ljava/lang/String;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/String;Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "entries", "Lkotlin/Function2;", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "forEach", "(Lkotlin/jvm/functions/Function2;)V", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getCaseInsensitiveName", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public class StringValuesImpl implements io.ktor.util.StringValues {
    private final boolean caseInsensitiveName;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> values;

    public StringValuesImpl(boolean z, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.caseInsensitiveName = z;
        java.util.LinkedHashMap caseInsensitiveMap = z ? io.ktor.util.CollectionsKt.caseInsensitiveMap() : new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<java.lang.String> value = entry.getValue();
            int size = value.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(value.get(i));
            }
            caseInsensitiveMap.put(key, arrayList);
        }
        this.values = caseInsensitiveMap;
    }

    @Override // io.ktor.util.StringValues
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public /* synthetic */ StringValuesImpl(boolean z, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    protected final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getValues() {
        return this.values;
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.lang.String> names() {
        return io.ktor.util.CollectionsJvmKt.unmodifiable(this.values.keySet());
    }

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return io.ktor.util.CollectionsJvmKt.unmodifiable(this.values.entrySet());
    }

    @Override // io.ktor.util.StringValues
    public void forEach(kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : this.values.entrySet()) {
            body.invoke(entry.getKey(), entry.getValue());
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StringValues(case=");
        sb.append(!this.caseInsensitiveName);
        sb.append(") ");
        sb.append(entries());
        return sb.toString();
    }

    public boolean equals(java.lang.Object other) {
        boolean areEqual;
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.util.StringValues)) {
            return false;
        }
        io.ktor.util.StringValues stringValues = (io.ktor.util.StringValues) other;
        if (this.caseInsensitiveName != stringValues.getCaseInsensitiveName()) {
            return false;
        }
        areEqual = kotlin.jvm.internal.Intrinsics.areEqual(entries(), stringValues.entries());
        return areEqual;
    }

    public int hashCode() {
        return io.ktor.util.StringValuesKt.access$entriesHashCode(entries(), java.lang.Boolean.hashCode(this.caseInsensitiveName) * 31);
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.values.get(name2) != null;
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.List<java.lang.String> list = this.values.get(name2);
        if (list != null) {
            return list.contains(value);
        }
        return false;
    }

    @Override // io.ktor.util.StringValues
    public java.lang.String get(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.List<java.lang.String> list = this.values.get(name2);
        if (list != null) {
            return (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public java.util.List<java.lang.String> getAll(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.values.get(name2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringValuesImpl() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
