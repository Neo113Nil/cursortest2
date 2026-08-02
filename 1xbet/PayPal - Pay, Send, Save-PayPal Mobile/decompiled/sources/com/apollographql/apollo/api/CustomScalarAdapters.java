package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0002./BY\b\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b \u0010!R\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\"\u0010!R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0006\u0012\u0002\b\u00030*8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarAdapters;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "", "", "Lcom/apollographql/apollo/api/Adapter;", "p0", "", "p1", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "p2", "", "Lcom/apollographql/apollo/api/Error;", "p3", "", "p4", "<init>", "(Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Z)V", "", "T", "name", "adapterFor", "(Ljava/lang/String;)Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CustomScalarType;", "customScalar", "responseAdapterFor", "(Lcom/apollographql/apollo/api/CustomScalarType;)Lcom/apollographql/apollo/api/Adapter;", "path", "firstErrorStartingWith", "(Ljava/util/List;)Lcom/apollographql/apollo/api/Error;", "Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "newBuilder", "()Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "falseVariables", "Ljava/util/Set;", "deferredFragmentIdentifiers", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Ljava/util/Map;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "Key", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CustomScalarAdapters implements com.apollographql.apollo.api.ExecutionContext.Element {
    public final java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> deferredFragmentIdentifiers;
    public final java.util.List<com.apollographql.apollo.api.Error> errors;
    public final java.util.Set<java.lang.String> falseVariables;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Map<java.lang.String, com.apollographql.apollo.api.Adapter<?>> getHighSpeedVideoSizes;

    /* renamed from: Key, reason: from kotlin metadata */
    public static final com.apollographql.apollo.api.CustomScalarAdapters.Companion INSTANCE = new com.apollographql.apollo.api.CustomScalarAdapters.Companion(null);
    public static final com.apollographql.apollo.api.CustomScalarAdapters Empty = new com.apollographql.apollo.api.CustomScalarAdapters.Builder().build();
    public static final com.apollographql.apollo.api.CustomScalarAdapters PassThrough = new com.apollographql.apollo.api.CustomScalarAdapters.Builder().unsafe(true).build();

    /* JADX WARN: Multi-variable type inference failed */
    private CustomScalarAdapters(java.util.Map<java.lang.String, ? extends com.apollographql.apollo.api.Adapter<?>> map, java.util.Set<java.lang.String> set, java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> set2, java.util.List<com.apollographql.apollo.api.Error> list, boolean z) {
        this.falseVariables = set;
        this.deferredFragmentIdentifiers = set2;
        this.errors = list;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = map;
    }

    public final <T> com.apollographql.apollo.api.Adapter<T> adapterFor(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return (com.apollographql.apollo.api.Adapter) this.getHighSpeedVideoSizes.get(name2);
    }

    public final <T> com.apollographql.apollo.api.Adapter<T> responseAdapterFor(com.apollographql.apollo.api.CustomScalarType customScalar) {
        com.apollographql.apollo.api.PassThroughAdapter passThroughAdapter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalar, "");
        if (this.getHighSpeedVideoSizes.get(customScalar.getName()) != null) {
            passThroughAdapter = (com.apollographql.apollo.api.Adapter<T>) this.getHighSpeedVideoSizes.get(customScalar.getName());
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(customScalar.getClassName(), "com.apollographql.apollo.api.Upload")) {
            passThroughAdapter = (com.apollographql.apollo.api.Adapter<T>) com.apollographql.apollo.api.Adapters.UploadAdapter;
        } else if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"kotlin.String", "java.lang.String"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (com.apollographql.apollo.api.Adapter<T>) com.apollographql.apollo.api.Adapters.StringAdapter;
        } else if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"kotlin.Boolean", "java.lang.Boolean"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (com.apollographql.apollo.api.Adapter<T>) com.apollographql.apollo.api.Adapters.BooleanAdapter;
        } else if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"kotlin.Int", "java.lang.Int"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (com.apollographql.apollo.api.Adapter<T>) com.apollographql.apollo.api.Adapters.IntAdapter;
        } else if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"kotlin.Double", "java.lang.Double"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (com.apollographql.apollo.api.Adapter<T>) com.apollographql.apollo.api.Adapters.DoubleAdapter;
        } else if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"kotlin.Long", "java.lang.Long"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (com.apollographql.apollo.api.Adapter<T>) com.apollographql.apollo.api.Adapters.LongAdapter;
        } else if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"kotlin.Float", "java.lang.Float"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (com.apollographql.apollo.api.Adapter<T>) com.apollographql.apollo.api.Adapters.FloatAdapter;
        } else if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"kotlin.Any", "java.lang.Object"}).contains(customScalar.getClassName())) {
            passThroughAdapter = (com.apollographql.apollo.api.Adapter<T>) com.apollographql.apollo.api.Adapters.AnyAdapter;
        } else {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't map GraphQL type: `");
                sb.append(customScalar.getName());
                sb.append("` to: `");
                sb.append(customScalar.getClassName());
                sb.append("`. Did you forget to add a scalar Adapter?");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            passThroughAdapter = new com.apollographql.apollo.api.PassThroughAdapter();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(passThroughAdapter, "");
        return passThroughAdapter;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final com.apollographql.apollo.api.ExecutionContext.Key<?> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\b\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarAdapters$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "<init>", "()V", "Empty", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "PassThrough", "getPassThrough$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.api.CustomScalarAdapters$Key, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements com.apollographql.apollo.api.ExecutionContext.Key<com.apollographql.apollo.api.CustomScalarAdapters> {
        public static /* synthetic */ void getPassThrough$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final com.apollographql.apollo.api.Error firstErrorStartingWith(java.util.List<? extends java.lang.Object> path) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        java.util.List<com.apollographql.apollo.api.Error> list = this.errors;
        java.lang.Object obj = null;
        if (list == null) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.List<java.lang.Object> path2 = ((com.apollographql.apollo.api.Error) next).getPath();
            if (path2 != null) {
                int size = path.size();
                while (i < size) {
                    int i2 = i - 1;
                    i = (i2 < path2.size() && kotlin.jvm.internal.Intrinsics.areEqual(path.get(i), path2.get(i2))) ? i + 1 : 1;
                }
                obj = next;
                break loop0;
            }
        }
        return (com.apollographql.apollo.api.Error) obj;
    }

    public final com.apollographql.apollo.api.CustomScalarAdapters.Builder newBuilder() {
        return new com.apollographql.apollo.api.CustomScalarAdapters.Builder().addAll(this).falseVariables(this.falseVariables).deferredFragmentIdentifiers(this.deferredFragmentIdentifiers);
    }

    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0006\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010\u0003J\r\u0010!\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"R$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "", "<init>", "()V", "", "", "falseVariables", "(Ljava/util/Set;)Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "deferredFragmentIdentifiers", "", "Lcom/apollographql/apollo/api/Error;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "(Ljava/util/List;)Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "T", "name", "Lcom/apollographql/apollo/api/Adapter;", "adapter", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/String;Lcom/apollographql/apollo/api/Adapter;)Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "Lcom/apollographql/apollo/api/CustomScalarType;", "customScalarType", "customScalarAdapter", "(Lcom/apollographql/apollo/api/CustomScalarType;Lcom/apollographql/apollo/api/Adapter;)Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "addAll", "(Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "", "unsafe", "(Z)Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "", "clear", "build", "()Lcom/apollographql/apollo/api/CustomScalarAdapters;", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private final java.util.Map<java.lang.String, com.apollographql.apollo.api.Adapter<?>> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> getHighResolutionOutputSizeshNQ4ISI;
        private java.util.List<com.apollographql.apollo.api.Error> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;

        public final com.apollographql.apollo.api.CustomScalarAdapters.Builder falseVariables(java.util.Set<java.lang.String> falseVariables) {
            this.getHighSpeedVideoFpsRanges = falseVariables;
            return this;
        }

        public final com.apollographql.apollo.api.CustomScalarAdapters.Builder deferredFragmentIdentifiers(java.util.Set<com.apollographql.apollo.api.DeferredFragmentIdentifier> deferredFragmentIdentifiers) {
            this.getHighResolutionOutputSizeshNQ4ISI = deferredFragmentIdentifiers;
            return this;
        }

        public final com.apollographql.apollo.api.CustomScalarAdapters.Builder errors(java.util.List<com.apollographql.apollo.api.Error> errors) {
            this.getHighSpeedVideoFpsRangesFor = errors;
            return this;
        }

        public final <T> com.apollographql.apollo.api.CustomScalarAdapters.Builder add(java.lang.String name2, com.apollographql.apollo.api.Adapter<T> adapter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
            this.Camera2StreamConfigurationMap.put(name2, adapter);
            return this;
        }

        public final <T> com.apollographql.apollo.api.CustomScalarAdapters.Builder add(com.apollographql.apollo.api.CustomScalarType customScalarType, com.apollographql.apollo.api.Adapter<T> customScalarAdapter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapter, "");
            this.Camera2StreamConfigurationMap.put(customScalarType.getName(), customScalarAdapter);
            return this;
        }

        public final com.apollographql.apollo.api.CustomScalarAdapters.Builder addAll(com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            this.Camera2StreamConfigurationMap.putAll(customScalarAdapters.getHighSpeedVideoSizes);
            return this;
        }

        public final com.apollographql.apollo.api.CustomScalarAdapters.Builder unsafe(boolean unsafe) {
            this.getHighSpeedVideoSizes = unsafe;
            return this;
        }

        public final void clear() {
            this.Camera2StreamConfigurationMap.clear();
        }

        public final com.apollographql.apollo.api.CustomScalarAdapters build() {
            return new com.apollographql.apollo.api.CustomScalarAdapters(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null);
        }
    }

    public /* synthetic */ CustomScalarAdapters(java.util.Map map, java.util.Set set, java.util.Set set2, java.util.List list, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map, set, set2, list, z);
    }
}
