package n1;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: n1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1335v extends A1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11438b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC1335v(Object obj, Looper looper, int i2) {
        super(looper, 2);
        this.f11437a = i2;
        this.f11438b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f11437a) {
            case 0:
                int i2 = message.what;
                C1337x c1337x = (C1337x) this.f11438b;
                if (i2 != 1) {
                    if (i2 == 2) {
                        C1337x.h(c1337x);
                        return;
                    }
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + i2);
                    return;
                }
                ReentrantLock reentrantLock = c1337x.f11440b;
                reentrantLock.lock();
                try {
                    if (c1337x.i()) {
                        c1337x.l();
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                int i3 = message.what;
                if (i3 != 1) {
                    if (i3 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    Log.w("GACStateManager", "Unknown message id: " + i3);
                    return;
                }
                z zVar = (z) message.obj;
                C1297A c1297a = (C1297A) this.f11438b;
                zVar.getClass();
                c1297a.f11277a.lock();
                try {
                    if (c1297a.f11287n == zVar.f11462a) {
                        zVar.a();
                    }
                    return;
                } finally {
                    c1297a.f11277a.unlock();
                }
        }
    }
}
