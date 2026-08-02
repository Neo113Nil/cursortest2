package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public abstract class KotlinTypeRefiner extends kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner {
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies(kotlin.reflect.jvm.internal.impl.name.ClassId classId);

    public abstract <S extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> S getOrPutScopeForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.jvm.functions.Function0<? extends S> function0);

    public abstract boolean isRefinementNeededForModule(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor);

    public abstract boolean isRefinementNeededForTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor);

    public abstract kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor refineDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor);

    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> refineSupertypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
    public abstract kotlin.reflect.jvm.internal.impl.types.KotlinType refineType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    public static final class Default extends kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner {
        public static final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner.Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker refineType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            return refineType(kotlinTypeMarker);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        public final kotlin.reflect.jvm.internal.impl.types.KotlinType refineType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            return (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> refineSupertypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
            return supertypes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final <S extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> S getOrPutScopeForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.jvm.functions.Function0<? extends S> function0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            return function0.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor refineDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final boolean isRefinementNeededForTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final boolean isRefinementNeededForModule(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
            return null;
        }
    }
}
