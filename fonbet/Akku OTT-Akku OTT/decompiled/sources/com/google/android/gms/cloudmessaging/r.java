package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ w a;

    public /* synthetic */ r(w wVar) {
        this.a = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            final w wVar = this.a;
            synchronized (wVar) {
                try {
                    if (wVar.a != 2) {
                        return;
                    }
                    if (wVar.d.isEmpty()) {
                        wVar.c();
                        return;
                    }
                    final z zVar = (z) wVar.d.poll();
                    wVar.e.put(zVar.a, zVar);
                    wVar.f.b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            w wVar2 = w.this;
                            int i = zVar.a;
                            synchronized (wVar2) {
                                z zVar2 = (z) wVar2.e.get(i);
                                if (zVar2 != null) {
                                    wVar2.e.remove(i);
                                    zVar2.c(new A("Timed out waiting for response", null));
                                    wVar2.c();
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(zVar));
                    }
                    C c = wVar.f;
                    Messenger messenger = wVar.b;
                    int i = zVar.c;
                    Context context = c.a;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = zVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", zVar.d);
                    obtain.setData(bundle);
                    try {
                        x xVar = wVar.c;
                        Messenger messenger2 = xVar.a;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            l lVar = xVar.b;
                            if (lVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = lVar.a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        wVar.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
