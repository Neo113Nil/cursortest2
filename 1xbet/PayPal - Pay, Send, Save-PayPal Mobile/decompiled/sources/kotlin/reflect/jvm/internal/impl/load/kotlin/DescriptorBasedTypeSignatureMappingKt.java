package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class DescriptorBasedTypeSignatureMappingKt {
    public static /* synthetic */ java.lang.Object mapType$default(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory jvmTypeFactory, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration typeMappingConfiguration, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter jvmDescriptorTypeWriter, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            function3 = kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.getDO_NOTHING_3();
        }
        return mapType(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b7, code lost:
    
        throw new java.lang.UnsupportedOperationException("Unknown type ".concat(java.lang.String.valueOf(r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011e, code lost:
    
        if (r2.isForAnnotationParameter() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0127, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isKClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r6) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0129, code lost:
    
        r10 = (java.lang.Object) r10.getJavaLangClassType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0160, code lost:
    
        r14.invoke(r9, r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0163, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x012e, code lost:
    
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r6;
        r13 = r6.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
        r13 = r12.getPredefinedTypeForClass(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013b, code lost:
    
        if (r13 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0143, code lost:
    
        if (r6.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0145, code lost:
    
        r13 = r6.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r13, "");
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014f, code lost:
    
        r13 = r6.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
        r10 = (java.lang.Object) r10.createObjectType(computeInternalName(r13, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015f, code lost:
    
        r10 = (java.lang.Object) r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T mapType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> jvmTypeFactory, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<? extends T> typeMappingConfiguration, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, kotlin.jvm.functions.Function3<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, ? super T, ? super kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.Unit> function3) {
        java.lang.Object mapType;
        kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode2 = typeMappingMode;
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmTypeFactory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeMappingMode2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeMappingConfiguration, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
            kotlin.reflect.jvm.internal.impl.types.KotlinType preprocessType = typeMappingConfiguration.preprocessType(kotlinType);
            if (preprocessType == null) {
                if (kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(kotlinType)) {
                    kotlinType = kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(kotlinType);
                } else {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2 = kotlinType;
                    java.lang.Object mapBuiltInType = kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.mapBuiltInType(kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE, kotlinType2, jvmTypeFactory, typeMappingMode2);
                    if (mapBuiltInType != null) {
                        ?? r10 = (java.lang.Object) kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.boxTypeIfNeeded(jvmTypeFactory, mapBuiltInType, typeMappingMode2.getNeedPrimitiveBoxing());
                        function3.invoke(kotlinType, r10, typeMappingMode2);
                        return r10;
                    }
                    kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
                    if (constructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
                        kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) constructor;
                        kotlin.reflect.jvm.internal.impl.types.KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
                        if (alternativeType == null) {
                            alternativeType = typeMappingConfiguration.commonSupertype(intersectionTypeConstructor.getSupertypes());
                        }
                        kotlinType = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(alternativeType);
                    } else {
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = constructor.mo23898getDeclarationDescriptor();
                        if (mo23898getDeclarationDescriptor == null) {
                            throw new java.lang.UnsupportedOperationException("no descriptor for type constructor of ".concat(java.lang.String.valueOf(kotlinType)));
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor = mo23898getDeclarationDescriptor;
                        if (kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(classifierDescriptor)) {
                            T t = (T) jvmTypeFactory.createObjectType("error/NonExistentClass");
                            typeMappingConfiguration.processErrorType(kotlinType, (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor);
                            if (jvmDescriptorTypeWriter != 0) {
                                jvmDescriptorTypeWriter.writeClass(t);
                            }
                            return t;
                        }
                        boolean z = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
                        if (z && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(kotlinType)) {
                            if (kotlinType.getArguments().size() != 1) {
                                throw new java.lang.UnsupportedOperationException("arrays must have one type argument");
                            }
                            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = kotlinType.getArguments().get(0);
                            kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                            if (typeProjection.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) {
                                mapType = jvmTypeFactory.createObjectType("java/lang/Object");
                                if (jvmDescriptorTypeWriter != 0) {
                                    jvmDescriptorTypeWriter.writeArrayType();
                                    jvmDescriptorTypeWriter.writeClass(mapType);
                                    jvmDescriptorTypeWriter.writeArrayEnd();
                                }
                            } else {
                                if (jvmDescriptorTypeWriter != 0) {
                                    jvmDescriptorTypeWriter.writeArrayType();
                                }
                                kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(projectionKind, "");
                                mapType = mapType(type, jvmTypeFactory, typeMappingMode2.toGenericArgumentMode(projectionKind, true), typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
                                if (jvmDescriptorTypeWriter != 0) {
                                    jvmDescriptorTypeWriter.writeArrayEnd();
                                }
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
                            sb.append(jvmTypeFactory.toString(mapType));
                            return (T) jvmTypeFactory.createFromString(sb.toString());
                        }
                        if (z) {
                            if (!kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(classifierDescriptor) || typeMappingMode2.getNeedInlineClassWrapping() || (preprocessType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.reflect.jvm.internal.impl.types.ExpandedTypeUtilsKt.computeExpandedTypeForInlineClass(kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE, kotlinType2)) == null) {
                                break;
                            }
                            typeMappingMode2 = typeMappingMode2.wrapInlineClassesMode();
                        } else {
                            if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                                kotlin.reflect.jvm.internal.impl.types.KotlinType representativeUpperBound = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getRepresentativeUpperBound((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor);
                                T t2 = (T) mapType(kotlinType.isMarkedNullable() ? kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(representativeUpperBound) : representativeUpperBound, jvmTypeFactory, typeMappingMode2, typeMappingConfiguration, null, kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.getDO_NOTHING_3());
                                if (jvmDescriptorTypeWriter != 0) {
                                    kotlin.reflect.jvm.internal.impl.name.Name name2 = mo23898getDeclarationDescriptor.getName();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                                    jvmDescriptorTypeWriter.writeTypeVariable(name2, t2);
                                }
                                return t2;
                            }
                            if (!(mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) || !typeMappingMode2.getMapTypeAliases()) {
                                break;
                            }
                            kotlinType = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) mo23898getDeclarationDescriptor).getExpandedType();
                        }
                    }
                }
            }
            kotlinType = preprocessType;
        }
    }

    public static final boolean hasVoidReturnType(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        if (callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = callableDescriptor.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(returnType);
        if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnit(returnType)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType2 = callableDescriptor.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(returnType2);
        return (kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(returnType2) || (callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor)) ? false : true;
    }

    public static /* synthetic */ java.lang.String computeInternalName$default(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration typeMappingConfiguration, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            typeMappingConfiguration = kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfigurationImpl.INSTANCE;
        }
        return computeInternalName(classDescriptor, typeMappingConfiguration);
    }

    public static final java.lang.String computeInternalName(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<?> typeMappingConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeMappingConfiguration, "");
        java.lang.String predefinedFullInternalNameForClass = typeMappingConfiguration.getPredefinedFullInternalNameForClass(classDescriptor);
        if (predefinedFullInternalNameForClass != null) {
            return predefinedFullInternalNameForClass;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
        java.lang.String identifier = kotlin.reflect.jvm.internal.impl.name.SpecialNames.safeIdentifier(classDescriptor.getName()).getIdentifier();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration).getFqName();
            if (fqName.isRoot()) {
                return identifier;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlin.text.StringsKt.replace$default(fqName.asString(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null));
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            sb.append(identifier);
            return sb.toString();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration : null;
        if (classDescriptor2 == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected container: ");
            sb2.append(containingDeclaration);
            sb2.append(" for ");
            sb2.append(classDescriptor);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        java.lang.String predefinedInternalNameForClass = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor2);
        if (predefinedInternalNameForClass == null) {
            predefinedInternalNameForClass = computeInternalName(classDescriptor2, typeMappingConfiguration);
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(predefinedInternalNameForClass);
        sb3.append(kotlin.text.Typography.dollar);
        sb3.append(identifier);
        return sb3.toString();
    }
}
