package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00170\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J%\u0010!\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010&\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010\"J%\u0010&\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010'\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010*R\u0014\u0010.\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020\r8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0016"}, d2 = {"Lio/ktor/http/UrlDecodedParametersBuilder;", "Lio/ktor/http/ParametersBuilder;", "encodedParametersBuilder", "<init>", "(Lio/ktor/http/ParametersBuilder;)V", "Lio/ktor/http/Parameters;", "build", "()Lio/ktor/http/Parameters;", "", "name", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "contains", "(Ljava/lang/String;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/String;Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "entries", "", "set", "(Ljava/lang/String;Ljava/lang/String;)V", "get", "(Ljava/lang/String;)Ljava/lang/String;", "append", "Lio/ktor/util/StringValues;", "stringValues", "appendAll", "(Lio/ktor/util/StringValues;)V", "", "values", "(Ljava/lang/String;Ljava/lang/Iterable;)V", "appendMissing", "remove", "(Ljava/lang/String;)V", "removeKeysWithNoEntries", "()V", "clear", "Camera2StreamConfigurationMap", "Lio/ktor/http/ParametersBuilder;", "getHighSpeedVideoFpsRanges", "caseInsensitiveName", "Z", "getCaseInsensitiveName"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UrlDecodedParametersBuilder implements io.ktor.http.ParametersBuilder {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.http.ParametersBuilder getHighSpeedVideoFpsRanges;
    private final boolean caseInsensitiveName;

    public UrlDecodedParametersBuilder(io.ktor.http.ParametersBuilder parametersBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parametersBuilder, "");
        this.getHighSpeedVideoFpsRanges = parametersBuilder;
        this.caseInsensitiveName = parametersBuilder.getCaseInsensitiveName();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final io.ktor.http.Parameters build() {
        return io.ktor.http.UrlDecodedParametersBuilderKt.decodeParameters(this.getHighSpeedVideoFpsRanges);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final java.util.List<java.lang.String> getAll(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.List<java.lang.String> all = this.getHighSpeedVideoFpsRanges.getAll(io.ktor.http.CodecsKt.encodeURLParameter$default(name2, false, 1, null));
        if (all == null) {
            return null;
        }
        java.util.List<java.lang.String> list = all;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CodecsKt.decodeURLQueryComponent$default((java.lang.String) it.next(), 0, 0, true, null, 11, null));
        }
        return arrayList;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean contains(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.getHighSpeedVideoFpsRanges.contains(io.ktor.http.CodecsKt.encodeURLParameter$default(name2, false, 1, null));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean contains(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return this.getHighSpeedVideoFpsRanges.contains(io.ktor.http.CodecsKt.encodeURLParameter$default(name2, false, 1, null), io.ktor.http.CodecsKt.encodeURLParameterValue(value));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final java.util.Set<java.lang.String> names() {
        java.util.Set<java.lang.String> names = this.getHighSpeedVideoFpsRanges.names();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(names, 10));
        java.util.Iterator<T> it = names.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CodecsKt.decodeURLQueryComponent$default((java.lang.String) it.next(), 0, 0, false, null, 15, null));
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges.isEmpty();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return io.ktor.http.UrlDecodedParametersBuilderKt.decodeParameters(this.getHighSpeedVideoFpsRanges).entries();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void set(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRanges.set(io.ktor.http.CodecsKt.encodeURLParameter$default(name2, false, 1, null), io.ktor.http.CodecsKt.encodeURLParameterValue(value));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final java.lang.String get(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String str = this.getHighSpeedVideoFpsRanges.get(io.ktor.http.CodecsKt.encodeURLParameter$default(name2, false, 1, null));
        if (str != null) {
            return io.ktor.http.CodecsKt.decodeURLQueryComponent$default(str, 0, 0, true, null, 11, null);
        }
        return null;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void append(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRanges.append(io.ktor.http.CodecsKt.encodeURLParameter$default(name2, false, 1, null), io.ktor.http.CodecsKt.encodeURLParameterValue(value));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendAll(io.ktor.util.StringValues stringValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValues, "");
        io.ktor.http.UrlDecodedParametersBuilderKt.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, stringValues);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendAll(java.lang.String name2, java.lang.Iterable<java.lang.String> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        io.ktor.http.ParametersBuilder parametersBuilder = this.getHighSpeedVideoFpsRanges;
        java.lang.String encodeURLParameter$default = io.ktor.http.CodecsKt.encodeURLParameter$default(name2, false, 1, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(values, 10));
        java.util.Iterator<java.lang.String> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CodecsKt.encodeURLParameterValue(it.next()));
        }
        parametersBuilder.appendAll(encodeURLParameter$default, arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendMissing(io.ktor.util.StringValues stringValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValues, "");
        this.getHighSpeedVideoFpsRanges.appendMissing(io.ktor.http.UrlDecodedParametersBuilderKt.encodeParameters(stringValues).build());
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendMissing(java.lang.String name2, java.lang.Iterable<java.lang.String> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        io.ktor.http.ParametersBuilder parametersBuilder = this.getHighSpeedVideoFpsRanges;
        java.lang.String encodeURLParameter$default = io.ktor.http.CodecsKt.encodeURLParameter$default(name2, false, 1, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(values, 10));
        java.util.Iterator<java.lang.String> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CodecsKt.encodeURLParameterValue(it.next()));
        }
        parametersBuilder.appendMissing(encodeURLParameter$default, arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void remove(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        this.getHighSpeedVideoFpsRanges.remove(io.ktor.http.CodecsKt.encodeURLParameter$default(name2, false, 1, null));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean remove(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return this.getHighSpeedVideoFpsRanges.remove(io.ktor.http.CodecsKt.encodeURLParameter$default(name2, false, 1, null), io.ktor.http.CodecsKt.encodeURLParameterValue(value));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void removeKeysWithNoEntries() {
        this.getHighSpeedVideoFpsRanges.removeKeysWithNoEntries();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void clear() {
        this.getHighSpeedVideoFpsRanges.clear();
    }
}
