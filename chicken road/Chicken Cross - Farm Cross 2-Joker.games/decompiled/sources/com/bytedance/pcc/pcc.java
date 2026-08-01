package com.bytedance.pcc;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public abstract class pcc<D> {
    private InterfaceC0116pcc<D> gm;
    private int oo;
    private final long pcc = System.currentTimeMillis();
    private final String sf;
    private D vj;
    private int wh;

    /* renamed from: com.bytedance.pcc.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0116pcc<T> {
        T pcc();
    }

    public abstract byte[] oo();

    public abstract int qf();

    public pcc(String str, InterfaceC0116pcc<D> interfaceC0116pcc) {
        this.sf = str;
        this.gm = interfaceC0116pcc;
    }

    public pcc(String str, D d) {
        this.sf = str;
        this.vj = d;
    }

    public long pcc() {
        return this.pcc;
    }

    public int sf() {
        return this.oo;
    }

    public void pcc(int i) {
        this.oo = i;
    }

    public D gm() {
        InterfaceC0116pcc<D> interfaceC0116pcc;
        if (this.vj == null && (interfaceC0116pcc = this.gm) != null) {
            this.vj = interfaceC0116pcc.pcc();
        }
        return this.vj;
    }

    public int vj() {
        return this.wh;
    }

    public void sf(int i) {
        this.wh = i;
    }

    public String toString() {
        return com.bytedance.pcc.pcc.oo.pcc ? "AppEvent{, createTime=" + this.pcc + ", id=" + this.sf + ", uploadRetryCount=" + this.wh + AbstractJsonLexerKt.END_OBJ : super.toString();
    }

    public String wh() {
        return this.sf;
    }
}
