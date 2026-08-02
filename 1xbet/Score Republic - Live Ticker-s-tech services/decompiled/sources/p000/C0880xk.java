package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: xk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0880xk {

    /* JADX INFO: renamed from: a */
    public final int f8976a;

    /* JADX INFO: renamed from: b */
    public final C0917yk[] f8977b;

    /* JADX INFO: renamed from: c */
    public long f8978c;

    public C0880xk(int i, ThreadFactory threadFactory) {
        this.f8976a = i;
        this.f8977b = new C0917yk[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f8977b[i2] = new C0917yk(threadFactory);
        }
    }
}
