package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class TypeParameterDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor {
    private boolean Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Void> getHighSpeedVideoFpsRangesFor;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighSpeedVideoSizes;

    public static kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor createWithDefaultBound(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.name.Name name2, int i, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(0);
        }
        if (annotations == null) {
            Camera2StreamConfigurationMap(1);
        }
        if (variance == null) {
            Camera2StreamConfigurationMap(2);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(3);
        }
        if (storageManager == null) {
            Camera2StreamConfigurationMap(4);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl createForFurtherModification = createForFurtherModification(declarationDescriptor, annotations, z, variance, name2, i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, storageManager);
        createForFurtherModification.addUpperBound(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(declarationDescriptor).getDefaultBound());
        createForFurtherModification.setInitialized();
        if (createForFurtherModification == null) {
            Camera2StreamConfigurationMap(5);
        }
        return createForFurtherModification;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl createForFurtherModification(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.name.Name name2, int i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(6);
        }
        if (annotations == null) {
            Camera2StreamConfigurationMap(7);
        }
        if (variance == null) {
            Camera2StreamConfigurationMap(8);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(9);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(10);
        }
        if (storageManager == null) {
            Camera2StreamConfigurationMap(11);
        }
        return createForFurtherModification(declarationDescriptor, annotations, z, variance, name2, i, sourceElement, null, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE, storageManager);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl createForFurtherModification(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.name.Name name2, int i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Void> function1, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(12);
        }
        if (annotations == null) {
            Camera2StreamConfigurationMap(13);
        }
        if (variance == null) {
            Camera2StreamConfigurationMap(14);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(15);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(16);
        }
        if (supertypeLoopChecker == null) {
            Camera2StreamConfigurationMap(17);
        }
        if (storageManager == null) {
            Camera2StreamConfigurationMap(18);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl(declarationDescriptor, annotations, z, variance, name2, i, sourceElement, function1, supertypeLoopChecker, storageManager);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private TypeParameterDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.name.Name name2, int i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Void> function1, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        super(storageManager, declarationDescriptor, annotations, name2, variance, z, i, sourceElement, supertypeLoopChecker);
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(19);
        }
        if (annotations == null) {
            Camera2StreamConfigurationMap(20);
        }
        if (variance == null) {
            Camera2StreamConfigurationMap(21);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(22);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(23);
        }
        if (supertypeLoopChecker == null) {
            Camera2StreamConfigurationMap(24);
        }
        if (storageManager == null) {
            Camera2StreamConfigurationMap(25);
        }
        this.getHighSpeedVideoSizes = new java.util.ArrayList(1);
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    private void Camera2StreamConfigurationMap() {
        if (this.Camera2StreamConfigurationMap) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Type parameter descriptor is already initialized: ");
            sb.append(getHighResolutionOutputSizeshNQ4ISI());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getName());
        sb.append(" declared in ");
        sb.append(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(getContainingDeclaration()));
        return sb.toString();
    }

    public void setInitialized() {
        Camera2StreamConfigurationMap();
        this.Camera2StreamConfigurationMap = true;
    }

    public boolean isInitialized() {
        return this.Camera2StreamConfigurationMap;
    }

    public void addUpperBound(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            Camera2StreamConfigurationMap(26);
        }
        Camera2StreamConfigurationMap();
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType)) {
            return;
        }
        this.getHighSpeedVideoSizes.add(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* renamed from: reportSupertypeLoopError */
    protected void mo23900reportSupertypeLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            Camera2StreamConfigurationMap(27);
        }
        kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Void> function1 = this.getHighSpeedVideoFpsRangesFor;
        if (function1 == null) {
            return;
        }
        function1.invoke(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> resolveUpperBounds() {
        if (this.Camera2StreamConfigurationMap) {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list = this.getHighSpeedVideoSizes;
            if (list == null) {
                Camera2StreamConfigurationMap(28);
            }
            return list;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Type parameter descriptor is not initialized: ");
        sb.append(getHighResolutionOutputSizeshNQ4ISI());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
