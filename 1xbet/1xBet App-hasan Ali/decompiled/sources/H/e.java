package H;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2045a;

    /* renamed from: b, reason: collision with root package name */
    public String f2046b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2047c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f2048d = null;

    public e(String str, String str2) {
        this.f2045a = str;
        this.f2046b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f2045a, eVar.f2045a) && l.a(this.f2046b, eVar.f2046b) && this.f2047c == eVar.f2047c && l.a(this.f2048d, eVar.f2048d);
    }

    public final int hashCode() {
        int i = (L1.a.i(this.f2045a.hashCode() * 31, 31, this.f2046b) + (this.f2047c ? 1231 : 1237)) * 31;
        d dVar = this.f2048d;
        return i + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f2048d + ", isShowingSubstitution=" + this.f2047c + ')';
    }
}
