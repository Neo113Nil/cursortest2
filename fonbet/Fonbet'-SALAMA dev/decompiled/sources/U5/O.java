package U5;

import a.AbstractC0603a;
import io.sentry.protocol.SentryThread;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class O {
    public abstract String a();

    public abstract int b();

    public abstract boolean c();

    public abstract N d(AbstractC0438e abstractC0438e);

    public abstract e0 e(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(a(), "policy");
        u02.e(SentryThread.JsonKeys.PRIORITY, String.valueOf(b()));
        u02.c("available", c());
        return u02.toString();
    }
}
