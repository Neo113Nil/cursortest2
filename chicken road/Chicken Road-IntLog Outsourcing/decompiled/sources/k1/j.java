package k1;

import B0.t;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f10697b;

    public /* synthetic */ j(l lVar, int i2) {
        this.f10696a = i2;
        this.f10697b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10696a) {
            case 0:
                break;
            case 1:
                l lVar = this.f10697b;
                synchronized (lVar) {
                    if (lVar.f10699a == 1) {
                        lVar.a(1, "Timed out while binding");
                    }
                }
                return;
            default:
                this.f10697b.a(2, "Service disconnected");
                return;
        }
        while (true) {
            l lVar2 = this.f10697b;
            synchronized (lVar2) {
                try {
                    if (lVar2.f10699a != 2) {
                        return;
                    }
                    if (lVar2.f10702d.isEmpty()) {
                        lVar2.c();
                        return;
                    }
                    m mVar = (m) lVar2.f10702d.poll();
                    lVar2.f10703e.put(mVar.f10705a, mVar);
                    ((ScheduledExecutorService) lVar2.f10704f.f10713c).schedule(new A0.a(lVar2, mVar, 27, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(mVar)));
                    }
                    n nVar = lVar2.f10704f;
                    Messenger messenger = lVar2.f10700b;
                    int i2 = mVar.f10707c;
                    Context context = (Context) nVar.f10712b;
                    Message obtain = Message.obtain();
                    obtain.what = i2;
                    obtain.arg1 = mVar.f10705a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", mVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", mVar.f10708d);
                    obtain.setData(bundle);
                    try {
                        t tVar = lVar2.f10701c;
                        Messenger messenger2 = (Messenger) tVar.f207b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            C1211g c1211g = (C1211g) tVar.f208c;
                            if (c1211g == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = c1211g.f10687a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e3) {
                        lVar2.a(2, e3.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
