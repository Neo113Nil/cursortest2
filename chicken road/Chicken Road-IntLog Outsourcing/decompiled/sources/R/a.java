package R;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2567a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2568b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2569c;

    /* renamed from: d, reason: collision with root package name */
    public int f2570d;

    public a(m mVar) {
        mVar.getClass();
        this.f2567a = new ArrayList();
        this.f2570d = -1;
        this.f2568b = mVar;
    }

    public final int a(boolean z) {
        String str;
        if (this.f2569c) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new q());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2570d);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2569c);
            ArrayList arrayList = this.f2567a;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    p pVar = (p) arrayList.get(i2);
                    switch (pVar.f2606a) {
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
                            str = "cmd=" + pVar.f2606a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(pVar.f2607b);
                    if (pVar.f2608c != 0 || pVar.f2609d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(pVar.f2608c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(pVar.f2609d));
                    }
                    if (pVar.f2610e != 0 || pVar.f2611f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(pVar.f2610e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(pVar.f2611f));
                    }
                }
            }
            printWriter.close();
        }
        this.f2569c = true;
        m mVar = this.f2568b;
        this.f2570d = -1;
        if (!z) {
            mVar.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (mVar.f2597a) {
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.f2570d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2570d >= 0) {
            sb.append(" #");
            sb.append(this.f2570d);
        }
        sb.append("}");
        return sb.toString();
    }
}
