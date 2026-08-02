package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.n;

/* renamed from: kotlinx.serialization.internal.p0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1156p0 implements kotlinx.serialization.descriptors.f {
    public static final C1156p0 a = new C1156p0();
    public static final n.d b = n.d.a;
    public static final String c = "kotlin.Nothing";

    @Override // kotlinx.serialization.descriptors.f
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int d() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String e(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> f(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.f g(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.m getKind() {
        return b;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String h() {
        return c;
    }

    public final int hashCode() {
        return (b.hashCode() * 31) + c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean i(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
