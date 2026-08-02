package com.paypal.oslo.feature.identity.foundation.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "", "", "tokenType", "tokenValue", "expires", "", "expirationInSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Ljava/lang/String;", "getTokenType", "()Ljava/lang/String;", "getTokenValue", "getExpires", com.visa.cbp.getEncExpo.warmup, "getExpirationInSeconds", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class Token {
    public static final int $stable = 0;
    private final int expirationInSeconds;
    private final java.lang.String expires;
    private final java.lang.String tokenType;
    private final java.lang.String tokenValue;

    public Token(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.tokenType = str;
        this.tokenValue = str2;
        this.expires = str3;
        this.expirationInSeconds = i;
    }

    public java.lang.String getTokenType() {
        return this.tokenType;
    }

    public java.lang.String getTokenValue() {
        return this.tokenValue;
    }

    public java.lang.String getExpires() {
        return this.expires;
    }

    public int getExpirationInSeconds() {
        return this.expirationInSeconds;
    }
}
