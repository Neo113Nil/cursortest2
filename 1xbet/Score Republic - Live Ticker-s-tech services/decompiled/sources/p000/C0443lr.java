package p000;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0028a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: lr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0443lr {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f4883a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f4884b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4885c;

    /* JADX INFO: renamed from: d */
    public boolean f4886d;

    /* JADX INFO: renamed from: e */
    public boolean f4887e;

    /* JADX INFO: renamed from: f */
    public boolean f4888f;

    public C0443lr(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f4883a = viewGroup;
        this.f4884b = new ArrayList();
        this.f4885c = new ArrayList();
    }

    /* JADX INFO: renamed from: i */
    public static final C0443lr m3276i(ViewGroup viewGroup, t50 t50Var) {
        viewGroup.getClass();
        t50Var.getClass();
        t50Var.m4702H().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0443lr) {
            return (C0443lr) tag;
        }
        C0443lr c0443lr = new C0443lr(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0443lr);
        return c0443lr;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m3277j(ArrayList arrayList) {
        boolean z;
        h91 h91Var;
        int size = arrayList.size();
        int i = 0;
        loop0: while (true) {
            z = true;
            while (true) {
                if (i >= size) {
                    break loop0;
                }
                Object obj = arrayList.get(i);
                i++;
                i91 i91Var = (i91) obj;
                if (!i91Var.f3496k.isEmpty()) {
                    ArrayList arrayList2 = i91Var.f3496k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    do {
                        if (i2 >= size2) {
                            break;
                        }
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        h91Var = (h91) obj2;
                        h91Var.getClass();
                    } while (h91Var instanceof C0296hr);
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList.get(i3);
                i3++;
                AbstractC0693si.m4526s(arrayList3, ((i91) obj3).f3496k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3278a(i91 i91Var) {
        i91Var.getClass();
        if (i91Var.f3494i) {
            j11.m2766a(i91Var.f3486a, i91Var.f3488c.m857E(), this.f4883a);
            i91Var.f3494i = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3279b(ArrayList arrayList, boolean z) {
        Object obj;
        Object obj2;
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            obj = null;
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            i++;
            i91 i91Var = (i91) obj2;
            View view = i91Var.f3488c.f1112P;
            view.getClass();
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        C0270h1.m2190f(j11.m2773h("Unknown visibility ", visibility));
                        return;
                    }
                } else if (i91Var.f3486a != 2) {
                    break;
                }
            }
        }
        i91 i91Var2 = (i91) obj2;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            i91 i91Var3 = (i91) objPrevious;
            View view2 = i91Var3.f3488c.f1112P;
            view2.getClass();
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    C0270h1.m2190f(j11.m2773h("Unknown visibility ", visibility2));
                    return;
                }
            }
            if (i91Var3.f3486a == 2) {
                obj = objPrevious;
                break;
            }
        }
        i91 i91Var4 = (i91) obj;
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Executing operations from " + i91Var2 + " to " + i91Var4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        c50 c50Var = ((i91) arrayList.get(arrayList.size() - 1)).f3488c;
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj3 = arrayList.get(i2);
            i2++;
            b50 b50Var = ((i91) obj3).f3488c.f1115S;
            b50 b50Var2 = c50Var.f1115S;
            b50Var.f716b = b50Var2.f716b;
            b50Var.f717c = b50Var2.f717c;
            b50Var.f718d = b50Var2.f718d;
            b50Var.f719e = b50Var2.f719e;
        }
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj4 = arrayList.get(i3);
            i3++;
            i91 i91Var5 = (i91) obj4;
            arrayList2.add(new C0221fr(i91Var5, z));
            boolean z2 = !z ? i91Var5 != i91Var4 : i91Var5 != i91Var2;
            c50 c50Var2 = i91Var5.f3488c;
            C0406kr c0406kr = new C0406kr(i91Var5);
            if (i91Var5.f3486a == 2) {
                if (z) {
                    b50 b50Var3 = c50Var2.f1115S;
                } else {
                    c50Var2.getClass();
                }
            } else if (z) {
                b50 b50Var4 = c50Var2.f1115S;
            } else {
                c50Var2.getClass();
            }
            if (i91Var5.f3486a == 2) {
                if (z) {
                    b50 b50Var5 = c50Var2.f1115S;
                } else {
                    b50 b50Var6 = c50Var2.f1115S;
                }
            }
            if (z2) {
                if (z) {
                    b50 b50Var7 = c50Var2.f1115S;
                } else {
                    c50Var2.getClass();
                }
            }
            arrayList3.add(c0406kr);
            i91Var5.f3489d.add(new RunnableC0111cr(this, i91Var5, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        int i4 = 0;
        while (i4 < size4) {
            Object obj5 = arrayList3.get(i4);
            i4++;
            if (!((C0406kr) obj5).m4575k()) {
                arrayList4.add(obj5);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList4.size();
        int i5 = 0;
        while (i5 < size5) {
            Object obj6 = arrayList4.get(i5);
            i5++;
            ((C0406kr) obj6).getClass();
        }
        int size6 = arrayList5.size();
        int i6 = 0;
        while (i6 < size6) {
            Object obj7 = arrayList5.get(i6);
            i6++;
            ((C0406kr) obj7).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        int size7 = arrayList2.size();
        int i7 = 0;
        while (i7 < size7) {
            Object obj8 = arrayList2.get(i7);
            i7++;
            AbstractC0693si.m4526s(arrayList7, ((i91) ((C0221fr) obj8).f7192j).f3496k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        int size8 = arrayList2.size();
        int i8 = 0;
        boolean z3 = false;
        while (i8 < size8) {
            Object obj9 = arrayList2.get(i8);
            i8++;
            C0221fr c0221fr = (C0221fr) obj9;
            Context context = this.f4883a.getContext();
            i91 i91Var6 = (i91) c0221fr.f7192j;
            context.getClass();
            f50 f50VarM1886B = c0221fr.m1886B(context);
            if (f50VarM1886B != null) {
                if (((AnimatorSet) f50VarM1886B.f2314l) == null) {
                    arrayList6.add(c0221fr);
                } else {
                    c50 c50Var3 = i91Var6.f3488c;
                    if (i91Var6.f3496k.isEmpty()) {
                        if (i91Var6.f3486a == 3) {
                            i91Var6.f3494i = false;
                        }
                        i91Var6.f3495j.add(new C0296hr(c0221fr));
                        z3 = true;
                    } else if (t50.m4691J(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + c50Var3 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int size9 = arrayList6.size();
        int i9 = 0;
        while (i9 < size9) {
            Object obj10 = arrayList6.get(i9);
            i9++;
            C0221fr c0221fr2 = (C0221fr) obj10;
            i91 i91Var7 = (i91) c0221fr2.f7192j;
            c50 c50Var4 = i91Var7.f3488c;
            if (zIsEmpty) {
                if (!z3) {
                    i91Var7.f3495j.add(new C0184er(c0221fr2));
                } else if (t50.m4691J(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + c50Var4 + " as Animations cannot run alongside Animators.");
                }
            } else if (t50.m4691J(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + c50Var4 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3280c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0693si.m4526s(arrayList, ((i91) it.next()).f3496k);
        }
        List listM3389w = AbstractC0471mi.m3389w(AbstractC0471mi.m3390x(arrayList));
        int size = listM3389w.size();
        for (int i = 0; i < size; i++) {
            ((h91) listM3389w.get(i)).mo1497b(this.f4883a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m3278a((i91) list.get(i2));
        }
        List listM3389w2 = AbstractC0471mi.m3389w(list);
        int size3 = listM3389w2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            i91 i91Var = (i91) listM3389w2.get(i3);
            if (i91Var.f3496k.isEmpty()) {
                i91Var.m2577b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3281d(int i, int i2, C0028a c0028a) {
        synchronized (this.f4884b) {
            try {
                c50 c50Var = c0028a.f537c;
                c50Var.getClass();
                i91 i91VarM3283f = m3283f(c50Var);
                if (i91VarM3283f == null) {
                    c50 c50Var2 = c0028a.f537c;
                    i91VarM3283f = (c50Var2.f1139v || c50Var2.f1138u) ? m3284g(c50Var2) : null;
                }
                if (i91VarM3283f != null) {
                    i91VarM3283f.m2579d(i, i2);
                    return;
                }
                i91 i91Var = new i91(i, i2, c0028a);
                this.f4884b.add(i91Var);
                i91Var.f3489d.add(new RunnableC0111cr(this, i91Var, 1));
                i91Var.f3489d.add(new RunnableC0111cr(this, i91Var, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3282e() {
        boolean z;
        if (this.f4888f) {
            return;
        }
        if (!this.f4883a.isAttachedToWindow()) {
            m3285h();
            this.f4887e = false;
            return;
        }
        synchronized (this.f4884b) {
            try {
                ArrayList arrayList = this.f4885c;
                arrayList.getClass();
                ArrayList arrayList2 = new ArrayList(arrayList);
                this.f4885c.clear();
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i);
                    i++;
                    i91 i91Var = (i91) obj;
                    if (this.f4884b.isEmpty() || !i91Var.f3488c.f1139v) {
                        z = false;
                    }
                    i91Var.f3492g = z;
                }
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    i91 i91Var2 = (i91) obj2;
                    if (this.f4886d) {
                        if (t50.m4691J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + i91Var2);
                        }
                        i91Var2.m2577b();
                    } else {
                        if (t50.m4691J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + i91Var2);
                        }
                        i91Var2.m2576a(this.f4883a);
                    }
                    this.f4886d = false;
                    if (!i91Var2.f3491f) {
                        this.f4885c.add(i91Var2);
                    }
                }
                if (!this.f4884b.isEmpty()) {
                    m3287l();
                    ArrayList arrayList3 = this.f4884b;
                    arrayList3.getClass();
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    if (arrayList4.isEmpty()) {
                        return;
                    }
                    this.f4884b.clear();
                    this.f4885c.addAll(arrayList4);
                    if (t50.m4691J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    m3279b(arrayList4, this.f4887e);
                    boolean zM3277j = m3277j(arrayList4);
                    int size3 = arrayList4.size();
                    int i3 = 0;
                    boolean z2 = true;
                    while (i3 < size3) {
                        Object obj3 = arrayList4.get(i3);
                        i3++;
                        if (!((i91) obj3).f3488c.f1139v) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zM3277j) {
                        z = false;
                    }
                    this.f4886d = z;
                    if (t50.m4691J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zM3277j + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        m3286k(arrayList4);
                        m3280c(arrayList4);
                    } else if (zM3277j) {
                        m3286k(arrayList4);
                        int size4 = arrayList4.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            m3278a((i91) arrayList4.get(i4));
                        }
                    }
                    this.f4887e = false;
                    if (t50.m4691J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final i91 m3283f(c50 c50Var) {
        Object obj;
        ArrayList arrayList = this.f4884b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            i91 i91Var = (i91) obj;
            if (af0.m187a(i91Var.f3488c, c50Var) && !i91Var.f3490e) {
                return (i91) obj;
            }
        }
        obj = null;
        return (i91) obj;
    }

    /* JADX INFO: renamed from: g */
    public final i91 m3284g(c50 c50Var) {
        Object obj;
        ArrayList arrayList = this.f4885c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            i91 i91Var = (i91) obj;
            if (af0.m187a(i91Var.f3488c, c50Var) && !i91Var.f3490e) {
                return (i91) obj;
            }
        }
        obj = null;
        return (i91) obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m3285h() {
        String str;
        String str2;
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f4883a.isAttachedToWindow();
        synchronized (this.f4884b) {
            try {
                m3287l();
                m3286k(this.f4884b);
                ArrayList arrayList = this.f4885c;
                arrayList.getClass();
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    ((i91) obj).f3492g = false;
                }
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    i91 i91Var = (i91) obj2;
                    if (t50.m4691J(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f4883a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + i91Var);
                    }
                    i91Var.m2576a(this.f4883a);
                }
                ArrayList arrayList3 = this.f4884b;
                arrayList3.getClass();
                ArrayList arrayList4 = new ArrayList(arrayList3);
                int size3 = arrayList4.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList4.get(i4);
                    i4++;
                    ((i91) obj3).f3492g = false;
                }
                int size4 = arrayList4.size();
                while (i < size4) {
                    Object obj4 = arrayList4.get(i);
                    i++;
                    i91 i91Var2 = (i91) obj4;
                    if (t50.m4691J(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f4883a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + i91Var2);
                    }
                    i91Var2.m2576a(this.f4883a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3286k(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            i91 i91Var = (i91) list.get(i);
            C0028a c0028a = i91Var.f3497l;
            if (!i91Var.f3493h) {
                i91Var.f3493h = true;
                int i2 = i91Var.f3487b;
                if (i2 == 2) {
                    c50 c50Var = c0028a.f537c;
                    c50Var.getClass();
                    View viewFindFocus = c50Var.f1112P.findFocus();
                    if (viewFindFocus != null) {
                        c50Var.m864f().f725k = viewFindFocus;
                        if (t50.m4691J(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + c50Var);
                        }
                    }
                    View viewM857E = i91Var.f3488c.m857E();
                    if (viewM857E.getParent() == null) {
                        if (t50.m4691J(2)) {
                            Log.v("FragmentManager", "Adding fragment " + c50Var + " view " + viewM857E + " to container in onStart");
                        }
                        c0028a.m418b();
                        viewM857E.setAlpha(0.0f);
                    }
                    if (viewM857E.getAlpha() == 0.0f && viewM857E.getVisibility() == 0) {
                        if (t50.m4691J(2)) {
                            Log.v("FragmentManager", "Making view " + viewM857E + " INVISIBLE in onStart");
                        }
                        viewM857E.setVisibility(4);
                    }
                    b50 b50Var = c50Var.f1115S;
                    viewM857E.setAlpha(b50Var == null ? 1.0f : b50Var.f724j);
                    if (t50.m4691J(2)) {
                        StringBuilder sb = new StringBuilder("Setting view alpha to ");
                        b50 b50Var2 = c50Var.f1115S;
                        sb.append(b50Var2 != null ? b50Var2.f724j : 1.0f);
                        sb.append(" in onStart");
                        Log.v("FragmentManager", sb.toString());
                    }
                } else if (i2 == 3) {
                    c50 c50Var2 = c0028a.f537c;
                    c50Var2.getClass();
                    View viewM857E2 = c50Var2.m857E();
                    if (t50.m4691J(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewM857E2.findFocus() + " on view " + viewM857E2 + " for Fragment " + c50Var2);
                    }
                    viewM857E2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0693si.m4526s(arrayList, ((i91) it.next()).f3496k);
        }
        List listM3389w = AbstractC0471mi.m3389w(AbstractC0471mi.m3390x(arrayList));
        int size2 = listM3389w.size();
        for (int i3 = 0; i3 < size2; i3++) {
            h91 h91Var = (h91) listM3389w.get(i3);
            h91Var.getClass();
            ViewGroup viewGroup = this.f4883a;
            viewGroup.getClass();
            if (!h91Var.f3132a) {
                h91Var.mo2242d(viewGroup);
            }
            h91Var.f3132a = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3287l() {
        ArrayList arrayList = this.f4884b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i91 i91Var = (i91) obj;
            int i2 = 2;
            if (i91Var.f3487b == 2) {
                int visibility = i91Var.f3488c.m857E().getVisibility();
                if (visibility != 0) {
                    i2 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            C0270h1.m2190f(j11.m2773h("Unknown visibility ", visibility));
                            return;
                        }
                        i2 = 3;
                    }
                }
                i91Var.m2579d(i2, 1);
            }
        }
    }
}
