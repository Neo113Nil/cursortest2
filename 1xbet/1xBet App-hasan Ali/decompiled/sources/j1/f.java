package j1;

import android.os.LocaleList;
import com.google.android.gms.internal.ads.TC;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f17489a;

    public f(Object obj) {
        this.f17489a = TC.g(obj);
    }

    @Override // j1.e
    public final Object a() {
        return this.f17489a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f17489a.equals(((e) obj).a());
        return equals;
    }

    @Override // j1.e
    public final Locale get() {
        Locale locale;
        locale = this.f17489a.get(0);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f17489a.hashCode();
        return hashCode;
    }

    public final String toString() {
        String localeList;
        localeList = this.f17489a.toString();
        return localeList;
    }
}
