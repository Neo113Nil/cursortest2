package com.bytedance.sdk.component.qf;

import android.os.Bundle;
import com.bytedance.sdk.component.qf.gm.oo;
import com.bytedance.sdk.component.sf.pcc.kj;
import com.bytedance.sdk.component.sf.pcc.pcc.pcc.vj;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.openadsdk.lu.oo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class pcc {
    private static vj pcc;
    private static gm sf;
    private vh gm;

    public interface gm {
        void pcc(String str, String str2, String str3, int i, String str4, boolean z, int i2, int i3);

        boolean pcc();

        boolean sf();
    }

    public interface sf {
        void gm(oo ooVar);

        void pcc(oo ooVar);

        void sf(oo ooVar);
    }

    private pcc(C0126pcc c0126pcc) {
        vh.pcc sf2 = new vh.pcc().pcc(c0126pcc.pcc, TimeUnit.MILLISECONDS).gm(c0126pcc.gm, TimeUnit.MILLISECONDS).sf(c0126pcc.sf, TimeUnit.MILLISECONDS);
        if (c0126pcc.vj != null && c0126pcc.vj.size() > 0) {
            Iterator<kj> it = c0126pcc.vj.iterator();
            while (it.hasNext()) {
                sf2.pcc(it.next());
            }
        }
        if (c0126pcc.qf != null) {
            Bundle unused = c0126pcc.qf;
        }
        Set unused2 = c0126pcc.wh;
        sf2.pcc(c0126pcc.oo);
        this.gm = sf2.pcc();
    }

    public static void pcc() {
        com.bytedance.sdk.component.qf.gm.oo.pcc(oo.pcc.DEBUG);
    }

    public com.bytedance.sdk.component.qf.sf.oo sf() {
        return new com.bytedance.sdk.component.qf.sf.oo(this.gm);
    }

    public com.bytedance.sdk.component.qf.sf.sf gm() {
        return new com.bytedance.sdk.component.qf.sf.sf(this.gm);
    }

    public com.bytedance.sdk.component.qf.sf.pcc oo() {
        return new com.bytedance.sdk.component.qf.sf.pcc(this.gm);
    }

    public static boolean vj() {
        vj vjVar = pcc;
        if (vjVar == null) {
            return false;
        }
        return vjVar.pcc();
    }

    public static void pcc(vj vjVar) {
        pcc = vjVar;
    }

    public static boolean wh() {
        gm gmVar = sf;
        if (gmVar == null) {
            return false;
        }
        return gmVar.pcc();
    }

    public static void pcc(String str, String str2, String str3, int i, String str4, boolean z, int i2, int i3) {
        gm gmVar = sf;
        if (gmVar == null) {
            return;
        }
        gmVar.pcc(str, str2, str3, i, str4, z, i2, i3);
    }

    public static boolean qf() {
        gm gmVar = sf;
        if (gmVar == null) {
            return false;
        }
        return gmVar.sf();
    }

    public static void pcc(gm gmVar) {
        sf = gmVar;
    }

    public vh kj() {
        return this.gm;
    }

    /* renamed from: com.bytedance.sdk.component.qf.pcc$pcc, reason: collision with other inner class name */
    public static final class C0126pcc {
        sf oo;
        private Bundle qf;
        private Set<String> wh;
        final List<kj> vj = new ArrayList();
        int pcc = 10000;
        int sf = 10000;
        int gm = 10000;

        public C0126pcc pcc(boolean z) {
            return this;
        }

        public C0126pcc pcc(long j, TimeUnit timeUnit) {
            this.pcc = pcc("timeout", j, timeUnit);
            return this;
        }

        public C0126pcc sf(long j, TimeUnit timeUnit) {
            this.sf = pcc("timeout", j, timeUnit);
            return this;
        }

        public C0126pcc gm(long j, TimeUnit timeUnit) {
            this.gm = pcc("timeout", j, timeUnit);
            return this;
        }

        public C0126pcc pcc(kj kjVar) {
            this.vj.add(kjVar);
            return this;
        }

        public C0126pcc pcc(sf sfVar) {
            this.oo = sfVar;
            return this;
        }

        private static int pcc(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }

        public pcc pcc() {
            return new pcc(this);
        }
    }
}
