package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f42184b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final k f42185a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f42186a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        static boolean b(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (locale.getLanguage().equals(locale2.getLanguage())) {
                Locale[] localeArr = f42186a;
                for (Locale locale3 : localeArr) {
                    if (locale3.equals(locale)) {
                        return false;
                    }
                }
                for (Locale locale4 : localeArr) {
                    if (locale4.equals(locale2)) {
                        return false;
                    }
                }
                String a11 = androidx.core.text.c.a(locale);
                if (!a11.isEmpty()) {
                    return a11.equals(androidx.core.text.c.a(locale2));
                }
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
            }
            return false;
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private i(k kVar) {
        this.f42185a = kVar;
    }

    @NonNull
    public static i a(@NonNull Locale... localeArr) {
        return j(b.a(localeArr));
    }

    @NonNull
    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return f42184b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i11 = 0; i11 < length; i11++) {
            localeArr[i11] = a.a(split[i11]);
        }
        return a(localeArr);
    }

    @NonNull
    public static i d() {
        return j(b.c());
    }

    @NonNull
    public static i e() {
        return f42184b;
    }

    @NonNull
    public static i j(@NonNull LocaleList localeList) {
        return new i(new k(localeList));
    }

    public final Locale c(int i11) {
        return this.f42185a.b(i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f42185a.equals(((i) obj).f42185a);
        }
        return false;
    }

    public final boolean f() {
        return this.f42185a.c();
    }

    public final int g() {
        return this.f42185a.d();
    }

    @NonNull
    public final String h() {
        return this.f42185a.e();
    }

    public final int hashCode() {
        return this.f42185a.hashCode();
    }

    public final Object i() {
        return this.f42185a.a();
    }

    @NonNull
    public final String toString() {
        return this.f42185a.toString();
    }
}
