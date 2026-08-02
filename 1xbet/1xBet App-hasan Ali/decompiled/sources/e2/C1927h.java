package e2;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: e2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1927h implements InterfaceC1935p {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f16906k = new String[0];

    @Override // e2.InterfaceC1935p
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // e2.InterfaceC1935p
    public final String[] d() {
        return f16906k;
    }

    @Override // e2.InterfaceC1935p
    public final StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
