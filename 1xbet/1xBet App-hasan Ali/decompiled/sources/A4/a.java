package A4;

import y4.y;
import y4.z;

/* loaded from: classes.dex */
public final class a {
    public static final z a(z zVar) {
        if ((zVar != null ? zVar.f21454q : null) == null) {
            return zVar;
        }
        y f = zVar.f();
        f.f21442g = null;
        return f.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
