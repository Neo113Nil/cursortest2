package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ds0 extends g51 {

    /* JADX INFO: renamed from: b */
    public static final b41 f1810b = new b41(Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), "RxNewThreadScheduler", false);

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f1811a = f1810b;

    @Override // p000.g51
    /* JADX INFO: renamed from: a */
    public final f51 mo1301a() {
        return new es0(this.f1811a);
    }
}
