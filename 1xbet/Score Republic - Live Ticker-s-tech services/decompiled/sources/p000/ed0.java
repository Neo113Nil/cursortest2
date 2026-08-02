package p000;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ed0 implements r60 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2064j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ hd0 f2065k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f2066l;

    public /* synthetic */ ed0(hd0 hd0Var, String str, int i) {
        this.f2064j = i;
        this.f2065k = hd0Var;
        this.f2066l = str;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x03d4  */
    @Override // p000.r60
    public final Object apply(Object obj) {
        String strM184o;
        String strM185p;
        cc0 cc0Var;
        C0047b2 c0047b2;
        zc0 c0132db;
        zc0 ay0Var;
        cc0 cc0Var2;
        cc0 cc0Var3;
        C0047b2 c0047b3;
        cc0 cc0Var4;
        cc0 cc0Var5;
        int i = this.f2064j;
        String str = this.f2066l;
        hd0 hd0Var = this.f2065k;
        int i2 = 0;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        switch (i) {
            case 0:
                C0948ze c0948ze = (C0948ze) obj;
                hd0Var.getClass();
                if (!AbstractC0024an.m278a(c0948ze.m5884r(), 1)) {
                    if (AbstractC0024an.m278a(c0948ze.m5884r(), 2)) {
                        String strM5626o = c0948ze.m5882p().m5626o();
                        String strM5627p = c0948ze.m5882p().m5627p();
                        if (!c0948ze.m5883q()) {
                            C0232g1 c0232g1 = hd0Var.f3176l;
                            c0232g1.f2573b.execute(new RunnableC0195f1(0, c0232g1, c0948ze.m5882p().m5629s()));
                        }
                        strM184o = strM5626o;
                        strM185p = strM5627p;
                    }
                    return lm0.f4838j;
                }
                strM184o = c0948ze.m5887u().m184o();
                strM185p = c0948ze.m5887u().m185p();
                ap0 ap0VarM5880n = c0948ze.m5880n();
                boolean zM5883q = c0948ze.m5883q();
                c0948ze.m5881o();
                a90.m127k(ap0VarM5880n, "FirebaseInAppMessaging content cannot be null.");
                a90.m127k(strM184o, "FirebaseInAppMessaging campaign id cannot be null.");
                a90.m127k(strM185p, "FirebaseInAppMessaging campaign name cannot be null.");
                n80.m3496e("Decoding message: ".concat(ap0VarM5880n.toString()));
                m81 m81Var = new m81(strM184o, strM185p, zM5883q);
                int iM292o = AbstractC0024an.m292o(ap0VarM5880n.m454r());
                if (iM292o == 0) {
                    xo0 xo0VarM451n = ap0VarM5880n.m451n();
                    String strM5673o = !TextUtils.isEmpty(xo0VarM451n.m5673o()) ? xo0VarM451n.m5673o() : null;
                    if (TextUtils.isEmpty(xo0VarM451n.m5675r())) {
                        cc0Var = null;
                    } else {
                        String strM5675r = xo0VarM451n.m5675r();
                        if (TextUtils.isEmpty(strM5675r)) {
                            strM5675r = null;
                        }
                        if (TextUtils.isEmpty(strM5675r)) {
                            C0270h1.m2190f("ImageData model must have an imageUrl");
                            return null;
                        }
                        cc0Var = new cc0(strM5675r);
                    }
                    if (xo0VarM451n.m5677t()) {
                        C0312i6 c0312i6M5608h = x80.m5608h(xo0VarM451n.m5672n());
                        c0047b2 = new C0047b2((String) c0312i6M5608h.f3447k, (C0909yc) c0312i6M5608h.f3448l);
                    } else {
                        c0047b2 = null;
                    }
                    xc1 xc1VarM5609l = xo0VarM451n.m5678u() ? x80.m5609l(xo0VarM451n.m5674p()) : null;
                    xc1 xc1VarM5609l2 = xo0VarM451n.m5679v() ? x80.m5609l(xo0VarM451n.m5676s()) : null;
                    if (xc1VarM5609l2 == null) {
                        C0270h1.m2190f("Banner model must have a title");
                        return null;
                    }
                    if (TextUtils.isEmpty(strM5673o)) {
                        C0270h1.m2190f("Banner model must have a background color");
                        return null;
                    }
                    c0132db = new C0132db(m81Var, xc1VarM5609l2, xc1VarM5609l, cc0Var, c0047b2, strM5673o);
                } else {
                    if (iM292o != 1) {
                        if (iM292o == 2) {
                            bp0 bp0VarM453q = ap0VarM5880n.m453q();
                            if (TextUtils.isEmpty(bp0VarM453q.m737p())) {
                                cc0Var3 = null;
                            } else {
                                String strM737p = bp0VarM453q.m737p();
                                if (TextUtils.isEmpty(strM737p)) {
                                    strM737p = null;
                                }
                                if (TextUtils.isEmpty(strM737p)) {
                                    C0270h1.m2190f("ImageData model must have an imageUrl");
                                    return null;
                                }
                                cc0Var3 = new cc0(strM737p);
                            }
                            if (bp0VarM453q.m738q()) {
                                C0312i6 c0312i6M5608h2 = x80.m5608h(bp0VarM453q.m736n());
                                c0047b3 = new C0047b2((String) c0312i6M5608h2.f3447k, (C0909yc) c0312i6M5608h2.f3448l);
                            } else {
                                c0047b3 = null;
                            }
                            if (cc0Var3 == null) {
                                C0270h1.m2190f("ImageOnly model must have image data");
                                return null;
                            }
                            gc0 gc0Var = new gc0(m81Var, MessageType.IMAGE_ONLY);
                            gc0Var.f2692c = cc0Var3;
                            gc0Var.f2693d = c0047b3;
                            ay0Var = gc0Var;
                        } else if (iM292o != 3) {
                            ay0Var = new ay0(new m81(strM184o, strM185p, zM5883q), MessageType.UNSUPPORTED);
                        } else {
                            zo0 zo0VarM452o = ap0VarM5880n.m452o();
                            xc1 xc1VarM5609l3 = zo0VarM452o.m5945C() ? x80.m5609l(zo0VarM452o.m5954w()) : null;
                            xc1 xc1VarM5609l4 = zo0VarM452o.m5955x() ? x80.m5609l(zo0VarM452o.m5947o()) : null;
                            String strM5946n = !TextUtils.isEmpty(zo0VarM452o.m5946n()) ? zo0VarM452o.m5946n() : null;
                            C0047b2 c0047b2M5607e = (zo0VarM452o.m5956y() || zo0VarM452o.m5957z()) ? x80.m5607e(zo0VarM452o.m5950s(), zo0VarM452o.m5951t()) : null;
                            C0047b2 c0047b2M5607e2 = (zo0VarM452o.m5943A() || zo0VarM452o.m5944B()) ? x80.m5607e(zo0VarM452o.m5952u(), zo0VarM452o.m5953v()) : null;
                            if (TextUtils.isEmpty(zo0VarM452o.m5949r())) {
                                cc0Var4 = null;
                            } else {
                                String strM5949r = zo0VarM452o.m5949r();
                                if (TextUtils.isEmpty(strM5949r)) {
                                    strM5949r = null;
                                }
                                if (TextUtils.isEmpty(strM5949r)) {
                                    C0270h1.m2190f("ImageData model must have an imageUrl");
                                    return null;
                                }
                                cc0Var4 = new cc0(strM5949r);
                            }
                            if (TextUtils.isEmpty(zo0VarM452o.m5948q())) {
                                cc0Var5 = null;
                            } else {
                                String strM5948q = zo0VarM452o.m5948q();
                                if (TextUtils.isEmpty(strM5948q)) {
                                    strM5948q = null;
                                }
                                if (TextUtils.isEmpty(strM5948q)) {
                                    C0270h1.m2190f("ImageData model must have an imageUrl");
                                    return null;
                                }
                                cc0Var5 = new cc0(strM5948q);
                            }
                            if (c0047b2M5607e == null) {
                                C0270h1.m2190f("Card model must have a primary action");
                                return null;
                            }
                            if (c0047b2M5607e.f685b == null) {
                                C0270h1.m2190f("Card model must have a primary action button");
                                return null;
                            }
                            if (c0047b2M5607e2 != null && c0047b2M5607e2.f685b == null) {
                                C0270h1.m2190f("Card model secondary action must be null or have a button");
                                return null;
                            }
                            if (xc1VarM5609l3 == null) {
                                C0270h1.m2190f("Card model must have a title");
                                return null;
                            }
                            if (cc0Var4 == null && cc0Var5 == null) {
                                C0270h1.m2190f("Card model must have at least one image");
                                return null;
                            }
                            if (TextUtils.isEmpty(strM5946n)) {
                                C0270h1.m2190f("Card model must have a background color");
                                return null;
                            }
                            c0132db = new C0247gf(m81Var, xc1VarM5609l3, xc1VarM5609l4, cc0Var4, cc0Var5, strM5946n, c0047b2M5607e, c0047b2M5607e2);
                        }
                        if (!ay0Var.f9732a.equals(MessageType.UNSUPPORTED)) {
                            te1 te1Var = new te1();
                            te1Var.f7441a = ay0Var;
                            te1Var.f7442b = str;
                            return hm0.m2292a(te1Var);
                        }
                        return lm0.f4838j;
                    }
                    cp0 cp0VarM455s = ap0VarM5880n.m455s();
                    String strM1023p = !TextUtils.isEmpty(cp0VarM455s.m1023p()) ? cp0VarM455s.m1023p() : null;
                    if (TextUtils.isEmpty(cp0VarM455s.m1025s())) {
                        cc0Var2 = null;
                    } else {
                        String strM1025s = cp0VarM455s.m1025s();
                        if (TextUtils.isEmpty(strM1025s)) {
                            strM1025s = null;
                        }
                        if (TextUtils.isEmpty(strM1025s)) {
                            C0270h1.m2190f("ImageData model must have an imageUrl");
                            return null;
                        }
                        cc0Var2 = new cc0(strM1025s);
                    }
                    C0047b2 c0047b2M5607e3 = cp0VarM455s.m1027u() ? x80.m5607e(cp0VarM455s.m1021n(), cp0VarM455s.m1022o()) : null;
                    xc1 xc1VarM5609l5 = cp0VarM455s.m1028v() ? x80.m5609l(cp0VarM455s.m1024q()) : null;
                    xc1 xc1VarM5609l6 = cp0VarM455s.m1029w() ? x80.m5609l(cp0VarM455s.m1026t()) : null;
                    if (xc1VarM5609l6 == null) {
                        C0270h1.m2190f("Modal model must have a title");
                        return null;
                    }
                    if (c0047b2M5607e3 != null && c0047b2M5607e3.f685b == null) {
                        C0270h1.m2190f("Modal model action must be null or have a button");
                        return null;
                    }
                    if (TextUtils.isEmpty(strM1023p)) {
                        C0270h1.m2190f("Modal model must have a background color");
                        return null;
                    }
                    c0132db = new dq0(m81Var, xc1VarM5609l6, xc1VarM5609l5, cc0Var2, c0047b2M5607e3, strM1023p);
                }
                ay0Var = c0132db;
                if (!ay0Var.f9732a.equals(MessageType.UNSUPPORTED)) {
                    te1 te1Var2 = new te1();
                    te1Var2.f7441a = ay0Var;
                    te1Var2.f7442b = str;
                    return hm0.m2292a(te1Var2);
                }
                return lm0.f4838j;
            default:
                C0948ze c0948ze2 = (C0948ze) obj;
                hd0Var.getClass();
                if (c0948ze2.m5883q() || !str.equals("ON_FOREGROUND")) {
                    return hm0.m2292a(c0948ze2);
                }
                xz0 xz0Var = hd0Var.f3172h;
                C0463ma c0463ma = hd0Var.f3173i;
                return new qm0(new om0(i2, new xs0(i3, new xs0(i4, new um0(new nm0(new qm0(xz0Var.m5718a().m2295d(hm0.m2292a(uz0.m5005o())), new vz0(xz0Var, c0463ma, 2), 1), new vz0(xz0Var, c0463ma, 3), 0)), new C0042ay(22)), new CallableC0445lt(i5, new b81())), new C0042ay(23)), new bd0(c0948ze2), 1);
        }
    }
}
