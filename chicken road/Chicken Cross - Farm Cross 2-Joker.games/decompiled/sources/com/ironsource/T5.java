package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class T5 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Nc> f7905a;

    public T5(Looper looper) {
        super(looper);
        this.f7905a = new ConcurrentHashMap<>();
    }

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    void a(String str, Nc nc) {
        if (str == null || nc == null) {
            return;
        }
        this.f7905a.put(str, nc);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C4710w8 c4710w8 = (C4710w8) message.obj;
            String path = c4710w8.getPath();
            Nc nc = this.f7905a.get(path);
            if (nc == null) {
                return;
            }
            if (a(message.what)) {
                nc.a(c4710w8);
            } else {
                int i = message.what;
                nc.a(c4710w8, new C4549n8(i, C4682ug.a(i)));
            }
            this.f7905a.remove(path);
        } catch (Throwable th) {
            C4491k4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
