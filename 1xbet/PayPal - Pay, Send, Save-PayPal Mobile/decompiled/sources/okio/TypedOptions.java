package okio;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u0019B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lokio/TypedOptions;", "", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "", "list", "Lokio/Options;", "options", "<init>", "(Ljava/util/List;Lokio/Options;)V", "", "index", "get", "(I)Ljava/lang/Object;", "Lokio/Options;", "getOptions$okio", "()Lokio/Options;", "Ljava/util/List;", "getList$okio", "()Ljava/util/List;", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TypedOptions<T> extends kotlin.collections.AbstractList<T> implements java.util.RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okio.TypedOptions.Companion INSTANCE = new okio.TypedOptions.Companion(null);
    private final java.util.List<T> list;
    private final okio.Options options;

    public TypedOptions(java.util.List<? extends T> list, okio.Options options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        this.options = options;
        java.util.List<T> list2 = kotlin.collections.CollectionsKt.toList(list);
        this.list = list2;
        if (list2.size() != options.size()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: getOptions$okio, reason: from getter */
    public final okio.Options getOptions() {
        return this.options;
    }

    public final java.util.List<T> getList$okio() {
        return this.list;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.list.size();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final T get(int index) {
        return this.list.get(index);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lokio/TypedOptions$Companion;", "", "<init>", "()V", "T", "", "values", "Lkotlin/Function1;", "Lokio/ByteString;", "encode", "Lokio/TypedOptions;", "of", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lokio/TypedOptions;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final <T> okio.TypedOptions<T> of(java.lang.Iterable<? extends T> values, kotlin.jvm.functions.Function1<? super T, ? extends okio.ByteString> encode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encode, "");
            java.util.List list = kotlin.collections.CollectionsKt.toList(values);
            okio.Options.Companion companion = okio.Options.INSTANCE;
            int size = list.size();
            okio.ByteString[] byteStringArr = new okio.ByteString[size];
            for (int i = 0; i < size; i++) {
                byteStringArr[i] = encode.invoke((java.lang.Object) list.get(i));
            }
            return new okio.TypedOptions<>(list, companion.of(byteStringArr));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final <T> okio.TypedOptions<T> of(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, ? extends okio.ByteString> function1) {
        return INSTANCE.of(iterable, function1);
    }
}
