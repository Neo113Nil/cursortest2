package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public final class SignatureEnhancement {
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement getHighSpeedVideoFpsRangesFor;

    public SignatureEnhancement(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement javaTypeEnhancement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeEnhancement, "");
        this.getHighSpeedVideoFpsRangesFor = javaTypeEnhancement;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> enhanceSignatures(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, java.util.Collection<? extends D> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext copyWithNewDefaultTypeQualifiers;
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2;
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor3;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptor;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor;
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        kotlin.reflect.jvm.internal.impl.types.KotlinType highSpeedVideoSizes;
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType;
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> pair;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2;
        java.util.ArrayList arrayList;
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list;
        java.util.Iterator<T> it;
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> parametersInfo;
        java.lang.String errorsSinceLanguageVersion;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl propertyDescriptorImpl;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl getter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<? extends D> collection2 = collection;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10));
        java.util.Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor javaCallableMemberDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) it2.next();
            if ((javaCallableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor) && (javaCallableMemberDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE || javaCallableMemberDescriptor.getOriginal().getOverriddenDescriptors().size() != 1)) {
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor4 = javaCallableMemberDescriptor;
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor topLevelContainingClassifier = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt.getTopLevelContainingClassifier(callableMemberDescriptor4);
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo = null;
                if (topLevelContainingClassifier != null) {
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor ? (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor) topLevelContainingClassifier : null;
                    java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
                    java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> list2 = moduleAnnotations;
                    if (list2 != null && !list2.isEmpty()) {
                        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> list3 = moduleAnnotations;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                        java.util.Iterator<T> it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation) it3.next(), true));
                        }
                        annotations = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.create(kotlin.collections.CollectionsKt.plus((java.lang.Iterable) javaCallableMemberDescriptor.getAnnotations(), (java.lang.Iterable) arrayList3));
                        copyWithNewDefaultTypeQualifiers = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, annotations);
                        if ((javaCallableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor) || (getter = (propertyDescriptorImpl = (kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl) javaCallableMemberDescriptor).getGetter()) == null || getter.isDefault()) {
                            callableMemberDescriptor = javaCallableMemberDescriptor;
                        } else {
                            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl getter2 = propertyDescriptorImpl.getGetter();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(getter2);
                            callableMemberDescriptor = getter2;
                        }
                        callableMemberDescriptor2 = javaCallableMemberDescriptor;
                        if (callableMemberDescriptor2.getExtensionReceiverParameter() == null) {
                            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableMemberDescriptor : null;
                            callableMemberDescriptor3 = callableMemberDescriptor;
                            kotlinType = getHighSpeedVideoSizes(javaCallableMemberDescriptor, functionDescriptor != null ? (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) functionDescriptor.getUserData(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null, copyWithNewDefaultTypeQualifiers, null, false, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$0
                                @Override // kotlin.jvm.functions.Function1
                                public java.lang.Object invoke(java.lang.Object obj) {
                                    return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj);
                                }
                            });
                        } else {
                            callableMemberDescriptor3 = callableMemberDescriptor;
                            kotlinType = null;
                        }
                        javaMethodDescriptor = !(javaCallableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) ? (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) javaCallableMemberDescriptor : null;
                        int i = 0;
                        if (javaMethodDescriptor != null) {
                            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
                            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
                            java.lang.String signature = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
                            if (signature != null) {
                                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(signature);
                                if (predefinedFunctionEnhancementInfo2 == null) {
                                    predefinedFunctionEnhancementInfo2 = null;
                                } else {
                                    if (predefinedFunctionEnhancementInfo2.getErrorsSinceLanguageVersion() != null && ((errorsSinceLanguageVersion = predefinedFunctionEnhancementInfo2.getErrorsSinceLanguageVersion()) == null || !kotlin.text.StringsKt.startsWith$default(errorsSinceLanguageVersion, "2.", false, 2, (java.lang.Object) null))) {
                                        throw new java.lang.IllegalStateException("Check failed.");
                                    }
                                    if (predefinedFunctionEnhancementInfo2.getErrorsSinceLanguageVersion() != null) {
                                        predefinedFunctionEnhancementInfo2 = predefinedFunctionEnhancementInfo2.getWarningModeClone();
                                    }
                                }
                                predefinedFunctionEnhancementInfo = predefinedFunctionEnhancementInfo2;
                                if (predefinedFunctionEnhancementInfo != null) {
                                    predefinedFunctionEnhancementInfo.getParametersInfo().size();
                                    ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) javaCallableMemberDescriptor).getValueParameters().size();
                                }
                                boolean z = (!kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState()) || copyWithNewDefaultTypeQualifiers.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.hasErasedValueParameters(javaCallableMemberDescriptor);
                                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = callableMemberDescriptor3.getValueParameters();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list4 = valueParameters;
                                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                                for (final kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor : list4) {
                                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo2 = (predefinedFunctionEnhancementInfo == null || (parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo()) == null) ? typeEnhancementInfo : (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo) kotlin.collections.CollectionsKt.getOrNull(parametersInfo, valueParameterDescriptor.getIndex());
                                    java.util.ArrayList arrayList5 = arrayList4;
                                    arrayList5.add(getHighSpeedVideoSizes(javaCallableMemberDescriptor, valueParameterDescriptor, copyWithNewDefaultTypeQualifiers, typeEnhancementInfo2, z, new kotlin.jvm.functions.Function1(valueParameterDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$1
                                        private final kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor getHighSpeedVideoFpsRangesFor;

                                        @Override // kotlin.jvm.functions.Function1
                                        public java.lang.Object invoke(java.lang.Object obj) {
                                            return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj);
                                        }

                                        {
                                            this.getHighSpeedVideoFpsRangesFor = valueParameterDescriptor;
                                        }
                                    }));
                                    arrayList4 = arrayList5;
                                    i = i;
                                    typeEnhancementInfo = null;
                                }
                                int i2 = i;
                                java.util.ArrayList arrayList6 = arrayList4;
                                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor5 = callableMemberDescriptor3;
                                propertyDescriptor = javaCallableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) javaCallableMemberDescriptor : null;
                                if (propertyDescriptor == null && kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
                                    annotationQualifierApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.FIELD;
                                } else {
                                    annotationQualifierApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                                }
                                highSpeedVideoSizes = getHighSpeedVideoSizes(javaCallableMemberDescriptor, callableMemberDescriptor5, true, copyWithNewDefaultTypeQualifiers, annotationQualifierApplicabilityType, predefinedFunctionEnhancementInfo != null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null, false, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj);
                                    }
                                });
                                returnType = callableMemberDescriptor2.getReturnType();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(returnType);
                                if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(returnType, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj);
                                    }
                                }) && ((extensionReceiverParameter = callableMemberDescriptor2.getExtensionReceiverParameter()) == null || (type = extensionReceiverParameter.getType()) == null || !kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(type, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj);
                                    }
                                }))) {
                                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = callableMemberDescriptor2.getValueParameters();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters2, "");
                                    list = valueParameters2;
                                    if ((list instanceof java.util.Collection) || !list.isEmpty()) {
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next()).getType();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "");
                                            if (kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(type2, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$4
                                                @Override // kotlin.jvm.functions.Function1
                                                public java.lang.Object invoke(java.lang.Object obj) {
                                                    return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj);
                                                }
                                            })) {
                                            }
                                        }
                                    }
                                    pair = null;
                                    if (kotlinType == null && highSpeedVideoSizes == null) {
                                        arrayList = arrayList6;
                                        if (!arrayList.isEmpty()) {
                                            java.util.Iterator it4 = arrayList.iterator();
                                            while (it4.hasNext()) {
                                                if (((kotlin.reflect.jvm.internal.impl.types.KotlinType) it4.next()) != null) {
                                                    break;
                                                }
                                            }
                                        }
                                        if (pair == null) {
                                        }
                                    }
                                    kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor javaCallableMemberDescriptor2 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor) javaCallableMemberDescriptor;
                                    if (kotlinType == null) {
                                        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter2 = callableMemberDescriptor2.getExtensionReceiverParameter();
                                        kotlinType2 = extensionReceiverParameter2 != null ? extensionReceiverParameter2.getType() : null;
                                    } else {
                                        kotlinType2 = kotlinType;
                                    }
                                    java.util.ArrayList arrayList7 = arrayList6;
                                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                    int i3 = i2;
                                    for (java.lang.Object obj : arrayList7) {
                                        if (i3 < 0) {
                                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                                        }
                                        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj;
                                        if (kotlinType3 == null) {
                                            kotlinType3 = callableMemberDescriptor2.getValueParameters().get(i3).getType();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(kotlinType3, "");
                                        }
                                        arrayList8.add(kotlinType3);
                                        i3++;
                                    }
                                    java.util.ArrayList arrayList9 = arrayList8;
                                    if (highSpeedVideoSizes == null) {
                                        highSpeedVideoSizes = callableMemberDescriptor2.getReturnType();
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes);
                                    }
                                    kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor enhance = javaCallableMemberDescriptor2.enhance(kotlinType2, arrayList9, highSpeedVideoSizes, pair);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(enhance, "");
                                    javaCallableMemberDescriptor = enhance;
                                }
                                pair = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo(callableMemberDescriptor4));
                                if (kotlinType == null) {
                                    arrayList = arrayList6;
                                    if (!arrayList.isEmpty()) {
                                    }
                                    if (pair == null) {
                                    }
                                }
                                kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor javaCallableMemberDescriptor22 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor) javaCallableMemberDescriptor;
                                if (kotlinType == null) {
                                }
                                java.util.ArrayList arrayList72 = arrayList6;
                                java.util.ArrayList arrayList82 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList72, 10));
                                int i32 = i2;
                                while (r8.hasNext()) {
                                }
                                java.util.ArrayList arrayList92 = arrayList82;
                                if (highSpeedVideoSizes == null) {
                                }
                                kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor enhance2 = javaCallableMemberDescriptor22.enhance(kotlinType2, arrayList92, highSpeedVideoSizes, pair);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(enhance2, "");
                                javaCallableMemberDescriptor = enhance2;
                            }
                        }
                        predefinedFunctionEnhancementInfo = null;
                        if (predefinedFunctionEnhancementInfo != null) {
                        }
                        if (kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState())) {
                        }
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters3 = callableMemberDescriptor3.getValueParameters();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters3, "");
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list42 = valueParameters3;
                        java.util.ArrayList arrayList42 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list42, 10));
                        while (r22.hasNext()) {
                        }
                        int i22 = i;
                        java.util.ArrayList arrayList62 = arrayList42;
                        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor52 = callableMemberDescriptor3;
                        if (javaCallableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) {
                        }
                        if (propertyDescriptor == null) {
                        }
                        annotationQualifierApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                        highSpeedVideoSizes = getHighSpeedVideoSizes(javaCallableMemberDescriptor, callableMemberDescriptor52, true, copyWithNewDefaultTypeQualifiers, annotationQualifierApplicabilityType, predefinedFunctionEnhancementInfo != null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null, false, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$2
                            @Override // kotlin.jvm.functions.Function1
                            public java.lang.Object invoke(java.lang.Object obj2) {
                                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj2);
                            }
                        });
                        returnType = callableMemberDescriptor2.getReturnType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(returnType);
                        if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(returnType, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$4
                            @Override // kotlin.jvm.functions.Function1
                            public java.lang.Object invoke(java.lang.Object obj2) {
                                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj2);
                            }
                        })) {
                            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters22 = callableMemberDescriptor2.getValueParameters();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters22, "");
                            list = valueParameters22;
                            if (list instanceof java.util.Collection) {
                            }
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                            pair = null;
                            if (kotlinType == null) {
                            }
                            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor javaCallableMemberDescriptor222 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor) javaCallableMemberDescriptor;
                            if (kotlinType == null) {
                            }
                            java.util.ArrayList arrayList722 = arrayList62;
                            java.util.ArrayList arrayList822 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList722, 10));
                            int i322 = i22;
                            while (r8.hasNext()) {
                            }
                            java.util.ArrayList arrayList922 = arrayList822;
                            if (highSpeedVideoSizes == null) {
                            }
                            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor enhance22 = javaCallableMemberDescriptor222.enhance(kotlinType2, arrayList922, highSpeedVideoSizes, pair);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(enhance22, "");
                            javaCallableMemberDescriptor = enhance22;
                        }
                        pair = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo(callableMemberDescriptor4));
                        if (kotlinType == null) {
                        }
                        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor javaCallableMemberDescriptor2222 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor) javaCallableMemberDescriptor;
                        if (kotlinType == null) {
                        }
                        java.util.ArrayList arrayList7222 = arrayList62;
                        java.util.ArrayList arrayList8222 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList7222, 10));
                        int i3222 = i22;
                        while (r8.hasNext()) {
                        }
                        java.util.ArrayList arrayList9222 = arrayList8222;
                        if (highSpeedVideoSizes == null) {
                        }
                        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor enhance222 = javaCallableMemberDescriptor2222.enhance(kotlinType2, arrayList9222, highSpeedVideoSizes, pair);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(enhance222, "");
                        javaCallableMemberDescriptor = enhance222;
                    }
                }
                annotations = javaCallableMemberDescriptor.getAnnotations();
                copyWithNewDefaultTypeQualifiers = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, annotations);
                if (javaCallableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor) {
                }
                callableMemberDescriptor = javaCallableMemberDescriptor;
                callableMemberDescriptor2 = javaCallableMemberDescriptor;
                if (callableMemberDescriptor2.getExtensionReceiverParameter() == null) {
                }
                if (!(javaCallableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor)) {
                }
                int i4 = 0;
                if (javaMethodDescriptor != null) {
                }
                predefinedFunctionEnhancementInfo = null;
                if (predefinedFunctionEnhancementInfo != null) {
                }
                if (kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState())) {
                }
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters32 = callableMemberDescriptor3.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters32, "");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list422 = valueParameters32;
                java.util.ArrayList arrayList422 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list422, 10));
                while (r22.hasNext()) {
                }
                int i222 = i4;
                java.util.ArrayList arrayList622 = arrayList422;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor522 = callableMemberDescriptor3;
                if (javaCallableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) {
                }
                if (propertyDescriptor == null) {
                }
                annotationQualifierApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                highSpeedVideoSizes = getHighSpeedVideoSizes(javaCallableMemberDescriptor, callableMemberDescriptor522, true, copyWithNewDefaultTypeQualifiers, annotationQualifierApplicabilityType, predefinedFunctionEnhancementInfo != null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null, false, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$2
                    @Override // kotlin.jvm.functions.Function1
                    public java.lang.Object invoke(java.lang.Object obj2) {
                        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj2);
                    }
                });
                returnType = callableMemberDescriptor2.getReturnType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(returnType);
                if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(returnType, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$4
                    @Override // kotlin.jvm.functions.Function1
                    public java.lang.Object invoke(java.lang.Object obj2) {
                        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj2);
                    }
                })) {
                }
                pair = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo(callableMemberDescriptor4));
                if (kotlinType == null) {
                }
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor javaCallableMemberDescriptor22222 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor) javaCallableMemberDescriptor;
                if (kotlinType == null) {
                }
                java.util.ArrayList arrayList72222 = arrayList622;
                java.util.ArrayList arrayList82222 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList72222, 10));
                int i32222 = i222;
                while (r8.hasNext()) {
                }
                java.util.ArrayList arrayList92222 = arrayList82222;
                if (highSpeedVideoSizes == null) {
                }
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor enhance2222 = javaCallableMemberDescriptor22222.enhance(kotlinType2, arrayList92222, highSpeedVideoSizes, pair);
                kotlin.jvm.internal.Intrinsics.checkNotNull(enhance2222, "");
                javaCallableMemberDescriptor = enhance2222;
            }
            arrayList2.add(javaCallableMemberDescriptor);
        }
        return arrayList2;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> enhanceTypeParameterBounds(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : list2) {
            if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.contains(kotlinType, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$3
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj));
                }
            })) {
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureParts signatureParts = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureParts(typeParameterDescriptor, false, lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS);
                kotlin.reflect.jvm.internal.impl.types.KotlinType enhance = this.getHighSpeedVideoFpsRangesFor.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, kotlin.collections.CollectionsKt.emptyList(), null, false), signatureParts.getSkipRawTypeArguments());
                if (enhance != null) {
                    kotlinType = enhance;
                }
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType enhanceSuperType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureParts signatureParts = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureParts(null, false, lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE, true);
        kotlin.reflect.jvm.internal.impl.types.KotlinType enhance = this.getHighSpeedVideoFpsRangesFor.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, kotlin.collections.CollectionsKt.emptyList(), null, false), signatureParts.getSkipRawTypeArguments());
        return enhance == null ? kotlinType : enhance;
    }

    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo, boolean z, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, ? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> function1) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext copyWithNewDefaultTypeQualifiers;
        return getHighSpeedVideoSizes(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (copyWithNewDefaultTypeQualifiers = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : copyWithNewDefaultTypeQualifiers, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo, z, function1);
    }

    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated, boolean z, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo, boolean z2, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, ? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> function1) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureParts signatureParts = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureParts(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType);
        kotlin.reflect.jvm.internal.impl.types.KotlinType invoke = function1.invoke(callableMemberDescriptor);
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection = overriddenDescriptors;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(callableMemberDescriptor2);
            arrayList.add(function1.invoke(callableMemberDescriptor2));
        }
        return this.getHighSpeedVideoFpsRangesFor.enhance(invoke, signatureParts.computeIndexedQualifiers(invoke, arrayList, typeEnhancementInfo, z2), signatureParts.getSkipRawTypeArguments());
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        kotlin.jvm.internal.Intrinsics.checkNotNull(extensionReceiverParameter);
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = extensionReceiverParameter.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return type;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = callableMemberDescriptor.getValueParameters().get(valueParameterDescriptor.getIndex()).getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return type;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = callableMemberDescriptor.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(returnType);
        return returnType;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        return unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.RawType;
    }

    static /* synthetic */ java.lang.Boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = unwrappedType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor == null) {
            return java.lang.Boolean.FALSE;
        }
        boolean z = false;
        if (kotlin.jvm.internal.Intrinsics.areEqual(mo23898getDeclarationDescriptor.getName(), kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME().shortName()) && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.fqNameOrNull(mo23898getDeclarationDescriptor), kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME())) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
