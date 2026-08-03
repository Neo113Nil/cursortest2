package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes3.dex */
public abstract class h {
    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a(java.lang.String str) {
        com.fyber.inneractive.sdk.bidder.z newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString.newBuilder();
        if (!android.text.TextUtils.isEmpty(str)) {
            newBuilder.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.b).setData(str);
        }
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.a();
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a(java.lang.Boolean bool) {
        com.fyber.inneractive.sdk.bidder.w newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            newBuilder.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.b).setData(booleanValue);
        }
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.a();
    }

    public static com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 a(int i) {
        com.fyber.inneractive.sdk.bidder.a0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i > 0) {
            newBuilder.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b).setData(i);
        }
        return (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.a();
    }
}
