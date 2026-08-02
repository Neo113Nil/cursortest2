package l4;

import X3.y;
import java.util.NoSuchElementException;

/* renamed from: l4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2061c extends y {

    /* renamed from: k, reason: collision with root package name */
    public final int f17854k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17855l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17856m;

    /* renamed from: n, reason: collision with root package name */
    public int f17857n;

    public C2061c(int i, int i5, int i6) {
        this.f17854k = i6;
        this.f17855l = i5;
        boolean z3 = false;
        if (i6 <= 0 ? i >= i5 : i <= i5) {
            z3 = true;
        }
        this.f17856m = z3;
        this.f17857n = z3 ? i : i5;
    }

    @Override // X3.y
    public final int a() {
        int i = this.f17857n;
        if (i != this.f17855l) {
            this.f17857n = this.f17854k + i;
            return i;
        }
        if (!this.f17856m) {
            throw new NoSuchElementException();
        }
        this.f17856m = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17856m;
    }
}
