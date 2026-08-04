package p064i5;

import K5.a;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f14036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f14037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f14038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f14039f;

    public f(String str, int i7) {
        this.f14034a = str;
        this.f14035b = i7;
    }

    public final synchronized void a(a aVar) {
        HandlerThread handlerThread = new HandlerThread(this.f14034a, this.f14035b);
        this.f14036c = handlerThread;
        handlerThread.start();
        this.f14037d = new Handler(this.f14036c.getLooper());
        this.f14038e = aVar;
    }
}
