package K1;

/* loaded from: classes.dex */
public final class a {
    public static final I1.y a(I1.y yVar) {
        if ((yVar == null ? null : yVar.f863g) == null) {
            return yVar;
        }
        I1.x b2 = yVar.b();
        b2.f850g = null;
        return b2.a();
    }

    public static boolean b(java.lang.String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
