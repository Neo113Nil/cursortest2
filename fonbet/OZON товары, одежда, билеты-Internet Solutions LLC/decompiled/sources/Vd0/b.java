package Vd0;

import Sc.C4001c;
import java.io.Closeable;

/* loaded from: classes7.dex */
public class b {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                C4001c.a(th2, th3);
            }
        }
    }

    public a b() {
        throw null;
    }
}
