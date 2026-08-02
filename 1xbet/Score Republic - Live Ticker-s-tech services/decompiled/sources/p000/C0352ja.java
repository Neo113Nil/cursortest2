package p000;

/* JADX INFO: renamed from: ja */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0352ja {

    /* JADX INFO: renamed from: a */
    public String f3864a;

    /* JADX INFO: renamed from: b */
    public int f3865b;

    /* JADX INFO: renamed from: c */
    public String f3866c;

    /* JADX INFO: renamed from: d */
    public String f3867d;

    /* JADX INFO: renamed from: e */
    public long f3868e;

    /* JADX INFO: renamed from: f */
    public long f3869f;

    /* JADX INFO: renamed from: g */
    public String f3870g;

    /* JADX INFO: renamed from: h */
    public byte f3871h;

    /* JADX INFO: renamed from: a */
    public final C0389ka m2832a() {
        if (this.f3871h == 3 && this.f3865b != 0) {
            return new C0389ka(this.f3864a, this.f3865b, this.f3866c, this.f3867d, this.f3868e, this.f3869f, this.f3870g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3865b == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.f3871h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.f3871h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        C0042ay.m531h(sb, "Missing required properties:");
        return null;
    }
}
