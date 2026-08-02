package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/izettle/android/auth/dto/Jwt;", "decodeAsJwtOrNull", "(Ljava/lang/String;)Lcom/izettle/android/auth/dto/Jwt;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JwtKt {
    public static final com.izettle.android.auth.dto.Jwt decodeAsJwtOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String str2 = (java.lang.String) kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).get(1);
            return (com.izettle.android.auth.dto.Jwt) com.izettle.android.serialization.JsonDeserializer.INSTANCE.create().deserialize(com.izettle.android.auth.ExtensionsKt.fromBase64$default(str2, null, 1, null), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.dto.Jwt.class));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
