package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Q6 {
    public static final com.plaid.internal.AbstractC0544h7 a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestSilentNetworkAuth, "");
        java.lang.String verificationId = requestSilentNetworkAuth.getVerificationId();
        if (verificationId != null && verificationId.length() != 0) {
            if (requestSilentNetworkAuth.hasTwilio()) {
                java.lang.String redirectUri = requestSilentNetworkAuth.getTwilio().getRedirectUri();
                if (redirectUri == null || redirectUri.length() == 0) {
                    return null;
                }
                java.lang.String verificationId2 = requestSilentNetworkAuth.getVerificationId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(verificationId2, "");
                java.lang.String redirectUri2 = requestSilentNetworkAuth.getTwilio().getRedirectUri();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(redirectUri2, "");
                return new com.plaid.internal.C0660u7(verificationId2, redirectUri2);
            }
            if (requestSilentNetworkAuth.hasProve()) {
                java.lang.String verificationId3 = requestSilentNetworkAuth.getVerificationId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(verificationId3, "");
                return new com.plaid.internal.C0650t6(verificationId3);
            }
        }
        return null;
    }
}
