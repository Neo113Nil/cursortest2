package Y0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34516a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34517b;

    public a(Object obj, Object obj2) {
        this.f34516a = obj;
        this.f34517b = obj2;
    }

    public final boolean a() {
        return this.f34517b != Z0.b.f35315a;
    }

    public final boolean b() {
        return this.f34516a != Z0.b.f35315a;
    }

    public final Object c() {
        return this.f34517b;
    }

    public final Object d() {
        return this.f34516a;
    }

    @NotNull
    public final a e(Object obj) {
        return new a(this.f34516a, obj);
    }

    @NotNull
    public final a f(Object obj) {
        return new a(obj, this.f34517b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a() {
        this(r0, r0);
        Z0.b bVar = Z0.b.f35315a;
    }
}
