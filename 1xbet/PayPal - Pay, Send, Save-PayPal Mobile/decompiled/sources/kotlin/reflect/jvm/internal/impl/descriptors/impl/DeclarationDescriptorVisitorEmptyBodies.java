package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class DeclarationDescriptorVisitorEmptyBodies<R, D> implements kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> {
    public R visitDeclarationDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, D d) {
        return null;
    }

    public R visitVariableDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor, D d) {
        return visitDeclarationDescriptor(variableDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitFunctionDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, D d) {
        return visitDeclarationDescriptor(functionDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, D d) {
        return visitDeclarationDescriptor(typeParameterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPackageFragmentDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, D d) {
        return visitDeclarationDescriptor(packageFragmentDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPackageViewDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor, D d) {
        return visitDeclarationDescriptor(packageViewDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitClassDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, D d) {
        return visitDeclarationDescriptor(classDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitTypeAliasDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, D d) {
        return visitDeclarationDescriptor(typeAliasDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitModuleDeclaration(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, D d) {
        return visitDeclarationDescriptor(moduleDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, D d) {
        return visitFunctionDescriptor(constructorDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPropertyDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, D d) {
        return visitVariableDescriptor(propertyDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitValueParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, D d) {
        return visitVariableDescriptor(valueParameterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPropertyGetterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor propertyGetterDescriptor, D d) {
        return visitFunctionDescriptor(propertyGetterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPropertySetterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor, D d) {
        return visitFunctionDescriptor(propertySetterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitReceiverParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, D d) {
        return visitDeclarationDescriptor(receiverParameterDescriptor, d);
    }
}
