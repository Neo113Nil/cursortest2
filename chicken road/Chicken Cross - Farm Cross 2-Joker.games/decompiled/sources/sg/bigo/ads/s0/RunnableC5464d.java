package sg.bigo.ads.s0;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.util.concurrent.Executor;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* renamed from: sg.bigo.ads.s0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5464d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5470j f13287a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Context c;

    public RunnableC5464d(Context context, Executor executor, C5470j c5470j) {
        this.f13287a = c5470j;
        this.b = executor;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        MimeTypeMap singleton;
        String fileExtensionFromUrl;
        int i;
        boolean z;
        C5470j c5470j = this.f13287a;
        Executor executor = this.b;
        Context context = this.c;
        if (c5470j.e) {
            return;
        }
        c5470j.e = true;
        sg.bigo.ads.B0.a aVar = new sg.bigo.ads.B0.a(sg.bigo.ads.G0.a.f12309a.incrementAndGet(), new sg.bigo.ads.B0.d(c5470j.f13291a), c5470j.c, context);
        if (executor == null) {
            sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
            if (jVar != null) {
                i = jVar.g;
                z = jVar.a(12);
            } else {
                i = 5;
                z = false;
            }
            executor = AbstractRunnableC5522h.a("CreativeNet", i, z);
        }
        aVar.c = executor;
        String str2 = c5470j.f13291a;
        try {
            singleton = MimeTypeMap.getSingleton();
            fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str2);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            str = null;
            AbstractC5507g.a(aVar, new C5469i(c5470j, context, str));
        } else {
            str = singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
            AbstractC5507g.a(aVar, new C5469i(c5470j, context, str));
        }
    }
}
