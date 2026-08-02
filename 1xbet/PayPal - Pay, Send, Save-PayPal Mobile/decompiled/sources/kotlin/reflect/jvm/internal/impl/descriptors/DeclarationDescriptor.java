package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface DeclarationDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.Named, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated {
    <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d);

    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration();

    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getOriginal();
}
