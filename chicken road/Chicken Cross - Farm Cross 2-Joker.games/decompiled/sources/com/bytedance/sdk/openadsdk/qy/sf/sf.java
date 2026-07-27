package com.bytedance.sdk.openadsdk.qy.sf;

import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public abstract class sf {
    protected final AtomicBoolean gm;
    private final Integer kj;
    private final AtomicLong oo;
    protected WeakReference<View> pcc;
    private final int qf;
    protected of sf;
    private final AtomicBoolean vj;
    private volatile boolean vy = false;
    private final vj.pcc wh;

    protected abstract boolean gm();

    protected abstract void sf(int i);

    public abstract int wh();

    public static sf pcc(boolean z, Integer num, View view, of ofVar, vj.pcc pccVar) {
        return z ? new kj(num, view, ofVar, pccVar) : new gm(num, view, ofVar, pccVar);
    }

    public sf(Integer num, View view, of ofVar, int i, vj.pcc pccVar) {
        this.kj = num;
        this.qf = i;
        this.sf = ofVar;
        this.wh = pccVar;
        pcc(view);
        this.gm = new AtomicBoolean(false);
        this.oo = new AtomicLong(-1L);
        this.vj = new AtomicBoolean(false);
    }

    public void pcc() {
        if (this.gm.compareAndSet(false, true)) {
            qf.pcc(this);
        }
    }

    public int sf() {
        if (vy()) {
            return 1;
        }
        WeakReference<View> weakReference = this.pcc;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.vy) {
            return 3;
        }
        if (vh().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI))) {
            return (vh().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI)) && gm()) ? 1 : 2;
        }
        ork();
        vj.sf(vh());
        return 3;
    }

    protected void oo() {
        if (this.vj.compareAndSet(false, true)) {
            oo.pcc(this.sf, vj(), this.wh);
        }
    }

    protected pcc vj() {
        WeakReference<View> weakReference = this.pcc;
        if (weakReference == null) {
            return new pcc(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        if (view == null) {
            return new pcc(0, 0, 0.0f);
        }
        return new pcc(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void qf() {
        if (vy()) {
            return;
        }
        if (!this.gm.get()) {
            kj();
        } else if (!this.oo.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.oo.get() >= this.qf) {
            oo();
        }
    }

    public void kj() {
        this.oo.set(-1L);
    }

    public boolean vy() {
        return this.vj.get();
    }

    public void ork() {
        this.vy = true;
        qf.sf(this);
    }

    public void pcc(int i) {
        if (i == 4) {
            pcc();
            return;
        }
        if (i == 8) {
            hc();
        } else if (i == 9) {
            oo();
        } else {
            sf(i);
        }
    }

    public Integer vh() {
        return this.kj;
    }

    public boolean tmg() {
        return this.gm.get();
    }

    public void hc() {
        this.gm.set(false);
        kj();
    }

    public void pcc(View view) {
        if (view != null) {
            view.setTag(InputDeviceCompat.SOURCE_HDMI, vh());
        }
        this.pcc = new WeakReference<>(view);
    }
}
