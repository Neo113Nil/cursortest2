package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class LegacyWebViewServicingUrlsRepositoryImpl$fetchServicingUrls$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError invoke(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl.access$mapError((com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl) this.receiver, callError);
    }

    LegacyWebViewServicingUrlsRepositoryImpl$fetchServicingUrls$2(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl.class, "mapError", "mapError(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/LegacyWebViewServicingUrlError;", 0);
    }
}
