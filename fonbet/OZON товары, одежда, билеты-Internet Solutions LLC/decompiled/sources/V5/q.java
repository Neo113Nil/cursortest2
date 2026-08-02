package V5;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private static final StackTraceElement[] f28281f = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    private final List<Throwable> f28282a;

    /* renamed from: b, reason: collision with root package name */
    private T5.f f28283b;

    /* renamed from: c, reason: collision with root package name */
    private T5.a f28284c;

    /* renamed from: d, reason: collision with root package name */
    private Class<?> f28285d;

    /* renamed from: e, reason: collision with root package name */
    private String f28286e;

    public q(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    private static void a(Throwable th2, ArrayList arrayList) {
        if (!(th2 instanceof q)) {
            arrayList.add(th2);
            return;
        }
        Iterator<Throwable> it = ((q) th2).f28282a.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            a aVar = (a) appendable;
            aVar.append("Cause (");
            int i12 = i11 + 1;
            aVar.append(String.valueOf(i12));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th2 = list.get(i11);
            if (th2 instanceof q) {
                ((q) th2).g(aVar);
            } else {
                d(th2, aVar);
            }
            i11 = i12;
        }
    }

    private static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void g(Appendable appendable) {
        d(this, appendable);
        try {
            b(this.f28282a, new a(appendable));
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final List<Throwable> e() {
        return this.f28282a;
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i11));
            i11 = i12;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f28286e);
        String str3 = "";
        if (this.f28285d != null) {
            str = ", " + this.f28285d;
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f28284c != null) {
            str2 = ", " + this.f28284c;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        if (this.f28283b != null) {
            str3 = ", " + this.f28283b;
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    final void h(T5.f fVar, T5.a aVar, Class<?> cls) {
        this.f28283b = fVar;
        this.f28284c = aVar;
        this.f28285d = cls;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        g(System.err);
    }

    public q(String str, List<Throwable> list) {
        this.f28286e = str;
        setStackTrace(f28281f);
        this.f28282a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        g(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        g(printWriter);
    }

    /* loaded from: classes8.dex */
    private static final class a implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f28287a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28288b = true;

        a(Appendable appendable) {
            this.f28287a = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c11) throws IOException {
            boolean z11 = this.f28288b;
            Appendable appendable = this.f28287a;
            if (z11) {
                this.f28288b = false;
                appendable.append("  ");
            }
            this.f28288b = c11 == '\n';
            appendable.append(c11);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i11, int i12) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z11 = this.f28288b;
            Appendable appendable = this.f28287a;
            boolean z12 = false;
            if (z11) {
                this.f28288b = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i12 - 1) == '\n') {
                z12 = true;
            }
            this.f28288b = z12;
            appendable.append(charSequence, i11, i12);
            return this;
        }
    }
}
