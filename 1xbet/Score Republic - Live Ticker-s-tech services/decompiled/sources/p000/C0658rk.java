package p000;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: rk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0658rk extends RuntimeException {

    /* JADX INFO: renamed from: j */
    public final List f6863j;

    /* JADX INFO: renamed from: k */
    public final String f6864k;

    /* JADX INFO: renamed from: l */
    public C0694sj f6865l;

    public C0658rk(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof C0658rk) {
                    linkedHashSet.addAll(((C0658rk) th).f6863j);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            C0270h1.m2190f("errors is empty");
            throw null;
        }
        arrayList.addAll(linkedHashSet);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f6863j = listUnmodifiableList;
        this.f6864k = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    /* JADX INFO: renamed from: a */
    public static void m4360a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m4360a(sb, th.getCause(), "");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4361b(t22 t22Var) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f6863j) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m4360a(sb, th, "\t");
            i++;
        }
        t22Var.mo4105d(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f6865l == null) {
                C0694sj c0694sj = new C0694sj(1);
                HashSet hashSet = new HashSet();
                C0694sj c0694sj2 = c0694sj;
                for (Throwable runtimeException : this.f6863j) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        ArrayList arrayList = new ArrayList();
                        Throwable cause = runtimeException.getCause();
                        if (cause != null && cause != runtimeException) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            Throwable th = (Throwable) obj;
                            if (hashSet.contains(th)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            c0694sj2.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = c0694sj2.getCause();
                        if (cause3 != null && c0694sj2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                    break;
                                }
                                cause3 = cause4;
                            }
                            c0694sj2 = cause3;
                        }
                    }
                }
                this.f6865l = c0694sj;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6865l;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f6864k;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m4361b(new C0621qk(0, printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m4361b(new C0621qk(1, printWriter));
    }

    public C0658rk(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }
}
