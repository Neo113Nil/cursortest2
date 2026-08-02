package S0;

import gd.InterfaceC6712a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class y1 implements Iterable<Object>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3947c1 f25590a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25591b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final V f25592c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final T0 f25593d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Iterable<Object> f25594e;

    public y1(@NotNull C3947c1 c3947c1, int i11, @NotNull V v11, @NotNull T0 t02) {
        this.f25590a = c3947c1;
        this.f25591b = i11;
        this.f25592c = v11;
        this.f25593d = t02;
        v11.getClass();
        this.f25594e = this;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Object> iterator() {
        return new w1(this.f25590a, this.f25591b, this.f25592c, this.f25593d);
    }
}
