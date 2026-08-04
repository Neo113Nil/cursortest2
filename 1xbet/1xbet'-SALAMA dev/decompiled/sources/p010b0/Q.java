package p010b0;

import j6.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import p030e0.b;
import p030e0.h;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public class Q implements InterfaceC0731b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f9980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f9981b = new AtomicBoolean(false);

    public Q(File file) {
        this.f9980a = file;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [b0.Q] */
    /* JADX WARN: Type inference failed for: r9v0, types: [b0.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [b0.Q] */
    public static Object a(Q q7, c cVar) {
        P p5;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (cVar instanceof P) {
            p5 = (P) cVar;
            int i7 = p5.f9979e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                p5.f9979e = i7 - Integer.MIN_VALUE;
            } else {
                p5 = new P(q7, cVar);
            }
        } else {
            p5 = new P(q7, cVar);
        }
        Object obj = p5.f9977c;
        a aVar = a.f14648a;
        ?? r7 = p5.f9979e;
        h hVar = h.f12510a;
        boolean z4 = true;
        try {
            if (r7 != 0) {
                if (r7 == 1) {
                    fileInputStream = p5.f9976b;
                    r7 = (Q) p5.f9975a;
                    try {
                        p003a.a.p0(obj);
                        p115p6.a.e(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            p115p6.a.e(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) p5.f9975a;
                try {
                    p003a.a.p0(obj);
                    p115p6.a.e(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        p115p6.a.e(closeable, th);
                        throw th6;
                    }
                }
            }
            p003a.a.p0(obj);
            if (q7.f9981b.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(q7.f9980a);
                try {
                    p5.f9975a = q7;
                    p5.f9976b = fileInputStream2;
                    p5.f9979e = 1;
                    b bVarA = hVar.a(fileInputStream2);
                    if (bVarA == aVar) {
                        return aVar;
                    }
                    fileInputStream = fileInputStream2;
                    obj = bVarA;
                    p115p6.a.e(fileInputStream, null);
                    return obj;
                } catch (Throwable th7) {
                    r7 = q7;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (!q7.f9980a.exists()) {
                    return new b(z4);
                }
                FileInputStream fileInputStream3 = new FileInputStream(q7.f9980a);
                try {
                    p5.f9975a = fileInputStream3;
                    p5.f9976b = null;
                    p5.f9979e = 2;
                    b bVarA2 = hVar.a(fileInputStream3);
                    if (bVarA2 == aVar) {
                        return aVar;
                    }
                    obj = bVarA2;
                    closeable = fileInputStream3;
                    p115p6.a.e(closeable, null);
                    return obj;
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
        } catch (FileNotFoundException unused2) {
            q7 = r7;
        }
    }

    @Override // p010b0.InterfaceC0731b
    public final void close() {
        this.f9981b.set(true);
    }
}
