package sg.bigo.ads.X0;

import android.os.SystemClock;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12617a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ z e;

    public w(z zVar, int i, int i2, String str, int i3) {
        this.e = zVar;
        this.f12617a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar;
        int i;
        String e;
        AbstractC5496a.a("GlobalConfig", "request error, seq=" + this.f12617a + ", error=" + this.b + ", message=" + this.c);
        String str = "Error from server: " + this.c;
        if (this.d == -9) {
            zVar = this.e;
            i = 1105;
        } else {
            zVar = this.e;
            i = 1104;
        }
        zVar.b(i, str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        z zVar2 = this.e;
        long j = elapsedRealtime - zVar2.g;
        int i2 = this.b;
        int i3 = this.d;
        String str2 = this.c;
        int i4 = zVar2.j;
        boolean z = zVar2.h;
        int i5 = zVar2.i.get();
        sg.bigo.ads.U.h hVar = this.e.f12619a;
        if (hVar == null) {
            e = null;
        } else {
            ((u) hVar).getClass();
            e = sg.bigo.ads.F0.a.e();
        }
        sg.bigo.ads.s1.b.a(j, i2, i3, str2, i4, z, i5, e);
    }
}
