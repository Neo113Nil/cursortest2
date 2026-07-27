package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.oo.hc;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class vj extends gm {
    private AtomicBoolean dax;
    private AtomicInteger gbb;
    private hc gpj;
    private int hc;
    private int jr;
    private String lu;
    private int nac;
    private float tmg;
    private float vh;

    public vj(Context context) {
        super(context);
        this.hc = 0;
        this.gbb = new AtomicInteger(Integer.MAX_VALUE);
        this.jr = Integer.MAX_VALUE;
        this.dax = new AtomicBoolean(true);
        this.nac = 0;
        this.lu = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        Object obj;
        Object obj2;
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        if (this.vj != null) {
            Object obj3 = this.vj.get("direction");
            String str = "all";
            if (obj3 != null && !TextUtils.isEmpty(String.valueOf(obj3))) {
                str = String.valueOf(obj3);
            }
            this.lu = str;
            Object obj4 = this.vj.get("distance");
            if (obj4 == null) {
                this.hc = 0;
            } else {
                this.hc = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj4), 0);
            }
            if (this.gbb.get() == Integer.MAX_VALUE && (obj2 = this.vj.get("frequency")) != null) {
                this.gbb.set(com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj2), Integer.MAX_VALUE));
            }
            if (this.jr == Integer.MAX_VALUE && (obj = this.vj.get("effectiveDuration")) != null) {
                this.jr = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj), Integer.MAX_VALUE);
            }
            Object obj5 = this.vj.get("inView");
            if (obj5 != null) {
                this.nac = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj5), 0);
            }
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.gbb + ", mEffectiveDuration: " + this.jr + ", inEffectiveDuation: " + this.dax.get());
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        pcc();
        hc hcVar = this.gpj;
        if (hcVar != null) {
            return hcVar.pcc(this.sf, motionEvent, this.pcc, this, this.lu, this.hc, this.gbb, this.nac, this.dax.get());
        }
        return pcc(this.sf, motionEvent);
    }

    private void pcc() {
        if (this.jr == Integer.MAX_VALUE || this.sf == null || System.currentTimeMillis() - this.sf.qy() < this.jr) {
            return;
        }
        this.dax.set(false);
        Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent) {
        char c;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.vh = motionEvent.getX();
            this.tmg = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.hc == 0 && this.pcc != null) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                return pcc(gmVar, x, y);
            }
            int sf = com.bytedance.adsdk.ugeno.qf.kj.sf(this.ork, x - this.vh);
            int sf2 = com.bytedance.adsdk.ugeno.qf.kj.sf(this.ork, y - this.tmg);
            String str = this.lu;
            switch (str.hashCode()) {
                case 3739:
                    if (str.equals("up")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 96673:
                    if (str.equals("all")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3089570:
                    if (str.equals("down")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                sf = -sf2;
            } else if (c == 1) {
                sf = sf2;
            } else if (c == 2) {
                sf = -sf;
            } else if (c != 3) {
                sf = (int) Math.abs(Math.sqrt(Math.pow(sf, 2.0d) + Math.pow(sf2, 2.0d)));
            }
            if (sf >= this.hc) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                if (this.pcc != null) {
                    this.vh = 0.0f;
                    this.tmg = 0.0f;
                    return pcc(gmVar, x, y);
                }
            } else {
                Log.d("GesThrough_UGSlideEvent", "Non-slide event");
                return false;
            }
        }
        return true;
    }

    private boolean pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, float f, float f2) {
        if (this.gbb.get() <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.dax.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.nac == 1 && !pcc(gmVar.vh(), f, f2)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.pcc.pcc(gmVar, this.wh, this.gm.sf(), this.gm);
        if (this.gbb.get() != Integer.MAX_VALUE) {
            this.gbb.decrementAndGet();
        }
        return true;
    }

    private boolean pcc(View view, float f, float f2) {
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }

    public void pcc(hc hcVar) {
        this.gpj = hcVar;
    }
}
