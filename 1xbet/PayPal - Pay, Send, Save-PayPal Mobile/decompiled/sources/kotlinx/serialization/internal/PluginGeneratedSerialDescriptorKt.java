package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aP\u0010\n\u001a\u00020\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "SD", "", "other", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "otherDescriptor", "", "typeParamsAreEqual", "equalsImpl", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "", "typeParams", "", "hashCodeImpl", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "toStringImpl", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PluginGeneratedSerialDescriptorKt {
    public static final /* synthetic */ <SD extends kotlinx.serialization.descriptors.SerialDescriptor> boolean equalsImpl(SD sd, java.lang.Object obj, kotlin.jvm.functions.Function1<? super SD, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sd, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (sd == obj) {
            return true;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "SD");
        if (!(obj instanceof kotlinx.serialization.descriptors.SerialDescriptor)) {
            return false;
        }
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(sd.getGetHighSpeedVideoSizes(), serialDescriptor.getGetHighSpeedVideoSizes()) || !function1.invoke(obj).booleanValue() || sd.getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = sd.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(sd.getElementDescriptor(i).getGetHighSpeedVideoSizes(), serialDescriptor.getElementDescriptor(i).getGetHighSpeedVideoSizes()) || !kotlin.jvm.internal.Intrinsics.areEqual(sd.getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int hashCodeImpl(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptorArr, "");
        int hashCode = serialDescriptor.getGetHighSpeedVideoSizes().hashCode();
        int hashCode2 = java.util.Arrays.hashCode(serialDescriptorArr);
        java.lang.Iterable<kotlinx.serialization.descriptors.SerialDescriptor> elementDescriptors = kotlinx.serialization.descriptors.SerialDescriptorKt.getElementDescriptors(serialDescriptor);
        java.util.Iterator<kotlinx.serialization.descriptors.SerialDescriptor> it = elementDescriptors.iterator();
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String getHighSpeedVideoSizes = it.next().getGetHighSpeedVideoSizes();
            if (getHighSpeedVideoSizes != null) {
                i3 = getHighSpeedVideoSizes.hashCode();
            }
            i2 = (i2 * 31) + i3;
        }
        java.util.Iterator<kotlinx.serialization.descriptors.SerialDescriptor> it2 = elementDescriptors.iterator();
        while (it2.hasNext()) {
            kotlinx.serialization.descriptors.SerialKind kind = it2.next().getKind();
            i = (i * 31) + (kind != null ? kind.hashCode() : 0);
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i;
    }

    public static final java.lang.String toStringImpl(final kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(serialDescriptor.getGetHighSpeedVideoSizes());
        sb.append('(');
        return kotlin.collections.CollectionsKt.joinToString$default(kotlin.ranges.RangesKt.until(0, serialDescriptor.getElementsCount()), ", ", sb.toString(), ")", 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt.$r8$lambda$y9POfBj3yiQqguvd0MDl7etzaF0(kotlinx.serialization.descriptors.SerialDescriptor.this, ((java.lang.Integer) obj).intValue());
            }
        }, 24, null);
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$y9POfBj3yiQqguvd0MDl7etzaF0(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(serialDescriptor.getElementName(i));
        sb.append(": ");
        sb.append(serialDescriptor.getElementDescriptor(i).getGetHighSpeedVideoSizes());
        return sb.toString();
    }
}
