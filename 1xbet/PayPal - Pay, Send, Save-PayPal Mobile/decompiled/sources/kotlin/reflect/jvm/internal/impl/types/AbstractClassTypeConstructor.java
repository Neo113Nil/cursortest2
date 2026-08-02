package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class AbstractClassTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor {
    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23898getDeclarationDescriptor();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        super(storageManager);
        if (storageManager == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(mo23898getDeclarationDescriptor());
        if (builtIns == null) {
            getHighResolutionOutputSizeshNQ4ISI(1);
        }
        return builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    protected boolean isSameClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(2);
        }
        return (classifierDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && areFqNamesEqual(mo23898getDeclarationDescriptor(), classifierDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = mo23898getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            java.util.List emptyList = java.util.Collections.emptyList();
            if (emptyList == null) {
                getHighResolutionOutputSizeshNQ4ISI(3);
            }
            return emptyList;
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartList smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration;
        smartList.add(classDescriptor.getDefaultType());
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23888getCompanionObjectDescriptor = classDescriptor.mo23888getCompanionObjectDescriptor();
        if (z && mo23888getCompanionObjectDescriptor != null) {
            smartList.add(mo23888getCompanionObjectDescriptor.getDefaultType());
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected kotlin.reflect.jvm.internal.impl.types.KotlinType defaultSupertypeIfEmpty() {
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isSpecialClassWithNoSupertypes(mo23898getDeclarationDescriptor())) {
            return null;
        }
        return getBuiltIns().getAnyType();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String format;
        java.lang.String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i != 1) {
            if (i == 2) {
                objArr[0] = "classifier";
            } else if (i != 3 && i != 4) {
                objArr[0] = "storageManager";
            }
            if (i != 1) {
                objArr[1] = "getBuiltIns";
            } else if (i == 3 || i == 4) {
                objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "isSameClassifier";
                } else if (i != 3 && i != 4) {
                    objArr[2] = "<init>";
                }
            }
            format = java.lang.String.format(str, objArr);
            if (i == 1 && i != 3 && i != 4) {
                throw new java.lang.IllegalArgumentException(format);
            }
            throw new java.lang.IllegalStateException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i != 1) {
        }
        if (i != 1) {
        }
        format = java.lang.String.format(str, objArr);
        if (i == 1) {
        }
        throw new java.lang.IllegalStateException(format);
    }
}
