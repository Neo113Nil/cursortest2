package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum wn1 implements bp1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("IAB_TCF_PURPOSE_UNKNOWN"),
    f8593k("IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE"),
    f8594l("IAB_TCF_PURPOSE_SELECT_BASIC_ADS"),
    f8595m("IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE"),
    f8596n("IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT"),
    f8597o("IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE"),
    f8598p("IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS"),
    f8599q("IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT"),
    f8600r("UNRECOGNIZED");


    /* JADX INFO: renamed from: j */
    public final int f8602j;

    wn1(String str) {
        this.f8602j = i;
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: a */
    public final int mo739a() {
        if (this != f8600r) {
            return this.f8602j;
        }
        C0270h1.m2190f("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f8602j);
    }
}
