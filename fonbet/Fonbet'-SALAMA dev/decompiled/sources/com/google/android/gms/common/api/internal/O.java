package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes.dex */
public final class O extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f11140a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p5, Looper looper) {
        super(looper);
        this.f11140a = p5;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 != 1) {
                w1.L.k(i7, "TransformationResultHandler received unknown message type: ", "TransformedResultImpl");
                return;
            } else {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
        }
        com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) message.obj;
        synchronized (this.f11140a.f11142b) {
            try {
                P p5 = this.f11140a.f11141a;
                com.google.android.gms.common.internal.D.i(p5);
                if (qVar == null) {
                    p5.a(new Status(13, "Transform returned null", null, null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
