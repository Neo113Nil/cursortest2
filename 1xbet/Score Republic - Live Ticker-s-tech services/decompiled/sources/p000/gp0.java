package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum gp0 implements wx0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("UNKNOWN_OS"),
    f2839k("ANDROID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF23("IOS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF31("WEB");


    /* JADX INFO: renamed from: j */
    public final int f2841j;

    gp0(String str) {
        this.f2841j = i;
    }

    @Override // p000.wx0
    /* JADX INFO: renamed from: a */
    public final int mo950a() {
        return this.f2841j;
    }
}
