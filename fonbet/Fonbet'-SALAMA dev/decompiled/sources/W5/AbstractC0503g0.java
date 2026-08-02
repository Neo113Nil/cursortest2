package W5;

import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: W5.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0503g0 extends AbstractC0484a {

    /* renamed from: u, reason: collision with root package name */
    public static final U5.Z f7218u = U5.G.a(":status", new f2(13));

    /* renamed from: q, reason: collision with root package name */
    public U5.l0 f7219q;

    /* renamed from: r, reason: collision with root package name */
    public U5.b0 f7220r;

    /* renamed from: s, reason: collision with root package name */
    public Charset f7221s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7222t;

    public static Charset h(U5.b0 b0Var) {
        String str = (String) b0Var.c(AbstractC0494d0.f7171i);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return D3.f.f1719c;
    }

    public static U5.l0 i(U5.b0 b0Var) {
        char charAt;
        Integer num = (Integer) b0Var.c(f7218u);
        if (num == null) {
            return U5.l0.f6543m.g("Missing HTTP status code");
        }
        String str = (String) b0Var.c(AbstractC0494d0.f7171i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        return AbstractC0494d0.g(num.intValue()).a("invalid content-type: " + str);
    }
}
