package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\"\u0010\b\u001a\u0004\u0018\u00010\u0005*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "", "getHighSpeedVideoSizes", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Z", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;", "", "getBoundReceiver", "(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;", "boundReceiver"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DescriptorKPropertyKt {
    public static final java.lang.Object getBoundReceiver(kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor<?, ?> accessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessor, "");
        return accessor.getProperty().getBoundReceiver();
    }

    private static final kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Field> getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor<?, ?> accessor, boolean z, java.lang.reflect.Field field) {
        if (getHighSpeedVideoSizes(accessor.getProperty().getDescriptor()) || !java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
            if (z) {
                return kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(accessor) ? new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.BoundInstance(field, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.Instance(field);
            }
            if (kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(accessor)) {
                return new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.BoundInstance(field, !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(accessor.getProperty().getDescriptor().getType()), getBoundReceiver(accessor));
            }
            return new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.Instance(field, !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(accessor.getProperty().getDescriptor().getType()));
        }
        if (!accessor.getProperty().getDescriptor().getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.UtilKt.getJVM_STATIC())) {
            if (z) {
                return new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.Static(field);
            }
            return new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.Static(field, !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(accessor.getProperty().getDescriptor().getType()));
        }
        if (z) {
            return kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(accessor) ? new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.BoundJvmStaticInObject(field) : new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.JvmStaticInObject(field);
        }
        if (kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(accessor)) {
            return new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.BoundJvmStaticInObject(field, !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(accessor.getProperty().getDescriptor().getType()));
        }
        return new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.JvmStaticInObject(field, !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(accessor.getProperty().getDescriptor().getType()));
    }

    private static final boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = propertyDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
        if (!kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(containingDeclaration)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = containingDeclaration.getContainingDeclaration();
        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isInterface(containingDeclaration2) || kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isAnnotationClass(containingDeclaration2)) {
            return (propertyDescriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) && kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.isMovedFromInterfaceCompanion(((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) propertyDescriptor).getProto());
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ kotlin.reflect.jvm.internal.calls.Caller access$computeCallerForAccessor(kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor accessor, boolean z) {
        kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction setterSignature;
        java.lang.reflect.Method setterMethod;
        kotlin.reflect.jvm.internal.calls.Caller boundInstance;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature setter;
        java.lang.reflect.Method findMethodBySignature;
        java.lang.reflect.Method inlineClassUnboxMethod;
        if (kotlin.reflect.jvm.internal.KDeclarationContainerImpl.INSTANCE.getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection().matches(accessor.getProperty().getGetInputFormats())) {
            return kotlin.reflect.jvm.internal.calls.ThrowingCaller.INSTANCE;
        }
        kotlin.reflect.jvm.internal.JvmPropertySignature mapPropertySignature = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapPropertySignature(accessor.getProperty().getDescriptor());
        if (mapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty) {
            kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty kotlinProperty = (kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty) mapPropertySignature;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature getHighResolutionOutputSizeshNQ4ISI = kotlinProperty.getGetHighResolutionOutputSizeshNQ4ISI();
            if (z) {
                if (getHighResolutionOutputSizeshNQ4ISI.hasGetter()) {
                    setter = getHighResolutionOutputSizeshNQ4ISI.getGetter();
                    findMethodBySignature = setter == null ? accessor.getProperty().getGetHighSpeedVideoFpsRangesFor().findMethodBySignature(kotlinProperty.getGetHighSpeedVideoSizes().getString(setter.getName()), kotlinProperty.getGetHighSpeedVideoSizes().getString(setter.getDesc())) : null;
                    if (findMethodBySignature != null) {
                        if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass(accessor.getProperty().getDescriptor()) && kotlin.jvm.internal.Intrinsics.areEqual(accessor.getProperty().getDescriptor().getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INTERNAL)) {
                            java.lang.Class<?> inlineClass = kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.toInlineClass(accessor.getProperty().getDescriptor().getContainingDeclaration());
                            if (inlineClass == null || (inlineClassUnboxMethod = kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.getInlineClassUnboxMethod(inlineClass, accessor.getProperty().getDescriptor())) == null) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Underlying property of inline class ");
                                sb.append(accessor.getProperty());
                                sb.append(" should have a field");
                                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
                            }
                            boundInstance = kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(accessor) ? new kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass.Bound(inlineClassUnboxMethod, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass.Unbound(inlineClassUnboxMethod);
                        } else {
                            java.lang.reflect.Field javaField = accessor.getProperty().getJavaField();
                            if (javaField == null) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No accessors or field is found for property ");
                                sb2.append(accessor.getProperty());
                                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb2.toString());
                            }
                            boundInstance = getHighSpeedVideoFpsRanges(accessor, z, javaField);
                        }
                    } else if (!java.lang.reflect.Modifier.isStatic(findMethodBySignature.getModifiers())) {
                        boundInstance = kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(accessor) ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(findMethodBySignature, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(findMethodBySignature);
                    } else if (accessor.getProperty().getDescriptor().getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.UtilKt.getJVM_STATIC())) {
                        boundInstance = kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(accessor) ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundJvmStaticInObject(findMethodBySignature) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.JvmStaticInObject(findMethodBySignature);
                    } else {
                        boundInstance = kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(accessor) ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic(findMethodBySignature, false, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Static(findMethodBySignature);
                    }
                }
                setter = null;
                if (setter == null) {
                }
                if (findMethodBySignature != null) {
                }
            } else {
                if (getHighResolutionOutputSizeshNQ4ISI.hasSetter()) {
                    setter = getHighResolutionOutputSizeshNQ4ISI.getSetter();
                    if (setter == null) {
                    }
                    if (findMethodBySignature != null) {
                    }
                }
                setter = null;
                if (setter == null) {
                }
                if (findMethodBySignature != null) {
                }
            }
        } else if (mapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField) {
            boundInstance = getHighSpeedVideoFpsRanges(accessor, z, ((kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField) mapPropertySignature).getField());
        } else if (mapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty) {
            if (z) {
                setterMethod = ((kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty) mapPropertySignature).getGetterMethod();
            } else {
                kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty javaMethodProperty = (kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty) mapPropertySignature;
                setterMethod = javaMethodProperty.getSetterMethod();
                if (setterMethod == null) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("No source found for setter of Java method property: ");
                    sb3.append(javaMethodProperty.getGetterMethod());
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb3.toString());
                }
            }
            boundInstance = kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(accessor) ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(setterMethod, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(setterMethod);
        } else {
            if (!(mapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (z) {
                setterSignature = ((kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty) mapPropertySignature).getGetterSignature();
            } else {
                setterSignature = ((kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty) mapPropertySignature).getSetterSignature();
                if (setterSignature == null) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("No setter found for property ");
                    sb4.append(accessor.getProperty());
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb4.toString());
                }
            }
            java.lang.reflect.Method findMethodBySignature2 = accessor.getProperty().getGetHighSpeedVideoFpsRangesFor().findMethodBySignature(setterSignature.getMethodName(), setterSignature.getMethodDesc());
            if (findMethodBySignature2 == null) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("No accessor found for property ");
                sb5.append(accessor.getProperty());
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb5.toString());
            }
            java.lang.reflect.Modifier.isStatic(findMethodBySignature2.getModifiers());
            return kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(accessor) ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(findMethodBySignature2, getBoundReceiver(accessor)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(findMethodBySignature2);
        }
        return kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.createValueClassAwareCallerIfNeeded$default(boundInstance, accessor.getDescriptor(), false, 2, null);
    }
}
