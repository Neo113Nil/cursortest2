package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0875q;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class e0 implements Runnable {
    public final /* synthetic */ com.google.android.gms.common.api.l a;
    public final /* synthetic */ h0 b;

    public e0(h0 h0Var, com.google.android.gms.common.api.l lVar) {
        this.b = h0Var;
        this.a = lVar;
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        com.google.android.gms.common.api.l lVar = this.a;
        h0 h0Var = this.b;
        f0 f0Var = h0Var.f;
        WeakReference weakReference = h0Var.e;
        try {
            try {
                BasePendingResult.zaa.set(Boolean.TRUE);
                C0875q.g(null);
                throw null;
            } catch (RuntimeException e) {
                f0Var.sendMessage(f0Var.obtainMessage(1, e));
                BasePendingResult.zaa.set(Boolean.FALSE);
                h0.d(lVar);
                com.google.android.gms.common.api.h hVar = (com.google.android.gms.common.api.h) weakReference.get();
                if (hVar != null) {
                    hVar.e();
                }
            }
        } catch (Throwable th) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            h0.d(lVar);
            com.google.android.gms.common.api.h hVar2 = (com.google.android.gms.common.api.h) weakReference.get();
            if (hVar2 != null) {
                hVar2.e();
            }
            throw th;
        }
    }
}
