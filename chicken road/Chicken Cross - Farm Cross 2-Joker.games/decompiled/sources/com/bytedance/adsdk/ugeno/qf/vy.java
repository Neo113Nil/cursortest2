package com.bytedance.adsdk.ugeno.qf;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class vy extends Handler {
    private final WeakReference<pcc> pcc;

    public interface pcc {
        void pcc(Message message);
    }

    public vy(Looper looper, pcc pccVar) {
        super(looper);
        this.pcc = new WeakReference<>(pccVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        pcc pccVar = this.pcc.get();
        if (pccVar == null || message == null) {
            return;
        }
        pccVar.pcc(message);
    }
}
