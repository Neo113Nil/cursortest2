package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class ReceiverParameterDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor {
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReceiverParameterDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        this(declarationDescriptor, receiverValue, annotations, kotlin.reflect.jvm.internal.impl.name.SpecialNames.THIS);
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(0);
        }
        if (receiverValue == null) {
            getHighSpeedVideoFpsRanges(1);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiverParameterDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        super(annotations, name2);
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(3);
        }
        if (receiverValue == null) {
            getHighSpeedVideoFpsRanges(4);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(5);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRanges(6);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = declarationDescriptor;
        this.Camera2StreamConfigurationMap = receiverValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue getValue() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue = this.Camera2StreamConfigurationMap;
        if (receiverValue == null) {
            getHighSpeedVideoFpsRanges(7);
        }
        return receiverValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor = this.getHighResolutionOutputSizeshNQ4ISI;
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(8);
        }
        return declarationDescriptor;
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE;
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
