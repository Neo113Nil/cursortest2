package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/serialization/internal/NamedValueEncoder;", "Lkotlinx/serialization/internal/TaggedEncoder;", "", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "getTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "nestedName", "nested", "(Ljava/lang/String;)Ljava/lang/String;", "descriptor", "elementName", "parentName", "childName", "composeName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.InternalSerializationApi
/* loaded from: classes5.dex */
public abstract class NamedValueEncoder extends kotlinx.serialization.internal.TaggedEncoder<java.lang.String> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final java.lang.String getTag(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return nested(elementName(serialDescriptor, i));
    }

    protected final java.lang.String nested(java.lang.String nestedName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nestedName, "");
        java.lang.String currentTagOrNull = getCurrentTagOrNull();
        return composeName(currentTagOrNull != null ? currentTagOrNull : "", nestedName);
    }

    protected java.lang.String elementName(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return descriptor.getElementName(index);
    }

    protected java.lang.String composeName(java.lang.String parentName, java.lang.String childName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childName, "");
        if (parentName.length() == 0) {
            return childName;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(parentName);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(childName);
        return sb.toString();
    }
}
