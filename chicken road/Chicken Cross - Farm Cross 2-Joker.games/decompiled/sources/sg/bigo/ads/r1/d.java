package sg.bigo.ads.r1;

import android.os.SystemClock;
import android.util.Log;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13271a;
    public final /* synthetic */ g b;

    public d(g gVar, String str) {
        this.b = gVar;
        this.f13271a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.b;
        String str = this.f13271a;
        gVar.getClass();
        try {
            if (gVar.g) {
                gVar.f13273a.reset();
                gVar.f13273a.setDataSource(str);
                g gVar2 = this.b;
                gVar2.getClass();
                try {
                    SystemClock.elapsedRealtime();
                    gVar2.f13273a.prepareAsync();
                    gVar = gVar2;
                } catch (Exception e) {
                    f fVar = gVar2.d;
                    if (fVar != null) {
                        n nVar = (n) fVar;
                        nVar.a(10, gVar2.l, Log.getStackTraceString(e));
                    }
                    gVar2.a(10);
                    AbstractC5496a.a("MediaPlayerWrapper", "Player prepareAsync failed");
                    gVar = "Player prepareAsync failed";
                }
            } else {
                AbstractC5496a.b("MediaPlayerWrapper", "Surface is not available, setDataSource cancel");
                gVar = gVar;
            }
        } catch (Exception e2) {
            AbstractC5496a.a("MediaPlayerWrapper", "Player setDataSource failed");
            if (gVar.d != null) {
                if (!gVar.k || gVar.l >= 3) {
                    AbstractC5496a.b("MediaPlayerWrapper", "setDataSource called onError");
                    ((n) gVar.d).a(1, -1004);
                }
                f fVar2 = gVar.d;
                n nVar2 = (n) fVar2;
                nVar2.a(9, gVar.l, Log.getStackTraceString(e2));
            }
            gVar.a(9);
        }
    }
}
