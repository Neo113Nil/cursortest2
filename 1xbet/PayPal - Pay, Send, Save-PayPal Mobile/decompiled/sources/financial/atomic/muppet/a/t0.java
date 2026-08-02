package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class t0 extends android.webkit.WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.Page f6799a;

    public t0(financial.atomic.muppet.Page page) {
        this.f6799a = page;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(android.webkit.WebView webView) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6799a.getGetHighSpeedVideoSizesFor(), null, null, new financial.atomic.muppet.a.o0(this.f6799a, null), 3, null);
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6799a.getGetHighSpeedVideoSizesFor(), null, null, new financial.atomic.muppet.a.p0(this.f6799a, consoleMessage, null), 3, null);
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
        if (webView == null || message == null) {
            return false;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6799a.getGetHighSpeedVideoSizesFor(), kotlinx.coroutines.Dispatchers.getMain(), null, new financial.atomic.muppet.a.r0(this.f6799a, message, null), 2, null);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
        financial.atomic.muppet.a.n1 highSpeedVideoFpsRanges;
        if (permissionRequest == null) {
            return;
        }
        java.lang.String[] resources = permissionRequest.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
        if (!kotlin.collections.ArraysKt.contains(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
            permissionRequest.deny();
            return;
        }
        if (androidx.core.content.ContextCompat.checkSelfPermission(financial.atomic.muppet.Page.access$get_wv(this.f6799a).getContext(), "android.permission.CAMERA") == 0) {
            permissionRequest.grant(new java.lang.String[]{"android.webkit.resource.VIDEO_CAPTURE"});
            return;
        }
        highSpeedVideoFpsRanges = this.f6799a.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges != null) {
            highSpeedVideoFpsRanges.a(permissionRequest);
        } else {
            permissionRequest.grant(new java.lang.String[]{"android.webkit.resource.VIDEO_CAPTURE"});
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView webView, int i) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6799a.getGetHighSpeedVideoSizesFor(), null, null, new financial.atomic.muppet.a.s0(this.f6799a, i, null), 3, null);
        super.onProgressChanged(webView, i);
    }
}
