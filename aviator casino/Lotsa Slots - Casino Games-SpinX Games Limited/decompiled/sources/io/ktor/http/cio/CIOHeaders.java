package io.ktor.http.cio;

/* compiled from: CIOHeaders.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00130\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001c"}, d2 = {"Lio/ktor/http/cio/CIOHeaders;", "Lio/ktor/http/Headers;", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "<init>", "(Lio/ktor/http/cio/HttpHeadersMap;)V", "", "", "names", "()Ljava/util/Set;", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "isEmpty", "()Z", "", com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Lio/ktor/http/cio/HttpHeadersMap;", "names$delegate", "Lkotlin/Lazy;", "getNames", "getCaseInsensitiveName", "caseInsensitiveName", "Entry", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CIOHeaders implements io.ktor.http.Headers {
    private final io.ktor.http.cio.HttpHeadersMap headers;

    /* renamed from: names$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy names;

    @Override // io.ktor.util.StringValues
    public boolean getCaseInsensitiveName() {
        return true;
    }

    public CIOHeaders(io.ktor.http.cio.HttpHeadersMap headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        this.headers = headers;
        this.names = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.cio.CIOHeaders$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.LinkedHashSet names_delegate$lambda$1;
                names_delegate$lambda$1 = io.ktor.http.cio.CIOHeaders.names_delegate$lambda$1(io.ktor.http.cio.CIOHeaders.this);
                return names_delegate$lambda$1;
            }
        });
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String str) {
        return io.ktor.http.Headers.DefaultImpls.contains(this, str);
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String str, java.lang.String str2) {
        return io.ktor.http.Headers.DefaultImpls.contains(this, str, str2);
    }

    @Override // io.ktor.util.StringValues
    public void forEach(kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit> function2) {
        io.ktor.http.Headers.DefaultImpls.forEach(this, function2);
    }

    private final java.util.Set<java.lang.String> getNames() {
        return (java.util.Set) this.names.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.LinkedHashSet names_delegate$lambda$1(io.ktor.http.cio.CIOHeaders cIOHeaders) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(cIOHeaders.headers.getSize());
        java.util.Iterator<java.lang.Integer> it = cIOHeaders.headers.offsets().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(cIOHeaders.headers.nameAtOffset(it.next().intValue()).toString());
        }
        return linkedHashSet;
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.lang.String> names() {
        return getNames();
    }

    @Override // io.ktor.util.StringValues
    public java.lang.String get(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.lang.CharSequence charSequence = this.headers.get(name);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getAll$lambda$2(java.lang.CharSequence it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    @Override // io.ktor.util.StringValues
    public java.util.List<java.lang.String> getAll(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.util.List<java.lang.String> list = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(this.headers.getAll(name), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.cio.CIOHeaders$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.String all$lambda$2;
                all$lambda$2 = io.ktor.http.cio.CIOHeaders.getAll$lambda$2((java.lang.CharSequence) obj);
                return all$lambda$2;
            }
        }));
        if (!list.isEmpty()) {
            return list;
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return this.headers.getSize() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.http.cio.CIOHeaders.Entry entries$lambda$4(io.ktor.http.cio.CIOHeaders cIOHeaders, int i) {
        return cIOHeaders.new Entry(i);
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return kotlin.sequences.SequencesKt.toSet(kotlin.sequences.SequencesKt.map(this.headers.offsets(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.cio.CIOHeaders$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                io.ktor.http.cio.CIOHeaders.Entry entries$lambda$4;
                entries$lambda$4 = io.ktor.http.cio.CIOHeaders.entries$lambda$4(io.ktor.http.cio.CIOHeaders.this, ((java.lang.Integer) obj).intValue());
                return entries$lambda$4;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CIOHeaders.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/http/cio/CIOHeaders$Entry;", "", "", "", "", "offset", "<init>", "(Lio/ktor/http/cio/CIOHeaders;I)V", "I", "getKey", "()Ljava/lang/String;", com.ironsource.X3.i.W, "getValue", "()Ljava/util/List;", "value", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class Entry implements java.util.Map.Entry<java.lang.String, java.util.List<? extends java.lang.String>>, kotlin.jvm.internal.markers.KMappedMarker {
        private final int offset;

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.util.List<? extends java.lang.String> setValue(java.util.List<? extends java.lang.String> list) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: setValue, reason: avoid collision after fix types in other method */
        public java.util.List<java.lang.String> setValue2(java.util.List<java.lang.String> list) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Entry(int i) {
            this.offset = i;
        }

        @Override // java.util.Map.Entry
        public java.lang.String getKey() {
            return io.ktor.http.cio.CIOHeaders.this.headers.nameAtOffset(this.offset).toString();
        }

        @Override // java.util.Map.Entry
        public java.util.List<? extends java.lang.String> getValue() {
            return kotlin.collections.CollectionsKt.listOf(io.ktor.http.cio.CIOHeaders.this.headers.valueAtOffset(this.offset).toString());
        }
    }
}
