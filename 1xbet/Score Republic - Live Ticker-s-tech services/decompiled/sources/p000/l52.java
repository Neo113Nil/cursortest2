package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l52 extends x52 {

    /* JADX INFO: renamed from: n */
    public volatile boolean f4685n;

    /* JADX INFO: renamed from: o */
    public final boolean f4686o;

    public l52(String str, p90 p90Var, boolean z) {
        super(str, p90Var);
        this.f4686o = z;
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo3176a() {
        return Boolean.valueOf(this.f4686o);
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo3177b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo3178c(Object obj) {
        return (Boolean) obj;
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object mo3179d() {
        return Boolean.valueOf(this.f4685n);
    }

    @Override // p000.x52
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo3180e(Object obj) {
        this.f4685n = ((Boolean) obj).booleanValue();
    }
}
