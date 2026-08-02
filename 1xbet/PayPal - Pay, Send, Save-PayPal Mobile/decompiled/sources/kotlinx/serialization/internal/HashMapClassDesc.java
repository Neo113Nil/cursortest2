package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/serialization/internal/HashMapClassDesc;", "Lkotlinx/serialization/internal/MapLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDesc", "valueDesc", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HashMapClassDesc extends kotlinx.serialization.internal.MapLikeDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashMapClassDesc(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor2) {
        super(kotlinx.serialization.internal.CollectionDescriptorsKt.HASH_MAP_NAME, serialDescriptor, serialDescriptor2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor2, "");
    }
}
