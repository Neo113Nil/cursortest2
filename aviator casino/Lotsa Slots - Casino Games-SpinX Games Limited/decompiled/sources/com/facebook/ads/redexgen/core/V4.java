package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class V4 implements com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi {
    public static java.lang.String[] A04 = {"voPBjj5brgSJE0IwRb75go3GzJcvnTMA", "J1wnFcZJgSUrGWuJYgcC3S3AnUnV6DaW", "llX9DPYlWB8oU74zVWsUN0HTEWFOB3Un", "5Y7GwnMqNmRtmsztlHJac4MePUqBHcfA", "yIKXCcKqK5XToLwp", "ch8UU9t", "aylfh5n3ojaiLa86", "37SxUjf9oUYNOIJ9CYsuuXmfZZqWhF1X"};
    public android.os.Messenger A00;
    public com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final android.app.Service A03;

    public V4(android.app.Service service) {
        this.A03 = service;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (this.A00 != null) {
            return this.A00.getBinder();
        }
        java.lang.String[] strArr = A04;
        if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[1] = "O6YEFSdI74rZHmUftXmRNGVlzUJePZUI";
        strArr2[3] = "gwoVm4uiBtJW0ezJGOCNGmmGAUT6CAuw";
        return null;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi
    public final void onCreate() {
        com.facebook.ads.internal.util.process.ProcessUtils.setRemoteRenderingProcess(true);
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(this.A03).getInitApi().initialize(this.A03, null, null, 2);
        this.A00 = new android.os.Messenger(new com.facebook.ads.redexgen.core.V5(this.A03.getApplicationContext(), this.A01, this.A02));
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi
    public final void onDestroy() {
        com.facebook.ads.redexgen.core.X9.A00().A06();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi
    public final void setMessageHandler(com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.MessageHandler messageHandler) {
        this.A01 = messageHandler;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi
    public final void setPackageVerifier(com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        this.A02 = packageVerifier;
    }
}
