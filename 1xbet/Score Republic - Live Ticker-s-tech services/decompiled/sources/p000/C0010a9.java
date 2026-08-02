package p000;

/* JADX INFO: renamed from: a9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0010a9 implements ss0 {

    /* JADX INFO: renamed from: a */
    public static final C0010a9 f70a = new C0010a9();

    /* JADX INFO: renamed from: b */
    public static final C0895xz f71b = C0895xz.m5717a("eventTimeMs");

    /* JADX INFO: renamed from: c */
    public static final C0895xz f72c = C0895xz.m5717a("eventCode");

    /* JADX INFO: renamed from: d */
    public static final C0895xz f73d = C0895xz.m5717a("eventUptimeMs");

    /* JADX INFO: renamed from: e */
    public static final C0895xz f74e = C0895xz.m5717a("sourceExtension");

    /* JADX INFO: renamed from: f */
    public static final C0895xz f75f = C0895xz.m5717a("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: g */
    public static final C0895xz f76g = C0895xz.m5717a("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: h */
    public static final C0895xz f77h = C0895xz.m5717a("networkConnectionInfo");

    @Override // p000.InterfaceC0633qw
    /* JADX INFO: renamed from: a */
    public final void mo103a(Object obj, Object obj2) {
        bk0 bk0Var = (bk0) obj;
        ts0 ts0Var = (ts0) obj2;
        ts0Var.mo2745e(f71b, ((C0167ea) bk0Var).f2030a);
        C0167ea c0167ea = (C0167ea) bk0Var;
        ts0Var.mo2741a(f72c, c0167ea.f2031b);
        ts0Var.mo2745e(f73d, c0167ea.f2032c);
        ts0Var.mo2741a(f74e, c0167ea.f2033d);
        ts0Var.mo2741a(f75f, c0167ea.f2034e);
        ts0Var.mo2745e(f76g, c0167ea.f2035f);
        ts0Var.mo2741a(f77h, c0167ea.f2036g);
    }
}
