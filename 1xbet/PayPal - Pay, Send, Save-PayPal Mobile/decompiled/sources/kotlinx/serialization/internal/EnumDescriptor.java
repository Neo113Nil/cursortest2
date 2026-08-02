package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "index", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnumDescriptor extends kotlinx.serialization.internal.PluginGeneratedSerialDescriptor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.serialization.descriptors.SerialKind kind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(final java.lang.String str, final int i) {
        super(str, null, i, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.kind = kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.EnumDescriptor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.serialization.internal.EnumDescriptor.$r8$lambda$h6F9M2HXWZjok_R71paEwKzi_qo(i, str, this);
            }
        });
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialKind getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof kotlinx.serialization.descriptors.SerialDescriptor)) {
            return false;
        }
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) other;
        return serialDescriptor.getKind() == kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoSizes(), serialDescriptor.getGetHighSpeedVideoSizes()) && kotlin.jvm.internal.Intrinsics.areEqual(kotlinx.serialization.internal.Platform_commonKt.cachedSerialNames(this), kotlinx.serialization.internal.Platform_commonKt.cachedSerialNames(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getGetHighSpeedVideoSizes());
        sb.append('(');
        return kotlin.collections.CollectionsKt.joinToString$default(kotlinx.serialization.descriptors.SerialDescriptorKt.getElementNames(this), ", ", sb.toString(), ")", 0, null, null, 56, null);
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int hashCode = getGetHighSpeedVideoSizes().hashCode();
        java.util.Iterator<java.lang.String> it = kotlinx.serialization.descriptors.SerialDescriptorKt.getElementNames(this).iterator();
        int i = 1;
        while (it.hasNext()) {
            java.lang.String next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    public static /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor[] $r8$lambda$h6F9M2HXWZjok_R71paEwKzi_qo(int i, java.lang.String str, kotlinx.serialization.internal.EnumDescriptor enumDescriptor) {
        kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr = new kotlinx.serialization.descriptors.SerialDescriptor[i];
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(enumDescriptor.getElementName(i2));
            serialDescriptorArr[i2] = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor$default(sb.toString(), kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 8, null);
        }
        return serialDescriptorArr;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
        return ((kotlinx.serialization.descriptors.SerialDescriptor[]) this.getHighResolutionOutputSizeshNQ4ISI.getValue())[index];
    }
}
