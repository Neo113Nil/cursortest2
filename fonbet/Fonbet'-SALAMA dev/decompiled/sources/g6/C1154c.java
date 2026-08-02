package g6;

import W5.AbstractC0486a1;
import java.util.RandomAccess;

/* renamed from: g6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1154c extends AbstractC1155d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1155d f13292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13294c;

    public C1154c(AbstractC1155d abstractC1155d, int i7, int i8) {
        t6.h.e(abstractC1155d, "list");
        this.f13292a = abstractC1155d;
        this.f13293b = i7;
        P6.b.b(i7, i8, abstractC1155d.l());
        this.f13294c = i8 - i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i8 = this.f13294c;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        return this.f13292a.get(this.f13293b + i7);
    }

    @Override // g6.AbstractC1155d
    public final int l() {
        return this.f13294c;
    }
}
