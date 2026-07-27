package M;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.EnumC1260a;
import m4.AbstractC1295c;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class Y implements InterfaceC0073b {

    /* renamed from: a, reason: collision with root package name */
    public final File f1652a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f1653b;

    /* renamed from: c, reason: collision with root package name */
    public final U f1654c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f1655d;

    /* renamed from: e, reason: collision with root package name */
    public final L4.d f1656e;

    public Y(File file, j0 coordinator, U u5) {
        kotlin.jvm.internal.i.e(coordinator, "coordinator");
        this.f1652a = file;
        this.f1653b = coordinator;
        this.f1654c = u5;
        this.f1655d = new AtomicBoolean(false);
        this.f1656e = L4.e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|56|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:21:0x0078, B:28:0x0089, B:31:0x0086, B:27:0x0081), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v10, types: [M.Y] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [M.W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [M.Y] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [M.r] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r rVar, AbstractC1295c abstractC1295c) {
        ?? r0;
        int i2;
        S s2;
        Throwable th;
        Y y5;
        boolean z;
        try {
            if (abstractC1295c instanceof W) {
                W w3 = (W) abstractC1295c;
                int i3 = w3.f1644f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    w3.f1644f = i3 - Integer.MIN_VALUE;
                    r0 = w3;
                    Object obj = r0.f1642d;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = r0.f1644f;
                    if (i2 != 0) {
                        e5.g.y(obj);
                        if (this.f1655d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d6 = this.f1656e.d(null);
                        try {
                            S s4 = new S(this.f1652a);
                            try {
                                Boolean valueOf = Boolean.valueOf(d6);
                                r0.f1639a = this;
                                r0.f1640b = s4;
                                r0.f1641c = d6;
                                r0.f1644f = 1;
                                Object invoke = rVar.invoke(s4, valueOf, r0);
                                if (invoke == enumC1260a) {
                                    return enumC1260a;
                                }
                                y5 = this;
                                s2 = s4;
                                obj = invoke;
                                z = d6;
                            } catch (Throwable th2) {
                                r0 = this;
                                s2 = s4;
                                th = th2;
                                rVar = d6;
                                s2.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            r0 = this;
                            th = th3;
                            rVar = d6;
                            if (rVar != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar = r0.f1641c;
                        s2 = r0.f1640b;
                        r0 = r0.f1639a;
                        try {
                            e5.g.y(obj);
                            y5 = r0;
                            z = rVar;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                s2.close();
                            } catch (Throwable th5) {
                                K1.b.C(th, th5);
                            }
                            throw th;
                        }
                    }
                    s2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z) {
                        y5.f1656e.e(null);
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            s2.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (rVar != 0) {
                r0.f1656e.e(null);
            }
            throw th;
        }
        r0 = new W(this, abstractC1295c);
        Object obj2 = r0.f1642d;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = r0.f1644f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(6:(2:3|(10:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|(1:22)(1:28)|(1:24)(2:25|26))|29|30)(1:31))(2:42|43))(1:44))(2:62|(4:64|(2:66|(2:68|69))|70|(1:72)(1:73))(2:74|75))|45|46|47|48|49|(1:51)(5:52|14|15|16|(0)(0))))|46|47|48|49|(0)(0))|7|(0)(0)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123 A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(O o2, AbstractC1295c abstractC1295c) {
        X x5;
        EnumC1260a enumC1260a;
        ?? r32;
        File file;
        Y y5;
        L4.a aVar;
        InterfaceC1445p interfaceC1445p;
        a0 a0Var;
        Throwable th;
        a0 a0Var2;
        File file2;
        Y y6;
        try {
            try {
                try {
                    if (abstractC1295c instanceof X) {
                        x5 = (X) abstractC1295c;
                        int i2 = x5.f1651g;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            x5.f1651g = i2 - Integer.MIN_VALUE;
                            Object obj = x5.f1649e;
                            enumC1260a = EnumC1260a.f11058a;
                            r32 = x5.f1651g;
                            if (r32 != 0) {
                                e5.g.y(obj);
                                if (this.f1655d.get()) {
                                    throw new IllegalStateException("StorageConnection has already been disposed.");
                                }
                                File file3 = this.f1652a;
                                File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new IOException("Unable to create parent directories of " + file3);
                                    }
                                }
                                x5.f1645a = this;
                                x5.f1646b = o2;
                                L4.d dVar = this.f1656e;
                                x5.f1647c = dVar;
                                x5.f1651g = 1;
                                if (dVar.c(x5) == enumC1260a) {
                                    return enumC1260a;
                                }
                                y5 = this;
                                aVar = dVar;
                                interfaceC1445p = o2;
                            } else {
                                if (r32 != 1) {
                                    if (r32 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a0Var2 = x5.f1648d;
                                    file2 = (File) x5.f1647c;
                                    aVar = (L4.a) x5.f1646b;
                                    y6 = x5.f1645a;
                                    try {
                                        e5.g.y(obj);
                                        try {
                                            a0Var2.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists()) {
                                            File file4 = y6.f1652a;
                                            if (!(Build.VERSION.SDK_INT >= 26 ? AbstractC0072a.a(file2, file4) : file2.renameTo(file4))) {
                                                throw new IOException("Unable to rename " + file2 + " to " + y6.f1652a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        ((L4.d) aVar).e(null);
                                        return f4.v.f5689a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            a0Var2.close();
                                        } catch (Throwable th4) {
                                            K1.b.C(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                L4.a aVar2 = (L4.a) x5.f1647c;
                                InterfaceC1445p interfaceC1445p2 = (InterfaceC1445p) x5.f1646b;
                                y5 = x5.f1645a;
                                e5.g.y(obj);
                                aVar = aVar2;
                                interfaceC1445p = interfaceC1445p2;
                            }
                            file = new File(y5.f1652a.getAbsolutePath() + ".tmp");
                            a0Var = new a0(file);
                            x5.f1645a = y5;
                            x5.f1646b = aVar;
                            x5.f1647c = file;
                            x5.f1648d = a0Var;
                            x5.f1651g = 2;
                            if (interfaceC1445p.invoke(a0Var, x5) != enumC1260a) {
                                return enumC1260a;
                            }
                            file2 = file;
                            y6 = y5;
                            a0Var2 = a0Var;
                            a0Var2.close();
                            th = null;
                            if (th == null) {
                            }
                        }
                    }
                    x5.f1645a = y5;
                    x5.f1646b = aVar;
                    x5.f1647c = file;
                    x5.f1648d = a0Var;
                    x5.f1651g = 2;
                    if (interfaceC1445p.invoke(a0Var, x5) != enumC1260a) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    a0Var2 = a0Var;
                    a0Var2.close();
                    throw th;
                }
                a0Var = new a0(file);
            } catch (IOException e3) {
                e = e3;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r32 != 0) {
            }
            file = new File(y5.f1652a.getAbsolutePath() + ".tmp");
        } catch (Throwable th6) {
            ((L4.d) r32).e(null);
            throw th6;
        }
        x5 = new X(this, abstractC1295c);
        Object obj2 = x5.f1649e;
        enumC1260a = EnumC1260a.f11058a;
        r32 = x5.f1651g;
    }

    @Override // M.InterfaceC0073b
    public final void close() {
        this.f1655d.set(true);
        this.f1654c.invoke();
    }
}
