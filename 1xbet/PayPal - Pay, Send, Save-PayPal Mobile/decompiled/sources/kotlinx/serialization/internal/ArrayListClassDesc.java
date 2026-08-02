package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/serialization/internal/ArrayListClassDesc;", "Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDesc", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getSerialName", "()Ljava/lang/String;", "serialName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ArrayListClassDesc extends kotlinx.serialization.internal.ListLikeDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayListClassDesc(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String getSerialName() {
        return kotlinx.serialization.internal.CollectionDescriptorsKt.ARRAY_LIST_NAME;
    }
}
