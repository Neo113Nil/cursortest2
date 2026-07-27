package com.bytedance.adsdk.sf.gm.gm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.sf.gm.gm.vj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class sf extends pcc {
    private final List<pcc> kj;
    private final RectF ork;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> qf;
    private boolean tmg;
    private final Paint vh;
    private final RectF vy;

    public sf(com.bytedance.adsdk.sf.vy vyVar, vj vjVar, List<vj> list, com.bytedance.adsdk.sf.qf qfVar, Context context) {
        super(vyVar, vjVar);
        int i;
        pcc pccVar;
        vj.sf tmg;
        int i2;
        this.kj = new ArrayList();
        this.vy = new RectF();
        this.ork = new RectF();
        this.vh = new Paint();
        this.tmg = true;
        com.bytedance.adsdk.sf.gm.pcc.sf fum = vjVar.fum();
        if (fum != null) {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc = fum.pcc();
            this.qf = pcc;
            pcc(pcc);
            this.qf.pcc(this);
        } else {
            this.qf = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(qfVar.hc().size());
        int size = list.size() - 1;
        pcc pccVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            vj vjVar2 = list.get(size);
            pcc pcc2 = pcc.pcc(this, vjVar2, vyVar, qfVar, context);
            if (pcc2 != null) {
                longSparseArray.put(pcc2.sf().vj(), pcc2);
                if (pccVar2 != null) {
                    pccVar2.pcc(pcc2);
                    pccVar2 = null;
                } else {
                    this.kj.add(0, pcc2);
                    if (vjVar2 != null && (tmg = vjVar2.tmg()) != null && ((i2 = AnonymousClass1.pcc[tmg.ordinal()]) == 1 || i2 == 2)) {
                        pccVar2 = pcc2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            pcc pccVar3 = (pcc) longSparseArray.get(longSparseArray.keyAt(i));
            if (pccVar3 != null && (pccVar = (pcc) longSparseArray.get(pccVar3.sf().hc())) != null) {
                pccVar3.sf(pccVar);
            }
        }
    }

    /* renamed from: com.bytedance.adsdk.sf.gm.gm.sf$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[vj.sf.values().length];
            pcc = iArr;
            try {
                iArr[vj.sf.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[vj.sf.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void sf(boolean z) {
        this.tmg = z;
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc
    public void pcc(boolean z) {
        super.pcc(z);
        Iterator<pcc> it = this.kj.iterator();
        while (it.hasNext()) {
            it.next().pcc(z);
        }
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc
    public void sf(Canvas canvas, Matrix matrix, int i) {
        super.sf(canvas, matrix, i);
        com.bytedance.adsdk.sf.vj.pcc("CompositionLayer#draw");
        this.ork.set(0.0f, 0.0f, this.gm.kj(), this.gm.vy());
        matrix.mapRect(this.ork);
        boolean z = this.sf.vy() && this.kj.size() > 1 && i != 255;
        if (z) {
            this.vh.setAlpha(i);
            com.bytedance.adsdk.sf.wh.wh.pcc(canvas, this.ork, this.vh);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.kj.size() - 1; size >= 0; size--) {
            if (((this.tmg || !"__container".equals(this.gm.wh())) && !this.ork.isEmpty()) ? canvas.clipRect(this.ork) : true) {
                this.kj.get(size).pcc(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.sf.vj.sf("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc, com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        super.pcc(rectF, matrix, z);
        for (int size = this.kj.size() - 1; size >= 0; size--) {
            this.vy.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.kj.get(size).pcc(this.vy, this.pcc, true);
            rectF.union(this.vy);
        }
    }

    public List<pcc> tmg() {
        return this.kj;
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc
    public void pcc(float f) {
        super.pcc(f);
        if (this.qf != null) {
            f = ((this.qf.qf().floatValue() * this.gm.pcc().tmg()) - this.gm.pcc().wh()) / (this.sf.jsj().nac() + 0.01f);
        }
        if (this.qf == null) {
            f -= this.gm.gm();
        }
        if (this.gm.sf() != 0.0f && !"__container".equals(this.gm.wh())) {
            f /= this.gm.sf();
        }
        for (int size = this.kj.size() - 1; size >= 0; size--) {
            this.kj.get(size).pcc(f);
        }
    }
}
