package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.b5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class HandlerC4331b5 extends Handler {
    private static final String b = "DownloadHandler";

    /* renamed from: a, reason: collision with root package name */
    Nc f8093a;

    public HandlerC4331b5(Looper looper) {
        super(looper);
    }

    public void a(Nc nc) {
        if (nc == null) {
            throw new IllegalArgumentException();
        }
        this.f8093a = nc;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Nc nc = this.f8093a;
        if (nc == null) {
            Logger.i(b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                nc.a((C4710w8) message.obj);
            } else {
                this.f8093a.a((C4710w8) message.obj, new C4549n8(i, C4682ug.a(i)));
            }
        } catch (Throwable th) {
            C4491k4.d().a(th);
            Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a() {
        this.f8093a = null;
    }
}
