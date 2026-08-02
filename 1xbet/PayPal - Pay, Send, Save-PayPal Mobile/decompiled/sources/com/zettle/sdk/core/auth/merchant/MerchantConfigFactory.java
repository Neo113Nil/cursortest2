package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory;", "", "<init>", "()V", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "create", "()Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "DefaultDetailedConfig", "ProviderDetailedConfig", "ProviderSimplifiedConfig", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory$DefaultDetailedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory$ProviderDetailedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory$ProviderSimplifiedConfig;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class MerchantConfigFactory {
    public abstract com.zettle.sdk.core.auth.merchant.MerchantConfig create();

    private MerchantConfigFactory() {
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory$DefaultDetailedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory;", "Lcom/izettle/android/auth/ZettleAuth;", "auth", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "publicApi", "<init>", "(Lcom/izettle/android/auth/ZettleAuth;Landroidx/lifecycle/MutableLiveData;)V", "copy", "(Lcom/izettle/android/auth/ZettleAuth;Landroidx/lifecycle/MutableLiveData;)Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory$DefaultDetailedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantDefaultDetailedConfig;", "create", "()Lcom/zettle/sdk/core/auth/merchant/MerchantDefaultDetailedConfig;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/izettle/android/auth/ZettleAuth;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DefaultDetailedConfig extends com.zettle.sdk.core.auth.merchant.MerchantConfigFactory {
        private final androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.izettle.android.auth.ZettleAuth getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultDetailedConfig(com.izettle.android.auth.ZettleAuth zettleAuth, androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> mutableLiveData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
            this.getHighSpeedVideoSizes = zettleAuth;
            this.Camera2StreamConfigurationMap = mutableLiveData;
        }

        @Override // com.zettle.sdk.core.auth.merchant.MerchantConfigFactory
        public final com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig create() {
            return new com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        }

        public final java.lang.String toString() {
            com.izettle.android.auth.ZettleAuth zettleAuth = this.getHighSpeedVideoSizes;
            androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> mutableLiveData = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultDetailedConfig(getHighSpeedVideoSizes=");
            sb.append(zettleAuth);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(mutableLiveData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoSizes.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.DefaultDetailedConfig)) {
                return false;
            }
            com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.DefaultDetailedConfig defaultDetailedConfig = (com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.DefaultDetailedConfig) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, defaultDetailedConfig.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, defaultDetailedConfig.Camera2StreamConfigurationMap);
        }

        public final com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.DefaultDetailedConfig copy(com.izettle.android.auth.ZettleAuth auth, androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> publicApi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auth, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicApi, "");
            return new com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.DefaultDetailedConfig(auth, publicApi);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.DefaultDetailedConfig copy$default(com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.DefaultDetailedConfig defaultDetailedConfig, com.izettle.android.auth.ZettleAuth zettleAuth, androidx.view.MutableLiveData mutableLiveData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                zettleAuth = defaultDetailedConfig.getHighSpeedVideoSizes;
            }
            if ((i & 2) != 0) {
                mutableLiveData = defaultDetailedConfig.Camera2StreamConfigurationMap;
            }
            return defaultDetailedConfig.copy(zettleAuth, mutableLiveData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JR\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010*R\u0014\u0010-\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory$ProviderDetailedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory;", "Lcom/zettle/sdk/core/auth/AuthModule;", "authModule", "Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "service", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "publicApi", "Lcom/zettle/sdk/commons/SecureStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Lcom/zettle/sdk/core/auth/AuthModule;Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/zettle/sdk/meta/AppInfo;Landroidx/lifecycle/MutableLiveData;Lcom/zettle/sdk/commons/SecureStorage;)V", "copy", "(Lcom/zettle/sdk/core/auth/AuthModule;Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/zettle/sdk/meta/AppInfo;Landroidx/lifecycle/MutableLiveData;Lcom/zettle/sdk/commons/SecureStorage;)Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory$ProviderDetailedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantProviderDetailedConfig;", "create", "()Lcom/zettle/sdk/core/auth/merchant/MerchantProviderDetailedConfig;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/meta/AppInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/core/auth/AuthModule;", "Lcom/zettle/sdk/core/network/NetworkModule;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "getOutputMinFrameDuration", "Lcom/zettle/sdk/commons/SecureStorage;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ProviderDetailedConfig extends com.zettle.sdk.core.auth.merchant.MerchantConfigFactory {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final com.zettle.sdk.core.auth.AuthModule getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.zettle.sdk.core.network.NetworkModule getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.zettle.sdk.meta.AppInfo getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final com.zettle.sdk.core.auth.ServiceProvider getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> Camera2StreamConfigurationMap;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private final com.zettle.sdk.commons.SecureStorage getHighSpeedVideoSizesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderDetailedConfig(com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.zettle.sdk.meta.AppInfo appInfo, androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> mutableLiveData, com.zettle.sdk.commons.SecureStorage secureStorage) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureStorage, "");
            this.getHighSpeedVideoFpsRanges = authModule;
            this.getHighSpeedVideoFpsRangesFor = networkModule;
            this.getHighSpeedVideoSizes = serviceProvider;
            this.getHighResolutionOutputSizeshNQ4ISI = appInfo;
            this.Camera2StreamConfigurationMap = mutableLiveData;
            this.getHighSpeedVideoSizesFor = secureStorage;
        }

        @Override // com.zettle.sdk.core.auth.merchant.MerchantConfigFactory
        public final com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig create() {
            return new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor);
        }

        public final java.lang.String toString() {
            com.zettle.sdk.core.auth.AuthModule authModule = this.getHighSpeedVideoFpsRanges;
            com.zettle.sdk.core.network.NetworkModule networkModule = this.getHighSpeedVideoFpsRangesFor;
            com.zettle.sdk.core.auth.ServiceProvider serviceProvider = this.getHighSpeedVideoSizes;
            com.zettle.sdk.meta.AppInfo appInfo = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> mutableLiveData = this.Camera2StreamConfigurationMap;
            com.zettle.sdk.commons.SecureStorage secureStorage = this.getHighSpeedVideoSizesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProviderDetailedConfig(getHighSpeedVideoFpsRanges=");
            sb.append(authModule);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(networkModule);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(serviceProvider);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(appInfo);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(mutableLiveData);
            sb.append(", getHighSpeedVideoSizesFor=");
            sb.append(secureStorage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighSpeedVideoSizesFor.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderDetailedConfig)) {
                return false;
            }
            com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderDetailedConfig providerDetailedConfig = (com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderDetailedConfig) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, providerDetailedConfig.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, providerDetailedConfig.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, providerDetailedConfig.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, providerDetailedConfig.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, providerDetailedConfig.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizesFor, providerDetailedConfig.getHighSpeedVideoSizesFor);
        }

        public final com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderDetailedConfig copy(com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider service, com.zettle.sdk.meta.AppInfo appInfo, androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> publicApi, com.zettle.sdk.commons.SecureStorage storage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicApi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
            return new com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderDetailedConfig(authModule, networkModule, service, appInfo, publicApi, storage);
        }

        public static /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderDetailedConfig copy$default(com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderDetailedConfig providerDetailedConfig, com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.zettle.sdk.meta.AppInfo appInfo, androidx.view.MutableLiveData mutableLiveData, com.zettle.sdk.commons.SecureStorage secureStorage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authModule = providerDetailedConfig.getHighSpeedVideoFpsRanges;
            }
            if ((i & 2) != 0) {
                networkModule = providerDetailedConfig.getHighSpeedVideoFpsRangesFor;
            }
            com.zettle.sdk.core.network.NetworkModule networkModule2 = networkModule;
            if ((i & 4) != 0) {
                serviceProvider = providerDetailedConfig.getHighSpeedVideoSizes;
            }
            com.zettle.sdk.core.auth.ServiceProvider serviceProvider2 = serviceProvider;
            if ((i & 8) != 0) {
                appInfo = providerDetailedConfig.getHighResolutionOutputSizeshNQ4ISI;
            }
            com.zettle.sdk.meta.AppInfo appInfo2 = appInfo;
            if ((i & 16) != 0) {
                mutableLiveData = providerDetailedConfig.Camera2StreamConfigurationMap;
            }
            androidx.view.MutableLiveData mutableLiveData2 = mutableLiveData;
            if ((i & 32) != 0) {
                secureStorage = providerDetailedConfig.getHighSpeedVideoSizesFor;
            }
            return providerDetailedConfig.copy(authModule, networkModule2, serviceProvider2, appInfo2, mutableLiveData2, secureStorage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JR\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory$ProviderSimplifiedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory;", "Lcom/zettle/sdk/core/auth/AuthModule;", "authModule", "Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "service", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "publicApi", "Lcom/zettle/sdk/commons/SecureStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Lcom/zettle/sdk/core/auth/AuthModule;Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/zettle/sdk/meta/AppInfo;Landroidx/lifecycle/MutableLiveData;Lcom/zettle/sdk/commons/SecureStorage;)V", "copy", "(Lcom/zettle/sdk/core/auth/AuthModule;Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/zettle/sdk/meta/AppInfo;Landroidx/lifecycle/MutableLiveData;Lcom/zettle/sdk/commons/SecureStorage;)Lcom/zettle/sdk/core/auth/merchant/MerchantConfigFactory$ProviderSimplifiedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantProviderSimplifiedConfig;", "create", "()Lcom/zettle/sdk/core/auth/merchant/MerchantProviderSimplifiedConfig;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/core/auth/AuthModule;", "Lcom/zettle/sdk/core/network/NetworkModule;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/MutableLiveData;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "getOutputFormats", "Lcom/zettle/sdk/commons/SecureStorage;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ProviderSimplifiedConfig extends com.zettle.sdk.core.auth.merchant.MerchantConfigFactory {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.zettle.sdk.core.auth.AuthModule getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final com.zettle.sdk.core.network.NetworkModule Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final com.zettle.sdk.core.auth.ServiceProvider getHighResolutionOutputSizeshNQ4ISI;
        private final com.zettle.sdk.commons.SecureStorage getOutputFormats;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderSimplifiedConfig(com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.zettle.sdk.meta.AppInfo appInfo, androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> mutableLiveData, com.zettle.sdk.commons.SecureStorage secureStorage) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureStorage, "");
            this.getHighSpeedVideoFpsRanges = authModule;
            this.Camera2StreamConfigurationMap = networkModule;
            this.getHighResolutionOutputSizeshNQ4ISI = serviceProvider;
            this.getHighSpeedVideoFpsRangesFor = appInfo;
            this.getHighSpeedVideoSizes = mutableLiveData;
            this.getOutputFormats = secureStorage;
        }

        @Override // com.zettle.sdk.core.auth.merchant.MerchantConfigFactory
        public final com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig create() {
            com.zettle.sdk.core.auth.AuthModule authModule = this.getHighSpeedVideoFpsRanges;
            androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> mutableLiveData = this.getHighSpeedVideoSizes;
            com.zettle.sdk.commons.SecureStorage secureStorage = this.getOutputFormats;
            com.zettle.sdk.core.network.NetworkModule networkModule = this.Camera2StreamConfigurationMap;
            com.zettle.sdk.core.auth.ServiceProvider serviceProvider = this.getHighResolutionOutputSizeshNQ4ISI;
            return new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig(authModule, mutableLiveData, secureStorage, com.zettle.sdk.core.auth.merchant.UserConfigRepositoryKt.createUserConfigRepository(networkModule, serviceProvider, this.getHighSpeedVideoFpsRangesFor, secureStorage), networkModule, serviceProvider, null, 64, null);
        }

        public final java.lang.String toString() {
            com.zettle.sdk.core.auth.AuthModule authModule = this.getHighSpeedVideoFpsRanges;
            com.zettle.sdk.core.network.NetworkModule networkModule = this.Camera2StreamConfigurationMap;
            com.zettle.sdk.core.auth.ServiceProvider serviceProvider = this.getHighResolutionOutputSizeshNQ4ISI;
            com.zettle.sdk.meta.AppInfo appInfo = this.getHighSpeedVideoFpsRangesFor;
            androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> mutableLiveData = this.getHighSpeedVideoSizes;
            com.zettle.sdk.commons.SecureStorage secureStorage = this.getOutputFormats;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProviderSimplifiedConfig(getHighSpeedVideoFpsRanges=");
            sb.append(authModule);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(networkModule);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(serviceProvider);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(appInfo);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(mutableLiveData);
            sb.append(", getOutputFormats=");
            sb.append(secureStorage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.getOutputFormats.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderSimplifiedConfig)) {
                return false;
            }
            com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderSimplifiedConfig providerSimplifiedConfig = (com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderSimplifiedConfig) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, providerSimplifiedConfig.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, providerSimplifiedConfig.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, providerSimplifiedConfig.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, providerSimplifiedConfig.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, providerSimplifiedConfig.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, providerSimplifiedConfig.getOutputFormats);
        }

        public final com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderSimplifiedConfig copy(com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider service, com.zettle.sdk.meta.AppInfo appInfo, androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> publicApi, com.zettle.sdk.commons.SecureStorage storage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicApi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
            return new com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderSimplifiedConfig(authModule, networkModule, service, appInfo, publicApi, storage);
        }

        public static /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderSimplifiedConfig copy$default(com.zettle.sdk.core.auth.merchant.MerchantConfigFactory.ProviderSimplifiedConfig providerSimplifiedConfig, com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.zettle.sdk.meta.AppInfo appInfo, androidx.view.MutableLiveData mutableLiveData, com.zettle.sdk.commons.SecureStorage secureStorage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authModule = providerSimplifiedConfig.getHighSpeedVideoFpsRanges;
            }
            if ((i & 2) != 0) {
                networkModule = providerSimplifiedConfig.Camera2StreamConfigurationMap;
            }
            com.zettle.sdk.core.network.NetworkModule networkModule2 = networkModule;
            if ((i & 4) != 0) {
                serviceProvider = providerSimplifiedConfig.getHighResolutionOutputSizeshNQ4ISI;
            }
            com.zettle.sdk.core.auth.ServiceProvider serviceProvider2 = serviceProvider;
            if ((i & 8) != 0) {
                appInfo = providerSimplifiedConfig.getHighSpeedVideoFpsRangesFor;
            }
            com.zettle.sdk.meta.AppInfo appInfo2 = appInfo;
            if ((i & 16) != 0) {
                mutableLiveData = providerSimplifiedConfig.getHighSpeedVideoSizes;
            }
            androidx.view.MutableLiveData mutableLiveData2 = mutableLiveData;
            if ((i & 32) != 0) {
                secureStorage = providerSimplifiedConfig.getOutputFormats;
            }
            return providerSimplifiedConfig.copy(authModule, networkModule2, serviceProvider2, appInfo2, mutableLiveData2, secureStorage);
        }
    }

    public /* synthetic */ MerchantConfigFactory(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
