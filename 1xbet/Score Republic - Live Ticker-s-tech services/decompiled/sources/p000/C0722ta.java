package p000;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: ta */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0722ta implements q50 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7374a;

    /* JADX INFO: renamed from: b */
    public int f7375b;

    /* JADX INFO: renamed from: c */
    public int f7376c;

    /* JADX INFO: renamed from: d */
    public int f7377d;

    /* JADX INFO: renamed from: e */
    public int f7378e;

    /* JADX INFO: renamed from: f */
    public int f7379f;

    /* JADX INFO: renamed from: g */
    public boolean f7380g;

    /* JADX INFO: renamed from: h */
    public String f7381h;

    /* JADX INFO: renamed from: i */
    public int f7382i;

    /* JADX INFO: renamed from: j */
    public CharSequence f7383j;

    /* JADX INFO: renamed from: k */
    public int f7384k;

    /* JADX INFO: renamed from: l */
    public CharSequence f7385l;

    /* JADX INFO: renamed from: m */
    public ArrayList f7386m;

    /* JADX INFO: renamed from: n */
    public ArrayList f7387n;

    /* JADX INFO: renamed from: o */
    public boolean f7388o;

    /* JADX INFO: renamed from: p */
    public ArrayList f7389p;

    /* JADX INFO: renamed from: q */
    public final t50 f7390q;

    /* JADX INFO: renamed from: r */
    public boolean f7391r;

    /* JADX INFO: renamed from: s */
    public int f7392s;

    public C0722ta(t50 t50Var) {
        t50Var.m4701G();
        e50 e50Var = t50Var.f7319w;
        if (e50Var != null) {
            e50Var.f1952o.getClassLoader();
        }
        this.f7374a = new ArrayList();
        this.f7388o = false;
        this.f7392s = -1;
        this.f7390q = t50Var;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: a */
    public final boolean mo4037a(ArrayList arrayList, ArrayList arrayList2) {
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f7380g) {
            return true;
        }
        this.f7390q.f7300d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m4774b(b60 b60Var) {
        this.f7374a.add(b60Var);
        b60Var.f736d = this.f7375b;
        b60Var.f737e = this.f7376c;
        b60Var.f738f = this.f7377d;
        b60Var.f739g = this.f7378e;
    }

    /* JADX INFO: renamed from: c */
    public final void m4775c(int i) {
        if (this.f7380g) {
            if (t50.m4691J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f7374a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b60 b60Var = (b60) arrayList.get(i2);
                c50 c50Var = b60Var.f734b;
                if (c50Var != null) {
                    c50Var.f1098B += i;
                    if (t50.m4691J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + b60Var.f734b + " to " + b60Var.f734b.f1098B);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4776d() {
        ArrayList arrayList = this.f7374a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            b60 b60Var = (b60) arrayList.get(size);
            if (b60Var.f735c) {
                if (b60Var.f733a == 8) {
                    b60Var.f735c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = b60Var.f734b.f1104H;
                    b60Var.f733a = 2;
                    b60Var.f735c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        b60 b60Var2 = (b60) arrayList.get(i2);
                        if (b60Var2.f735c && b60Var2.f734b.f1104H == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m4777e(boolean z, boolean z2) {
        if (this.f7391r) {
            C0270h1.m2191g("commit already called");
            return 0;
        }
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new ik0());
            m4779g("  ", printWriter, true);
            printWriter.close();
        }
        this.f7391r = true;
        boolean z3 = this.f7380g;
        t50 t50Var = this.f7390q;
        if (z3) {
            this.f7392s = t50Var.f7307k.getAndIncrement();
        } else {
            this.f7392s = -1;
        }
        if (z2) {
            t50Var.m4745y(this, z);
        }
        return this.f7392s;
    }

    /* JADX INFO: renamed from: f */
    public final void m4778f(int i, c50 c50Var, String str) {
        String str2 = c50Var.f1118V;
        if (str2 != null) {
            a60.m33c(c50Var, str2);
        }
        Class<?> cls = c50Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            dd0.m1161f(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = c50Var.f1105I;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(c50Var);
                sb.append(": was ");
                C0270h1.m2191g(AbstractC0024an.m286i(sb, c50Var.f1105I, " now ", str));
                return;
            }
            c50Var.f1105I = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + c50Var + " with tag " + str + " to container view with no id");
            }
            int i2 = c50Var.f1103G;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(c50Var);
                int i3 = c50Var.f1103G;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            c50Var.f1103G = i;
            c50Var.f1104H = i;
        }
        m4774b(new b60(1, c50Var));
        c50Var.f1099C = this.f7390q;
    }

    /* JADX INFO: renamed from: g */
    public final void m4779g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f7381h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f7392s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f7391r);
            if (this.f7379f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f7379f));
            }
            if (this.f7375b != 0 || this.f7376c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7375b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7376c));
            }
            if (this.f7377d != 0 || this.f7378e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7377d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7378e));
            }
            if (this.f7382i != 0 || this.f7383j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7382i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f7383j);
            }
            if (this.f7384k != 0 || this.f7385l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7384k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f7385l);
            }
        }
        ArrayList arrayList = this.f7374a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b60 b60Var = (b60) arrayList.get(i);
            switch (b60Var.f733a) {
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
                    str2 = "cmd=" + b60Var.f733a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(b60Var.f734b);
            if (z) {
                if (b60Var.f736d != 0 || b60Var.f737e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(b60Var.f736d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(b60Var.f737e));
                }
                if (b60Var.f738f != 0 || b60Var.f739g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(b60Var.f738f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(b60Var.f739g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f7392s >= 0) {
            sb.append(" #");
            sb.append(this.f7392s);
        }
        if (this.f7381h != null) {
            sb.append(" ");
            sb.append(this.f7381h);
        }
        sb.append("}");
        return sb.toString();
    }
}
