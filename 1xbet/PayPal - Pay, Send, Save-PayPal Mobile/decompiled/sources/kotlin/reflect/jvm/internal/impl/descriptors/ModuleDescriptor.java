package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public interface ModuleDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor {
    kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns();

    <T> T getCapability(kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<T> moduleCapability);

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor> getExpectedByModules();

    kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor getPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    boolean shouldSeeInternalsOf(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor);

    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
            return null;
        }

        public static <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptorVisitor, "");
            return declarationDescriptorVisitor.visitModuleDeclaration(moduleDescriptor, d);
        }
    }
}
