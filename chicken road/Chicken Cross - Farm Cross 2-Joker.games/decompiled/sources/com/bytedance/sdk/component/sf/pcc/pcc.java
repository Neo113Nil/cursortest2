package com.bytedance.sdk.component.sf.pcc;

/* loaded from: classes4.dex */
public final class pcc {
    public final boolean pcc;

    pcc(C0127pcc c0127pcc) {
        this.pcc = c0127pcc.pcc;
    }

    /* renamed from: com.bytedance.sdk.component.sf.pcc.pcc$pcc, reason: collision with other inner class name */
    public static final class C0127pcc {
        boolean pcc;

        public C0127pcc pcc() {
            this.pcc = true;
            return this;
        }

        public pcc sf() {
            return new pcc(this);
        }
    }
}
