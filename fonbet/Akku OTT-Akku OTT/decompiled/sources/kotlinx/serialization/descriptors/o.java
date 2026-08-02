package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements f {
    public final /* synthetic */ f a;

    public o(f original) {
        Intrinsics.checkNotNullParameter("kotlinx.coroutines.flow.MutableStateFlow", "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        this.a = original;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean b() {
        return this.a.b();
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

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> f(int i) {
        return this.a.f(i);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final f g(int i) {
        return this.a.g(i);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final m getKind() {
        return this.a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String h() {
        return "kotlinx.coroutines.flow.MutableStateFlow";
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean i(int i) {
        return this.a.i(i);
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean isInline() {
        return this.a.isInline();
    }
}
