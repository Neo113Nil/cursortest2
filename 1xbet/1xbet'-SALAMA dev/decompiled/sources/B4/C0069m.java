package B4;

import E4.C0169b;
import E4.RunnableC0182o;

/* JADX INFO: renamed from: B4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0069m implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0169b f1176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E4.t f1177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E4.D f1178d;

    public /* synthetic */ C0069m(C0169b c0169b, E4.t tVar, E4.D d7, int i7) {
        this.f1175a = i7;
        this.f1176b = c0169b;
        this.f1177c = tVar;
        this.f1178d = d7;
    }

    @Override // B4.O
    public final void remove() {
        switch (this.f1175a) {
            case 0:
                C0169b c0169b = this.f1176b;
                E4.t tVar = this.f1177c;
                E4.D d7 = this.f1178d;
                c0169b.f2168c = true;
                tVar.getClass();
                tVar.f2232d.a(new RunnableC0182o(tVar, d7, 0));
                break;
            default:
                C0169b c0169b2 = this.f1176b;
                E4.t tVar2 = this.f1177c;
                E4.D d8 = this.f1178d;
                c0169b2.f2168c = true;
                tVar2.getClass();
                tVar2.f2232d.a(new RunnableC0182o(tVar2, d8, 0));
                break;
        }
    }
}
