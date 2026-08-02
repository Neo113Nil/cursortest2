package com.zettle.sdk.interceptors.auth;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0003"}, d2 = {"Lcom/zettle/sdk/interceptors/auth/AuthenticatorInterceptor;", "Lokhttp3/Authenticator;", "Lokhttp3/Interceptor;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AuthenticatorInterceptor extends okhttp3.Authenticator, okhttp3.Interceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.interceptors.auth.AuthenticatorInterceptor.Companion INSTANCE = com.zettle.sdk.interceptors.auth.AuthenticatorInterceptor.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/interceptors/auth/AuthenticatorInterceptor$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory;", "factory", "Lcom/zettle/sdk/interceptors/auth/AuthenticatorInterceptor;", "create$core_publicRelease", "(Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory;)Lcom/zettle/sdk/interceptors/auth/AuthenticatorInterceptor;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.interceptors.auth.AuthenticatorInterceptor.Companion getHighSpeedVideoSizes = new com.zettle.sdk.interceptors.auth.AuthenticatorInterceptor.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.interceptors.auth.AuthenticatorInterceptor create$core_publicRelease(com.zettle.sdk.interceptors.auth.AuthInterceptorFactory factory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
            return factory.create();
        }
    }
}
