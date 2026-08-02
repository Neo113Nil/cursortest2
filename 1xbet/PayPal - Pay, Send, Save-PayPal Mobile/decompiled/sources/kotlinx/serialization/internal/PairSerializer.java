package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014"}, d2 = {"Lkotlinx/serialization/internal/PairSerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "Lkotlin/Pair;", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKey", "(Lkotlin/Pair;)Ljava/lang/Object;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PairSerializer<K, V> extends kotlinx.serialization.internal.KeyValueSerializer<K, V, kotlin.Pair<? extends K, ? extends V>> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer(final kotlinx.serialization.KSerializer<K> kSerializer, final kotlinx.serialization.KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer2, "");
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Pair", new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.internal.PairSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.serialization.internal.PairSerializer.$r8$lambda$PyYh3K_WyfkMELTGMAMFhINXUbo(kotlinx.serialization.KSerializer.this, kSerializer2, (kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final /* bridge */ /* synthetic */ java.lang.Object toResult(java.lang.Object obj, java.lang.Object obj2) {
        return toResult((kotlinx.serialization.internal.PairSerializer<K, V>) obj, obj2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final K getKey(kotlin.Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        return pair.getFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final V getValue(kotlin.Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        return pair.getSecond();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    protected final kotlin.Pair<K, V> toResult(K key, V value) {
        return kotlin.TuplesKt.to(key, value);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PyYh3K_WyfkMELTGMAMFhINXUbo(kotlinx.serialization.KSerializer kSerializer, kotlinx.serialization.KSerializer kSerializer2, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "first", kSerializer.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "second", kSerializer2.getDescriptor(), null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }
}
