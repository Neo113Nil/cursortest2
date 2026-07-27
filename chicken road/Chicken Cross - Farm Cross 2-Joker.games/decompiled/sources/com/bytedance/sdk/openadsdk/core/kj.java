package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.tsz;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class kj extends View implements tsz.pcc {
    private final Runnable gbb;
    private pcc gm;
    private boolean hc;
    private int kj;
    private View oo;
    private final AtomicBoolean ork;
    private boolean pcc;
    private boolean qf;
    private boolean sf;
    private boolean tmg;
    private ViewTreeObserver.OnGlobalLayoutListener vh;
    private List<View> vj;
    private final Handler vy;
    private List<View> wh;

    public interface pcc {
        void pcc();

        void pcc(View view);

        void pcc(boolean z);

        void sf();
    }

    public kj(Context context, View view, boolean z) {
        super(lu.pcc());
        this.vy = new com.bytedance.sdk.component.utils.tsz(jr.sf().getLooper(), this);
        this.ork = new AtomicBoolean(true);
        this.hc = false;
        this.gbb = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.kj.3
            @Override // java.lang.Runnable
            public void run() {
                if (kj.this.gm != null) {
                    kj.this.gm.pcc(kj.this.oo);
                }
            }
        };
        this.tmg = z;
        this.oo = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.vh = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.kj.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (kj.this.hc) {
                    return;
                }
                kj.this.vj();
                kj.this.oo();
            }
        };
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.pcc(z);
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.qf = false;
        sf();
        if (this.vh != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.vh);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        sf();
    }

    private void sf() {
        pcc pccVar;
        if (!this.ork.getAndSet(false) || (pccVar = this.gm) == null) {
            return;
        }
        pccVar.pcc();
    }

    private void gm() {
        pcc pccVar;
        if (this.ork.getAndSet(true) || (pccVar = this.gm) == null) {
            return;
        }
        pccVar.sf();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vj();
        this.qf = true;
        gm();
        pcc(false);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        gm();
    }

    public void setRefClickViews(List<View> list) {
        this.vj = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.wh = list;
    }

    public void pcc() {
        pcc(this.vj, (com.bytedance.sdk.openadsdk.core.gm.gm) null);
        pcc(this.wh, (com.bytedance.sdk.openadsdk.core.gm.gm) null);
    }

    public void pcc(List<View> list, com.bytedance.sdk.openadsdk.core.gm.gm gmVar) {
        if (com.bytedance.sdk.component.utils.hc.sf(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(gmVar);
                    view.setOnTouchListener(gmVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        if (!this.sf || this.pcc) {
            return;
        }
        this.pcc = true;
        this.vy.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vj() {
        if (this.pcc) {
            this.vy.removeCallbacksAndMessages(null);
            this.pcc = false;
        }
    }

    public void setNeedCheckingShow(boolean z) {
        this.sf = z;
        if (!z && this.pcc) {
            vj();
        } else {
            if (!z || this.pcc) {
                return;
            }
            oo();
        }
    }

    public void setCallback(pcc pccVar) {
        this.gm = pccVar;
    }

    public void setAdType(int i) {
        this.kj = i;
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        if (message.what == 1 && this.pcc) {
            if (wh() && nn.pcc(this.oo, 20, this.kj, this.tmg)) {
                vj();
                this.hc = true;
                jr.gm().post(this.gbb);
                pcc(true);
                return;
            }
            this.vy.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private boolean wh() {
        View view = this.oo;
        if (view instanceof com.bytedance.sdk.openadsdk.core.ork.fum) {
            return ((com.bytedance.sdk.openadsdk.core.ork.fum) view).qy();
        }
        return true;
    }

    private void pcc(final boolean z) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.vy.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.kj.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (kj.this.vh != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(kj.this.vh);
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    kj.this.vh = null;
                }
            }
        });
    }
}
