package F6;

import D6.InterfaceC0129l;
import F2.W0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f2800a = new j(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2801b = I6.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2802c = I6.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W0 f2803d = new W0("BUFFERED", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W0 f2804e = new W0("SHOULD_BUFFER", 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W0 f2805f = new W0("S_RESUMING_BY_RCV", 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final W0 f2806g = new W0("RESUMING_BY_EB", 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W0 f2807h = new W0("POISONED", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W0 f2808i = new W0("DONE_RCV", 1);
    public static final W0 j = new W0("INTERRUPTED_SEND", 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final W0 f2809k = new W0("INTERRUPTED_RCV", 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final W0 f2810l = new W0("CHANNEL_CLOSED", 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final W0 f2811m = new W0("SUSPEND", 1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final W0 f2812n = new W0("SUSPEND_NO_WAITER", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final W0 f2813o = new W0("FAILED", 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final W0 f2814p = new W0("NO_RECEIVE_RESULT", 1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final W0 f2815q = new W0("CLOSE_HANDLER_CLOSED", 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final W0 f2816r = new W0("CLOSE_HANDLER_INVOKED", 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final W0 f2817s = new W0("NO_CLOSE_CAUSE", 1);

    public static final boolean a(InterfaceC0129l interfaceC0129l, Object obj, Function1 function1) {
        W0 w0B = interfaceC0129l.b(obj, function1);
        if (w0B == null) {
            return false;
        }
        interfaceC0129l.f(w0B);
        return true;
    }
}
