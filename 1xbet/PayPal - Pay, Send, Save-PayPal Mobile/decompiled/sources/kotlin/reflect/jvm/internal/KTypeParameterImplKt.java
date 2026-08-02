package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "getHighSpeedVideoSizes", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Lkotlin/reflect/jvm/internal/KClassImpl;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KTypeParameterImplKt {
    private static final kotlin.reflect.jvm.internal.KClassImpl<?> getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass(classDescriptor);
        kotlin.reflect.jvm.internal.KClassImpl<?> kClassImpl = (kotlin.reflect.jvm.internal.KClassImpl) (javaClass != null ? kotlin.jvm.JvmClassMappingKt.getKotlinClass(javaClass) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Type parameter container is not resolved: ");
        sb.append(classDescriptor.getContainingDeclaration());
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl access$toContainer(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        java.lang.Class<?> klass;
        kotlin.reflect.jvm.internal.KClassImpl<?> kClassImpl;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
        if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration);
        }
        if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) containingDeclaration).getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "");
            if (containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                kClassImpl = getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration2);
            } else {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor deserializedMemberDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor) containingDeclaration : null;
                if (deserializedMemberDescriptor == null) {
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: ".concat(java.lang.String.valueOf(containingDeclaration)));
                }
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource containerSource = deserializedMemberDescriptor.getContainerSource();
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource jvmPackagePartSource = containerSource instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource ? (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource) containerSource : null;
                java.lang.Object knownJvmBinaryClass = jvmPackagePartSource != null ? jvmPackagePartSource.getKnownJvmBinaryClass() : null;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass reflectKotlinClass = knownJvmBinaryClass instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass) knownJvmBinaryClass : null;
                if (reflectKotlinClass != null && (klass = reflectKotlinClass.getKlass()) != null) {
                    kotlin.reflect.KClass kotlinClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(klass);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinClass, "");
                    kClassImpl = (kotlin.reflect.jvm.internal.KClassImpl) kotlinClass;
                } else {
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Container of deserialized member is not resolved: ".concat(java.lang.String.valueOf(deserializedMemberDescriptor)));
                }
            }
            java.lang.Object accept = containingDeclaration.accept(new kotlin.reflect.jvm.internal.CreateKCallableVisitor(kClassImpl), kotlin.Unit.INSTANCE);
            kotlin.jvm.internal.Intrinsics.checkNotNull(accept);
            return (kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl) accept;
        }
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Unknown type parameter container: ".concat(java.lang.String.valueOf(containingDeclaration)));
    }

    public static final /* synthetic */ kotlin.reflect.KVariance access$toKVariance(kotlin.reflect.jvm.internal.impl.types.Variance variance) {
        int i = kotlin.reflect.jvm.internal.KTypeParameterImplKt.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            return kotlin.reflect.KVariance.INVARIANT;
        }
        if (i == 2) {
            return kotlin.reflect.KVariance.IN;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.reflect.KVariance.OUT;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
