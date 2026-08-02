package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kg0 implements ss0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4367a;

    public /* synthetic */ kg0(int i) {
        this.f4367a = i;
    }

    @Override // p000.InterfaceC0633qw
    /* JADX INFO: renamed from: a */
    public final void mo103a(Object obj, Object obj2) {
        switch (this.f4367a) {
            case 0:
                throw new C0855ww("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ts0 ts0Var = (ts0) obj2;
                ts0Var.mo2741a(iy0.f3738g, entry.getKey());
                ts0Var.mo2741a(iy0.f3739h, entry.getValue());
                return;
            default:
                throw new C0855ww("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
