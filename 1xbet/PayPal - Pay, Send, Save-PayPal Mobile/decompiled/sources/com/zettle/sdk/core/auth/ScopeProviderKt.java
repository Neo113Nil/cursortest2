package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0005\u001a\u00020\u00008GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/core/auth/ScopeProvider;", "defaultScopeProvider$delegate", "Lkotlin/Lazy;", "getDefaultScopeProvider", "()Lcom/zettle/sdk/core/auth/ScopeProvider;", "defaultScopeProvider"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ScopeProviderKt {
    private static final kotlin.Lazy defaultScopeProvider$delegate = kotlin.LazyKt.lazy(com.zettle.sdk.core.auth.ScopeProviderKt$defaultScopeProvider$2.Camera2StreamConfigurationMap);

    public static final com.zettle.sdk.core.auth.ScopeProvider getDefaultScopeProvider() {
        return (com.zettle.sdk.core.auth.ScopeProvider) defaultScopeProvider$delegate.getValue();
    }

    public static final /* synthetic */ java.lang.String[] access$toAuthScopes(com.zettle.sdk.commons.network.Scope scope) {
        int i = com.zettle.sdk.core.auth.ScopeProviderKt.WhenMappings.$EnumSwitchMapping$0[scope.ordinal()];
        if (i == 1) {
            return new java.lang.String[]{com.izettle.android.auth.AuthScopes.READ_PAYMENT, com.izettle.android.auth.AuthScopes.WRITE_PAYMENT, com.izettle.android.auth.AuthScopes.READ_USER_INFO};
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new java.lang.String[]{com.izettle.android.auth.AuthScopes.READ_PAYMENT, com.izettle.android.auth.AuthScopes.WRITE_REFUND2, com.izettle.android.auth.AuthScopes.READ_USER_INFO};
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.zettle.sdk.commons.network.Scope.values().length];
            try {
                iArr[com.zettle.sdk.commons.network.Scope.Payment.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.zettle.sdk.commons.network.Scope.Refund.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
