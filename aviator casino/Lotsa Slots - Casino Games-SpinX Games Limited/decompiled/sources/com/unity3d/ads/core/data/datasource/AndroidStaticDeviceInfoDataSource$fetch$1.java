package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", i = {0, 0}, l = {101}, m = com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, n = {"this", "additionalStores"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class AndroidStaticDeviceInfoDataSource$fetch$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidStaticDeviceInfoDataSource$fetch$1(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1> continuation) {
        super(continuation);
        this.this$0 = androidStaticDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetch(null, this);
    }
}
