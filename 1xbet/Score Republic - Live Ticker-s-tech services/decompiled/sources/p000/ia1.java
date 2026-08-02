package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum ia1 {
    f3506l("OK"),
    f3507m("CANCELLED"),
    f3508n("UNKNOWN"),
    f3509o("INVALID_ARGUMENT"),
    f3510p("DEADLINE_EXCEEDED"),
    f3511q("NOT_FOUND"),
    f3512r("ALREADY_EXISTS"),
    f3513s("PERMISSION_DENIED"),
    f3514t("RESOURCE_EXHAUSTED"),
    f3515u("FAILED_PRECONDITION"),
    f3516v("ABORTED"),
    f3517w("OUT_OF_RANGE"),
    f3518x("UNIMPLEMENTED"),
    f3519y("INTERNAL"),
    f3520z("UNAVAILABLE"),
    f3503A("DATA_LOSS"),
    f3504B("UNAUTHENTICATED");


    /* JADX INFO: renamed from: j */
    public final int f3521j;

    /* JADX INFO: renamed from: k */
    public final byte[] f3522k;

    ia1(String str) {
        this.f3521j = i;
        this.f3522k = Integer.toString(i).getBytes(AbstractC0358jg.f3919a);
    }

    /* JADX INFO: renamed from: a */
    public final ja1 m2581a() {
        return (ja1) ja1.f3874d.get(this.f3521j);
    }
}
