package com.zettle.sdk.interceptors.auth;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n"}, d2 = {"Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory;", "", "<init>", "()V", "Lcom/zettle/sdk/interceptors/auth/AuthenticatorInterceptor;", "create", "()Lcom/zettle/sdk/interceptors/auth/AuthenticatorInterceptor;", "CustomProvider", "DefaultProvider", "Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory$CustomProvider;", "Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory$DefaultProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AuthInterceptorFactory {
    public abstract com.zettle.sdk.interceptors.auth.AuthenticatorInterceptor create();

    private AuthInterceptorFactory() {
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory$CustomProvider;", "Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory;", "Lcom/zettle/sdk/core/auth/AuthModule;", "authModule", "<init>", "(Lcom/zettle/sdk/core/auth/AuthModule;)V", "copy", "(Lcom/zettle/sdk/core/auth/AuthModule;)Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory$CustomProvider;", "Lcom/zettle/sdk/interceptors/auth/AuthInterceptorCustomProvider;", "create", "()Lcom/zettle/sdk/interceptors/auth/AuthInterceptorCustomProvider;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/core/auth/AuthModule;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CustomProvider extends com.zettle.sdk.interceptors.auth.AuthInterceptorFactory {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.zettle.sdk.core.auth.AuthModule getHighSpeedVideoFpsRanges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomProvider(com.zettle.sdk.core.auth.AuthModule authModule) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authModule, "");
            this.getHighSpeedVideoFpsRanges = authModule;
        }

        @Override // com.zettle.sdk.interceptors.auth.AuthInterceptorFactory
        public final com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider create() {
            return new com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider(this.getHighSpeedVideoFpsRanges);
        }

        public final java.lang.String toString() {
            com.zettle.sdk.core.auth.AuthModule authModule = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomProvider(getHighSpeedVideoFpsRanges=");
            sb.append(authModule);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.CustomProvider) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.CustomProvider) other).getHighSpeedVideoFpsRanges);
        }

        public final com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.CustomProvider copy(com.zettle.sdk.core.auth.AuthModule authModule) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authModule, "");
            return new com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.CustomProvider(authModule);
        }

        public static /* synthetic */ com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.CustomProvider copy$default(com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.CustomProvider customProvider, com.zettle.sdk.core.auth.AuthModule authModule, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authModule = customProvider.getHighSpeedVideoFpsRanges;
            }
            return customProvider.copy(authModule);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory$DefaultProvider;", "Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory;", "Lcom/zettle/sdk/core/auth/AuthProvider;", "authProvider", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "merchantConfig", "<init>", "(Lcom/zettle/sdk/core/auth/AuthProvider;Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;)V", "copy", "(Lcom/zettle/sdk/core/auth/AuthProvider;Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;)Lcom/zettle/sdk/interceptors/auth/AuthInterceptorFactory$DefaultProvider;", "Lcom/zettle/sdk/interceptors/auth/AuthInterceptorDefaultProvider;", "create", "()Lcom/zettle/sdk/interceptors/auth/AuthInterceptorDefaultProvider;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/core/auth/AuthProvider;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DefaultProvider extends com.zettle.sdk.interceptors.auth.AuthInterceptorFactory {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.zettle.sdk.core.auth.AuthProvider getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final com.zettle.sdk.core.auth.merchant.MerchantConfig getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultProvider(com.zettle.sdk.core.auth.AuthProvider authProvider, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfig, "");
            this.getHighSpeedVideoFpsRangesFor = authProvider;
            this.getHighResolutionOutputSizeshNQ4ISI = merchantConfig;
        }

        @Override // com.zettle.sdk.interceptors.auth.AuthInterceptorFactory
        public final com.zettle.sdk.interceptors.auth.AuthInterceptorDefaultProvider create() {
            return new com.zettle.sdk.interceptors.auth.AuthInterceptorDefaultProvider(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final java.lang.String toString() {
            com.zettle.sdk.core.auth.AuthProvider authProvider = this.getHighSpeedVideoFpsRangesFor;
            com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultProvider(getHighSpeedVideoFpsRangesFor=");
            sb.append(authProvider);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(merchantConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.DefaultProvider)) {
                return false;
            }
            com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.DefaultProvider defaultProvider = (com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.DefaultProvider) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, defaultProvider.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, defaultProvider.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.DefaultProvider copy(com.zettle.sdk.core.auth.AuthProvider authProvider, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfig, "");
            return new com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.DefaultProvider(authProvider, merchantConfig);
        }

        public static /* synthetic */ com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.DefaultProvider copy$default(com.zettle.sdk.interceptors.auth.AuthInterceptorFactory.DefaultProvider defaultProvider, com.zettle.sdk.core.auth.AuthProvider authProvider, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authProvider = defaultProvider.getHighSpeedVideoFpsRangesFor;
            }
            if ((i & 2) != 0) {
                merchantConfig = defaultProvider.getHighResolutionOutputSizeshNQ4ISI;
            }
            return defaultProvider.copy(authProvider, merchantConfig);
        }
    }

    public /* synthetic */ AuthInterceptorFactory(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
