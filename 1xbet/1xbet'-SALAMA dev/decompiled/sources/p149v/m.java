package p149v;

import B.d;
import p154w.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends j {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f17071w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f17072x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f17073y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f17074z0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f17064A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f17065B0 = 0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f17066C0 = false;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f17067D0 = 0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f17068E0 = 0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final b f17069F0 = new b();

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public d f17070G0 = null;

    @Override // p149v.j
    public final void U() {
        for (int i7 = 0; i7 < this.f17062v0; i7++) {
            e eVar = this.f17061u0[i7];
            if (eVar != null) {
                eVar.f16929G = true;
            }
        }
    }

    public abstract void V(int i7, int i8, int i9, int i10);

    public final void W(e eVar, d dVar, int i7, d dVar2, int i8) {
        d dVar3;
        e eVar2;
        while (true) {
            dVar3 = this.f17070G0;
            if (dVar3 != null || (eVar2 = this.f16944V) == null) {
                break;
            } else {
                this.f17070G0 = ((f) eVar2).f17013y0;
            }
        }
        b bVar = this.f17069F0;
        bVar.f17220a = dVar;
        bVar.f17221b = dVar2;
        bVar.f17222c = i7;
        bVar.f17223d = i8;
        dVar3.b(eVar, bVar);
        eVar.P(bVar.f17224e);
        eVar.M(bVar.f17225f);
        eVar.f16927E = bVar.f17227h;
        eVar.J(bVar.f17226g);
    }
}
