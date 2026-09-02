package d1;

import b1.AbstractC0030s;
import b1.C0017e;
import b1.C0022j;
import b1.InterfaceC0016d;
import b1.V;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f916a = new k(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f917b = g1.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f918c = g1.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final C0.a f919d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0.a f920e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0.a f921f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0.a f922g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0.a f923h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0.a f924i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0.a f925j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0.a f926k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0.a f927l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0.a f928m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0.a f929n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0.a f930o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0.a f931p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0.a f932q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0.a f933r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0.a f934s;

    static {
        int i2 = 28;
        f919d = new C0.a(i2, "BUFFERED");
        f920e = new C0.a(i2, "SHOULD_BUFFER");
        f921f = new C0.a(i2, "S_RESUMING_BY_RCV");
        f922g = new C0.a(i2, "RESUMING_BY_EB");
        f923h = new C0.a(i2, "POISONED");
        f924i = new C0.a(i2, "DONE_RCV");
        f925j = new C0.a(i2, "INTERRUPTED_SEND");
        f926k = new C0.a(i2, "INTERRUPTED_RCV");
        f927l = new C0.a(i2, "CHANNEL_CLOSED");
        f928m = new C0.a(i2, "SUSPEND");
        f929n = new C0.a(i2, "SUSPEND_NO_WAITER");
        f930o = new C0.a(i2, "FAILED");
        f931p = new C0.a(i2, "NO_RECEIVE_RESULT");
        f932q = new C0.a(i2, "CLOSE_HANDLER_CLOSED");
        f933r = new C0.a(i2, "CLOSE_HANDLER_INVOKED");
        f934s = new C0.a(i2, "NO_CLOSE_CAUSE");
    }

    public static final boolean a(InterfaceC0016d interfaceC0016d, Object obj, U0.l lVar) {
        C0.a aVar;
        C0017e c0017e = (C0017e) interfaceC0016d;
        c0017e.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0017e.f656g;
            Object obj2 = atomicReferenceFieldUpdater.get(c0017e);
            boolean z2 = obj2 instanceof V;
            aVar = AbstractC0030s.f680a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0022j;
                aVar = null;
                break;
            }
            Object v2 = C0017e.v(obj, c0017e.f692c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(c0017e, obj2, v2)) {
                if (atomicReferenceFieldUpdater.get(c0017e) != obj2) {
                    break;
                }
            }
            if (!c0017e.r()) {
                c0017e.m();
            }
        }
        if (aVar == null) {
            return false;
        }
        c0017e.n(c0017e.f692c);
        return true;
    }
}
