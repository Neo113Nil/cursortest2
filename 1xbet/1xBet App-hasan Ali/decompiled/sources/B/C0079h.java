package B;

import n.AbstractC2107A;

/* renamed from: B.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079h {

    /* renamed from: a, reason: collision with root package name */
    public final int f675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f676b;

    /* renamed from: c, reason: collision with root package name */
    public final v3.e f677c;

    public C0079h(int i, int i5, v3.e eVar) {
        this.f675a = i;
        this.f676b = i5;
        this.f677c = eVar;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2107A.q("startIndex should be >= 0, but was ", i).toString());
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException(AbstractC2107A.q("size should be >0, but was ", i5).toString());
        }
    }
}
