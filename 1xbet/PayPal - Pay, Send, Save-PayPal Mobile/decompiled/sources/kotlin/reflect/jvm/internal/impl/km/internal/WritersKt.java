package kotlin.reflect.jvm.internal.impl.km.internal;

/* loaded from: classes17.dex */
public final class WritersKt {
    private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext, kotlin.reflect.jvm.internal.impl.km.KmTypeProjection kmTypeProjection) {
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder newBuilder = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.newBuilder();
        if (kotlin.jvm.internal.Intrinsics.areEqual(kmTypeProjection, kotlin.reflect.jvm.internal.impl.km.KmTypeProjection.STAR)) {
            newBuilder.setProjection(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.STAR);
        } else {
            kotlin.reflect.jvm.internal.impl.km.KmVariance component1 = kmTypeProjection.component1();
            kotlin.reflect.jvm.internal.impl.km.KmType component2 = kmTypeProjection.component2();
            if (component1 == null || component2 == null) {
                throw new kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException("Variance and type must be set for non-star type projection", null, 2, null);
            }
            if (component1 == kotlin.reflect.jvm.internal.impl.km.KmVariance.IN) {
                newBuilder.setProjection(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.IN);
            } else if (component1 == kotlin.reflect.jvm.internal.impl.km.KmVariance.OUT) {
                newBuilder.setProjection(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.OUT);
            }
            newBuilder.setType(getHighSpeedVideoSizes(writeContext, component2).build());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
        return newBuilder;
    }

    private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext, kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder newBuilder = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder();
        kotlin.reflect.jvm.internal.impl.km.KmClassifier classifier = kmType.getClassifier();
        if (classifier instanceof kotlin.reflect.jvm.internal.impl.km.KmClassifier.Class) {
            newBuilder.setClassName(writeContext.getClassName$kotlin_metadata(((kotlin.reflect.jvm.internal.impl.km.KmClassifier.Class) classifier).getName()));
        } else if (classifier instanceof kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeAlias) {
            newBuilder.setTypeAliasName(writeContext.getClassName$kotlin_metadata(((kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeAlias) classifier).getName()));
        } else {
            if (!(classifier instanceof kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeParameter)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            newBuilder.setTypeParameter(((kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeParameter) classifier).getId());
        }
        java.util.Iterator<T> it = kmType.getArguments().iterator();
        while (it.hasNext()) {
            newBuilder.addArgument(getHighSpeedVideoFpsRangesFor(writeContext, (kotlin.reflect.jvm.internal.impl.km.KmTypeProjection) it.next()));
        }
        kotlin.reflect.jvm.internal.impl.km.KmType abbreviatedType = kmType.getAbbreviatedType();
        if (abbreviatedType != null) {
            newBuilder.setAbbreviatedType(getHighSpeedVideoSizes(writeContext, abbreviatedType).build());
        }
        kotlin.reflect.jvm.internal.impl.km.KmType outerType = kmType.getOuterType();
        if (outerType != null) {
            newBuilder.setOuterType(getHighSpeedVideoSizes(writeContext, outerType).build());
        }
        kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound flexibleTypeUpperBound = kmType.getFlexibleTypeUpperBound();
        if (flexibleTypeUpperBound != null) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder highSpeedVideoSizes = getHighSpeedVideoSizes(writeContext, flexibleTypeUpperBound.getType());
            java.lang.String typeFlexibilityId = flexibleTypeUpperBound.getTypeFlexibilityId();
            if (typeFlexibilityId != null) {
                newBuilder.setFlexibleTypeCapabilitiesId(writeContext.get(typeFlexibilityId));
            }
            newBuilder.setFlexibleUpperBound(highSpeedVideoSizes.build());
        }
        for (kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions metadataExtensions : writeContext.getExtensions$kotlin_metadata()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
            metadataExtensions.writeTypeExtensions(kmType, newBuilder, writeContext);
        }
        if (kotlin.reflect.jvm.internal.impl.km.Attributes.isNullable(kmType)) {
            newBuilder.setNullable(true);
        }
        int flags$kotlin_metadata = kmType.getFlags$kotlin_metadata() >> 1;
        if (flags$kotlin_metadata != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance().getFlags()) {
            newBuilder.setFlags(flags$kotlin_metadata);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
        return newBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder writeProperty(kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext, kotlin.reflect.jvm.internal.impl.km.KmProperty kmProperty) {
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind versionKind;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level level;
        java.lang.Integer valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmProperty, "");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder newBuilder = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.newBuilder();
        for (kotlin.reflect.jvm.internal.impl.km.KmTypeParameter kmTypeParameter : kmProperty.getTypeParameters()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder newBuilder2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.newBuilder();
            java.util.Iterator<T> it = kmTypeParameter.getUpperBounds().iterator();
            while (it.hasNext()) {
                newBuilder2.addUpperBound(getHighSpeedVideoSizes(writeContext, (kotlin.reflect.jvm.internal.impl.km.KmType) it.next()).build());
            }
            for (kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions metadataExtensions : writeContext.getExtensions$kotlin_metadata()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder2);
                metadataExtensions.writeTypeParameterExtensions(kmTypeParameter, newBuilder2, writeContext);
            }
            newBuilder2.setName(writeContext.get(kmTypeParameter.getName()));
            newBuilder2.setId(kmTypeParameter.getId());
            boolean isReified = kotlin.reflect.jvm.internal.impl.km.Attributes.isReified(kmTypeParameter);
            if (isReified != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.getDefaultInstance().getReified()) {
                newBuilder2.setReified(isReified);
            }
            if (kmTypeParameter.getVariance() == kotlin.reflect.jvm.internal.impl.km.KmVariance.IN) {
                newBuilder2.setVariance(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.IN);
            } else if (kmTypeParameter.getVariance() == kotlin.reflect.jvm.internal.impl.km.KmVariance.OUT) {
                newBuilder2.setVariance(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.OUT);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder2);
            newBuilder.addTypeParameter(newBuilder2.build());
        }
        kotlin.reflect.jvm.internal.impl.km.KmType receiverParameterType = kmProperty.getReceiverParameterType();
        if (receiverParameterType != null) {
            newBuilder.setReceiverType(getHighSpeedVideoSizes(writeContext, receiverParameterType).build());
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> contextParameters = kmProperty.getContextParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(contextParameters, 10));
        java.util.Iterator<T> it2 = contextParameters.iterator();
        while (it2.hasNext()) {
            arrayList.add(getHighSpeedVideoFpsRanges(writeContext, (kotlin.reflect.jvm.internal.impl.km.KmValueParameter) it2.next()).build());
        }
        newBuilder.addAllContextParameter(arrayList);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> contextParameters2 = kmProperty.getContextParameters();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(contextParameters2, 10));
        java.util.Iterator<T> it3 = contextParameters2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(getHighSpeedVideoSizes(writeContext, ((kotlin.reflect.jvm.internal.impl.km.KmValueParameter) it3.next()).getType()).build());
        }
        newBuilder.addAllContextReceiverType(arrayList2);
        kotlin.reflect.jvm.internal.impl.km.KmValueParameter setterParameter = kmProperty.getSetterParameter();
        if (setterParameter != null) {
            newBuilder.setSetterValueParameter(getHighSpeedVideoFpsRanges(writeContext, setterParameter).build());
        }
        newBuilder.setReturnType(getHighSpeedVideoSizes(writeContext, kmProperty.getReturnType()).build());
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> versionRequirements = kmProperty.getVersionRequirements();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement kmVersionRequirement : versionRequirements) {
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind kind = kmVersionRequirement.getKind();
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel level2 = kmVersionRequirement.getLevel();
            java.lang.Integer errorCode = kmVersionRequirement.getErrorCode();
            java.lang.String message = kmVersionRequirement.getMessage();
            final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder newBuilder3 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.newBuilder();
            int i = kotlin.reflect.jvm.internal.impl.km.internal.WritersKt.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i == 1) {
                versionKind = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION;
            } else if (i == 2) {
                versionKind = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.COMPILER_VERSION;
            } else if (i == 3) {
                versionKind = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.API_VERSION;
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                valueOf = null;
                if (valueOf == null) {
                    arrayList3.add(valueOf);
                }
            }
            if (versionKind != newBuilder3.getDefaultInstanceForType().getVersionKind()) {
                newBuilder3.setVersionKind(versionKind);
            }
            int i2 = kotlin.reflect.jvm.internal.impl.km.internal.WritersKt.WhenMappings.$EnumSwitchMapping$1[level2.ordinal()];
            if (i2 == 1) {
                level = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.WARNING;
            } else if (i2 == 2) {
                level = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.ERROR;
            } else {
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                level = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.HIDDEN;
            }
            if (level != newBuilder3.getDefaultInstanceForType().getLevel()) {
                newBuilder3.setLevel(level);
            }
            if (errorCode != null) {
                newBuilder3.setErrorCode(errorCode.intValue());
            }
            if (message != null) {
                newBuilder3.setMessage(writeContext.get(message));
            }
            kotlin.reflect.jvm.internal.impl.km.KmVersion version = kmVersionRequirement.getVersion();
            new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version(version.component1(), version.component2(), version.component3()).encode(new kotlin.jvm.functions.Function1(newBuilder3) { // from class: kotlin.reflect.jvm.internal.impl.km.internal.WritersKt$$Lambda$0
                private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.impl.km.internal.WritersKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, ((java.lang.Number) obj).intValue());
                }

                {
                    this.getHighSpeedVideoFpsRanges = newBuilder3;
                }
            }, new kotlin.jvm.functions.Function1(newBuilder3) { // from class: kotlin.reflect.jvm.internal.impl.km.internal.WritersKt$$Lambda$1
                private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.impl.km.internal.WritersKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, ((java.lang.Number) obj).intValue());
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = newBuilder3;
                }
            });
            kotlin.reflect.jvm.internal.impl.metadata.serialization.MutableVersionRequirementTable versionRequirements$kotlin_metadata = writeContext.getVersionRequirements$kotlin_metadata();
            kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder3);
            valueOf = java.lang.Integer.valueOf(versionRequirements$kotlin_metadata.get(newBuilder3));
            if (valueOf == null) {
            }
        }
        newBuilder.addAllVersionRequirement(arrayList3);
        for (kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions metadataExtensions2 : writeContext.getExtensions$kotlin_metadata()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
            metadataExtensions2.writePropertyExtensions(kmProperty, newBuilder, writeContext);
        }
        newBuilder.setName(writeContext.get(kmProperty.getName()));
        int flags$kotlin_metadata = kmProperty.getFlags$kotlin_metadata() | kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.toFlags(java.lang.Boolean.valueOf(!kmProperty.getAnnotations().isEmpty()));
        if (flags$kotlin_metadata != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.getDefaultInstance().getFlags()) {
            newBuilder.setFlags(flags$kotlin_metadata);
        }
        newBuilder.setGetterFlags(kmProperty.getGetter().getFlags$kotlin_metadata() | kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.toFlags(java.lang.Boolean.valueOf(!kmProperty.getGetter().getAnnotations().isEmpty())));
        kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes setter = kmProperty.getSetter();
        if (setter != null) {
            newBuilder.setSetterFlags(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.toFlags(java.lang.Boolean.valueOf(!setter.getAnnotations().isEmpty())) | setter.getFlags$kotlin_metadata());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
        return newBuilder;
    }

    private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext, kotlin.reflect.jvm.internal.impl.km.KmValueParameter kmValueParameter) {
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder newBuilder = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.newBuilder();
        newBuilder.setType(getHighSpeedVideoSizes(writeContext, kmValueParameter.getType()).build());
        kotlin.reflect.jvm.internal.impl.km.KmType varargElementType = kmValueParameter.getVarargElementType();
        if (varargElementType != null) {
            newBuilder.setVarargElementType(getHighSpeedVideoSizes(writeContext, varargElementType).build());
        }
        kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument annotationParameterDefaultValue = kmValueParameter.getAnnotationParameterDefaultValue();
        if (annotationParameterDefaultValue != null) {
            newBuilder.setAnnotationParameterDefaultValue(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotationArgument(annotationParameterDefaultValue, writeContext.getStrings()).build());
        }
        for (kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions metadataExtensions : writeContext.getExtensions$kotlin_metadata()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
            metadataExtensions.writeValueParameterExtensions(kmValueParameter, newBuilder, writeContext);
        }
        int flags$kotlin_metadata = kmValueParameter.getFlags$kotlin_metadata() | kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.toFlags(java.lang.Boolean.valueOf(!kmValueParameter.getAnnotations().isEmpty()));
        if (flags$kotlin_metadata != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance().getFlags()) {
            newBuilder.setFlags(flags$kotlin_metadata);
        }
        newBuilder.setName(writeContext.get(kmValueParameter.getName()));
        kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
        return newBuilder;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder builder, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(builder);
        builder.setVersion(i);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder builder, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(builder);
        builder.setVersionFull(i);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.COMPILER_VERSION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.API_VERSION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.values().length];
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.WARNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.HIDDEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[kotlin.reflect.jvm.internal.impl.km.KmEffectType.values().length];
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.km.KmEffectType.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.km.KmEffectType.CALLS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.km.KmEffectType.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.values().length];
            try {
                iArr4[kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.AT_MOST_ONCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr4[kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.EXACTLY_ONCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr4[kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }
}
