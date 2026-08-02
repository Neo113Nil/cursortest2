package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class c implements f {
    public final i a;

    @JvmField
    public final KClass<?> b;
    public final String c;

    public c(i original, KClass kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.a = original;
        this.b = kClass;
        this.c = original.a + Typography.less + kClass.getSimpleName() + Typography.greater;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int d() {
        return this.a.c;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String e(int i) {
        return this.a.f[i];
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(cVar.b, this.b);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> f(int i) {
        return this.a.h[i];
    }

    @Override // kotlinx.serialization.descriptors.f
    public final f g(int i) {
        return this.a.g[i];
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> getAnnotations() {
        return this.a.d;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final m getKind() {
        return this.a.b;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean i(int i) {
        return this.a.i[i];
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
