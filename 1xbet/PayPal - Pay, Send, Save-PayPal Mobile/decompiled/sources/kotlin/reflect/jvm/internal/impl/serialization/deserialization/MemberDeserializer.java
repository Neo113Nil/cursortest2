package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class MemberDeserializer {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext getHighSpeedVideoSizes;

    public MemberDeserializer(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationContext, "");
        this.getHighSpeedVideoSizes = deserializationContext;
        this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer(deserializationContext.getComponents().getModuleDescriptor(), deserializationContext.getComponents().getNotFoundClasses());
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor loadProperty$default(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return memberDeserializer.loadProperty(property, z);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor loadProperty(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, boolean z) {
        int i;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
        final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property2;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations empty;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        boolean z2;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        if (property.hasFlags()) {
            i = property.getFlags();
        } else {
            int oldFlags = property.getOldFlags();
            i = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i2 = i;
        if (z) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion companion = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = property.getAnnotationList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationList, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> list = annotationList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : list) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer annotationDeserializer = this.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
                arrayList.add(annotationDeserializer.deserializeAnnotation(annotation, this.getHighSpeedVideoSizes.getNameResolver()));
            }
            annotations = companion.create(arrayList);
        } else {
            annotations = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.getHighSpeedVideoSizes.getContainingDeclaration();
        if (annotations == null) {
            annotations = getHighSpeedVideoFpsRangesFor(property, i2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2 = annotations;
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.modality(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(i2));
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt.descriptorVisibility(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(i2));
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_VAR.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        boolean booleanValue = bool.booleanValue();
        kotlin.reflect.jvm.internal.impl.name.Name name2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.getHighSpeedVideoSizes.getNameResolver(), property.getName());
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind memberKind = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt.memberKind(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MEMBER_KIND.get(i2));
        java.lang.Boolean bool2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_LATEINIT.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool2, "");
        boolean booleanValue2 = bool2.booleanValue();
        java.lang.Boolean bool3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONST.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool3, "");
        boolean booleanValue3 = bool3.booleanValue();
        java.lang.Boolean bool4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_PROPERTY.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool4, "");
        boolean booleanValue4 = bool4.booleanValue();
        java.lang.Boolean bool5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_DELEGATED.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool5, "");
        boolean booleanValue5 = bool5.booleanValue();
        java.lang.Boolean bool6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_PROPERTY.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool6, "");
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor deserializedPropertyDescriptor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor(containingDeclaration, null, annotations2, modality, descriptorVisibility, booleanValue, name2, memberKind, booleanValue2, booleanValue3, booleanValue4, booleanValue5, bool6.booleanValue(), property, this.getHighSpeedVideoSizes.getNameResolver(), this.getHighSpeedVideoSizes.getTypeTable(), this.getHighSpeedVideoSizes.getVersionRequirementTable(), this.getHighSpeedVideoSizes.getContainerSource());
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContext = this.getHighSpeedVideoSizes;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext childContext$default = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(deserializationContext, deserializedPropertyDescriptor2, typeParameterList, null, null, null, null, 60, null);
        java.lang.Boolean bool7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_GETTER.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool7, "");
        boolean booleanValue6 = bool7.booleanValue();
        if (!booleanValue6 || !kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver(property)) {
            property2 = property;
            empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        } else {
            property2 = property;
            empty = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations(this.getHighSpeedVideoSizes.getStorageManager(), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$4(this, property2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER));
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = childContext$default.getTypeDeserializer().type(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(property2, this.getHighSpeedVideoSizes.getTypeTable()));
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor highSpeedVideoSizes = getHighSpeedVideoSizes();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(property2, this.getHighSpeedVideoSizes.getTypeTable());
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = (receiverType == null || (type = childContext$default.getTypeDeserializer().type(receiverType)) == null) ? null : kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, type, empty);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = childContext$default.getMemberDeserializer();
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypes = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.contextReceiverTypes(property2, this.getHighSpeedVideoSizes.getTypeTable());
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> contextParameterList = property.getContextParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextParameterList, "");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property3 = property2;
        deserializedPropertyDescriptor.setType(type2, ownTypeParameters, highSpeedVideoSizes, createExtensionReceiverParameterForCallable, memberDeserializer.getHighSpeedVideoFpsRangesFor(contextReceiverTypes, contextParameterList, property3, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER));
        java.lang.Boolean bool8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool8, "");
        int accessorFlags = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.getAccessorFlags(bool8.booleanValue(), kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(i2), kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(i2), false, false, false);
        if (booleanValue6) {
            int getterFlags = property.hasGetterFlags() ? property.getGetterFlags() : accessorFlags;
            java.lang.Boolean bool9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOT_DEFAULT.get(getterFlags);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool9, "");
            boolean booleanValue7 = bool9.booleanValue();
            java.lang.Boolean bool10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool10, "");
            boolean booleanValue8 = bool10.booleanValue();
            java.lang.Boolean bool11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE_ACCESSOR.get(getterFlags);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool11, "");
            boolean booleanValue9 = bool11.booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(property3, getterFlags, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER);
            if (booleanValue7) {
                propertyGetterDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, highSpeedVideoFpsRangesFor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.modality(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(getterFlags)), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt.descriptorVisibility(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(getterFlags)), !booleanValue7, booleanValue8, booleanValue9, deserializedPropertyDescriptor.getKind(), null, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
            } else {
                propertyGetterDescriptorImpl = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, highSpeedVideoFpsRangesFor);
                kotlin.jvm.internal.Intrinsics.checkNotNull(propertyGetterDescriptorImpl);
            }
            propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
        } else {
            propertyGetterDescriptorImpl = null;
        }
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_SETTER.get(i2).booleanValue()) {
            if (property.hasSetterFlags()) {
                accessorFlags = property.getSetterFlags();
            }
            java.lang.Boolean bool12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOT_DEFAULT.get(accessorFlags);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool12, "");
            boolean booleanValue10 = bool12.booleanValue();
            java.lang.Boolean bool13 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_ACCESSOR.get(accessorFlags);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool13, "");
            boolean booleanValue11 = bool13.booleanValue();
            java.lang.Boolean bool14 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE_ACCESSOR.get(accessorFlags);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool14, "");
            boolean booleanValue12 = bool14.booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(property3, accessorFlags, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER);
            if (booleanValue10) {
                kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl(deserializedPropertyDescriptor, highSpeedVideoFpsRangesFor2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.modality(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(accessorFlags)), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt.descriptorVisibility(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(accessorFlags)), !booleanValue10, booleanValue11, booleanValue12, deserializedPropertyDescriptor.getKind(), null, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl2.initialize((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl2, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().Camera2StreamConfigurationMap(kotlin.collections.CollectionsKt.listOf(property.getSetterValueParameter()), property3, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER)));
                z2 = true;
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
            } else {
                z2 = true;
                propertySetterDescriptorImpl = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, highSpeedVideoFpsRangesFor2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY());
                kotlin.jvm.internal.Intrinsics.checkNotNull(propertySetterDescriptorImpl);
            }
        } else {
            z2 = true;
            propertySetterDescriptorImpl = null;
        }
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_CONSTANT.get(i2).booleanValue()) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new kotlin.jvm.functions.Function0(this, property2, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$0
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor Camera2StreamConfigurationMap;
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer getHighResolutionOutputSizeshNQ4ISI;
                private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue createNullableLazyValue;
                    createNullableLazyValue = r0.getHighSpeedVideoSizes.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$7
                        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property Camera2StreamConfigurationMap;
                        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor getHighResolutionOutputSizeshNQ4ISI;
                        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer getHighSpeedVideoSizes;

                        @Override // kotlin.jvm.functions.Function0
                        public java.lang.Object invoke() {
                            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
                        }

                        {
                            this.getHighSpeedVideoSizes = r1;
                            this.Camera2StreamConfigurationMap = r2;
                            this.getHighResolutionOutputSizeshNQ4ISI = r3;
                        }
                    });
                    return createNullableLazyValue;
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = this;
                    this.getHighSpeedVideoFpsRangesFor = property2;
                    this.Camera2StreamConfigurationMap = deserializedPropertyDescriptor;
                }
            });
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = this.getHighSpeedVideoSizes.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration2 : null;
        if ((classDescriptor != null ? classDescriptor.getKind() : null) == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new kotlin.jvm.functions.Function0(this, property2, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$1
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor Camera2StreamConfigurationMap;
                private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getHighResolutionOutputSizeshNQ4ISI;
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue createNullableLazyValue;
                    createNullableLazyValue = r0.getHighSpeedVideoSizes.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$8
                        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer getHighResolutionOutputSizeshNQ4ISI;
                        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getHighSpeedVideoFpsRanges;
                        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor getHighSpeedVideoFpsRangesFor;

                        @Override // kotlin.jvm.functions.Function0
                        public java.lang.Object invoke() {
                            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
                        }

                        {
                            this.getHighResolutionOutputSizeshNQ4ISI = r1;
                            this.getHighSpeedVideoFpsRanges = r2;
                            this.getHighSpeedVideoFpsRangesFor = r3;
                        }
                    });
                    return createNullableLazyValue;
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = this;
                    this.getHighResolutionOutputSizeshNQ4ISI = property2;
                    this.Camera2StreamConfigurationMap = deserializedPropertyDescriptor;
                }
            });
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor deserializedPropertyDescriptor3 = deserializedPropertyDescriptor;
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, new kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl(getHighResolutionOutputSizeshNQ4ISI(property2, false), deserializedPropertyDescriptor3), new kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl(getHighResolutionOutputSizeshNQ4ISI(property2, z2), deserializedPropertyDescriptor3));
        return deserializedPropertyDescriptor3;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor loadFunction(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function) {
        int i;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations empty;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable;
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        if (function.hasFlags()) {
            i = function.getFlags();
        } else {
            int oldFlags = function.getOldFlags();
            i = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i2 = i;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function2 = function;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(function2, i2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION);
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver(function)) {
            empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        } else {
            empty = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations(this.getHighSpeedVideoSizes.getStorageManager(), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$4(this, function2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = empty;
        if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(this.getHighSpeedVideoSizes.getContainingDeclaration()).child(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.getHighSpeedVideoSizes.getNameResolver(), function.getName())), kotlin.reflect.jvm.internal.impl.serialization.deserialization.SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
            versionRequirementTable = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion.getEMPTY();
        } else {
            versionRequirementTable = this.getHighSpeedVideoSizes.getVersionRequirementTable();
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor(this.getHighSpeedVideoSizes.getContainingDeclaration(), null, highSpeedVideoFpsRangesFor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.getHighSpeedVideoSizes.getNameResolver(), function.getName()), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt.memberKind(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MEMBER_KIND.get(i2)), function, this.getHighSpeedVideoSizes.getNameResolver(), this.getHighSpeedVideoSizes.getTypeTable(), versionRequirementTable, this.getHighSpeedVideoSizes.getContainerSource(), null, 1024, null);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext childContext$default = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(this.getHighSpeedVideoSizes, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(function, this.getHighSpeedVideoSizes.getTypeTable());
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = (receiverType == null || (type = childContext$default.getTypeDeserializer().type(receiverType)) == null) ? null : kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, type, annotations);
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor highSpeedVideoSizes = getHighSpeedVideoSizes();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = childContext$default.getMemberDeserializer();
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypes = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.contextReceiverTypes(function, this.getHighSpeedVideoSizes.getTypeTable());
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> contextParameterList = function.getContextParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextParameterList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> highSpeedVideoFpsRangesFor2 = memberDeserializer.getHighSpeedVideoFpsRangesFor(contextReceiverTypes, contextParameterList, function2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer2 = childContext$default.getMemberDeserializer();
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
        deserializedSimpleFunctionDescriptor.initialize(createExtensionReceiverParameterForCallable, highSpeedVideoSizes, highSpeedVideoFpsRangesFor2, ownTypeParameters, memberDeserializer2.Camera2StreamConfigurationMap(valueParameterList, function2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION), childContext$default.getTypeDeserializer().type(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(function, this.getHighSpeedVideoSizes.getTypeTable())), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.modality(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(i2)), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt.descriptorVisibility(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(i2)), kotlin.collections.MapsKt.emptyMap());
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_OPERATOR.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        java.lang.Boolean bool2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INFIX.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool2, "");
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        java.lang.Boolean bool3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_FUNCTION.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool3, "");
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        java.lang.Boolean bool4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool4, "");
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        java.lang.Boolean bool5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_TAILREC.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool5, "");
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        java.lang.Boolean bool6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SUSPEND.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool6, "");
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        java.lang.Boolean bool7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_FUNCTION.get(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool7, "");
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(i2).booleanValue());
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, java.lang.Object> deserializeContractFromFunction = this.getHighSpeedVideoSizes.getComponents().getContractDeserializer().deserializeContractFromFunction(function, deserializedSimpleFunctionDescriptor, this.getHighSpeedVideoSizes.getTypeTable(), childContext$default.getTypeDeserializer());
        if (deserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap(deserializeContractFromFunction.getFirst(), deserializeContractFromFunction.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor loadTypeAlias(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAlias, "");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion companion = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion;
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> list = annotationList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : list) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer annotationDeserializer = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            arrayList.add(annotationDeserializer.deserializeAnnotation(annotation, this.getHighSpeedVideoSizes.getNameResolver()));
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor(this.getHighSpeedVideoSizes.getStorageManager(), this.getHighSpeedVideoSizes.getContainingDeclaration(), companion.create(arrayList), kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.getHighSpeedVideoSizes.getNameResolver(), typeAlias.getName()), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt.descriptorVisibility(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(typeAlias.getFlags())), typeAlias, this.getHighSpeedVideoSizes.getNameResolver(), this.getHighSpeedVideoSizes.getTypeTable(), this.getHighSpeedVideoSizes.getVersionRequirementTable(), this.getHighSpeedVideoSizes.getContainerSource());
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext childContext$default = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(this.getHighSpeedVideoSizes, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(childContext$default.getTypeDeserializer().getOwnTypeParameters(), childContext$default.getTypeDeserializer().simpleType(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.underlyingType(typeAlias, this.getHighSpeedVideoSizes.getTypeTable()), false), childContext$default.getTypeDeserializer().simpleType(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.expandedType(typeAlias, this.getHighSpeedVideoSizes.getTypeTable()), false));
        return deserializedTypeAliasDescriptor;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getHighSpeedVideoSizes() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.getHighSpeedVideoSizes.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor loadConstructor(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.getHighSpeedVideoSizes.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor2 = constructor;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor(classDescriptor, null, getHighSpeedVideoFpsRangesFor(constructor2, constructor.getFlags(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION), z, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, constructor, this.getHighSpeedVideoSizes.getNameResolver(), this.getHighSpeedVideoSizes.getTypeTable(), this.getHighSpeedVideoSizes.getVersionRequirementTable(), this.getHighSpeedVideoSizes.getContainerSource(), null, 1024, null);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(this.getHighSpeedVideoSizes, deserializedClassConstructorDescriptor, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer();
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.Camera2StreamConfigurationMap(valueParameterList, constructor2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt.descriptorVisibility(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(constructor.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(constructor.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoFpsRangesFor(final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, int i, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(i).booleanValue()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations(this.getHighSpeedVideoSizes.getStorageManager(), new kotlin.jvm.functions.Function0(this, messageLite, annotatedCallableKind) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
                this.getHighResolutionOutputSizeshNQ4ISI = messageLite;
                this.Camera2StreamConfigurationMap = annotatedCallableKind;
            }
        });
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighResolutionOutputSizeshNQ4ISI(final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, final boolean z) {
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations(this.getHighSpeedVideoSizes.getStorageManager(), new kotlin.jvm.functions.Function0(this, z, property) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$3
            private final boolean getHighSpeedVideoFpsRanges;
            private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getHighSpeedVideoFpsRangesFor;
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoSizes = this;
                this.getHighSpeedVideoFpsRanges = z;
                this.getHighSpeedVideoFpsRangesFor = property;
            }
        });
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> Camera2StreamConfigurationMap(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> list, final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations empty;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.getHighSpeedVideoSizes.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) containingDeclaration;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "");
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(containingDeclaration2);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            if (highResolutionOutputSizeshNQ4ISI != null && kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(flags).booleanValue()) {
                final int i2 = i;
                empty = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations(this.getHighSpeedVideoSizes.getStorageManager(), new kotlin.jvm.functions.Function0(this, highResolutionOutputSizeshNQ4ISI, messageLite, annotatedCallableKind, i2, valueParameter) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$5
                    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer Camera2StreamConfigurationMap;
                    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer getHighResolutionOutputSizeshNQ4ISI;
                    private final int getHighSpeedVideoFpsRanges;
                    private final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getHighSpeedVideoFpsRangesFor;
                    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind getHighSpeedVideoSizes;
                    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getOutputFormats;

                    @Override // kotlin.jvm.functions.Function0
                    public java.lang.Object invoke() {
                        java.util.List list3;
                        list3 = kotlin.collections.CollectionsKt.toList(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getOutputFormats));
                        return list3;
                    }

                    {
                        this.Camera2StreamConfigurationMap = this;
                        this.getHighResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoFpsRangesFor = messageLite;
                        this.getHighSpeedVideoSizes = annotatedCallableKind;
                        this.getHighSpeedVideoFpsRanges = i2;
                        this.getOutputFormats = valueParameter;
                    }
                });
            } else {
                empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = empty;
            kotlin.reflect.jvm.internal.impl.name.Name name2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(this.getHighSpeedVideoSizes.getNameResolver(), valueParameter.getName());
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = this.getHighSpeedVideoSizes.getTypeDeserializer().type(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(valueParameter, this.getHighSpeedVideoSizes.getTypeTable()));
            java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.DECLARES_DEFAULT_VALUE.get(flags);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
            boolean booleanValue = bool.booleanValue();
            java.lang.Boolean bool2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CROSSINLINE.get(flags);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool2, "");
            boolean booleanValue2 = bool2.booleanValue();
            java.lang.Boolean bool3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOINLINE.get(flags);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool3, "");
            boolean booleanValue3 = bool3.booleanValue();
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type varargElementType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.varargElementType(valueParameter, this.getHighSpeedVideoSizes.getTypeTable());
            kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = varargElementType != null ? this.getHighSpeedVideoSizes.getTypeDeserializer().type(varargElementType) : null;
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceElement, "");
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(callableDescriptor, null, i, annotations, name2, type, booleanValue, booleanValue2, booleanValue3, type2, sourceElement));
            i++;
            arrayList = arrayList2;
        }
        return kotlin.collections.CollectionsKt.toList(arrayList);
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.getHighSpeedVideoSizes.getNameResolver(), this.getHighSpeedVideoSizes.getTypeTable(), this.getHighSpeedVideoSizes.getContainerSource());
        }
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) {
            return ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getHighSpeedVideoFpsRangesFor(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> list, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> list2, final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations empty;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.getHighSpeedVideoSizes.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) containingDeclaration;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(containingDeclaration2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) obj;
            final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) kotlin.collections.CollectionsKt.getOrNull(list2, i);
            int flags = (valueParameter == null || !valueParameter.hasFlags()) ? 0 : valueParameter.getFlags();
            if (highResolutionOutputSizeshNQ4ISI != null && kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(flags).booleanValue()) {
                final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer2 = highResolutionOutputSizeshNQ4ISI;
                protoContainer = highResolutionOutputSizeshNQ4ISI;
                final int i2 = i;
                empty = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations(this.getHighSpeedVideoSizes.getStorageManager(), new kotlin.jvm.functions.Function0(this, protoContainer2, messageLite, annotatedCallableKind, i2, valueParameter) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$6
                    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer Camera2StreamConfigurationMap;
                    private final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getHighResolutionOutputSizeshNQ4ISI;
                    private final int getHighSpeedVideoFpsRanges;
                    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind getHighSpeedVideoFpsRangesFor;
                    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer getHighSpeedVideoSizes;
                    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getOutputFormats;

                    @Override // kotlin.jvm.functions.Function0
                    public java.lang.Object invoke() {
                        java.util.List list3;
                        list3 = kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.getComponents().getAnnotationAndConstantLoader().loadContextParameterAnnotations(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getOutputFormats));
                        return list3;
                    }

                    {
                        this.getHighSpeedVideoSizes = this;
                        this.Camera2StreamConfigurationMap = protoContainer2;
                        this.getHighResolutionOutputSizeshNQ4ISI = messageLite;
                        this.getHighSpeedVideoFpsRangesFor = annotatedCallableKind;
                        this.getHighSpeedVideoFpsRanges = i2;
                        this.getOutputFormats = valueParameter;
                    }
                });
            } else {
                protoContainer = highResolutionOutputSizeshNQ4ISI;
                empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor createContextReceiverParameterForCallable = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createContextReceiverParameterForCallable(callableDescriptor, this.getHighSpeedVideoSizes.getTypeDeserializer().type(type), null, empty, i);
            if (createContextReceiverParameterForCallable != null) {
                arrayList.add(createContextReceiverParameterForCallable);
            }
            i++;
            highResolutionOutputSizeshNQ4ISI = protoContainer;
        }
        return arrayList;
    }

    static /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer highResolutionOutputSizeshNQ4ISI = memberDeserializer.getHighResolutionOutputSizeshNQ4ISI(memberDeserializer.getHighSpeedVideoSizes.getContainingDeclaration());
        java.util.List list = highResolutionOutputSizeshNQ4ISI != null ? kotlin.collections.CollectionsKt.toList(memberDeserializer.getHighSpeedVideoSizes.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(highResolutionOutputSizeshNQ4ISI, messageLite, annotatedCallableKind)) : null;
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    static /* synthetic */ java.util.List Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer, boolean z, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
        java.util.List list;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer highResolutionOutputSizeshNQ4ISI = memberDeserializer.getHighResolutionOutputSizeshNQ4ISI(memberDeserializer.getHighSpeedVideoSizes.getContainingDeclaration());
        if (highResolutionOutputSizeshNQ4ISI == null) {
            list = null;
        } else if (z) {
            list = kotlin.collections.CollectionsKt.toList(memberDeserializer.getHighSpeedVideoSizes.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(highResolutionOutputSizeshNQ4ISI, property));
        } else {
            list = kotlin.collections.CollectionsKt.toList(memberDeserializer.getHighSpeedVideoSizes.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(highResolutionOutputSizeshNQ4ISI, property));
        }
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer highResolutionOutputSizeshNQ4ISI = memberDeserializer.getHighResolutionOutputSizeshNQ4ISI(memberDeserializer.getHighSpeedVideoSizes.getContainingDeclaration());
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> loadExtensionReceiverParameterAnnotations = highResolutionOutputSizeshNQ4ISI != null ? memberDeserializer.getHighSpeedVideoSizes.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(highResolutionOutputSizeshNQ4ISI, messageLite, annotatedCallableKind) : null;
        return loadExtensionReceiverParameterAnnotations == null ? kotlin.collections.CollectionsKt.emptyList() : loadExtensionReceiverParameterAnnotations;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer highResolutionOutputSizeshNQ4ISI = memberDeserializer.getHighResolutionOutputSizeshNQ4ISI(memberDeserializer.getHighSpeedVideoSizes.getContainingDeclaration());
        kotlin.jvm.internal.Intrinsics.checkNotNull(highResolutionOutputSizeshNQ4ISI);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> annotationAndConstantLoader = memberDeserializer.getHighSpeedVideoSizes.getComponents().getAnnotationAndConstantLoader();
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
        return annotationAndConstantLoader.loadPropertyConstant(highResolutionOutputSizeshNQ4ISI, property, returnType);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer highResolutionOutputSizeshNQ4ISI = memberDeserializer.getHighResolutionOutputSizeshNQ4ISI(memberDeserializer.getHighSpeedVideoSizes.getContainingDeclaration());
        kotlin.jvm.internal.Intrinsics.checkNotNull(highResolutionOutputSizeshNQ4ISI);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> annotationAndConstantLoader = memberDeserializer.getHighSpeedVideoSizes.getComponents().getAnnotationAndConstantLoader();
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
        return annotationAndConstantLoader.loadAnnotationDefaultValue(highResolutionOutputSizeshNQ4ISI, property, returnType);
    }
}
