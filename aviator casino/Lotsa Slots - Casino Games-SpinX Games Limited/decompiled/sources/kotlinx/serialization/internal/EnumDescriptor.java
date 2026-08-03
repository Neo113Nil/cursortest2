package kotlinx.serialization.internal;

/* compiled from: Enums.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "name", "", "elementsCount", "", "<init>", "(Ljava/lang/String;I)V", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "elementDescriptors", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptors", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors$delegate", "Lkotlin/Lazy;", "getElementDescriptor", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "equals", "", "other", "", "toString", "hashCode", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnumDescriptor extends kotlinx.serialization.internal.PluginGeneratedSerialDescriptor {

    /* renamed from: elementDescriptors$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy elementDescriptors;
    private final kotlinx.serialization.descriptors.SerialKind kind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(final java.lang.String name, final int i) {
        super(name, null, i, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.kind = kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE;
        this.elementDescriptors = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.EnumDescriptor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.descriptors.SerialDescriptor[] elementDescriptors_delegate$lambda$0;
                elementDescriptors_delegate$lambda$0 = kotlinx.serialization.internal.EnumDescriptor.elementDescriptors_delegate$lambda$0(i, name, this);
                return elementDescriptors_delegate$lambda$0;
            }
        });
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public kotlinx.serialization.descriptors.SerialKind getKind() {
        return this.kind;
    }

    private final kotlinx.serialization.descriptors.SerialDescriptor[] getElementDescriptors() {
        return (kotlinx.serialization.descriptors.SerialDescriptor[]) this.elementDescriptors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.descriptors.SerialDescriptor[] elementDescriptors_delegate$lambda$0(int i, java.lang.String str, kotlinx.serialization.internal.EnumDescriptor enumDescriptor) {
        kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr = new kotlinx.serialization.descriptors.SerialDescriptor[i];
        for (int i2 = 0; i2 < i; i2++) {
            serialDescriptorArr[i2] = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor$default(str + '.' + enumDescriptor.getElementName(i2), kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 8, null);
        }
        return serialDescriptorArr;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
        return getElementDescriptors()[index];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof kotlinx.serialization.descriptors.SerialDescriptor)) {
            return false;
        }
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) other;
        return serialDescriptor.getKind() == kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE && kotlin.jvm.internal.Intrinsics.areEqual(getSerialName(), serialDescriptor.getSerialName()) && kotlin.jvm.internal.Intrinsics.areEqual(kotlinx.serialization.internal.Platform_commonKt.cachedSerialNames(this), kotlinx.serialization.internal.Platform_commonKt.cachedSerialNames(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(kotlinx.serialization.descriptors.SerialDescriptorKt.getElementNames(this), ", ", getSerialName() + '(', ")", 0, null, null, 56, null);
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int hashCode = getSerialName().hashCode();
        java.util.Iterator<java.lang.String> it = kotlinx.serialization.descriptors.SerialDescriptorKt.getElementNames(this).iterator();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i * 31;
            java.lang.String next = it.next();
            i = i2 + (next != null ? next.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }
}
