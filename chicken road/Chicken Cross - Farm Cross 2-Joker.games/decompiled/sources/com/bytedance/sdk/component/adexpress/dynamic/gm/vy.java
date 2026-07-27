package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.wh.qy;

/* loaded from: classes4.dex */
public class vy extends FrameLayout implements kj {
    private com.bytedance.sdk.component.adexpress.dynamic.oo.qf gm;
    private View.OnTouchListener kj;
    private View oo;
    private boolean ork;
    private Context pcc;
    private com.bytedance.sdk.component.adexpress.wh.nac qf;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj sf;
    private com.bytedance.sdk.component.adexpress.sf.hc tmg;
    private com.bytedance.sdk.component.adexpress.dynamic.oo.ork vh;
    private qf vj;
    private int vy;
    private String wh;

    public vy(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        super(context);
        this.pcc = context;
        this.sf = vjVar;
        this.gm = qfVar;
        qf();
    }

    public vy(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar, com.bytedance.sdk.component.adexpress.dynamic.oo.ork orkVar, com.bytedance.sdk.component.adexpress.sf.hc hcVar) {
        super(context);
        this.pcc = context;
        this.sf = vjVar;
        this.gm = qfVar;
        this.vh = orkVar;
        this.tmg = hcVar;
        qf();
    }

