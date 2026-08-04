package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0785f extends zau {
    public final void a(com.google.android.gms.common.api.t tVar, com.google.android.gms.common.api.s sVar) {
        int i7 = BasePendingResult.zad;
        com.google.android.gms.common.internal.D.i(tVar);
        sendMessage(obtainMessage(1, new Pair(tVar, sVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            if (i7 == 2) {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f11080y);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i7, new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        com.google.android.gms.common.api.t tVar = (com.google.android.gms.common.api.t) pair.first;
        com.google.android.gms.common.api.s sVar = (com.google.android.gms.common.api.s) pair.second;
        try {
            P p5 = (P) tVar;
            synchronized (p5.f11142b) {
                if (sVar.getStatus().j()) {
                } else {
                    p5.a(sVar.getStatus());
                    if (sVar instanceof zzcci) {
                        try {
                            ((zzcci) sVar).release();
                        } catch (RuntimeException e7) {
                            Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(sVar)), e7);
                        }
                    }
                }
            }
        } catch (RuntimeException e8) {
            BasePendingResult.zal(sVar);
            throw e8;
        }
    }
}
