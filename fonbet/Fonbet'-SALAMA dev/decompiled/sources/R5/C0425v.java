package R5;

import android.webkit.JavascriptInterface;

/* renamed from: R5.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0425v {

    /* renamed from: a, reason: collision with root package name */
    public final String f6215a;

    /* renamed from: b, reason: collision with root package name */
    public final C0426w f6216b;

    public C0425v(String str, C0426w c0426w) {
        this.f6215a = str;
        this.f6216b = c0426w;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        C0426w c0426w = this.f6216b;
        c0426w.f6217a.l(new K5.a(5, this, str));
    }
}
