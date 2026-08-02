package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r52 extends x52 {

    /* JADX INFO: renamed from: n */
    public volatile long f6715n;

    /* JADX INFO: renamed from: o */
    public final long f6716o;

    public r52(String str, p90 p90Var, long j) {
        super(str, p90Var);
        this.f6716o = j;
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo3176a() {
        return Long.valueOf(this.f6716o);
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo3177b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo3178c(Object obj) {
        return (Long) obj;
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object mo3179d() {
        return Long.valueOf(this.f6715n);
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo3180e(Object obj) {
        this.f6715n = ((Long) obj).longValue();
    }
}
