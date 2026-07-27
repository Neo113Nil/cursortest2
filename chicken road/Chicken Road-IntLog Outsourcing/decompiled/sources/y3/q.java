package y3;

import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final class q implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public int f12427a;

    /* renamed from: b, reason: collision with root package name */
    public int f12428b;

    /* renamed from: c, reason: collision with root package name */
    public n f12429c;

    /* renamed from: d, reason: collision with root package name */
    public g f12430d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int b6 = this.f12430d.b();
        int d6 = this.f12429c.d(obj, obj2, this.f12430d);
        this.f12430d.f12398c[b6] = d6;
        this.f12427a = C1569c.b(d6) + this.f12428b + d6 + this.f12427a;
    }
}
