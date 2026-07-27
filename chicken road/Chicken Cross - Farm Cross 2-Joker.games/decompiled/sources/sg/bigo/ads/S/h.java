package sg.bigo.ads.S;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import sg.bigo.ads.a0.o;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12532a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e = true;
    public final /* synthetic */ Bitmap f = null;
    public final /* synthetic */ sg.bigo.ads.Y0.i g;
    public final /* synthetic */ a h;

    public h(Context context, String str, sg.bigo.ads.Y0.i iVar, a aVar) {
        this.f12532a = context;
        this.b = str;
        this.g = iVar;
        this.h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Uri uri;
        f fVar = f.i;
        Context context = this.f12532a;
        String str = this.b;
        int i = this.c;
        int i2 = this.d;
        boolean z = this.e;
        Bitmap bitmap = this.f;
        sg.bigo.ads.Y0.i iVar = this.g;
        a aVar = this.h;
        fVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            fVar.b.remove(str);
        }
        Thread.currentThread().getName();
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            uri = null;
        }
        if (uri == null) {
            AbstractC5496a.a("ChromeTabsStatic", "Stop open chrome tab with error url.");
            if (aVar != null) {
                aVar.a(context, str, 3, "Invalid url");
                return;
            }
            return;
        }
        fVar.a(context);
        fVar.f12530a.d = new b(fVar, iVar);
        sg.bigo.ads.T.c cVar = fVar.f12530a;
        CustomTabsClient customTabsClient = cVar.b;
        if (customTabsClient == null) {
            cVar.f12543a = null;
        } else if (cVar.f12543a == null) {
            cVar.f12543a = customTabsClient.newSession(new sg.bigo.ads.T.a(cVar));
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(cVar.f12543a);
        if (i != 0) {
            builder.setToolbarColor(i);
        }
        if (i2 != 0) {
            builder.setSecondaryToolbarColor(i2);
        }
        if (bitmap != null) {
            builder.setCloseButtonIcon(bitmap);
        }
        builder.setShowTitle(z);
        CustomTabsIntent build = builder.build();
        try {
            Context a2 = o.a();
            if (a2 == null) {
                a2 = context;
            }
            sg.bigo.ads.T.c.a(a2, build, uri, new c(aVar, str));
        } catch (Exception e) {
            if (aVar != null) {
                aVar.a(context, str, 4, e.toString());
            }
            fVar.f12530a.d = null;
        }
    }
}
