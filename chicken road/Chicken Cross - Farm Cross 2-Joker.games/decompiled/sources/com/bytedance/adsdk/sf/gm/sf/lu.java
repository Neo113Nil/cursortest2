package com.bytedance.adsdk.sf.gm.sf;

import android.graphics.Paint;
import com.bytedance.adsdk.sf.pcc.pcc.lo;
import java.util.List;

/* loaded from: classes4.dex */
public class lu implements gm {
    private final List<com.bytedance.adsdk.sf.gm.pcc.sf> gm;
    private final sf kj;
    private final com.bytedance.adsdk.sf.gm.pcc.pcc oo;
    private final boolean ork;
    private final String pcc;
    private final pcc qf;
    private final com.bytedance.adsdk.sf.gm.pcc.sf sf;
    private final com.bytedance.adsdk.sf.gm.pcc.oo vj;
    private final float vy;
    private final com.bytedance.adsdk.sf.gm.pcc.sf wh;

    public enum pcc {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap pcc() {
            int i = AnonymousClass1.pcc[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i == 2) {
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.SQUARE;
        }
    }

    /* renamed from: com.bytedance.adsdk.sf.gm.sf.lu$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;
        static final /* synthetic */ int[] sf;

        static {
            int[] iArr = new int[sf.values().length];
            sf = iArr;
            try {
                iArr[sf.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                sf[sf.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                sf[sf.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[pcc.values().length];
            pcc = iArr2;
            try {
                iArr2[pcc.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pcc[pcc.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pcc[pcc.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum sf {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join pcc() {
            int i = AnonymousClass1.sf[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public lu(String str, com.bytedance.adsdk.sf.gm.pcc.sf sfVar, List<com.bytedance.adsdk.sf.gm.pcc.sf> list, com.bytedance.adsdk.sf.gm.pcc.pcc pccVar, com.bytedance.adsdk.sf.gm.pcc.oo ooVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar2, pcc pccVar2, sf sfVar3, float f, boolean z) {
        this.pcc = str;
        this.sf = sfVar;
        this.gm = list;
        this.oo = pccVar;
        this.vj = ooVar;
        this.wh = sfVar2;
        this.qf = pccVar2;
        this.kj = sfVar3;
        this.vy = f;
        this.ork = z;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new lo(vyVar, pccVar, this);
    }

    public String pcc() {
        return this.pcc;
    }

    public com.bytedance.adsdk.sf.gm.pcc.pcc sf() {
        return this.oo;
    }

    public com.bytedance.adsdk.sf.gm.pcc.oo gm() {
        return this.vj;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf oo() {
        return this.wh;
    }

    public List<com.bytedance.adsdk.sf.gm.pcc.sf> vj() {
        return this.gm;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf wh() {
        return this.sf;
    }

    public pcc qf() {
        return this.qf;
    }

    public sf kj() {
        return this.kj;
    }

    public float vy() {
        return this.vy;
    }

    public boolean ork() {
        return this.ork;
    }
}
