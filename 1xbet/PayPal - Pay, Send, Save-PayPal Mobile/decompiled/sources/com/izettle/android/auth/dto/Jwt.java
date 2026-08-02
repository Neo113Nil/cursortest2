package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Lcom/izettle/android/auth/dto/Jwt;", "", "", "issuer", "audience", "", "expires", "issuedAt", "clientId", "", "scopes", "", "renewed", "Lcom/izettle/android/auth/dto/JwtUser;", "user", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lcom/izettle/android/auth/dto/JwtUser;)V", "Ljava/lang/String;", "getAudience", "()Ljava/lang/String;", "getClientId", "Ljava/lang/Long;", "getExpires", "()Ljava/lang/Long;", "getIssuedAt", "getIssuer", "Ljava/lang/Boolean;", "getRenewed", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getScopes", "()Ljava/util/List;", "Lcom/izettle/android/auth/dto/JwtUser;", "getUser", "()Lcom/izettle/android/auth/dto/JwtUser;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Jwt {
    private final java.lang.String audience;
    private final java.lang.String clientId;
    private final java.lang.Long expires;
    private final java.lang.Long issuedAt;
    private final java.lang.String issuer;
    private final java.lang.Boolean renewed;
    private final java.util.List<java.lang.String> scopes;
    private final com.izettle.android.auth.dto.JwtUser user;

    public Jwt(@com.izettle.android.serialization.annotations.JsonDeserialize("iss") java.lang.String str, @com.izettle.android.serialization.annotations.JsonDeserialize("aud") java.lang.String str2, @com.izettle.android.serialization.annotations.JsonDeserialize("exp") java.lang.Long l, @com.izettle.android.serialization.annotations.JsonDeserialize("iat") java.lang.Long l2, @com.izettle.android.serialization.annotations.JsonDeserialize("client_id") java.lang.String str3, @com.izettle.android.serialization.annotations.JsonDeserialize("scope") java.util.List<java.lang.String> list, @com.izettle.android.serialization.annotations.JsonDeserialize("renewed") java.lang.Boolean bool, @com.izettle.android.serialization.annotations.JsonDeserialize("user") com.izettle.android.auth.dto.JwtUser jwtUser) {
        this.issuer = str;
        this.audience = str2;
        this.expires = l;
        this.issuedAt = l2;
        this.clientId = str3;
        this.scopes = list;
        this.renewed = bool;
        this.user = jwtUser;
    }

    public final java.lang.String getIssuer() {
        return this.issuer;
    }

    public final java.lang.String getAudience() {
        return this.audience;
    }

    public final java.lang.Long getExpires() {
        return this.expires;
    }

    public final java.lang.Long getIssuedAt() {
        return this.issuedAt;
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.util.List<java.lang.String> getScopes() {
        return this.scopes;
    }

    public final java.lang.Boolean getRenewed() {
        return this.renewed;
    }

    public final com.izettle.android.auth.dto.JwtUser getUser() {
        return this.user;
    }
}
