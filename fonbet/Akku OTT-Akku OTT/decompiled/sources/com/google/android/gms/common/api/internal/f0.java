package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes4.dex */
public final class f0 extends zau {
    public final /* synthetic */ h0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, Looper looper) {
        super(looper);
        this.a = h0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
        com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) message.obj;
        synchronized (this.a.c) {
            try {
                h0 h0Var = this.a.a;
                C0875q.g(h0Var);
                if (iVar == null) {
                    h0Var.b(new Status(13, "Transform returned null", null, null));
                } else if (iVar instanceof Z) {
                    h0Var.b(null);
                } else {
                    synchronized (h0Var.c) {
                        h0Var.b = iVar;
                        h0Var.c();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
