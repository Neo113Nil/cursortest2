package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class u1 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5973a;

    public u1(w1 w1Var) {
        super(Looper.getMainLooper());
        this.f5973a = new WeakReference(w1Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        w1 w1Var = (w1) this.f5973a.get();
        if (w1Var == null || message.what != 1932593528 || w1Var.d) {
            return;
        }
        w1Var.a(message.getWhen());
    }
}
