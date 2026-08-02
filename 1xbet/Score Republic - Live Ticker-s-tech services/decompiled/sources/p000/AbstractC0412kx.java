package p000;

/* JADX INFO: renamed from: kx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0412kx extends AbstractC0292hn {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f4586o = 0;

    /* JADX INFO: renamed from: l */
    public long f4587l;

    /* JADX INFO: renamed from: m */
    public boolean f4588m;

    /* JADX INFO: renamed from: n */
    public C0756u7 f4589n;

    /* JADX INFO: renamed from: r */
    public final void m3097r(boolean z) {
        long j = this.f4587l - (z ? 4294967296L : 1L);
        this.f4587l = j;
        if (j <= 0 && this.f4588m) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3098s(boolean z) {
        this.f4587l = (z ? 4294967296L : 1L) + this.f4587l;
        if (z) {
            return;
        }
        this.f4588m = true;
    }

    public abstract void shutdown();

    /* JADX INFO: renamed from: t */
    public abstract long mo3099t();

    /* JADX INFO: renamed from: u */
    public final boolean m3100u() {
        C0756u7 c0756u7 = this.f4589n;
        if (c0756u7 == null) {
            return false;
        }
        AbstractC0778ut abstractC0778ut = (AbstractC0778ut) (c0756u7.isEmpty() ? null : c0756u7.removeFirst());
        if (abstractC0778ut == null) {
            return false;
        }
        abstractC0778ut.run();
        return true;
    }
}
