package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f"}, d2 = {"", "Lcom/izettle/android/serialization/JsonDeserializer;", "deserializer", "Lcom/izettle/android/auth/tasks/OAuthState;", "decodeAsOAuthStateOrNull", "(Ljava/lang/String;Lcom/izettle/android/serialization/JsonDeserializer;)Lcom/izettle/android/auth/tasks/OAuthState;", "Lcom/izettle/android/serialization/JsonSerializer;", "serializer", "encode", "(Lcom/izettle/android/auth/tasks/OAuthState;Lcom/izettle/android/serialization/JsonSerializer;)Ljava/lang/String;", "Landroid/net/Uri;", "Lcom/izettle/android/auth/tasks/OAuthParams;", "extractOAuthParamsOrNull", "(Landroid/net/Uri;)Lcom/izettle/android/auth/tasks/OAuthParams;", "QUERY_PARAM_CODE", "Ljava/lang/String;", "QUERY_PARAM_STATE"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthParamsKt {
    private static final java.lang.String QUERY_PARAM_CODE = "code";
    private static final java.lang.String QUERY_PARAM_STATE = "state";

    public static final com.izettle.android.auth.tasks.OAuthParams extractOAuthParamsOrNull(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        java.lang.String queryParameter = uri.getQueryParameter("state");
        java.lang.String queryParameter2 = uri.getQueryParameter("code");
        com.izettle.android.auth.tasks.OAuthState decodeAsOAuthStateOrNull$default = queryParameter != null ? decodeAsOAuthStateOrNull$default(queryParameter, null, 1, null) : null;
        if (decodeAsOAuthStateOrNull$default == null || queryParameter2 == null) {
            return null;
        }
        return new com.izettle.android.auth.tasks.OAuthParams(queryParameter2, decodeAsOAuthStateOrNull$default);
    }

    public static /* synthetic */ java.lang.String encode$default(com.izettle.android.auth.tasks.OAuthState oAuthState, com.izettle.android.serialization.JsonSerializer jsonSerializer, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jsonSerializer = com.izettle.android.serialization.JsonSerializer.INSTANCE.create();
        }
        return encode(oAuthState, jsonSerializer);
    }

    public static final java.lang.String encode(com.izettle.android.auth.tasks.OAuthState oAuthState, com.izettle.android.serialization.JsonSerializer jsonSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonSerializer, "");
        return com.izettle.android.auth.ExtensionsKt.toBase64$default(jsonSerializer.serializeToString(oAuthState), null, 1, null);
    }

    public static /* synthetic */ com.izettle.android.auth.tasks.OAuthState decodeAsOAuthStateOrNull$default(java.lang.String str, com.izettle.android.serialization.JsonDeserializer jsonDeserializer, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jsonDeserializer = com.izettle.android.serialization.JsonDeserializer.INSTANCE.create();
        }
        return decodeAsOAuthStateOrNull(str, jsonDeserializer);
    }

    public static final com.izettle.android.auth.tasks.OAuthState decodeAsOAuthStateOrNull(java.lang.String str, com.izettle.android.serialization.JsonDeserializer jsonDeserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonDeserializer, "");
        try {
            return (com.izettle.android.auth.tasks.OAuthState) jsonDeserializer.deserialize(com.izettle.android.auth.ExtensionsKt.fromBase64$default(str, null, 1, null), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.tasks.OAuthState.class));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
