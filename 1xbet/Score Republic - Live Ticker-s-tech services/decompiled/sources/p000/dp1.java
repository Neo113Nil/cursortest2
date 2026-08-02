package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dp1 implements Iterable, ht1, zs1 {

    /* JADX INFO: renamed from: j */
    public final TreeMap f1757j;

    /* JADX INFO: renamed from: k */
    public final TreeMap f1758k;

    public dp1(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m1284u(i, (ht1) list.get(i));
            }
        }
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: b */
    public final Iterator mo750b() {
        return new co1(this, this.f1757j.keySet().iterator(), this.f1758k.keySet().iterator());
    }

    @Override // p000.zs1
    /* JADX INFO: renamed from: c */
    public final void mo751c(String str, ht1 ht1Var) {
        TreeMap treeMap = this.f1758k;
        if (ht1Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, ht1Var);
        }
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: e */
    public final Boolean mo752e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dp1)) {
            return false;
        }
        dp1 dp1Var = (dp1) obj;
        if (m1282s() != dp1Var.m1282s()) {
            return false;
        }
        TreeMap treeMap = this.f1757j;
        if (treeMap.isEmpty()) {
            return dp1Var.f1757j.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!m1283t(iIntValue).equals(dp1Var.m1283t(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: f */
    public final String mo753f() {
        return m1287x(",");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0204  */
    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0213  */
    /* JADX WARN: Code duplicated, block: B:106:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x023d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0248  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:113:0x026d  */
    /* JADX WARN: Code duplicated, block: B:117:0x027c A[LOOP:2: B:115:0x0277->B:117:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x028b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:0x029d  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:145:0x0301  */
    /* JADX WARN: Code duplicated, block: B:147:0x0314  */
    /* JADX WARN: Code duplicated, block: B:148:0x0318  */
    /* JADX WARN: Code duplicated, block: B:149:0x031e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0334 A[LOOP:3: B:151:0x0332->B:152:0x0334, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x0344  */
    /* JADX WARN: Code duplicated, block: B:156:0x034a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0361  */
    /* JADX WARN: Code duplicated, block: B:161:0x0368  */
    /* JADX WARN: Code duplicated, block: B:164:0x0374  */
    /* JADX WARN: Code duplicated, block: B:172:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:173:0x03be  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:177:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:179:0x03d1 A[LOOP:5: B:178:0x03cf->B:179:0x03d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:184:0x0400  */
    /* JADX WARN: Code duplicated, block: B:186:0x040a  */
    /* JADX WARN: Code duplicated, block: B:188:0x040d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0413  */
    /* JADX WARN: Code duplicated, block: B:196:0x0430  */
    /* JADX WARN: Code duplicated, block: B:197:0x0433  */
    /* JADX WARN: Code duplicated, block: B:200:0x043f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0447  */
    /* JADX WARN: Code duplicated, block: B:205:0x0453  */
    /* JADX WARN: Code duplicated, block: B:207:0x045d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0465  */
    /* JADX WARN: Code duplicated, block: B:211:0x047c  */
    /* JADX WARN: Code duplicated, block: B:213:0x0482  */
    /* JADX WARN: Code duplicated, block: B:215:0x0488  */
    /* JADX WARN: Code duplicated, block: B:217:0x0490  */
    /* JADX WARN: Code duplicated, block: B:219:0x0495  */
    /* JADX WARN: Code duplicated, block: B:221:0x049d  */
    /* JADX WARN: Code duplicated, block: B:223:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:225:0x04af  */
    /* JADX WARN: Code duplicated, block: B:227:0x04c3 A[LOOP:6: B:224:0x04ad->B:227:0x04c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:232:0x04e0 A[LOOP:7: B:230:0x04da->B:232:0x04e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:236:0x0504 A[LOOP:8: B:234:0x04fe->B:236:0x0504, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x0529  */
    /* JADX WARN: Code duplicated, block: B:241:0x0531  */
    /* JADX WARN: Code duplicated, block: B:243:0x053b  */
    /* JADX WARN: Code duplicated, block: B:246:0x0559  */
    /* JADX WARN: Code duplicated, block: B:248:0x0575  */
    /* JADX WARN: Code duplicated, block: B:249:0x057d  */
    /* JADX WARN: Code duplicated, block: B:252:0x058d  */
    /* JADX WARN: Code duplicated, block: B:253:0x0594  */
    /* JADX WARN: Code duplicated, block: B:256:0x0599  */
    /* JADX WARN: Code duplicated, block: B:258:0x059f  */
    /* JADX WARN: Code duplicated, block: B:260:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:269:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:271:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:273:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:276:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:278:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:280:0x0601  */
    /* JADX WARN: Code duplicated, block: B:282:0x0609  */
    /* JADX WARN: Code duplicated, block: B:284:0x060f  */
    /* JADX WARN: Code duplicated, block: B:286:0x0615  */
    /* JADX WARN: Code duplicated, block: B:288:0x0637  */
    /* JADX WARN: Code duplicated, block: B:289:0x0642  */
    /* JADX WARN: Code duplicated, block: B:291:0x0648  */
    /* JADX WARN: Code duplicated, block: B:294:0x065c  */
    /* JADX WARN: Code duplicated, block: B:296:0x067a  */
    /* JADX WARN: Code duplicated, block: B:299:0x0683 A[LOOP:10: B:297:0x067b->B:299:0x0683, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x069b A[LOOP:11: B:302:0x069b->B:318:0x06ed, LOOP_START, PHI: r9 r35
      0x069b: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:301:0x0699, B:318:0x06ed] A[DONT_GENERATE, DONT_INLINE]
      0x069b: PHI (r35v1 java.util.TreeMap) = (r35v0 java.util.TreeMap), (r35v4 java.util.TreeMap) binds: [B:301:0x0699, B:318:0x06ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:304:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:306:0x06af  */
    /* JADX WARN: Code duplicated, block: B:308:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:310:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:311:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:313:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:315:0x06db  */
    /* JADX WARN: Code duplicated, block: B:323:0x0713 A[LOOP:13: B:323:0x0713->B:325:0x0716, LOOP_START, PHI: r0
      0x0713: PHI (r0v33 int) = (r0v32 int), (r0v34 int) binds: [B:293:0x065a, B:325:0x0716] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:325:0x0716 A[LOOP:13: B:323:0x0713->B:325:0x0716, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:327:0x0728  */
    /* JADX WARN: Code duplicated, block: B:329:0x0730  */
    /* JADX WARN: Code duplicated, block: B:331:0x0736  */
    /* JADX WARN: Code duplicated, block: B:333:0x0741  */
    /* JADX WARN: Code duplicated, block: B:335:0x0757  */
    /* JADX WARN: Code duplicated, block: B:337:0x075d  */
    /* JADX WARN: Code duplicated, block: B:339:0x0763  */
    /* JADX WARN: Code duplicated, block: B:342:0x0781 A[LOOP:14: B:340:0x077b->B:342:0x0781, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:344:0x0798  */
    /* JADX WARN: Code duplicated, block: B:345:0x079d  */
    /* JADX WARN: Code duplicated, block: B:347:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:349:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:351:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:353:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:358:0x07e0 A[LOOP:16: B:356:0x07da->B:358:0x07e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:362:0x0803  */
    /* JADX WARN: Code duplicated, block: B:364:0x080b  */
    /* JADX WARN: Code duplicated, block: B:366:0x081b  */
    /* JADX WARN: Code duplicated, block: B:375:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x04cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x070c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x06f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x06e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x07fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x07f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:72:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
    
        if (p000.d71.m1119w(r7, r2, (p000.ft1) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m1282s() != r7.m1282s()) goto L170;
     */
    @Override // p000.ht1
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ht1 mo754g(String str, f71 f71Var, ArrayList arrayList) {
        String str2;
        Object obj;
        String str3;
        Object obj2;
        Double dValueOf;
        int iHashCode;
        ht1 ht1VarM96t;
        TreeMap treeMap;
        double dM1282s;
        String str4;
        dp1 dp1Var;
        int size;
        int i;
        ht1 ht1VarM96t2;
        int iM1282s;
        dp1 dp1Var2;
        Iterator itM1281r;
        String str5;
        ht1 ht1VarM96t3;
        dp1 dp1Var3;
        dp1 dp1Var4;
        Iterator itM1281r2;
        a81 a81Var;
        int iM5374E;
        int iM1282s2;
        dp1 dp1Var5;
        int iMax;
        int i2;
        ht1 ht1VarM96t4;
        int i3;
        int iIntValue;
        TreeMap treeMap2;
        Integer numValueOf;
        TreeMap treeMap3;
        ht1 ht1Var;
        int i4;
        String str6;
        ht1 ht1VarM96t5;
        int iM1282s3;
        double dM5374E;
        int iMin;
        ht1 ht1VarM96t6;
        dp1 dp1Var6;
        int size2;
        int i5;
        int iM1282s4;
        Iterator itM1281r3;
        Iterator itM1281r4;
        ht1 ht1VarM96t7;
        ht1 ht1VarM96t8;
        int iM1282s5;
        String strMo753f;
        ht1 ht1VarM96t9;
        int size3;
        int i6;
        ht1 ht1VarM96t10;
        Iterator itM1281r5;
        int iIntValue2;
        bs1 bs1Var;
        ArrayList arrayList2;
        int size4;
        int i7;
        int i8;
        ht1 ht1VarM96t11;
        ht1 ht1VarM96t12;
        double dM1282s2;
        double dM5374E2;
        double dMin;
        dp1 dp1Var7;
        int i9;
        double dM5374E3;
        int iM1282s6;
        int i10;
        int i11;
        Iterator itM1281r6;
        double d;
        double dM5374E4;
        String str7 = "toString";
        String str8 = "forEach";
        String str9 = "splice";
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str)) {
            str2 = "filter";
            str3 = "sort";
            if (str3.equals(str)) {
                obj2 = "reduce";
            } else {
                obj2 = "reduce";
                if (str9.equals(str)) {
                    str9 = str9;
                } else if (str7.equals(str)) {
                    str9 = str9;
                    str7 = str7;
                } else {
                    if (!"unshift".equals(str)) {
                        str9 = str9;
                        str7 = str7;
                        return zs1.m6030d(this, new lt1(str), f71Var, arrayList);
                    }
                    str9 = str9;
                    str7 = str7;
                    obj = "unshift";
                }
            }
            obj = "unshift";
            f71Var = f71Var;
            str8 = "forEach";
            this = this;
            dValueOf = Double.valueOf(-1.0d);
            iHashCode = str.hashCode();
            TreeMap treeMap4 = this.f1757j;
            ht1VarM96t = ht1.f3330b;
            treeMap = treeMap4;
            dM1282s = 0.0d;
            switch (iHashCode) {
                case -1776922004:
                    str4 = str7;
                    if (str.equals(str4)) {
                        wo1.m5396w(str4, 0, arrayList);
                        return new lt1(this.m1287x(","));
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case -1354795244:
                    if (str.equals("concat")) {
                        dp1Var = (dp1) this.mo758p();
                        if (!arrayList.isEmpty()) {
                            size = arrayList.size();
                            i = 0;
                            while (i < size) {
                                Object obj3 = arrayList.get(i);
                                i++;
                                ht1VarM96t2 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) obj3);
                                if (!(ht1VarM96t2 instanceof nq1)) {
                                    C0270h1.m2191g("Failed evaluation of arguments");
                                    return null;
                                }
                                iM1282s = dp1Var.m1282s();
                                if (ht1VarM96t2 instanceof dp1) {
                                    dp1Var2 = (dp1) ht1VarM96t2;
                                    itM1281r = dp1Var2.m1281r();
                                    while (itM1281r.hasNext()) {
                                        Integer num = (Integer) itM1281r.next();
                                        dp1Var.m1284u(num.intValue() + iM1282s, dp1Var2.m1283t(num.intValue()));
                                    }
                                } else {
                                    dp1Var.m1284u(iM1282s, ht1VarM96t2);
                                }
                            }
                        }
                        return dp1Var;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case -1274492040:
                    str5 = str2;
                    if (str.equals(str5)) {
                        wo1.m5396w(str5, 1, arrayList);
                        ht1VarM96t3 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                        if (ht1VarM96t3 instanceof ft1) {
                            C0270h1.m2190f("Callback should be a method");
                            return null;
                        }
                        if (treeMap.size() == 0) {
                            return new dp1();
                        }
                        dp1Var3 = (dp1) this.mo758p();
                        dp1 dp1VarM1119w = d71.m1119w(this, f71Var, (ft1) ht1VarM96t3, null, Boolean.TRUE);
                        dp1Var4 = new dp1();
                        itM1281r2 = dp1VarM1119w.m1281r();
                        while (itM1281r2.hasNext()) {
                            dp1Var4.m1284u(dp1Var4.m1282s(), dp1Var3.m1283t(((Integer) itM1281r2.next()).intValue()));
                        }
                        return dp1Var4;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case -934873754:
                    if (str.equals(obj2)) {
                        return d71.m1118t(this, f71Var, arrayList, true);
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case -895859076:
                    if (str.equals(str9)) {
                        if (arrayList.isEmpty()) {
                            return new dp1();
                        }
                        ht1 ht1Var2 = (ht1) arrayList.get(0);
                        a81 a81Var2 = (a81) f71Var.f2335l;
                        a81Var = (a81) f71Var.f2335l;
                        iM5374E = (int) wo1.m5374E(a81Var2.m96t(f71Var, ht1Var2).mo755h().doubleValue());
                        if (iM5374E < 0) {
                            iM5374E = Math.max(0, this.m1282s() + iM5374E);
                        } else if (iM5374E > this.m1282s()) {
                            iM5374E = this.m1282s();
                        }
                        iM1282s2 = this.m1282s();
                        dp1Var5 = new dp1();
                        if (arrayList.size() > 1) {
                            iMax = Math.max(0, (int) wo1.m5374E(a81Var.m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue()));
                            if (iMax > 0) {
                                for (i4 = iM5374E; i4 < Math.min(iM1282s2, iM5374E + iMax); i4++) {
                                    dp1Var5.m1284u(dp1Var5.m1282s(), this.m1283t(iM5374E));
                                    this.m1286w(iM5374E);
                                }
                            }
                            i2 = 2;
                            if (arrayList.size() > 2) {
                                while (i2 < arrayList.size()) {
                                    ht1VarM96t4 = a81Var.m96t(f71Var, (ht1) arrayList.get(i2));
                                    if (!(ht1VarM96t4 instanceof nq1)) {
                                        C0270h1.m2190f("Failed to parse elements to add");
                                        return null;
                                    }
                                    i3 = (iM5374E + i2) - 2;
                                    if (i3 >= 0) {
                                        C0270h1.m2190f(j11.m2774i(new StringBuilder(String.valueOf(i3).length() + 21), "Invalid value index: ", i3));
                                        return null;
                                    }
                                    if (i3 >= this.m1282s()) {
                                        this.m1284u(i3, ht1VarM96t4);
                                        treeMap2 = treeMap;
                                    } else {
                                        iIntValue = ((Integer) treeMap.lastKey()).intValue();
                                        while (iIntValue >= i3) {
                                            numValueOf = Integer.valueOf(iIntValue);
                                            treeMap3 = treeMap;
                                            ht1Var = (ht1) treeMap3.get(numValueOf);
                                            if (ht1Var != null) {
                                                this.m1284u(iIntValue + 1, ht1Var);
                                                treeMap3.remove(numValueOf);
                                            }
                                            iIntValue--;
                                            treeMap = treeMap3;
                                        }
                                        treeMap2 = treeMap;
                                        this.m1284u(i3, ht1VarM96t4);
                                    }
                                    i2++;
                                    treeMap = treeMap2;
                                }
                            }
                        } else {
                            while (iM5374E < iM1282s2) {
                                dp1Var5.m1284u(dp1Var5.m1282s(), this.m1283t(iM5374E));
                                this.m1284u(iM5374E, null);
                                iM5374E++;
                            }
                        }
                        return dp1Var5;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case -678635926:
                    str6 = str8;
                    if (str.equals(str6)) {
                        wo1.m5396w(str6, 1, arrayList);
                        ht1VarM96t5 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                        if (ht1VarM96t5 instanceof ft1) {
                            C0270h1.m2190f("Callback should be a method");
                            return null;
                        }
                        if (treeMap.size() != 0) {
                            d71.m1119w(this, f71Var, (ft1) ht1VarM96t5, null, null);
                            return ht1VarM96t;
                        }
                        return ht1VarM96t;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        wo1.m5399z("lastIndexOf", 2, arrayList);
                        if (!arrayList.isEmpty()) {
                            ht1VarM96t = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                        }
                        ht1 ht1Var3 = ht1VarM96t;
                        iM1282s3 = this.m1282s() - 1;
                        if (arrayList.size() > 1) {
                            ht1VarM96t6 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                            if (Double.isNaN(ht1VarM96t6.mo755h().doubleValue())) {
                                dM5374E = this.m1282s() - 1;
                            } else {
                                dM5374E = wo1.m5374E(ht1VarM96t6.mo755h().doubleValue());
                            }
                            if (dM5374E < 0.0d) {
                                dM5374E += (double) this.m1282s();
                            }
                        } else {
                            dM5374E = iM1282s3;
                        }
                        if (dM5374E < 0.0d) {
                            return new gr1(dValueOf);
                        }
                        for (iMin = (int) Math.min(this.m1282s(), dM5374E); iMin >= 0; iMin--) {
                            if (!this.m1285v(iMin) && wo1.m5372C(this.m1283t(iMin), ht1Var3)) {
                                return new gr1(Double.valueOf(iMin));
                            }
                        }
                        return new gr1(dValueOf);
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList.isEmpty()) {
                            dp1Var6 = new dp1();
                            size2 = arrayList.size();
                            i5 = 0;
                            while (i5 < size2) {
                                Object obj4 = arrayList.get(i5);
                                i5++;
                                ht1VarM96t7 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) obj4);
                                if (!(ht1VarM96t7 instanceof nq1)) {
                                    C0270h1.m2191g("Argument evaluation failed");
                                    return null;
                                }
                                dp1Var6.m1284u(dp1Var6.m1282s(), ht1VarM96t7);
                            }
                            iM1282s4 = dp1Var6.m1282s();
                            itM1281r3 = this.m1281r();
                            while (itM1281r3.hasNext()) {
                                Integer num2 = (Integer) itM1281r3.next();
                                dp1Var6.m1284u(num2.intValue() + iM1282s4, this.m1283t(num2.intValue()));
                            }
                            treeMap.clear();
                            itM1281r4 = dp1Var6.m1281r();
                            while (itM1281r4.hasNext()) {
                                Integer num3 = (Integer) itM1281r4.next();
                                this.m1284u(num3.intValue(), dp1Var6.m1283t(num3.intValue()));
                            }
                        }
                        return new gr1(Double.valueOf(this.m1282s()));
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 107868:
                    if (str.equals("map")) {
                        wo1.m5396w("map", 1, arrayList);
                        ht1VarM96t8 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                        if (ht1VarM96t8 instanceof ft1) {
                            return this.m1282s() == 0 ? new dp1() : d71.m1119w(this, f71Var, (ft1) ht1VarM96t8, null, null);
                        }
                        C0270h1.m2190f("Callback should be a method");
                        return null;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 111185:
                    if (str.equals("pop")) {
                        wo1.m5396w("pop", 0, arrayList);
                        iM1282s5 = this.m1282s();
                        if (iM1282s5 != 0) {
                            int i12 = iM1282s5 - 1;
                            ht1 ht1VarM1283t = this.m1283t(i12);
                            this.m1286w(i12);
                            return ht1VarM1283t;
                        }
                        return ht1VarM96t;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 3267882:
                    if (str.equals("join")) {
                        wo1.m5399z("join", 1, arrayList);
                        if (this.m1282s() == 0) {
                            return ht1.f3337i;
                        }
                        if (arrayList.isEmpty()) {
                            strMo753f = ",";
                        } else {
                            ht1VarM96t9 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                            if (!(ht1VarM96t9 instanceof et1) || (ht1VarM96t9 instanceof nt1)) {
                                strMo753f = "";
                            } else {
                                strMo753f = ht1VarM96t9.mo753f();
                            }
                        }
                        return new lt1(this.m1287x(strMo753f));
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList.isEmpty()) {
                            size3 = arrayList.size();
                            i6 = 0;
                            while (i6 < size3) {
                                Object obj5 = arrayList.get(i6);
                                i6++;
                                this.m1284u(this.m1282s(), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) obj5));
                            }
                        }
                        return new gr1(Double.valueOf(this.m1282s()));
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 3536116:
                    if (str.equals("some")) {
                        wo1.m5396w("some", 1, arrayList);
                        ht1VarM96t10 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                        if (ht1VarM96t10 instanceof bs1) {
                            C0270h1.m2190f("Callback should be a method");
                            return null;
                        }
                        if (this.m1282s() != 0) {
                            bs1 bs1Var2 = (bs1) ht1VarM96t10;
                            itM1281r5 = this.m1281r();
                            while (itM1281r5.hasNext()) {
                                iIntValue2 = ((Integer) itM1281r5.next()).intValue();
                                if (!this.m1285v(iIntValue2) && bs1Var2.mo749a(f71Var, Arrays.asList(this.m1283t(iIntValue2), new gr1(Double.valueOf(iIntValue2)), this)).mo752e().booleanValue()) {
                                    return ht1.f3335g;
                                }
                            }
                        }
                        return ht1.f3336h;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 3536286:
                    if (str.equals(str3)) {
                        wo1.m5399z(str3, 1, arrayList);
                        if (this.m1282s() >= 2) {
                            List listM1280q = this.m1280q();
                            if (arrayList.isEmpty()) {
                                bs1Var = null;
                            } else {
                                ht1VarM96t11 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                                if (ht1VarM96t11 instanceof bs1) {
                                    C0270h1.m2190f("Comparator should be a method");
                                    return null;
                                }
                                bs1Var = (bs1) ht1VarM96t11;
                            }
                            Collections.sort(listM1280q, new st1(bs1Var, f71Var));
                            treeMap.clear();
                            arrayList2 = (ArrayList) listM1280q;
                            size4 = arrayList2.size();
                            i7 = 0;
                            i8 = 0;
                            while (i7 < size4) {
                                Object obj6 = arrayList2.get(i7);
                                i7++;
                                this.m1284u(i8, (ht1) obj6);
                                i8++;
                            }
                        }
                        return this;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 96891675:
                    if (str.equals("every")) {
                        wo1.m5396w("every", 1, arrayList);
                        ht1VarM96t12 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                        if (ht1VarM96t12 instanceof ft1) {
                            C0270h1.m2190f("Callback should be a method");
                            return null;
                        }
                        if (this.m1282s() != 0) {
                            break;
                        }
                        return ht1.f3335g;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 109407362:
                    if (str.equals("shift")) {
                        wo1.m5396w("shift", 0, arrayList);
                        if (this.m1282s() != 0) {
                            ht1 ht1VarM1283t2 = this.m1283t(0);
                            this.m1286w(0);
                            return ht1VarM1283t2;
                        }
                        return ht1VarM96t;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 109526418:
                    if (str.equals("slice")) {
                        wo1.m5399z("slice", 2, arrayList);
                        if (arrayList.isEmpty()) {
                            return this.mo758p();
                        }
                        dM1282s2 = this.m1282s();
                        dM5374E2 = wo1.m5374E(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue());
                        if (dM5374E2 < 0.0d) {
                            dMin = Math.max(dM5374E2 + dM1282s2, 0.0d);
                        } else {
                            dMin = Math.min(dM5374E2, dM1282s2);
                        }
                        if (arrayList.size() == 2) {
                            dM5374E3 = wo1.m5374E(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue());
                            if (dM5374E3 < 0.0d) {
                                dM1282s2 = Math.max(dM1282s2 + dM5374E3, 0.0d);
                            } else {
                                dM1282s2 = Math.min(dM1282s2, dM5374E3);
                            }
                        }
                        dp1Var7 = new dp1();
                        for (i9 = (int) dMin; i9 < dM1282s2; i9++) {
                            dp1Var7.m1284u(dp1Var7.m1282s(), this.m1283t(i9));
                        }
                        return dp1Var7;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return d71.m1118t(this, f71Var, arrayList, false);
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 1099846370:
                    if (str.equals("reverse")) {
                        wo1.m5396w("reverse", 0, arrayList);
                        iM1282s6 = this.m1282s();
                        if (iM1282s6 != 0) {
                            for (i10 = 0; i10 < iM1282s6 / 2; i10++) {
                                if (this.m1285v(i10)) {
                                    ht1 ht1VarM1283t3 = this.m1283t(i10);
                                    this.m1284u(i10, null);
                                    i11 = (iM1282s6 - 1) - i10;
                                    if (this.m1285v(i11)) {
                                        this.m1284u(i10, this.m1283t(i11));
                                    }
                                    this.m1284u(i11, ht1VarM1283t3);
                                }
                            }
                        }
                        return this;
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        wo1.m5399z("indexOf", 2, arrayList);
                        if (!arrayList.isEmpty()) {
                            ht1VarM96t = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                        }
                        ht1 ht1Var4 = ht1VarM96t;
                        if (arrayList.size() > 1) {
                            dM5374E4 = wo1.m5374E(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue());
                            if (dM5374E4 >= this.m1282s()) {
                                return new gr1(dValueOf);
                            }
                            if (dM5374E4 < 0.0d) {
                                dM1282s = ((double) this.m1282s()) + dM5374E4;
                            } else {
                                dM1282s = dM5374E4;
                            }
                        }
                        itM1281r6 = this.m1281r();
                        while (itM1281r6.hasNext()) {
                            int iIntValue3 = ((Integer) itM1281r6.next()).intValue();
                            d = iIntValue3;
                            if (d < dM1282s && wo1.m5372C(this.m1283t(iIntValue3), ht1Var4)) {
                                return new gr1(Double.valueOf(d));
                            }
                        }
                        return new gr1(dValueOf);
                    }
                    C0270h1.m2190f("Command not supported");
                    return null;
                default:
                    C0270h1.m2190f("Command not supported");
                    return null;
            }
        }
        str2 = "filter";
        obj = "unshift";
        str3 = "sort";
        obj2 = "reduce";
        dValueOf = Double.valueOf(-1.0d);
        iHashCode = str.hashCode();
        TreeMap treeMap5 = this.f1757j;
        ht1VarM96t = ht1.f3330b;
        treeMap = treeMap5;
        dM1282s = 0.0d;
        switch (iHashCode) {
            case -1776922004:
                str4 = str7;
                if (str.equals(str4)) {
                    wo1.m5396w(str4, 0, arrayList);
                    return new lt1(this.m1287x(","));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    dp1Var = (dp1) this.mo758p();
                    if (!arrayList.isEmpty()) {
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            Object obj7 = arrayList.get(i);
                            i++;
                            ht1VarM96t2 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) obj7);
                            if (!(ht1VarM96t2 instanceof nq1)) {
                                C0270h1.m2191g("Failed evaluation of arguments");
                                return null;
                            }
                            iM1282s = dp1Var.m1282s();
                            if (ht1VarM96t2 instanceof dp1) {
                                dp1Var2 = (dp1) ht1VarM96t2;
                                itM1281r = dp1Var2.m1281r();
                                while (itM1281r.hasNext()) {
                                    Integer num4 = (Integer) itM1281r.next();
                                    dp1Var.m1284u(num4.intValue() + iM1282s, dp1Var2.m1283t(num4.intValue()));
                                }
                            } else {
                                dp1Var.m1284u(iM1282s, ht1VarM96t2);
                            }
                        }
                    }
                    return dp1Var;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -1274492040:
                str5 = str2;
                if (str.equals(str5)) {
                    wo1.m5396w(str5, 1, arrayList);
                    ht1VarM96t3 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    if (ht1VarM96t3 instanceof ft1) {
                        C0270h1.m2190f("Callback should be a method");
                        return null;
                    }
                    if (treeMap.size() == 0) {
                        return new dp1();
                    }
                    dp1Var3 = (dp1) this.mo758p();
                    dp1 dp1VarM1119w2 = d71.m1119w(this, f71Var, (ft1) ht1VarM96t3, null, Boolean.TRUE);
                    dp1Var4 = new dp1();
                    itM1281r2 = dp1VarM1119w2.m1281r();
                    while (itM1281r2.hasNext()) {
                        dp1Var4.m1284u(dp1Var4.m1282s(), dp1Var3.m1283t(((Integer) itM1281r2.next()).intValue()));
                    }
                    return dp1Var4;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -934873754:
                if (str.equals(obj2)) {
                    return d71.m1118t(this, f71Var, arrayList, true);
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -895859076:
                if (str.equals(str9)) {
                    if (arrayList.isEmpty()) {
                        return new dp1();
                    }
                    ht1 ht1Var5 = (ht1) arrayList.get(0);
                    a81 a81Var3 = (a81) f71Var.f2335l;
                    a81Var = (a81) f71Var.f2335l;
                    iM5374E = (int) wo1.m5374E(a81Var3.m96t(f71Var, ht1Var5).mo755h().doubleValue());
                    if (iM5374E < 0) {
                        iM5374E = Math.max(0, this.m1282s() + iM5374E);
                    } else if (iM5374E > this.m1282s()) {
                        iM5374E = this.m1282s();
                    }
                    iM1282s2 = this.m1282s();
                    dp1Var5 = new dp1();
                    if (arrayList.size() > 1) {
                        iMax = Math.max(0, (int) wo1.m5374E(a81Var.m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue()));
                        if (iMax > 0) {
                            while (i4 < Math.min(iM1282s2, iM5374E + iMax)) {
                                dp1Var5.m1284u(dp1Var5.m1282s(), this.m1283t(iM5374E));
                                this.m1286w(iM5374E);
                            }
                        }
                        i2 = 2;
                        if (arrayList.size() > 2) {
                            while (i2 < arrayList.size()) {
                                ht1VarM96t4 = a81Var.m96t(f71Var, (ht1) arrayList.get(i2));
                                if (!(ht1VarM96t4 instanceof nq1)) {
                                    C0270h1.m2190f("Failed to parse elements to add");
                                    return null;
                                }
                                i3 = (iM5374E + i2) - 2;
                                if (i3 >= 0) {
                                    C0270h1.m2190f(j11.m2774i(new StringBuilder(String.valueOf(i3).length() + 21), "Invalid value index: ", i3));
                                    return null;
                                }
                                if (i3 >= this.m1282s()) {
                                    this.m1284u(i3, ht1VarM96t4);
                                    treeMap2 = treeMap;
                                } else {
                                    iIntValue = ((Integer) treeMap.lastKey()).intValue();
                                    while (iIntValue >= i3) {
                                        numValueOf = Integer.valueOf(iIntValue);
                                        treeMap3 = treeMap;
                                        ht1Var = (ht1) treeMap3.get(numValueOf);
                                        if (ht1Var != null) {
                                            this.m1284u(iIntValue + 1, ht1Var);
                                            treeMap3.remove(numValueOf);
                                        }
                                        iIntValue--;
                                        treeMap = treeMap3;
                                    }
                                    treeMap2 = treeMap;
                                    this.m1284u(i3, ht1VarM96t4);
                                }
                                i2++;
                                treeMap = treeMap2;
                            }
                        }
                    } else {
                        while (iM5374E < iM1282s2) {
                            dp1Var5.m1284u(dp1Var5.m1282s(), this.m1283t(iM5374E));
                            this.m1284u(iM5374E, null);
                            iM5374E++;
                        }
                    }
                    return dp1Var5;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -678635926:
                str6 = str8;
                if (str.equals(str6)) {
                    wo1.m5396w(str6, 1, arrayList);
                    ht1VarM96t5 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    if (ht1VarM96t5 instanceof ft1) {
                        C0270h1.m2190f("Callback should be a method");
                        return null;
                    }
                    if (treeMap.size() != 0) {
                        d71.m1119w(this, f71Var, (ft1) ht1VarM96t5, null, null);
                        return ht1VarM96t;
                    }
                    return ht1VarM96t;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    wo1.m5399z("lastIndexOf", 2, arrayList);
                    if (!arrayList.isEmpty()) {
                        ht1VarM96t = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    }
                    ht1 ht1Var6 = ht1VarM96t;
                    iM1282s3 = this.m1282s() - 1;
                    if (arrayList.size() > 1) {
                        ht1VarM96t6 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                        if (Double.isNaN(ht1VarM96t6.mo755h().doubleValue())) {
                            dM5374E = this.m1282s() - 1;
                        } else {
                            dM5374E = wo1.m5374E(ht1VarM96t6.mo755h().doubleValue());
                        }
                        if (dM5374E < 0.0d) {
                            dM5374E += (double) this.m1282s();
                        }
                    } else {
                        dM5374E = iM1282s3;
                    }
                    if (dM5374E < 0.0d) {
                        return new gr1(dValueOf);
                    }
                    while (iMin >= 0) {
                        if (!this.m1285v(iMin)) {
                        }
                    }
                    return new gr1(dValueOf);
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case -277637751:
                if (str.equals(obj)) {
                    if (!arrayList.isEmpty()) {
                        dp1Var6 = new dp1();
                        size2 = arrayList.size();
                        i5 = 0;
                        while (i5 < size2) {
                            Object obj8 = arrayList.get(i5);
                            i5++;
                            ht1VarM96t7 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) obj8);
                            if (!(ht1VarM96t7 instanceof nq1)) {
                                C0270h1.m2191g("Argument evaluation failed");
                                return null;
                            }
                            dp1Var6.m1284u(dp1Var6.m1282s(), ht1VarM96t7);
                        }
                        iM1282s4 = dp1Var6.m1282s();
                        itM1281r3 = this.m1281r();
                        while (itM1281r3.hasNext()) {
                            Integer num5 = (Integer) itM1281r3.next();
                            dp1Var6.m1284u(num5.intValue() + iM1282s4, this.m1283t(num5.intValue()));
                        }
                        treeMap.clear();
                        itM1281r4 = dp1Var6.m1281r();
                        while (itM1281r4.hasNext()) {
                            Integer num6 = (Integer) itM1281r4.next();
                            this.m1284u(num6.intValue(), dp1Var6.m1283t(num6.intValue()));
                        }
                    }
                    return new gr1(Double.valueOf(this.m1282s()));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 107868:
                if (str.equals("map")) {
                    wo1.m5396w("map", 1, arrayList);
                    ht1VarM96t8 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    if (ht1VarM96t8 instanceof ft1) {
                        if (this.m1282s() == 0) {
                        }
                    }
                    C0270h1.m2190f("Callback should be a method");
                    return null;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 111185:
                if (str.equals("pop")) {
                    wo1.m5396w("pop", 0, arrayList);
                    iM1282s5 = this.m1282s();
                    if (iM1282s5 != 0) {
                        int i13 = iM1282s5 - 1;
                        ht1 ht1VarM1283t4 = this.m1283t(i13);
                        this.m1286w(i13);
                        return ht1VarM1283t4;
                    }
                    return ht1VarM96t;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 3267882:
                if (str.equals("join")) {
                    wo1.m5399z("join", 1, arrayList);
                    if (this.m1282s() == 0) {
                        return ht1.f3337i;
                    }
                    if (arrayList.isEmpty()) {
                        ht1VarM96t9 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                        if (ht1VarM96t9 instanceof et1) {
                            strMo753f = "";
                        } else {
                            strMo753f = "";
                        }
                    } else {
                        strMo753f = ",";
                    }
                    return new lt1(this.m1287x(strMo753f));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 3452698:
                if (str.equals("push")) {
                    if (!arrayList.isEmpty()) {
                        size3 = arrayList.size();
                        i6 = 0;
                        while (i6 < size3) {
                            Object obj9 = arrayList.get(i6);
                            i6++;
                            this.m1284u(this.m1282s(), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) obj9));
                        }
                    }
                    return new gr1(Double.valueOf(this.m1282s()));
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 3536116:
                if (str.equals("some")) {
                    wo1.m5396w("some", 1, arrayList);
                    ht1VarM96t10 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    if (ht1VarM96t10 instanceof bs1) {
                        C0270h1.m2190f("Callback should be a method");
                        return null;
                    }
                    if (this.m1282s() != 0) {
                        bs1 bs1Var3 = (bs1) ht1VarM96t10;
                        itM1281r5 = this.m1281r();
                        while (itM1281r5.hasNext()) {
                            iIntValue2 = ((Integer) itM1281r5.next()).intValue();
                            if (!this.m1285v(iIntValue2)) {
                            }
                        }
                    }
                    return ht1.f3336h;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 3536286:
                if (str.equals(str3)) {
                    wo1.m5399z(str3, 1, arrayList);
                    if (this.m1282s() >= 2) {
                        List listM1280q2 = this.m1280q();
                        if (arrayList.isEmpty()) {
                            ht1VarM96t11 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                            if (ht1VarM96t11 instanceof bs1) {
                                C0270h1.m2190f("Comparator should be a method");
                                return null;
                            }
                            bs1Var = (bs1) ht1VarM96t11;
                        } else {
                            bs1Var = null;
                        }
                        Collections.sort(listM1280q2, new st1(bs1Var, f71Var));
                        treeMap.clear();
                        arrayList2 = (ArrayList) listM1280q2;
                        size4 = arrayList2.size();
                        i7 = 0;
                        i8 = 0;
                        while (i7 < size4) {
                            Object obj10 = arrayList2.get(i7);
                            i7++;
                            this.m1284u(i8, (ht1) obj10);
                            i8++;
                        }
                    }
                    return this;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 96891675:
                if (str.equals("every")) {
                    wo1.m5396w("every", 1, arrayList);
                    ht1VarM96t12 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    if (ht1VarM96t12 instanceof ft1) {
                        C0270h1.m2190f("Callback should be a method");
                        return null;
                    }
                    if (this.m1282s() != 0) {
                        break;
                    }
                    return ht1.f3335g;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 109407362:
                if (str.equals("shift")) {
                    wo1.m5396w("shift", 0, arrayList);
                    if (this.m1282s() != 0) {
                        ht1 ht1VarM1283t5 = this.m1283t(0);
                        this.m1286w(0);
                        return ht1VarM1283t5;
                    }
                    return ht1VarM96t;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    wo1.m5399z("slice", 2, arrayList);
                    if (arrayList.isEmpty()) {
                        return this.mo758p();
                    }
                    dM1282s2 = this.m1282s();
                    dM5374E2 = wo1.m5374E(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue());
                    if (dM5374E2 < 0.0d) {
                        dMin = Math.max(dM5374E2 + dM1282s2, 0.0d);
                    } else {
                        dMin = Math.min(dM5374E2, dM1282s2);
                    }
                    if (arrayList.size() == 2) {
                        dM5374E3 = wo1.m5374E(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue());
                        if (dM5374E3 < 0.0d) {
                            dM1282s2 = Math.max(dM1282s2 + dM5374E3, 0.0d);
                        } else {
                            dM1282s2 = Math.min(dM1282s2, dM5374E3);
                        }
                    }
                    dp1Var7 = new dp1();
                    while (i9 < dM1282s2) {
                        dp1Var7.m1284u(dp1Var7.m1282s(), this.m1283t(i9));
                    }
                    return dp1Var7;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 965561430:
                if (str.equals("reduceRight")) {
                    return d71.m1118t(this, f71Var, arrayList, false);
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 1099846370:
                if (str.equals("reverse")) {
                    wo1.m5396w("reverse", 0, arrayList);
                    iM1282s6 = this.m1282s();
                    if (iM1282s6 != 0) {
                        while (i10 < iM1282s6 / 2) {
                            if (this.m1285v(i10)) {
                                ht1 ht1VarM1283t6 = this.m1283t(i10);
                                this.m1284u(i10, null);
                                i11 = (iM1282s6 - 1) - i10;
                                if (this.m1285v(i11)) {
                                    this.m1284u(i10, this.m1283t(i11));
                                }
                                this.m1284u(i11, ht1VarM1283t6);
                            }
                        }
                    }
                    return this;
                }
                C0270h1.m2190f("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    wo1.m5399z("indexOf", 2, arrayList);
                    if (!arrayList.isEmpty()) {
                        ht1VarM96t = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    }
                    ht1 ht1Var7 = ht1VarM96t;
                    if (arrayList.size() > 1) {
                        dM5374E4 = wo1.m5374E(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue());
                        if (dM5374E4 >= this.m1282s()) {
                            return new gr1(dValueOf);
                        }
                        if (dM5374E4 < 0.0d) {
                            dM1282s = ((double) this.m1282s()) + dM5374E4;
                        } else {
                            dM1282s = dM5374E4;
                        }
                    }
                    itM1281r6 = this.m1281r();
                    while (itM1281r6.hasNext()) {
                        int iIntValue4 = ((Integer) itM1281r6.next()).intValue();
                        d = iIntValue4;
                        if (d < dM1282s) {
                        }
                    }
                    return new gr1(dValueOf);
                }
                C0270h1.m2190f("Command not supported");
                return null;
            default:
                C0270h1.m2190f("Command not supported");
                return null;
        }
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: h */
    public final Double mo755h() {
        TreeMap treeMap = this.f1757j;
        if (treeMap.size() == 1) {
            return m1283t(0).mo755h();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f1757j.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jt1(2, this);
    }

    @Override // p000.zs1
    /* JADX INFO: renamed from: j */
    public final ht1 mo756j(String str) {
        ht1 ht1Var;
        if ("length".equals(str)) {
            return new gr1(Double.valueOf(m1282s()));
        }
        return (!mo757l(str) || (ht1Var = (ht1) this.f1758k.get(str)) == null) ? ht1.f3330b : ht1Var;
    }

    @Override // p000.zs1
    /* JADX INFO: renamed from: l */
    public final boolean mo757l(String str) {
        return "length".equals(str) || this.f1758k.containsKey(str);
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: p */
    public final ht1 mo758p() {
        dp1 dp1Var = new dp1();
        for (Map.Entry entry : this.f1757j.entrySet()) {
            boolean z = entry.getValue() instanceof zs1;
            TreeMap treeMap = dp1Var.f1757j;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (ht1) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((ht1) entry.getValue()).mo758p());
            }
        }
        return dp1Var;
    }

    /* JADX INFO: renamed from: q */
    public final List m1280q() {
        ArrayList arrayList = new ArrayList(m1282s());
        for (int i = 0; i < m1282s(); i++) {
            arrayList.add(m1283t(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public final Iterator m1281r() {
        return this.f1757j.keySet().iterator();
    }

    /* JADX INFO: renamed from: s */
    public final int m1282s() {
        TreeMap treeMap = this.f1757j;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    /* JADX INFO: renamed from: t */
    public final ht1 m1283t(int i) {
        ht1 ht1Var;
        if (i < m1282s()) {
            return (!m1285v(i) || (ht1Var = (ht1) this.f1757j.get(Integer.valueOf(i))) == null) ? ht1.f3330b : ht1Var;
        }
        C0270h1.m2193i("Attempting to get element outside of current array");
        return null;
    }

    public final String toString() {
        return m1287x(",");
    }

    /* JADX INFO: renamed from: u */
    public final void m1284u(int i, ht1 ht1Var) {
        if (i > 32468) {
            C0270h1.m2191g("Array too large");
            return;
        }
        if (i < 0) {
            C0270h1.m2193i(j11.m2774i(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
            return;
        }
        TreeMap treeMap = this.f1757j;
        if (ht1Var == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), ht1Var);
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1285v(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f1757j;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        C0270h1.m2193i(j11.m2774i(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final void m1286w(int i) {
        TreeMap treeMap = this.f1757j;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, ht1.f3330b);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            ht1 ht1Var = (ht1) treeMap.get(numValueOf2);
            if (ht1Var != null) {
                treeMap.put(Integer.valueOf(i - 1), ht1Var);
                treeMap.remove(numValueOf2);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m1287x(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f1757j.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= m1282s()) {
                    break;
                }
                ht1 ht1VarM1283t = m1283t(i);
                sb.append(str2);
                if (!(ht1VarM1283t instanceof nt1) && !(ht1VarM1283t instanceof et1)) {
                    sb.append(ht1VarM1283t.mo753f());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public dp1() {
        this.f1757j = new TreeMap();
        this.f1758k = new TreeMap();
    }
}
