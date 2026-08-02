package p000;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e92 {

    /* JADX INFO: renamed from: a */
    public final String f2020a;

    /* JADX INFO: renamed from: b */
    public final ListenableFuture f2021b;

    /* JADX INFO: renamed from: c */
    public final i92 f2022c;

    /* JADX INFO: renamed from: d */
    public final w61 f2023d;

    /* JADX INFO: renamed from: e */
    public final g82 f2024e;

    /* JADX INFO: renamed from: f */
    public final cx0 f2025f;

    /* JADX INFO: renamed from: g */
    public final bx1 f2026g;

    /* JADX INFO: renamed from: h */
    public final Object f2027h = new Object();

    /* JADX INFO: renamed from: i */
    public final C0312i6 f2028i = new C0312i6(26);

    /* JADX INFO: renamed from: j */
    public ListenableFuture f2029j = null;

    public e92(String str, jc0 jc0Var, i92 i92Var, Executor executor, g82 g82Var, cx0 cx0Var, bx1 bx1Var) {
        this.f2020a = str;
        this.f2021b = k70.m2994e(jc0Var);
        this.f2022c = i92Var;
        this.f2023d = new w61(executor);
        this.f2024e = g82Var;
        this.f2025f = cx0Var;
        this.f2026g = bx1Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001d A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:13:0x0017, B:14:0x0019, B:16:0x001d, B:17:0x0035, B:18:0x0037), top: B:25:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: a */
    public final ListenableFuture m1394a(n72 n72Var, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.f2027h) {
            ListenableFuture listenableFuture2 = this.f2029j;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (this.f2029j == null) {
                    this.f2029j = k70.m2994e(this.f2028i.m2537B(ja2.m2841a(new c32(5, this)), this.f2023d));
                }
                listenableFuture = this.f2029j;
            } else {
                try {
                    k70.m2991b(this.f2029j);
                } catch (ExecutionException unused) {
                    this.f2029j = null;
                }
                if (this.f2029j == null) {
                    this.f2029j = k70.m2994e(this.f2028i.m2537B(ja2.m2841a(new c32(5, this)), this.f2023d));
                }
                listenableFuture = this.f2029j;
            }
            throw th;
        }
        return this.f2028i.m2537B(ja2.m2841a(new f71(this, listenableFuture, n72Var, executor, 18)), EnumC0113ct.f1449j);
    }

    /* JADX INFO: renamed from: b */
    public final do1 m1395b(Uri uri) throws IOException {
        i92 i92Var = this.f2022c;
        String str = this.f2020a;
        g82 g82Var = this.f2024e;
        try {
            try {
                bx1 bx1Var = this.f2026g;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                String string = sb.toString();
                bx1Var.getClass();
                aa2 aa2VarM796c = bx1.m796c(string);
                try {
                    InputStream inputStreamM3875t = p80.m3875t(g82Var.m2000b(uri));
                    try {
                        zo1 zo1VarM5821a = ((yo1) ((cq1) i92Var.f3498a.mo14s(7))).m5821a(inputStreamM3875t, i92Var.f3499b);
                        if (inputStreamM3875t != null) {
                            inputStreamM3875t.close();
                        }
                        aa2VarM796c.close();
                        return zo1VarM5821a;
                    } catch (Throwable th) {
                        if (inputStreamM3875t != null) {
                            try {
                                inputStreamM3875t.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        aa2VarM796c.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                e82 e82VarM2000b = g82Var.m2000b(uri);
                if (e82VarM2000b.f2013a.mo2566b(e82VarM2000b.f2016d)) {
                    throw e;
                }
                return i92Var.f3498a;
            }
        } catch (IOException e2) {
            throw a90.m139x(g82Var, uri, e2, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1396c(Uri uri, Object obj) throws IOException {
        String str = this.f2020a;
        g82 g82Var = this.f2024e;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            bx1 bx1Var = this.f2026g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            String string = sb.toString();
            bx1Var.getClass();
            aa2 aa2VarM796c = bx1.m796c(string);
            try {
                a81 a81Var = new a81(23);
                try {
                    e82 e82VarM2000b = g82Var.m2000b(uriBuild);
                    ArrayList arrayListM1386a = e82VarM2000b.m1386a(e82VarM2000b.f2013a.mo2567c(e82VarM2000b.f2016d));
                    new a81[]{a81Var}[0].m94r(arrayListM1386a);
                    OutputStream outputStream = (OutputStream) arrayListM1386a.get(0);
                    try {
                        ((do1) obj).m1275b(outputStream);
                        if (((q82) a81Var.f64l) == null) {
                            throw new C0287hi("Cannot sync underlying stream");
                        }
                        ((OutputStream) a81Var.f63k).flush();
                        ((q82) a81Var.f64l).f6417j.getFD().sync();
                        outputStream.close();
                        aa2VarM796c.close();
                        e82 e82VarM2000b2 = g82Var.m2000b(uriBuild);
                        e82 e82VarM2000b3 = g82Var.m2000b(uri);
                        w82 w82Var = e82VarM2000b2.f2013a;
                        if (w82Var != e82VarM2000b3.f2013a) {
                            throw new C0287hi("Cannot rename file across backends");
                        }
                        w82Var.mo2569e(e82VarM2000b2.f2016d, e82VarM2000b3.f2016d);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw a90.m139x(g82Var, uri, e, str);
                }
            } catch (Throwable th3) {
                try {
                    aa2VarM796c.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            e82 e82VarM2000b4 = g82Var.m2000b(uriBuild);
            if (e82VarM2000b4.f2013a.mo2566b(e82VarM2000b4.f2016d)) {
                try {
                    e82 e82VarM2000b5 = g82Var.m2000b(uriBuild);
                    e82VarM2000b5.f2013a.mo2568d(e82VarM2000b5.f2016d);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }
}
