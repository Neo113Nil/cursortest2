package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
public final class DeserializedClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor {
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility CoroutineDebuggingKt;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getInputSizeshNQ4ISI;
    private final boolean getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor>> getOutputMinFrameDuration;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion getOutputMinFrameDurationlomOqCM;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality getOutputSizes;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope> getOutputStallDuration;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>> getOutputStallDurationlomOqCM;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType>> getValidOutputFormatsForInputhNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl isOutputSupportedFor;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class isOutputSupportedForhNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement toString;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassTypeConstructor unwrapAs;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isActual() {
        return false;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClassProto() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion getMetadataVersion() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContext, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r11, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(deserializationContext.getStorageManager(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, r11.getFqName()).getShortClassName());
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty empty;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations nonEmptyDeserializedAnnotations;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
        this.getHighSpeedVideoFpsRangesFor = r11;
        this.getOutputMinFrameDurationlomOqCM = binaryVersion;
        this.toString = sourceElement;
        this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, r11.getFqName());
        this.getOutputSizes = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.modality(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(r11.getFlags()));
        this.CoroutineDebuggingKt = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt.descriptorVisibility(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(r11.getFlags()));
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE.classKind(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.CLASS_KIND.get(r11.getFlags()));
        this.getInputSizeshNQ4ISI = classKind;
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = r11.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = r11.getTypeTable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeTable, "");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion companion = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = r11.getVersionRequirementTable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext childContext = deserializationContext.childContext(this, typeParameterList, nameResolver, typeTable2, companion.create(versionRequirementTable), binaryVersion);
        this.getHighSpeedVideoSizes = childContext;
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ENUM_ENTRIES.get(r11.getFlags());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        boolean booleanValue = bool.booleanValue();
        this.getOutputFormats = booleanValue;
        if (classKind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS) {
            boolean z = true;
            if (!booleanValue && !kotlin.jvm.internal.Intrinsics.areEqual(childContext.getComponents().getEnumEntriesDeserializationSupport().canSynthesizeEnumEntries(), java.lang.Boolean.TRUE)) {
                z = false;
            }
            empty = new kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum(childContext.getStorageManager(), this, z);
        } else {
            empty = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        }
        this.isOutputSupportedFor = empty;
        this.unwrapAs = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassTypeConstructor();
        this.getOutputStallDuration = kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass.Companion.create(this, childContext.getStorageManager(), childContext.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$memberScopeHolder$1(this));
        this.getHighSpeedVideoSizesFor = classKind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS ? new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors() : null;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        this.getInputFormats = containingDeclaration;
        this.getOutputSizeshNQ4ISI = childContext.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
        this.getOutputMinFrameDuration = childContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = childContext.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getOutputStallDurationlomOqCM = childContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$3
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        this.getValidOutputFormatsForInputhNQ4ISI = childContext.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$4
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver2 = childContext.getNameResolver();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable3 = childContext.getTypeTable();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) containingDeclaration : null;
        this.isOutputSupportedForhNQ4ISI = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class(r11, nameResolver2, typeTable3, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.isOutputSupportedForhNQ4ISI : null);
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(r11.getFlags()).booleanValue()) {
            nonEmptyDeserializedAnnotations = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        } else {
            nonEmptyDeserializedAnnotations = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations(childContext.getStorageManager(), new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$5
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.List list;
                    list = kotlin.collections.CollectionsKt.toList(r0.getHighSpeedVideoSizes.getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(this.getHighSpeedVideoSizes.isOutputSupportedForhNQ4ISI));
                    return list;
                }

                {
                    this.getHighSpeedVideoSizes = this;
                }
            });
        }
        this.Camera2StreamConfigurationMap = nonEmptyDeserializedAnnotations;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext getC() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        return this.getInputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        return this.unwrapAs;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        return this.getOutputSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        return this.CoroutineDebuggingKt;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean isInner() {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INNER.get(this.getHighSpeedVideoFpsRangesFor.getFlags());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isData() {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_DATA.get(this.getHighSpeedVideoFpsRangesFor.getFlags());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_VALUE_CLASS.get(this.getHighSpeedVideoFpsRangesFor.getFlags()).booleanValue() && this.getOutputMinFrameDurationlomOqCM.isAtMost(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExpect() {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_CLASS.get(this.getHighSpeedVideoFpsRangesFor.getFlags());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_CLASS.get(this.getHighSpeedVideoFpsRangesFor.getFlags());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isFun() {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_FUN_INTERFACE.get(this.getHighSpeedVideoFpsRangesFor.getFlags());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isValue() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_VALUE_CLASS.get(this.getHighSpeedVideoFpsRangesFor.getFlags()).booleanValue() && this.getOutputMinFrameDurationlomOqCM.isAtLeast(1, 4, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return this.getOutputStallDuration.getScope(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl getStaticScope() {
        return this.isOutputSupportedFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isCompanionObject() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.CLASS_KIND.get(this.getHighSpeedVideoFpsRangesFor.getFlags()) == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor() {
        return this.getOutputSizeshNQ4ISI.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        return this.getOutputMinFrameDuration.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceivers() {
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypes = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.contextReceiverTypes(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.getTypeTable());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(contextReceiverTypes, 10));
        java.util.Iterator<T> it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl(getThisAsReceiverParameter(), new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver(this, this.getHighSpeedVideoSizes.getTypeDeserializer().type((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it.next()), null, null), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23888getCompanionObjectDescriptor() {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> getValueClassRepresentation() {
        return this.getValidOutputFormatsForInputhNQ4ISI.invoke();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("deserialized ");
        sb.append(isExpect() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        return this.toString;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.getHighSpeedVideoSizes.getTypeDeserializer().getOwnTypeParameters();
    }

    final class DeserializedClassTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor {
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>> getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean isDenotable() {
            return true;
        }

        public DeserializedClassTypeConstructor() {
            super(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getStorageManager());
            this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$$Lambda$0
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.List computeConstructorTypeParameters;
                    computeConstructorTypeParameters = kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.computeConstructorTypeParameters(this.getHighResolutionOutputSizeshNQ4ISI);
                    return computeConstructorTypeParameters;
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = r1;
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeSupertypes() {
            java.lang.String asString;
            kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> supertypes = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.supertypes(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getTypeTable());
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supertypes, 10));
            java.util.Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializedClassDescriptor.getC().getTypeDeserializer().type((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it.next()));
            }
            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList, (java.lang.Iterable) kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = plus.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it2.next()).getConstructor().mo23898getDeclarationDescriptor();
                kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor mockClassDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor) mo23898getDeclarationDescriptor : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            java.util.ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getComponents().getErrorReporter();
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this;
                java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor> arrayList4 = arrayList3;
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                for (kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList4) {
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    if (classId == null || (asSingleFqName = classId.asSingleFqName()) == null || (asString = asSingleFqName.asString()) == null) {
                        asString = mockClassDescriptor2.getName().asString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    }
                    arrayList5.add(asString);
                }
                errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor2, arrayList5);
            }
            return kotlin.collections.CollectionsKt.toList(plus);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
            return this.getHighSpeedVideoFpsRangesFor.invoke();
        }

        public final java.lang.String toString() {
            java.lang.String obj = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getName().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker() {
            return kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23898getDeclarationDescriptor() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this;
        }
    }

    final class DeserializedClassMemberScope extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope {
        private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner Camera2StreamConfigurationMap;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType>> getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getHighSpeedVideoSizes;

        static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges(java.util.List list) {
            return list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DeserializedClassMemberScope(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
            super(r2, r3, r4, r5, new kotlin.jvm.functions.Function0(r0) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$$Lambda$0
                private final java.util.List getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = r1;
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
            this.getHighSpeedVideoSizes = deserializedClassDescriptor;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c = deserializedClassDescriptor.getC();
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(functionList, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> propertyList = deserializedClassDescriptor.getClassProto().getPropertyList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(propertyList, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> typeAliasList = deserializedClassDescriptor.getClassProto().getTypeAliasList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeAliasList, "");
            java.util.List<java.lang.Integer> nestedClassNameList = deserializedClassDescriptor.getClassProto().getNestedClassNameList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nestedClassNameList, "");
            java.util.List<java.lang.Integer> list = nestedClassNameList;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver = deserializedClassDescriptor.getC().getNameResolver();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, ((java.lang.Number) it.next()).intValue()));
            }
            final java.util.List list2 = arrayList;
            this.Camera2StreamConfigurationMap = kotlinTypeRefiner;
            this.getHighSpeedVideoFpsRangesFor = getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$$Lambda$1
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.Collection computeDescriptors;
                    computeDescriptors = this.getHighSpeedVideoFpsRangesFor.computeDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.ALL, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion.getALL_NAME_FILTER(), kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    return computeDescriptors;
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = this;
                }
            });
            this.getHighResolutionOutputSizeshNQ4ISI = getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$$Lambda$2
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.Collection refineSupertypes;
                    refineSupertypes = r0.Camera2StreamConfigurationMap.refineSupertypes(this.getHighSpeedVideoSizes.getHighSpeedVideoSizes);
                    return refineSupertypes;
                }

                {
                    this.getHighSpeedVideoSizes = this;
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            return this.getHighSpeedVideoFpsRangesFor.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            mo23903recordLookup(name2, lookupLocation);
            return super.getContributedFunctions(name2, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            mo23903recordLookup(name2, lookupLocation);
            return super.getContributedVariables(name2, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected final boolean isDeclaredFunctionAvailable(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
            return getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.getHighSpeedVideoSizes, simpleFunctionDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected final void computeNonDeclaredFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = this.getHighResolutionOutputSizeshNQ4ISI.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getMemberScope().getContributedFunctions(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            list.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name2, this.getHighSpeedVideoSizes));
            getHighSpeedVideoFpsRangesFor(name2, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected final void computeNonDeclaredProperties(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = this.getHighResolutionOutputSizeshNQ4ISI.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getMemberScope().getContributedVariables(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            getHighSpeedVideoFpsRangesFor(name2, arrayList, list);
        }

        private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> void getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<? extends D> collection, final java.util.List<D> list) {
            getC().getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(name2, collection, new java.util.ArrayList(list), this.getHighSpeedVideoSizes, new kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public final void addFakeOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                    list.add(callableMemberDescriptor);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                public final void conflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "");
                    if (callableMemberDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl) {
                        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl) callableMemberDescriptor2).putInUserDataMap(kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey.INSTANCE, callableMemberDescriptor);
                    }
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* renamed from: getContributedClassifier */
        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            mo23903recordLookup(name2, lookupLocation);
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor;
            if (enumEntryClassDescriptors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke = enumEntryClassDescriptors.getHighSpeedVideoSizes.invoke(name2);
                if (invoke != null) {
                    return invoke;
                }
            }
            return super.mo23899getContributedClassifier(name2, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected final kotlin.reflect.jvm.internal.impl.name.ClassId createClassId(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.createNestedClassId(name2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* renamed from: recordLookup */
        public final void mo23903recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, this.getHighSpeedVideoSizes, name2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected final void addEnumEntryDescriptors(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> collection, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
            java.util.List list;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor;
            if (enumEntryClassDescriptors != null) {
                java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> keySet = enumEntryClassDescriptors.getHighSpeedVideoFpsRanges.keySet();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.Name name2 : keySet) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke = enumEntryClassDescriptors.getHighSpeedVideoSizes.invoke(name2);
                    if (invoke != null) {
                        arrayList.add(invoke);
                    }
                }
                list = arrayList;
            } else {
                list = null;
            }
            if (list == null) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            collection.addAll(list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredClassifierNames() {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = this.getHighSpeedVideoSizes.unwrapAs.getSupertypes();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator<T> it = supertypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> classifierNames = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getClassifierNames();
                if (classifierNames == null) {
                    linkedHashSet = null;
                    break;
                }
                kotlin.collections.CollectionsKt.addAll(linkedHashSet, classifierNames);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredFunctionNames() {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = this.getHighSpeedVideoSizes.unwrapAs.getSupertypes();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getFunctionNames());
            }
            linkedHashSet.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(this.getHighSpeedVideoSizes));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredVariableNames() {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = this.getHighSpeedVideoSizes.unwrapAs.getSupertypes();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getVariableNames());
            }
            return linkedHashSet;
        }
    }

    final class EnumEntryClassDescriptors {
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name>> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> getHighSpeedVideoFpsRanges;
        final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getHighSpeedVideoSizes;

        public EnumEntryClassDescriptors() {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> enumEntryList = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto().getEnumEntryList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enumEntryList, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> list = enumEntryList;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (java.lang.Object obj : list) {
                linkedHashMap.put(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) obj).getName()), obj);
            }
            this.getHighSpeedVideoFpsRanges = linkedHashMap;
            kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getStorageManager();
            final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this;
            this.getHighSpeedVideoSizes = storageManager.createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this, deserializedClassDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$$Lambda$0
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors Camera2StreamConfigurationMap;
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj2) {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.name.Name) obj2);
                }

                {
                    this.Camera2StreamConfigurationMap = this;
                    this.getHighSpeedVideoSizes = deserializedClassDescriptor;
                }
            });
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$$Lambda$1
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.getHighSpeedVideoFpsRanges = this;
                }
            });
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry = enumEntryClassDescriptors.getHighSpeedVideoFpsRanges.get(name2);
            return enumEntry != null ? kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.create(deserializedClassDescriptor.getC().getStorageManager(), deserializedClassDescriptor, name2, enumEntryClassDescriptors.getHighResolutionOutputSizeshNQ4ISI, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations(deserializedClassDescriptor.getC().getStorageManager(), new kotlin.jvm.functions.Function0(deserializedClassDescriptor, enumEntry) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$$Lambda$2
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor getHighResolutionOutputSizeshNQ4ISI;
                private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.List list;
                    list = kotlin.collections.CollectionsKt.toList(r0.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(this.getHighResolutionOutputSizeshNQ4ISI.getThisAsProtoContainer$deserialization(), this.getHighSpeedVideoFpsRanges));
                    return list;
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = deserializedClassDescriptor;
                    this.getHighSpeedVideoFpsRanges = enumEntry;
                }
            }), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE) : null;
        }

        static /* synthetic */ java.util.Set getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getTypeConstructor().getSupertypes().iterator();
            while (it.hasNext()) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor : kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(it.next().getMemberScope(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) || (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor)) {
                        hashSet.add(((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) declarationDescriptor).getName());
                    }
                }
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionList = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(functionList, "");
            java.util.HashSet hashSet2 = hashSet;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this;
            java.util.Iterator<T> it2 = functionList.iterator();
            while (it2.hasNext()) {
                hashSet2.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) it2.next()).getName()));
            }
            java.util.HashSet hashSet3 = hashSet2;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> propertyList = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(propertyList, "");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this;
            java.util.Iterator<T> it3 = propertyList.iterator();
            while (it3.hasNext()) {
                hashSet2.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializedClassDescriptor2.getC().getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) it3.next()).getName()));
            }
            return kotlin.collections.SetsKt.plus((java.util.Set) hashSet3, (java.lang.Iterable) hashSet2);
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor) {
        java.lang.Object obj;
        if (deserializedClassDescriptor.getInputSizeshNQ4ISI.isSingleton()) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl createPrimaryConstructorForObject = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createPrimaryConstructorForObject(deserializedClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
            createPrimaryConstructorForObject.setReturnType(deserializedClassDescriptor.getDefaultType());
            return createPrimaryConstructorForObject;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> constructorList = deserializedClassDescriptor.getHighSpeedVideoFpsRangesFor.getConstructorList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructorList, "");
        java.util.Iterator<T> it = constructorList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SECONDARY.get(((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) obj).getFlags()).booleanValue()) {
                break;
            }
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) obj;
        if (constructor != null) {
            return deserializedClassDescriptor.getHighSpeedVideoSizes.getMemberDeserializer().loadConstructor(constructor, true);
        }
        return null;
    }

    static /* synthetic */ java.util.Collection getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor) {
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> constructorList = deserializedClassDescriptor.getHighSpeedVideoFpsRangesFor.getConstructorList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructorList, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : constructorList) {
            java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SECONDARY.get(((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) obj).getFlags());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
            if (bool.booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor : arrayList2) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = deserializedClassDescriptor.getHighSpeedVideoSizes.getMemberDeserializer();
            kotlin.jvm.internal.Intrinsics.checkNotNull(constructor);
            arrayList3.add(memberDeserializer.loadConstructor(constructor, false));
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList3, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOfNotNull(deserializedClassDescriptor.mo23889getUnsubstitutedPrimaryConstructor())), (java.lang.Iterable) deserializedClassDescriptor.getHighSpeedVideoSizes.getComponents().getAdditionalClassPartsProvider().getConstructors(deserializedClassDescriptor));
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor) {
        if (!deserializedClassDescriptor.getHighSpeedVideoFpsRangesFor.hasCompanionObjectName()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier = deserializedClassDescriptor.getOutputStallDuration.getScope(deserializedClassDescriptor.getHighSpeedVideoSizes.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner()).mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializedClassDescriptor.getHighSpeedVideoSizes.getNameResolver(), deserializedClassDescriptor.getHighSpeedVideoFpsRangesFor.getCompanionObjectName()), kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
        if (mo23899getContributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23899getContributedClassifier;
        }
        return null;
    }

    static /* synthetic */ java.util.Collection Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor) {
        if (deserializedClassDescriptor.getOutputSizes != kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<java.lang.Integer> sealedSubclassFqNameList = deserializedClassDescriptor.getHighSpeedVideoFpsRangesFor.getSealedSubclassFqNameList();
        kotlin.jvm.internal.Intrinsics.checkNotNull(sealedSubclassFqNameList);
        if (sealedSubclassFqNameList.isEmpty()) {
            return kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider.INSTANCE.computeSealedSubclasses(deserializedClassDescriptor, false);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : sealedSubclassFqNameList) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents components = deserializedClassDescriptor.getHighSpeedVideoSizes.getComponents();
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver = deserializedClassDescriptor.getHighSpeedVideoSizes.getNameResolver();
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor deserializeClass = components.deserializeClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, num.intValue()));
            if (deserializeClass != null) {
                arrayList.add(deserializeClass);
            }
        }
        return arrayList;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor) {
        if (!deserializedClassDescriptor.isInline() && !deserializedClassDescriptor.isValue()) {
            return null;
        }
        boolean isAtLeast = deserializedClassDescriptor.getOutputMinFrameDurationlomOqCM.isAtLeast(1, 5, 1);
        kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation loadValueClassRepresentation = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt.loadValueClassRepresentation(deserializedClassDescriptor.getHighSpeedVideoFpsRangesFor, isAtLeast, deserializedClassDescriptor.getHighSpeedVideoSizes.getNameResolver(), deserializedClassDescriptor.getHighSpeedVideoSizes.getTypeTable(), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$computeValueClassRepresentation$1(deserializedClassDescriptor.getHighSpeedVideoSizes.getTypeDeserializer()), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$computeValueClassRepresentation$2(deserializedClassDescriptor));
        if (loadValueClassRepresentation != null) {
            return loadValueClassRepresentation;
        }
        if (isAtLeast) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor = deserializedClassDescriptor.mo23889getUnsubstitutedPrimaryConstructor();
        if (mo23889getUnsubstitutedPrimaryConstructor == null) {
            throw new java.lang.IllegalStateException("Inline class has no primary constructor: ".concat(java.lang.String.valueOf(deserializedClassDescriptor)).toString());
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = mo23889getUnsubstitutedPrimaryConstructor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
        kotlin.reflect.jvm.internal.impl.name.Name name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.first((java.util.List) valueParameters)).getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType highSpeedVideoFpsRanges = deserializedClassDescriptor.getHighSpeedVideoFpsRanges(name2);
        if (highSpeedVideoFpsRanges == null) {
            throw new java.lang.IllegalStateException("Value class has no underlying property: ".concat(java.lang.String.valueOf(deserializedClassDescriptor)).toString());
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation(name2, highSpeedVideoFpsRanges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r0 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        java.util.Iterator<T> it = this.getOutputStallDuration.getScope(this.getHighSpeedVideoSizes.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner()).getContributedVariables(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z = false;
        java.lang.Object obj = null;
        while (true) {
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) next).getExtensionReceiverParameter() == null) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj;
        return (kotlin.reflect.jvm.internal.impl.types.SimpleType) (propertyDescriptor != null ? propertyDescriptor.getType() : null);
    }

    public final boolean hasNestedClass$deserialization(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.getOutputStallDuration.getScope(this.getHighSpeedVideoSizes.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner()).getClassNames$deserialization().contains(name2);
    }
}
