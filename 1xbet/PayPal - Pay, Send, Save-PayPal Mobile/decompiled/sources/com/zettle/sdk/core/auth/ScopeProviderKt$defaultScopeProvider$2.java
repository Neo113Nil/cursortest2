package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/zettle/sdk/core/auth/ScopeProvider;", "getHighSpeedVideoSizes", "()Lcom/zettle/sdk/core/auth/ScopeProvider;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class ScopeProviderKt$defaultScopeProvider$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.zettle.sdk.core.auth.ScopeProvider> {
    public static final com.zettle.sdk.core.auth.ScopeProviderKt$defaultScopeProvider$2 Camera2StreamConfigurationMap = new com.zettle.sdk.core.auth.ScopeProviderKt$defaultScopeProvider$2();

    public static /* synthetic */ java.lang.String[] getHighSpeedVideoFpsRangesFor(com.zettle.sdk.commons.network.Scope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        return com.zettle.sdk.core.auth.ScopeProviderKt.access$toAuthScopes(scope);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final com.zettle.sdk.core.auth.ScopeProvider invoke() {
        return new com.zettle.sdk.core.auth.ScopeProvider() { // from class: com.zettle.sdk.core.auth.ScopeProviderKt$defaultScopeProvider$2$$ExternalSyntheticLambda0
            @Override // com.zettle.sdk.core.auth.ScopeProvider
            public final java.lang.String[] invoke(com.zettle.sdk.commons.network.Scope scope) {
                return com.zettle.sdk.core.auth.ScopeProviderKt$defaultScopeProvider$2.getHighSpeedVideoFpsRangesFor(scope);
            }
        };
    }

    ScopeProviderKt$defaultScopeProvider$2() {
        super(0);
    }
}
