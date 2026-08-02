package F6;

import D6.InterfaceC0129l;
import F2.W0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2800a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f2801b = I6.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f2802c = I6.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final W0 f2803d = new W0("BUFFERED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final W0 f2804e = new W0("SHOULD_BUFFER", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final W0 f2805f = new W0("S_RESUMING_BY_RCV", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final W0 f2806g = new W0("RESUMING_BY_EB", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final W0 f2807h = new W0("POISONED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final W0 f2808i = new W0("DONE_RCV", 1);
    public static final W0 j = new W0("INTERRUPTED_SEND", 1);

    /* renamed from: k, reason: collision with root package name */
    public static final W0 f2809k = new W0("INTERRUPTED_RCV", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final W0 f2810l = new W0("CHANNEL_CLOSED", 1);

    /* renamed from: m, reason: collision with root package name */
    public static final W0 f2811m = new W0("SUSPEND", 1);

    /* renamed from: n, reason: collision with root package name */
    public static final W0 f2812n = new W0("SUSPEND_NO_WAITER", 1);

    /* renamed from: o, reason: collision with root package name */
    public static final W0 f2813o = new W0("FAILED", 1);

    /* renamed from: p, reason: collision with root package name */
    public static final W0 f2814p = new W0("NO_RECEIVE_RESULT", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final W0 f2815q = new W0("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r, reason: collision with root package name */
    public static final W0 f2816r = new W0("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s, reason: collision with root package name */
    public static final W0 f2817s = new W0("NO_CLOSE_CAUSE", 1);

    public static final boolean a(InterfaceC0129l interfaceC0129l, Object obj, Function1 function1) {
        W0 b7 = interfaceC0129l.b(obj, function1);
        if (b7 == null) {
            return false;
        }
        interfaceC0129l.f(b7);
        return true;
    }
}
