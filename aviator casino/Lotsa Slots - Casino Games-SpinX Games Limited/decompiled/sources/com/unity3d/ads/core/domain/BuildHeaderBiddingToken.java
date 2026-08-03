package com.unity3d.ads.core.domain;

/* compiled from: BuildHeaderBiddingToken.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH¦Bø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "", "invoke", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "tokenNumber", "", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "scarSignalsCollected", "", "(ILcom/unity3d/ads/TokenConfiguration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface BuildHeaderBiddingToken {
    java.lang.Object invoke(int i, com.unity3d.ads.TokenConfiguration tokenConfiguration, boolean z, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken> continuation);

    /* compiled from: BuildHeaderBiddingToken.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object invoke$default(com.unity3d.ads.core.domain.BuildHeaderBiddingToken buildHeaderBiddingToken, int i, com.unity3d.ads.TokenConfiguration tokenConfiguration, boolean z, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i2 & 2) != 0) {
                tokenConfiguration = null;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            return buildHeaderBiddingToken.invoke(i, tokenConfiguration, z, continuation);
        }
    }
}
