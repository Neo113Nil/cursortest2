package com.bytedance.sdk.openadsdk.component.reward.gm.sf;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.tsz;

/* loaded from: classes4.dex */
public class sf implements tsz.pcc {
    private long gm;
    private long oo;
    private pcc sf;
    private Handler pcc = new tsz(this);
    private boolean vj = false;
    private boolean wh = false;
    private int qf = 10000;
    private int kj = 10000;

    public interface pcc {
        void pcc();

        void pcc(EnumC0145sf enumC0145sf);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.gm.sf.sf$sf, reason: collision with other inner class name */
    public enum EnumC0145sf {
        NORMAL,
        TIMEOUT,
        DISCONNECTED
    }

    public void pcc(int i) {
        this.qf = i;
    }

    public void sf(int i) {
        this.kj = i;
    }

    public void pcc(pcc pccVar) {
        if (this.vj) {
            return;
        }
        this.sf = pccVar;
        this.vj = true;
        this.wh = false;
        this.pcc.sendEmptyMessage(1);
        if (pccVar != null) {
            pccVar.pcc(EnumC0145sf.NORMAL);
        }
    }

    public void pcc() {
        this.vj = false;
        this.wh = false;
        this.pcc.removeMessages(1);
        this.pcc.removeMessages(2);
        this.sf = null;
    }

    private void gm() {
        if (!this.vj || this.sf == null) {
            return;
        }
        this.gm = System.currentTimeMillis();
        this.wh = true;
        this.sf.pcc();
        this.pcc.removeMessages(2);
        this.pcc.sendEmptyMessageDelayed(2, this.kj);
        this.pcc.removeMessages(1);
        this.pcc.sendEmptyMessageDelayed(1, this.qf);
    }

    public void sf() {
        if (this.vj && this.wh) {
            this.oo = System.currentTimeMillis();
            this.wh = false;
            this.pcc.removeMessages(2);
            pcc pccVar = this.sf;
            if (pccVar != null) {
                pccVar.pcc(EnumC0145sf.NORMAL);
            }
        }
    }

    private void oo() {
        if (this.vj && this.wh && System.currentTimeMillis() - this.gm >= this.qf) {
            this.wh = false;
            pcc pccVar = this.sf;
            if (pccVar != null) {
                pccVar.pcc(EnumC0145sf.TIMEOUT);
            }
            pcc();
        }
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        int i = message.what;
        if (i == 1) {
            gm();
        } else {
            if (i != 2) {
                return;
            }
            oo();
        }
    }
}
