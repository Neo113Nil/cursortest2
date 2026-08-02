package com.izettle.android.auth.model.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/auth/model/mapper/OAuthTokensMapper;", "Lcom/izettle/android/auth/model/mapper/Mapper;", "Lcom/izettle/android/auth/dto/TokenResponse;", "Lcom/izettle/android/auth/model/OAuthTokens;", "<init>", "()V", "from", "inverseMap", "(Lcom/izettle/android/auth/model/OAuthTokens;)Lcom/izettle/android/auth/dto/TokenResponse;", "map", "(Lcom/izettle/android/auth/dto/TokenResponse;)Lcom/izettle/android/auth/model/OAuthTokens;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthTokensMapper implements com.izettle.android.auth.model.mapper.Mapper<com.izettle.android.auth.dto.TokenResponse, com.izettle.android.auth.model.OAuthTokens> {
    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.izettle.android.auth.dto.TokenResponse> inverseMap(java.lang.Iterable<? extends com.izettle.android.auth.model.OAuthTokens> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.inverseMap(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.izettle.android.auth.model.OAuthTokens> map(java.lang.Iterable<? extends com.izettle.android.auth.dto.TokenResponse> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.map(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.izettle.android.auth.model.OAuthTokens map(com.izettle.android.auth.dto.TokenResponse from) {
        java.util.Date date;
        com.izettle.android.auth.dto.Jwt decodeAsJwtOrNull;
        java.util.List<java.lang.String> scopes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        java.lang.String accessToken = from.getAccessToken();
        java.lang.String refreshToken = from.getRefreshToken();
        if (from.getExpiresInSeconds() != null) {
            date = new java.util.Date(java.lang.System.currentTimeMillis() + (r2.intValue() * 1000));
        } else {
            date = new java.util.Date();
        }
        java.lang.String accessToken2 = from.getAccessToken();
        if (accessToken2 != null && (decodeAsJwtOrNull = com.izettle.android.auth.dto.JwtKt.decodeAsJwtOrNull(accessToken2)) != null && (scopes = decodeAsJwtOrNull.getScopes()) != null) {
            return new com.izettle.android.auth.model.OAuthTokens(accessToken, refreshToken, date, scopes);
        }
        throw new java.lang.IllegalArgumentException("Access token contains no scopes");
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.izettle.android.auth.dto.TokenResponse inverseMap(com.izettle.android.auth.model.OAuthTokens from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        return new com.izettle.android.auth.dto.TokenResponse(from.getAccessToken(), from.getRefreshToken(), java.lang.Integer.valueOf((int) ((from.getExpirationDate().getTime() - java.lang.System.currentTimeMillis()) / 1000)));
    }
}
