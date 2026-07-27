package com.bytedance.adsdk.sf.qf;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.sf.qf;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class pcc<T> {
    private float dax;
    private int gbb;
    public final Interpolator gm;
    private int hc;
    private float jr;
    public PointF kj;
    public final Interpolator oo;
    private final qf ork;
    public final T pcc;
    public Float qf;
    public T sf;
    private float tmg;
    private float vh;
    public final Interpolator vj;
    public PointF vy;
    public final float wh;

    public pcc(qf qfVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.vh = -3987645.8f;
        this.tmg = -3987645.8f;
        this.hc = 784923401;
        this.gbb = 784923401;
        this.jr = Float.MIN_VALUE;
        this.dax = Float.MIN_VALUE;
        this.kj = null;
        this.vy = null;
        this.ork = qfVar;
        this.pcc = t;
        this.sf = t2;
        this.gm = interpolator;
        this.oo = null;
        this.vj = null;
        this.wh = f;
        this.qf = f2;
    }

    public pcc(qf qfVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.vh = -3987645.8f;
        this.tmg = -3987645.8f;
        this.hc = 784923401;
        this.gbb = 784923401;
        this.jr = Float.MIN_VALUE;
        this.dax = Float.MIN_VALUE;
        this.kj = null;
        this.vy = null;
        this.ork = qfVar;
        this.pcc = t;
        this.sf = t2;
        this.gm = null;
        this.oo = interpolator;
        this.vj = interpolator2;
        this.wh = f;
        this.qf = f2;
    }

    protected pcc(qf qfVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.vh = -3987645.8f;
        this.tmg = -3987645.8f;
        this.hc = 784923401;
        this.gbb = 784923401;
        this.jr = Float.MIN_VALUE;
        this.dax = Float.MIN_VALUE;
        this.kj = null;
        this.vy = null;
        this.ork = qfVar;
        this.pcc = t;
        this.sf = t2;
        this.gm = interpolator;
        this.oo = interpolator2;
        this.vj = interpolator3;
        this.wh = f;
        this.qf = f2;
    }

    public pcc(T t) {
        this.vh = -3987645.8f;
        this.tmg = -3987645.8f;
        this.hc = 784923401;
        this.gbb = 784923401;
        this.jr = Float.MIN_VALUE;
        this.dax = Float.MIN_VALUE;
        this.kj = null;
        this.vy = null;
        this.ork = null;
        this.pcc = t;
        this.sf = t;
        this.gm = null;
        this.oo = null;
        this.vj = null;
        this.wh = Float.MIN_VALUE;
        this.qf = Float.valueOf(Float.MAX_VALUE);
    }

    private pcc(T t, T t2) {
        this.vh = -3987645.8f;
        this.tmg = -3987645.8f;
        this.hc = 784923401;
        this.gbb = 784923401;
        this.jr = Float.MIN_VALUE;
        this.dax = Float.MIN_VALUE;
        this.kj = null;
        this.vy = null;
        this.ork = null;
        this.pcc = t;
        this.sf = t2;
        this.gm = null;
        this.oo = null;
        this.vj = null;
        this.wh = Float.MIN_VALUE;
        this.qf = Float.valueOf(Float.MAX_VALUE);
    }

    public pcc<T> pcc(T t, T t2) {
        return new pcc<>(t, t2);
    }

    public float gm() {
        qf qfVar = this.ork;
        if (qfVar == null) {
            return 0.0f;
        }
        if (this.jr == Float.MIN_VALUE) {
            this.jr = (this.wh - qfVar.wh()) / this.ork.nac();
        }
        return this.jr;
    }

    public float oo() {
        if (this.ork == null) {
            return 1.0f;
        }
        if (this.dax == Float.MIN_VALUE) {
            if (this.qf == null) {
                this.dax = 1.0f;
            } else {
                this.dax = gm() + ((this.qf.floatValue() - this.wh) / this.ork.nac());
            }
        }
        return this.dax;
    }

    public boolean vj() {
        return this.gm == null && this.oo == null && this.vj == null;
    }

    public boolean pcc(float f) {
        return f >= gm() && f < oo();
    }

    public float wh() {
        if (this.vh == -3987645.8f) {
            this.vh = ((Float) this.pcc).floatValue();
        }
        return this.vh;
    }

    public float qf() {
        if (this.tmg == -3987645.8f) {
            this.tmg = ((Float) this.sf).floatValue();
        }
        return this.tmg;
    }

    public int kj() {
        if (this.hc == 784923401) {
            this.hc = ((Integer) this.pcc).intValue();
        }
        return this.hc;
    }

    public int vy() {
        if (this.gbb == 784923401) {
            this.gbb = ((Integer) this.sf).intValue();
        }
        return this.gbb;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.pcc + ", endValue=" + this.sf + ", startFrame=" + this.wh + ", endFrame=" + this.qf + ", interpolator=" + this.gm + AbstractJsonLexerKt.END_OBJ;
    }
}
