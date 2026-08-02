package S1;

import A1.X;
import n3.AbstractC1464a;
import w1.L;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6314a = new b();

    public final AbstractC1464a a(X x4) {
        String str = x4.f283C;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new T1.a();
                case "application/x-icy":
                    return new W1.a();
                case "application/id3":
                    return new X1.c(null);
                case "application/x-emsg":
                    return new U1.a();
                case "application/x-scte35":
                    return new Z1.a();
            }
        }
        throw new IllegalArgumentException(L.i("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(X x4) {
        String str = x4.f283C;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
