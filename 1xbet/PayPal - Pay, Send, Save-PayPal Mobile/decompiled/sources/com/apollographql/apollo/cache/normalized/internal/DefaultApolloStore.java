package com.apollographql.apollo.cache.normalized.internal;

@kotlin.Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0016\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00182\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u001bJC\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020$0#\"\b\b\u0000\u0010\u001d*\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010 \u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J7\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010\u001d*\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J?\u0010.\u001a\u00028\u0000\"\b\b\u0000\u0010\u001d*\u00020+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J)\u00104\u001a\u00028\u0000\"\u0004\b\u0000\u001002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00028\u000001H\u0016¢\u0006\u0004\b4\u00105JN\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\b\b\u0000\u0010\u001d*\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u00106\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b7\u00108JE\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\b\b\u0000\u0010\u001d*\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u00106\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b9\u0010:JV\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\b\b\u0000\u0010\u001d*\u00020+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010;\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b<\u0010=JM\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\b\b\u0000\u0010\u001d*\u00020+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010;\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b>\u0010?JR\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\b\b\u0000\u0010\u001d*\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u00106\u001a\u00028\u00002\n\u0010B\u001a\u00060@j\u0002`A2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u0010H\u0096@¢\u0006\u0004\bC\u0010DJI\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\b\b\u0000\u0010\u001d*\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u00106\u001a\u00028\u00002\n\u0010B\u001a\u00060@j\u0002`A2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bE\u0010FJ*\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010B\u001a\u00060@j\u0002`A2\u0006\u0010\u000e\u001a\u00020\u0010H\u0096@¢\u0006\u0004\bG\u0010HJ!\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010B\u001a\u00060@j\u0002`AH\u0016¢\u0006\u0004\bI\u0010JJ+\u0010L\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030K\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020$0#0#H\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\rH\u0016¢\u0006\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010WR&\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0X8\u0017X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0015\u0010_\u001a\u00020]8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bR\u0010^R\u0014\u0010S\u001a\u00020`8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b_\u0010a"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/internal/DefaultApolloStore;", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;", "normalizedCacheFactory", "Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;", "cacheKeyGenerator", "Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;", "cacheResolver", "<init>", "(Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;)V", "", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "publish", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clearAll", "()Z", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "cacheKey", "cascade", "remove", "(Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Z)Z", "", "cacheKeys", "", "(Ljava/util/List;Z)I", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "normalize", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/util/Map;", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "cacheHeaders", "readOperation", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/apollographql/apollo/api/Fragment;", "fragment", "readFragment", "(Lcom/apollographql/apollo/api/Fragment;Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Lcom/apollographql/apollo/api/Fragment$Data;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "block", "accessCache", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "operationData", "writeOperation", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeOperationSync", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Set;", "fragmentData", "writeFragment", "(Lcom/apollographql/apollo/api/Fragment;Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Lcom/apollographql/apollo/api/Fragment$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeFragmentSync", "(Lcom/apollographql/apollo/api/Fragment;Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Lcom/apollographql/apollo/api/Fragment$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Set;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "mutationId", "writeOptimisticUpdates", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/Operation$Data;Ljava/util/UUID;Lcom/apollographql/apollo/api/CustomScalarAdapters;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeOptimisticUpdatesSync", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/Operation$Data;Ljava/util/UUID;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/util/Set;", "rollbackOptimisticUpdates", "(Ljava/util/UUID;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rollbackOptimisticUpdatesSync", "(Ljava/util/UUID;)Ljava/util/Set;", "Lkotlin/reflect/KClass;", "dump", "()Ljava/util/Map;", "dispose", "()V", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "changedKeys", "Lkotlinx/coroutines/flow/SharedFlow;", "getChangedKeys", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/apollographql/apollo/cache/normalized/api/internal/OptimisticCache;", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/cache/normalized/internal/Lock;", "Lcom/apollographql/apollo/cache/normalized/internal/Lock;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultApolloStore implements com.apollographql.apollo.cache.normalized.ApolloStore {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.cache.normalized.api.CacheResolver getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<java.util.Set<java.lang.String>> changedKeys;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.util.Set<java.lang.String>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.cache.normalized.internal.Lock Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator getHighSpeedVideoFpsRangesFor;

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final void dispose() {
    }

    public DefaultApolloStore(final com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory, com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator cacheKeyGenerator, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalizedCacheFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKeyGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheResolver, "");
        this.getHighSpeedVideoFpsRangesFor = cacheKeyGenerator;
        this.getHighResolutionOutputSizeshNQ4ISI = cacheResolver;
        kotlinx.coroutines.flow.MutableSharedFlow<java.util.Set<java.lang.String>> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 64, kotlinx.coroutines.channels.BufferOverflow.SUSPEND, 1, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.changedKeys = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.m9963$r8$lambda$MaCP5kDXEhvUFvH1S2kCnNMAiY(com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory.this);
            }
        });
        this.Camera2StreamConfigurationMap = new com.apollographql.apollo.cache.normalized.internal.Lock();
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final kotlinx.coroutines.flow.SharedFlow<java.util.Set<java.lang.String>> getChangedKeys() {
        return this.changedKeys;
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final java.lang.Object publish(java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (set.isEmpty() && set != com.apollographql.apollo.cache.normalized.ApolloStore.INSTANCE.getALL_KEYS()) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object emit = this.getHighSpeedVideoSizes.emit(set, continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final boolean clearAll() {
        this.Camera2StreamConfigurationMap.write(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.m9965$r8$lambda$_1tty5wQNMhbeAhSytOPq9TOlA(com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.this);
            }
        });
        return true;
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final boolean remove(final com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, final boolean cascade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKey, "");
        return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.write(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean remove;
                remove = ((com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.this.getHighSpeedVideoFpsRanges.getValue()).remove(cacheKey, cascade);
                return java.lang.Boolean.valueOf(remove);
            }
        })).booleanValue();
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final int remove(final java.util.List<com.apollographql.apollo.cache.normalized.api.CacheKey> cacheKeys, final boolean cascade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKeys, "");
        return ((java.lang.Number) this.Camera2StreamConfigurationMap.write(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.$r8$lambda$lHylVBbwOI17qifitG_D9vdwkbg(cacheKeys, this, cascade));
            }
        })).intValue();
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final <D extends com.apollographql.apollo.api.Operation.Data> java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record> normalize(com.apollographql.apollo.api.Operation<D> operation, D data, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return com.apollographql.apollo.cache.normalized.api.OperationCacheExtensionsKt.normalize(operation, data, customScalarAdapters, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final <D extends com.apollographql.apollo.api.Operation.Data> D readOperation(final com.apollographql.apollo.api.Operation<D> operation, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, final com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        final com.apollographql.apollo.api.Executable.Variables variables = com.apollographql.apollo.api.Executables.variables(operation, customScalarAdapters, true);
        return (D) com.apollographql.apollo.cache.normalized.api.OperationCacheExtensionsKt.toData((com.apollographql.apollo.cache.normalized.api.CacheData) this.Camera2StreamConfigurationMap.read(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.apollographql.apollo.cache.normalized.api.CacheData readDataFromCacheInternal;
                readDataFromCacheInternal = com.apollographql.apollo.cache.normalized.api.OperationCacheExtensionsKt.readDataFromCacheInternal(com.apollographql.apollo.api.Operation.this, (com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) r1.getHighSpeedVideoFpsRanges.getValue(), this.getHighResolutionOutputSizeshNQ4ISI, cacheHeaders, variables);
                return readDataFromCacheInternal;
            }
        }), operation.adapter(), customScalarAdapters, variables);
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final <D extends com.apollographql.apollo.api.Fragment.Data> D readFragment(final com.apollographql.apollo.api.Fragment<D> fragment, final com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, final com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        final com.apollographql.apollo.api.Executable.Variables variables = com.apollographql.apollo.api.Executables.variables(fragment, customScalarAdapters, true);
        return (D) com.apollographql.apollo.cache.normalized.api.OperationCacheExtensionsKt.toData((com.apollographql.apollo.cache.normalized.api.CacheData) this.Camera2StreamConfigurationMap.read(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.apollographql.apollo.cache.normalized.api.CacheData readDataFromCacheInternal;
                readDataFromCacheInternal = com.apollographql.apollo.cache.normalized.api.OperationCacheExtensionsKt.readDataFromCacheInternal(fragment, cacheKey, (com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) r0.getHighSpeedVideoFpsRanges.getValue(), com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.this.getHighResolutionOutputSizeshNQ4ISI, cacheHeaders, variables);
                return readDataFromCacheInternal;
            }
        }), fragment.adapter(), customScalarAdapters, variables);
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final <R> R accessCache(final kotlin.jvm.functions.Function1<? super com.apollographql.apollo.cache.normalized.api.NormalizedCache, ? extends R> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        return (R) this.Camera2StreamConfigurationMap.write(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function1.this.invoke((com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) this.getHighSpeedVideoFpsRanges.getValue());
                return invoke;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object writeOperation(com.apollographql.apollo.api.Operation<D> operation, D d, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders, boolean z, kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>> continuation) {
        com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeOperation$1 defaultApolloStore$writeOperation$1;
        int i;
        if (continuation instanceof com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeOperation$1) {
            defaultApolloStore$writeOperation$1 = (com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeOperation$1) continuation;
            if ((defaultApolloStore$writeOperation$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                defaultApolloStore$writeOperation$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = defaultApolloStore$writeOperation$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultApolloStore$writeOperation$1.getHighSpeedVideoFpsRanges;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.Set set = (java.util.Set) defaultApolloStore$writeOperation$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return set;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.Set<java.lang.String> writeOperationSync = writeOperationSync(operation, d, customScalarAdapters, cacheHeaders);
                if (z) {
                    defaultApolloStore$writeOperation$1.Camera2StreamConfigurationMap = writeOperationSync;
                    defaultApolloStore$writeOperation$1.getHighSpeedVideoFpsRanges = 1;
                    if (publish(writeOperationSync, defaultApolloStore$writeOperation$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return writeOperationSync;
            }
        }
        defaultApolloStore$writeOperation$1 = new com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeOperation$1(this, continuation);
        java.lang.Object obj2 = defaultApolloStore$writeOperation$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultApolloStore$writeOperation$1.getHighSpeedVideoFpsRanges;
        if (i == 0) {
        }
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final <D extends com.apollographql.apollo.api.Operation.Data> java.util.Set<java.lang.String> writeOperationSync(com.apollographql.apollo.api.Operation<D> operation, D operationData, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, final com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        final java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> values = com.apollographql.apollo.cache.normalized.api.OperationCacheExtensionsKt.normalize(operation, operationData, customScalarAdapters, this.getHighSpeedVideoFpsRangesFor).values();
        return (java.util.Set) this.Camera2StreamConfigurationMap.write(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Set merge;
                merge = ((com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.this.getHighSpeedVideoFpsRanges.getValue()).merge((java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record>) values, cacheHeaders);
                return merge;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D extends com.apollographql.apollo.api.Fragment.Data> java.lang.Object writeFragment(com.apollographql.apollo.api.Fragment<D> fragment, com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, D d, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders, boolean z, kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>> continuation) {
        com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeFragment$1 defaultApolloStore$writeFragment$1;
        int i;
        if (continuation instanceof com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeFragment$1) {
            defaultApolloStore$writeFragment$1 = (com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeFragment$1) continuation;
            if ((defaultApolloStore$writeFragment$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                defaultApolloStore$writeFragment$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = defaultApolloStore$writeFragment$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultApolloStore$writeFragment$1.getHighSpeedVideoSizes;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.Set set = (java.util.Set) defaultApolloStore$writeFragment$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return set;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.Set<java.lang.String> writeFragmentSync = writeFragmentSync(fragment, cacheKey, d, customScalarAdapters, cacheHeaders);
                if (z) {
                    defaultApolloStore$writeFragment$1.getHighResolutionOutputSizeshNQ4ISI = writeFragmentSync;
                    defaultApolloStore$writeFragment$1.getHighSpeedVideoSizes = 1;
                    if (publish(writeFragmentSync, defaultApolloStore$writeFragment$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return writeFragmentSync;
            }
        }
        defaultApolloStore$writeFragment$1 = new com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeFragment$1(this, continuation);
        java.lang.Object obj2 = defaultApolloStore$writeFragment$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultApolloStore$writeFragment$1.getHighSpeedVideoSizes;
        if (i == 0) {
        }
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final <D extends com.apollographql.apollo.api.Fragment.Data> java.util.Set<java.lang.String> writeFragmentSync(com.apollographql.apollo.api.Fragment<D> fragment, com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, D fragmentData, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, final com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        final java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> values = com.apollographql.apollo.cache.normalized.api.OperationCacheExtensionsKt.normalize(fragment, fragmentData, customScalarAdapters, this.getHighSpeedVideoFpsRangesFor, cacheKey.getKey()).values();
        return (java.util.Set) this.Camera2StreamConfigurationMap.write(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Set merge;
                merge = ((com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.this.getHighSpeedVideoFpsRanges.getValue()).merge((java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record>) values, cacheHeaders);
                return merge;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object writeOptimisticUpdates(com.apollographql.apollo.api.Operation<D> operation, D d, java.util.UUID uuid, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean z, kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>> continuation) {
        com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$1 defaultApolloStore$writeOptimisticUpdates$1;
        int i;
        if (continuation instanceof com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$1) {
            defaultApolloStore$writeOptimisticUpdates$1 = (com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$1) continuation;
            if ((defaultApolloStore$writeOptimisticUpdates$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                defaultApolloStore$writeOptimisticUpdates$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = defaultApolloStore$writeOptimisticUpdates$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultApolloStore$writeOptimisticUpdates$1.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.Set set = (java.util.Set) defaultApolloStore$writeOptimisticUpdates$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return set;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.Set<java.lang.String> writeOptimisticUpdatesSync = writeOptimisticUpdatesSync(operation, d, uuid, customScalarAdapters);
                if (z) {
                    defaultApolloStore$writeOptimisticUpdates$1.getHighResolutionOutputSizeshNQ4ISI = writeOptimisticUpdatesSync;
                    defaultApolloStore$writeOptimisticUpdates$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (publish(writeOptimisticUpdatesSync, defaultApolloStore$writeOptimisticUpdates$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return writeOptimisticUpdatesSync;
            }
        }
        defaultApolloStore$writeOptimisticUpdates$1 = new com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$1(this, continuation);
        java.lang.Object obj2 = defaultApolloStore$writeOptimisticUpdates$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultApolloStore$writeOptimisticUpdates$1.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
        }
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final <D extends com.apollographql.apollo.api.Operation.Data> java.util.Set<java.lang.String> writeOptimisticUpdatesSync(com.apollographql.apollo.api.Operation<D> operation, D operationData, java.util.UUID mutationId, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> values = com.apollographql.apollo.cache.normalized.api.OperationCacheExtensionsKt.normalize(operation, operationData, customScalarAdapters, this.getHighSpeedVideoFpsRangesFor).values();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(values, 10));
        for (com.apollographql.apollo.cache.normalized.api.Record record : values) {
            arrayList.add(new com.apollographql.apollo.cache.normalized.api.Record(record.getKey(), record.getFields(), mutationId));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        return (java.util.Set) this.Camera2StreamConfigurationMap.write(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Set addOptimisticUpdates;
                addOptimisticUpdates = ((com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.this.getHighSpeedVideoFpsRanges.getValue()).addOptimisticUpdates(arrayList2);
                return addOptimisticUpdates;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object rollbackOptimisticUpdates(java.util.UUID uuid, boolean z, kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>> continuation) {
        com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$1 defaultApolloStore$rollbackOptimisticUpdates$1;
        int i;
        if (continuation instanceof com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$1) {
            defaultApolloStore$rollbackOptimisticUpdates$1 = (com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$1) continuation;
            if ((defaultApolloStore$rollbackOptimisticUpdates$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                defaultApolloStore$rollbackOptimisticUpdates$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = defaultApolloStore$rollbackOptimisticUpdates$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultApolloStore$rollbackOptimisticUpdates$1.getHighSpeedVideoSizes;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.Set set = (java.util.Set) defaultApolloStore$rollbackOptimisticUpdates$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return set;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.Set<java.lang.String> rollbackOptimisticUpdatesSync = rollbackOptimisticUpdatesSync(uuid);
                if (z) {
                    defaultApolloStore$rollbackOptimisticUpdates$1.Camera2StreamConfigurationMap = rollbackOptimisticUpdatesSync;
                    defaultApolloStore$rollbackOptimisticUpdates$1.getHighSpeedVideoSizes = 1;
                    if (publish(rollbackOptimisticUpdatesSync, defaultApolloStore$rollbackOptimisticUpdates$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return rollbackOptimisticUpdatesSync;
            }
        }
        defaultApolloStore$rollbackOptimisticUpdates$1 = new com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$1(this, continuation);
        java.lang.Object obj2 = defaultApolloStore$rollbackOptimisticUpdates$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultApolloStore$rollbackOptimisticUpdates$1.getHighSpeedVideoSizes;
        if (i == 0) {
        }
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final java.util.Set<java.lang.String> rollbackOptimisticUpdatesSync(final java.util.UUID mutationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutationId, "");
        return (java.util.Set) this.Camera2StreamConfigurationMap.write(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Set removeOptimisticUpdates;
                removeOptimisticUpdates = ((com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.this.getHighSpeedVideoFpsRanges.getValue()).removeOptimisticUpdates(mutationId);
                return removeOptimisticUpdates;
            }
        });
    }

    @Override // com.apollographql.apollo.cache.normalized.ApolloStore
    public final java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> dump() {
        return (java.util.Map) this.Camera2StreamConfigurationMap.read(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Map dump;
                dump = ((com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore.this.getHighSpeedVideoFpsRanges.getValue()).dump();
                return dump;
            }
        });
    }

    /* renamed from: $r8$lambda$MaCP5kDXEhvUF-vH1S2kCnNMAiY, reason: not valid java name */
    public static /* synthetic */ com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache m9963$r8$lambda$MaCP5kDXEhvUFvH1S2kCnNMAiY(com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory) {
        com.apollographql.apollo.cache.normalized.api.NormalizedCache chain = new com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache().chain(normalizedCacheFactory.createChain());
        kotlin.jvm.internal.Intrinsics.checkNotNull(chain, "");
        return (com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) chain;
    }

    /* renamed from: $r8$lambda$_1tty5wQNMhbeAhSy-tOPq9TOlA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9965$r8$lambda$_1tty5wQNMhbeAhSytOPq9TOlA(com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore defaultApolloStore) {
        ((com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) defaultApolloStore.getHighSpeedVideoFpsRanges.getValue()).clearAll();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ int $r8$lambda$lHylVBbwOI17qifitG_D9vdwkbg(java.util.List list, com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore defaultApolloStore, boolean z) {
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((com.apollographql.apollo.cache.normalized.api.internal.OptimisticCache) defaultApolloStore.getHighSpeedVideoFpsRanges.getValue()).remove((com.apollographql.apollo.cache.normalized.api.CacheKey) it.next(), z)) {
                i++;
            }
        }
        return i;
    }
}
