package com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002"}, d2 = {"", "toBase64Url", "(Ljava/lang/String;)Ljava/lang/String;", "normalizeCredentialType"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyLoginCredentialChallengeKt {
    public static final java.lang.String toBase64Url(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str, '+', '-', false, 4, (java.lang.Object) null), kotlinx.io.files.FileSystemKt.UnixPathSeparator, '_', false, 4, (java.lang.Object) null), "=", "", false, 4, (java.lang.Object) null);
    }

    public static final java.lang.String normalizeCredentialType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return kotlin.text.StringsKt.replace$default(lowerCase, '_', '-', false, 4, (java.lang.Object) null);
    }
}
