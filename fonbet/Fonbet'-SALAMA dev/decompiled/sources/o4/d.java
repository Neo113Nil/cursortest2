package o4;

import q4.k;
import s4.g;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f15605d = new d(1, null, false);

    /* renamed from: e, reason: collision with root package name */
    public static final d f15606e = new d(2, null, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f15607a;

    /* renamed from: b, reason: collision with root package name */
    public final g f15608b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15609c;

    public d(int i7, g gVar, boolean z4) {
        this.f15607a = i7;
        this.f15608b = gVar;
        this.f15609c = z4;
        k.c(!z4 || i7 == 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperationSource{source=");
        int i7 = this.f15607a;
        sb.append(i7 != 1 ? i7 != 2 ? "null" : "Server" : "User");
        sb.append(", queryParams=");
        sb.append(this.f15608b);
        sb.append(", tagged=");
        sb.append(this.f15609c);
        sb.append('}');
        return sb.toString();
    }
}
