package l3;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17800a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f17801b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17802c;

    /* renamed from: d, reason: collision with root package name */
    public int f17803d;

    /* renamed from: e, reason: collision with root package name */
    public Object f17804e;

    public /* synthetic */ j() {
    }

    public j a() {
        if (((i) this.f17804e) != null) {
            return new j(this, (j3.d[]) this.f17801b, this.f17802c, this.f17803d);
        }
        throw new IllegalArgumentException("execute parameter required");
    }

    public int b(boolean z3) {
        String str;
        if (this.f17802c) {
            throw new IllegalStateException("commit already called");
        }
        if (T2.r.j(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new z1.g());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f17803d);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f17802c);
            ArrayList arrayList = (ArrayList) this.f17804e;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    z1.f fVar = (z1.f) arrayList.get(i);
                    switch (fVar.f21898a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + fVar.f21898a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(fVar.f21899b);
                    if (fVar.f21900c != 0 || fVar.f21901d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(fVar.f21900c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(fVar.f21901d));
                    }
                    if (fVar.f21902e != 0 || fVar.f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(fVar.f21902e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(fVar.f));
                    }
                }
            }
            printWriter.close();
        }
        this.f17802c = true;
        T2.r rVar = (T2.r) this.f17801b;
        this.f17803d = -1;
        if (!z3) {
            rVar.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (((ArrayList) rVar.f5739c)) {
            if (!z3) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.f17803d;
    }

    public String toString() {
        switch (this.f17800a) {
            case 2:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f17803d >= 0) {
                    sb.append(" #");
                    sb.append(this.f17803d);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public j(j jVar, j3.d[] dVarArr, boolean z3, int i) {
        this.f17804e = jVar;
        this.f17801b = dVarArr;
        boolean z5 = false;
        if (dVarArr != null && z3) {
            z5 = true;
        }
        this.f17802c = z5;
        this.f17803d = i;
    }

    public j(T2.r rVar) {
        rVar.getClass();
        this.f17804e = new ArrayList();
        this.f17803d = -1;
        this.f17801b = rVar;
    }
}
