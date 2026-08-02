package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class ClassDescriptorBase extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor {
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDescriptorBase(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, boolean z) {
        super(storageManager, name2);
        if (storageManager == null) {
            Camera2StreamConfigurationMap(0);
        }
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(1);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(2);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(3);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = declarationDescriptor;
        this.Camera2StreamConfigurationMap = sourceElement;
        this.getHighSpeedVideoSizes = z;
    }

    public boolean isExternal() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor = this.getHighResolutionOutputSizeshNQ4ISI;
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(4);
        }
        return declarationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = this.Camera2StreamConfigurationMap;
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(5);
        }
        return sourceElement;
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
