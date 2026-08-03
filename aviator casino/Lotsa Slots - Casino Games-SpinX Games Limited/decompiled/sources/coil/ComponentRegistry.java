package coil;

/* compiled from: ComponentRegistry.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001*B«\u0001\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00120\u0010\u0005\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b0\u00060\u0003\u0012(\u0010\t\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b0\u00060\u0003\u0012(\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b0\u00060\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u0016\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bJ8\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020 H\u0007J8\u0010$\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020 \u0018\u00010\u00062\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020 H\u0007J\u0006\u0010(\u001a\u00020)R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R;\u0010\u0005\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b0\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R3\u0010\t\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b0\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R3\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b0\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006+"}, d2 = {"Lcoil/ComponentRegistry;", "", "interceptors", "", "Lcoil/intercept/Interceptor;", "mappers", "Lkotlin/Pair;", "Lcoil/map/Mapper;", "Ljava/lang/Class;", "keyers", "Lcoil/key/Keyer;", "fetcherFactories", "Lcoil/fetch/Fetcher$Factory;", "decoderFactories", "Lcoil/decode/Decoder$Factory;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "getInterceptors", "()Ljava/util/List;", "getMappers", "getKeyers", "getFetcherFactories", "getDecoderFactories", "map", "data", "options", "Lcoil/request/Options;", com.ironsource.X3.i.W, "", "newFetcher", "Lcoil/fetch/Fetcher;", "", "imageLoader", "Lcoil/ImageLoader;", "startIndex", "newDecoder", "Lcoil/decode/Decoder;", "result", "Lcoil/fetch/SourceResult;", "newBuilder", "Lcoil/ComponentRegistry$Builder;", "Builder", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComponentRegistry {
    private final java.util.List<coil.decode.Decoder.Factory> decoderFactories;
    private final java.util.List<kotlin.Pair<coil.fetch.Fetcher.Factory<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> fetcherFactories;
    private final java.util.List<coil.intercept.Interceptor> interceptors;
    private final java.util.List<kotlin.Pair<coil.key.Keyer<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> keyers;
    private final java.util.List<kotlin.Pair<coil.map.Mapper<? extends java.lang.Object, ? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> mappers;

    public /* synthetic */ ComponentRegistry(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public final kotlin.Pair<coil.decode.Decoder, java.lang.Integer> newDecoder(coil.fetch.SourceResult sourceResult, coil.request.Options options, coil.ImageLoader imageLoader) {
        return newDecoder$default(this, sourceResult, options, imageLoader, 0, 8, null);
    }

    public final kotlin.Pair<coil.fetch.Fetcher, java.lang.Integer> newFetcher(java.lang.Object obj, coil.request.Options options, coil.ImageLoader imageLoader) {
        return newFetcher$default(this, obj, options, imageLoader, 0, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ComponentRegistry(java.util.List<? extends coil.intercept.Interceptor> list, java.util.List<? extends kotlin.Pair<? extends coil.map.Mapper<? extends java.lang.Object, ? extends java.lang.Object>, ? extends java.lang.Class<? extends java.lang.Object>>> list2, java.util.List<? extends kotlin.Pair<? extends coil.key.Keyer<? extends java.lang.Object>, ? extends java.lang.Class<? extends java.lang.Object>>> list3, java.util.List<? extends kotlin.Pair<? extends coil.fetch.Fetcher.Factory<? extends java.lang.Object>, ? extends java.lang.Class<? extends java.lang.Object>>> list4, java.util.List<? extends coil.decode.Decoder.Factory> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.fetcherFactories = list4;
        this.decoderFactories = list5;
    }

    public final java.util.List<coil.intercept.Interceptor> getInterceptors() {
        return this.interceptors;
    }

    public final java.util.List<kotlin.Pair<coil.map.Mapper<? extends java.lang.Object, ? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> getMappers() {
        return this.mappers;
    }

    public final java.util.List<kotlin.Pair<coil.key.Keyer<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> getKeyers() {
        return this.keyers;
    }

    public final java.util.List<kotlin.Pair<coil.fetch.Fetcher.Factory<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> getFetcherFactories() {
        return this.fetcherFactories;
    }

    public final java.util.List<coil.decode.Decoder.Factory> getDecoderFactories() {
        return this.decoderFactories;
    }

    public ComponentRegistry() {
        this(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList());
    }

    public final java.lang.Object map(java.lang.Object data, coil.request.Options options) {
        java.util.List<kotlin.Pair<coil.map.Mapper<? extends java.lang.Object, ? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> list = this.mappers;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kotlin.Pair<coil.map.Mapper<? extends java.lang.Object, ? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> pair = list.get(i);
            coil.map.Mapper<? extends java.lang.Object, ? extends java.lang.Object> component1 = pair.component1();
            if (pair.component2().isAssignableFrom(data.getClass())) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(component1, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                java.lang.Object map = component1.map(data, options);
                if (map != null) {
                    data = map;
                }
            }
        }
        return data;
    }

    public final java.lang.String key(java.lang.Object data, coil.request.Options options) {
        java.util.List<kotlin.Pair<coil.key.Keyer<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> list = this.keyers;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kotlin.Pair<coil.key.Keyer<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> pair = list.get(i);
            coil.key.Keyer<? extends java.lang.Object> component1 = pair.component1();
            if (pair.component2().isAssignableFrom(data.getClass())) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(component1, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                java.lang.String key = component1.key(data, options);
                if (key != null) {
                    return key;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ kotlin.Pair newFetcher$default(coil.ComponentRegistry componentRegistry, java.lang.Object obj, coil.request.Options options, coil.ImageLoader imageLoader, int i, int i2, java.lang.Object obj2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return componentRegistry.newFetcher(obj, options, imageLoader, i);
    }

    public final kotlin.Pair<coil.fetch.Fetcher, java.lang.Integer> newFetcher(java.lang.Object data, coil.request.Options options, coil.ImageLoader imageLoader, int startIndex) {
        int size = this.fetcherFactories.size();
        while (startIndex < size) {
            kotlin.Pair<coil.fetch.Fetcher.Factory<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> pair = this.fetcherFactories.get(startIndex);
            coil.fetch.Fetcher.Factory<? extends java.lang.Object> component1 = pair.component1();
            if (pair.component2().isAssignableFrom(data.getClass())) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(component1, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                coil.fetch.Fetcher create = component1.create(data, options, imageLoader);
                if (create != null) {
                    return kotlin.TuplesKt.to(create, java.lang.Integer.valueOf(startIndex));
                }
            }
            startIndex++;
        }
        return null;
    }

    public static /* synthetic */ kotlin.Pair newDecoder$default(coil.ComponentRegistry componentRegistry, coil.fetch.SourceResult sourceResult, coil.request.Options options, coil.ImageLoader imageLoader, int i, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return componentRegistry.newDecoder(sourceResult, options, imageLoader, i);
    }

    public final kotlin.Pair<coil.decode.Decoder, java.lang.Integer> newDecoder(coil.fetch.SourceResult result, coil.request.Options options, coil.ImageLoader imageLoader, int startIndex) {
        int size = this.decoderFactories.size();
        while (startIndex < size) {
            coil.decode.Decoder create = this.decoderFactories.get(startIndex).create(result, options, imageLoader);
            if (create != null) {
                return kotlin.TuplesKt.to(create, java.lang.Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    public final coil.ComponentRegistry.Builder newBuilder() {
        return new coil.ComponentRegistry.Builder(this);
    }

    /* compiled from: ComponentRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\tJ'\u0010\u001a\u001a\u00020\u0000\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u00012\u0010\u0010\u001d\u001a\f\u0012\u0004\u0012\u0002H\u001c\u0012\u0002\b\u00030\u000eH\u0086\bJ0\u0010\u001a\u001a\u00020\u0000\"\b\b\u0000\u0010\u001c*\u00020\u00012\u0010\u0010\u001d\u001a\f\u0012\u0004\u0012\u0002H\u001c\u0012\u0002\b\u00030\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u000fJ#\u0010\u001a\u001a\u00020\u0000\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u0012H\u0086\bJ,\u0010\u001a\u001a\u00020\u0000\"\b\b\u0000\u0010\u001c*\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u000fJ#\u0010\u001a\u001a\u00020\u0000\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001c0\u0015H\u0086\bJ,\u0010\u001a\u001a\u00020\u0000\"\b\b\u0000\u0010\u001c*\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001c0\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u000fJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0018J\u0006\u0010!\u001a\u00020\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR:\u0010\f\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u000e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f0\r0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR6\u0010\u0011\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f0\r0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR6\u0010\u0014\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f0\r0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000b¨\u0006\""}, d2 = {"Lcoil/ComponentRegistry$Builder;", "", "<init>", "()V", "registry", "Lcoil/ComponentRegistry;", "(Lcoil/ComponentRegistry;)V", "interceptors", "", "Lcoil/intercept/Interceptor;", "getInterceptors$coil_base_release", "()Ljava/util/List;", "mappers", "Lkotlin/Pair;", "Lcoil/map/Mapper;", "Ljava/lang/Class;", "getMappers$coil_base_release", "keyers", "Lcoil/key/Keyer;", "getKeyers$coil_base_release", "fetcherFactories", "Lcoil/fetch/Fetcher$Factory;", "getFetcherFactories$coil_base_release", "decoderFactories", "Lcoil/decode/Decoder$Factory;", "getDecoderFactories$coil_base_release", "add", "interceptor", "T", "mapper", "type", "keyer", "factory", "build", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private final java.util.List<coil.decode.Decoder.Factory> decoderFactories;
        private final java.util.List<kotlin.Pair<coil.fetch.Fetcher.Factory<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> fetcherFactories;
        private final java.util.List<coil.intercept.Interceptor> interceptors;
        private final java.util.List<kotlin.Pair<coil.key.Keyer<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> keyers;
        private final java.util.List<kotlin.Pair<coil.map.Mapper<? extends java.lang.Object, ?>, java.lang.Class<? extends java.lang.Object>>> mappers;

        public final java.util.List<coil.intercept.Interceptor> getInterceptors$coil_base_release() {
            return this.interceptors;
        }

        public final java.util.List<kotlin.Pair<coil.map.Mapper<? extends java.lang.Object, ?>, java.lang.Class<? extends java.lang.Object>>> getMappers$coil_base_release() {
            return this.mappers;
        }

        public final java.util.List<kotlin.Pair<coil.key.Keyer<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> getKeyers$coil_base_release() {
            return this.keyers;
        }

        public final java.util.List<kotlin.Pair<coil.fetch.Fetcher.Factory<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> getFetcherFactories$coil_base_release() {
            return this.fetcherFactories;
        }

        public final java.util.List<coil.decode.Decoder.Factory> getDecoderFactories$coil_base_release() {
            return this.decoderFactories;
        }

        public Builder() {
            this.interceptors = new java.util.ArrayList();
            this.mappers = new java.util.ArrayList();
            this.keyers = new java.util.ArrayList();
            this.fetcherFactories = new java.util.ArrayList();
            this.decoderFactories = new java.util.ArrayList();
        }

        public Builder(coil.ComponentRegistry componentRegistry) {
            this.interceptors = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) componentRegistry.getInterceptors());
            this.mappers = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) componentRegistry.getMappers());
            this.keyers = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) componentRegistry.getKeyers());
            this.fetcherFactories = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) componentRegistry.getFetcherFactories());
            this.decoderFactories = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) componentRegistry.getDecoderFactories());
        }

        public final coil.ComponentRegistry.Builder add(coil.intercept.Interceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public final /* synthetic */ <T> coil.ComponentRegistry.Builder add(coil.map.Mapper<T, ?> mapper) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return add(mapper, java.lang.Object.class);
        }

        public final <T> coil.ComponentRegistry.Builder add(coil.map.Mapper<T, ?> mapper, java.lang.Class<T> type) {
            this.mappers.add(kotlin.TuplesKt.to(mapper, type));
            return this;
        }

        public final /* synthetic */ <T> coil.ComponentRegistry.Builder add(coil.key.Keyer<T> keyer) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return add(keyer, java.lang.Object.class);
        }

        public final <T> coil.ComponentRegistry.Builder add(coil.key.Keyer<T> keyer, java.lang.Class<T> type) {
            this.keyers.add(kotlin.TuplesKt.to(keyer, type));
            return this;
        }

        public final /* synthetic */ <T> coil.ComponentRegistry.Builder add(coil.fetch.Fetcher.Factory<T> factory) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return add(factory, java.lang.Object.class);
        }

        public final <T> coil.ComponentRegistry.Builder add(coil.fetch.Fetcher.Factory<T> factory, java.lang.Class<T> type) {
            this.fetcherFactories.add(kotlin.TuplesKt.to(factory, type));
            return this;
        }

        public final coil.ComponentRegistry.Builder add(coil.decode.Decoder.Factory factory) {
            this.decoderFactories.add(factory);
            return this;
        }

        public final coil.ComponentRegistry build() {
            return new coil.ComponentRegistry(coil.util.Collections.toImmutableList(this.interceptors), coil.util.Collections.toImmutableList(this.mappers), coil.util.Collections.toImmutableList(this.keyers), coil.util.Collections.toImmutableList(this.fetcherFactories), coil.util.Collections.toImmutableList(this.decoderFactories), null);
        }
    }
}
