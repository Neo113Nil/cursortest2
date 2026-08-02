package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class M0 implements kotlinx.serialization.descriptors.f, InterfaceC1151n {
    public final kotlinx.serialization.descriptors.f a;
    public final String b;
    public final Set<String> c;

    public M0(kotlinx.serialization.descriptors.f original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.a = original;
        this.b = original.h() + '?';
        this.c = C1175z0.a(original);
    }

    @Override // kotlinx.serialization.internal.InterfaceC1151n
    public final Set<String> a() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int d() {
        return this.a.d();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M0) {
            return Intrinsics.areEqual(this.a, ((M0) obj).a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> f(int i) {
        return this.a.f(i);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.f g(int i) {
        return this.a.g(i);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.m getKind() {
        return this.a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean i(int i) {
        return this.a.i(i);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
