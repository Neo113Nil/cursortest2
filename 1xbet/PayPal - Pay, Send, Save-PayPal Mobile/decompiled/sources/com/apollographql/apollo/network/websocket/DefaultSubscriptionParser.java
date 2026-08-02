package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u000e\u0010\u0005\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\r\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015"}, d2 = {"Lcom/apollographql/apollo/network/websocket/DefaultSubscriptionParser;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/network/websocket/SubscriptionParser;", "Lcom/apollographql/apollo/api/ApolloRequest;", "p0", "<init>", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "Lcom/apollographql/apollo/api/ApolloResponse;", "parse", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/ApolloResponse;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/api/ApolloRequest;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/internal/DeferredJsonMerger;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/internal/DeferredJsonMerger;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DefaultSubscriptionParser<D extends com.apollographql.apollo.api.Operation.Data> implements com.apollographql.apollo.network.websocket.SubscriptionParser<D> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.apollographql.apollo.internal.DeferredJsonMerger Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.CustomScalarAdapters getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRangesFor;

    public DefaultSubscriptionParser(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        this.getHighSpeedVideoFpsRangesFor = apolloRequest;
        this.Camera2StreamConfigurationMap = new com.apollographql.apollo.internal.DeferredJsonMerger();
        com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters = (com.apollographql.apollo.api.CustomScalarAdapters) apolloRequest.getExecutionContext().get(com.apollographql.apollo.api.CustomScalarAdapters.INSTANCE);
        this.getHighSpeedVideoSizes = customScalarAdapters == null ? com.apollographql.apollo.api.CustomScalarAdapters.Empty : customScalarAdapters;
    }

    @Override // com.apollographql.apollo.network.websocket.SubscriptionParser
    public final com.apollographql.apollo.api.ApolloResponse<D> parse(java.lang.Object p0) {
        boolean contains;
        kotlin.Pair pair;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = p0 instanceof java.util.Map ? (java.util.Map) p0 : null;
        if (map == null) {
            return new com.apollographql.apollo.api.ApolloResponse.Builder(this.getHighSpeedVideoFpsRangesFor.getOperation(), this.getHighSpeedVideoFpsRangesFor.getRequestUuid()).exception(new com.apollographql.apollo.exception.DefaultApolloException("Invalid payload", null, 2, null)).build();
        }
        contains = map.keySet().contains("hasNext");
        if (contains) {
            pair = kotlin.TuplesKt.to(this.Camera2StreamConfigurationMap.merge(map), this.Camera2StreamConfigurationMap.getMergedFragmentIds());
        } else {
            pair = kotlin.TuplesKt.to(map, null);
        }
        com.apollographql.apollo.api.ApolloResponse<D> apolloResponse = com.apollographql.apollo.api.Operations.toApolloResponse(com.apollographql.apollo.api.json.JsonReaders.jsonReader((java.util.Map<java.lang.String, ? extends java.lang.Object>) pair.component1()), this.getHighSpeedVideoFpsRangesFor.getOperation(), this.getHighSpeedVideoFpsRangesFor.getRequestUuid(), this.getHighSpeedVideoSizes, (java.util.Set) pair.component2());
        if (!this.Camera2StreamConfigurationMap.getHasNext()) {
            this.Camera2StreamConfigurationMap.reset();
        }
        if (this.Camera2StreamConfigurationMap.getIsEmptyPayload()) {
            return null;
        }
        return apolloResponse;
    }
}
