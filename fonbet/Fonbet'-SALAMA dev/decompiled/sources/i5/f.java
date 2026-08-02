package i5;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f14028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14029b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f14030c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f14031d;

    /* renamed from: e, reason: collision with root package name */
    public K5.a f14032e;

    /* renamed from: f, reason: collision with root package name */
    public C1283e f14033f;

    public f(String str, int i7) {
        this.f14028a = str;
        this.f14029b = i7;
    }

    public final synchronized void a(K5.a aVar) {
        HandlerThread handlerThread = new HandlerThread(this.f14028a, this.f14029b);
        this.f14030c = handlerThread;
        handlerThread.start();
        this.f14031d = new Handler(this.f14030c.getLooper());
        this.f14032e = aVar;
    }
}
