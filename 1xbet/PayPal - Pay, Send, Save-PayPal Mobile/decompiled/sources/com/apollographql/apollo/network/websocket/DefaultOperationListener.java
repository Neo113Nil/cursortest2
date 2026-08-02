package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0005\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u000e\u0010\u0005\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/apollographql/apollo/network/websocket/DefaultOperationListener;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/network/websocket/internal/OperationListener;", "Lcom/apollographql/apollo/api/ApolloRequest;", "p0", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/apollographql/apollo/api/ApolloResponse;", "p1", "Lcom/apollographql/apollo/network/websocket/SubscriptionParser;", "p2", "<init>", "(Lcom/apollographql/apollo/api/ApolloRequest;Lkotlinx/coroutines/channels/ProducerScope;Lcom/apollographql/apollo/network/websocket/SubscriptionParser;)V", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "", "onResponse", "(Ljava/lang/Object;)V", "onComplete", "()V", "onError", "Lcom/apollographql/apollo/exception/ApolloException;", "onTransportError", "(Lcom/apollographql/apollo/exception/ApolloException;)V", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/api/ApolloRequest;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/channels/ProducerScope;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/network/websocket/SubscriptionParser;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DefaultOperationListener<D extends com.apollographql.apollo.api.Operation.Data> implements com.apollographql.apollo.network.websocket.internal.OperationListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.ProducerScope<com.apollographql.apollo.api.ApolloResponse<D>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.websocket.SubscriptionParser<D> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.ApolloRequest<D> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultOperationListener(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlinx.coroutines.channels.ProducerScope<? super com.apollographql.apollo.api.ApolloResponse<D>> producerScope, com.apollographql.apollo.network.websocket.SubscriptionParser<D> subscriptionParser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(producerScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionParser, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloRequest;
        this.getHighSpeedVideoFpsRanges = producerScope;
        this.getHighSpeedVideoSizes = subscriptionParser;
    }

    @Override // com.apollographql.apollo.network.websocket.internal.OperationListener
    public final void onResponse(java.lang.Object p0) {
        com.apollographql.apollo.api.ApolloResponse<D> parse = this.getHighSpeedVideoSizes.parse(p0);
        if (parse != null) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighSpeedVideoFpsRanges.mo9266trySendJP2dKIU(parse));
        }
    }

    @Override // com.apollographql.apollo.network.websocket.internal.OperationListener
    public final void onComplete() {
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRanges, null, 1, null);
    }

    @Override // com.apollographql.apollo.network.websocket.internal.OperationListener
    public final void onError(java.lang.Object p0) {
        this.getHighSpeedVideoFpsRanges.mo9266trySendJP2dKIU(new com.apollographql.apollo.api.ApolloResponse.Builder(this.getHighResolutionOutputSizeshNQ4ISI.getOperation(), this.getHighResolutionOutputSizeshNQ4ISI.getRequestUuid()).exception(new com.apollographql.apollo.exception.SubscriptionOperationException(this.getHighResolutionOutputSizeshNQ4ISI.getOperation().name(), p0)).build());
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRanges, null, 1, null);
    }

    @Override // com.apollographql.apollo.network.websocket.internal.OperationListener
    public final void onTransportError(com.apollographql.apollo.exception.ApolloException p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.mo9266trySendJP2dKIU(new com.apollographql.apollo.api.ApolloResponse.Builder(this.getHighResolutionOutputSizeshNQ4ISI.getOperation(), this.getHighResolutionOutputSizeshNQ4ISI.getRequestUuid()).exception(p0).build());
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRanges, null, 1, null);
    }
}
