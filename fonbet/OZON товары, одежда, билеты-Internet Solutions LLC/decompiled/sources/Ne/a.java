package Ne;

import Le.InterfaceC3583a;
import Me.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class a implements c, b {
    @Override // Ne.c
    public abstract void A(char c11);

    @NotNull
    public final b C(@NotNull f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return e(descriptor);
    }

    public abstract void D(@NotNull f fVar, int i11);

    @Override // Ne.c
    public abstract void a(byte b11);

    @Override // Ne.b
    public final void b(@NotNull f descriptor, int i11, double d11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i11);
        s(d11);
    }

    @Override // Ne.c
    @NotNull
    public abstract c c(@NotNull f fVar);

    @Override // Ne.b
    public final void d(@NotNull f descriptor, int i11, long j11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i11);
        v(j11);
    }

    @Override // Ne.b
    public final void f(@NotNull f descriptor, int i11, short s11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i11);
        g(s11);
    }

    @Override // Ne.c
    public abstract void g(short s11);

    @Override // Ne.c
    public abstract void h(boolean z11);

    @Override // Ne.c
    public abstract void i(float f7);

    @Override // Ne.b
    public final void k(@NotNull f descriptor, int i11, @NotNull String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        D(descriptor, i11);
        q(value);
    }

    @Override // Ne.b
    public final void l(@NotNull f descriptor, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i11);
        h(z11);
    }

    @Override // Ne.c
    public abstract void m(int i11);

    @Override // Ne.b
    public final void n(@NotNull f descriptor, int i11, float f7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i11);
        i(f7);
    }

    @Override // Ne.b
    public final void o(int i11, int i12, @NotNull f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i11);
        m(i12);
    }

    @Override // Ne.b
    public final void p(@NotNull f descriptor, int i11, char c11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i11);
        A(c11);
    }

    @Override // Ne.c
    public abstract void q(@NotNull String str);

    @Override // Ne.c
    public abstract <T> void r(@NotNull Le.f<? super T> fVar, T t2);

    @Override // Ne.c
    public abstract void s(double d11);

    @Override // Ne.b
    public void t(@NotNull f descriptor, int i11, @NotNull InterfaceC3583a serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        D(descriptor, i11);
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (serializer.b().b()) {
            r(serializer, obj);
        } else if (obj == null) {
            x();
        } else {
            r(serializer, obj);
        }
    }

    @Override // Ne.b
    public final <T> void u(@NotNull f descriptor, int i11, @NotNull Le.f<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        D(descriptor, i11);
        r(serializer, t2);
    }

    @Override // Ne.c
    public abstract void v(long j11);

    @Override // Ne.b
    @NotNull
    public final c w(@NotNull f descriptor, int i11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i11);
        return c(descriptor.c(i11));
    }

    @Override // Ne.b
    public final void y(@NotNull f descriptor, int i11, byte b11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i11);
        a(b11);
    }
}
