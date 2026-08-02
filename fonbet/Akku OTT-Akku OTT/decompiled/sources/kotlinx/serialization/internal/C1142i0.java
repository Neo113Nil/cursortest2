package kotlinx.serialization.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.descriptors.n;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1142i0<K, V> extends Y<K, V, Map.Entry<? extends K, ? extends V>> {
    public final kotlinx.serialization.descriptors.i c;

    /* renamed from: kotlinx.serialization.internal.i0$a */
    public static final class a<K, V> implements Map.Entry<K, V>, KMappedMarker {
        public final K a;
        public final V b;

        public a(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.a;
            int hashCode = (k == null ? 0 : k.hashCode()) * 31;
            V v = this.b;
            return hashCode + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            return "MapEntry(key=" + this.a + ", value=" + this.b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142i0(final kotlinx.serialization.b<K> keySerializer, final kotlinx.serialization.b<V> valueSerializer) {
        super(keySerializer, valueSerializer);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.c = kotlinx.serialization.descriptors.l.c("kotlin.collections.Map.Entry", n.c.a, new kotlinx.serialization.descriptors.f[0], new Function1() { // from class: kotlinx.serialization.internal.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kotlinx.serialization.descriptors.a buildSerialDescriptor = (kotlinx.serialization.descriptors.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.a(Constants.KEY, kotlinx.serialization.b.this.getDescriptor(), CollectionsKt.emptyList());
                buildSerialDescriptor.a("value", valueSerializer.getDescriptor(), CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
        });
    }

    @Override // kotlinx.serialization.internal.Y
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @Override // kotlinx.serialization.internal.Y
    public final Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.internal.Y
    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return this.c;
    }
}
