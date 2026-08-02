package p000;

/* JADX INFO: renamed from: tp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0737tp extends bh0 implements h60 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0848wp f7557k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0737tp(C0848wp c0848wp) {
        super(1);
        this.f7557k = c0848wp;
    }

    @Override // p000.h60
    /* JADX INFO: renamed from: i */
    public final Object mo170i(Object obj) {
        Throwable th = (Throwable) obj;
        C0848wp c0848wp = this.f7557k;
        if (th != null) {
            c0848wp.f8613q.m3593q(new r00(th));
        }
        if (c0848wp.f8615s.f3904k != wa0.f8475o) {
            ((o00) c0848wp.f8615s.m2847a()).close();
        }
        return kf1.f4365a;
    }
}
