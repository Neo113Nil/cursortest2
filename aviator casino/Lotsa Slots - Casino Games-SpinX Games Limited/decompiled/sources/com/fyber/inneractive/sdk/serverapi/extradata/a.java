package com.fyber.inneractive.sdk.serverapi.extradata;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.serverapi.extradata.c {
    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final boolean a(java.lang.Object obj) {
        return ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) ((com.fyber.inneractive.sdk.bidder.k) obj).b).getPubExtraDataCount() == 0;
    }

    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final void a(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.fyber.inneractive.sdk.bidder.k kVar = (com.fyber.inneractive.sdk.bidder.k) obj;
        com.fyber.inneractive.sdk.bidder.d0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData.newBuilder();
        newBuilder.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) newBuilder.b).setKey(str);
        newBuilder.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) newBuilder.b).setValue(str2);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData pubExtraData = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PubExtraData) newBuilder.a();
        kVar.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar.b).addPubExtraData(pubExtraData);
    }
}
