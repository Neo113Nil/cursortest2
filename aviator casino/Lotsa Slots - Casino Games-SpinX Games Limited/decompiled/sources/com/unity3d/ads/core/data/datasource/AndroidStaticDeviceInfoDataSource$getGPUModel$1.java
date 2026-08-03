package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", i = {}, l = {500}, m = "getGPUModel", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidStaticDeviceInfoDataSource$getGPUModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidStaticDeviceInfoDataSource$getGPUModel$1(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1> continuation) {
        super(continuation);
        this.this$0 = androidStaticDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object gPUModel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        gPUModel = this.this$0.getGPUModel(this);
        return gPUModel;
    }
}
