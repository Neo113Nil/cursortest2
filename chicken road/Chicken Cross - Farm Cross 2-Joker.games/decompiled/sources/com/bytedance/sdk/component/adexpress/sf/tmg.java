package com.bytedance.sdk.component.adexpress.sf;

import com.bytedance.sdk.component.adexpress.sf.ork;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class tmg implements ork.pcc {
    private vy gm;
    private AtomicBoolean oo = new AtomicBoolean(false);
    jr pcc;
    private List<ork> sf;

    public tmg(List<ork> list, vy vyVar) {
        this.sf = list;
        this.gm = vyVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork.pcc
    public void pcc() {
        this.gm.oo();
        Iterator<ork> it = this.sf.iterator();
        while (it.hasNext() && !it.next().pcc(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork.pcc
    public void pcc(ork orkVar) {
        int indexOf = this.sf.indexOf(orkVar);
        if (indexOf < 0) {
            return;
        }
        do {
            indexOf++;
            if (indexOf >= this.sf.size()) {
                return;
            }
        } while (!this.sf.get(indexOf).pcc(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork.pcc
    public boolean sf(ork orkVar) {
        int indexOf = this.sf.indexOf(orkVar);
        return indexOf < this.sf.size() - 1 && indexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork.pcc
    public jr sf() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork.pcc
    public void pcc(jr jrVar) {
        this.pcc = jrVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork.pcc
    public void pcc(boolean z) {
        this.oo.getAndSet(z);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork.pcc
    public boolean gm() {
        return this.oo.get();
    }
}
