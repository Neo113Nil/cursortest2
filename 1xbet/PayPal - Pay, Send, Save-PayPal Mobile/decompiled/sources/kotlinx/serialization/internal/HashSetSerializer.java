package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lkotlinx/serialization/internal/HashSetSerializer;", "E", "Lkotlinx/serialization/internal/CollectionSerializer;", "", "Ljava/util/HashSet;", "Lkotlin/collections/getHighSpeedVideoSizesFor;", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "builder", "()Ljava/util/HashSet;", "", "builderSize", "(Ljava/util/HashSet;)I", "toResult", "(Ljava/util/HashSet;)Ljava/util/Set;", "toBuilder", "(Ljava/util/Set;)Ljava/util/HashSet;", io.ktor.http.ContentDisposition.Parameters.Size, "", "checkCapacity", "(Ljava/util/HashSet;I)V", "index", "element", "insert", "(Ljava/util/HashSet;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HashSetSerializer<E> extends kotlinx.serialization.internal.CollectionSerializer<E, java.util.Set<? extends E>, java.util.HashSet<E>> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashSetSerializer(kotlinx.serialization.KSerializer<E> kSerializer) {
        super(kSerializer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        this.descriptor = new kotlinx.serialization.internal.HashSetClassDesc(kSerializer.getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public final /* bridge */ /* synthetic */ void insert(java.lang.Object obj, int i, java.lang.Object obj2) {
        insert((java.util.HashSet<int>) obj, i, (int) obj2);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final java.util.HashSet<E> builder() {
        return new java.util.HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int builderSize(java.util.HashSet<E> hashSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashSet, "");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final java.util.Set<E> toResult(java.util.HashSet<E> hashSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashSet, "");
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final java.util.HashSet<E> toBuilder(java.util.Set<? extends E> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.HashSet<E> hashSet = set instanceof java.util.HashSet ? (java.util.HashSet) set : null;
        return hashSet == null ? new java.util.HashSet<>(set) : hashSet;
    }

    protected final void insert(java.util.HashSet<E> hashSet, int i, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashSet, "");
        hashSet.add(e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void checkCapacity(java.util.HashSet<E> hashSet, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashSet, "");
    }
}
