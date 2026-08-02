package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sv0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0959zp f7217a;

    /* JADX INFO: renamed from: c */
    public final pv0 f7219c;

    /* JADX INFO: renamed from: d */
    public boolean f7220d = false;

    /* JADX INFO: renamed from: b */
    public EnumC0474ml f7218b = EnumC0474ml.f5074m;

    public sv0(AbstractC0959zp abstractC0959zp, pv0 pv0Var) {
        this.f7217a = abstractC0959zp;
        this.f7219c = pv0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m4598a(sv0 sv0Var, EnumC0474ml enumC0474ml) {
        sv0Var.f7218b = enumC0474ml;
        if (enumC0474ml == EnumC0474ml.f5072k || enumC0474ml == EnumC0474ml.f5073l) {
            sv0Var.f7220d = true;
        } else if (enumC0474ml == EnumC0474ml.f5074m) {
            sv0Var.f7220d = false;
        }
    }
}
