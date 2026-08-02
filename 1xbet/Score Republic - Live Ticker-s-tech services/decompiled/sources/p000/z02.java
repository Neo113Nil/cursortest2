package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z02 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9563j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ s62 f9564k;

    public /* synthetic */ z02(s62 s62Var, int i) {
        this.f9563j = i;
        this.f9564k = s62Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9563j) {
            case 0:
                break;
            case 1:
                s62 s62Var = this.f9564k;
                synchronized (s62Var) {
                    if (s62Var.f7039j == 1) {
                        s62Var.m4486a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.f9564k.m4486a("Service disconnected");
                return;
        }
        while (true) {
            s62 s62Var2 = this.f9564k;
            synchronized (s62Var2) {
                try {
                    if (s62Var2.f7039j != 2) {
                        return;
                    }
                    if (s62Var2.f7042m.isEmpty()) {
                        s62Var2.m4488c();
                        return;
                    }
                    a82 a82Var = (a82) s62Var2.f7042m.poll();
                    s62Var2.f7043n.put(a82Var.f65a, a82Var);
                    ((ScheduledExecutorService) s62Var2.f7044o.f2673l).schedule(new f31(s62Var2, a82Var, 24, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(a82Var)));
                    }
                    g92 g92Var = s62Var2.f7044o;
                    Messenger messenger = s62Var2.f7040k;
                    int i = a82Var.f67c;
                    Context context = (Context) g92Var.f2672k;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = a82Var.f65a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", a82Var.m100a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", a82Var.f68d);
                    messageObtain.setData(bundle);
                    try {
                        a81 a81Var = s62Var2.f7041l;
                        Messenger messenger2 = (Messenger) a81Var.f63k;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            uv1 uv1Var = (uv1) a81Var.f64l;
                            if (uv1Var == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = uv1Var.f7914j;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        s62Var2.m4486a(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
