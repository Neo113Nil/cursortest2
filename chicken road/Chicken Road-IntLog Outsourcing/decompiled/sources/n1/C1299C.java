package n1;

/* renamed from: n1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1299C implements InterfaceC1315b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1318e f11292a;

    public C1299C(C1318e c1318e) {
        this.f11292a = c1318e;
    }

    @Override // n1.InterfaceC1315b
    public final void a(boolean z) {
        A1.c cVar = this.f11292a.f11383m;
        cVar.sendMessage(cVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
