package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public class ClassTypeConstructorImpl extends kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRangesFor;
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
        return mo23898getDeclarationDescriptor();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassTypeConstructorImpl(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collection, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        super(storageManager);
        if (classDescriptor == null) {
            Camera2StreamConfigurationMap(0);
        }
        if (list == null) {
            Camera2StreamConfigurationMap(1);
        }
        if (collection == null) {
            Camera2StreamConfigurationMap(2);
        }
        if (storageManager == null) {
            Camera2StreamConfigurationMap(3);
        }
        this.getHighSpeedVideoFpsRangesFor = classDescriptor;
        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableCollection(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = this.getHighSpeedVideoFpsRanges;
        if (list == null) {
            Camera2StreamConfigurationMap(4);
        }
        return list;
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(this.getHighSpeedVideoFpsRangesFor).asString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23898getDeclarationDescriptor() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = this.getHighSpeedVideoFpsRangesFor;
        if (classDescriptor == null) {
            Camera2StreamConfigurationMap(5);
        }
        return classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeSupertypes() {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collection = this.getHighSpeedVideoSizes;
        if (collection == null) {
            Camera2StreamConfigurationMap(6);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker() {
        kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY empty = kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE;
        if (empty == null) {
            Camera2StreamConfigurationMap(7);
        }
        return empty;
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
