package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthStateProviderImpl;", "Lcom/zettle/sdk/core/auth/AuthStateProvider;", "Lcom/izettle/android/auth/ZettleAuth;", "auth", "<init>", "(Lcom/izettle/android/auth/ZettleAuth;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/izettle/android/auth/ZettleAuth;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/commons/state/State;", "Lcom/izettle/android/auth/AuthState;", "authState$delegate", "Lkotlin/Lazy;", "getAuthState", "()Lcom/zettle/sdk/commons/state/State;", "authState"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AuthStateProviderImpl implements com.zettle.sdk.core.auth.AuthStateProvider {

    /* renamed from: authState$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy authState;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.izettle.android.auth.ZettleAuth getHighSpeedVideoSizes;

    public AuthStateProviderImpl(com.izettle.android.auth.ZettleAuth zettleAuth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
        this.getHighSpeedVideoSizes = zettleAuth;
        this.authState = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.core.auth.MutableAuthState>() { // from class: com.zettle.sdk.core.auth.AuthStateProviderImpl$authState$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.core.auth.MutableAuthState invoke() {
                com.izettle.android.auth.ZettleAuth zettleAuth2;
                zettleAuth2 = com.zettle.sdk.core.auth.AuthStateProviderImpl.this.getHighSpeedVideoSizes;
                return new com.zettle.sdk.core.auth.MutableAuthState(zettleAuth2);
            }

            {
                super(0);
            }
        });
    }

    @Override // com.zettle.sdk.core.auth.AuthStateProvider
    public final com.zettle.sdk.commons.state.State<com.izettle.android.auth.AuthState> getAuthState() {
        return (com.zettle.sdk.commons.state.State) this.authState.getValue();
    }
}
