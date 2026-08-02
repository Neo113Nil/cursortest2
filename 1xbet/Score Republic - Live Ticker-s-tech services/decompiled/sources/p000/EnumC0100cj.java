package p000;

/* JADX INFO: renamed from: cj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0100cj implements ce0 {
    f1265k("UNKNOWN_TRIGGER"),
    f1266l("APP_LAUNCH"),
    f1267m("ON_FOREGROUND"),
    f1268n("UNRECOGNIZED");


    /* JADX INFO: renamed from: j */
    public final int f1270j;

    EnumC0100cj(String str) {
        this.f1270j = i;
    }

    @Override // p000.ce0
    /* JADX INFO: renamed from: a */
    public final int mo555a() {
        if (this != f1268n) {
            return this.f1270j;
        }
        C0270h1.m2190f("Can't get the number of an unknown enum value.");
        return 0;
    }
}
