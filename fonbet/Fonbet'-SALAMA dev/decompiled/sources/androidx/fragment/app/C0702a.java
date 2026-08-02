package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import k0.AbstractC1326d;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702a implements N {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9431a;

    /* renamed from: b, reason: collision with root package name */
    public int f9432b;

    /* renamed from: c, reason: collision with root package name */
    public int f9433c;

    /* renamed from: d, reason: collision with root package name */
    public int f9434d;

    /* renamed from: e, reason: collision with root package name */
    public int f9435e;

    /* renamed from: f, reason: collision with root package name */
    public int f9436f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9437g;

    /* renamed from: h, reason: collision with root package name */
    public String f9438h;

    /* renamed from: i, reason: collision with root package name */
    public int f9439i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public int f9440k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f9441l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f9442m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f9443n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9444o;

    /* renamed from: p, reason: collision with root package name */
    public final Q f9445p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9446q;

    /* renamed from: r, reason: collision with root package name */
    public int f9447r;

    public C0702a(Q q7) {
        q7.H();
        C0726z c0726z = q7.f9403v;
        if (c0726z != null) {
            c0726z.f9552b.getClassLoader();
        }
        this.f9431a = new ArrayList();
        this.f9444o = false;
        this.f9447r = -1;
        this.f9445p = q7;
    }

    @Override // androidx.fragment.app.N
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f9437g) {
            return true;
        }
        this.f9445p.f9386d.add(this);
        return true;
    }

    public final void b(W w7) {
        this.f9431a.add(w7);
        w7.f9422d = this.f9432b;
        w7.f9423e = this.f9433c;
        w7.f9424f = this.f9434d;
        w7.f9425g = this.f9435e;
    }

    public final void c(int i7) {
        if (this.f9437g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            ArrayList arrayList = this.f9431a;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                W w7 = (W) arrayList.get(i8);
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = w7.f9420b;
                if (abstractComponentCallbacksC0722v != null) {
                    abstractComponentCallbacksC0722v.f9512I += i7;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + w7.f9420b + " to " + w7.f9420b.f9512I);
                    }
                }
            }
        }
    }

    public final int d(boolean z4) {
        if (this.f9446q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new Y());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f9446q = true;
        boolean z7 = this.f9437g;
        Q q7 = this.f9445p;
        if (z7) {
            this.f9447r = q7.j.getAndIncrement();
        } else {
            this.f9447r = -1;
        }
        q7.y(this, z4);
        return this.f9447r;
    }

    public final void e(int i7, AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, String str) {
        String str2 = abstractComponentCallbacksC0722v.f9533b0;
        if (str2 != null) {
            AbstractC1326d.c(abstractComponentCallbacksC0722v, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0722v.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0722v.f9519P;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0722v + ": was " + abstractComponentCallbacksC0722v.f9519P + " now " + str);
            }
            abstractComponentCallbacksC0722v.f9519P = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0722v + " with tag " + str + " to container view with no id");
            }
            int i8 = abstractComponentCallbacksC0722v.f9517N;
            if (i8 != 0 && i8 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0722v + ": was " + abstractComponentCallbacksC0722v.f9517N + " now " + i7);
            }
            abstractComponentCallbacksC0722v.f9517N = i7;
            abstractComponentCallbacksC0722v.f9518O = i7;
        }
        b(new W(1, abstractComponentCallbacksC0722v));
        abstractComponentCallbacksC0722v.f9513J = this.f9445p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f9438h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f9447r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f9446q);
            if (this.f9436f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f9436f));
            }
            if (this.f9432b != 0 || this.f9433c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9432b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9433c));
            }
            if (this.f9434d != 0 || this.f9435e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9434d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9435e));
            }
            if (this.f9439i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9439i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.f9440k != 0 || this.f9441l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9440k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f9441l);
            }
        }
        ArrayList arrayList = this.f9431a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            W w7 = (W) arrayList.get(i7);
            switch (w7.f9419a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + w7.f9419a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(w7.f9420b);
            if (z4) {
                if (w7.f9422d != 0 || w7.f9423e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(w7.f9422d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(w7.f9423e));
                }
                if (w7.f9424f != 0 || w7.f9425g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(w7.f9424f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(w7.f9425g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f9447r >= 0) {
            sb.append(" #");
            sb.append(this.f9447r);
        }
        if (this.f9438h != null) {
            sb.append(" ");
            sb.append(this.f9438h);
        }
        sb.append("}");
        return sb.toString();
    }
}
