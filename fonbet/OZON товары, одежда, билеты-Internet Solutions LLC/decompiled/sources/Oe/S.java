package Oe;

import Le.InterfaceC3583a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class S<Element, Array, Builder> extends AbstractC3693l<Element, Array, Builder> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q f20269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(@NotNull InterfaceC3583a<Element> primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f20269b = new Q(primitiveSerializer.b());
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return this.f20269b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oe.AbstractC3693l, Le.f
    public final void c(@NotNull Ne.a encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int e11 = e(obj);
        Q q11 = this.f20269b;
        Ne.b C11 = encoder.C(q11);
        f(C11, obj, e11);
        C11.B(q11);
    }

    @Override // Oe.AbstractC3682a
    @NotNull
    protected final Iterator<Element> d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    protected abstract void f(@NotNull Ne.b bVar, Array array, int i11);
}
