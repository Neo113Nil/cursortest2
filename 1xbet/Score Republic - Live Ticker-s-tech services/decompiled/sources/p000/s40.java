package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s40 extends xe1 {
    @Override // p000.xe1
    /* JADX INFO: renamed from: b */
    public void mo272b(String str, Throwable th) {
        mo274r().mo272b(str, th);
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: i */
    public final void mo660i() {
        mo274r().mo660i();
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: m */
    public final void mo661m() {
        mo274r().mo661m();
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: n */
    public final void mo662n(C0525nz c0525nz) {
        mo274r().mo662n(c0525nz);
    }

    /* JADX INFO: renamed from: r */
    public abstract xe1 mo274r();

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(mo274r(), "delegate");
        return c0809vnM5362k.toString();
    }
}
