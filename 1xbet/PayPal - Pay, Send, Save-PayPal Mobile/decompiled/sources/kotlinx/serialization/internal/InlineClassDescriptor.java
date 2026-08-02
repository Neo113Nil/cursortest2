package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\r8\u0017X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012"}, d2 = {"Lkotlinx/serialization/internal/InlineClassDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "name", "Lkotlinx/serialization/internal/GeneratedSerializer;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isInline", "Z", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InlineClassDescriptor extends kotlinx.serialization.internal.PluginGeneratedSerialDescriptor {
    private final boolean isInline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassDescriptor(java.lang.String str, kotlinx.serialization.internal.GeneratedSerializer<?> generatedSerializer) {
        super(str, generatedSerializer, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generatedSerializer, "");
        this.isInline = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline, reason: from getter */
    public final boolean getIsInline() {
        return this.isInline;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(java.lang.Object other) {
        kotlinx.serialization.internal.InlineClassDescriptor inlineClassDescriptor = this;
        if (inlineClassDescriptor == other) {
            return true;
        }
        if (!(other instanceof kotlinx.serialization.internal.InlineClassDescriptor)) {
            return false;
        }
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) other;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(inlineClassDescriptor.getSerialName(), serialDescriptor.getSerialName())) {
            return false;
        }
        kotlinx.serialization.internal.InlineClassDescriptor inlineClassDescriptor2 = (kotlinx.serialization.internal.InlineClassDescriptor) other;
        if (!inlineClassDescriptor2.getIsInline() || !java.util.Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), inlineClassDescriptor2.getTypeParameterDescriptors$kotlinx_serialization_core()) || inlineClassDescriptor.getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = inlineClassDescriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(inlineClassDescriptor.getElementDescriptor(i).getSerialName(), serialDescriptor.getElementDescriptor(i).getSerialName()) || !kotlin.jvm.internal.Intrinsics.areEqual(inlineClassDescriptor.getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) {
                return false;
            }
        }
        return true;
    }
}
