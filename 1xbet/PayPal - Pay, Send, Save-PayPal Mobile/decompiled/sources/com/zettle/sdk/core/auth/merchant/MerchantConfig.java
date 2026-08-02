package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\n\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\b0\u0007H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\f2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\b0\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "Lcom/zettle/sdk/core/Module;", "Lkotlin/Result;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "getUserConfig-d1pmJ48", "()Ljava/lang/Object;", "getUserConfig", "Lkotlin/Function1;", "", "onResult", "getUserConfigAsync", "(Lkotlin/jvm/functions/Function1;)V", "", "isLoggedIn", "()Z", "force", "syncUserConfig", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/commons/state/State;", "getUserConfigState", "()Lcom/zettle/sdk/commons/state/State;", "userConfigState", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MerchantConfig extends com.zettle.sdk.core.Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.auth.merchant.MerchantConfig.Companion INSTANCE = com.zettle.sdk.core.auth.merchant.MerchantConfig.Companion.getHighSpeedVideoFpsRanges;

    /* renamed from: getUserConfig-d1pmJ48, reason: not valid java name */
    java.lang.Object mo23163getUserConfigd1pmJ48();

    void getUserConfigAsync(kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> onResult);

    com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> getUserConfigState();

    boolean isLoggedIn();

    java.lang.Object syncUserConfig(boolean z, kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void start(com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig) {
            com.zettle.sdk.core.Module.DefaultImpls.start(merchantConfig);
        }

        public static void stop(com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig) {
            com.zettle.sdk.core.Module.DefaultImpls.stop(merchantConfig);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object syncUserConfig$default(com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncUserConfig");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                function1 = new kotlin.jvm.functions.Function1<kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantConfig$syncUserConfig$1
                    public final void getHighSpeedVideoFpsRanges(java.lang.Object obj2) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig> result) {
                        getHighSpeedVideoFpsRanges(result.getCamera2StreamConfigurationMap());
                        return kotlin.Unit.INSTANCE;
                    }
                };
            }
            return merchantConfig.syncUserConfig(z, function1, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/MerchantConfig$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory;", "merchantConfigFactory", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "create$core_publicRelease", "(Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory;)Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "Ljava/lang/Class;", "TYPE", "Ljava/lang/Class;", "getTYPE$core_publicRelease", "()Ljava/lang/Class;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantConfig.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.core.auth.merchant.MerchantConfig.Companion();
        private static final java.lang.Class<com.zettle.sdk.core.auth.merchant.MerchantConfig> TYPE = com.zettle.sdk.core.auth.merchant.MerchantConfig.class;

        private Companion() {
        }

        public final java.lang.Class<com.zettle.sdk.core.auth.merchant.MerchantConfig> getTYPE$core_publicRelease() {
            return TYPE;
        }

        public final com.zettle.sdk.core.auth.merchant.MerchantConfig create$core_publicRelease(com.zettle.sdk.core.auth.merchant.MerchantConfigFactory merchantConfigFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfigFactory, "");
            return merchantConfigFactory.create();
        }
    }
}
