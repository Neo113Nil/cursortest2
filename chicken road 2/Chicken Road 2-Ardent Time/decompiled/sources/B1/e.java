package B1;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final B1.k f22a = new B1.k(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f23b = E1.AbstractC0000a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f24c = E1.AbstractC0000a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final C.j f25d = new C.j(3, "BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    public static final C.j f26e = new C.j(3, "SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    public static final C.j f27f = new C.j(3, "S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    public static final C.j f28g = new C.j(3, "RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    public static final C.j f29h = new C.j(3, "POISONED");

    /* renamed from: i, reason: collision with root package name */
    public static final C.j f30i = new C.j(3, "DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    public static final C.j f31j = new C.j(3, "INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    public static final C.j f32k = new C.j(3, "INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    public static final C.j f33l = new C.j(3, "CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    public static final C.j f34m = new C.j(3, "SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    public static final C.j f35n = new C.j(3, "SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    public static final C.j f36o = new C.j(3, "FAILED");

    /* renamed from: p, reason: collision with root package name */
    public static final C.j f37p = new C.j(3, "NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    public static final C.j f38q = new C.j(3, "CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    public static final C.j f39r = new C.j(3, "CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    public static final C.j f40s = new C.j(3, "NO_CLOSE_CAUSE");

    public static final boolean a(z1.InterfaceC1052e interfaceC1052e, java.lang.Object obj, s1.l lVar) {
        C.j c2 = interfaceC1052e.c(obj, lVar);
        if (c2 == null) {
            return false;
        }
        interfaceC1052e.n(c2);
        return true;
    }
}
