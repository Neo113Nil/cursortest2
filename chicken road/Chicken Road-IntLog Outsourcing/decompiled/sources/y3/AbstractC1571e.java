package y3;

import java.io.OutputStream;

/* renamed from: y3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1571e {
    public abstract int a();

    public final void b(OutputStream outputStream) {
        k kVar = new k(outputStream);
        try {
            c(kVar);
            kVar.close();
        } catch (Throwable th) {
            try {
                kVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract void c(m mVar);
}
