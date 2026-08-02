package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public class DescriptorFactory {

    static class DefaultClassConstructorDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultClassConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
            super(classDescriptor, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), true, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
            if (classDescriptor == null) {
                getHighResolutionOutputSizeshNQ4ISI(0);
            }
            if (sourceElement == null) {
                getHighResolutionOutputSizeshNQ4ISI(1);
            }
            initialize(java.util.Collections.emptyList(), kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getDefaultConstructorVisibility(classDescriptor, false));
        }

        private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl createDefaultSetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2) {
        if (propertyDescriptor == null) {
            getHighSpeedVideoFpsRanges(0);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(1);
        }
        if (annotations2 == null) {
            getHighSpeedVideoFpsRanges(2);
        }
        return createSetter(propertyDescriptor, annotations, annotations2, true, false, false, propertyDescriptor.getSource());
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl createSetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            getHighSpeedVideoFpsRanges(3);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(4);
        }
        if (annotations2 == null) {
            getHighSpeedVideoFpsRanges(5);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(6);
        }
        return createSetter(propertyDescriptor, annotations, annotations2, z, z2, z3, propertyDescriptor.getVisibility(), sourceElement);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl createSetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            getHighSpeedVideoFpsRanges(7);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(8);
        }
        if (annotations2 == null) {
            getHighSpeedVideoFpsRanges(9);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRanges(10);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(11);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), descriptorVisibility, z, z2, z3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
        propertySetterDescriptorImpl.initialize(kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2));
        return propertySetterDescriptorImpl;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl createDefaultGetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        if (propertyDescriptor == null) {
            getHighSpeedVideoFpsRanges(13);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(14);
        }
        return createGetter(propertyDescriptor, annotations, true, false, false);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl createGetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, boolean z2, boolean z3) {
        if (propertyDescriptor == null) {
            getHighSpeedVideoFpsRanges(15);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(16);
        }
        return createGetter(propertyDescriptor, annotations, z, z2, z3, propertyDescriptor.getSource());
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl createGetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            getHighSpeedVideoFpsRanges(17);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(18);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(19);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), propertyDescriptor.getVisibility(), z, z2, z3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl createPrimaryConstructorForObject(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (classDescriptor == null) {
            getHighSpeedVideoFpsRanges(20);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(21);
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.DefaultClassConstructorDescriptor(classDescriptor, sourceElement);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createEnumValuesMethod(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            getHighSpeedVideoFpsRanges(22);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl initialize = kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl.create(classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_VALUES, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource()).initialize((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(classDescriptor).getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, classDescriptor.getDefaultType()), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC);
        if (initialize == null) {
            getHighSpeedVideoFpsRanges(23);
        }
        return initialize;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createEnumValueOfMethod(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            getHighSpeedVideoFpsRanges(24);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl create = kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl.create(classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_VALUE_OF, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource());
        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl initialize = create.initialize((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.singletonList(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(create, null, 0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.name.Name.identifier(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(classDescriptor).getStringType(), false, false, false, null, classDescriptor.getSource())), (kotlin.reflect.jvm.internal.impl.types.KotlinType) classDescriptor.getDefaultType(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC);
        if (initialize == null) {
            getHighSpeedVideoFpsRanges(25);
        }
        return initialize;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor createEnumEntriesProperty(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            getHighSpeedVideoFpsRanges(26);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor containingModule = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(classDescriptor);
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findEnumEntriesClass = kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinderKt.getStdlibClassFinder(containingModule).findEnumEntriesClass(containingModule);
        if (findEnumEntriesClass == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl create = kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.create(classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC, false, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_ENTRIES, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource(), false, false, false, false, false, false);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl(create, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC, false, false, false, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED, null, classDescriptor.getSource());
        create.initialize(propertyGetterDescriptorImpl, null);
        create.setType(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty(), findEnumEntriesClass.getTypeConstructor(), java.util.Collections.singletonList(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(classDescriptor.getDefaultType())), false), java.util.Collections.emptyList(), null, null, java.util.Collections.emptyList());
        propertyGetterDescriptorImpl.initialize(create.getReturnType());
        return create;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor createExtensionReceiverParameterForCallable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        if (callableDescriptor == null) {
            getHighSpeedVideoFpsRanges(30);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(31);
        }
        if (kotlinType == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl(callableDescriptor, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor createContextReceiverParameterForCallable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, int i) {
        if (callableDescriptor == null) {
            getHighSpeedVideoFpsRanges(32);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(33);
        }
        if (kotlinType == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl(callableDescriptor, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver(callableDescriptor, kotlinType, name2, null), annotations, kotlin.reflect.jvm.internal.impl.name.NameUtils.contextReceiverName(i));
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor createContextReceiverParameterForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, int i) {
        if (classDescriptor == null) {
            getHighSpeedVideoFpsRanges(34);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(35);
        }
        if (kotlinType == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl(classDescriptor, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver(classDescriptor, kotlinType, name2, null), annotations, kotlin.reflect.jvm.internal.impl.name.NameUtils.contextReceiverName(i));
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner;
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
