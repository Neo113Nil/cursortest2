package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t40 implements InterfaceC0215fl {
    @Override // p000.ul0
    /* JADX INFO: renamed from: a */
    public void mo3771a(ja1 ja1Var) {
        mo4670e().mo3771a(ja1Var);
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: b */
    public final Runnable mo3772b(tl0 tl0Var) {
        return mo4670e().mo3772b(tl0Var);
    }

    @Override // p000.le0
    /* JADX INFO: renamed from: c */
    public final me0 mo1526c() {
        return mo4670e().mo1526c();
    }

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC0215fl mo4670e();

    @Override // p000.InterfaceC0215fl
    public final C0831w8 getAttributes() {
        return mo4670e().getAttributes();
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(mo4670e(), "delegate");
        return c0809vnM5362k.toString();
    }
}
