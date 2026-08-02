package p000;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0415l implements d60 {

    /* JADX INFO: renamed from: a */
    public boolean f4613a = true;

    /* JADX INFO: renamed from: b */
    public Object f4614b;

    /* JADX INFO: renamed from: c */
    public Object f4615c;

    /* JADX INFO: renamed from: d */
    public Object f4616d;

    /* JADX INFO: renamed from: e */
    public Object f4617e;

    /* JADX WARN: Code duplicated, block: B:106:0x0277  */
    /* JADX WARN: Code duplicated, block: B:107:0x027a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0280  */
    /* JADX WARN: Code duplicated, block: B:112:0x029a  */
    /* JADX WARN: Code duplicated, block: B:114:0x029f  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:118:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:157:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    public C0415l(p42 p42Var, vr0 vr0Var) {
        v01 v01VarM1369d;
        char c;
        long j;
        String str;
        int i = 1;
        h42 h42Var = p42Var.f5987a;
        d42 d42Var = p42Var.f5988b;
        if (h42Var.f3052a.isEmpty()) {
            d42.m1086A().equals(d42Var);
        }
        this.f4614b = d42Var.m1088t();
        this.f4615c = d42Var.m1089u();
        d42Var.getClass();
        d42Var.getClass();
        Map mapM1093y = d42Var.m1092x() == 0 ? null : d42Var.m1093y();
        if (mapM1093y != null) {
            sc0.m4515p(mapM1093y.keySet());
        } else {
            Object[] objArr = w01.f8327r;
        }
        int iM1092x = d42Var.m1092x();
        h42 h42Var2 = p42Var.f5987a;
        char c2 = 3;
        int i2 = 0;
        if (iM1092x > 0) {
            Collection<x32> collectionValues = d42Var.m1093y().values();
            if (collectionValues == null) {
                v01VarM1369d = v01.f7985p;
            } else {
                C0163e6 c0163e6 = new C0163e6(4, 4);
                for (x32 x32Var : collectionValues) {
                    int iM5508H = x32Var.m5508H();
                    int i3 = iM5508H - 1;
                    if (iM5508H == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        c0163e6.m1371g(x32Var.m5509t(), Long.valueOf(x32Var.m5510u()));
                    } else if (i3 == 1) {
                        c0163e6.m1371g(x32Var.m5509t(), Boolean.valueOf(x32Var.m5511v()));
                    } else if (i3 == 2) {
                        c0163e6.m1371g(x32Var.m5509t(), Double.valueOf(x32Var.m5512w()));
                    } else if (i3 == 3) {
                        c0163e6.m1371g(x32Var.m5509t(), x32Var.m5513x());
                    } else {
                        if (i3 != 4) {
                            C0270h1.m2191g("Could not serialize Flag for override: ".concat(String.valueOf(x32Var.m5509t())));
                            throw null;
                        }
                        c0163e6.m1371g(x32Var.m5509t(), x32Var.m5514y().m3067p());
                    }
                }
                v01VarM1369d = c0163e6.m1369d(false);
            }
            if (!v01VarM1369d.isEmpty()) {
                HashMap map = new HashMap(v01VarM1369d);
                uc0 uc0Var = h42Var2.f3052a;
                tc0 tc0Var = new tc0();
                sf1 it = uc0Var.iterator();
                while (true) {
                    nc0 nc0Var = (nc0) it;
                    if (!nc0Var.hasNext()) {
                        for (String str2 : map.keySet()) {
                            Object obj = map.get(str2);
                            int length = str2.length();
                            if (length > 19 || length == 0) {
                                c = c2;
                            } else {
                                c = c2;
                                long jCharAt = str2.charAt(i2) - '0';
                                if (jCharAt >= 1 && jCharAt <= 9) {
                                    int i4 = i;
                                    while (true) {
                                        if (i4 >= length) {
                                            if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                                j = jCharAt;
                                                break;
                                            }
                                            break;
                                        }
                                        int iCharAt = str2.charAt(i4) - '0';
                                        if (!((iCharAt < 0) | (iCharAt > 9))) {
                                            jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                            i4++;
                                        }
                                    }
                                }
                                if (j == 0) {
                                    str = str2;
                                } else {
                                    str = null;
                                }
                                if (obj instanceof String) {
                                    tc0Var.m3004a(new g42(j, str, 4, 0L, obj));
                                } else if (obj instanceof byte[]) {
                                    tc0Var.m3004a(new g42(j, str, 5, 0L, obj));
                                } else if (obj instanceof Boolean) {
                                    tc0Var.m3004a(new g42(j, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj instanceof Long) {
                                    tc0Var.m3004a(new g42(j, str, 2, ((Long) obj).longValue(), null));
                                } else {
                                    if (obj instanceof Double) {
                                        String strValueOf = String.valueOf(obj);
                                        StringBuilder sb = new StringBuilder(str2.length() + 28 + strValueOf.length());
                                        sb.append("Cannot serialize override ");
                                        sb.append(str2);
                                        sb.append(": ");
                                        sb.append(strValueOf);
                                        throw new IllegalStateException(sb.toString());
                                    }
                                    tc0Var.m3004a(new g42(j, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                }
                                c2 = c;
                                i = 1;
                                i2 = 0;
                            }
                            j = 0;
                            if (j == 0) {
                                str = str2;
                            } else {
                                str = null;
                            }
                            if (obj instanceof String) {
                                tc0Var.m3004a(new g42(j, str, 4, 0L, obj));
                            } else if (obj instanceof byte[]) {
                                tc0Var.m3004a(new g42(j, str, 5, 0L, obj));
                            } else if (obj instanceof Boolean) {
                                tc0Var.m3004a(new g42(j, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj instanceof Long) {
                                tc0Var.m3004a(new g42(j, str, 2, ((Long) obj).longValue(), null));
                            } else {
                                if (obj instanceof Double) {
                                    String strValueOf2 = String.valueOf(obj);
                                    StringBuilder sb2 = new StringBuilder(str2.length() + 28 + strValueOf2.length());
                                    sb2.append("Cannot serialize override ");
                                    sb2.append(str2);
                                    sb2.append(": ");
                                    sb2.append(strValueOf2);
                                    throw new IllegalStateException(sb2.toString());
                                }
                                tc0Var.m3004a(new g42(j, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                            }
                            c2 = c;
                            i = 1;
                            i2 = 0;
                        }
                        h42Var2 = new h42(tc0Var.m4784d());
                        break;
                    }
                    g42 g42Var = (g42) nc0Var.next();
                    Object obj2 = g42Var.f2616k;
                    long j2 = g42Var.f2615j;
                    Object objRemove = map.remove(obj2 == null ? Long.toString(j2) : obj2);
                    if (objRemove == null) {
                        tc0Var.m3004a(g42Var);
                    } else if (objRemove instanceof String) {
                        tc0Var.m3004a(new g42(g42Var.f2615j, g42Var.f2616k, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        tc0Var.m3004a(new g42(g42Var.f2615j, g42Var.f2616k, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        tc0Var.m3004a(new g42(g42Var.f2615j, g42Var.f2616k, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        tc0Var.m3004a(new g42(g42Var.f2615j, g42Var.f2616k, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = g42Var.f2616k;
                            string = string == null ? Long.toString(j2) : string;
                            String string2 = objRemove.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 46 + string2.length());
                            sb3.append("Cannot serialize override for existing flag ");
                            sb3.append(string);
                            sb3.append(": ");
                            sb3.append(string2);
                            throw new IllegalStateException(sb3.toString());
                        }
                        tc0Var.m3004a(new g42(g42Var.f2615j, g42Var.f2616k, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
            }
        }
        int size = ((x01) h42Var2.f3052a).f8734p.size() + 3;
        wm1.m5355a("expectedSize", size);
        C0163e6 c0163e7 = new C0163e6(size, 4);
        sf1 it2 = h42Var2.f3052a.iterator();
        while (true) {
            nc0 nc0Var2 = (nc0) it2;
            if (!nc0Var2.hasNext()) {
                c0163e7.m1371g("__phenotype_server_token", d42Var.m1090v());
                c0163e7.m1371g("__phenotype_snapshot_token", d42Var.m1088t());
                c0163e7.m1371g("__phenotype_configuration_version", Long.valueOf(d42Var.m1091w()));
                this.f4616d = c0163e7.m1369d(false);
                this.f4617e = vr0Var;
                return;
            }
            g42 g42Var2 = (g42) nc0Var2.next();
            String string3 = g42Var2.f2616k;
            if (string3 == null) {
                string3 = Long.toString(g42Var2.f2615j);
            }
            c0163e7.m1371g(string3, g42Var2.m1985a());
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m3133a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM3134b;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.f4616d;
        if (this.f4613a && (viewParentM3134b = m3134b(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.f4617e) == null) {
                        this.f4617e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.f4617e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM3134b instanceof ur0) {
                    ((ur0) viewParentM3134b).mo348c(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM3134b instanceof tr0) {
                        ((tr0) viewParentM3134b).mo350e(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentM3134b.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM3134b + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public ViewParent m3134b(int i) {
        if (i == 0) {
            return (ViewParent) this.f4614b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.f4615c;
    }

    @Override // p000.d60
    public void close() {
        this.f4613a = true;
        a90.m132p("Lack of request message. GET request is only supported for unary requests", ((byte[]) this.f4616d) != null);
        ((lt0) ((AbstractC0489n) this.f4617e)).f4905v.m2855k((np0) this.f4614b, (byte[]) this.f4616d);
        this.f4616d = null;
        this.f4614b = null;
    }

    @Override // p000.d60
    /* JADX INFO: renamed from: d */
    public void mo1100d(xx0 xx0Var) {
        ha1 ha1Var = (ha1) this.f4615c;
        a90.m132p("writePayload should not be called multiple times", ((byte[]) this.f4616d) == null);
        try {
            this.f4616d = AbstractC0540od.m3683b(xx0Var);
            o80[] o80VarArr = ha1Var.f3140a;
            o80[] o80VarArr2 = ha1Var.f3140a;
            for (o80 o80Var : o80VarArr) {
                o80Var.mo1318w(0);
            }
            byte[] bArr = (byte[]) this.f4616d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (o80 o80Var2 : ha1Var.f3140a) {
                o80Var2.mo1319x(0, length, length2);
            }
            long length3 = ((byte[]) this.f4616d).length;
            for (o80 o80Var3 : o80VarArr2) {
                o80Var3.mo1320y(length3);
            }
            long length4 = ((byte[]) this.f4616d).length;
            for (o80 o80Var4 : o80VarArr2) {
                o80Var4.mo586z(length4);
            }
        } catch (IOException e) {
            dd0.m1163h(e);
        }
    }

    @Override // p000.d60
    public boolean isClosed() {
        return this.f4613a;
    }

    @Override // p000.d60
    public void flush() {
    }

    @Override // p000.d60
    /* JADX INFO: renamed from: c */
    public d60 mo1099c(InterfaceC0951zh interfaceC0951zh) {
        return this;
    }

    @Override // p000.d60
    /* JADX INFO: renamed from: e */
    public void mo1101e(int i) {
    }

    public C0415l(v72 v72Var, vr0 vr0Var) {
        v72.m5112A().equals(v72Var);
        this.f4614b = v72Var.m5119t();
        this.f4615c = v72Var.m5120u();
        int i = sc0.f7095l;
        Object[] objArr = w01.f8327r;
        int iM5124y = v72Var.m5124y() + 3;
        wm1.m5355a("expectedSize", iM5124y);
        C0163e6 c0163e6 = new C0163e6(iM5124y, 4);
        for (x72 x72Var : v72Var.m5123x()) {
            int iM5600G = x72Var.m5600G();
            int i2 = iM5600G - 1;
            if (iM5600G == 0) {
                throw null;
            }
            if (i2 == 0) {
                c0163e6.m1371g(x72Var.m5601t(), Long.valueOf(x72Var.m5602u()));
            } else if (i2 == 1) {
                c0163e6.m1371g(x72Var.m5601t(), Boolean.valueOf(x72Var.m5603v()));
            } else if (i2 == 2) {
                c0163e6.m1371g(x72Var.m5601t(), Double.valueOf(x72Var.m5604w()));
            } else if (i2 == 3) {
                c0163e6.m1371g(x72Var.m5601t(), x72Var.m5605x());
            } else if (i2 == 4) {
                c0163e6.m1371g(x72Var.m5601t(), x72Var.m5606y().m3067p());
            }
        }
        c0163e6.m1371g("__phenotype_server_token", v72Var.m5121v());
        c0163e6.m1371g("__phenotype_snapshot_token", v72Var.m5119t());
        c0163e6.m1371g("__phenotype_configuration_version", Long.valueOf(v72Var.m5122w()));
        this.f4616d = c0163e6.m1369d(false);
        this.f4617e = vr0Var;
    }
}
