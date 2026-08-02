package H5;

import J5.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f10617a;

    /* renamed from: b, reason: collision with root package name */
    private final char f10618b;

    /* renamed from: c, reason: collision with root package name */
    private final double f10619c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10620d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10621e;

    public d(ArrayList arrayList, char c11, double d11, String str, String str2) {
        this.f10617a = arrayList;
        this.f10618b = c11;
        this.f10619c = d11;
        this.f10620d = str;
        this.f10621e = str2;
    }

    public static int c(char c11, String str, String str2) {
        return str2.hashCode() + G.g.a(c11 * 31, 31, str);
    }

    public final List<q> a() {
        return this.f10617a;
    }

    public final double b() {
        return this.f10619c;
    }

    public final int hashCode() {
        return c(this.f10618b, this.f10621e, this.f10620d);
    }
}
