package com.paypal.oslo.feature.identity.foundation.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "", "tokenType", "tokenValue", "expires", "", "expirationInSeconds", "Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;", "authenticationTier", "authenticationType", "payerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;", "getAuthenticationTier", "()Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;", "Ljava/lang/String;", "getAuthenticationType", "()Ljava/lang/String;", "getPayerId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAccessToken extends com.paypal.oslo.feature.identity.foundation.model.Token {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier;
    private final java.lang.String authenticationType;
    private final java.lang.String payerId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccessToken(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier, java.lang.String str4, java.lang.String str5) {
        super(str, str2, str3, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationTier, "");
        this.authenticationTier = authenticationTier;
        this.authenticationType = str4;
        this.payerId = str5;
    }

    public /* synthetic */ UserAccessToken(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier, java.lang.String str4, java.lang.String str5, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, authenticationTier, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }

    public final com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier getAuthenticationTier() {
        return this.authenticationTier;
    }

    public final java.lang.String getAuthenticationType() {
        return this.authenticationType;
    }

    public final java.lang.String getPayerId() {
        return this.payerId;
    }
}
