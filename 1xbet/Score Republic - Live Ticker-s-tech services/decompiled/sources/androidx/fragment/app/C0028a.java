package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0030a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import live.football.scorerepublic.R;
import p000.AbstractActivityC0790v4;
import p000.AbstractC0024an;
import p000.C0042ay;
import p000.C0270h1;
import p000.C0443lr;
import p000.ViewOnAttachStateChangeListenerC0357jf;
import p000.a60;
import p000.ai1;
import p000.b50;
import p000.c50;
import p000.dd0;
import p000.e50;
import p000.f50;
import p000.f71;
import p000.g91;
import p000.i91;
import p000.j91;
import p000.n50;
import p000.oq0;
import p000.ph0;
import p000.qh0;
import p000.rj0;
import p000.t50;
import p000.uh0;
import p000.v50;
import p000.w50;
import p000.x50;
import p000.y50;
import p000.yh0;
import p000.z40;
import p000.z50;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0028a {

    /* JADX INFO: renamed from: a */
    public final f50 f535a;

    /* JADX INFO: renamed from: b */
    public final f71 f536b;

    /* JADX INFO: renamed from: c */
    public final c50 f537c;

    /* JADX INFO: renamed from: d */
    public boolean f538d = false;

    /* JADX INFO: renamed from: e */
    public int f539e = -1;

    public C0028a(f50 f50Var, f71 f71Var, ClassLoader classLoader, n50 n50Var, Bundle bundle) {
        this.f535a = f50Var;
        this.f536b = f71Var;
        y50 y50Var = (y50) bundle.getParcelable("state");
        c50 c50VarM3484a = n50Var.m3484a(y50Var.f9160j);
        c50VarM3484a.f1131n = y50Var.f9161k;
        c50VarM3484a.f1140w = y50Var.f9162l;
        c50VarM3484a.f1142y = y50Var.f9163m;
        c50VarM3484a.f1143z = true;
        c50VarM3484a.f1103G = y50Var.f9164n;
        c50VarM3484a.f1104H = y50Var.f9165o;
        c50VarM3484a.f1105I = y50Var.f9166p;
        c50VarM3484a.f1108L = y50Var.f9167q;
        c50VarM3484a.f1138u = y50Var.f9168r;
        c50VarM3484a.f1107K = y50Var.f9169s;
        c50VarM3484a.f1106J = y50Var.f9170t;
        c50VarM3484a.f1119W = qh0.values()[y50Var.f9171u];
        c50VarM3484a.f1134q = y50Var.f9172v;
        c50VarM3484a.f1135r = y50Var.f9173w;
        c50VarM3484a.f1114R = y50Var.f9174x;
        this.f537c = c50VarM3484a;
        c50VarM3484a.f1128k = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        t50 t50Var = c50VarM3484a.f1099C;
        if (t50Var != null && (t50Var.f7288H || t50Var.f7289I)) {
            C0270h1.m2191g("Fragment already added and state has been saved");
            throw null;
        }
        c50VarM3484a.f1132o = bundle2;
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + c50VarM3484a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m417a() {
        boolean zM4691J = t50.m4691J(3);
        c50 c50Var = this.f537c;
        if (zM4691J) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + c50Var);
        }
        Bundle bundle = c50Var.f1128k;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        c50Var.f1101E.m4706P();
        c50Var.f1127j = 3;
        c50Var.f1110N = false;
        c50Var.mo873o();
        if (!c50Var.f1110N) {
            C0042ay.m525a(c50Var, " did not call through to super.onActivityCreated()");
            return;
        }
        if (t50.m4691J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + c50Var);
        }
        if (c50Var.f1112P != null) {
            Bundle bundle2 = c50Var.f1128k;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = c50Var.f1129l;
            if (sparseArray != null) {
                c50Var.f1112P.restoreHierarchyState(sparseArray);
                c50Var.f1129l = null;
            }
            c50Var.f1110N = false;
            c50Var.mo853A(bundle3);
            if (!c50Var.f1110N) {
                C0042ay.m525a(c50Var, " did not call through to super.onViewStateRestored()");
                return;
            } else if (c50Var.f1112P != null) {
                c50Var.f1121Y.m889e(ph0.ON_CREATE);
            }
        }
        c50Var.f1128k = null;
        t50 t50Var = c50Var.f1101E;
        t50Var.f7288H = false;
        t50Var.f7289I = false;
        t50Var.f7295O.f8094h = false;
        t50Var.m4741u(4);
        this.f535a.m1629l(c50Var, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m418b() {
        c50 c50Var;
        View view;
        View view2;
        c50 c50Var2 = this.f537c;
        View view3 = c50Var2.f1111O;
        while (true) {
            c50Var = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            c50 c50Var3 = tag instanceof c50 ? (c50) tag : null;
            if (c50Var3 != null) {
                c50Var = c50Var3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        c50 c50Var4 = c50Var2.f1102F;
        if (c50Var != null && c50Var != c50Var4) {
            int i = c50Var2.f1104H;
            z50 z50Var = a60.f42a;
            a60.m32b(new x50(c50Var2, "Attempting to nest fragment " + c50Var2 + " within the view of parent fragment " + c50Var + " via container with ID " + i + " without using parent's childFragmentManager"));
            a60.m31a(c50Var2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.f536b.f2334k;
        ViewGroup viewGroup = c50Var2.f1111O;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(c50Var2);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                c50 c50Var5 = (c50) arrayList.get(i2);
                if (c50Var5.f1111O == viewGroup && (view2 = c50Var5.f1112P) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                c50 c50Var6 = (c50) arrayList.get(iIndexOf);
                if (c50Var6.f1111O == viewGroup && (view = c50Var6.f1112P) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        c50Var2.f1111O.addView(c50Var2.f1112P, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    public final void m419c() {
        boolean zM4691J = t50.m4691J(3);
        c50 c50Var = this.f537c;
        if (zM4691J) {
            Log.d("FragmentManager", "moveto ATTACHED: " + c50Var);
        }
        c50 c50Var2 = c50Var.f1133p;
        C0028a c0028a = null;
        f71 f71Var = this.f536b;
        if (c50Var2 != null) {
            C0028a c0028a2 = (C0028a) ((HashMap) f71Var.f2335l).get(c50Var2.f1131n);
            if (c0028a2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(c50Var);
                c50 c50Var3 = c50Var.f1133p;
                sb.append(" declared target fragment ");
                sb.append(c50Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            c50Var.f1134q = c50Var.f1133p.f1131n;
            c50Var.f1133p = null;
            c0028a = c0028a2;
        } else {
            String str = c50Var.f1134q;
            if (str != null && (c0028a = (C0028a) ((HashMap) f71Var.f2335l).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(c50Var);
                sb2.append(" declared target fragment ");
                C0270h1.m2191g(AbstractC0024an.m285h(sb2, c50Var.f1134q, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (c0028a != null) {
            c0028a.m427k();
        }
        t50 t50Var = c50Var.f1099C;
        c50Var.f1100D = t50Var.f7319w;
        c50Var.f1102F = t50Var.f7321y;
        f50 f50Var = this.f535a;
        f50Var.m1637v(c50Var, false);
        ArrayList arrayList = c50Var.f1125c0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((z40) obj).m5858a();
        }
        arrayList.clear();
        c50Var.f1101E.m4719b(c50Var.f1100D, c50Var.mo863e(), c50Var);
        c50Var.f1127j = 0;
        c50Var.f1110N = false;
        c50Var.mo875q(c50Var.f1100D.f1952o);
        if (!c50Var.f1110N) {
            C0042ay.m525a(c50Var, " did not call through to super.onAttach()");
            return;
        }
        Iterator it = c50Var.f1099C.f7312p.iterator();
        while (it.hasNext()) {
            ((w50) it.next()).mo1364b();
        }
        t50 t50Var2 = c50Var.f1101E;
        t50Var2.f7288H = false;
        t50Var2.f7289I = false;
        t50Var2.f7295O.f8094h = false;
        t50Var2.m4741u(0);
        f50Var.m1630m(c50Var, false);
    }

    /* JADX INFO: renamed from: d */
    public final int m420d() {
        c50 c50Var = this.f537c;
        if (c50Var.f1099C == null) {
            return c50Var.f1127j;
        }
        int iMin = this.f539e;
        int iOrdinal = c50Var.f1119W.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (c50Var.f1140w) {
            boolean z = c50Var.f1141x;
            int i2 = this.f539e;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = c50Var.f1112P;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, c50Var.f1127j) : Math.min(iMin, 1);
            }
        }
        if (c50Var.f1142y && c50Var.f1111O == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!c50Var.f1137t) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = c50Var.f1111O;
        if (viewGroup != null) {
            C0443lr c0443lrM3276i = C0443lr.m3276i(viewGroup, c50Var.m868j());
            i91 i91VarM3283f = c0443lrM3276i.m3283f(c50Var);
            int i3 = i91VarM3283f != null ? i91VarM3283f.f3487b : 0;
            i91 i91VarM3284g = c0443lrM3276i.m3284g(c50Var);
            i = i91VarM3284g != null ? i91VarM3284g.f3487b : 0;
            int i4 = i3 == 0 ? -1 : j91.f3860a[AbstractC0024an.m292o(i3)];
            if (i4 != -1 && i4 != 1) {
                i = i3;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (c50Var.f1138u) {
            iMin = c50Var.m872n() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (c50Var.f1113Q && c50Var.f1127j < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (c50Var.f1139v) {
            iMin = Math.max(iMin, 3);
        }
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + c50Var);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public final void m421e() {
        Bundle bundle;
        boolean zM4691J = t50.m4691J(3);
        final c50 c50Var = this.f537c;
        if (zM4691J) {
            Log.d("FragmentManager", "moveto CREATED: " + c50Var);
        }
        Bundle bundle2 = c50Var.f1128k;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (c50Var.f1117U) {
            c50Var.f1127j = 1;
            Bundle bundle4 = c50Var.f1128k;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            c50Var.f1101E.m4711U(bundle);
            t50 t50Var = c50Var.f1101E;
            t50Var.f7288H = false;
            t50Var.f7289I = false;
            t50Var.f7295O.f8094h = false;
            t50Var.m4741u(1);
            return;
        }
        f50 f50Var = this.f535a;
        f50Var.m1639x(c50Var, false);
        c50Var.f1101E.m4706P();
        c50Var.f1127j = 1;
        c50Var.f1110N = false;
        c50Var.f1120X.m437a(new uh0() { // from class: androidx.fragment.app.Fragment$6
            @Override // p000.uh0
            /* JADX INFO: renamed from: d */
            public final void mo328d(yh0 yh0Var, ph0 ph0Var) {
                View view;
                if (ph0Var != ph0.ON_STOP || (view = c50Var.f1112P) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        c50Var.mo876r(bundle3);
        c50Var.f1117U = true;
        if (!c50Var.f1110N) {
            C0042ay.m525a(c50Var, " did not call through to super.onCreate()");
        } else {
            c50Var.f1120X.m440d(ph0.ON_CREATE);
            f50Var.m1631o(c50Var, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m422f() {
        String resourceName;
        c50 c50Var = this.f537c;
        if (c50Var.f1140w) {
            return;
        }
        if (t50.m4691J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + c50Var);
        }
        Bundle bundle = c50Var.f1128k;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterMo879u = c50Var.mo879u(bundle2);
        ViewGroup viewGroup2 = c50Var.f1111O;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = c50Var.f1104H;
            if (i != 0) {
                if (i == -1) {
                    C0042ay.m529f(c50Var, " for a container view with no id", "Cannot create fragment ");
                    return;
                }
                viewGroup = (ViewGroup) c50Var.f1099C.f7320x.mo24t(i);
                if (viewGroup == null) {
                    if (!c50Var.f1143z && !c50Var.f1142y) {
                        try {
                            resourceName = c50Var.m856D().getResources().getResourceName(c50Var.f1104H);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(c50Var.f1104H) + " (" + resourceName + ") for fragment " + c50Var);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    z50 z50Var = a60.f42a;
                    a60.m32b(new x50(c50Var, "Attempting to add fragment " + c50Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    a60.m31a(c50Var).getClass();
                }
            }
        }
        c50Var.f1111O = viewGroup;
        c50Var.mo854B(layoutInflaterMo879u, viewGroup, bundle2);
        if (c50Var.f1112P != null) {
            if (t50.m4691J(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + c50Var);
            }
            c50Var.f1112P.setSaveFromParentEnabled(false);
            c50Var.f1112P.setTag(R.id.fragment_container_view_tag, c50Var);
            if (viewGroup != null) {
                m418b();
            }
            if (c50Var.f1106J) {
                c50Var.f1112P.setVisibility(8);
            }
            boolean zIsAttachedToWindow = c50Var.f1112P.isAttachedToWindow();
            View view = c50Var.f1112P;
            if (zIsAttachedToWindow) {
                WeakHashMap weakHashMap = ai1.f194a;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0357jf(1, view));
            }
            Bundle bundle3 = c50Var.f1128k;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            c50Var.mo884z(c50Var.f1112P);
            c50Var.f1101E.m4741u(2);
            this.f535a.m1603F(c50Var, c50Var.f1112P, false);
            int visibility = c50Var.f1112P.getVisibility();
            c50Var.m864f().f724j = c50Var.f1112P.getAlpha();
            if (c50Var.f1111O != null && visibility == 0) {
                View viewFindFocus = c50Var.f1112P.findFocus();
                if (viewFindFocus != null) {
                    c50Var.m864f().f725k = viewFindFocus;
                    if (t50.m4691J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + c50Var);
                    }
                }
                c50Var.f1112P.setAlpha(0.0f);
            }
        }
        c50Var.f1127j = 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m423g() throws Exception {
        boolean z;
        c50 c50VarM1662h;
        boolean zM4691J = t50.m4691J(3);
        c50 c50Var = this.f537c;
        if (zM4691J) {
            Log.d("FragmentManager", "movefrom CREATED: " + c50Var);
        }
        int i = 0;
        boolean z2 = c50Var.f1138u && !c50Var.m872n();
        f71 f71Var = this.f536b;
        if (z2) {
            f71Var.m1676w(null, c50Var.f1131n);
        }
        if (!z2) {
            v50 v50Var = (v50) f71Var.f2337n;
            if (!((v50Var.f8089c.containsKey(c50Var.f1131n) && v50Var.f8092f) ? v50Var.f8093g : true)) {
                String str = c50Var.f1134q;
                if (str != null && (c50VarM1662h = f71Var.m1662h(str)) != null && c50VarM1662h.f1108L) {
                    c50Var.f1133p = c50VarM1662h;
                }
                c50Var.f1127j = 0;
                return;
            }
        }
        e50 e50Var = c50Var.f1100D;
        if (e50Var != null) {
            z = ((v50) f71Var.f2337n).f8093g;
        } else {
            AbstractActivityC0790v4 abstractActivityC0790v4 = e50Var.f1952o;
            z = abstractActivityC0790v4 != null ? !abstractActivityC0790v4.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((v50) f71Var.f2337n).m5073c(c50Var, false);
        }
        c50Var.f1101E.m4732l();
        c50Var.f1120X.m440d(ph0.ON_DESTROY);
        c50Var.f1127j = 0;
        c50Var.f1110N = false;
        c50Var.f1117U = false;
        c50Var.f1110N = true;
        if (!c50Var.f1110N) {
            C0042ay.m525a(c50Var, " did not call through to super.onDestroy()");
            return;
        }
        this.f535a.m1632p(c50Var, false);
        ArrayList arrayListM1665k = f71Var.m1665k();
        int size = arrayListM1665k.size();
        while (i < size) {
            Object obj = arrayListM1665k.get(i);
            i++;
            C0028a c0028a = (C0028a) obj;
            if (c0028a != null) {
                c50 c50Var2 = c0028a.f537c;
                if (c50Var.f1131n.equals(c50Var2.f1134q)) {
                    c50Var2.f1133p = c50Var;
                    c50Var2.f1134q = null;
                }
            }
        }
        String str2 = c50Var.f1134q;
        if (str2 != null) {
            c50Var.f1133p = f71Var.m1662h(str2);
        }
        f71Var.m1672s(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m424h() {
        View view;
        boolean zM4691J = t50.m4691J(3);
        c50 c50Var = this.f537c;
        if (zM4691J) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + c50Var);
        }
        ViewGroup viewGroup = c50Var.f1111O;
        if (viewGroup != null && (view = c50Var.f1112P) != null) {
            viewGroup.removeView(view);
        }
        c50Var.f1101E.m4741u(1);
        if (c50Var.f1112P != null && c50Var.f1121Y.mo862d().f551c.compareTo(qh0.f6499l) >= 0) {
            c50Var.f1121Y.m889e(ph0.ON_DESTROY);
        }
        c50Var.f1127j = 1;
        c50Var.f1110N = false;
        c50Var.mo877s();
        if (!c50Var.f1110N) {
            C0042ay.m525a(c50Var, " did not call through to super.onDestroyView()");
            return;
        }
        oq0 oq0Var = new oq0(c50Var.mo861c(), rj0.f6861d);
        String canonicalName = rj0.class.getCanonicalName();
        if (canonicalName == null) {
            C0270h1.m2190f("Local and anonymous classes can not be ViewModels");
            return;
        }
        g91 g91Var = ((rj0) oq0Var.m3733c(rj0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f6862c;
        if (g91Var.f2669l > 0) {
            g91Var.f2668k[0].getClass();
            dd0.m1158c();
            return;
        }
        c50Var.f1097A = false;
        this.f535a.m1605H(c50Var, false);
        c50Var.f1111O = null;
        c50Var.f1112P = null;
        c50Var.f1121Y = null;
        c50Var.f1122Z.m448e(null);
        c50Var.f1141x = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m425i() throws Exception {
        boolean zM4691J = t50.m4691J(3);
        c50 c50Var = this.f537c;
        if (zM4691J) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + c50Var);
        }
        c50Var.f1127j = -1;
        c50Var.f1110N = false;
        c50Var.mo878t();
        if (!c50Var.f1110N) {
            C0042ay.m525a(c50Var, " did not call through to super.onDetach()");
            return;
        }
        t50 t50Var = c50Var.f1101E;
        if (!t50Var.f7290J) {
            t50Var.m4732l();
            c50Var.f1101E = new t50();
        }
        this.f535a.m1634r(c50Var, false);
        c50Var.f1127j = -1;
        c50Var.f1100D = null;
        c50Var.f1102F = null;
        c50Var.f1099C = null;
        if (!c50Var.f1138u || c50Var.m872n()) {
            v50 v50Var = (v50) this.f536b.f2337n;
            if (!((v50Var.f8089c.containsKey(c50Var.f1131n) && v50Var.f8092f) ? v50Var.f8093g : true)) {
                return;
            }
        }
        if (t50.m4691J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + c50Var);
        }
        c50Var.m870l();
    }

    /* JADX INFO: renamed from: j */
    public final void m426j() {
        c50 c50Var = this.f537c;
        if (c50Var.f1140w && c50Var.f1141x && !c50Var.f1097A) {
            if (t50.m4691J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + c50Var);
            }
            Bundle bundle = c50Var.f1128k;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            c50Var.mo854B(c50Var.mo879u(bundle2), null, bundle2);
            View view = c50Var.f1112P;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                c50Var.f1112P.setTag(R.id.fragment_container_view_tag, c50Var);
                if (c50Var.f1106J) {
                    c50Var.f1112P.setVisibility(8);
                }
                Bundle bundle3 = c50Var.f1128k;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                c50Var.mo884z(c50Var.f1112P);
                c50Var.f1101E.m4741u(2);
                this.f535a.m1603F(c50Var, c50Var.f1112P, false);
                c50Var.f1127j = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m427k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        f71 f71Var = this.f536b;
        boolean z = this.f538d;
        c50 c50Var = this.f537c;
        if (z) {
            if (t50.m4691J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + c50Var);
                return;
            }
            return;
        }
        try {
            this.f538d = true;
            boolean z2 = false;
            while (true) {
                int iM420d = m420d();
                int i = c50Var.f1127j;
                int i2 = 3;
                if (iM420d == i) {
                    if (!z2 && i == -1 && c50Var.f1138u && !c50Var.m872n()) {
                        if (t50.m4691J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + c50Var);
                        }
                        ((v50) f71Var.f2337n).m5073c(c50Var, true);
                        f71Var.m1672s(this);
                        if (t50.m4691J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + c50Var);
                        }
                        c50Var.m870l();
                    }
                    if (c50Var.f1116T) {
                        if (c50Var.f1112P != null && (viewGroup = c50Var.f1111O) != null) {
                            C0443lr c0443lrM3276i = C0443lr.m3276i(viewGroup, c50Var.m868j());
                            if (c50Var.f1106J) {
                                if (t50.m4691J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c50Var);
                                }
                                c0443lrM3276i.m3281d(3, 1, this);
                            } else {
                                if (t50.m4691J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c50Var);
                                }
                                c0443lrM3276i.m3281d(2, 1, this);
                            }
                        }
                        t50 t50Var = c50Var.f1099C;
                        if (t50Var != null && c50Var.f1137t && t50.m4692K(c50Var)) {
                            t50Var.f7287G = true;
                        }
                        c50Var.f1116T = false;
                        c50Var.f1101E.m4735o();
                    }
                    this.f538d = false;
                    return;
                }
                if (iM420d <= i) {
                    switch (i - 1) {
                        case -1:
                            m425i();
                            break;
                        case 0:
                            m423g();
                            break;
                        case 1:
                            m424h();
                            c50Var.f1127j = 1;
                            break;
                        case 2:
                            c50Var.f1141x = false;
                            c50Var.f1127j = 2;
                            break;
                        case 3:
                            if (t50.m4691J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + c50Var);
                            }
                            if (c50Var.f1112P != null && c50Var.f1129l == null) {
                                m431o();
                            }
                            if (c50Var.f1112P != null && (viewGroup2 = c50Var.f1111O) != null) {
                                C0443lr c0443lrM3276i2 = C0443lr.m3276i(viewGroup2, c50Var.m868j());
                                if (t50.m4691J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c50Var);
                                }
                                c0443lrM3276i2.m3281d(1, 3, this);
                            }
                            c50Var.f1127j = 3;
                            break;
                        case 4:
                            m433q();
                            break;
                        case 5:
                            c50Var.f1127j = 5;
                            break;
                        case 6:
                            m428l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m419c();
                            break;
                        case 1:
                            m421e();
                            break;
                        case 2:
                            m426j();
                            m422f();
                            break;
                        case 3:
                            m417a();
                            break;
                        case 4:
                            if (c50Var.f1112P != null && (viewGroup3 = c50Var.f1111O) != null) {
                                C0443lr c0443lrM3276i3 = C0443lr.m3276i(viewGroup3, c50Var.m868j());
                                int visibility = c50Var.f1112P.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                if (t50.m4691J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c50Var);
                                }
                                c0443lrM3276i3.m3281d(i2, 2, this);
                            }
                            c50Var.f1127j = 4;
                            break;
                        case 5:
                            m432p();
                            break;
                        case 6:
                            c50Var.f1127j = 6;
                            break;
                        case 7:
                            m430n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.f538d = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m428l() {
        boolean zM4691J = t50.m4691J(3);
        c50 c50Var = this.f537c;
        if (zM4691J) {
            Log.d("FragmentManager", "movefrom RESUMED: " + c50Var);
        }
        c50Var.f1101E.m4741u(5);
        if (c50Var.f1112P != null) {
            c50Var.f1121Y.m889e(ph0.ON_PAUSE);
        }
        c50Var.f1120X.m440d(ph0.ON_PAUSE);
        c50Var.f1127j = 6;
        c50Var.f1110N = false;
        c50Var.mo880v();
        if (c50Var.f1110N) {
            this.f535a.m1635t(c50Var, false);
        } else {
            C0042ay.m525a(c50Var, " did not call through to super.onPause()");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m429m(ClassLoader classLoader) {
        c50 c50Var = this.f537c;
        Bundle bundle = c50Var.f1128k;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (c50Var.f1128k.getBundle("savedInstanceState") == null) {
            c50Var.f1128k.putBundle("savedInstanceState", new Bundle());
        }
        try {
            c50Var.f1129l = c50Var.f1128k.getSparseParcelableArray("viewState");
            c50Var.f1130m = c50Var.f1128k.getBundle("viewRegistryState");
            y50 y50Var = (y50) c50Var.f1128k.getParcelable("state");
            if (y50Var != null) {
                c50Var.f1134q = y50Var.f9172v;
                c50Var.f1135r = y50Var.f9173w;
                c50Var.f1114R = y50Var.f9174x;
            }
            if (c50Var.f1114R) {
                return;
            }
            c50Var.f1113Q = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + c50Var, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX INFO: renamed from: n */
    public final void m430n() {
        boolean zRequestFocus;
        String str;
        boolean zM4691J = t50.m4691J(3);
        c50 c50Var = this.f537c;
        if (zM4691J) {
            Log.d("FragmentManager", "moveto RESUMED: " + c50Var);
        }
        b50 b50Var = c50Var.f1115S;
        View view = b50Var == null ? null : b50Var.f725k;
        if (view != null) {
            if (view == c50Var.f1112P) {
                zRequestFocus = view.requestFocus();
                if (t50.m4691J(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(c50Var);
                    sb.append(" resulting in focused view ");
                    sb.append(c50Var.f1112P.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == c50Var.f1112P) {
                            zRequestFocus = view.requestFocus();
                            if (t50.m4691J(2)) {
                                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                                sb2.append(view);
                                sb2.append(" ");
                                if (zRequestFocus) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                sb2.append(str);
                                sb2.append(" on Fragment ");
                                sb2.append(c50Var);
                                sb2.append(" resulting in focused view ");
                                sb2.append(c50Var.f1112P.findFocus());
                                Log.v("FragmentManager", sb2.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        c50Var.m864f().f725k = null;
        c50Var.f1101E.m4706P();
        c50Var.f1101E.m4696A(true);
        c50Var.f1127j = 7;
        c50Var.f1110N = false;
        c50Var.f1110N = true;
        if (!c50Var.f1110N) {
            C0042ay.m525a(c50Var, " did not call through to super.onResume()");
            return;
        }
        C0030a c0030a = c50Var.f1120X;
        ph0 ph0Var = ph0.ON_RESUME;
        c0030a.m440d(ph0Var);
        if (c50Var.f1112P != null) {
            c50Var.f1121Y.f1153m.m440d(ph0Var);
        }
        t50 t50Var = c50Var.f1101E;
        t50Var.f7288H = false;
        t50Var.f7289I = false;
        t50Var.f7295O.f8094h = false;
        t50Var.m4741u(7);
        this.f535a.m1640y(c50Var, false);
        this.f536b.m1676w(null, c50Var.f1131n);
        c50Var.f1128k = null;
        c50Var.f1129l = null;
        c50Var.f1130m = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m431o() {
        c50 c50Var = this.f537c;
        if (c50Var.f1112P == null) {
            return;
        }
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + c50Var + " with view " + c50Var.f1112P);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        c50Var.f1112P.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            c50Var.f1129l = sparseArray;
        }
        Bundle bundle = new Bundle();
        c50Var.f1121Y.f1154n.m3359h(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        c50Var.f1130m = bundle;
    }

    /* JADX INFO: renamed from: p */
    public final void m432p() {
        boolean zM4691J = t50.m4691J(3);
        c50 c50Var = this.f537c;
        if (zM4691J) {
            Log.d("FragmentManager", "moveto STARTED: " + c50Var);
        }
        c50Var.f1101E.m4706P();
        c50Var.f1101E.m4696A(true);
        c50Var.f1127j = 5;
        c50Var.f1110N = false;
        c50Var.mo882x();
        if (!c50Var.f1110N) {
            C0042ay.m525a(c50Var, " did not call through to super.onStart()");
            return;
        }
        C0030a c0030a = c50Var.f1120X;
        ph0 ph0Var = ph0.ON_START;
        c0030a.m440d(ph0Var);
        if (c50Var.f1112P != null) {
            c50Var.f1121Y.f1153m.m440d(ph0Var);
        }
        t50 t50Var = c50Var.f1101E;
        t50Var.f7288H = false;
        t50Var.f7289I = false;
        t50Var.f7295O.f8094h = false;
        t50Var.m4741u(5);
        this.f535a.m1599B(c50Var, false);
    }

    /* JADX INFO: renamed from: q */
    public final void m433q() {
        boolean zM4691J = t50.m4691J(3);
        c50 c50Var = this.f537c;
        if (zM4691J) {
            Log.d("FragmentManager", "movefrom STARTED: " + c50Var);
        }
        t50 t50Var = c50Var.f1101E;
        t50Var.f7289I = true;
        t50Var.f7295O.f8094h = true;
        t50Var.m4741u(4);
        if (c50Var.f1112P != null) {
            c50Var.f1121Y.m889e(ph0.ON_STOP);
        }
        c50Var.f1120X.m440d(ph0.ON_STOP);
        c50Var.f1127j = 4;
        c50Var.f1110N = false;
        c50Var.mo883y();
        if (c50Var.f1110N) {
            this.f535a.m1602E(c50Var, false);
        } else {
            C0042ay.m525a(c50Var, " did not call through to super.onStop()");
        }
    }

    public C0028a(f50 f50Var, f71 f71Var, c50 c50Var) {
        this.f535a = f50Var;
        this.f536b = f71Var;
        this.f537c = c50Var;
    }

    public C0028a(f50 f50Var, f71 f71Var, c50 c50Var, Bundle bundle) {
        this.f535a = f50Var;
        this.f536b = f71Var;
        this.f537c = c50Var;
        c50Var.f1129l = null;
        c50Var.f1130m = null;
        c50Var.f1098B = 0;
        c50Var.f1141x = false;
        c50Var.f1137t = false;
        c50 c50Var2 = c50Var.f1133p;
        c50Var.f1134q = c50Var2 != null ? c50Var2.f1131n : null;
        c50Var.f1133p = null;
        c50Var.f1128k = bundle;
        c50Var.f1132o = bundle.getBundle("arguments");
    }
}
