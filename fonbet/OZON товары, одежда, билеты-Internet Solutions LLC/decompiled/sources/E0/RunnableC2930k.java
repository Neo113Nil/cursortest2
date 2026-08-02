package E0;

import androidx.camera.core.impl.AbstractC5111p;
import java.util.function.IntConsumer;
import ru.ozon.app.android.web.webview.client.chrome.OzonFullscreenWebChromeClientDelegate;

/* renamed from: E0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC2930k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7257c;

    public /* synthetic */ RunnableC2930k(int i11, int i12, Object obj) {
        this.f7255a = i12;
        this.f7257c = obj;
        this.f7256b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7255a) {
            case 0:
                ((IntConsumer) this.f7257c).accept(this.f7256b);
                break;
            case 1:
                OzonFullscreenWebChromeClientDelegate.recoverScrollPosition$lambda$3((OzonFullscreenWebChromeClientDelegate) this.f7257c, this.f7256b);
                break;
            default:
                ((AbstractC5111p) this.f7257c).a(this.f7256b);
                break;
        }
    }
}
