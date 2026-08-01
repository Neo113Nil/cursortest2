package sg.bigo.ads.M;

/* renamed from: sg.bigo.ads.M.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5005w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f12456a;

    public C5005w(x xVar) {
        this.f12456a = xVar;
    }

    public final void a(int i, float[] fArr, float[] fArr2) {
        char c;
        if (i == 4) {
            c = 2;
            fArr = fArr2;
        } else {
            c = 0;
        }
        if (fArr.length == 3) {
            int i2 = this.f12456a.i();
            float f = 4.0f;
            if (i2 == 1) {
                for (int i3 = 0; i3 < fArr.length; i3++) {
                    float f2 = fArr[i3];
                    float[] fArr3 = this.f12456a.u;
                    if (-1.0f == fArr3[i3]) {
                        fArr3[i3] = f2;
                    }
                    float abs = Math.abs(f2 - fArr3[i3]);
                    this.f12456a.getClass();
                    if (abs > ((i != 4 && (i == 9 || i == 1)) ? 4.0f : 20.0f)) {
                        x xVar = this.f12456a;
                        xVar.u[i3] = f2;
                        x.a(xVar);
                        return;
                    }
                }
                return;
            }
            if (i2 != 3) {
                return;
            }
            float f3 = fArr[c];
            float[] fArr4 = this.f12456a.u;
            if (-1.0f == fArr4[c]) {
                fArr4[c] = f3;
            }
            float abs2 = Math.abs(f3 - fArr4[c]);
            this.f12456a.getClass();
            if (i == 4 || (i != 9 && i != 1)) {
                f = 20.0f;
            }
            if (abs2 > f) {
                x xVar2 = this.f12456a;
                xVar2.u[c] = f3;
                x.a(xVar2);
            }
        }
    }
}
