package p000;

import java.io.IOException;

/* JADX INFO: renamed from: n8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0498n8 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5326j;

    /* JADX INFO: renamed from: k */
    public final Object f5327k;

    public /* synthetic */ AbstractRunnableC0498n8(int i, Object obj) {
        this.f5326j = i;
        this.f5327k = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3189a();

    /* JADX INFO: renamed from: b */
    public abstract void mo3491b();

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5326j;
        Object obj = this.f5327k;
        switch (i) {
            case 0:
                C0535o8 c0535o8 = (C0535o8) obj;
                try {
                    if (c0535o8.f5657r == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    mo3189a();
                    return;
                } catch (Exception e) {
                    c0535o8.f5652m.m3780n(e);
                    return;
                }
            default:
                C0697sm c0697sm = (C0697sm) obj;
                C0697sm c0697smM4538a = c0697sm.m4538a();
                try {
                    mo3491b();
                    return;
                } finally {
                    c0697sm.m4539c(c0697smM4538a);
                }
        }
    }
}
