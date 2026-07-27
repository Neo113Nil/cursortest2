package A4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f87a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88b;

    public c(f fVar, int i2) {
        this.f87a = fVar;
        this.f88b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // A4.f
    public final Iterator iterator() {
        return new b(this);
    }
}
