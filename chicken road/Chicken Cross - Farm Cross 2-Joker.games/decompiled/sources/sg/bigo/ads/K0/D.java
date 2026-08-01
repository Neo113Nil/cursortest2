package sg.bigo.ads.K0;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class D extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f12340a;

    public D(E e) {
        this.f12340a = e;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[Catch: all -> 0x005d, LOOP:0: B:21:0x003b->B:23:0x003f, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x000e, B:11:0x001c, B:12:0x0059, B:15:0x0024, B:17:0x002c, B:19:0x0032, B:23:0x003f, B:25:0x0045, B:26:0x0039, B:27:0x005b), top: B:3:0x0003 }] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        long j;
        synchronized (this.f12340a) {
            E e = this.f12340a;
            if (!e.e && !e.f) {
                long elapsedRealtime = e.b - SystemClock.elapsedRealtime();
                if (elapsedRealtime <= 0) {
                    E e2 = this.f12340a;
                    e2.f = true;
                    e2.c();
                } else {
                    E e3 = this.f12340a;
                    long j2 = e3.c;
                    if (j2 > 0) {
                        long j3 = e3.d;
                        if (j3 > 0) {
                            j = e3.f12341a - (j3 - j2);
                            e3.d = 0L;
                            while (j < 0) {
                                j += this.f12340a.f12341a;
                            }
                            this.f12340a.a(elapsedRealtime);
                            this.f12340a.c = SystemClock.elapsedRealtime();
                            sendMessageDelayed(obtainMessage(1), j);
                        }
                    }
                    j = e3.f12341a;
                    while (j < 0) {
                    }
                    this.f12340a.a(elapsedRealtime);
                    this.f12340a.c = SystemClock.elapsedRealtime();
                    sendMessageDelayed(obtainMessage(1), j);
                }
            }
        }
    }
}
