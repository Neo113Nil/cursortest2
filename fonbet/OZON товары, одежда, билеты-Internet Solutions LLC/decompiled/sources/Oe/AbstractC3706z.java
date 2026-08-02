package Oe;

import Me.n;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC3706z implements Me.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Me.f f20322a;

    public AbstractC3706z(Me.f fVar) {
        this.f20322a = fVar;
    }

    @Override // Me.f
    public final boolean b() {
        return false;
    }

    @Override // Me.f
    @NotNull
    public final Me.f c(int i11) {
        if (i11 >= 0) {
            return this.f20322a;
        }
        StringBuilder f7 = P4.f.f(i11, "Illegal index ", ", ");
        f7.append(f());
        f7.append(" expects only non-negative indices");
        throw new IllegalArgumentException(f7.toString().toString());
    }

    @Override // Me.f
    public final int d() {
        return 1;
    }

    @Override // Me.f
    @NotNull
    public final String e(int i11) {
        return String.valueOf(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3706z)) {
            return false;
        }
        AbstractC3706z abstractC3706z = (AbstractC3706z) obj;
        return Intrinsics.d(this.f20322a, abstractC3706z.f20322a) && Intrinsics.d(f(), abstractC3706z.f());
    }

    @Override // Me.f
    @NotNull
    public final List<Annotation> getAnnotations() {
        return kotlin.collections.K.f71697a;
    }

    @Override // Me.f
    @NotNull
    public final Me.m getKind() {
        return n.b.f17936a;
    }

    public final int hashCode() {
        return f().hashCode() + (this.f20322a.hashCode() * 31);
    }

    @Override // Me.f
    public final boolean isInline() {
        return false;
    }

    @NotNull
    public final String toString() {
        return f() + '(' + this.f20322a + ')';
    }
}
