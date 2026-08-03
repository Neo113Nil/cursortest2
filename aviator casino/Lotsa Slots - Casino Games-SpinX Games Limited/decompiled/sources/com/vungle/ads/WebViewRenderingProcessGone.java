package com.vungle.ads;

/* compiled from: VungleError.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/WebViewRenderingProcessGone;", "Lcom/vungle/ads/VungleError;", "message", "", "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class WebViewRenderingProcessGone extends com.vungle.ads.VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public WebViewRenderingProcessGone() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WebViewRenderingProcessGone(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public WebViewRenderingProcessGone(java.lang.String str) {
        super(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR, "WebRenderingProcessGone: " + str, null);
    }
}
