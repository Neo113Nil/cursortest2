package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class DeclarationDescriptorNonRootImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot {
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected DeclarationDescriptorNonRootImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(annotations, name2);
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(0);
        }
        if (annotations == null) {
            Camera2StreamConfigurationMap(1);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(2);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(3);
        }
        this.getHighSpeedVideoSizes = declarationDescriptor;
        this.Camera2StreamConfigurationMap = sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource declarationDescriptorWithSource = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource) super.getOriginal();
        if (declarationDescriptorWithSource == null) {
            Camera2StreamConfigurationMap(4);
        }
        return declarationDescriptorWithSource;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor = this.getHighSpeedVideoSizes;
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(5);
        }
        return declarationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = this.Camera2StreamConfigurationMap;
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(6);
        }
        return sourceElement;
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
