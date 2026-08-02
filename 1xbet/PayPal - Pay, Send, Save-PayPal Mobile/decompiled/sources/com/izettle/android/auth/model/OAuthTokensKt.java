package com.izettle.android.auth.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Lcom/izettle/android/auth/model/OAuthTokens;", "", "withUserIdAndRedactedTokens", "(Lcom/izettle/android/auth/model/OAuthTokens;)Ljava/lang/String;", "", "(Ljava/util/List;)Ljava/lang/String;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthTokensKt {
    public static final java.lang.String withUserIdAndRedactedTokens(com.izettle.android.auth.model.OAuthTokens oAuthTokens) {
        java.lang.String str;
        com.izettle.android.auth.dto.Jwt decodeAsJwtOrNull;
        com.izettle.android.auth.dto.JwtUser user;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokens, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String accessToken = oAuthTokens.getAccessToken();
        java.lang.String str2 = null;
        pairArr[0] = kotlin.TuplesKt.to("userId", (accessToken == null || (decodeAsJwtOrNull = com.izettle.android.auth.dto.JwtKt.decodeAsJwtOrNull(accessToken)) == null || (user = decodeAsJwtOrNull.getUser()) == null) ? null : user.getUserId());
        java.lang.String accessToken2 = oAuthTokens.getAccessToken();
        if (accessToken2 != null) {
            java.lang.String take = kotlin.text.StringsKt.take(accessToken2, 2);
            java.lang.String takeLast = kotlin.text.StringsKt.takeLast(accessToken2, 2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(take);
            sb.append(com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper.FIXED_INPUT_MASK);
            sb.append(takeLast);
            str = sb.toString();
        } else {
            str = null;
        }
        java.lang.String refreshToken = oAuthTokens.getRefreshToken();
        if (refreshToken != null) {
            java.lang.String take2 = kotlin.text.StringsKt.take(refreshToken, 2);
            java.lang.String takeLast2 = kotlin.text.StringsKt.takeLast(refreshToken, 2);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(take2);
            sb2.append(com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper.FIXED_INPUT_MASK);
            sb2.append(takeLast2);
            str2 = sb2.toString();
        }
        pairArr[1] = kotlin.TuplesKt.to("tokens", com.izettle.android.auth.model.OAuthTokens.copy$default(oAuthTokens, str, str2, null, null, 12, null).toString());
        return kotlin.collections.MapsKt.mapOf(pairArr).toString();
    }

    public static final java.lang.String withUserIdAndRedactedTokens(java.util.List<com.izettle.android.auth.model.OAuthTokens> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.izettle.android.auth.model.OAuthTokens> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(withUserIdAndRedactedTokens((com.izettle.android.auth.model.OAuthTokens) it.next()));
        }
        return arrayList.toString();
    }
}
