package Oe;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class V implements Me.f, InterfaceC3690i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Me.f f20273a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f20274b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<String> f20275c;

    public V(@NotNull Me.f original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f20273a = original;
        this.f20274b = original.f() + '?';
        this.f20275c = J.a(original);
    }

    @Override // Oe.InterfaceC3690i
    @NotNull
    public final Set<String> a() {
        return this.f20275c;
    }

    @Override // Me.f
    public final boolean b() {
        return true;
    }

    @Override // Me.f
    @NotNull
    public final Me.f c(int i11) {
        return this.f20273a.c(i11);
    }

    @Override // Me.f
    public final int d() {
        return this.f20273a.d();
    }

    @Override // Me.f
    @NotNull
    public final String e(int i11) {
        return this.f20273a.e(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V) {
            return Intrinsics.d(this.f20273a, ((V) obj).f20273a);
        }
        return false;
    }

    @Override // Me.f
    @NotNull
    public final String f() {
        return this.f20274b;
    }

    @NotNull
    public final Me.f g() {
        return this.f20273a;
    }

    @Override // Me.f
    @NotNull
    public final List<Annotation> getAnnotations() {
        return this.f20273a.getAnnotations();
    }

    @Override // Me.f
    @NotNull
    public final Me.m getKind() {
        return this.f20273a.getKind();
    }

    public final int hashCode() {
        return this.f20273a.hashCode() * 31;
    }

    @Override // Me.f
    public final boolean isInline() {
        return this.f20273a.isInline();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20273a);
        sb2.append('?');
        return sb2.toString();
    }
}
