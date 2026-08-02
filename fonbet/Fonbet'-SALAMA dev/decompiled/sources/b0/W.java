package b0;

import a.AbstractC0603a;
import android.os.Build;
import f6.C1116i;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.AbstractC1356c;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class W implements InterfaceC0754b {

    /* renamed from: a, reason: collision with root package name */
    public final File f10000a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f10001b;

    /* renamed from: c, reason: collision with root package name */
    public final U0.i f10002c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10003d;

    /* renamed from: e, reason: collision with root package name */
    public final M6.d f10004e;

    public W(File file, h0 h0Var, U0.i iVar) {
        t6.h.e(h0Var, "coordinator");
        this.f10000a = file;
        this.f10001b = h0Var;
        this.f10002c = iVar;
        this.f10003d = new AtomicBoolean(false);
        this.f10004e = M6.e.a();
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
    /* JADX WARN: Type inference failed for: r0v10, types: [b0.W] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [b0.U, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [b0.W] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [b0.r] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r rVar, AbstractC1356c abstractC1356c) {
        ?? r02;
        int i7;
        Q q7;
        Throwable th;
        W w7;
        boolean z4;
        try {
            if (abstractC1356c instanceof U) {
                U u4 = (U) abstractC1356c;
                int i8 = u4.f9992f;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    u4.f9992f = i8 - Integer.MIN_VALUE;
                    r02 = u4;
                    Object obj = r02.f9990d;
                    j6.a aVar = j6.a.f14642a;
                    i7 = r02.f9992f;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        if (this.f10003d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean e7 = this.f10004e.e(null);
                        try {
                            Q q8 = new Q(this.f10000a);
                            try {
                                Boolean valueOf = Boolean.valueOf(e7);
                                r02.f9987a = this;
                                r02.f9988b = q8;
                                r02.f9989c = e7;
                                r02.f9992f = 1;
                                Object invoke = rVar.invoke(q8, valueOf, r02);
                                if (invoke == aVar) {
                                    return aVar;
                                }
                                w7 = this;
                                q7 = q8;
                                obj = invoke;
                                z4 = e7;
                            } catch (Throwable th2) {
                                r02 = this;
                                q7 = q8;
                                th = th2;
                                rVar = e7;
                                q7.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            r02 = this;
                            th = th3;
                            rVar = e7;
                            if (rVar != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar = r02.f9989c;
                        q7 = r02.f9988b;
                        r02 = r02.f9987a;
                        try {
                            AbstractC0603a.p0(obj);
                            w7 = r02;
                            z4 = rVar;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                q7.close();
                            } catch (Throwable th5) {
                                Q0.a.c(th, th5);
                            }
                            throw th;
                        }
                    }
                    q7.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z4) {
                        w7.f10004e.b(null);
                    }
                    return obj;
                }
            }
            if (i7 != 0) {
            }
            q7.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (rVar != 0) {
                r02.f10004e.b(null);
            }
            throw th;
        }
        r02 = new U(this, abstractC1356c);
        Object obj2 = r02.f9990d;
        j6.a aVar2 = j6.a.f14642a;
        i7 = r02.f9992f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(6:(2:3|(10:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|(1:22)(1:28)|(1:24)(2:25|26))|29|30)(1:31))(2:42|43))(1:44))(2:62|(4:64|(2:66|(2:68|69))|70|(1:72)(1:73))(2:74|75))|45|46|47|48|49|(1:51)(5:52|14|15|16|(0)(0))))|46|47|48|49|(0)(0))|7|(0)(0)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TryCatch #1 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0121, B:38:0x012e, B:41:0x012b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121 A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0121, B:38:0x012e, B:41:0x012b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r3v0, types: [M6.a, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(N n2, AbstractC1356c abstractC1356c) {
        V v6;
        j6.a aVar;
        ?? r32;
        File file;
        W w7;
        M6.a aVar2;
        Function2 function2;
        Y y4;
        Throwable th;
        Y y5;
        File file2;
        W w8;
        try {
            try {
                try {
                    if (abstractC1356c instanceof V) {
                        v6 = (V) abstractC1356c;
                        int i7 = v6.f9999x;
                        if ((i7 & Integer.MIN_VALUE) != 0) {
                            v6.f9999x = i7 - Integer.MIN_VALUE;
                            Object obj = v6.f9997e;
                            aVar = j6.a.f14642a;
                            r32 = v6.f9999x;
                            if (r32 != 0) {
                                AbstractC0603a.p0(obj);
                                if (this.f10003d.get()) {
                                    throw new IllegalStateException("StorageConnection has already been disposed.");
                                }
                                File file3 = this.f10000a;
                                File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new IOException("Unable to create parent directories of " + file3);
                                    }
                                }
                                v6.f9993a = this;
                                v6.f9994b = n2;
                                M6.d dVar = this.f10004e;
                                v6.f9995c = dVar;
                                v6.f9999x = 1;
                                if (dVar.a(v6) == aVar) {
                                    return aVar;
                                }
                                w7 = this;
                                aVar2 = dVar;
                                function2 = n2;
                            } else {
                                if (r32 != 1) {
                                    if (r32 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    y5 = v6.f9996d;
                                    file2 = (File) v6.f9995c;
                                    aVar2 = (M6.a) v6.f9994b;
                                    w8 = v6.f9993a;
                                    try {
                                        AbstractC0603a.p0(obj);
                                        try {
                                            y5.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists()) {
                                            File file4 = w8.f10000a;
                                            if (!(Build.VERSION.SDK_INT >= 26 ? AbstractC0753a.a(file2, file4) : file2.renameTo(file4))) {
                                                throw new IOException("Unable to rename " + file2 + " to " + w8.f10000a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        aVar2.b(null);
                                        return C1116i.f13008a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            y5.close();
                                        } catch (Throwable th4) {
                                            Q0.a.c(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                M6.a aVar3 = (M6.a) v6.f9995c;
                                Function2 function22 = (Function2) v6.f9994b;
                                w7 = v6.f9993a;
                                AbstractC0603a.p0(obj);
                                aVar2 = aVar3;
                                function2 = function22;
                            }
                            file = new File(w7.f10000a.getAbsolutePath() + ".tmp");
                            y4 = new Y(file);
                            v6.f9993a = w7;
                            v6.f9994b = aVar2;
                            v6.f9995c = file;
                            v6.f9996d = y4;
                            v6.f9999x = 2;
                            if (function2.invoke(y4, v6) != aVar) {
                                return aVar;
                            }
                            file2 = file;
                            w8 = w7;
                            y5 = y4;
                            y5.close();
                            th = null;
                            if (th == null) {
                            }
                        }
                    }
                    v6.f9993a = w7;
                    v6.f9994b = aVar2;
                    v6.f9995c = file;
                    v6.f9996d = y4;
                    v6.f9999x = 2;
                    if (function2.invoke(y4, v6) != aVar) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    y5 = y4;
                    y5.close();
                    throw th;
                }
                y4 = new Y(file);
            } catch (IOException e7) {
                e = e7;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r32 != 0) {
            }
            file = new File(w7.f10000a.getAbsolutePath() + ".tmp");
        } catch (Throwable th6) {
            r32.b(null);
            throw th6;
        }
        v6 = new V(this, abstractC1356c);
        Object obj2 = v6.f9997e;
        aVar = j6.a.f14642a;
        r32 = v6.f9999x;
    }

    @Override // b0.InterfaceC0754b
    public final void close() {
        this.f10003d.set(true);
        this.f10002c.invoke();
    }
}
