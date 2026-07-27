package K;

import android.os.Build;
import d2.C0279i;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class X implements InterfaceC0034b {

    /* renamed from: a, reason: collision with root package name */
    public final File f814a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f815b;

    /* renamed from: c, reason: collision with root package name */
    public final T f816c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f817d;

    /* renamed from: e, reason: collision with root package name */
    public final E2.d f818e;

    public X(File file, i0 coordinator, T t3) {
        kotlin.jvm.internal.j.e(coordinator, "coordinator");
        this.f814a = file;
        this.f815b = coordinator;
        this.f816c = t3;
        this.f817d = new AtomicBoolean(false);
        this.f818e = new E2.d();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|39|40|(1:42)(1:43))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|56|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0079, blocks: (B:21:0x0078, B:28:0x008b, B:31:0x0088, B:27:0x0083), top: B:7:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [K.X] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [K.V, i2.b] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [K.X] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [K.r] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r rVar, AbstractC0343b abstractC0343b) {
        ?? r02;
        int i3;
        Throwable th;
        Q q3;
        boolean z3;
        X x3;
        try {
            if (abstractC0343b instanceof V) {
                V v3 = (V) abstractC0343b;
                int i4 = v3.f807i;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    v3.f807i = i4 - Integer.MIN_VALUE;
                    r02 = v3;
                    Object obj = r02.f805g;
                    EnumC0326a enumC0326a = EnumC0326a.f4994a;
                    i3 = r02.f807i;
                    if (i3 != 0) {
                        X0.a.L(obj);
                        if (this.f817d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d3 = this.f818e.d();
                        try {
                            Q q4 = new Q(this.f814a);
                            try {
                                Boolean valueOf = Boolean.valueOf(d3);
                                r02.f803d = this;
                                r02.f804e = q4;
                                r02.f = d3;
                                r02.f807i = 1;
                                Object i5 = rVar.i(q4, valueOf, r02);
                                if (i5 == enumC0326a) {
                                    return enumC0326a;
                                }
                                obj = i5;
                                z3 = d3;
                                x3 = this;
                                q3 = q4;
                            } catch (Throwable th2) {
                                th = th2;
                                rVar = d3;
                                r02 = this;
                                q3 = q4;
                                q3.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            rVar = d3;
                            r02 = this;
                            if (rVar != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar = r02.f;
                        q3 = r02.f804e;
                        r02 = r02.f803d;
                        try {
                            X0.a.L(obj);
                            x3 = r02;
                            z3 = rVar;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                q3.close();
                            } catch (Throwable th5) {
                                F2.b.d(th, th5);
                            }
                            throw th;
                        }
                    }
                    q3.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z3) {
                        x3.f818e.e(null);
                    }
                    return obj;
                }
            }
            if (i3 != 0) {
            }
            q3.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (rVar != 0) {
                r02.f818e.e(null);
            }
            throw th;
        }
        r02 = new V(this, abstractC0343b);
        Object obj2 = r02.f805g;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = r02.f807i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(7:(2:3|(11:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|(1:22)(1:28)|(1:24)(2:25|26))|29|30)(1:31))(2:42|43))(1:44))(2:62|(5:64|(2:66|(2:68|69))|70|(1:72)|51)(2:73|74))|45|46|47|48|49|(5:52|14|15|16|(0)(0))|51))|46|47|48|49|(0)|51)|7|(0)(0)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0118, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0119, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123 A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(N n3, AbstractC0343b abstractC0343b) {
        W w3;
        EnumC0326a enumC0326a;
        ?? r3;
        File file;
        X x3;
        E2.a aVar;
        o2.p pVar;
        Z z3;
        Throwable th;
        Z z4;
        File file2;
        X x4;
        try {
            try {
                try {
                    if (abstractC0343b instanceof W) {
                        w3 = (W) abstractC0343b;
                        int i3 = w3.f813j;
                        if ((i3 & Integer.MIN_VALUE) != 0) {
                            w3.f813j = i3 - Integer.MIN_VALUE;
                            Object obj = w3.f811h;
                            enumC0326a = EnumC0326a.f4994a;
                            r3 = w3.f813j;
                            if (r3 != 0) {
                                X0.a.L(obj);
                                if (this.f817d.get()) {
                                    throw new IllegalStateException("StorageConnection has already been disposed.");
                                }
                                File file3 = this.f814a;
                                File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new IOException("Unable to create parent directories of " + file3);
                                    }
                                }
                                w3.f808d = this;
                                w3.f809e = n3;
                                E2.d dVar = this.f818e;
                                w3.f = dVar;
                                w3.f813j = 1;
                                if (dVar.c(w3) != enumC0326a) {
                                    x3 = this;
                                    aVar = dVar;
                                    pVar = n3;
                                }
                                return enumC0326a;
                            }
                            if (r3 != 1) {
                                if (r3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                z4 = w3.f810g;
                                file2 = (File) w3.f;
                                aVar = (E2.a) w3.f809e;
                                x4 = w3.f808d;
                                try {
                                    X0.a.L(obj);
                                    try {
                                        z4.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (file2.exists()) {
                                        File file4 = x4.f814a;
                                        if (!(Build.VERSION.SDK_INT >= 26 ? AbstractC0033a.a(file2, file4) : file2.renameTo(file4))) {
                                            throw new IOException("Unable to rename " + file2 + " to " + x4.f814a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    ((E2.d) aVar).e(null);
                                    return C0279i.f4852a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        z4.close();
                                    } catch (Throwable th4) {
                                        F2.b.d(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            E2.a aVar2 = (E2.a) w3.f;
                            o2.p pVar2 = (o2.p) w3.f809e;
                            x3 = w3.f808d;
                            X0.a.L(obj);
                            aVar = aVar2;
                            pVar = pVar2;
                            file = new File(x3.f814a.getAbsolutePath() + ".tmp");
                            z3 = new Z(file);
                            w3.f808d = x3;
                            w3.f809e = aVar;
                            w3.f = file;
                            w3.f810g = z3;
                            w3.f813j = 2;
                            if (pVar.invoke(z3, w3) != enumC0326a) {
                                file2 = file;
                                x4 = x3;
                                z4 = z3;
                                z4.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                            return enumC0326a;
                        }
                    }
                    w3.f808d = x3;
                    w3.f809e = aVar;
                    w3.f = file;
                    w3.f810g = z3;
                    w3.f813j = 2;
                    if (pVar.invoke(z3, w3) != enumC0326a) {
                    }
                    return enumC0326a;
                } catch (Throwable th5) {
                    th = th5;
                    z4 = z3;
                    z4.close();
                    throw th;
                }
                z3 = new Z(file);
            } catch (IOException e3) {
                e = e3;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r3 != 0) {
            }
            file = new File(x3.f814a.getAbsolutePath() + ".tmp");
        } catch (Throwable th6) {
            ((E2.d) r3).e(null);
            throw th6;
        }
        w3 = new W(this, abstractC0343b);
        Object obj2 = w3.f811h;
        enumC0326a = EnumC0326a.f4994a;
        r3 = w3.f813j;
    }

    @Override // K.InterfaceC0034b
    public final void close() {
        this.f817d.set(true);
        this.f816c.invoke();
    }
}
