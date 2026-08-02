package p000;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class lw1 extends jw1 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f4919n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Activity f4920o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0414kz f4921p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw1(C0414kz c0414kz, Activity activity, int i) {
        super((mw1) c0414kz.f4610k, true);
        this.f4919n = i;
        switch (i) {
            case 1:
                this.f4920o = activity;
                this.f4921p = c0414kz;
                super((mw1) c0414kz.f4610k, true);
                break;
            case 2:
                this.f4920o = activity;
                this.f4921p = c0414kz;
                super((mw1) c0414kz.f4610k, true);
                break;
            case 3:
                this.f4920o = activity;
                this.f4921p = c0414kz;
                super((mw1) c0414kz.f4610k, true);
                break;
            case 4:
                this.f4920o = activity;
                this.f4921p = c0414kz;
                super((mw1) c0414kz.f4610k, true);
                break;
            default:
                this.f4920o = activity;
                this.f4921p = c0414kz;
                break;
        }
    }

    @Override // p000.jw1
    /* JADX INFO: renamed from: a */
    public final void mo492a() {
        switch (this.f4919n) {
            case 0:
                ev1 ev1Var = ((mw1) this.f4921p.f4610k).f5174f;
                p80.m3863h(ev1Var);
                ev1Var.onActivityStartedByScionActivityInfo(xv1.m5690b(this.f4920o), this.f4101k);
                break;
            case 1:
                ev1 ev1Var2 = ((mw1) this.f4921p.f4610k).f5174f;
                p80.m3863h(ev1Var2);
                ev1Var2.onActivityResumedByScionActivityInfo(xv1.m5690b(this.f4920o), this.f4101k);
                break;
            case 2:
                ev1 ev1Var3 = ((mw1) this.f4921p.f4610k).f5174f;
                p80.m3863h(ev1Var3);
                ev1Var3.onActivityPausedByScionActivityInfo(xv1.m5690b(this.f4920o), this.f4101k);
                break;
            case 3:
                ev1 ev1Var4 = ((mw1) this.f4921p.f4610k).f5174f;
                p80.m3863h(ev1Var4);
                ev1Var4.onActivityStoppedByScionActivityInfo(xv1.m5690b(this.f4920o), this.f4101k);
                break;
            default:
                ev1 ev1Var5 = ((mw1) this.f4921p.f4610k).f5174f;
                p80.m3863h(ev1Var5);
                ev1Var5.onActivityDestroyedByScionActivityInfo(xv1.m5690b(this.f4920o), this.f4101k);
                break;
        }
    }
}
