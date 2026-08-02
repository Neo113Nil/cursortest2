package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j11 {
    /* JADX INFO: renamed from: a */
    public static final void m2766a(int i, View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iM292o = AbstractC0024an.m292o(i);
        if (iM292o == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (t50.m4691J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iM292o == 1) {
            if (t50.m4691J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (t50.m4691J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iM292o == 2) {
            if (t50.m4691J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iM292o != 3) {
            return;
        }
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m2767b(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }

    /* JADX INFO: renamed from: c */
    public static int m2768c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m2769d(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m2770e(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return 21;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                return 22;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m2771f(int i, int i2, int i3) {
        return ro1.m4391a(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: g */
    public static int m2772g(int i, int i2, int i3, int i4) {
        return ro1.m4391a(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: h */
    public static String m2773h(String str, int i) {
        return str + i;
    }

    /* JADX INFO: renamed from: i */
    public static String m2774i(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static kp1 m2775j(kp1 kp1Var) {
        int size = kp1Var.size();
        return kp1Var.mo460m(size + size);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m2776k(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return "PINNED_TO_SERVICE_UPLOAD";
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m2777l(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m2778m(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }
}
