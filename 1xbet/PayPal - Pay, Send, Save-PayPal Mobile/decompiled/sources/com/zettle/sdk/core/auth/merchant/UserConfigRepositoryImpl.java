package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/UserConfigRepositoryImpl;", "Lcom/zettle/sdk/core/auth/merchant/UserConfigRepository;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "service", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/commons/SecureStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/commons/SecureStorage;)V", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "fetchRemoteUserConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserConfigRepositoryImpl implements com.zettle.sdk.core.auth.merchant.UserConfigRepository, com.zettle.sdk.core.log.Loggable {
    @Override // com.zettle.sdk.core.auth.merchant.UserConfigRepository
    public final java.lang.Object fetchRemoteUserConfig(kotlin.coroutines.Continuation<? super com.zettle.sdk.core.user.userconfig.UserConfig> continuation) {
        return null;
    }

    public UserConfigRepositoryImpl(com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.commons.SecureStorage secureStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureStorage, "");
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }
}
