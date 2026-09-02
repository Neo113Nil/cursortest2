package o1;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final s1.h f6254d = s1.h.c(StringUtils.PROCESS_POSTFIX_DELIMITER);

    /* renamed from: e, reason: collision with root package name */
    public static final s1.h f6255e = s1.h.c(":status");

    /* renamed from: f, reason: collision with root package name */
    public static final s1.h f6256f = s1.h.c(":method");

    /* renamed from: g, reason: collision with root package name */
    public static final s1.h f6257g = s1.h.c(":path");

    /* renamed from: h, reason: collision with root package name */
    public static final s1.h f6258h = s1.h.c(":scheme");

    /* renamed from: i, reason: collision with root package name */
    public static final s1.h f6259i = s1.h.c(":authority");

    /* renamed from: a, reason: collision with root package name */
    public final s1.h f6260a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.h f6261b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6262c;

    public b(String str, String str2) {
        this(s1.h.c(str), s1.h.c(str2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6260a.equals(bVar.f6260a) && this.f6261b.equals(bVar.f6261b);
    }

    public final int hashCode() {
        return this.f6261b.hashCode() + ((this.f6260a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String l2 = this.f6260a.l();
        String l3 = this.f6261b.l();
        byte[] bArr = j1.d.f6053a;
        Locale locale = Locale.US;
        return l2 + ": " + l3;
    }

    public b(s1.h hVar, String str) {
        this(hVar, s1.h.c(str));
    }

    public b(s1.h hVar, s1.h hVar2) {
        this.f6260a = hVar;
        this.f6261b = hVar2;
        this.f6262c = hVar2.i() + hVar.i() + 32;
    }
}
