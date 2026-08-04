package U5;

import io.sentry.protocol.SentryThread;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
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
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(a(), "policy");
        jVarU0.e(SentryThread.JsonKeys.PRIORITY, String.valueOf(b()));
        jVarU0.c("available", c());
        return jVarU0.toString();
    }
}
