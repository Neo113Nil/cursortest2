package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum ck0 implements wx0 {
    f1272k("REASON_UNKNOWN"),
    f1273l("MESSAGE_TOO_OLD"),
    f1274m("CACHE_FULL"),
    f1275n("PAYLOAD_TOO_BIG"),
    f1276o("MAX_RETRIES_REACHED"),
    f1277p("INVALID_PAYLOD"),
    f1278q("SERVER_ERROR");


    /* JADX INFO: renamed from: j */
    public final int f1280j;

    ck0(String str) {
        this.f1280j = i;
    }

    @Override // p000.wx0
    /* JADX INFO: renamed from: a */
    public final int mo950a() {
        return this.f1280j;
    }
}
