package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0001H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\u00028\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/serialization/internal/CollectionSerializer;", "E", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "B", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/KSerializer;", "element", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "collectionSize", "(Ljava/util/Collection;)I", "", "collectionIterator", "(Ljava/util/Collection;)Ljava/util/Iterator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CollectionSerializer<E, C extends java.util.Collection<? extends E>, B> extends kotlinx.serialization.internal.CollectionLikeSerializer<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSerializer(kotlinx.serialization.KSerializer<E> kSerializer) {
        super(kSerializer, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(C c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        return c.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public java.util.Iterator<E> collectionIterator(C c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        return c.iterator();
    }
}
