package kotlinx.serialization.internal;

/* compiled from: InlineClassDescriptor.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0013\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/serialization/internal/InlineClassDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "name", "", "generatedSerializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;)V", "isInline", "", "()Z", "hashCode", "", "equals", "other", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InlineClassDescriptor extends kotlinx.serialization.internal.PluginGeneratedSerialDescriptor {
    private final boolean isInline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassDescriptor(java.lang.String name, kotlinx.serialization.internal.GeneratedSerializer<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.isInline = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline, reason: from getter */
    public boolean getIsInline() {
        return this.isInline;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(java.lang.Object other) {
        int i;
        kotlinx.serialization.internal.InlineClassDescriptor inlineClassDescriptor = this;
        if (inlineClassDescriptor == other) {
            return true;
        }
        if (other instanceof kotlinx.serialization.internal.InlineClassDescriptor) {
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(inlineClassDescriptor.getSerialName(), serialDescriptor.getSerialName())) {
                kotlinx.serialization.internal.InlineClassDescriptor inlineClassDescriptor2 = (kotlinx.serialization.internal.InlineClassDescriptor) other;
                if (inlineClassDescriptor2.getIsInline() && java.util.Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), inlineClassDescriptor2.getTypeParameterDescriptors$kotlinx_serialization_core()) && inlineClassDescriptor.getElementsCount() == serialDescriptor.getElementsCount()) {
                    int elementsCount = inlineClassDescriptor.getElementsCount();
                    while (i < elementsCount) {
                        i = (kotlin.jvm.internal.Intrinsics.areEqual(inlineClassDescriptor.getElementDescriptor(i).getSerialName(), serialDescriptor.getElementDescriptor(i).getSerialName()) && kotlin.jvm.internal.Intrinsics.areEqual(inlineClassDescriptor.getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
