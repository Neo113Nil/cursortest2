package com.bytedance.sdk.openadsdk.core.jr.oo;

import com.bykv.vk.openvk.pcc.pcc.pcc.pcc;
import com.bykv.vk.openvk.pcc.pcc.sf.gm.oo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class gm extends oo {
    private final pcc oo;
    private final List<sf> pcc = Collections.synchronizedList(new ArrayList());
    private int sf = 1;
    private int gm = 1;

    public interface sf extends pcc.InterfaceC0094pcc {
        void pcc(int i, int i2);
    }

    static /* synthetic */ int pcc(gm gmVar) {
        int i = gmVar.gm;
        gmVar.gm = i + 1;
        return i;
    }

    public gm() {
        pcc pccVar = new pcc();
        this.oo = pccVar;
        super.pcc(pccVar);
        pcc(500);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.oo
    public long nac() {
        return super.nac() * this.sf;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.oo
    public long lu() {
        long lu = super.lu();
        return this.sf == 1 ? lu : lu + ((this.gm - 1) * super.nac());
    }

    public void gm(int i) {
        this.sf = Math.max(1, i);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.oo
    public void pcc(pcc.InterfaceC0094pcc interfaceC0094pcc) {
        if (interfaceC0094pcc instanceof sf) {
            if (this.pcc.contains(interfaceC0094pcc)) {
                return;
            }
            this.pcc.add((sf) interfaceC0094pcc);
            return;
        }
        super.pcc(interfaceC0094pcc);
    }

    public int fum() {
        return this.gm;
    }

    private class pcc implements pcc.InterfaceC0094pcc {
        private pcc() {
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            gm.pcc(gm.this);
            if (gm.this.gm <= gm.this.sf) {
                Iterator it = gm.this.pcc.iterator();
                while (it.hasNext()) {
                    ((sf) it.next()).pcc(gm.this.gm, gm.this.sf);
                }
                gm.this.vy();
                return;
            }
            Iterator it2 = gm.this.pcc.iterator();
            while (it2.hasNext()) {
                ((sf) it2.next()).pcc(pccVar);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, long j) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(pccVar, j);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).sf(pccVar);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc pccVar2) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(pccVar, pccVar2);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, boolean z) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(pccVar, z);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void gm(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).gm(pccVar);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i, int i2) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(pccVar, i, i2);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i, int i2, int i3) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(pccVar, i, i2, i3);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(pccVar, i);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).sf(pccVar, i);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, long j, long j2) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(pccVar, j, j2);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void oo(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).oo(pccVar);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void vj(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).vj(pccVar);
            }
        }
    }
}
