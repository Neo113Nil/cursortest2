package W5;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class T0 extends Z {

    /* renamed from: f, reason: collision with root package name */
    public static final ReferenceQueue f7053f = new ReferenceQueue();

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap f7054g = new ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f7055h = Logger.getLogger(T0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public final S0 f7056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(Q0 q02) {
        super(q02);
        ReferenceQueue referenceQueue = f7053f;
        ConcurrentHashMap concurrentHashMap = f7054g;
        this.f7056e = new S0(this, q02, referenceQueue, concurrentHashMap);
    }

    @Override // U5.Q
    public final U5.Q w() {
        S0 s02 = this.f7056e;
        if (!s02.f7025e.getAndSet(true)) {
            s02.clear();
        }
        Q0 q02 = this.f7097d;
        q02.F();
        return q02;
    }

    @Override // U5.Q
    public final U5.Q x() {
        S0 s02 = this.f7056e;
        if (!s02.f7025e.getAndSet(true)) {
            s02.clear();
        }
        Q0 q02 = this.f7097d;
        q02.x();
        return q02;
    }
}
