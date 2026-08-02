package Oe;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class T implements Me.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f20270a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Me.e f20271b;

    public T(@NotNull String serialName, @NotNull Me.e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f20270a = serialName;
        this.f20271b = kind;
    }

    @Override // Me.f
    public final boolean b() {
        return false;
    }

    @Override // Me.f
    @NotNull
    public final Me.f c(int i11) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // Me.f
    public final int d() {
        return 0;
    }

    @Override // Me.f
    @NotNull
    public final String e(int i11) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t2 = (T) obj;
        if (Intrinsics.d(this.f20270a, t2.f20270a)) {
            if (Intrinsics.d(this.f20271b, t2.f20271b)) {
                return true;
            }
        }
        return false;
    }

    @Override // Me.f
    @NotNull
    public final String f() {
        return this.f20270a;
    }

    @Override // Me.f
    @NotNull
    public final List<Annotation> getAnnotations() {
        return kotlin.collections.K.f71697a;
    }

    @Override // Me.f
    public final Me.m getKind() {
        return this.f20271b;
    }

    public final int hashCode() {
        return (this.f20271b.hashCode() * 31) + this.f20270a.hashCode();
    }

    @Override // Me.f
    public final boolean isInline() {
        return false;
    }

    @NotNull
    public final String toString() {
        return B3.D.c(new StringBuilder("PrimitiveDescriptor("), this.f20270a, ')');
    }
}
