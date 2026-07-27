package com.bytedance.sdk.openadsdk.core.gm;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.lu;

/* loaded from: classes4.dex */
public abstract class gm implements View.OnClickListener, View.OnTouchListener {
    protected static int atb = 8;
    protected View lq;
    protected float lo = -1.0f;
    protected float fum = -1.0f;
    protected float tz = -1.0f;
    protected float of = -1.0f;
    protected long yt = -1;
    protected long qy = -1;
    protected int jsj = -1;
    protected int tsz = BackupConstant.UNFINISHED_FAIL_CODE;
    protected int mk = -1;
    protected boolean ye = true;
    public SparseArray<pcc> zti = new SparseArray<>();
    private float pcc = 0.0f;
    private float sf = 0.0f;
    private float gm = 0.0f;
    private float oo = 0.0f;
    private long vj = 0;
    private int wh = 0;
    private int qf = 0;

    protected abstract void pcc(View view, float f, float f2, float f3, float f4, SparseArray<pcc> sparseArray, boolean z);

    static {
        if (lu.pcc() != null) {
            atb = lu.sf();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.qf.pcc()) {
            pcc(view, this.lo, this.fum, this.tz, this.of, this.zti, this.ye);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r11.oo <= r3) goto L19;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.tsz = motionEvent.getDeviceId();
        this.jsj = motionEvent.getToolType(0);
        this.mk = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i = 1;
        if (actionMasked != 0) {
            int i2 = 3;
            if (actionMasked == 1) {
                this.tz = motionEvent.getRawX();
                this.of = motionEvent.getRawY();
                this.qy = System.currentTimeMillis();
                if (Math.abs(this.tz - this.wh) >= atb || Math.abs(this.of - this.qf) >= atb) {
                    this.ye = false;
                }
                Point point = new Point((int) this.tz, (int) this.of);
                if (view != null && !sf.gm(view) && pcc((View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                this.gm += Math.abs(motionEvent.getX() - this.pcc);
                this.oo += Math.abs(motionEvent.getY() - this.sf);
                this.pcc = motionEvent.getX();
                this.sf = motionEvent.getY();
                if (System.currentTimeMillis() - this.vj > 200) {
                    float f = this.gm;
                    int i3 = atb;
                    if (f <= i3) {
                    }
                    this.tz = motionEvent.getRawX();
                    this.of = motionEvent.getRawY();
                    if (Math.abs(this.tz - this.wh) < atb || Math.abs(this.of - this.qf) >= atb) {
                        this.ye = false;
                    }
                }
                i = 2;
                this.tz = motionEvent.getRawX();
                this.of = motionEvent.getRawY();
                if (Math.abs(this.tz - this.wh) < atb) {
                }
                this.ye = false;
            }
            i = i2;
        } else {
            this.wh = (int) motionEvent.getRawX();
            this.qf = (int) motionEvent.getRawY();
            this.lo = motionEvent.getRawX();
            this.fum = motionEvent.getRawY();
            this.yt = System.currentTimeMillis();
            this.jsj = motionEvent.getToolType(0);
            this.tsz = motionEvent.getDeviceId();
            this.mk = motionEvent.getSource();
            this.gm = 0.0f;
            this.oo = 0.0f;
            this.vj = System.currentTimeMillis();
            this.ye = true;
            this.lq = view;
            com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(motionEvent);
            this.pcc = motionEvent.getX();
            this.sf = motionEvent.getY();
            i = 0;
        }
        this.zti.put(motionEvent.getActionMasked(), new pcc(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }

    private boolean pcc(View view, Point point) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (sf.gm(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && point.x >= iArr[0] && point.x <= iArr[0] + childAt.getWidth() && point.y >= iArr[1] && point.y <= iArr[1] + childAt.getHeight();
                }
                if (pcc(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class pcc {
        public double gm;
        public long oo;
        public int pcc;
        public double sf;

        public pcc(int i, double d, double d2, long j) {
            this.pcc = i;
            this.sf = d;
            this.gm = d2;
            this.oo = j;
        }
    }

    public boolean wh() {
        return this.ye;
    }
}
