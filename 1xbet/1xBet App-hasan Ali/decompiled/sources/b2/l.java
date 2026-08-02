package b2;

import g1.C1969c;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public C1969c[] f7252a;

    /* renamed from: b, reason: collision with root package name */
    public String f7253b;

    /* renamed from: c, reason: collision with root package name */
    public int f7254c;

    public l() {
        this.f7252a = null;
        this.f7254c = 0;
    }

    public C1969c[] getPathData() {
        return this.f7252a;
    }

    public String getPathName() {
        return this.f7253b;
    }

    public void setPathData(C1969c[] c1969cArr) {
        if (!G4.d.j(this.f7252a, c1969cArr)) {
            this.f7252a = G4.d.p(c1969cArr);
            return;
        }
        C1969c[] c1969cArr2 = this.f7252a;
        for (int i = 0; i < c1969cArr.length; i++) {
            c1969cArr2[i].f17077a = c1969cArr[i].f17077a;
            int i5 = 0;
            while (true) {
                float[] fArr = c1969cArr[i].f17078b;
                if (i5 < fArr.length) {
                    c1969cArr2[i].f17078b[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f7252a = null;
        this.f7254c = 0;
        this.f7253b = lVar.f7253b;
        this.f7252a = G4.d.p(lVar.f7252a);
    }
}
