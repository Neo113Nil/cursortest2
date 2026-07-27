package com.bytedance.pcc;

import android.content.Context;
import com.bytedance.pcc.pcc.wh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class gm {

    /* renamed from: com.bytedance.pcc.gm$gm, reason: collision with other inner class name */
    public interface InterfaceC0115gm {
        long pcc();

        void pcc(String str);
    }

    public interface oo {
        ExecutorService pcc();

        ExecutorService sf();
    }

    public interface pcc {
        byte[] pcc(byte[] bArr);

        byte[] sf(byte[] bArr);
    }

    public interface sf<T extends com.bytedance.pcc.pcc> {
        void pcc(ArrayList<T> arrayList, boolean z);
    }

    public static com.bytedance.pcc.oo pcc(Context context, vj vjVar) {
        wh.pcc(context);
        return new com.bytedance.pcc.pcc.sf(context, vjVar);
    }

    public static void pcc(boolean z) {
        com.bytedance.pcc.pcc.pcc.pcc(z);
    }

    public static abstract class vj {
        private final String gm;
        private boolean kj;
        private boolean oo;
        private oo qf;
        private boolean tmg;
        private pcc vj;
        private boolean wh;
        private final HashMap<Class<? extends com.bytedance.pcc.pcc>, com.bytedance.pcc.sf<? extends com.bytedance.pcc.pcc>> pcc = new HashMap<>();
        private final HashSet<String> sf = new HashSet<>();
        private long vy = 3000;
        private int ork = 2;
        private boolean vh = false;

        public abstract boolean pcc();

        public vj(String str) {
            this.gm = str;
        }

        public oo sf() {
            return this.qf;
        }

        public final vj pcc(oo ooVar) {
            if (this.oo) {
                return this;
            }
            this.qf = ooVar;
            return this;
        }

        public final String gm() {
            return this.gm;
        }

        public final pcc oo() {
            return this.vj;
        }

        public final vj pcc(pcc pccVar) {
            if (this.oo) {
                return this;
            }
            this.vj = pccVar;
            return this;
        }

        public final vj pcc(Class<? extends com.bytedance.pcc.pcc> cls, com.bytedance.pcc.sf<? extends com.bytedance.pcc.pcc> sfVar) {
            if (!this.oo && cls != null && sfVar != null) {
                String oo = sfVar.oo();
                if (this.sf.contains(oo)) {
                    return this;
                }
                this.sf.add(oo);
                this.pcc.put(cls, sfVar);
            }
            return this;
        }

        public final HashMap<Class<? extends com.bytedance.pcc.pcc>, com.bytedance.pcc.sf<? extends com.bytedance.pcc.pcc>> vj() {
            return this.pcc;
        }

        public final boolean wh() {
            return this.wh;
        }

        public final vj pcc(boolean z) {
            if (this.oo) {
                return this;
            }
            this.wh = z;
            return this;
        }

        public final void sf(boolean z) {
            this.oo = z;
        }

        public final vj gm(boolean z) {
            if (this.oo) {
                return this;
            }
            this.kj = z;
            return this;
        }

        public long qf() {
            return this.vy;
        }

        public vj pcc(long j) {
            if (this.oo) {
                return this;
            }
            this.vy = j;
            return this;
        }

        public int kj() {
            return this.ork;
        }

        public vj pcc(int i) {
            if (this.oo) {
                return this;
            }
            this.ork = i;
            return this;
        }

        public boolean vy() {
            return this.vh;
        }

        public void oo(boolean z) {
            if (this.oo) {
                return;
            }
            this.vh = z;
        }

        public boolean ork() {
            return this.tmg;
        }

        public vj vj(boolean z) {
            if (this.oo) {
                return this;
            }
            this.tmg = z;
            return this;
        }
    }
}
