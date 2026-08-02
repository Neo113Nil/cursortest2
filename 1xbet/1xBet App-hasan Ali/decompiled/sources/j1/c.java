package j1;

import android.os.Build;
import com.google.android.gms.internal.ads.TC;
import d1.h;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17485b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final e f17486a;

    static {
        Locale[] localeArr = new Locale[0];
        if (Build.VERSION.SDK_INT >= 24) {
            TC.g(h.b(localeArr));
        } else {
            new d(localeArr);
        }
    }

    public c(e eVar) {
        this.f17486a = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f17486a.equals(((c) obj).f17486a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17486a.hashCode();
    }

    public final String toString() {
        return this.f17486a.toString();
    }
}
