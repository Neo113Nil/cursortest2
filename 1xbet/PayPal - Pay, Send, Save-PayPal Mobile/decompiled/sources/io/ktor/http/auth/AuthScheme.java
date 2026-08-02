package io.ktor.http.auth;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lio/ktor/http/auth/AuthScheme;", "", "<init>", "()V", "", io.ktor.http.auth.AuthScheme.Basic, "Ljava/lang/String;", io.ktor.http.auth.AuthScheme.Digest, io.ktor.http.auth.AuthScheme.Negotiate, io.ktor.http.auth.AuthScheme.OAuth, io.ktor.http.auth.AuthScheme.Bearer}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AuthScheme {
    public static final java.lang.String Basic = "Basic";
    public static final java.lang.String Bearer = "Bearer";
    public static final java.lang.String Digest = "Digest";
    public static final io.ktor.http.auth.AuthScheme INSTANCE = new io.ktor.http.auth.AuthScheme();
    public static final java.lang.String Negotiate = "Negotiate";
    public static final java.lang.String OAuth = "OAuth";

    private AuthScheme() {
    }
}
