package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.n;

@SourceDebugExtension({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/ListLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/* renamed from: kotlinx.serialization.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1132d0 implements kotlinx.serialization.descriptors.f {
    public final kotlinx.serialization.descriptors.f a;

    public AbstractC1132d0(kotlinx.serialization.descriptors.f fVar) {
        this.a = fVar;
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
        throw new IllegalArgumentException(androidx.compose.runtime.changelist.d.b(name, " is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int d() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1132d0)) {
            return false;
        }
        AbstractC1132d0 abstractC1132d0 = (AbstractC1132d0) obj;
        return Intrinsics.areEqual(this.a, abstractC1132d0.a) && Intrinsics.areEqual(h(), abstractC1132d0.h());
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> f(int i) {
        if (i >= 0) {
            return CollectionsKt.emptyList();
        }
        StringBuilder c = androidx.collection.g.c(i, "Illegal index ", ", ");
        c.append(h());
        c.append(" expects only non-negative indices");
        throw new IllegalArgumentException(c.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.f g(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder c = androidx.collection.g.c(i, "Illegal index ", ", ");
        c.append(h());
        c.append(" expects only non-negative indices");
        throw new IllegalArgumentException(c.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.m getKind() {
        return n.b.a;
    }

    public final int hashCode() {
        return h().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder c = androidx.collection.g.c(i, "Illegal index ", ", ");
        c.append(h());
        c.append(" expects only non-negative indices");
        throw new IllegalArgumentException(c.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return h() + '(' + this.a + ')';
    }
}
