package Ve;

import B90.C2618u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Jj {

    /* renamed from: a, reason: collision with root package name */
    public final String f29298a;

    /* renamed from: b, reason: collision with root package name */
    public final List f29299b;

    /* renamed from: c, reason: collision with root package name */
    public final List f29300c;

    public Jj(String resultString, List links, List substringIndexes) {
        Intrinsics.checkNotNullParameter(resultString, "resultString");
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(substringIndexes, "substringIndexes");
        this.f29298a = resultString;
        this.f29299b = links;
        this.f29300c = substringIndexes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static Jj a(Jj jj2, String resultString, ArrayList arrayList, ArrayList arrayList2, int i11) {
        if ((i11 & 1) != 0) {
            resultString = jj2.f29298a;
        }
        ArrayList links = arrayList;
        if ((i11 & 2) != 0) {
            links = jj2.f29299b;
        }
        ArrayList substringIndexes = arrayList2;
        if ((i11 & 4) != 0) {
            substringIndexes = jj2.f29300c;
        }
        jj2.getClass();
        Intrinsics.checkNotNullParameter(resultString, "resultString");
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(substringIndexes, "substringIndexes");
        return new Jj(resultString, links, substringIndexes);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jj)) {
            return false;
        }
        Jj jj2 = (Jj) obj;
        return Intrinsics.d(this.f29298a, jj2.f29298a) && Intrinsics.d(this.f29299b, jj2.f29299b) && Intrinsics.d(this.f29300c, jj2.f29300c);
    }

    public final int hashCode() {
        return this.f29300c.hashCode() + G.g.b(this.f29298a.hashCode() * 31, 31, this.f29299b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParsedStringData(resultString=");
        sb2.append(this.f29298a);
        sb2.append(", links=");
        sb2.append(this.f29299b);
        sb2.append(", substringIndexes=");
        return C2618u.h(sb2, this.f29300c, ")");
    }
}
