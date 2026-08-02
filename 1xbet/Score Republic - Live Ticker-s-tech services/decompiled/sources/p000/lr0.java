package p000;

import android.util.Log;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import live.football.scorerepublic.WebViewFragment;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lr0 {

    /* JADX INFO: renamed from: a */
    public f71 f4889a;

    /* JADX INFO: renamed from: b */
    public boolean f4890b;

    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x010b A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0140, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final void m3288a() {
        ArrayList arrayList;
        int size;
        int i;
        ArrayList arrayList2;
        int size2;
        int i2;
        c50 c50Var;
        c50 c50Var2;
        WebView webView;
        f71 f71Var = this.f4889a;
        if (f71Var == null) {
            C0270h1.m2191g("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f4890b) {
            f71Var.m1660f(this, null);
        }
        mr0 mr0Var = (mr0) f71Var.f2335l;
        C0468mf c0468mf = (C0468mf) f71Var.f2334k;
        mr0Var.getClass();
        if (equals(mr0Var.f5143h) && -1 == mr0Var.f5142g) {
            bu0 bu0VarM3428c = mr0Var.f5141f;
            if (bu0VarM3428c == null) {
                bu0VarM3428c = mr0Var.m3428c(-1);
            }
            mr0Var.f5141f = null;
            mr0Var.f5142g = 0;
            mr0Var.f5143h = null;
            if (bu0VarM3428c != null) {
                l50 l50Var = bu0VarM3428c.f990d;
                switch (l50Var.f4682d) {
                    case 0:
                        t50 t50Var = (t50) l50Var.f4683e;
                        if (t50.m4691J(3)) {
                            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + t50Var);
                        }
                        l50 l50Var2 = t50Var.f7306j;
                        ArrayList arrayList3 = t50Var.f7310n;
                        t50Var.f7305i = true;
                        t50Var.m4696A(true);
                        t50Var.f7305i = false;
                        if (t50Var.f7304h != null) {
                            if (arrayList3.isEmpty()) {
                                arrayList = t50Var.f7304h.f7374a;
                                size = arrayList.size();
                                i = 0;
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    c50Var2 = ((b60) obj).f734b;
                                    if (c50Var2 != null) {
                                        c50Var2.f1139v = false;
                                    }
                                }
                                while (r5.hasNext()) {
                                    ArrayList arrayList4 = c0443lr.f4885c;
                                    if (t50.m4691J(3)) {
                                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                                    }
                                    c0443lr.m3286k(arrayList4);
                                    c0443lr.m3280c(arrayList4);
                                }
                                arrayList2 = t50Var.f7304h.f7374a;
                                size2 = arrayList2.size();
                                i2 = 0;
                                while (i2 < size2) {
                                    Object obj2 = arrayList2.get(i2);
                                    i2++;
                                    c50Var = ((b60) obj2).f734b;
                                    if (c50Var == null) {
                                    }
                                }
                                t50Var.f7304h = null;
                                t50Var.m4725e0();
                                if (t50.m4691J(3)) {
                                    Log.d("FragmentManager", "Op is being set to null");
                                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + l50Var2.f4680b + " for  FragmentManager " + t50Var);
                                }
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet(t50.m4690E(t50Var.f7304h));
                                int size3 = arrayList3.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size3) {
                                        arrayList = t50Var.f7304h.f7374a;
                                        size = arrayList.size();
                                        i = 0;
                                        while (i < size) {
                                            Object obj3 = arrayList.get(i);
                                            i++;
                                            c50Var2 = ((b60) obj3).f734b;
                                            if (c50Var2 != null) {
                                                c50Var2.f1139v = false;
                                            }
                                        }
                                        for (C0443lr c0443lr : t50Var.m4726f(new ArrayList(Collections.singletonList(t50Var.f7304h)), 0, 1)) {
                                            ArrayList arrayList5 = c0443lr.f4885c;
                                            if (t50.m4691J(3)) {
                                                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                                            }
                                            c0443lr.m3286k(arrayList5);
                                            c0443lr.m3280c(arrayList5);
                                        }
                                        arrayList2 = t50Var.f7304h.f7374a;
                                        size2 = arrayList2.size();
                                        i2 = 0;
                                        while (i2 < size2) {
                                            Object obj4 = arrayList2.get(i2);
                                            i2++;
                                            c50Var = ((b60) obj4).f734b;
                                            if (c50Var == null && c50Var.f1111O == null) {
                                                t50Var.m4727g(c50Var).m427k();
                                            }
                                        }
                                        t50Var.f7304h = null;
                                        t50Var.m4725e0();
                                        if (t50.m4691J(3)) {
                                            Log.d("FragmentManager", "Op is being set to null");
                                            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + l50Var2.f4680b + " for  FragmentManager " + t50Var);
                                        }
                                    } else {
                                        Object obj5 = arrayList3.get(i3);
                                        i3++;
                                        if (obj5 != null) {
                                            dd0.m1158c();
                                        } else {
                                            Iterator it = linkedHashSet.iterator();
                                            if (it.hasNext()) {
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (l50Var2.f4680b) {
                            if (t50.m4691J(3)) {
                                Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                            }
                            t50Var.m4707Q();
                        } else {
                            if (t50.m4691J(3)) {
                                Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                            }
                            ((eu0) t50Var.f7303g.f2875b.m2847a()).m3288a();
                        }
                        break;
                    default:
                        WebViewFragment webViewFragment = (WebViewFragment) l50Var.f4683e;
                        WebView webView2 = webViewFragment.f4813h0;
                        if (webView2 != null && webView2.canGoBack() && (webView = webViewFragment.f4813h0) != null) {
                            webView.goBack();
                        }
                        break;
                }
            } else {
                ((gu0) c0468mf.f5033k).f2874a.run();
            }
            da1 da1Var = mr0Var.f5136a;
            nr0 nr0Var = nr0.f5506j;
            da1Var.getClass();
            da1Var.m1143m0(null, nr0Var);
        }
        this.f4890b = false;
    }

    /* JADX INFO: renamed from: b */
    public void mo484b(boolean z) {
    }
}
