package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface TypeParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker {
    int getIndex();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getOriginal();

    kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor();

    java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getUpperBounds();

    kotlin.reflect.jvm.internal.impl.types.Variance getVariance();

    boolean isCapturedFromOuterDeclaration();

    boolean isReified();
}
