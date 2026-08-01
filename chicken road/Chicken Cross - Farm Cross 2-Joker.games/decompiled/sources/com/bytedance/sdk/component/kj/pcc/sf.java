package com.bytedance.sdk.component.kj.pcc;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.tsz;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class sf extends tsz implements gm {
    private final HandlerThread sf;

    sf(HandlerThread handlerThread, tsz.pcc pccVar) {
        super(handlerThread.getLooper(), pccVar);
        this.sf = handlerThread;
    }

    @Override // com.bytedance.sdk.component.kj.pcc.gm
    public void pcc() {
        removeCallbacksAndMessages(null);
        if (this.pcc != null) {
            this.pcc.clear();
            this.pcc = null;
        }
    }

    public void pcc(tsz.pcc pccVar) {
        this.pcc = new WeakReference<>(pccVar);
    }

    public void sf() {
        HandlerThread handlerThread = this.sf;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }
}
