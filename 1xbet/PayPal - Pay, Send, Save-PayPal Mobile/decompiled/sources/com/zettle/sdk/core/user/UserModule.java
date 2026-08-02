package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/core/user/UserModule;", "Lcom/zettle/sdk/core/Module;", "Lcom/zettle/sdk/core/user/MerchantProvider;", "Lcom/zettle/sdk/core/user/CountryCode;", "getCountryId", "()Lcom/zettle/sdk/core/user/CountryCode;", "Lcom/zettle/sdk/core/user/CurrencyCode;", "getCurrency", "()Lcom/zettle/sdk/core/user/CurrencyCode;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/core/auth/Merchant;", "getMerchant", "()Lkotlinx/coroutines/flow/Flow;", "merchant", "", "getOrganizationUUID", "()Ljava/lang/String;", "organizationUUID", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "getUserConfig", "()Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "userConfig", "getUserID", "userID", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface UserModule extends com.zettle.sdk.core.Module, com.zettle.sdk.core.user.MerchantProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.UserModule.Companion INSTANCE = com.zettle.sdk.core.user.UserModule.Companion.getHighResolutionOutputSizeshNQ4ISI;
    public static final java.lang.String DEV_FLAG_SIMULATE_US = "SIMULATE_UI_FOR_US_USER";

    com.zettle.sdk.core.user.CountryCode getCountryId();

    com.zettle.sdk.core.user.CurrencyCode getCurrency();

    kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.auth.Merchant> getMerchant();

    java.lang.String getOrganizationUUID();

    com.zettle.sdk.core.user.userconfig.UserConfig getUserConfig();

    java.lang.String getUserID();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static com.zettle.sdk.core.auth.Merchant.LoggedIn getCurrentLoggedInMerchant(com.zettle.sdk.core.user.UserModule userModule) {
            return com.zettle.sdk.core.user.MerchantProvider.DefaultImpls.getCurrentLoggedInMerchant(userModule);
        }

        public static void start(com.zettle.sdk.core.user.UserModule userModule) {
            com.zettle.sdk.core.Module.DefaultImpls.start(userModule);
        }

        public static void stop(com.zettle.sdk.core.user.UserModule userModule) {
            com.zettle.sdk.core.Module.DefaultImpls.stop(userModule);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/core/user/UserModule$Companion;", "", "<init>", "()V", "", "DEV_FLAG_SIMULATE_US", "Ljava/lang/String;", "Ljava/lang/Class;", "Lcom/zettle/sdk/core/user/UserModule;", "TYPE", "Ljava/lang/Class;", "getTYPE$core_publicRelease", "()Ljava/lang/Class;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String DEV_FLAG_SIMULATE_US = "SIMULATE_UI_FOR_US_USER";
        static final /* synthetic */ com.zettle.sdk.core.user.UserModule.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.core.user.UserModule.Companion();
        private static final java.lang.Class<com.zettle.sdk.core.user.UserModule> TYPE = com.zettle.sdk.core.user.UserModule.class;

        private Companion() {
        }

        public final java.lang.Class<com.zettle.sdk.core.user.UserModule> getTYPE$core_publicRelease() {
            return TYPE;
        }
    }
}
