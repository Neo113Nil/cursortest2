package K;

import h2.EnumC0326a;
import i2.AbstractC0343b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class Q implements InterfaceC0034b {

    /* renamed from: a, reason: collision with root package name */
    public final File f795a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f796b = new AtomicBoolean(false);

    public Q(File file) {
        this.f795a = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|47|48|(1:50)|51)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0070, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [K.Q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(Q q3, AbstractC0343b abstractC0343b) {
        P p3;
        ?? r22;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th2;
        if (abstractC0343b instanceof P) {
            p3 = (P) abstractC0343b;
            int i3 = p3.f794h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p3.f794h = i3 - Integer.MIN_VALUE;
                Object obj = p3.f;
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                r22 = p3.f794h;
                N.g gVar = N.g.f985a;
                boolean z3 = true;
                if (r22 != 0) {
                    X0.a.L(obj);
                    if (q3.f796b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        fileInputStream = new FileInputStream(q3.f795a);
                    } catch (FileNotFoundException unused) {
                        if (!q3.f795a.exists()) {
                            return new N.b(z3);
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(q3.f795a);
                        try {
                            p3.f791d = fileInputStream3;
                            p3.f792e = null;
                            p3.f794h = 2;
                            N.b a3 = gVar.a(fileInputStream3);
                            if (a3 != enumC0326a) {
                                obj = a3;
                                closeable = fileInputStream3;
                                F2.b.k(closeable, null);
                                return obj;
                            }
                            return enumC0326a;
                        } catch (Throwable th3) {
                            th = th3;
                            closeable = fileInputStream3;
                            throw th;
                        }
                    }
                    try {
                        p3.f791d = q3;
                        p3.f792e = fileInputStream;
                        p3.f794h = 1;
                        N.b a4 = gVar.a(fileInputStream);
                        if (a4 != enumC0326a) {
                            fileInputStream2 = fileInputStream;
                            obj = a4;
                        }
                        return enumC0326a;
                    } catch (Throwable th4) {
                        r22 = q3;
                        fileInputStream2 = fileInputStream;
                        th2 = th4;
                        throw th;
                    }
                }
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) p3.f791d;
                    try {
                        X0.a.L(obj);
                        F2.b.k(closeable, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream2 = p3.f792e;
                r22 = (Q) p3.f791d;
                try {
                    X0.a.L(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                F2.b.k(fileInputStream2, null);
                return obj;
            }
        }
        p3 = new P(q3, abstractC0343b);
        Object obj2 = p3.f;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        r22 = p3.f794h;
        N.g gVar2 = N.g.f985a;
        boolean z32 = true;
        if (r22 != 0) {
        }
        F2.b.k(fileInputStream2, null);
        return obj2;
    }

    @Override // K.InterfaceC0034b
    public final void close() {
        this.f796b.set(true);
    }
}
