package p000;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t80 extends Exception {

    /* JADX INFO: renamed from: o */
    public static final StackTraceElement[] f7343o = new StackTraceElement[0];

    /* JADX INFO: renamed from: j */
    public final List f7344j;

    /* JADX INFO: renamed from: k */
    public xg0 f7345k;

    /* JADX INFO: renamed from: l */
    public int f7346l;

    /* JADX INFO: renamed from: m */
    public Class f7347m;

    /* JADX INFO: renamed from: n */
    public final String f7348n;

    public t80(String str, List list) {
        this.f7348n = str;
        setStackTrace(f7343o);
        this.f7344j = list;
    }

    /* JADX INFO: renamed from: a */
    public static void m4759a(Throwable th, ArrayList arrayList) {
        if (th instanceof t80) {
            Iterator it = ((t80) th).f7344j.iterator();
            while (it.hasNext()) {
                m4759a((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4760b(List list, s80 s80Var) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            s80Var.append("Cause (");
            int i2 = i + 1;
            s80Var.append(String.valueOf(i2));
            s80Var.append(" of ");
            s80Var.append(String.valueOf(size));
            s80Var.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof t80) {
                ((t80) th).m4763e(s80Var);
            } else {
                m4761c(th, s80Var);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4761c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            dd0.m1163h(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4762d() {
        ArrayList arrayList = new ArrayList();
        m4759a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4763e(Appendable appendable) {
        m4761c(this, appendable);
        try {
            m4760b(this.f7344j, new s80(appendable));
        } catch (IOException e) {
            dd0.m1163h(e);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f7348n);
        String str2 = "";
        if (this.f7347m != null) {
            str = ", " + this.f7347m;
        } else {
            str = "";
        }
        sb.append(str);
        int i = this.f7346l;
        sb.append(i != 0 ? ", ".concat(AbstractC0024an.m293p(i)) : "");
        if (this.f7345k != null) {
            str2 = ", " + this.f7345k;
        }
        sb.append(str2);
        ArrayList arrayList = new ArrayList();
        m4759a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Throwable th = (Throwable) obj;
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        m4763e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m4763e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m4763e(printWriter);
    }

    public t80(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
