package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00130\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012"}, d2 = {"Lio/ktor/http/cio/CIOHeaders;", "Lio/ktor/http/Headers;", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "<init>", "(Lio/ktor/http/cio/HttpHeadersMap;)V", "", "", "names", "()Ljava/util/Set;", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "isEmpty", "()Z", "", "entries", "Camera2StreamConfigurationMap", "Lio/ktor/http/cio/HttpHeadersMap;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor", "getCaseInsensitiveName", "caseInsensitiveName", "Entry"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CIOHeaders implements io.ktor.http.Headers {
    private final io.ktor.http.cio.HttpHeadersMap Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    @Override // io.ktor.util.StringValues
    public final boolean getCaseInsensitiveName() {
        return true;
    }

    public CIOHeaders(io.ktor.http.cio.HttpHeadersMap httpHeadersMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpHeadersMap, "");
        this.Camera2StreamConfigurationMap = httpHeadersMap;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.cio.CIOHeaders$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return io.ktor.http.cio.CIOHeaders.$r8$lambda$O5sKthA4hFmdLFrS05cXnpw21Rk(io.ktor.http.cio.CIOHeaders.this);
            }
        });
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(java.lang.String str) {
        return io.ktor.http.Headers.DefaultImpls.contains(this, str);
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(java.lang.String str, java.lang.String str2) {
        return io.ktor.http.Headers.DefaultImpls.contains(this, str, str2);
    }

    @Override // io.ktor.util.StringValues
    public final void forEach(kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit> function2) {
        io.ktor.http.Headers.DefaultImpls.forEach(this, function2);
    }

    @Override // io.ktor.util.StringValues
    public final java.lang.String get(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.CharSequence charSequence = this.Camera2StreamConfigurationMap.get(name2);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public final java.util.List<java.lang.String> getAll(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.List<java.lang.String> list = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(this.Camera2StreamConfigurationMap.getAll(name2), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.cio.CIOHeaders$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.http.cio.CIOHeaders.m23359$r8$lambda$BlSfYyvX4uRWWl8sna44j3uGg((java.lang.CharSequence) obj);
            }
        }));
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    @Override // io.ktor.util.StringValues
    public final boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.getSize() == 0;
    }

    @Override // io.ktor.util.StringValues
    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return kotlin.sequences.SequencesKt.toSet(kotlin.sequences.SequencesKt.map(this.Camera2StreamConfigurationMap.offsets(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.cio.CIOHeaders$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.http.cio.CIOHeaders.$r8$lambda$2s4045n7NS36ApYsijKoUqJrVWI(io.ktor.http.cio.CIOHeaders.this, ((java.lang.Integer) obj).intValue());
            }
        }));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lio/ktor/http/cio/CIOHeaders$Entry;", "", "", "", "", "p0", "<init>", "(Lio/ktor/http/cio/CIOHeaders;I)V", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class Entry implements java.util.Map.Entry<java.lang.String, java.util.List<? extends java.lang.String>>, kotlin.jvm.internal.markers.KMappedMarker {
        private final int getHighSpeedVideoSizes;

        public Entry(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        @Override // java.util.Map.Entry
        public final /* synthetic */ java.lang.String getKey() {
            return io.ktor.http.cio.CIOHeaders.this.Camera2StreamConfigurationMap.nameAtOffset(this.getHighSpeedVideoSizes).toString();
        }

        @Override // java.util.Map.Entry
        public final /* synthetic */ java.util.List<? extends java.lang.String> getValue() {
            return kotlin.collections.CollectionsKt.listOf(io.ktor.http.cio.CIOHeaders.this.Camera2StreamConfigurationMap.valueAtOffset(this.getHighSpeedVideoSizes).toString());
        }

        @Override // java.util.Map.Entry
        public final /* synthetic */ java.util.List<? extends java.lang.String> setValue(java.util.List<? extends java.lang.String> list) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static /* synthetic */ io.ktor.http.cio.CIOHeaders.Entry $r8$lambda$2s4045n7NS36ApYsijKoUqJrVWI(io.ktor.http.cio.CIOHeaders cIOHeaders, int i) {
        return cIOHeaders.new Entry(i);
    }

    /* renamed from: $r8$lambda$BlSfY--yvX4uRWWl8sna44j3uGg, reason: not valid java name */
    public static /* synthetic */ java.lang.String m23359$r8$lambda$BlSfYyvX4uRWWl8sna44j3uGg(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return charSequence.toString();
    }

    public static /* synthetic */ java.util.LinkedHashSet $r8$lambda$O5sKthA4hFmdLFrS05cXnpw21Rk(io.ktor.http.cio.CIOHeaders cIOHeaders) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(cIOHeaders.Camera2StreamConfigurationMap.getSize());
        java.util.Iterator<java.lang.Integer> it = cIOHeaders.Camera2StreamConfigurationMap.offsets().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(cIOHeaders.Camera2StreamConfigurationMap.nameAtOffset(it.next().intValue()).toString());
        }
        return linkedHashSet;
    }

    @Override // io.ktor.util.StringValues
    public final java.util.Set<java.lang.String> names() {
        return (java.util.Set) this.getHighSpeedVideoFpsRangesFor.getValue();
    }
}
