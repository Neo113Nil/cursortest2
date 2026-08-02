package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "service", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/commons/SecureStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/zettle/sdk/core/auth/merchant/UserConfigRepository;", "createUserConfigRepository", "(Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/commons/SecureStorage;)Lcom/zettle/sdk/core/auth/merchant/UserConfigRepository;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserConfigRepositoryKt {
    public static final com.zettle.sdk.core.auth.merchant.UserConfigRepository createUserConfigRepository(com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.commons.SecureStorage secureStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureStorage, "");
        return new com.zettle.sdk.core.auth.merchant.UserConfigRepositoryImpl(networkModule, serviceProvider, appInfo, secureStorage);
    }
}
