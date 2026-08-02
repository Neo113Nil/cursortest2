package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import androidx.core.os.EnvironmentCompat;

/* loaded from: classes4.dex */
public final class l0 implements Handler.Callback {
    public final /* synthetic */ m0 a;

    public /* synthetic */ l0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.d) {
                try {
                    j0 j0Var = (j0) message.obj;
                    k0 k0Var = (k0) this.a.d.get(j0Var);
                    if (k0Var != null && k0Var.a.isEmpty()) {
                        if (k0Var.c) {
                            k0Var.i.f.removeMessages(1, k0Var.e);
                            m0 m0Var = k0Var.i;
                            m0Var.g.c(m0Var.e, k0Var);
                            k0Var.c = false;
                            k0Var.b = 2;
                        }
                        this.a.d.remove(j0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.a.d) {
            try {
                j0 j0Var2 = (j0) message.obj;
                k0 k0Var2 = (k0) this.a.d.get(j0Var2);
                if (k0Var2 != null && k0Var2.b == 3) {
                    String.valueOf(j0Var2);
                    new Exception();
                    ComponentName componentName = k0Var2.f;
                    if (componentName == null) {
                        j0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = j0Var2.b;
                        C0875q.g(str);
                        componentName = new ComponentName(str, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    k0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
