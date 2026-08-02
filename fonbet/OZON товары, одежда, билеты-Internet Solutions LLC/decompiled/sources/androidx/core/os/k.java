package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f42187a;

    k(LocaleList localeList) {
        this.f42187a = localeList;
    }

    @Override // androidx.core.os.j
    public final Object a() {
        return this.f42187a;
    }

    public final Locale b(int i11) {
        return this.f42187a.get(i11);
    }

    public final boolean c() {
        return this.f42187a.isEmpty();
    }

    public final int d() {
        return this.f42187a.size();
    }

    public final String e() {
        return this.f42187a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.f42187a.equals(((j) obj).a());
    }

    public final int hashCode() {
        return this.f42187a.hashCode();
    }

    public final String toString() {
        return this.f42187a.toString();
    }
}
