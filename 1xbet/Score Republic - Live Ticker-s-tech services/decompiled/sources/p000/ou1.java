package p000;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ou1 {

    /* JADX INFO: renamed from: a */
    public static final q01 f5916a;

    /* JADX INFO: renamed from: b */
    public static final q01 f5917b;

    /* JADX INFO: renamed from: c */
    public static final q01 f5918c;

    /* JADX INFO: renamed from: d */
    public static final q01 f5919d;

    /* JADX INFO: renamed from: e */
    public static final q01 f5920e;

    static {
        int i = sc0.f7095l;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        sc0.m4514l(15, objArr);
        nc0 nc0Var = qc0.f6464k;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        oa2.m3655b(7, objArr2);
        f5916a = qc0.m4055j(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        oa2.m3655b(3, objArr3);
        f5917b = qc0.m4055j(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        oa2.m3655b(2, objArr4);
        f5918c = qc0.m4055j(2, objArr4);
        wm1.m5355a("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        String[] strArr = AbstractC0959zp.f9890u;
        oa2.m3655b(15, strArr);
        int i2 = 0 + 15;
        if (objArrCopyOf.length < i2) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, kc0.m3003b(objArrCopyOf.length, i2));
        }
        System.arraycopy(strArr, 0, objArrCopyOf, 0, 15);
        int i3 = 0 + 15;
        String[] strArr2 = AbstractC0959zp.f9891v;
        oa2.m3655b(15, strArr2);
        int i4 = i3 + 15;
        if (objArrCopyOf.length < i4) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, kc0.m3003b(objArrCopyOf.length, i4));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, i3, 15);
        f5919d = qc0.m4055j(i3 + 15, objArrCopyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        oa2.m3655b(2, objArr5);
        f5920e = qc0.m4055j(2, objArr5);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3796a(String str) {
        return !f5917b.contains(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3797b(Bundle bundle, String str) {
        if (!f5916a.contains(str)) {
            if (bundle == null) {
                return true;
            }
            q01 q01Var = f5918c;
            int i = q01Var.f6305m;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) q01Var.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3798c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!f5919d.contains(str2)) {
            q01 q01Var = f5920e;
            int i = q01Var.f6305m;
            int i2 = 0;
            while (i2 < i) {
                boolean zMatches = str2.matches((String) q01Var.get(i2));
                i2++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3799d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (m3796a(str) && bundle != null) {
            q01 q01Var = f5918c;
            int i = q01Var.f6305m;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) q01Var.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    }
                } else if (str.equals("fdl")) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                }
            } else if (str.equals("fcm")) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
        }
        return false;
    }
}
