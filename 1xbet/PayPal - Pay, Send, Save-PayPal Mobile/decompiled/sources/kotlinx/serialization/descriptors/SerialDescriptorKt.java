package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "getElementDescriptors", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Iterable;", "elementDescriptors", "", "getElementNames", "elementNames"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SerialDescriptorKt {
    public static final java.lang.Iterable<kotlinx.serialization.descriptors.SerialDescriptor> getElementDescriptors(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return new kotlinx.serialization.descriptors.SerialDescriptorKt$special$$inlined$Iterable$1(serialDescriptor);
    }

    public static final java.lang.Iterable<java.lang.String> getElementNames(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return new kotlinx.serialization.descriptors.SerialDescriptorKt$special$$inlined$Iterable$2(serialDescriptor);
    }
}
