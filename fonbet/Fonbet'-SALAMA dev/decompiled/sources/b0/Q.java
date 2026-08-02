package b0;

import a.AbstractC0603a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.AbstractC1356c;
import p6.AbstractC1539a;

/* loaded from: classes.dex */
public class Q implements InterfaceC0754b {

    /* renamed from: a, reason: collision with root package name */
    public final File f9980a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f9981b = new AtomicBoolean(false);

    public Q(File file) {
        this.f9980a = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(5:44|45|47|48|(1:50)(1:51))(2:42|43))|30|31))|70|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0070, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [b0.Q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(Q q7, AbstractC1356c abstractC1356c) {
        P p5;
        ?? r22;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (abstractC1356c instanceof P) {
            p5 = (P) abstractC1356c;
            int i7 = p5.f9979e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                p5.f9979e = i7 - Integer.MIN_VALUE;
                Object obj = p5.f9977c;
                j6.a aVar = j6.a.f14642a;
                r22 = p5.f9979e;
                e0.h hVar = e0.h.f12504a;
                boolean z4 = true;
                if (r22 != 0) {
                    AbstractC0603a.p0(obj);
                    if (q7.f9981b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(q7.f9980a);
                        try {
                            p5.f9975a = q7;
                            p5.f9976b = fileInputStream2;
                            p5.f9979e = 1;
                            e0.b a2 = hVar.a(fileInputStream2);
                            if (a2 == aVar) {
                                return aVar;
                            }
                            fileInputStream = fileInputStream2;
                            obj = a2;
                        } catch (Throwable th3) {
                            r22 = q7;
                            fileInputStream = fileInputStream2;
                            th2 = th3;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!q7.f9980a.exists()) {
                            return new e0.b(z4);
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(q7.f9980a);
                        try {
                            p5.f9975a = fileInputStream3;
                            p5.f9976b = null;
                            p5.f9979e = 2;
                            e0.b a4 = hVar.a(fileInputStream3);
                            if (a4 == aVar) {
                                return aVar;
                            }
                            obj = a4;
                            closeable = fileInputStream3;
                            AbstractC1539a.e(closeable, null);
                            return obj;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = fileInputStream3;
                            throw th;
                        }
                    }
                } else {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) p5.f9975a;
                        try {
                            AbstractC0603a.p0(obj);
                            AbstractC1539a.e(closeable, null);
                            return obj;
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    fileInputStream = p5.f9976b;
                    r22 = (Q) p5.f9975a;
                    try {
                        AbstractC0603a.p0(obj);
                    } catch (Throwable th6) {
                        th2 = th6;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                AbstractC1539a.e(fileInputStream, null);
                return obj;
            }
        }
        p5 = new P(q7, abstractC1356c);
        Object obj2 = p5.f9977c;
        j6.a aVar2 = j6.a.f14642a;
        r22 = p5.f9979e;
        e0.h hVar2 = e0.h.f12504a;
        boolean z42 = true;
        if (r22 != 0) {
        }
        AbstractC1539a.e(fileInputStream, null);
        return obj2;
    }

    @Override // b0.InterfaceC0754b
    public final void close() {
        this.f9981b.set(true);
    }
}
