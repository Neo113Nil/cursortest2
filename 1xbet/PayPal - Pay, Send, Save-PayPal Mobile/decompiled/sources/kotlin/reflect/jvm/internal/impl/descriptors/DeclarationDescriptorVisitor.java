package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface DeclarationDescriptorVisitor<R, D> {
    R visitClassDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, D d);

    R visitConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, D d);

    R visitFunctionDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, D d);

    R visitModuleDeclaration(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, D d);

    R visitPackageFragmentDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, D d);

    R visitPackageViewDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor, D d);

    R visitPropertyDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, D d);

    R visitPropertyGetterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor propertyGetterDescriptor, D d);

    R visitPropertySetterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor, D d);

    R visitReceiverParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, D d);

    R visitTypeAliasDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, D d);

    R visitTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, D d);

    R visitValueParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, D d);
}
