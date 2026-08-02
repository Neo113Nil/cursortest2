package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.n;
import kotlinx.serialization.internal.C1133e;

@PublishedApi
/* loaded from: classes5.dex */
public final class d implements kotlinx.serialization.b<c> {
    public static final d a = new d();
    public static final a b = a.b;

    public static final class a implements kotlinx.serialization.descriptors.f {
        public static final a b = new a();
        public static final String c = "kotlinx.serialization.json.JsonArray";
        public final /* synthetic */ C1133e a = kotlinx.serialization.builtins.a.b(n.a).b;

        @Override // kotlinx.serialization.descriptors.f
        public final boolean b() {
            this.a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.f
        public final int c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.a.c(name);
        }

        @Override // kotlinx.serialization.descriptors.f
        public final int d() {
            this.a.getClass();
            return 1;
        }

        @Override // kotlinx.serialization.descriptors.f
        public final String e(int i) {
            this.a.getClass();
            return String.valueOf(i);
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
            this.a.getClass();
            return CollectionsKt.emptyList();
        }

        @Override // kotlinx.serialization.descriptors.f
        public final kotlinx.serialization.descriptors.m getKind() {
            this.a.getClass();
            return n.b.a;
        }

        @Override // kotlinx.serialization.descriptors.f
        public final String h() {
            return c;
        }

        @Override // kotlinx.serialization.descriptors.f
        public final boolean i(int i) {
            this.a.i(i);
            return false;
        }

        @Override // kotlinx.serialization.descriptors.f
        public final boolean isInline() {
            this.a.getClass();
            return false;
        }
    }

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        p.b(decoder);
        return new c((List) kotlinx.serialization.builtins.a.b(n.a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        c value = (c) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        p.a(encoder);
        kotlinx.serialization.builtins.a.b(n.a).serialize(encoder, value);
    }
}
