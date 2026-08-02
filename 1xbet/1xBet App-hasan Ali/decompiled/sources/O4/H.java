package O4;

import L4.C0226i;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H extends Z {

    /* renamed from: d, reason: collision with root package name */
    public final Method f4131d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4132e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final C0256b f4133g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4134h;

    public H(Method method, int i, String str, boolean z3) {
        C0256b c0256b = C0256b.f4204l;
        this.f4131d = method;
        this.f4132e = i;
        Objects.requireNonNull(str, "name == null");
        this.f = str;
        this.f4133g = c0256b;
        this.f4134h = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    @Override // O4.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(O o5, Object obj) {
        String str;
        String replace;
        String str2 = this.f;
        if (obj == null) {
            throw Z.o(this.f4131d, this.f4132e, L1.a.n("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
        this.f4133g.getClass();
        String obj2 = obj.toString();
        if (o5.f4149c == null) {
            throw new AssertionError();
        }
        int length = obj2.length();
        int i = 0;
        while (i < length) {
            int codePointAt = obj2.codePointAt(i);
            boolean z3 = this.f4134h;
            int i5 = 47;
            int i6 = -1;
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z3 && (codePointAt == 47 || codePointAt == 37))) {
                C0226i c0226i = new C0226i();
                c0226i.T(0, i, obj2);
                C0226i c0226i2 = null;
                while (i < length) {
                    int codePointAt2 = obj2.codePointAt(i);
                    if (!z3 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i6 || (!z3 && (codePointAt2 == i5 || codePointAt2 == 37))) {
                            if (c0226i2 == null) {
                                c0226i2 = new C0226i();
                            }
                            c0226i2.V(codePointAt2);
                            while (!c0226i2.l()) {
                                byte s2 = c0226i2.s();
                                c0226i.P(37);
                                char[] cArr = O.f4145l;
                                c0226i.P(cArr[((s2 & 255) >> 4) & 15]);
                                c0226i.P(cArr[s2 & 15]);
                            }
                        } else {
                            c0226i.V(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                    i5 = 47;
                    i6 = -1;
                }
                str = c0226i.I();
                replace = o5.f4149c.replace("{" + str2 + "}", str);
                if (!O.f4146m.matcher(replace).matches()) {
                    throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(obj2));
                }
                o5.f4149c = replace;
                return;
            }
            i += Character.charCount(codePointAt);
        }
        str = obj2;
        replace = o5.f4149c.replace("{" + str2 + "}", str);
        if (!O.f4146m.matcher(replace).matches()) {
        }
    }
}
