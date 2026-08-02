package com.zettle.sdk.core.auth;

@kotlin.Deprecated(message = "Start using MerchantConfig instead")
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthStateProvider;", "", "Lcom/zettle/sdk/commons/state/State;", "Lcom/izettle/android/auth/AuthState;", "getAuthState", "()Lcom/zettle/sdk/commons/state/State;", "authState", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AuthStateProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.auth.AuthStateProvider.Companion INSTANCE = com.zettle.sdk.core.auth.AuthStateProvider.Companion.Camera2StreamConfigurationMap;

    com.zettle.sdk.commons.state.State<com.izettle.android.auth.AuthState> getAuthState();

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthStateProvider$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/ZettleAuth;", "auth", "Lcom/zettle/sdk/core/auth/AuthStateProvider;", "create", "(Lcom/izettle/android/auth/ZettleAuth;)Lcom/zettle/sdk/core/auth/AuthStateProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.auth.AuthStateProvider.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.core.auth.AuthStateProvider.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.core.auth.AuthStateProvider create(com.izettle.android.auth.ZettleAuth auth) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auth, "");
            return new com.zettle.sdk.core.auth.AuthStateProviderImpl(auth);
        }
    }
}
