package p000;

/* JADX INFO: renamed from: ka */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0389ka {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f4321h = 0;

    /* JADX INFO: renamed from: a */
    public final String f4322a;

    /* JADX INFO: renamed from: b */
    public final int f4323b;

    /* JADX INFO: renamed from: c */
    public final String f4324c;

    /* JADX INFO: renamed from: d */
    public final String f4325d;

    /* JADX INFO: renamed from: e */
    public final long f4326e;

    /* JADX INFO: renamed from: f */
    public final long f4327f;

    /* JADX INFO: renamed from: g */
    public final String f4328g;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        C0042ay.m531h(sb, "Missing required properties:");
    }

    public C0389ka(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.f4322a = str;
        this.f4323b = i;
        this.f4324c = str2;
        this.f4325d = str3;
        this.f4326e = j;
        this.f4327f = j2;
        this.f4328g = str4;
    }

    /* JADX INFO: renamed from: a */
    public final C0352ja m3001a() {
        C0352ja c0352ja = new C0352ja();
        c0352ja.f3864a = this.f4322a;
        c0352ja.f3865b = this.f4323b;
        c0352ja.f3866c = this.f4324c;
        c0352ja.f3867d = this.f4325d;
        c0352ja.f3868e = this.f4326e;
        c0352ja.f3869f = this.f4327f;
        c0352ja.f3870g = this.f4328g;
        c0352ja.f3871h = (byte) 3;
        return c0352ja;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0389ka)) {
            return false;
        }
        C0389ka c0389ka = (C0389ka) obj;
        String str = c0389ka.f4322a;
        String str2 = this.f4322a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!AbstractC0024an.m278a(this.f4323b, c0389ka.f4323b)) {
            return false;
        }
        String str3 = c0389ka.f4324c;
        String str4 = this.f4324c;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = c0389ka.f4325d;
        String str6 = this.f4325d;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.f4326e != c0389ka.f4326e || this.f4327f != c0389ka.f4327f) {
            return false;
        }
        String str7 = c0389ka.f4328g;
        String str8 = this.f4328g;
        if (str8 == null) {
            return str7 == null;
        }
        return str8.equals(str7);
    }

    public final int hashCode() {
        String str = this.f4322a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC0024an.m292o(this.f4323b)) * 1000003;
        String str2 = this.f4324c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4325d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f4326e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f4327f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f4328g;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f4322a);
        sb.append(", registrationStatus=");
        int i = this.f4323b;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.f4324c);
        sb.append(", refreshToken=");
        sb.append(this.f4325d);
        sb.append(", expiresInSecs=");
        sb.append(this.f4326e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f4327f);
        sb.append(", fisError=");
        return AbstractC0024an.m285h(sb, this.f4328g, "}");
    }
}
