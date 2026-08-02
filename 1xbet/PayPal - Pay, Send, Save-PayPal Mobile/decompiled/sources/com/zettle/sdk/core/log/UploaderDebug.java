package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/core/log/UploaderDebug;", "Lkotlin/Function2;", "Ljava/io/File;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class UploaderDebug implements kotlin.jvm.functions.Function2<java.io.File, com.zettle.sdk.commons.network.NetworkClient.Callback, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.io.File file, com.zettle.sdk.commons.network.NetworkClient.Callback callback) {
        com.zettle.sdk.commons.network.NetworkClient.Callback callback2 = callback;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback2, "");
        callback2.onResponse(new com.zettle.sdk.commons.network.NetworkClient.Response() { // from class: com.zettle.sdk.core.log.UploaderDebug$invoke$response$1
            private final int code = 200;
            private final boolean isSuccessful = true;

            @Override // com.zettle.sdk.commons.network.NetworkClient.Response
            public final java.lang.String body() {
                return null;
            }

            @Override // com.zettle.sdk.commons.network.NetworkClient.Response
            public final java.lang.String errorBody() {
                return null;
            }

            @Override // com.zettle.sdk.commons.network.NetworkClient.Response
            public final void invalidateUrl() {
            }

            @Override // com.zettle.sdk.commons.network.NetworkClient.Response
            public final int getCode() {
                return this.code;
            }

            @Override // com.zettle.sdk.commons.network.NetworkClient.Response
            /* renamed from: isSuccessful, reason: from getter */
            public final boolean getIsSuccessful() {
                return this.isSuccessful;
            }

            @Override // com.zettle.sdk.commons.network.NetworkClient.Response
            public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers() {
                return kotlin.collections.MapsKt.emptyMap();
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
