package sg.bigo.ads.Y0;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12632a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ f d;
    public final /* synthetic */ String e;
    public final /* synthetic */ g f;

    public e(g gVar, String str, Context context, int i, C5014d c5014d, String str2) {
        this.f = gVar;
        this.f12632a = str;
        this.b = context;
        this.c = i;
        this.d = c5014d;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f;
        int i = gVar.c;
        if (i == 1) {
            Uri parse = Uri.parse(this.f12632a);
            String str = parse.getScheme() + "://" + parse.getHost();
            g gVar2 = this.f;
            Context context = this.b;
            int i2 = this.c;
            f fVar = this.d;
            if (i2 == 0) {
                gVar2.a(context, str, fVar);
                return;
            }
            gVar2.getClass();
            if (i2 == 2) {
                gVar2.f = SystemClock.elapsedRealtime();
                C5012b c5012b = new C5012b(gVar2, fVar, str);
                sg.bigo.ads.S.j.a(context, str, c5012b, new sg.bigo.ads.S.g(context, str, c5012b));
                return;
            }
        } else {
            if (i != 4 && i != 5) {
                return;
            }
            Context context2 = this.b;
            String str2 = this.e;
            int i3 = this.c;
            f fVar2 = this.d;
            if (i3 == 0) {
                gVar.a(context2, str2, fVar2);
                return;
            } else if (i3 == 2) {
                gVar.f = SystemClock.elapsedRealtime();
                C5012b c5012b2 = new C5012b(gVar, fVar2, str2);
                sg.bigo.ads.S.j.a(context2, str2, c5012b2, new sg.bigo.ads.S.g(context2, str2, c5012b2));
                return;
            }
        }
        AbstractC5496a.a("Preload", "PreloadLand: error open type.");
    }
}
