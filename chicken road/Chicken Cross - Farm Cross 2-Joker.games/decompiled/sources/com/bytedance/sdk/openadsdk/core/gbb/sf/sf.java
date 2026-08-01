package com.bytedance.sdk.openadsdk.core.gbb.sf;

import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;

/* loaded from: classes4.dex */
public class sf extends gm implements Comparable<sf> {
    private final float pcc;

    private sf(float f, String str, gm.EnumC0148gm enumC0148gm, Boolean bool) {
        super(str, enumC0148gm, bool);
        this.pcc = f;
    }

    public boolean pcc(float f) {
        return this.pcc <= f && !oo();
    }

    @Override // java.lang.Comparable
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public int compareTo(sf sfVar) {
        if (sfVar == null) {
            return 1;
        }
        float f = this.pcc;
        float f2 = sfVar.pcc;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbb.sf.gm
    public void l_() {
        super.l_();
    }

    public static class pcc {
        private gm.EnumC0148gm gm = gm.EnumC0148gm.TRACKING_URL;
        private boolean oo = false;
        private final String pcc;
        private final float sf;

        public pcc(String str, float f) {
            this.pcc = str;
            this.sf = f;
        }

        public sf pcc() {
            return new sf(this.sf, this.pcc, this.gm, Boolean.valueOf(this.oo));
        }
    }

    public String toString() {
        return super.toString();
    }
}
