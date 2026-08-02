package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: kotlinx.serialization.modules.a$a, reason: collision with other inner class name */
    public static final class C0164a extends a {
        public final kotlinx.serialization.b<?> a;

        public C0164a(kotlinx.serialization.b<?> serializer) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            this.a = serializer;
        }

        @Override // kotlinx.serialization.modules.a
        public final kotlinx.serialization.b<?> a(List<? extends kotlinx.serialization.b<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.a;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C0164a) && Intrinsics.areEqual(((C0164a) obj).a, this.a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class b extends a {
        public final Function1<List<? extends kotlinx.serialization.b<?>>, kotlinx.serialization.b<?>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super List<? extends kotlinx.serialization.b<?>>, ? extends kotlinx.serialization.b<?>> provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.a = provider;
        }

        @Override // kotlinx.serialization.modules.a
        public final kotlinx.serialization.b<?> a(List<? extends kotlinx.serialization.b<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.a.invoke(typeArgumentsSerializers);
        }
    }

    public abstract kotlinx.serialization.b<?> a(List<? extends kotlinx.serialization.b<?>> list);
}
