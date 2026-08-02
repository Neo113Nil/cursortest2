package p000;

import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q10 implements ou0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6306j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ FirebaseMessaging f6307k;

    public /* synthetic */ q10(FirebaseMessaging firebaseMessaging, int i) {
        this.f6306j = i;
        this.f6307k = firebaseMessaging;
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: b */
    public final void mo306b(Object obj) {
        boolean z;
        int i = this.f6306j;
        FirebaseMessaging firebaseMessaging = this.f6307k;
        switch (i) {
            case 0:
                ce1 ce1Var = (ce1) obj;
                if (!firebaseMessaging.f1390e.m5179j() || ce1Var.f1239h.m180a() == null) {
                    return;
                }
                synchronized (ce1Var) {
                    z = ce1Var.f1238g;
                }
                if (z) {
                    return;
                }
                ce1Var.m927f(0L);
                return;
            default:
                C0914yh c0914yh = (C0914yh) obj;
                if (c0914yh != null) {
                    d71.m1112g(c0914yh.f9303j);
                    firebaseMessaging.m1010e();
                    return;
                }
                return;
        }
    }
}
