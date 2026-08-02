package S0;

import Hj0.C3156m;
import gd.InterfaceC6712a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.d1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3950d1 implements Iterable<Object>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3947c1 f25375a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25376b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25377c;

    public C3950d1(@NotNull C3947c1 c3947c1, int i11, int i12) {
        this.f25375a = c3947c1;
        this.f25376b = i11;
        this.f25377c = i12;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Object> iterator() {
        C3947c1 c3947c1 = this.f25375a;
        if (c3947c1.u() != this.f25377c) {
            throw new ConcurrentModificationException();
        }
        int i11 = this.f25376b;
        V D11 = c3947c1.D(i11);
        return D11 != null ? new w1(c3947c1, i11, D11, new C3948d(0)) : new U(c3947c1, i11 + 1, C3156m.d(c3947c1.o(), i11) + i11);
    }
}
