package Oe;

import Me.n;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class C implements Me.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Me.f f20238a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Me.f f20239b;

    public C(Me.f fVar, Me.f fVar2) {
        this.f20238a = fVar;
        this.f20239b = fVar2;
    }

    @Override // Me.f
    public final boolean b() {
        return false;
    }

    @Override // Me.f
    @NotNull
    public final Me.f c(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(T7.E.a(i11, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i12 = i11 % 2;
        if (i12 == 0) {
            return this.f20238a;
        }
        if (i12 == 1) {
            return this.f20239b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // Me.f
    public final int d() {
        return 2;
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
        if (!(obj instanceof C)) {
            return false;
        }
        C c11 = (C) obj;
        c11.getClass();
        return Intrinsics.d(this.f20238a, c11.f20238a) && Intrinsics.d(this.f20239b, c11.f20239b);
    }

    @Override // Me.f
    @NotNull
    public final String f() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // Me.f
    @NotNull
    public final List<Annotation> getAnnotations() {
        return kotlin.collections.K.f71697a;
    }

    @Override // Me.f
    @NotNull
    public final Me.m getKind() {
        return n.c.f17937a;
    }

    public final int hashCode() {
        return this.f20239b.hashCode() + ((this.f20238a.hashCode() + 710441009) * 31);
    }

    @Override // Me.f
    public final boolean isInline() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f20238a + ", " + this.f20239b + ')';
    }
}
