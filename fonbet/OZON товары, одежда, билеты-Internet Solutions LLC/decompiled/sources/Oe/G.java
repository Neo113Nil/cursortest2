package Oe;

import Le.InterfaceC3583a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class G<T> implements InterfaceC3583a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3583a<T> f20247a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final V f20248b;

    public G(@NotNull InterfaceC3583a<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f20247a = serializer;
        this.f20248b = new V(serializer.b());
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return this.f20248b;
    }

    @Override // Le.f
    public final void c(@NotNull Ne.a encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj != null) {
            encoder.r(this.f20247a, obj);
        } else {
            encoder.x();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && G.class == obj.getClass() && Intrinsics.d(this.f20247a, ((G) obj).f20247a);
    }

    public final int hashCode() {
        return this.f20247a.hashCode();
    }
}
