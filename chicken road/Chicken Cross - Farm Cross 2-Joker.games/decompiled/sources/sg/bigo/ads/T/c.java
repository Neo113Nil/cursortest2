package sg.bigo.ads.T;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;

/* loaded from: classes3.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public CustomTabsSession f12543a;
    public CustomTabsClient b;
    public b c;
    public CustomTabsCallback d;

    public static void a(Context context, CustomTabsIntent customTabsIntent, Uri uri, sg.bigo.ads.S.c cVar) {
        d a2 = e.a(context);
        if (a2 == null || !a2.f12544a) {
            sg.bigo.ads.S.a aVar = cVar.f12527a;
            if (aVar != null) {
                aVar.a(context, cVar.b, 2, a2 == null ? "" : a2.b);
                return;
            }
            return;
        }
        customTabsIntent.intent.setPackage(a2.e);
        customTabsIntent.launchUrl(context, uri);
        sg.bigo.ads.S.a aVar2 = cVar.f12527a;
        if (aVar2 != null) {
            aVar2.a(a2.e, a2.d, a2.c);
        }
    }
}
