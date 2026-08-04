package L;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f4185b = new j(new k(i.a(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f4186a;

    public j(k kVar) {
        this.f4186a = kVar;
    }

    public static j a(String str) {
        if (str == null || str.isEmpty()) {
            return f4185b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            localeArr[i7] = h.a(strArrSplit[i7]);
        }
        return new j(new k(i.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (this.f4186a.equals(((j) obj).f4186a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4186a.f4187a.hashCode();
    }

    public final String toString() {
        return this.f4186a.f4187a.toString();
    }
}
