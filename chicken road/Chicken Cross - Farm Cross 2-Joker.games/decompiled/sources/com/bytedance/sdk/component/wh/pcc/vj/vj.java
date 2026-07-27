package com.bytedance.sdk.component.wh.pcc.vj;

import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class vj implements Comparable<vj>, Runnable {
    private String gm;
    private int pcc = 5;
    private String sf = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public vj(String str) {
        this.gm = str;
    }

    public void pcc(int i) {
        this.pcc = i;
    }

    public int pcc() {
        return this.pcc;
    }

    @Override // java.lang.Comparable
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public int compareTo(vj vjVar) {
        if (pcc() < vjVar.pcc()) {
            return 1;
        }
        return pcc() >= vjVar.pcc() ? -1 : 0;
    }
}