    private void qf() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.wh = this.gm.lrr();
        this.vy = this.gm.ri();
        this.ork = this.gm.hoh();
        qf pcc = ork.pcc(this.pcc, this.sf, this.gm, this.vh, this.tmg);
        this.vj = pcc;
        if (pcc != null) {
            this.oo = pcc.gm();
            if (this.gm.iv()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.wh, "6")) {
                if (this.gm.qcw() && !TextUtils.isEmpty(this.gm.vr())) {
                    this.qf = new com.bytedance.sdk.component.adexpress.wh.nac(this.pcc, com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(this.gm.vr()));
                } else {
                    this.qf = new com.bytedance.sdk.component.adexpress.wh.nac(this.pcc, Color.parseColor("#99000000"));
                }
                FrameLayout frameLayout = new FrameLayout(this.pcc);
                frameLayout.addView(this.qf, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.vy.1
                    @Override // java.lang.Runnable
                    public void run() {
                        vy.this.qf.sf();
                    }
                });
            }
            if (pcc(this.wh) && com.bytedance.sdk.component.adexpress.oo.sf()) {
                int parseColor = Color.parseColor("#99000000");
                if (this.gm.qcw() && !TextUtils.isEmpty(this.gm.vr())) {
                    try {
                        parseColor = com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(this.gm.vr());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.pcc);
                view.setBackgroundColor(parseColor);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.vj.gm());
            pcc(this.vj.gm());
            setVisibility(0);
        }
    }

    private boolean pcc(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.kj instanceof com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.gm) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void pcc(ViewGroup viewGroup) {
        if (this.oo == null) {
            return;
        }
        String str = this.wh;
        str.hashCode();
        switch (str) {
            case "0":
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.vj(this, this.vy);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case "1":
            case "6":
                if (!this.gm.qcw() || TextUtils.isEmpty(this.gm.vr())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.wh(this);
                break;
            case "2":
            case "7":
                setBackgroundColor(Color.parseColor("#80000000"));
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.sf(this, this);
                break;
            case "5":
                if (this.gm.qcw() && !TextUtils.isEmpty(this.gm.vr())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(this.gm.vr()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.gm(this);
                this.oo.setTag(2);
                break;
            case "8":
            case "11":
                this.sf.setClipChildren(false);
                this.sf.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.sf.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.wh(this);
                break;
            case "9":
            case "17":
                this.oo.setTag(2);
                break;
            case "10":
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.oo(this, this.vy, this.ork);
                break;
            case "12":
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.gm(this);
                this.oo.setTag(2);
                break;
            case "13":
            case "24":
                if (this.wh.equals("24") && com.bytedance.sdk.component.adexpress.oo.sf()) {
                    this.sf.setClipChildren(false);
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.wh(this);
                    break;
                } else {
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.vj(this, this.vy);
                    break;
                }
            case "14":
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.sf(this, this);
                break;
            case "16":
                View view = this.oo;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.wh.lu) && ((com.bytedance.sdk.component.adexpress.wh.lu) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.wh.lu) this.oo).getShakeLayout().setTag(2);
                }
                this.oo.setTag(2);
                break;
            case "18":
                View view2 = this.oo;
                if (view2 != null && (view2 instanceof qy) && ((qy) view2).getWriggleLayout() != null) {
                    ((qy) this.oo).getWriggleLayout().setTag(2);
                }
                this.oo.setTag(2);
                break;
            case "20":
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.pcc(this, this.vy, viewGroup);
                break;
            case "22":
                if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.kj(this, this.ork);
                    break;
                } else {
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.qf(this, this.vy, viewGroup);
                    break;
                }
            case "23":
                if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.wh(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.kj(this, this.ork);
                    break;
                }
                break;
            case "29":
                View view3 = this.oo;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.wh.wh) && ((com.bytedance.sdk.component.adexpress.wh.wh) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.wh.wh) this.oo).getShakeView().setTag(2);
                }
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.vj(this, this.vy);
                break;
        }
        View.OnTouchListener onTouchListener = this.kj;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (kj()) {
            this.oo.setTag(2);
            setOnClickListener((View.OnClickListener) this.sf.getDynamicClickListener());
        }
    }

    private boolean kj() {
        return (this.gm.hoh() || TextUtils.equals("9", this.wh) || TextUtils.equals("16", this.wh) || TextUtils.equals("17", this.wh) || TextUtils.equals("18", this.wh) || TextUtils.equals("20", this.wh) || TextUtils.equals("29", this.wh) || TextUtils.equals("10", this.wh)) ? false : true;
    }

    public void gm() {
        qf qfVar = this.vj;
        if (qfVar != null) {
            qfVar.pcc();
        }
    }

    public void oo() {
        qf qfVar = this.vj;
        if (qfVar != null) {
            qfVar.sf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            qf qfVar = this.vj;
            if (qfVar != null) {
                qfVar.sf();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void vj() {
        if (this.oo != null && TextUtils.equals(this.wh, "2")) {
            View view = this.oo;
            if (view instanceof com.bytedance.sdk.component.adexpress.wh.gm) {
                ((com.bytedance.sdk.component.adexpress.wh.gm) view).gm();
            }
        }
    }

    public void wh() {
        if (this.oo != null && TextUtils.equals(this.wh, "2")) {
            View view = this.oo;
            if (view instanceof com.bytedance.sdk.component.adexpress.wh.gm) {
                ((com.bytedance.sdk.component.adexpress.wh.gm) view).oo();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.kj
    public void pcc() {
        if (TextUtils.equals(this.wh, "6")) {
            com.bytedance.sdk.component.adexpress.wh.nac nacVar = this.qf;
            if (nacVar != null) {
                nacVar.gm();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.vy.2
                    @Override // java.lang.Runnable
                    public void run() {
                        vy.this.vy();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.wh, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.vy.3
                @Override // java.lang.Runnable
                public void run() {
                    vy.this.vy();
                }
            }, 400L);
        } else {
            vy();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.kj
    public void sf() {
        if (kj()) {
            setOnClickListener((View.OnClickListener) this.sf.getDynamicClickListener());
            performClick();
            if (this.gm.rt()) {
                return;
            }
            setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vy() {
        if (this.kj != null) {
            setOnClickListener((View.OnClickListener) this.sf.getDynamicClickListener());
            performClick();
            if (this.gm.rt()) {
                return;
            }
            setVisibility(8);
        }
    }
}
