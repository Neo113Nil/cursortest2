package F;

/* loaded from: classes.dex */
public class S implements F.InterfaceC0002b {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f395a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f396b = new java.util.concurrent.atomic.AtomicBoolean(false);

    public S(java.io.File file) {
        this.f395a = file;
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
    /* JADX WARN: Type inference failed for: r2v9, types: [F.S] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object a(F.S s2, m1.AbstractC0931b abstractC0931b) {
        F.Q q2;
        ?? r2;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        java.io.FileInputStream fileInputStream;
        java.lang.Throwable th2;
        if (abstractC0931b instanceof F.Q) {
            q2 = (F.Q) abstractC0931b;
            int i2 = q2.f394h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q2.f394h = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = q2.f392f;
                l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                r2 = q2.f394h;
                I.g gVar = I.g.f650a;
                boolean z2 = true;
                if (r2 != 0) {
                    a.AbstractC0059a.A(obj);
                    if (s2.f396b.get()) {
                        throw new java.lang.IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(s2.f395a);
                        try {
                            q2.f390d = s2;
                            q2.f391e = fileInputStream2;
                            q2.f394h = 1;
                            I.b a2 = gVar.a(fileInputStream2);
                            if (a2 == enumC0927a) {
                                return enumC0927a;
                            }
                            fileInputStream = fileInputStream2;
                            obj = a2;
                        } catch (java.lang.Throwable th3) {
                            r2 = s2;
                            fileInputStream = fileInputStream2;
                            th2 = th3;
                            throw th;
                        }
                    } catch (java.io.FileNotFoundException unused) {
                        if (!s2.f395a.exists()) {
                            return new I.b(z2);
                        }
                        java.io.FileInputStream fileInputStream3 = new java.io.FileInputStream(s2.f395a);
                        try {
                            q2.f390d = fileInputStream3;
                            q2.f391e = null;
                            q2.f394h = 2;
                            I.b a3 = gVar.a(fileInputStream3);
                            if (a3 == enumC0927a) {
                                return enumC0927a;
                            }
                            obj = a3;
                            closeable = fileInputStream3;
                            Q1.d.g(closeable, null);
                            return obj;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            closeable = fileInputStream3;
                            throw th;
                        }
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (java.io.Closeable) q2.f390d;
                        try {
                            a.AbstractC0059a.A(obj);
                            Q1.d.g(closeable, null);
                            return obj;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    fileInputStream = q2.f391e;
                    r2 = (F.S) q2.f390d;
                    try {
                        a.AbstractC0059a.A(obj);
                    } catch (java.lang.Throwable th6) {
                        th2 = th6;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                Q1.d.g(fileInputStream, null);
                return obj;
            }
        }
        q2 = new F.Q(s2, abstractC0931b);
        java.lang.Object obj2 = q2.f392f;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        r2 = q2.f394h;
        I.g gVar2 = I.g.f650a;
        boolean z22 = true;
        if (r2 != 0) {
        }
        Q1.d.g(fileInputStream, null);
        return obj2;
    }

    @Override // F.InterfaceC0002b
    public final void close() {
        this.f396b.set(true);
    }
}
