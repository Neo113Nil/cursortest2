package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", kotlinx.serialization.json.internal.TreeJsonEncoderKt.PRIMITIVE_TAG, "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "serialName", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PrimitiveArrayDescriptor extends kotlinx.serialization.internal.ListLikeDescriptor {
    private final java.lang.String serialName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArrayDescriptor(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(serialDescriptor.getSerialName());
        sb.append("Array");
        this.serialName = sb.toString();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String getSerialName() {
        return this.serialName;
    }
}
