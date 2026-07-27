package com.bytedance.adsdk.sf.gm.gm;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.sf.gm.gm.vj;
import com.bytedance.adsdk.sf.gm.sf.gbb;
import com.bytedance.adsdk.sf.gm.sf.kj;
import com.bytedance.adsdk.sf.pcc.sf.dax;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class pcc implements com.bytedance.adsdk.sf.pcc.pcc.vj, pcc.InterfaceC0101pcc {
    private Paint atb;
    private final RectF dax;
    private com.bytedance.adsdk.sf.pcc.sf.kj fum;
    private final Paint gbb;
    final vj gm;
    private final RectF gpj;
    private final Paint hc;
    private final RectF jr;
    private final List<com.bytedance.adsdk.sf.pcc.sf.pcc<?, ?>> jsj;
    private final String lo;
    private float lq;
    private final RectF lu;
    private boolean mk;
    private final RectF nac;
    private pcc of;
    final dax oo;
    final Matrix pcc;
    private List<pcc> qy;
    final com.bytedance.adsdk.sf.vy sf;
    private boolean tsz;
    private com.bytedance.adsdk.sf.pcc.sf.oo tz;
    float vj;
    BlurMaskFilter wh;
    private final Matrix ye;
    private pcc yt;
    private final Path qf = new Path();
    private final Matrix kj = new Matrix();
    private final Matrix vy = new Matrix();
    private final Paint ork = new com.bytedance.adsdk.sf.pcc.pcc(1);
    private final Paint vh = new com.bytedance.adsdk.sf.pcc.pcc(1, PorterDuff.Mode.DST_IN);
    private final Paint tmg = new com.bytedance.adsdk.sf.pcc.pcc(1, PorterDuff.Mode.DST_OUT);

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<com.bytedance.adsdk.sf.pcc.pcc.gm> list, List<com.bytedance.adsdk.sf.pcc.pcc.gm> list2) {
    }

    static pcc pcc(sf sfVar, vj vjVar, com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, Context context) {
        switch (AnonymousClass2.pcc[vjVar.vh().ordinal()]) {
            case 1:
                return new qf(vyVar, vjVar, sfVar, qfVar);
            case 2:
                return new sf(vyVar, vjVar, qfVar.sf(vjVar.qf()), qfVar, context);
            case 3:
                return new kj(vyVar, vjVar);
            case 4:
                if (pcc(vyVar, vjVar, "text:")) {
                    return new gm(vyVar, vjVar, context);
                }
                if (pcc(vyVar, vjVar, "videoview:")) {
                    return new ork(vyVar, vjVar, context);
                }
                return new oo(vyVar, vjVar);
            case 5:
                return new wh(vyVar, vjVar);
            case 6:
                return new vy(vyVar, vjVar);
            default:
                new StringBuilder("Unknown layer type ").append(vjVar.vh());
                return null;
        }
    }

    private static boolean pcc(com.bytedance.adsdk.sf.vy vyVar, vj vjVar, String str) {
        com.bytedance.adsdk.sf.ork wh;
        if (vyVar == null || vjVar == null || str == null || (wh = vyVar.wh(vjVar.qf())) == null) {
            return false;
        }
        return str.equals(wh.ork());
    }

    pcc(com.bytedance.adsdk.sf.vy vyVar, vj vjVar) {
        com.bytedance.adsdk.sf.pcc.pcc pccVar = new com.bytedance.adsdk.sf.pcc.pcc(1);
        this.hc = pccVar;
        this.gbb = new com.bytedance.adsdk.sf.pcc.pcc(PorterDuff.Mode.CLEAR);
        this.jr = new RectF();
        this.dax = new RectF();
        this.nac = new RectF();
        this.lu = new RectF();
        this.gpj = new RectF();
        this.pcc = new Matrix();
        this.jsj = new ArrayList();
        this.tsz = true;
        this.vj = 0.0f;
        this.ye = new Matrix();
        this.lq = 1.0f;
        this.sf = vyVar;
        this.gm = vjVar;
        this.lo = vjVar.wh() + "#draw";
        if (vjVar.tmg() == vj.sf.INVERT) {
            pccVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            pccVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        dax ork = vjVar.jr().ork();
        this.oo = ork;
        ork.pcc((pcc.InterfaceC0101pcc) this);
        if (vjVar.ork() != null && !vjVar.ork().isEmpty()) {
            com.bytedance.adsdk.sf.pcc.sf.kj kjVar = new com.bytedance.adsdk.sf.pcc.sf.kj(vjVar.ork());
            this.fum = kjVar;
            Iterator<com.bytedance.adsdk.sf.pcc.sf.pcc<gbb, Path>> it = kjVar.sf().iterator();
            while (it.hasNext()) {
                it.next().pcc(this);
            }
            for (com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar2 : this.fum.gm()) {
                pcc(pccVar2);
                pccVar2.pcc(this);
            }
        }
        tmg();
    }

    void pcc(boolean z) {
        if (z && this.atb == null) {
            this.atb = new com.bytedance.adsdk.sf.pcc.pcc();
        }
        this.mk = z;
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0101pcc
    public void pcc() {
        hc();
    }

    vj sf() {
        return this.gm;
    }

    void pcc(pcc pccVar) {
        this.of = pccVar;
    }

    boolean gm() {
        return this.of != null;
    }

    void sf(pcc pccVar) {
        this.yt = pccVar;
    }

    private void tmg() {
        if (!this.gm.oo().isEmpty()) {
            com.bytedance.adsdk.sf.pcc.sf.oo ooVar = new com.bytedance.adsdk.sf.pcc.sf.oo(this.gm.oo());
            this.tz = ooVar;
            ooVar.pcc();
            this.tz.pcc(new pcc.InterfaceC0101pcc() { // from class: com.bytedance.adsdk.sf.gm.gm.pcc.1
                @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0101pcc
                public void pcc() {
                    pcc pccVar = pcc.this;
                    pccVar.sf(pccVar.tz.vy() == 1.0f);
                }
            });
            sf(this.tz.qf().floatValue() == 1.0f);
            pcc(this.tz);
            return;
        }
        sf(true);
    }

    private void hc() {
        this.sf.invalidateSelf();
    }

    public void pcc(com.bytedance.adsdk.sf.pcc.sf.pcc<?, ?> pccVar) {
        if (pccVar == null) {
            return;
        }
        this.jsj.add(pccVar);
    }

    public Matrix oo() {
        return this.ye;
    }

    public String vj() {
        vj vjVar = this.gm;
        if (vjVar != null) {
            return vjVar.qf();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        this.jr.set(0.0f, 0.0f, 0.0f, 0.0f);
        jr();
        this.pcc.set(matrix);
        if (z) {
            List<pcc> list = this.qy;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.pcc.preConcat(this.qy.get(size).oo.oo());
                }
            } else {
                pcc pccVar = this.yt;
                if (pccVar != null) {
                    this.pcc.preConcat(pccVar.oo.oo());
                }
            }
        }
        this.pcc.preConcat(this.oo.oo());
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer qf;
        com.bytedance.adsdk.sf.vj.pcc(this.lo);
        if (!this.tsz || this.gm.tz()) {
            com.bytedance.adsdk.sf.vj.sf(this.lo);
            return;
        }
        jr();
        com.bytedance.adsdk.sf.vj.pcc("Layer#parentMatrix");
        this.ye.set(matrix);
        this.kj.reset();
        this.kj.set(matrix);
        for (int size = this.qy.size() - 1; size >= 0; size--) {
            this.kj.preConcat(this.qy.get(size).oo.oo());
        }
        com.bytedance.adsdk.sf.vj.sf("Layer#parentMatrix");
        com.bytedance.adsdk.sf.pcc.sf.pcc<?, Integer> pcc = this.oo.pcc();
        int intValue = (int) ((((i / 255.0f) * ((pcc == null || (qf = pcc.qf()) == null) ? 100 : qf.intValue())) / 100.0f) * 255.0f);
        if (!gm() && !qf()) {
            this.kj.preConcat(this.oo.oo());
            com.bytedance.adsdk.sf.vj.pcc("Layer#drawLayer");
            sf(canvas, this.kj, intValue);
            com.bytedance.adsdk.sf.vj.sf("Layer#drawLayer");
            gm(com.bytedance.adsdk.sf.vj.sf(this.lo));
            return;
        }
        com.bytedance.adsdk.sf.vj.pcc("Layer#computeBounds");
        pcc(this.jr, this.kj, false);
        sf(this.jr, matrix);
        this.kj.preConcat(this.oo.oo());
        pcc(this.jr, this.kj);
        this.dax.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.vy);
        if (!this.vy.isIdentity()) {
            Matrix matrix2 = this.vy;
            matrix2.invert(matrix2);
            this.vy.mapRect(this.dax);
        }
        if (!this.jr.intersect(this.dax)) {
            this.jr.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.bytedance.adsdk.sf.vj.sf("Layer#computeBounds");
        if (this.jr.width() >= 1.0f && this.jr.height() >= 1.0f) {
            com.bytedance.adsdk.sf.vj.pcc("Layer#saveLayer");
            this.ork.setAlpha(255);
            com.bytedance.adsdk.sf.wh.wh.pcc(canvas, this.jr, this.ork);
            com.bytedance.adsdk.sf.vj.sf("Layer#saveLayer");
            pcc(canvas);
            com.bytedance.adsdk.sf.vj.pcc("Layer#drawLayer");
            sf(canvas, this.kj, intValue);
            com.bytedance.adsdk.sf.vj.sf("Layer#drawLayer");
            if (qf()) {
                pcc(canvas, this.kj);
            }
            if (gm()) {
                com.bytedance.adsdk.sf.vj.pcc("Layer#drawMatte");
                com.bytedance.adsdk.sf.vj.pcc("Layer#saveLayer");
                com.bytedance.adsdk.sf.wh.wh.pcc(canvas, this.jr, this.hc, 19);
                com.bytedance.adsdk.sf.vj.sf("Layer#saveLayer");
                pcc(canvas);
                this.of.pcc(canvas, matrix, intValue);
                com.bytedance.adsdk.sf.vj.pcc("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.sf.vj.sf("Layer#restoreLayer");
                com.bytedance.adsdk.sf.vj.sf("Layer#drawMatte");
            }
            com.bytedance.adsdk.sf.vj.pcc("Layer#restoreLayer");
            canvas.restore();
            com.bytedance.adsdk.sf.vj.sf("Layer#restoreLayer");
        }
        if (this.mk && (paint = this.atb) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.atb.setColor(-251901);
            this.atb.setStrokeWidth(4.0f);
            canvas.drawRect(this.jr, this.atb);
            this.atb.setStyle(Paint.Style.FILL);
            this.atb.setColor(1357638635);
            canvas.drawRect(this.jr, this.atb);
        }
        gm(com.bytedance.adsdk.sf.vj.sf(this.lo));
    }

    private void gm(float f) {
        this.sf.jsj().gm().pcc(this.gm.wh(), f);
    }

    private void pcc(Canvas canvas) {
        com.bytedance.adsdk.sf.vj.pcc("Layer#clearLayer");
        canvas.drawRect(this.jr.left - 1.0f, this.jr.top - 1.0f, this.jr.right + 1.0f, this.jr.bottom + 1.0f, this.gbb);
        com.bytedance.adsdk.sf.vj.sf("Layer#clearLayer");
    }

    private void pcc(RectF rectF, Matrix matrix) {
        this.nac.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (qf()) {
            int size = this.fum.pcc().size();
            for (int i = 0; i < size; i++) {
                com.bytedance.adsdk.sf.gm.sf.kj kjVar = this.fum.pcc().get(i);
                Path qf = this.fum.sf().get(i).qf();
                if (qf != null) {
                    this.qf.set(qf);
                    this.qf.transform(matrix);
                    int i2 = AnonymousClass2.sf[kjVar.pcc().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && kjVar.oo()) {
                        return;
                    }
                    this.qf.computeBounds(this.gpj, false);
                    if (i == 0) {
                        this.nac.set(this.gpj);
                    } else {
                        RectF rectF2 = this.nac;
                        rectF2.set(Math.min(rectF2.left, this.gpj.left), Math.min(this.nac.top, this.gpj.top), Math.max(this.nac.right, this.gpj.right), Math.max(this.nac.bottom, this.gpj.bottom));
                    }
                }
            }
            if (rectF.intersect(this.nac)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: com.bytedance.adsdk.sf.gm.gm.pcc$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] pcc;
        static final /* synthetic */ int[] sf;

        static {
            int[] iArr = new int[kj.pcc.values().length];
            sf = iArr;
            try {
                iArr[kj.pcc.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                sf[kj.pcc.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                sf[kj.pcc.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                sf[kj.pcc.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[vj.pcc.values().length];
            pcc = iArr2;
            try {
                iArr2[vj.pcc.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pcc[vj.pcc.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pcc[vj.pcc.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                pcc[vj.pcc.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                pcc[vj.pcc.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                pcc[vj.pcc.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                pcc[vj.pcc.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void sf(RectF rectF, Matrix matrix) {
        if (gm() && this.gm.tmg() != vj.sf.INVERT) {
            this.lu.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.of.pcc(this.lu, matrix, true);
            if (rectF.intersect(this.lu)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public float wh() {
        return this.lq;
    }

    protected void pcc(int i) {
        this.lq = ((this.oo.pcc() != null ? this.oo.pcc().qf().intValue() : 100) / 100.0f) * (i / 255.0f);
    }

    public void sf(Canvas canvas, Matrix matrix, int i) {
        pcc(i);
    }

    private void pcc(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.sf.vj.pcc("Layer#saveLayer");
        com.bytedance.adsdk.sf.wh.wh.pcc(canvas, this.jr, this.vh, 19);
        if (Build.VERSION.SDK_INT < 28) {
            pcc(canvas);
        }
        com.bytedance.adsdk.sf.vj.sf("Layer#saveLayer");
        for (int i = 0; i < this.fum.pcc().size(); i++) {
            com.bytedance.adsdk.sf.gm.sf.kj kjVar = this.fum.pcc().get(i);
            com.bytedance.adsdk.sf.pcc.sf.pcc<gbb, Path> pccVar = this.fum.sf().get(i);
            com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar2 = this.fum.gm().get(i);
            int i2 = AnonymousClass2.sf[kjVar.pcc().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.ork.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.ork.setAlpha(255);
                        canvas.drawRect(this.jr, this.ork);
                    }
                    if (kjVar.oo()) {
                        gm(canvas, matrix, pccVar, pccVar2);
                    } else {
                        pcc(canvas, matrix, pccVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (kjVar.oo()) {
                            sf(canvas, matrix, pccVar, pccVar2);
                        } else {
                            pcc(canvas, matrix, pccVar, pccVar2);
                        }
                    }
                } else if (kjVar.oo()) {
                    vj(canvas, matrix, pccVar, pccVar2);
                } else {
                    oo(canvas, matrix, pccVar, pccVar2);
                }
            } else if (gbb()) {
                this.ork.setAlpha(255);
                canvas.drawRect(this.jr, this.ork);
            }
        }
        com.bytedance.adsdk.sf.vj.pcc("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.sf.vj.sf("Layer#restoreLayer");
    }

    private boolean gbb() {
        if (this.fum.sf().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.fum.pcc().size(); i++) {
            if (this.fum.pcc().get(i).pcc() != kj.pcc.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void pcc(Canvas canvas, Matrix matrix, com.bytedance.adsdk.sf.pcc.sf.pcc<gbb, Path> pccVar, com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar2) {
        this.qf.set(pccVar.qf());
        this.qf.transform(matrix);
        this.ork.setAlpha((int) (pccVar2.qf().intValue() * 2.55f));
        canvas.drawPath(this.qf, this.ork);
    }

    private void sf(Canvas canvas, Matrix matrix, com.bytedance.adsdk.sf.pcc.sf.pcc<gbb, Path> pccVar, com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar2) {
        com.bytedance.adsdk.sf.wh.wh.pcc(canvas, this.jr, this.ork);
        canvas.drawRect(this.jr, this.ork);
        this.qf.set(pccVar.qf());
        this.qf.transform(matrix);
        this.ork.setAlpha((int) (pccVar2.qf().intValue() * 2.55f));
        canvas.drawPath(this.qf, this.tmg);
        canvas.restore();
    }

    private void pcc(Canvas canvas, Matrix matrix, com.bytedance.adsdk.sf.pcc.sf.pcc<gbb, Path> pccVar) {
        this.qf.set(pccVar.qf());
        this.qf.transform(matrix);
        canvas.drawPath(this.qf, this.tmg);
    }

    private void gm(Canvas canvas, Matrix matrix, com.bytedance.adsdk.sf.pcc.sf.pcc<gbb, Path> pccVar, com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar2) {
        com.bytedance.adsdk.sf.wh.wh.pcc(canvas, this.jr, this.tmg);
        canvas.drawRect(this.jr, this.ork);
        this.tmg.setAlpha((int) (pccVar2.qf().intValue() * 2.55f));
        this.qf.set(pccVar.qf());
        this.qf.transform(matrix);
        canvas.drawPath(this.qf, this.tmg);
        canvas.restore();
    }

    private void oo(Canvas canvas, Matrix matrix, com.bytedance.adsdk.sf.pcc.sf.pcc<gbb, Path> pccVar, com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar2) {
        com.bytedance.adsdk.sf.wh.wh.pcc(canvas, this.jr, this.vh);
        this.qf.set(pccVar.qf());
        this.qf.transform(matrix);
        this.ork.setAlpha((int) (pccVar2.qf().intValue() * 2.55f));
        canvas.drawPath(this.qf, this.ork);
        canvas.restore();
    }

    private void vj(Canvas canvas, Matrix matrix, com.bytedance.adsdk.sf.pcc.sf.pcc<gbb, Path> pccVar, com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar2) {
        com.bytedance.adsdk.sf.wh.wh.pcc(canvas, this.jr, this.vh);
        canvas.drawRect(this.jr, this.ork);
        this.tmg.setAlpha((int) (pccVar2.qf().intValue() * 2.55f));
        this.qf.set(pccVar.qf());
        this.qf.transform(matrix);
        canvas.drawPath(this.qf, this.tmg);
        canvas.restore();
    }

    boolean qf() {
        com.bytedance.adsdk.sf.pcc.sf.kj kjVar = this.fum;
        return (kjVar == null || kjVar.sf().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(boolean z) {
        if (z != this.tsz) {
            this.tsz = z;
            hc();
        }
    }

    public boolean kj() {
        return this.tsz;
    }

    void pcc(float f) {
        this.oo.pcc(f);
        if (this.fum != null) {
            for (int i = 0; i < this.fum.sf().size(); i++) {
                this.fum.sf().get(i).pcc(f);
            }
        }
        com.bytedance.adsdk.sf.pcc.sf.oo ooVar = this.tz;
        if (ooVar != null) {
            ooVar.pcc(f);
        }
        pcc pccVar = this.of;
        if (pccVar != null) {
            pccVar.pcc(f);
        }
        for (int i2 = 0; i2 < this.jsj.size(); i2++) {
            this.jsj.get(i2).pcc(f);
        }
    }

    private void jr() {
        if (this.qy != null) {
            return;
        }
        if (this.yt == null) {
            this.qy = Collections.emptyList();
            return;
        }
        this.qy = new ArrayList();
        for (pcc pccVar = this.yt; pccVar != null; pccVar = pccVar.yt) {
            this.qy.add(pccVar);
        }
    }

    public String vy() {
        return this.gm.wh();
    }

    public com.bytedance.adsdk.sf.gm.sf.pcc ork() {
        return this.gm.of();
    }

    public BlurMaskFilter sf(float f) {
        if (this.vj == f) {
            return this.wh;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.wh = blurMaskFilter;
        this.vj = f;
        return blurMaskFilter;
    }

    public com.bytedance.adsdk.sf.vj.ork vh() {
        return this.gm.yt();
    }
}
