package sg.bigo.ads.C;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.net.URI;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5087a f12240a;
    public final /* synthetic */ w b;

    public u(w wVar, InterfaceC5087a interfaceC5087a) {
        this.b = wVar;
        this.f12240a = interfaceC5087a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String a2 = sg.bigo.ads.U.q.a(((sg.bigo.ads.U0.k) this.f12240a).j(), this.b.k.e);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            File file = new File(URI.create(a2));
            if (!file.exists() || file.length() <= 0) {
                return;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
            this.b.U = sg.bigo.ads.E0.p.a(decodeFile);
        } catch (Throwable unused) {
        }
    }
}
