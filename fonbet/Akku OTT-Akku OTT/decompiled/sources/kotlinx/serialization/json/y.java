package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.descriptors.n;
import kotlinx.serialization.internal.C1126a0;
import kotlinx.serialization.internal.S0;
import kotlinx.serialization.internal.Z;

@PublishedApi
/* loaded from: classes5.dex */
public final class y implements kotlinx.serialization.b<x> {
    public static final y a = new y();
    public static final a b = a.b;

    public static final class a implements kotlinx.serialization.descriptors.f {
        public static final a b = new a();
        public static final String c = "kotlinx.serialization.json.JsonObject";
        public final /* synthetic */ Z a;

        public a() {
            kotlinx.serialization.builtins.a.d(StringCompanionObject.INSTANCE);
            S0 s0 = S0.a;
            n nVar = n.a;
            S0 kSerializer = S0.a;
            n vSerializer = n.a;
            Intrinsics.checkNotNullParameter(kSerializer, "keySerializer");
            Intrinsics.checkNotNullParameter(vSerializer, "valueSerializer");
            Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
            Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
            kotlinx.serialization.descriptors.f keyDesc = kSerializer.getDescriptor();
            kotlinx.serialization.descriptors.f valueDesc = vSerializer.getDescriptor();
            Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
            Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
            this.a = new Z("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
        }

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
            return 2;
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
            return n.c.a;
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
        kotlinx.serialization.builtins.a.d(StringCompanionObject.INSTANCE);
        S0 s0 = S0.a;
        n nVar = n.a;
        S0 keySerializer = S0.a;
        n valueSerializer = n.a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new x(new C1126a0(keySerializer, valueSerializer).deserialize(decoder));
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        x value = (x) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        p.a(encoder);
        kotlinx.serialization.builtins.a.d(StringCompanionObject.INSTANCE);
        S0 s0 = S0.a;
        n nVar = n.a;
        S0 keySerializer = S0.a;
        n valueSerializer = n.a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        new C1126a0(keySerializer, valueSerializer).serialize(encoder, value);
    }
}
