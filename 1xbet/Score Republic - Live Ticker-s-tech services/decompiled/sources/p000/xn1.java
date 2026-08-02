package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum xn1 implements bp1 {
    f9001k("PURPOSE_RESTRICTION_NOT_ALLOWED"),
    f9002l("PURPOSE_RESTRICTION_REQUIRE_CONSENT"),
    f9003m("PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST"),
    f9004n("PURPOSE_RESTRICTION_UNDEFINED"),
    f9005o("UNRECOGNIZED");


    /* JADX INFO: renamed from: j */
    public final int f9007j;

    xn1(String str) {
        this.f9007j = i;
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: a */
    public final int mo739a() {
        if (this != f9005o) {
            return this.f9007j;
        }
        C0270h1.m2190f("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f9007j);
    }
}
