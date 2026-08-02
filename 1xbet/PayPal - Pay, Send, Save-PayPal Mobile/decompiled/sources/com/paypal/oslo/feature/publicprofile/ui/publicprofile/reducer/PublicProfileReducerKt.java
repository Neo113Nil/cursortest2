package com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PublicProfileReducerKt {
    public static final /* synthetic */ java.lang.String access$toCode(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError publicProfileError) {
        if (publicProfileError instanceof com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.GraphQLError) {
            return ((com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.GraphQLError) publicProfileError).getCode();
        }
        if (publicProfileError instanceof com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.NetworkError) {
            return com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_NETWORK;
        }
        if (publicProfileError instanceof com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError) {
            return com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_UNKNOWN_ERROR;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
