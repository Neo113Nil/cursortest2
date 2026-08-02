package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class LegacyWebViewServicingUrlsRepositoryImpl$fetchServicingUrls$3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingUrls> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingUrls invoke(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl.access$extractUrls((com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl) this.receiver, data);
    }

    LegacyWebViewServicingUrlsRepositoryImpl$fetchServicingUrls$3(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl.class, "extractUrls", "extractUrls(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Data;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingUrls;", 0);
    }
}
