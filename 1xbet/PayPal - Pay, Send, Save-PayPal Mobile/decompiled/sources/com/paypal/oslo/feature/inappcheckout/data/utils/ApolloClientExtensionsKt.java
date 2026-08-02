package com.paypal.oslo.feature.inappcheckout.data.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/ApolloCall;", "addNativeCheckoutHeaders", "(Lcom/apollographql/apollo/ApolloCall;)Lcom/apollographql/apollo/ApolloCall;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApolloClientExtensionsKt {
    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.ApolloCall<D> addNativeCheckoutHeaders(com.apollographql.apollo.ApolloCall<D> apolloCall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
        return apolloCall.addHttpHeader("x-app-name", "ppapp").addHttpHeader("origin", "ppapp").addHttpHeader(com.paypal.oslo.feature.inappcheckout.Constants.WEB_VIEW_HTTP_HEADER_KEY_INTEGRATION_ARTIFACT, com.paypal.oslo.feature.inappcheckout.Constants.WEB_VIEW_HTTP_HEADER_VALUE_MERCHANT_UPGRADE).addHttpHeader("X-PayPal-ConsumerApp-Context", "{}");
    }
}
