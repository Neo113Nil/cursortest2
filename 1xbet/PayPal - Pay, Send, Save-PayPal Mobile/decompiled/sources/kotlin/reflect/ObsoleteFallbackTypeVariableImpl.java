package kotlin.reflect;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lkotlin/reflect/ObsoleteFallbackTypeVariableImpl;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/TypeImpl;", "Lkotlin/reflect/KTypeParameter;", "p0", "<init>", "(Lkotlin/reflect/KTypeParameter;)V", "", "getName", "()Ljava/lang/String;", "getGenericDeclaration", "()Ljava/lang/reflect/GenericDeclaration;", "", "Ljava/lang/reflect/Type;", "getBounds", "()[Ljava/lang/reflect/Type;", "getTypeName", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/reflect/KTypeParameter;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ObsoleteFallbackTypeVariableImpl implements java.lang.reflect.TypeVariable<java.lang.reflect.GenericDeclaration>, kotlin.reflect.TypeImpl {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.reflect.KTypeParameter getHighSpeedVideoSizes;

    public ObsoleteFallbackTypeVariableImpl(kotlin.reflect.KTypeParameter kTypeParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kTypeParameter, "");
        this.getHighSpeedVideoSizes = kTypeParameter;
    }

    @Override // java.lang.reflect.TypeVariable
    public final java.lang.String getName() {
        return this.getHighSpeedVideoSizes.getName();
    }

    @Override // java.lang.reflect.TypeVariable
    public final java.lang.reflect.GenericDeclaration getGenericDeclaration() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("getGenericDeclaration() is not supported for type variables created from KType: ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(".\nUpdate kotlin-reflect dependency to 2.3.20+.");
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }

    @Override // java.lang.reflect.TypeVariable
    public final java.lang.reflect.Type[] getBounds() {
        java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI;
        java.util.List<kotlin.reflect.KType> upperBounds = this.getHighSpeedVideoSizes.getUpperBounds();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(upperBounds, 10));
        java.util.Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            highResolutionOutputSizeshNQ4ISI = kotlin.reflect.TypesJVMKt.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.KType) it.next(), true);
            arrayList.add(highResolutionOutputSizeshNQ4ISI);
        }
        return (java.lang.reflect.Type[]) arrayList.toArray(new java.lang.reflect.Type[0]);
    }

    @Override // java.lang.reflect.Type
    public final java.lang.String getTypeName() {
        return getName();
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof java.lang.reflect.TypeVariable)) {
            return false;
        }
        java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(getName(), typeVariable.getName()) && kotlin.jvm.internal.Intrinsics.areEqual(getGenericDeclaration(), typeVariable.getGenericDeclaration());
    }

    public final int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public final java.lang.String toString() {
        return getTypeName();
    }
}
