package kotlinx.serialization.internal;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001aN\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\r*\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0003H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"equalsImpl", "", "SD", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "other", "", "typeParamsAreEqual", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "otherDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "hashCodeImpl", "", "typeParams", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "toStringImpl", "", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PluginGeneratedSerialDescriptorKt {
    public static final /* synthetic */ <SD extends kotlinx.serialization.descriptors.SerialDescriptor> boolean equalsImpl(SD sd, java.lang.Object obj, kotlin.jvm.functions.Function1<? super SD, java.lang.Boolean> typeParamsAreEqual) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sd, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParamsAreEqual, "typeParamsAreEqual");
        if (sd == obj) {
            return true;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "SD");
        if (!(obj instanceof kotlinx.serialization.descriptors.SerialDescriptor)) {
            return false;
        }
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(sd.getSerialName(), serialDescriptor.getSerialName()) || !typeParamsAreEqual.invoke(obj).booleanValue() || sd.getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = sd.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(sd.getElementDescriptor(i).getSerialName(), serialDescriptor.getElementDescriptor(i).getSerialName()) || !kotlin.jvm.internal.Intrinsics.areEqual(sd.getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int hashCodeImpl(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor[] typeParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (serialDescriptor.getSerialName().hashCode() * 31) + java.util.Arrays.hashCode(typeParams);
        java.lang.Iterable<kotlinx.serialization.descriptors.SerialDescriptor> elementDescriptors = kotlinx.serialization.descriptors.SerialDescriptorKt.getElementDescriptors(serialDescriptor);
        java.util.Iterator<kotlinx.serialization.descriptors.SerialDescriptor> it = elementDescriptors.iterator();
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i4 = i2 * 31;
            java.lang.String serialName = it.next().getSerialName();
            if (serialName != null) {
                i3 = serialName.hashCode();
            }
            i2 = i4 + i3;
        }
        java.util.Iterator<kotlinx.serialization.descriptors.SerialDescriptor> it2 = elementDescriptors.iterator();
        while (it2.hasNext()) {
            int i5 = i * 31;
            kotlinx.serialization.descriptors.SerialKind kind = it2.next().getKind();
            i = i5 + (kind != null ? kind.hashCode() : 0);
        }
        return (((hashCode * 31) + i2) * 31) + i;
    }

    public static final java.lang.String toStringImpl(final kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return kotlin.collections.CollectionsKt.joinToString$default(kotlin.ranges.RangesKt.until(0, serialDescriptor.getElementsCount()), ", ", serialDescriptor.getSerialName() + '(', ")", 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.CharSequence stringImpl$lambda$2;
                stringImpl$lambda$2 = kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt.toStringImpl$lambda$2(kotlinx.serialization.descriptors.SerialDescriptor.this, ((java.lang.Integer) obj).intValue());
                return stringImpl$lambda$2;
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence toStringImpl$lambda$2(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
        return serialDescriptor.getElementName(i) + ": " + serialDescriptor.getElementDescriptor(i).getSerialName();
    }
}
