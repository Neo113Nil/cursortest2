package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/core/log/UploaderProd;", "Lkotlin/Function2;", "Ljava/io/File;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "", "Lcom/zettle/sdk/core/network/NetworkModule;", "p0", "<init>", "(Lcom/zettle/sdk/core/network/NetworkModule;)V", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/network/NetworkModule;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class UploaderProd implements kotlin.jvm.functions.Function2<java.io.File, com.zettle.sdk.commons.network.NetworkClient.Callback, kotlin.Unit> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.core.network.NetworkModule getHighSpeedVideoFpsRanges;

    public UploaderProd(com.zettle.sdk.core.network.NetworkModule networkModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
        this.getHighSpeedVideoFpsRanges = networkModule;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.io.File file, com.zettle.sdk.commons.network.NetworkClient.Callback callback) {
        java.io.File file2 = file;
        com.zettle.sdk.commons.network.NetworkClient.Callback callback2 = callback;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback2, "");
        com.zettle.sdk.core.network.NetworkModule.DefaultImpls.createNetworkClient$default(this.getHighSpeedVideoFpsRanges, com.zettle.sdk.commons.network.Service.ApiAuthenticated, com.zettle.sdk.commons.network.Scope.Payment, null, null, 0L, 0L, 0L, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null).upload("mobile/user-data-uploads", "FILE", file2, "text/plain", "Android-".concat(java.lang.String.valueOf(file2.getName())), callback2);
        return kotlin.Unit.INSTANCE;
    }
}
