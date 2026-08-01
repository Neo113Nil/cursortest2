package sg.bigo.ads.T;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class f extends CustomTabsServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12546a;

    public f(c cVar) {
        this.f12546a = new WeakReference(cVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        g gVar = (g) this.f12546a.get();
        if (gVar != null) {
            c cVar = (c) gVar;
            cVar.b = customTabsClient;
            customTabsClient.warmup(0L);
            b bVar = cVar.c;
            if (bVar != null) {
                sg.bigo.ads.S.f fVar = (sg.bigo.ads.S.f) bVar;
                fVar.f = true;
                fVar.e = false;
                if (fVar.h) {
                    return;
                }
                fVar.a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar = (g) this.f12546a.get();
        if (gVar != null) {
            c cVar = (c) gVar;
            cVar.b = null;
            cVar.f12543a = null;
            b bVar = cVar.c;
            if (bVar != null) {
                sg.bigo.ads.S.f fVar = (sg.bigo.ads.S.f) bVar;
                fVar.f = false;
                fVar.e = false;
            }
        }
    }
}
