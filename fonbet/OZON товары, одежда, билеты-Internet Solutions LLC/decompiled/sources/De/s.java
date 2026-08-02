package De;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import org.jetbrains.annotations.NotNull;
import xe.L0;
import ye.C10887a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final L0 f6650a;

    static {
        Object next;
        String c11 = B.c("kotlinx.coroutines.fast.service.loader");
        if (c11 != null) {
            Boolean.parseBoolean(c11);
        }
        try {
            try {
                Iterator it = kotlin.sequences.l.C(kotlin.sequences.l.b(Arrays.asList(new C10887a()).iterator())).iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        ((r) next).getClass();
                        do {
                            ((r) it.next()).getClass();
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                r rVar = (r) next;
                if (rVar != null) {
                    f6650a = rVar.a();
                } else {
                    t.a(3, null);
                    throw null;
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        } catch (Throwable th3) {
            t.a(2, th3);
            throw null;
        }
    }
}
