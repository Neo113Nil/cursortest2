package com.bytedance.sdk.component.pcc;

/* loaded from: classes4.dex */
public abstract class gm<P, R> extends com.bytedance.sdk.component.pcc.sf<P, R> {
    private vj gm;
    private boolean pcc = true;
    private pcc sf;

    interface pcc {
        void pcc(Object obj);

        void pcc(Throwable th);
    }

    public interface sf {
        gm pcc();
    }

    protected abstract void pcc(P p, vj vjVar) throws Exception;

    @Override // com.bytedance.sdk.component.pcc.sf
    public /* bridge */ /* synthetic */ String pcc() {
        return super.pcc();
    }

    protected final void pcc(R r) {
        if (wh()) {
            this.sf.pcc(r);
            oo();
        }
    }

    protected final void pcc(Throwable th) {
        if (wh()) {
            this.sf.pcc(th);
            oo();
        }
    }

    protected final void gm() {
        pcc((Throwable) null);
    }

    protected void oo() {
        this.pcc = false;
        this.gm = null;
    }

    void pcc(P p, vj vjVar, pcc pccVar) throws Exception {
        this.gm = vjVar;
        this.sf = pccVar;
        pcc(p, vjVar);
    }

    void vj() {
        oo();
    }

    private boolean wh() {
        if (this.pcc) {
            return true;
        }
        kj.pcc(new IllegalStateException("Jsb async call already finished: " + pcc() + ", hashcode: " + hashCode()));
        return false;
    }
}
