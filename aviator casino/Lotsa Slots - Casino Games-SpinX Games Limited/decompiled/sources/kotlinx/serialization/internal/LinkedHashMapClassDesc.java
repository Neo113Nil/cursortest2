package kotlinx.serialization.internal;

/* compiled from: CollectionDescriptors.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/LinkedHashMapClassDesc;", "Lkotlinx/serialization/internal/MapLikeDescriptor;", "keyDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "valueDesc", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkedHashMapClassDesc extends kotlinx.serialization.internal.MapLikeDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedHashMapClassDesc(kotlinx.serialization.descriptors.SerialDescriptor keyDesc, kotlinx.serialization.descriptors.SerialDescriptor valueDesc) {
        super(kotlinx.serialization.internal.CollectionDescriptorsKt.LINKED_HASH_MAP_NAME, keyDesc, valueDesc, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
    }
}
