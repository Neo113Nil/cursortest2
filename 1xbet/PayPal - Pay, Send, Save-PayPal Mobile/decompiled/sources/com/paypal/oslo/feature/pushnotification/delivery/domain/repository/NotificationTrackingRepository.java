package com.paypal.oslo.feature.pushnotification.delivery.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\n\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationTrackingRepository;", "", "", "", "trackingTokens", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "trackClicked", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackImpressed"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface NotificationTrackingRepository {
    java.lang.Object trackClicked(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, kotlin.Unit>> continuation);

    java.lang.Object trackImpressed(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, kotlin.Unit>> continuation);
}
