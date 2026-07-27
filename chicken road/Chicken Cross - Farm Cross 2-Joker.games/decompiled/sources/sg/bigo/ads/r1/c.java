package sg.bigo.ads.r1;

import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f13270a;

    public c(g gVar) {
        this.f13270a = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r3 <= 0) goto L36;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        f fVar = this.f13270a.d;
        if (fVar != null) {
            n nVar = (n) fVar;
            int adRemainingTime = nVar.getAdRemainingTime();
            if (nVar.G && (str = nVar.o) != null && !str.startsWith("file:")) {
                if (nVar.D == adRemainingTime) {
                    if (!nVar.E) {
                        if (nVar.p == null) {
                            nVar.h();
                        }
                        nVar.p.setVisibility(0);
                        nVar.C = true;
                        nVar.a("AdVideoBuffering", (int[]) null);
                    }
                    nVar.E = true;
                } else {
                    if (nVar.E) {
                        if (nVar.p == null) {
                            nVar.h();
                        }
                        nVar.p.setVisibility(8);
                        nVar.C = false;
                        nVar.a("AdVideoBuffered", (int[]) null);
                    }
                    nVar.E = false;
                }
                nVar.D = adRemainingTime;
            }
            if (nVar.F <= 0) {
                int adDuration = nVar.getAdDuration();
                nVar.F = adDuration;
            }
            int i = nVar.F;
            if (adRemainingTime > i) {
                adRemainingTime = i;
            }
            nVar.s = adRemainingTime;
            nVar.a("AdRemainingTimeChange", new int[]{adRemainingTime, i, (int) ((adRemainingTime * 100.0f) / i)});
        }
        g gVar = this.f13270a;
        int i2 = gVar.e;
        if (i2 == 3 || i2 == 4 || i2 == 5) {
            return;
        }
        AbstractC5446j.a(2, null, gVar.h, 500L);
    }
}
