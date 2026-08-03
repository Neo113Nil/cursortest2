package okio;

/* compiled from: TypedOptions.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u0016*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0001\u0016B\u001b\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokio/TypedOptions;", "T", "", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "options", "Lokio/Options;", "(Ljava/util/List;Lokio/Options;)V", "getList$okio", "()Ljava/util/List;", "getOptions$okio", "()Lokio/Options;", "size", "", "getSize", "()I", "get", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TypedOptions<T> extends kotlin.collections.AbstractList<T> implements java.util.RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okio.TypedOptions.Companion INSTANCE = new okio.TypedOptions.Companion(null);
    private final java.util.List<T> list;
    private final okio.Options options;

    @kotlin.jvm.JvmStatic
    public static final <T> okio.TypedOptions<T> of(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, ? extends okio.ByteString> function1) {
        return INSTANCE.of(iterable, function1);
    }

    /* renamed from: getOptions$okio, reason: from getter */
    public final okio.Options getOptions() {
        return this.options;
    }

    public TypedOptions(java.util.List<? extends T> list, okio.Options options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        java.util.List<T> list2 = kotlin.collections.CollectionsKt.toList(list);
        this.list = list2;
        if (list2.size() != options.size()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final java.util.List<T> getList$okio() {
        return this.list;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.list.size();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int index) {
        return this.list.get(index);
    }

    /* compiled from: TypedOptions.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\n0\tH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lokio/TypedOptions$Companion;", "", "()V", "of", "Lokio/TypedOptions;", "T", "values", "", "encode", "Lkotlin/Function1;", "Lokio/ByteString;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final <T> okio.TypedOptions<T> of(java.lang.Iterable<? extends T> values, kotlin.jvm.functions.Function1<? super T, ? extends okio.ByteString> encode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encode, "encode");
            java.util.List list = kotlin.collections.CollectionsKt.toList(values);
            okio.Options.Companion companion = okio.Options.INSTANCE;
            int size = list.size();
            okio.ByteString[] byteStringArr = new okio.ByteString[size];
            for (int i = 0; i < size; i++) {
                byteStringArr[i] = encode.invoke((java.lang.Object) list.get(i));
            }
            return new okio.TypedOptions<>(list, companion.of(byteStringArr));
        }
    }
}
