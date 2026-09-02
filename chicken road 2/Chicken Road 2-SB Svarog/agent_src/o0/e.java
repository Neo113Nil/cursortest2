package o0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.AbstractC0062t;
import m0.C0048e;
import m0.C0054k;
import m0.InterfaceC0047d;
import m0.W;
import r0.AbstractC0088a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1065a = new k(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1066b = AbstractC0088a.i("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f1067c = AbstractC0088a.i("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1068d = new io.flutter.plugin.platform.i(2, "BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1069e = new io.flutter.plugin.platform.i(2, "SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1070f = new io.flutter.plugin.platform.i(2, "S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1071g = new io.flutter.plugin.platform.i(2, "RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1072h = new io.flutter.plugin.platform.i(2, "POISONED");

    /* renamed from: i, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1073i = new io.flutter.plugin.platform.i(2, "DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1074j = new io.flutter.plugin.platform.i(2, "INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1075k = new io.flutter.plugin.platform.i(2, "INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1076l = new io.flutter.plugin.platform.i(2, "CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1077m = new io.flutter.plugin.platform.i(2, "SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1078n = new io.flutter.plugin.platform.i(2, "SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1079o = new io.flutter.plugin.platform.i(2, "FAILED");

    /* renamed from: p, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1080p = new io.flutter.plugin.platform.i(2, "NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1081q = new io.flutter.plugin.platform.i(2, "CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1082r = new io.flutter.plugin.platform.i(2, "CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1083s = new io.flutter.plugin.platform.i(2, "NO_CLOSE_CAUSE");

    public static final boolean a(InterfaceC0047d interfaceC0047d, Object obj, r0.q qVar) {
        C0048e c0048e = (C0048e) interfaceC0047d;
        c0048e.getClass();
        io.flutter.plugin.platform.i iVar = AbstractC0062t.f944a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0048e.f922h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(c0048e);
            if (!(obj2 instanceof W)) {
                iVar = null;
                break;
            }
            int i2 = c0048e.f956d;
            if (!(obj instanceof C0054k) && i2 != 1) {
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c0048e, obj2, obj)) {
                if (atomicReferenceFieldUpdater.get(c0048e) != obj2) {
                    break;
                }
            }
            if (!c0048e.s()) {
                c0048e.n();
            }
        }
        if (iVar == null) {
            return false;
        }
        c0048e.o(c0048e.f956d);
        return true;
    }
}
