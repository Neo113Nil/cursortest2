package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00160\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010!J%\u0010 \u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#H\u0016¢\u0006\u0004\b \u0010%J%\u0010\"\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#H\u0016¢\u0006\u0004\b\"\u0010%J\u0017\u0010&\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010*\u001a\u00020\u0018H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u001eH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b-\u0010'J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b.\u0010'J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\b002\u0006\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0015R,\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b6\u00107"}, d2 = {"Lio/ktor/util/StringValuesBuilderImpl;", "Lio/ktor/util/StringValuesBuilder;", "", "caseInsensitiveName", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(ZI)V", "", "name", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "contains", "(Ljava/lang/String;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/String;Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "entries", "", "set", "(Ljava/lang/String;Ljava/lang/String;)V", "get", "(Ljava/lang/String;)Ljava/lang/String;", "append", "Lio/ktor/util/StringValues;", "stringValues", "appendAll", "(Lio/ktor/util/StringValues;)V", "appendMissing", "", "values", "(Ljava/lang/String;Ljava/lang/Iterable;)V", "remove", "(Ljava/lang/String;)V", "removeKeysWithNoEntries", "()V", "clear", "build", "()Lio/ktor/util/StringValues;", "validateName", "validateValue", "p0", "", "getHighSpeedVideoSizes", "Z", "getCaseInsensitiveName", "", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class StringValuesBuilderImpl implements io.ktor.util.StringValuesBuilder {
    private final boolean caseInsensitiveName;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> values;

    public StringValuesBuilderImpl(boolean z, int i) {
        this.caseInsensitiveName = z;
        this.values = z ? io.ktor.util.CollectionsKt.caseInsensitiveMap() : new java.util.LinkedHashMap(i);
    }

    public /* synthetic */ StringValuesBuilderImpl(boolean z, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 8 : i);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    protected final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getValues() {
        return this.values;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public java.util.List<java.lang.String> getAll(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.values.get(name2);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean contains(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.values.containsKey(name2);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean contains(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.List<java.lang.String> list = this.values.get(name2);
        if (list != null) {
            return list.contains(value);
        }
        return false;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public java.util.Set<java.lang.String> names() {
        return this.values.keySet();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return io.ktor.util.CollectionsJvmKt.unmodifiable(this.values.entrySet());
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void set(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        validateValue(value);
        java.util.List<java.lang.String> highSpeedVideoSizes = getHighSpeedVideoSizes(name2);
        highSpeedVideoSizes.clear();
        highSpeedVideoSizes.add(value);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public java.lang.String get(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.List<java.lang.String> all = getAll(name2);
        if (all != null) {
            return (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) all);
        }
        return null;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void append(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        validateValue(value);
        getHighSpeedVideoSizes(name2).add(value);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendAll(io.ktor.util.StringValues stringValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValues, "");
        stringValues.forEach(new kotlin.jvm.functions.Function2() { // from class: io.ktor.util.StringValuesBuilderImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return io.ktor.util.StringValuesBuilderImpl.$r8$lambda$jjYFNANuHazghtkQHe5_BMKr6Kg(io.ktor.util.StringValuesBuilderImpl.this, (java.lang.String) obj, (java.util.List) obj2);
            }
        });
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendMissing(io.ktor.util.StringValues stringValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValues, "");
        stringValues.forEach(new kotlin.jvm.functions.Function2() { // from class: io.ktor.util.StringValuesBuilderImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return io.ktor.util.StringValuesBuilderImpl.$r8$lambda$zJURj8es02TlK0Yq7e9SbY6OZK8(io.ktor.util.StringValuesBuilderImpl.this, (java.lang.String) obj, (java.util.List) obj2);
            }
        });
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendAll(java.lang.String name2, java.lang.Iterable<java.lang.String> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        java.util.List<java.lang.String> highSpeedVideoSizes = getHighSpeedVideoSizes(name2);
        java.util.Iterator<java.lang.String> it = values.iterator();
        while (it.hasNext()) {
            validateValue(it.next());
        }
        kotlin.collections.CollectionsKt.addAll(highSpeedVideoSizes, values);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendMissing(java.lang.String name2, java.lang.Iterable<java.lang.String> values) {
        java.util.Set emptySet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        java.util.List<java.lang.String> list = this.values.get(name2);
        if (list == null || (emptySet = kotlin.collections.CollectionsKt.toSet(list)) == null) {
            emptySet = kotlin.collections.SetsKt.emptySet();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : values) {
            if (!emptySet.contains(str)) {
                arrayList.add(str);
            }
        }
        appendAll(name2, arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void remove(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        this.values.remove(name2);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void removeKeysWithNoEntries() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.values;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
            if (entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            remove((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
        }
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean remove(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.List<java.lang.String> list = this.values.get(name2);
        if (list != null) {
            return list.remove(value);
        }
        return false;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void clear() {
        this.values.clear();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public io.ktor.util.StringValues build() {
        return new io.ktor.util.StringValuesImpl(this.caseInsensitiveName, this.values);
    }

    private final java.util.List<java.lang.String> getHighSpeedVideoSizes(java.lang.String p0) {
        java.util.List<java.lang.String> list = this.values.get(p0);
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        validateName(p0);
        this.values.put(p0, arrayList);
        return arrayList;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jjYFNANuHazghtkQHe5_BMKr6Kg(io.ktor.util.StringValuesBuilderImpl stringValuesBuilderImpl, java.lang.String str, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        stringValuesBuilderImpl.appendAll(str, list);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zJURj8es02TlK0Yq7e9SbY6OZK8(io.ktor.util.StringValuesBuilderImpl stringValuesBuilderImpl, java.lang.String str, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        stringValuesBuilderImpl.appendMissing(str, list);
        return kotlin.Unit.INSTANCE;
    }

    public void validateValue(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
    }

    public void validateName(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringValuesBuilderImpl() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }
}
