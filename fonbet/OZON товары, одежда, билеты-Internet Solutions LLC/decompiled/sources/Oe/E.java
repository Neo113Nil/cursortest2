package Oe;

import Me.n;
import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class E implements Me.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final E f20242a = new E();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final n.d f20243b = n.d.f17938a;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f20244c = "kotlin.Nothing";

    @Override // Me.f
    public final boolean b() {
        return false;
    }

    @Override // Me.f
    @NotNull
    public final Me.f c(int i11) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // Me.f
    public final int d() {
        return 0;
    }

    @Override // Me.f
    @NotNull
    public final String e(int i11) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // Me.f
    @NotNull
    public final String f() {
        return f20244c;
    }

    @Override // Me.f
    @NotNull
    public final List<Annotation> getAnnotations() {
        return kotlin.collections.K.f71697a;
    }

    @Override // Me.f
    @NotNull
    public final Me.m getKind() {
        return f20243b;
    }

    public final int hashCode() {
        return (f20243b.hashCode() * 31) + f20244c.hashCode();
    }

    @Override // Me.f
    public final boolean isInline() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
