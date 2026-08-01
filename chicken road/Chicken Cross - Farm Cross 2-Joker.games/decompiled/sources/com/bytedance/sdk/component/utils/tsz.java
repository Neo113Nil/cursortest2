package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class tsz extends Handler {
    protected WeakReference<pcc> pcc;

    public interface pcc {
        void pcc(Message message);
    }

    public tsz(pcc pccVar) {
        if (pccVar != null) {
            this.pcc = new WeakReference<>(pccVar);
        }
    }

    public tsz(Looper looper, pcc pccVar) {
        super(looper);
        if (pccVar != null) {
            this.pcc = new WeakReference<>(pccVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        pcc pccVar;
        WeakReference<pcc> weakReference = this.pcc;
        if (weakReference == null || (pccVar = weakReference.get()) == null || message == null) {
            return;
        }
        pccVar.pcc(message);
    }
}
