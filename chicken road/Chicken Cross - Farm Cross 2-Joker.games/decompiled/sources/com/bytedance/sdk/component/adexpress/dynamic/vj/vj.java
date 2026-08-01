package com.bytedance.sdk.component.adexpress.dynamic.vj;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.adexpress.dynamic.vj.sf;
import com.bytedance.sdk.component.adexpress.sf.hc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class vj {
    private com.bytedance.sdk.component.adexpress.dynamic.oo.kj gm;
    private pcc oo;
    public com.bytedance.sdk.component.adexpress.dynamic.oo.sf pcc;
    protected sf sf;

    static class pcc {
        float gm;
        float pcc;
        float sf;

        pcc() {
        }
    }

    public vj(double d, int i, double d2, String str, hc hcVar) {
        this.sf = new sf(d, i, d2, str, hcVar);
    }

    public void pcc(pcc pccVar) {
        this.oo = pccVar;
    }

    public void pcc() {
        this.sf.pcc();
    }

    public void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, float f, float f2) {
        if (kjVar != null) {
            this.gm = kjVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar2 = this.gm;
        float kj = kjVar2.kj();
        float vy = kjVar2.vy();
        float f3 = TextUtils.equals(kjVar2.ork().vj().tsz(), "fixed") ? vy : 65536.0f;
        this.sf.pcc();
        this.sf.gm(kjVar2, kj, f3);
        sf.gm pcc2 = this.sf.pcc(kjVar2);
        com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar = new com.bytedance.sdk.component.adexpress.dynamic.oo.sf();
        sfVar.pcc = f;
        sfVar.sf = f2;
        if (pcc2 != null) {
            kj = pcc2.pcc;
        }
        sfVar.gm = kj;
        if (pcc2 != null) {
            vy = pcc2.sf;
        }
        sfVar.oo = vy;
        sfVar.vj = "root";
        sfVar.vy = 1280.0f;
        sfVar.wh = kjVar2;
        sfVar.wh.gm(sfVar.pcc);
        sfVar.wh.oo(sfVar.sf);
        sfVar.wh.vj(sfVar.gm);
        sfVar.wh.wh(sfVar.oo);
        com.bytedance.sdk.component.adexpress.dynamic.oo.sf pcc3 = pcc(sfVar, 0.0f);
        this.pcc = pcc3;
        pcc(pcc3);
    }

    public void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar) {
        if (sfVar == null) {
            return;
        }
        sfVar.wh.ork().sf();
        float f = sfVar.gm;
        float f2 = sfVar.oo;
        float f3 = sfVar.pcc;
        float f4 = sfVar.sf;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.sf>> list = sfVar.qf;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.oo.sf> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.sf> it = list2.iterator();
                while (it.hasNext()) {
                    pcc(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.component.adexpress.dynamic.oo.sf pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar, float f) {
        float f2;
        float f3;
        int i;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> list;
        float f4;
        float f5;
        float f6;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it2;
        float f7;
        List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list2;
        float f8;
        com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar2;
        com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar;
        float f9;
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar;
        com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar2;
        float f10;
        com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar3;
        sf.gm pcc2;
        sf.gm pcc3;
        com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar3 = sfVar;
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar2 = sfVar3.wh;
        if (kjVar2 == null) {
            return sfVar3;
        }
        kjVar2.fum();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> nac = kjVar2.nac();
        if (nac == null || nac.size() <= 0) {
            return sfVar3;
        }
        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = kjVar2.ork().vj();
        float nac2 = vj.nac();
        float dax = vj.dax();
        float gbb = vj.gbb();
        float jr = vj.jr();
        float tmg = vj.tmg();
        String rj = vj.rj();
        String lrr = vj.lrr();
        float f11 = sfVar3.pcc + jr;
        float f12 = sfVar3.sf + nac2;
        float f13 = tmg * 2.0f;
        float f14 = ((sfVar3.gm - jr) - dax) - f13;
        float f15 = ((sfVar3.oo - nac2) - gbb) - f13;
        com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar4 = new com.bytedance.sdk.component.adexpress.dynamic.oo.vy(f11, f12);
        if (sfVar3.qf == null) {
            sfVar3.qf = new ArrayList();
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> it3 = nac.iterator();
        float f16 = 0.0f;
        while (it3.hasNext()) {
            sf.gm pcc4 = this.sf.pcc(it3.next());
            if (pcc4 != null) {
                f16 += pcc4.sf;
            }
        }
        String str = "space-between";
        String str2 = "space-around";
        if (f16 < f15) {
            if (TextUtils.equals(lrr, "center")) {
                f3 = (f15 - f16) / 2.0f;
            } else if (TextUtils.equals(lrr, "flex-end")) {
                f3 = f15 - f16;
            } else {
                if (TextUtils.equals(lrr, "space-around")) {
                    f3 = ork.pcc((f15 - f16) / (nac.size() + 1));
                    f2 = f3;
                    vyVar4.sf += f3;
                    float f17 = f;
                    i = 0;
                    while (i < nac.size()) {
                        List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list3 = nac.get(i);
                        i++;
                        if (i >= sfVar3.qf.size()) {
                            int size = (i - sfVar3.qf.size()) + 1;
                            list = nac;
                            int i2 = 0;
                            while (i2 < size) {
                                sfVar3.qf.add(new ArrayList());
                                i2++;
                                size = size;
                                f17 = f17;
                            }
                        } else {
                            list = nac;
                        }
                        float f18 = f17;
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it4 = list3.iterator();
                        float f19 = 0.0f;
                        while (true) {
                            f4 = f2;
                            if (!it4.hasNext()) {
                                break;
                            }
                            com.bytedance.sdk.component.adexpress.dynamic.oo.kj next = it4.next();
                            com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj2 = next.ork().vj();
                            String mk = vj2.mk();
                            Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it5 = it4;
                            int qcw = vj2.qcw();
                            if (!TextUtils.equals(mk, "flex") && qcw != 1 && qcw != 2 && (pcc3 = this.sf.pcc(next)) != null) {
                                f19 += pcc3.pcc;
                            }
                            f2 = f4;
                            it4 = it5;
                        }
                        float max = Math.max(f14 - f19, 0.0f);
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it6 = list3.iterator();
                        float f20 = 0.0f;
                        while (it6.hasNext()) {
                            com.bytedance.sdk.component.adexpress.dynamic.oo.kj next2 = it6.next();
                            com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj3 = next2.ork().vj();
                            Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it7 = it6;
                            if (vj3.qcw() != 1 && vj3.qcw() != 2 && (pcc2 = this.sf.pcc(next2)) != null) {
                                f20 += pcc2.pcc;
                            }
                            it6 = it7;
                        }
                        if (f20 < f14) {
                            if (TextUtils.equals(rj, "center")) {
                                f5 = (f14 - f20) / 2.0f;
                            } else if (TextUtils.equals(rj, "flex-end")) {
                                f5 = f14 - f20;
                            } else {
                                if (TextUtils.equals(rj, str2)) {
                                    f5 = ork.pcc((f14 - f20) / (list3.size() + 1));
                                    f6 = f5;
                                } else if (TextUtils.equals(rj, str) && list3.size() > 1) {
                                    f6 = ork.pcc((f14 - f20) / (list3.size() - 1.0f));
                                    f5 = 0.0f;
                                }
                                vyVar4.pcc += f5;
                                it = list3.iterator();
                                float f21 = 0.0f;
                                while (it.hasNext()) {
                                    com.bytedance.sdk.component.adexpress.dynamic.oo.kj next3 = it.next();
                                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it8 = it;
                                    float f22 = this.sf.pcc(next3) != null ? this.sf.pcc(next3).sf : 0.0f;
                                    com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj4 = next3.ork().vj();
                                    String str3 = str;
                                    f21 = Math.max(f21, (vj4.qcw() == 1 || vj4.qcw() == 2) ? 0.0f : f22);
                                    it = it8;
                                    str = str3;
                                }
                                String str4 = str;
                                it2 = list3.iterator();
                                f17 = f18;
                                while (it2.hasNext()) {
                                    com.bytedance.sdk.component.adexpress.dynamic.oo.kj next4 = it2.next();
                                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it9 = it2;
                                    sf.gm pcc5 = this.sf.pcc(next4);
                                    String str5 = rj;
                                    com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj5 = next4.ork().vj();
                                    float f23 = f17;
                                    float ri = vj5.ri();
                                    float f24 = f14;
                                    float zsj = vj5.zsj();
                                    String str6 = str2;
                                    float hpk = vj5.hpk();
                                    float f25 = f6;
                                    float fmh = vj5.fmh();
                                    com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar5 = vyVar4;
                                    float f26 = pcc5 == null ? 0.0f : pcc5.pcc;
                                    if (pcc5 == null) {
                                        list2 = list3;
                                        f7 = 0.0f;
                                    } else {
                                        f7 = pcc5.sf;
                                        list2 = list3;
                                    }
                                    com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar3 = kjVar2;
                                    float f27 = TextUtils.equals(kjVar2.gm(), "root") ? i : f23;
                                    int i3 = i;
                                    if (vj5.qcw() == 1) {
                                        f8 = f27;
                                        sfVar2 = sfVar;
                                        vyVar = pcc(sfVar2, vj5, (f26 - zsj) - fmh, (f7 - ri) - hpk);
                                    } else {
                                        f8 = f27;
                                        sfVar2 = sfVar;
                                        vyVar = vyVar5;
                                    }
                                    com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar6 = vyVar;
                                    if (vj5.qcw() == 2) {
                                        f9 = max;
                                        kjVar = next4;
                                        vyVar2 = pcc(vj5, this.sf.pcc(this.gm), new sf.gm((f26 - zsj) - fmh, (f7 - ri) - hpk));
                                    } else {
                                        f9 = max;
                                        kjVar = next4;
                                        vyVar2 = vyVar6;
                                    }
                                    String bbd = vj.bbd();
                                    if (f21 > f7 && !TextUtils.equals(bbd, "flex-start")) {
                                        bbd.hashCode();
                                        if (bbd.equals("center")) {
                                            f10 = (f21 - f7) / 2.0f;
                                        } else if (bbd.equals("flex-end")) {
                                            f10 = f21 - f7;
                                        }
                                        com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar4 = new com.bytedance.sdk.component.adexpress.dynamic.oo.sf();
                                        sfVar4.pcc = vyVar2.pcc + fmh;
                                        sfVar4.sf = vyVar2.sf + ri + f10;
                                        sfVar4.gm = (f26 - zsj) - fmh;
                                        sfVar4.oo = (f7 - ri) - hpk;
                                        sfVar4.vj = sfVar2.vj + "." + kjVar.gm();
                                        sfVar4.kj = sfVar2;
                                        sfVar4.wh = kjVar;
                                        max = f9;
                                        sfVar4.vy = max;
                                        list3 = list2;
                                        sfVar4.ork = list3;
                                        sfVar4.wh.gm(sfVar4.pcc);
                                        sfVar4.wh.oo(sfVar4.sf);
                                        sfVar4.wh.vj(sfVar4.gm);
                                        sfVar4.wh.wh(sfVar4.oo);
                                        float f28 = f8;
                                        com.bytedance.sdk.component.adexpress.dynamic.oo.sf pcc6 = pcc(sfVar4, f28);
                                        i = i3;
                                        sfVar2.qf.get(i).add(pcc6);
                                        if (vj5.qcw() != 1) {
                                            vyVar3 = vyVar5;
                                        } else if (vj5.qcw() != 2) {
                                            vyVar3 = vyVar5;
                                            vyVar3.pcc += f26 + f25;
                                        } else {
                                            vyVar3 = vyVar5;
                                        }
                                        f17 = f28;
                                        vyVar4 = vyVar3;
                                        it2 = it9;
                                        rj = str5;
                                        f14 = f24;
                                        str2 = str6;
                                        f6 = f25;
                                        kjVar2 = kjVar3;
                                    }
                                    f10 = 0.0f;
                                    com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar42 = new com.bytedance.sdk.component.adexpress.dynamic.oo.sf();
                                    sfVar42.pcc = vyVar2.pcc + fmh;
                                    sfVar42.sf = vyVar2.sf + ri + f10;
                                    sfVar42.gm = (f26 - zsj) - fmh;
                                    sfVar42.oo = (f7 - ri) - hpk;
                                    sfVar42.vj = sfVar2.vj + "." + kjVar.gm();
                                    sfVar42.kj = sfVar2;
                                    sfVar42.wh = kjVar;
                                    max = f9;
                                    sfVar42.vy = max;
                                    list3 = list2;
                                    sfVar42.ork = list3;
                                    sfVar42.wh.gm(sfVar42.pcc);
                                    sfVar42.wh.oo(sfVar42.sf);
                                    sfVar42.wh.vj(sfVar42.gm);
                                    sfVar42.wh.wh(sfVar42.oo);
                                    float f282 = f8;
                                    com.bytedance.sdk.component.adexpress.dynamic.oo.sf pcc62 = pcc(sfVar42, f282);
                                    i = i3;
                                    sfVar2.qf.get(i).add(pcc62);
                                    if (vj5.qcw() != 1) {
                                    }
                                    f17 = f282;
                                    vyVar4 = vyVar3;
                                    it2 = it9;
                                    rj = str5;
                                    f14 = f24;
                                    str2 = str6;
                                    f6 = f25;
                                    kjVar2 = kjVar3;
                                }
                                com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar7 = vyVar4;
                                vyVar7.pcc = f11;
                                vyVar7.sf += f21 + f4;
                                sfVar3 = sfVar;
                                nac = list;
                                f2 = f4;
                                str = str4;
                                kjVar2 = kjVar2;
                            }
                            f6 = 0.0f;
                            vyVar4.pcc += f5;
                            it = list3.iterator();
                            float f212 = 0.0f;
                            while (it.hasNext()) {
                            }
                            String str42 = str;
                            it2 = list3.iterator();
                            f17 = f18;
                            while (it2.hasNext()) {
                            }
                            com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar72 = vyVar4;
                            vyVar72.pcc = f11;
                            vyVar72.sf += f212 + f4;
                            sfVar3 = sfVar;
                            nac = list;
                            f2 = f4;
                            str = str42;
                            kjVar2 = kjVar2;
                        }
                        f5 = 0.0f;
                        f6 = 0.0f;
                        vyVar4.pcc += f5;
                        it = list3.iterator();
                        float f2122 = 0.0f;
                        while (it.hasNext()) {
                        }
                        String str422 = str;
                        it2 = list3.iterator();
                        f17 = f18;
                        while (it2.hasNext()) {
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar722 = vyVar4;
                        vyVar722.pcc = f11;
                        vyVar722.sf += f2122 + f4;
                        sfVar3 = sfVar;
                        nac = list;
                        f2 = f4;
                        str = str422;
                        kjVar2 = kjVar2;
                    }
                    return sfVar3;
                }
                if (TextUtils.equals(lrr, "space-between") && nac.size() > 1) {
                    f2 = ork.pcc((f15 - f16) / (nac.size() - 1));
                    f3 = 0.0f;
                    vyVar4.sf += f3;
                    float f172 = f;
                    i = 0;
                    while (i < nac.size()) {
                    }
                    return sfVar3;
                }
            }
            f2 = 0.0f;
            vyVar4.sf += f3;
            float f1722 = f;
            i = 0;
            while (i < nac.size()) {
            }
            return sfVar3;
        }
        f2 = 0.0f;
        f3 = 0.0f;
        vyVar4.sf += f3;
        float f17222 = f;
        i = 0;
        while (i < nac.size()) {
        }
        return sfVar3;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.oo.vy pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.wh whVar, sf.gm gmVar, sf.gm gmVar2) {
        float ra = whVar.ra();
        float qc = whVar.qc();
        float rt = whVar.rt();
        float wax = whVar.wax();
        boolean bg = whVar.bg();
        boolean kz = whVar.kz();
        boolean ew = whVar.ew();
        boolean tmh = whVar.tmh();
        if (!bg) {
            if (kz) {
                ra = ((this.oo.pcc != 0.0f ? Math.min(this.oo.pcc, gmVar.pcc) : gmVar.pcc) - rt) - gmVar2.pcc;
            } else {
                ra = 0.0f;
            }
        }
        if (!ew) {
            if (tmh) {
                qc = ((this.oo.sf != 0.0f ? this.oo.sf : gmVar.sf) - wax) - gmVar2.sf;
            } else {
                qc = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.oo.vy(ra, qc);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.oo.vy pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar, com.bytedance.sdk.component.adexpress.dynamic.oo.wh whVar, float f, float f2) {
        float f3;
        float f4;
        float f5 = sfVar.pcc;
        float f6 = sfVar.sf;
        float ra = whVar.ra();
        float qc = whVar.qc();
        float rt = whVar.rt();
        float wax = whVar.wax();
        boolean bg = whVar.bg();
        boolean kz = whVar.kz();
        boolean ew = whVar.ew();
        boolean tmh = whVar.tmh();
        String vr = whVar.vr();
        float f7 = sfVar.gm;
        float f8 = sfVar.oo;
        if (TextUtils.equals(vr, "0")) {
            if (bg) {
                f5 = sfVar.pcc + ra;
            } else if (kz) {
                f5 = ((sfVar.pcc + f7) - rt) - f;
            }
            if (ew) {
                f4 = sfVar.sf;
                f6 = f4 + qc;
            } else if (tmh) {
                f3 = sfVar.sf;
                f6 = ((f3 + f8) - wax) - f2;
            }
        } else if (TextUtils.equals(vr, "1")) {
            f5 = sfVar.pcc + ((f7 - f) / 2.0f);
            if (ew) {
                f4 = sfVar.sf;
                f6 = f4 + qc;
            } else if (tmh) {
                f3 = sfVar.sf;
                f6 = ((f3 + f8) - wax) - f2;
            }
        } else if (TextUtils.equals(vr, "2")) {
            f6 = sfVar.sf + ((f8 - f2) / 2.0f);
            if (bg) {
                f5 = sfVar.pcc + ra;
            } else if (kz) {
                f5 = ((sfVar.pcc + f7) - rt) - f;
            }
        } else if (TextUtils.equals(vr, ExifInterface.GPS_MEASUREMENT_3D)) {
            f5 = sfVar.pcc + ((f7 - f) / 2.0f);
            f6 = sfVar.sf + ((f8 - f2) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.oo.vy(f5, f6);
    }
}
