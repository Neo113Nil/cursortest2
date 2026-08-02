package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cy1 {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f1491b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f1492c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference f1493d = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final d02 f1494a;

    public cy1(d02 d02Var) {
        this.f1494a = d02Var;
    }

    /* JADX INFO: renamed from: g */
    public static final String m1042g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        p80.m3863h(atomicReference);
        p80.m3858b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final String m1043a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f1494a.m1076b() ? str : m1042g(str, zg1.f9767m, zg1.f9762h, f1491b);
    }

    /* JADX INFO: renamed from: b */
    public final String m1044b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f1494a.m1076b() ? str : m1042g(str, AbstractC0875xf.f8944f, AbstractC0875xf.f8943e, f1492c);
    }

    /* JADX INFO: renamed from: c */
    public final String m1045c(String str) {
        if (str == null) {
            return null;
        }
        if (this.f1494a.m1076b()) {
            return str.startsWith("_exp_") ? AbstractC0024an.m284g("experiment_id(", str, ")") : m1042g(str, AbstractC0959zp.f9891v, AbstractC0959zp.f9890u, f1493d);
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public final String m1046d(fu1 fu1Var) {
        String string;
        d02 d02Var = this.f1494a;
        if (!d02Var.m1076b()) {
            return fu1Var.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(fu1Var.f2503l);
        sb.append(",name=");
        sb.append(m1043a(fu1Var.f2501j));
        sb.append(",params=");
        eu1 eu1Var = fu1Var.f2502k;
        if (eu1Var == null) {
            string = null;
        } else {
            string = !d02Var.m1076b() ? eu1Var.f2185j.toString() : m1047e(eu1Var.m1507e());
        }
        sb.append(string);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final String m1047e(Bundle bundle) {
        String strM1048f;
        if (bundle == null) {
            return null;
        }
        if (!this.f1494a.m1076b()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m1044b(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strM1048f = m1048f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strM1048f = m1048f((Object[]) obj);
            } else {
                strM1048f = obj instanceof ArrayList ? m1048f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strM1048f);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m1048f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strM1047e = obj instanceof Bundle ? m1047e((Bundle) obj) : String.valueOf(obj);
            if (strM1047e != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strM1047e);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
