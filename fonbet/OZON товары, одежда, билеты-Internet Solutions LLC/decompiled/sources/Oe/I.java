package Oe;

import Le.InterfaceC3583a;
import Me.C3618a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class I<T> implements InterfaceC3583a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private kotlin.collections.K f20250a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f20251b;

    public I(@NotNull Unit objectInstance) {
        Intrinsics.checkNotNullParameter("kotlin.Unit", "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f20250a = kotlin.collections.K.f71697a;
        this.f20251b = Sc.k.a(Sc.n.PUBLICATION, new D90.a(this, 1));
    }

    public static Unit d(I i11, C3618a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.g(i11.f20250a);
        return Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return (Me.f) this.f20251b.getValue();
    }

    @Override // Le.f
    public final void c(@NotNull Ne.a encoder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.e(b()).B(b());
    }
}
