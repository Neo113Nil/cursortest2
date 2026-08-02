package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements kotlinx.serialization.descriptors.f {
    public final Lazy a;

    public o(Function0<? extends kotlinx.serialization.descriptors.f> function0) {
        this.a = LazyKt.lazy(function0);
    }

    public final kotlinx.serialization.descriptors.f a() {
        return (kotlinx.serialization.descriptors.f) this.a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return a().c(name);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int d() {
        return a().d();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String e(int i) {
        return a().e(i);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> f(int i) {
        return a().f(i);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.f g(int i) {
        return a().g(i);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.m getKind() {
        return a().getKind();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String h() {
        return a().h();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean i(int i) {
        return a().i(i);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean isInline() {
        return false;
    }
}
