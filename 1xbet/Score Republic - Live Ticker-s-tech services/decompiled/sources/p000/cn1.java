package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cn1 extends gn1 {

    /* JADX INFO: renamed from: b */
    public static final cn1 f1298b = new cn1(hn1.f3263a);

    /* JADX INFO: renamed from: a */
    public final AtomicReference f1299a;

    public cn1(gn1 gn1Var) {
        this.f1299a = new AtomicReference(gn1Var);
    }

    @Override // p000.gn1
    /* JADX INFO: renamed from: a */
    public final void mo977a(String str, Level level, boolean z) {
        ((gn1) this.f1299a.get()).mo977a(str, level, z);
    }

    @Override // p000.gn1
    /* JADX INFO: renamed from: b */
    public final mn1 mo978b() {
        return ((gn1) this.f1299a.get()).mo978b();
    }

    @Override // p000.gn1
    /* JADX INFO: renamed from: c */
    public final d71 mo979c() {
        return ((gn1) this.f1299a.get()).mo979c();
    }
}
