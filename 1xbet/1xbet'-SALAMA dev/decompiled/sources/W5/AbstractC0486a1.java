package W5;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzdq;
import com.google.android.gms.internal.ads.zzgwl;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.recaptcha.internal.zzjg;
import com.google.crypto.tink.shaded.protobuf.C0832l;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.HashMap;

/* JADX INFO: renamed from: W5.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0486a1 {
    public static final void a(int i7, View view, ViewGroup viewGroup) {
        t6.h.e(view, "view");
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
        int iE = p136t.e.e(i7);
        if (iE == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iE == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iE == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iE != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static final boolean b(int i7) {
        return i7 == 3 || i7 == 4 || i7 == 6;
    }

    public static int c(int i7, int i8, int i9) {
        return zzgwl.zzD(i7) + i8 + i9;
    }

    public static int d(int i7, int i8, int i9, int i10) {
        return ((i7 / i8) * i9) + i10;
    }

    public static String e(int i7, int i8, String str, String str2) {
        return str + i7 + str2 + i8;
    }

    public static String f(int i7, String str, String str2) {
        return str + i7 + str2;
    }

    public static String g(String str, long j) {
        return str + j;
    }

    public static String h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String i(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder j(int i7, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i7);
        sb.append(str2);
        return sb;
    }

    public static void k(int i7, String str, String str2) {
        zzdq.zzf(str2, str + i7);
    }

    public static void l(int i7, HashMap map, String str, int i8, String str2) {
        map.put(str, Integer.valueOf(i7));
        map.put(str2, Integer.valueOf(i8));
    }

    public static void m(int i7, HashMap map, String str, String str2, String str3) {
        map.put(str, Integer.valueOf(i7));
        map.put(str2, str3);
    }

    public static /* synthetic */ void n(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void o(String str, String str2, String str3) {
        zzdq.zzf(str3, str2.concat(String.valueOf(str)));
    }

    public static int p(int i7, int i8, int i9) {
        return zzjj.zzA(i7) + i8 + i9;
    }

    public static int q(int i7, int i8, int i9, int i10) {
        return ((i7 * i8) / i9) + i10;
    }

    public static int r(int i7, int i8, int i9) {
        return zzjg.zzx(i7) + i8 + i9;
    }

    public static int s(int i7, int i8, int i9, int i10) {
        return zzjj.zzA(i7) + i8 + i9 + i10;
    }

    public static int t(int i7, int i8, int i9, int i10) {
        return C0832l.B0(i7) + i8 + i9 + i10;
    }

    public static /* synthetic */ String u(int i7) {
        if (i7 != 1) {
            return i7 != 2 ? "null" : "PLAINTEXT";
        }
        return "TLS";
    }

    public static /* synthetic */ String v(int i7) {
        if (i7 != 1) {
            return i7 != 2 ? "null" : "OUTBOUND";
        }
        return "INBOUND";
    }

    public static /* synthetic */ String w(int i7) {
        switch (i7) {
            case 1:
                return "NULL_VALUE";
            case 2:
                return "BOOLEAN_VALUE";
            case 3:
                return "INTEGER_VALUE";
            case 4:
                return "DOUBLE_VALUE";
            case 5:
                return "TIMESTAMP_VALUE";
            case 6:
                return "STRING_VALUE";
            case 7:
                return "BYTES_VALUE";
            case 8:
                return "REFERENCE_VALUE";
            case 9:
                return "GEO_POINT_VALUE";
            case 10:
                return "ARRAY_VALUE";
            case 11:
                return "MAP_VALUE";
            case 12:
                return "VALUETYPE_NOT_SET";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String x(int i7) {
        switch (i7) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i7) {
        switch (i7) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i7) {
        switch (i7) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
