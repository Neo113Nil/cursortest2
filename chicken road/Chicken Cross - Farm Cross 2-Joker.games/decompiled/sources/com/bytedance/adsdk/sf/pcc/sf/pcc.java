package com.bytedance.adsdk.sf.pcc.sf;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class pcc<K, A> {
    protected com.bytedance.adsdk.sf.qf.sf<A> gm;
    private final gm<K> vj;
    final List<InterfaceC0101pcc> pcc = new ArrayList(1);
    private boolean oo = false;
    protected float sf = 0.0f;
    private A wh = null;
    private float qf = -1.0f;
    private float kj = -1.0f;

    private interface gm<T> {
        float gm();

        float oo();

        boolean pcc();

        boolean pcc(float f);

        com.bytedance.adsdk.sf.qf.pcc<T> sf();

        boolean sf(float f);
    }

    /* renamed from: com.bytedance.adsdk.sf.pcc.sf.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0101pcc {
        void pcc();
    }

    abstract A pcc(com.bytedance.adsdk.sf.qf.pcc<K> pccVar, float f);

    pcc(List<? extends com.bytedance.adsdk.sf.qf.pcc<K>> list) {
        this.vj = pcc(list);
    }

    public void pcc() {
        this.oo = true;
    }

    public void pcc(InterfaceC0101pcc interfaceC0101pcc) {
        this.pcc.add(interfaceC0101pcc);
    }

    public void pcc(float f) {
        if (this.vj.pcc()) {
            return;
        }
        if (f < vy()) {
            f = vy();
        } else if (f > wh()) {
            f = wh();
        }
        if (f == this.sf) {
            return;
        }
        this.sf = f;
        if (this.vj.pcc(f)) {
            sf();
        }
    }

    public void sf() {
        for (int i = 0; i < this.pcc.size(); i++) {
            this.pcc.get(i).pcc();
        }
    }

    protected com.bytedance.adsdk.sf.qf.pcc<K> gm() {
        com.bytedance.adsdk.sf.vj.pcc("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.sf.qf.pcc<K> sf2 = this.vj.sf();
        com.bytedance.adsdk.sf.vj.sf("BaseKeyframeAnimation#getCurrentKeyframe");
        return sf2;
    }

    float oo() {
        if (this.oo) {
            return 0.0f;
        }
        com.bytedance.adsdk.sf.qf.pcc<K> gm2 = gm();
        if (gm2.vj()) {
            return 0.0f;
        }
        return (this.sf - gm2.gm()) / (gm2.oo() - gm2.gm());
    }

    protected float vj() {
        com.bytedance.adsdk.sf.qf.pcc<K> gm2 = gm();
        if (gm2 == null || gm2.vj()) {
            return 0.0f;
        }
        return gm2.gm.getInterpolation(oo());
    }

    private float vy() {
        if (this.qf == -1.0f) {
            this.qf = this.vj.gm();
        }
        return this.qf;
    }

    float wh() {
        if (this.kj == -1.0f) {
            this.kj = this.vj.oo();
        }
        return this.kj;
    }

    public A qf() {
        A pcc;
        float oo2 = oo();
        if (this.gm == null && this.vj.sf(oo2)) {
            return this.wh;
        }
        com.bytedance.adsdk.sf.qf.pcc<K> gm2 = gm();
        if (gm2.oo != null && gm2.vj != null) {
            pcc = pcc(gm2, oo2, gm2.oo.getInterpolation(oo2), gm2.vj.getInterpolation(oo2));
        } else {
            pcc = pcc(gm2, vj());
        }
        this.wh = pcc;
        return pcc;
    }

    public float kj() {
        return this.sf;
    }

    protected A pcc(com.bytedance.adsdk.sf.qf.pcc<K> pccVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> gm<T> pcc(List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> list) {
        if (list.isEmpty()) {
            return new sf();
        }
        if (list.size() == 1) {
            return new vj(list);
        }
        return new oo(list);
    }

    private static final class sf<T> implements gm<T> {
        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float gm() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float oo() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc() {
            return true;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc(float f) {
            return false;
        }

        private sf() {
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public com.bytedance.adsdk.sf.qf.pcc<T> sf() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean sf(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    private static final class vj<T> implements gm<T> {
        private final com.bytedance.adsdk.sf.qf.pcc<T> pcc;
        private float sf = -1.0f;

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc() {
            return false;
        }

        vj(List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> list) {
            this.pcc = list.get(0);
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc(float f) {
            return !this.pcc.vj();
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public com.bytedance.adsdk.sf.qf.pcc<T> sf() {
            return this.pcc;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float gm() {
            return this.pcc.gm();
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float oo() {
            return this.pcc.oo();
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean sf(float f) {
            if (this.sf == f) {
                return true;
            }
            this.sf = f;
            return false;
        }
    }

    private static final class oo<T> implements gm<T> {
        private final List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> pcc;
        private com.bytedance.adsdk.sf.qf.pcc<T> gm = null;
        private float oo = -1.0f;
        private com.bytedance.adsdk.sf.qf.pcc<T> sf = gm(0.0f);

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc() {
            return false;
        }

        oo(List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> list) {
            this.pcc = list;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc(float f) {
            if (this.sf.pcc(f)) {
                return !this.sf.vj();
            }
            this.sf = gm(f);
            return true;
        }

        private com.bytedance.adsdk.sf.qf.pcc<T> gm(float f) {
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar = this.pcc.get(r0.size() - 1);
            if (f >= pccVar.gm()) {
                return pccVar;
            }
            for (int size = this.pcc.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.sf.qf.pcc<T> pccVar2 = this.pcc.get(size);
                if (this.sf != pccVar2 && pccVar2.pcc(f)) {
                    return pccVar2;
                }
            }
            return this.pcc.get(0);
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public com.bytedance.adsdk.sf.qf.pcc<T> sf() {
            return this.sf;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float gm() {
            return this.pcc.get(0).gm();
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float oo() {
            return this.pcc.get(r0.size() - 1).oo();
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean sf(float f) {
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar = this.gm;
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar2 = this.sf;
            if (pccVar == pccVar2 && this.oo == f) {
                return true;
            }
            this.gm = pccVar2;
            this.oo = f;
            return false;
        }
    }
}
