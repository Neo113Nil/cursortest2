package g0;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f1094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1095b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f1096c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f1097d;

    /* renamed from: e, reason: collision with root package name */
    public g f1098e;

    /* renamed from: f, reason: collision with root package name */
    public f f1099f;

    public h(String str, int i2) {
        this.f1094a = str;
        this.f1095b = i2;
    }

    public final synchronized void a(g gVar) {
        HandlerThread handlerThread = new HandlerThread(this.f1094a, this.f1095b);
        this.f1096c = handlerThread;
        handlerThread.start();
        this.f1097d = new Handler(this.f1096c.getLooper());
        this.f1098e = gVar;
    }
}
