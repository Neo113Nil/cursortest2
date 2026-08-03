package com.unity3d.ads.core.domain.scar;

/* compiled from: GetAndroidTokenEventRequest.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/GetAndroidTokenEventRequest;", "Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;", "()V", "invoke", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "tokenId", "Lcom/google/protobuf/ByteString;", "biddingSignals", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "(Lcom/google/protobuf/ByteString;Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetAndroidTokenEventRequest implements com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest {
    @Override // com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest
    public java.lang.Object invoke(com.google.protobuf.ByteString byteString, com.unity3d.services.ads.gmascar.models.BiddingSignals biddingSignals, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest> continuation) {
        gatewayprotocol.v1.GetTokenEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.GetTokenEventRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder newBuilder = gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.GetTokenEventRequestKt.Dsl _create = companion._create(newBuilder);
        _create.setTokenId(byteString);
        java.lang.String it = biddingSignals.getRvSignal();
        if (it != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            _create.setRewarded(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(it));
        }
        java.lang.String it2 = biddingSignals.getInterstitialSignal();
        if (it2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it2, "it");
            _create.setInterstitial(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(it2));
        }
        java.lang.String it3 = biddingSignals.getBannerSignal();
        if (it3 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it3, "it");
            _create.setBanner(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(it3));
        }
        return _create._build();
    }
}
