package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import android.os.Message;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w1;

/* loaded from: classes4.dex */
public final class b implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f5234a;

    public b(e eVar) {
        this.f5234a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 123) {
            return false;
        }
        e eVar = this.f5234a;
        if (eVar.b.compareAndSet(false, true)) {
            if (eVar.b.get() && eVar.d != null) {
                IAlog.a("startCounting", new Object[0]);
                w1 w1Var = eVar.d;
                w1Var.d = false;
                w1Var.c.sendEmptyMessage(1932593528);
            }
            IAlog.a("Pause signal", new Object[0]);
        }
        return true;
    }
}
