package P0;

import d2.EnumC6042T;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC6042T f20606a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20607b;

    public C0(@NotNull EnumC6042T enumC6042T) {
        this.f20606a = enumC6042T;
        this.f20607b = true;
    }

    @NotNull
    public final EnumC6042T a() {
        return this.f20606a;
    }

    public final boolean b() {
        return this.f20607b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0) {
            return this.f20606a == ((C0) obj).f20606a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20607b) + (this.f20606a.hashCode() * 31);
    }

    public C0() {
        this(EnumC6042T.Inherit);
    }
}
