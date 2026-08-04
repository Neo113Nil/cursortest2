package p010b0;

import M6.d;
import M6.e;
import U0.i;
import android.os.Build;
import j6.a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;
import p077k6.c;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class W implements InterfaceC0731b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f10000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f10001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f10002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f10004e;

    public W(File file, h0 h0Var, i iVar) {
        h.e(h0Var, "coordinator");
        this.f10000a = file;
        this.f10001b = h0Var;
        this.f10002c = iVar;
        this.f10003d = new AtomicBoolean(false);
        this.f10004e = e.a();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:33:0x0078, B:42:0x0089, B:41:0x0086, B:38:0x0081), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [b0.W] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [b0.U, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [b0.W] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [b0.W] */
    /* JADX WARN: Type inference failed for: r8v0, types: [b0.r] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final Object a(r rVar, c cVar) throws Throwable {
        ?? u4;
        Q q7;
        Throwable th;
        ?? r7;
        ?? r8;
        if (cVar instanceof U) {
            U u7 = (U) cVar;
            int i7 = u7.f9992f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                u7.f9992f = i7 - Integer.MIN_VALUE;
                u4 = u7;
            } else {
                u4 = new U(this, cVar);
            }
        } else {
            u4 = new U(this, cVar);
        }
        Object obj = u4.f9990d;
        a aVar = a.f14648a;
        int i8 = u4.f9992f;
        try {
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = u4.f9989c;
                q7 = u4.f9988b;
                u4 = u4.f9987a;
                try {
                    p003a.a.p0(obj);
                    r7 = u4;
                    r8 = rVar;
                    try {
                        q7.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        r7.f10004e.b(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        q7.close();
                    } catch (Throwable th4) {
                        Q0.a.c(th, th4);
                    }
                    throw th;
                }
            }
            p003a.a.p0(obj);
            if (this.f10003d.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zE = this.f10004e.e(null);
            try {
                Q q8 = new Q(this.f10000a);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zE);
                    u4.f9987a = this;
                    u4.f9988b = q8;
                    u4.f9989c = zE;
                    u4.f9992f = 1;
                    Object objInvoke = rVar.invoke(q8, boolValueOf, u4);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    r7 = this;
                    q7 = q8;
                    obj = objInvoke;
                    r8 = zE;
                    q7.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        r7.f10004e.b(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    u4 = this;
                    q7 = q8;
                    th = th5;
                    rVar = zE;
                    q7.close();
                    throw th;
                }
            } catch (Throwable th6) {
                u4 = this;
                th = th6;
                rVar = zE;
                if (rVar != 0) {
                    u4.f10004e.b(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (rVar != 0) {
                u4.f10004e.b(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00db A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TryCatch #1 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0121, B:66:0x012e, B:65:0x012b), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1 A[Catch: all -> 0x0116, IOException -> 0x0118, TryCatch #1 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0121, B:66:0x012e, B:65:0x012b), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9 A[Catch: all -> 0x0116, IOException -> 0x0118, TryCatch #1 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0121, B:66:0x012e, B:65:0x012b), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee A[Catch: all -> 0x0116, IOException -> 0x0118, TryCatch #1 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0121, B:66:0x012e, B:65:0x012b), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5 A[Catch: all -> 0x0116, IOException -> 0x0118, TryCatch #1 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0121, B:66:0x012e, B:65:0x012b), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0121 A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0121, B:66:0x012e, B:65:0x012b), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00f5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [M6.a, int] */
    public final Object b(N n2, c cVar) throws IOException {
        V v6;
        File file;
        W w7;
        M6.a aVar;
        Function2 function2;
        Y y4;
        Throwable th;
        Y y5;
        File file2;
        W w8;
        File file3;
        boolean zRenameTo;
        if (cVar instanceof V) {
            v6 = (V) cVar;
            int i7 = v6.f9999x;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                v6.f9999x = i7 - Integer.MIN_VALUE;
            } else {
                v6 = new V(this, cVar);
            }
        } else {
            v6 = new V(this, cVar);
        }
        Object obj = v6.f9997e;
        a aVar2 = a.f14648a;
        ?? r7 = v6.f9999x;
        try {
            try {
                try {
                    try {
                        if (r7 == 0) {
                            p003a.a.p0(obj);
                            if (this.f10003d.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file4 = this.f10000a;
                            File parentFile = file4.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file4);
                                }
                            }
                            v6.f9993a = this;
                            v6.f9994b = n2;
                            d dVar = this.f10004e;
                            v6.f9995c = dVar;
                            v6.f9999x = 1;
                            if (dVar.a(v6) == aVar2) {
                                return aVar2;
                            }
                            w7 = this;
                            aVar = dVar;
                            function2 = n2;
                        } else {
                            if (r7 != 1) {
                                if (r7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y5 = v6.f9996d;
                                File file5 = (File) v6.f9995c;
                                aVar = (M6.a) v6.f9994b;
                                w8 = v6.f9993a;
                                try {
                                    p003a.a.p0(obj);
                                    file2 = file5;
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
                                        file3 = w8.f10000a;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            zRenameTo = AbstractC0730a.a(file2, file3);
                                        } else {
                                            zRenameTo = file2.renameTo(file3);
                                        }
                                        if (zRenameTo) {
                                            throw new IOException("Unable to rename " + file2 + " to " + w8.f10000a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    aVar.b(null);
                                    return p044f6.i.f13014a;
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
                            Function2 function3 = (Function2) v6.f9994b;
                            w7 = v6.f9993a;
                            p003a.a.p0(obj);
                            aVar = aVar3;
                            function2 = function3;
                        }
                        v6.f9993a = w7;
                        v6.f9994b = aVar;
                        v6.f9995c = file;
                        v6.f9996d = y4;
                        v6.f9999x = 2;
                        if (function2.invoke(y4, v6) == aVar2) {
                            return aVar2;
                        }
                        file2 = file;
                        w8 = w7;
                        y5 = y4;
                        y5.close();
                        th = null;
                        if (th == null) {
                            throw th;
                        }
                        if (file2.exists()) {
                            file3 = w8.f10000a;
                            if (Build.VERSION.SDK_INT >= 26) {
                                zRenameTo = AbstractC0730a.a(file2, file3);
                            } else {
                                zRenameTo = file2.renameTo(file3);
                            }
                            if (zRenameTo) {
                                throw new IOException("Unable to rename " + file2 + " to " + w8.f10000a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                        }
                        aVar.b(null);
                        return p044f6.i.f13014a;
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
                file = new File(w7.f10000a.getAbsolutePath() + ".tmp");
            } catch (IOException e8) {
                e = e8;
                file = aVar2;
            }
        } catch (Throwable th6) {
            r7.b(null);
            throw th6;
        }
    }

    @Override // p010b0.InterfaceC0731b
    public final void close() {
        this.f10003d.set(true);
        this.f10002c.invoke();
    }
}
