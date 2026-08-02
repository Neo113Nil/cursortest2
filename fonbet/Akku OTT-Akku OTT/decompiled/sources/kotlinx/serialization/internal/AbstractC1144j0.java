package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.n;

@SourceDebugExtension({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/MapLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/* renamed from: kotlinx.serialization.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1144j0 implements kotlinx.serialization.descriptors.f {
    public final String a;
    public final kotlinx.serialization.descriptors.f b;
    public final kotlinx.serialization.descriptors.f c;

    public AbstractC1144j0(String str, kotlinx.serialization.descriptors.f fVar, kotlinx.serialization.descriptors.f fVar2) {
        this.a = str;
        this.b = fVar;
        this.c = fVar2;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(androidx.compose.runtime.changelist.d.b(name, " is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int d() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1144j0)) {
            return false;
        }
        AbstractC1144j0 abstractC1144j0 = (AbstractC1144j0) obj;
        return Intrinsics.areEqual(this.a, abstractC1144j0.a) && Intrinsics.areEqual(this.b, abstractC1144j0.b) && Intrinsics.areEqual(this.c, abstractC1144j0.c);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> f(int i) {
        if (i >= 0) {
            return CollectionsKt.emptyList();
        }
        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(androidx.collection.g.c(i, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.f g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.a.a(androidx.collection.g.c(i, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.m getKind() {
        return n.c.a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(androidx.collection.g.c(i, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
