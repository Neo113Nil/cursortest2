package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes5.dex */
public final class DescriptorRendererImpl extends kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer implements kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions {
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl getHighSpeedVideoSizes;

    public DescriptorRendererImpl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptionsImpl, "");
        this.getHighSpeedVideoSizes = descriptorRendererOptionsImpl;
        descriptorRendererOptionsImpl.isLocked();
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl getOptions() {
        return this.getHighSpeedVideoSizes;
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (!getBoldOnlyForNamesInHtml()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("<b>");
                sb.append(str);
                sb.append("</b>");
                return sb.toString();
            }
        }
        return str;
    }

    private final java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<font color=red><b>");
        sb.append(str);
        sb.append("</b></font>");
        return sb.toString();
    }

    public final java.lang.String renderMessage(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<i>");
        sb.append(str);
        sb.append("</i>");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final java.lang.String renderName(kotlin.reflect.jvm.internal.impl.name.Name name2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String escape = getTextFormat().escape(kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render$default(name2, false, 1, null));
        if (!getBoldOnlyForNamesInHtml() || getTextFormat() != kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML || !z) {
            return escape;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<b>");
        sb.append(escape);
        sb.append("</b>");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final java.lang.String renderFqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqNameUnsafe, "");
        return getTextFormat().escape(kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.renderFqName(fqNameUnsafe.pathSegments()));
    }

    public final java.lang.String renderClassifierName(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierDescriptor, "");
        if (kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(classifierDescriptor)) {
            return classifierDescriptor.getTypeConstructor().toString();
        }
        return getClassifierNamePolicy().renderClassifier(classifierDescriptor, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final java.lang.String renderType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        getHighResolutionOutputSizeshNQ4ISI(sb, getTypeNormalizer().invoke(kotlinType));
        return sb.toString();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        kotlin.reflect.jvm.internal.impl.types.AbbreviatedType abbreviatedType = unwrap instanceof kotlin.reflect.jvm.internal.impl.types.AbbreviatedType ? (kotlin.reflect.jvm.internal.impl.types.AbbreviatedType) unwrap : null;
        if (abbreviatedType != null) {
            if (getRenderTypeExpansions()) {
                getHighSpeedVideoSizes(sb, abbreviatedType.getExpandedType());
                if (getRenderAbbreviatedTypeComments()) {
                    Camera2StreamConfigurationMap(sb, abbreviatedType);
                    return;
                }
                return;
            }
            getHighSpeedVideoSizes(sb, abbreviatedType.getAbbreviation());
            if (getRenderUnabbreviatedType()) {
                getHighSpeedVideoFpsRangesFor(sb, abbreviatedType);
                return;
            }
            return;
        }
        getHighSpeedVideoSizes(sb, kotlinType);
    }

    private final void getHighSpeedVideoSizes(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if ((kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.WrappedType) && getDebugMode() && !((kotlin.reflect.jvm.internal.impl.types.WrappedType) kotlinType).isComputed()) {
            sb.append("<Not computed yet>");
            return;
        }
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap).render(this, this));
        } else {
            if (!(unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            getHighSpeedVideoFpsRangesFor(sb, (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(simpleType, kotlin.reflect.jvm.internal.impl.types.TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE)) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2 = simpleType;
            if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.isDontCarePlaceholder(simpleType2)) {
                if (kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isUninferredTypeVariable(simpleType2)) {
                    if (getUninferredTypeParameterAsName()) {
                        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = simpleType.getConstructor();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(constructor, "");
                        sb.append(Camera2StreamConfigurationMap(((kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor) constructor).getParam(0)));
                        return;
                    }
                    sb.append("???");
                    return;
                }
                if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(simpleType2)) {
                    getHighSpeedVideoFpsRanges(sb, simpleType2);
                    return;
                } else if (Camera2StreamConfigurationMap(simpleType2)) {
                    Camera2StreamConfigurationMap(sb, simpleType2);
                    return;
                } else {
                    getHighSpeedVideoFpsRanges(sb, simpleType2);
                    return;
                }
            }
        }
        sb.append("???");
    }

    private static boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (!kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            return false;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = kotlinType.getArguments();
        if ((arguments instanceof java.util.Collection) && arguments.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            if (((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).isStarProjection()) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final java.lang.String renderFlexibleType(java.lang.String str, java.lang.String str2, final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        if (kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.typeStringsDifferOnlyInNullability(str, str2)) {
            if (kotlin.text.StringsKt.startsWith$default(str2, "(", false, 2, (java.lang.Object) null)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
                sb.append(str);
                sb.append(")!");
                return sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append('!');
            return sb2.toString();
        }
        java.lang.String renderFlexibleMutabilityOrArrayElementVarianceType = kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.renderFlexibleMutabilityOrArrayElementVarianceType(str, str2, new kotlin.jvm.functions.Function0(this, kotlinBuiltIns) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl getHighSpeedVideoFpsRangesFor;
            private final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
                this.getHighSpeedVideoSizes = kotlinBuiltIns;
            }
        }, new kotlin.jvm.functions.Function0(this, kotlinBuiltIns) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
                this.getHighSpeedVideoSizes = kotlinBuiltIns;
            }
        }, new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderFlexibleType$3(this));
        if (renderFlexibleMutabilityOrArrayElementVarianceType != null) {
            return renderFlexibleMutabilityOrArrayElementVarianceType;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("(");
        sb3.append(str);
        sb3.append("..");
        sb3.append(str2);
        sb3.append(')');
        return sb3.toString();
    }

    public final java.lang.String renderTypeArguments(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getTextFormat().escape("<"));
        getHighSpeedVideoFpsRanges(sb, list);
        sb.append(getTextFormat().escape(">"));
        return sb.toString();
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        getHighResolutionOutputSizeshNQ4ISI(sb, kotlinType, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null);
        kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType definitelyNotNullType = kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType ? (kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) kotlinType : null;
        kotlin.reflect.jvm.internal.impl.types.SimpleType original = definitelyNotNullType != null ? definitelyNotNullType.getOriginal() : null;
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType)) {
            if (kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isUnresolvedType(kotlinType) && getPresentableUnresolvedTypes()) {
                sb.append(Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.unresolvedTypeAsItIs(kotlinType)));
            } else {
                if ((kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.error.ErrorType) && !getInformativeErrorType()) {
                    sb.append(((kotlin.reflect.jvm.internal.impl.types.error.ErrorType) kotlinType).getDebugMessage());
                } else {
                    sb.append(kotlinType.getConstructor().toString());
                }
                sb.append(renderTypeArguments(kotlinType.getArguments()));
            }
        } else if (kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable().toString());
        } else if (original instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference) original).getOriginalTypeVariable().toString());
        } else {
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
            kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType buildPossiblyInnerType = kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.buildPossiblyInnerType(kotlinType);
            if (buildPossiblyInnerType == null) {
                sb.append(renderTypeConstructor(constructor));
                sb.append(renderTypeArguments(kotlinType.getArguments()));
            } else {
                getHighSpeedVideoFpsRanges(sb, buildPossiblyInnerType);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (kotlinType.isMarkedNullable()) {
            sb.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
        }
        if (kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            sb.append(" & Any");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType possiblyInnerType) {
        kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            getHighSpeedVideoFpsRanges(sb, outerType);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            kotlin.reflect.jvm.internal.impl.name.Name name2 = possiblyInnerType.getClassifierDescriptor().getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            sb.append(renderName(name2, false));
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
        sb.append(renderTypeConstructor(typeConstructor));
        sb.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    public final java.lang.String renderTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = typeConstructor.mo23898getDeclarationDescriptor();
        if ((mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) || (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) || (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor)) {
            return renderClassifierName(mo23898getDeclarationDescriptor);
        }
        if (mo23898getDeclarationDescriptor == null) {
            if (typeConstructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) typeConstructor).makeDebugNameForIntersectionType(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$3
                    @Override // kotlin.jvm.functions.Function1
                    public java.lang.Object invoke(java.lang.Object obj) {
                        return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.types.KotlinType) obj);
                    }
                });
            }
            return typeConstructor.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected classifier: ");
        sb.append(mo23898getDeclarationDescriptor.getClass());
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final java.lang.String renderTypeProjection(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeProjection, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        getHighSpeedVideoFpsRanges(sb, kotlin.collections.CollectionsKt.listOf(typeProjection));
        return sb.toString();
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        kotlin.collections.CollectionsKt.joinTo(list, sb, (r14 & 2) != 0 ? ", " : ", ", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$4
            private final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.types.TypeProjection) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    private final void Camera2StreamConfigurationMap(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.name.Name name2;
        java.lang.String escape;
        int length = sb.length();
        ((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl) this.getHighSpeedVideoFpsRanges.getValue()).getHighResolutionOutputSizeshNQ4ISI(sb, kotlinType, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null);
        boolean z = sb.length() != length;
        kotlin.reflect.jvm.internal.impl.types.KotlinType receiverTypeFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> contextReceiverTypesFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        boolean isSuspendFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(kotlinType);
        boolean isMarkedNullable = kotlinType.isMarkedNullable();
        boolean z2 = isMarkedNullable || (z && receiverTypeFromFunctionType != null);
        if (z2) {
            if (isSuspendFunctionType) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    java.lang.StringBuilder sb2 = sb;
                    kotlin.text.CharsKt.isWhitespace(kotlin.text.StringsKt.last(sb2));
                    if (sb.charAt(kotlin.text.StringsKt.getLastIndex(sb2) - 1) != ')') {
                        sb.insert(kotlin.text.StringsKt.getLastIndex(sb2), "()");
                    }
                }
                sb.append("(");
            }
        }
        if (isSuspendFunctionType) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI("suspend"));
            sb.append(" ");
        }
        if (!contextReceiverTypesFromFunctionType.isEmpty()) {
            sb.append("context(");
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = contextReceiverTypesFromFunctionType.subList(0, kotlin.collections.CollectionsKt.getLastIndex(contextReceiverTypesFromFunctionType)).iterator();
            while (it.hasNext()) {
                getHighResolutionOutputSizeshNQ4ISI(sb, it.next());
                sb.append(", ");
            }
            getHighResolutionOutputSizeshNQ4ISI(sb, (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.collections.CollectionsKt.last((java.util.List) contextReceiverTypesFromFunctionType));
            sb.append(") ");
        }
        if (receiverTypeFromFunctionType != null) {
            boolean z3 = (Camera2StreamConfigurationMap(receiverTypeFromFunctionType) && !receiverTypeFromFunctionType.isMarkedNullable()) || kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(receiverTypeFromFunctionType) || !receiverTypeFromFunctionType.getAnnotations().isEmpty() || (receiverTypeFromFunctionType instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType);
            if (z3) {
                sb.append("(");
            }
            getHighResolutionOutputSizeshNQ4ISI(sb, receiverTypeFromFunctionType);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isBuiltinExtensionFunctionalType(kotlinType) && kotlinType.getArguments().size() <= 1) {
            sb.append("???");
        } else {
            int i = 0;
            for (kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection : kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (getParameterNamesInFunctionalTypes()) {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                    name2 = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
                } else {
                    name2 = null;
                }
                if (name2 != null) {
                    sb.append(renderName(name2, false));
                    sb.append(": ");
                }
                sb.append(renderTypeProjection(typeProjection));
                i++;
            }
        }
        sb.append(") ");
        int i2 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i2 == 1) {
            escape = getTextFormat().escape("->");
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            escape = "&rarr;";
        }
        sb.append(escape);
        sb.append(" ");
        getHighResolutionOutputSizeshNQ4ISI(sb, kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
        if (z2) {
            sb.append(")");
        }
        if (isMarkedNullable) {
            sb.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ANNOTATIONS)) {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> excludedTypeAnnotationClasses = annotated instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, java.lang.Boolean> annotationFilter = getAnnotationFilter();
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!kotlin.collections.CollectionsKt.contains(excludedTypeAnnotationClasses, annotationDescriptor.getFqName()) && !kotlin.jvm.internal.Intrinsics.areEqual(annotationDescriptor.getFqName(), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.parameterName) && (annotationFilter == null || annotationFilter.invoke(annotationDescriptor).booleanValue())) {
                    sb.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final java.lang.String renderAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationDescriptor, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(annotationUseSiteTarget.getRenderName());
            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb.append(sb2.toString());
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = annotationDescriptor.getType();
        sb.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
            java.util.ArrayList arrayList = null;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass = getRenderDefaultAnnotationArguments() ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor) : null;
            if (annotationClass != null && (mo23889getUnsubstitutedPrimaryConstructor = annotationClass.mo23889getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = mo23889getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : valueParameters) {
                    if (((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) obj).declaresDefaultValue()) {
                        arrayList2.add(obj);
                    }
                }
                java.util.ArrayList arrayList3 = arrayList2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next()).getName());
                }
                arrayList = arrayList4;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (!allValueArguments.containsKey((kotlin.reflect.jvm.internal.impl.name.Name) obj2)) {
                    arrayList5.add(obj2);
                }
            }
            java.util.ArrayList<kotlin.reflect.jvm.internal.impl.name.Name> arrayList6 = arrayList5;
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : arrayList6) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(name2.asString());
                sb3.append(" = ...");
                arrayList7.add(sb3.toString());
            }
            java.util.ArrayList arrayList8 = arrayList7;
            java.util.Set<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>> entrySet = allValueArguments.entrySet();
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entrySet, 10));
            java.util.Iterator<T> it2 = entrySet.iterator();
            while (it2.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                kotlin.reflect.jvm.internal.impl.name.Name name3 = (kotlin.reflect.jvm.internal.impl.name.Name) entry.getKey();
                kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) entry.getValue();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(name3.asString());
                sb4.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
                sb4.append(!arrayList.contains(name3) ? getHighSpeedVideoFpsRanges(constantValue) : "...");
                arrayList9.add(sb4.toString());
            }
            java.util.List sorted = kotlin.collections.CollectionsKt.sorted(kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList8, (java.lang.Iterable) arrayList9));
            if (getIncludeEmptyAnnotationArguments() || !sorted.isEmpty()) {
                kotlin.collections.CollectionsKt.joinTo(sorted, sb, (r14 & 2) != 0 ? ", " : ", ", (r14 & 4) != 0 ? "" : "(", (r14 & 8) != 0 ? "" : ")", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
            }
        }
        if (getVerbose() && (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(type) || (type.getConstructor().mo23898getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    private final java.lang.String getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue) {
        kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>, java.lang.String> propertyConstantRenderer = this.getHighSpeedVideoSizes.getPropertyConstantRenderer();
        if (propertyConstantRenderer != null) {
            return propertyConstantRenderer.invoke(constantValue);
        }
        if (!(constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue)) {
            if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue) {
                return kotlin.text.StringsKt.removePrefix(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.renderAnnotation$default(this, ((kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue) constantValue).getValue(), null, 2, null), (java.lang.CharSequence) "@");
            }
            if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue) {
                kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value value = ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue) constantValue).getValue();
                if (value instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) value).getType());
                    sb.append("::class");
                    return sb.toString();
                }
                if (!(value instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass normalClass = (kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) value;
                java.lang.String asString = normalClass.getClassId().asSingleFqName().asString();
                int arrayDimensions = normalClass.getArrayDimensions();
                for (int i = 0; i < arrayDimensions; i++) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("kotlin.Array<");
                    sb2.append(asString);
                    sb2.append(kotlin.text.Typography.greater);
                    asString = sb2.toString();
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(asString);
                sb3.append("::class");
                return sb3.toString();
            }
            return constantValue.toString();
        }
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> value2 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) constantValue).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = value2.iterator();
        while (it.hasNext()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>) it.next());
            if (highSpeedVideoFpsRanges != null) {
                arrayList.add(highSpeedVideoFpsRanges);
            }
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ", ", "{", "}", 0, null, null, 56, null);
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, java.lang.StringBuilder sb) {
        if (!getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            descriptorVisibility = descriptorVisibility.normalize();
        }
        if (!getRenderDefaultVisibility() && kotlin.jvm.internal.Intrinsics.areEqual(descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb.append(getHighResolutionOutputSizeshNQ4ISI(descriptorVisibility.getInternalDisplayName()));
        sb.append(" ");
        return true;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality2) {
        if (getRenderDefaultModality() || modality != modality2) {
            boolean contains = getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.MODALITY);
            java.lang.String lowerCaseAsciiOnly = kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name());
            if (contains) {
                sb.append(getHighResolutionOutputSizeshNQ4ISI(lowerCaseAsciiOnly));
                sb.append(" ");
            }
        }
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.Modality getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) memberDescriptor).getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE ? kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT : kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null && (memberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor)) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) memberDescriptor;
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
            if (!overriddenDescriptors.isEmpty() && classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
            }
            if (classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || kotlin.jvm.internal.Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PRIVATE)) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
            }
            return callableMemberDescriptor.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT ? kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT : kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
    }

    private final void Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.lang.StringBuilder sb) {
        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) && callableMemberDescriptor.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() == kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN && (!callableMemberDescriptor.getOverriddenDescriptors().isEmpty())) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = callableMemberDescriptor.getModality();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(modality, "");
        getHighResolutionOutputSizeshNQ4ISI(modality, sb, getHighSpeedVideoFpsRangesFor(callableMemberDescriptor));
    }

    private final void getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.lang.StringBuilder sb) {
        if (getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.OVERRIDE) && (!callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) && getOverrideRenderingPolicy() != kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy.RENDER_OPEN) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI("override"));
            sb.append(" ");
            if (getVerbose()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                sb.append("*/ ");
            }
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.lang.StringBuilder sb) {
        if (getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            sb.append(kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor.getKind().name()));
            sb.append("*/ ");
        }
    }

    private final void getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor memberDescriptor, java.lang.StringBuilder sb) {
        if (memberDescriptor.isExternal()) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL));
            sb.append(" ");
        }
        if (getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect()) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI("expect"));
            sb.append(" ");
        }
        if (getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual()) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI("actual"));
            sb.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final java.lang.String render(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration;
        java.lang.String name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        declarationDescriptor.accept(new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.RenderDeclarationDescriptorVisitor(), sb);
        if (getWithDefinedIn() && !(declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && !(declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor) && (containingDeclaration = declarationDescriptor.getContainingDeclaration()) != null && !(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor)) {
            sb.append(" ");
            sb.append(renderMessage("defined in"));
            sb.append(" ");
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqName = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(containingDeclaration);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName, "");
            sb.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
            if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource) && (name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile().getName()) != null) {
                sb.append(" ");
                sb.append(renderMessage("in file"));
                sb.append(" ");
                sb.append(name2);
            }
        }
        return sb.toString();
    }

    private final void Camera2StreamConfigurationMap(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, java.lang.StringBuilder sb, boolean z) {
        if (getWithoutTypeParameters() || list.isEmpty()) {
            return;
        }
        sb.append(getTextFormat().escape("<"));
        getHighSpeedVideoSizes(sb, list);
        sb.append(getTextFormat().escape(">"));
        if (z) {
            sb.append(" ");
        }
    }

    private final void getHighSpeedVideoSizes(java.lang.StringBuilder sb, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list) {
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            getHighSpeedVideoSizes(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, java.lang.StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter;
        if (!getReceiverAfterName() || (extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter()) == null) {
            return;
        }
        sb.append(" on ");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = extensionReceiverParameter.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        sb.append(renderType(type));
    }

    private final java.lang.String getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z) {
        java.lang.String renderType = renderType(kotlinType);
        if ((!Camera2StreamConfigurationMap(kotlinType) || kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(kotlinType)) && !(kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) && (!z || kotlinType.getAnnotations().isEmpty())) {
            return renderType;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(renderType);
        sb.append(')');
        return sb.toString();
    }

    private final void getHighSpeedVideoFpsRangesFor(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list, java.lang.StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        java.util.Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = ((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) it.next()).getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            sb.append(getHighSpeedVideoFpsRangesFor(type, true));
            if (i == kotlin.collections.CollectionsKt.getLastIndex(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i++;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, java.lang.StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            getHighResolutionOutputSizeshNQ4ISI(sb, extensionReceiverParameter, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.RECEIVER);
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = extensionReceiverParameter.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            sb.append(getHighSpeedVideoFpsRangesFor(type, false));
            sb.append(".");
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, java.lang.StringBuilder sb) {
        if (getWithoutTypeParameters()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
            java.util.ArrayList arrayList2 = arrayList;
            for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : kotlin.collections.CollectionsKt.drop(upperBounds, 1)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                kotlin.reflect.jvm.internal.impl.name.Name name2 = typeParameterDescriptor.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                sb2.append(renderName(name2, false));
                sb2.append(" : ");
                kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType);
                sb2.append(renderType(kotlinType));
                arrayList2.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(getHighResolutionOutputSizeshNQ4ISI("where"));
        sb.append(" ");
        kotlin.collections.CollectionsKt.joinTo(arrayList, sb, (r14 & 2) != 0 ? ", " : ", ", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
    }

    private final void Camera2StreamConfigurationMap(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> collection, boolean z, java.lang.StringBuilder sb) {
        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(z);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb);
        int i = 0;
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor : collection) {
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i, size, sb);
            getHighSpeedVideoFpsRangesFor(valueParameterDescriptor, highResolutionOutputSizeshNQ4ISI, sb, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i, size, sb);
            i++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb);
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.WhenMappings.$EnumSwitchMapping$1[getParameterNameRenderingPolicy().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return !z;
        }
        if (i == 3) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r1 != true) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, boolean z, java.lang.StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI("value-parameter"));
            sb.append(" ");
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(valueParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        getHighResolutionOutputSizeshNQ4ISI(sb, valueParameterDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null);
        if (valueParameterDescriptor.isCrossinline()) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI("crossinline"));
            sb.append(" ");
        }
        if (valueParameterDescriptor.isNoinline()) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI("noinline"));
            sb.append(" ");
        }
        if (getRenderPrimaryConstructorParametersAsProperties()) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor containingDeclaration = valueParameterDescriptor.getContainingDeclaration();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) containingDeclaration : null;
            if (classConstructorDescriptor != null) {
                boolean isPrimary = classConstructorDescriptor.isPrimary();
                z3 = true;
            }
        }
        z3 = false;
        boolean z4 = z3;
        if (z4 && getActualPropertiesInPrimaryConstructor()) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI("actual"));
            sb.append(" ");
        }
        Camera2StreamConfigurationMap(valueParameterDescriptor, z, sb, z2, z4);
        if (getDefaultParameterValueRenderer() != null) {
            if (getDebugMode() ? valueParameterDescriptor.declaresDefaultValue() : kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
                kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.String> defaultParameterValueRenderer = getDefaultParameterValueRenderer();
                kotlin.jvm.internal.Intrinsics.checkNotNull(defaultParameterValueRenderer);
                sb2.append(defaultParameterValueRenderer.invoke(valueParameterDescriptor));
                sb.append(sb2.toString());
            }
        }
    }

    private final void Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor, java.lang.StringBuilder sb, boolean z) {
        if (z || !(variableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor)) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI(variableDescriptor.isVar() ? "var" : "val"));
            sb.append(" ");
        }
    }

    private final void Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor, boolean z, java.lang.StringBuilder sb, boolean z2, boolean z3) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = variableDescriptor.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = variableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) variableDescriptor : null;
        kotlin.reflect.jvm.internal.impl.types.KotlinType varargElementType = valueParameterDescriptor != null ? valueParameterDescriptor.getVarargElementType() : null;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = varargElementType == null ? type : varargElementType;
        if (varargElementType != null) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI("vararg"));
            sb.append(" ");
        }
        if (z3 || (z2 && !getStartFromName())) {
            Camera2StreamConfigurationMap(variableDescriptor, sb, z3);
        }
        if (z) {
            kotlin.reflect.jvm.internal.impl.name.Name name2 = variableDescriptor.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            sb.append(renderName(name2, z2));
            sb.append(": ");
        }
        sb.append(renderType(kotlinType));
        Camera2StreamConfigurationMap(variableDescriptor, sb);
        if (!getVerbose() || varargElementType == null) {
            return;
        }
        sb.append(" /*");
        sb.append(renderType(type));
        sb.append("*/");
    }

    private final void Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor, java.lang.StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mo23891getCompileTimeInitializer;
        java.lang.String highSpeedVideoFpsRanges;
        if (!getIncludePropertyConstant() || (mo23891getCompileTimeInitializer = variableDescriptor.mo23891getCompileTimeInitializer()) == null || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(mo23891getCompileTimeInitializer)) == null) {
            return;
        }
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(getTextFormat().escape(highSpeedVideoFpsRanges));
    }

    private final void getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, java.lang.StringBuilder sb) {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.getTypeConstructor().getParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb.append(" /*captured type parameters: ");
            getHighSpeedVideoSizes(sb, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb.append("*/");
        }
    }

    private final void Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.lang.String str, java.lang.StringBuilder sb) {
        sb.append(getHighResolutionOutputSizeshNQ4ISI(str));
        java.lang.String renderFqName = renderFqName(fqName.toUnsafe());
        if (renderFqName.length() > 0) {
            sb.append(" ");
            sb.append(renderFqName);
        }
    }

    final class RenderDeclarationDescriptorVisitor implements kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<kotlin.Unit, java.lang.StringBuilder> {
        public RenderDeclarationDescriptorVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitClassDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderClass(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this, classDescriptor, sb2);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructorDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderConstructor(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this, constructorDescriptor, sb2);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitFunctionDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderFunction(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this, functionDescriptor, sb2);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitModuleDeclaration(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderName(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this, moduleDescriptor, sb2, true);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitPackageFragmentDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderPackageFragment(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this, packageFragmentDescriptor, sb2);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitPackageViewDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageViewDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderPackageView(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this, packageViewDescriptor, sb2);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitPropertyDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderProperty(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this, propertyDescriptor, sb2);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitPropertyGetterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor propertyGetterDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyGetterDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            Camera2StreamConfigurationMap(propertyGetterDescriptor, sb2, "getter");
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitPropertySetterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertySetterDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            Camera2StreamConfigurationMap(propertySetterDescriptor, sb2, "setter");
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitReceiverParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverParameterDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            sb2.append(receiverParameterDescriptor.getName());
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitTypeAliasDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAliasDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderTypeAlias(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this, typeAliasDescriptor, sb2);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.getHighSpeedVideoSizes(typeParameterDescriptor, sb2, true);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* synthetic */ kotlin.Unit visitValueParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, java.lang.StringBuilder sb) {
            java.lang.StringBuilder sb2 = sb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameterDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb2, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.getHighSpeedVideoFpsRangesFor(valueParameterDescriptor, true, sb2, true);
            return kotlin.Unit.INSTANCE;
        }

        private final void Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor propertyAccessorDescriptor, java.lang.StringBuilder sb, java.lang.String str) {
            int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.RenderDeclarationDescriptorVisitor.WhenMappings.$EnumSwitchMapping$0[kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.getPropertyAccessorRenderingPolicy().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor propertyAccessorDescriptor2 = propertyAccessorDescriptor;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyAccessorDescriptor2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
                    kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderFunction(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this, propertyAccessorDescriptor2, sb);
                    return;
                }
            }
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderAccessorModifiers(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this, propertyAccessorDescriptor, sb);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(" for ");
            sb.append(sb2.toString());
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this;
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor correspondingProperty = propertyAccessorDescriptor.getCorrespondingProperty();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(correspondingProperty, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.access$renderProperty(descriptorRendererImpl, correspondingProperty, sb);
        }

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    private final void Camera2StreamConfigurationMap(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.AbbreviatedType abbreviatedType) {
        if (getTextFormat() == kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* ");
        sb.append("from: ");
        getHighSpeedVideoSizes(sb, abbreviatedType.getAbbreviation());
        sb.append(" */");
        if (getTextFormat() == kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML) {
            sb.append("</i></font>");
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.AbbreviatedType abbreviatedType) {
        if (getTextFormat() == kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* ");
        sb.append("= ");
        getHighSpeedVideoSizes(sb, abbreviatedType.getExpandedType());
        sb.append(" */");
        if (getTextFormat() == kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML) {
            sb.append("</i></font>");
        }
    }

    public static final /* synthetic */ void access$renderAccessorModifiers(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor propertyAccessorDescriptor, java.lang.StringBuilder sb) {
        descriptorRendererImpl.getHighSpeedVideoFpsRanges(propertyAccessorDescriptor, sb);
    }

    public static final /* synthetic */ void access$renderClass(final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.lang.StringBuilder sb) {
        int length;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor;
        int length2;
        boolean z = classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY;
        if (!descriptorRendererImpl.getStartFromName()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> contextReceivers = classDescriptor.getContextReceivers();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceivers, "");
            descriptorRendererImpl.getHighSpeedVideoFpsRangesFor(contextReceivers, sb);
            descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, classDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null);
            if (!z) {
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = classDescriptor.getVisibility();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visibility, "");
                descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(visibility, sb);
            }
            if ((classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL)) {
                kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = classDescriptor.getModality();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(modality, "");
                descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(modality, sb, getHighSpeedVideoFpsRangesFor(classDescriptor));
            }
            descriptorRendererImpl.getHighSpeedVideoFpsRanges(classDescriptor, sb);
            if (descriptorRendererImpl.getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.INNER) && classDescriptor.isInner()) {
                sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("inner"));
                sb.append(" ");
            }
            if (descriptorRendererImpl.getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.DATA) && classDescriptor.isData()) {
                sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
                sb.append(" ");
            }
            if (descriptorRendererImpl.getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.INLINE) && classDescriptor.isInline()) {
                sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("inline"));
                sb.append(" ");
            }
            if (descriptorRendererImpl.getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.VALUE) && classDescriptor.isValue()) {
                sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE));
                sb.append(" ");
            }
            if (descriptorRendererImpl.getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.FUN) && classDescriptor.isFun()) {
                sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("fun"));
                sb.append(" ");
            }
            sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = classDescriptor;
        if (!kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(classDescriptor2)) {
            if (!descriptorRendererImpl.getStartFromName() && ((length2 = sb.length()) == 0 || sb.charAt(length2 - 1) != ' ')) {
                sb.append(' ');
            }
            kotlin.reflect.jvm.internal.impl.name.Name name2 = classDescriptor2.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            sb.append(descriptorRendererImpl.renderName(name2, true));
        } else {
            if (descriptorRendererImpl.getRenderCompanionObjectName()) {
                if (descriptorRendererImpl.getStartFromName()) {
                    sb.append("companion object");
                }
                int length3 = sb.length();
                if (length3 == 0 || sb.charAt(length3 - 1) != ' ') {
                    sb.append(' ');
                }
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = classDescriptor2.getContainingDeclaration();
                if (containingDeclaration != null) {
                    sb.append("of ");
                    kotlin.reflect.jvm.internal.impl.name.Name name3 = containingDeclaration.getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
                    sb.append(descriptorRendererImpl.renderName(name3, false));
                }
            }
            if (descriptorRendererImpl.getVerbose() || !kotlin.jvm.internal.Intrinsics.areEqual(classDescriptor2.getName(), kotlin.reflect.jvm.internal.impl.name.SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
                if (!descriptorRendererImpl.getStartFromName() && ((length = sb.length()) == 0 || sb.charAt(length - 1) != ' ')) {
                    sb.append(' ');
                }
                kotlin.reflect.jvm.internal.impl.name.Name name4 = classDescriptor2.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name4, "");
                sb.append(descriptorRendererImpl.renderName(name4, true));
            }
        }
        if (z) {
            return;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "");
        descriptorRendererImpl.Camera2StreamConfigurationMap((java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>) declaredTypeParameters, sb, false);
        descriptorRendererImpl.getHighSpeedVideoFpsRangesFor(classDescriptor, sb);
        if (!classDescriptor.getKind().isSingleton() && descriptorRendererImpl.getClassWithPrimaryConstructor() && (mo23889getUnsubstitutedPrimaryConstructor = classDescriptor.mo23889getUnsubstitutedPrimaryConstructor()) != null) {
            sb.append(" ");
            descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, mo23889getUnsubstitutedPrimaryConstructor, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null);
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility2 = mo23889getUnsubstitutedPrimaryConstructor.getVisibility();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visibility2, "");
            descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(visibility2, sb);
            sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("constructor"));
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = mo23889getUnsubstitutedPrimaryConstructor.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
            descriptorRendererImpl.Camera2StreamConfigurationMap(valueParameters, mo23889getUnsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb);
        }
        if (!descriptorRendererImpl.getWithoutSuperTypes() && !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
            if (!supertypes.isEmpty() && (supertypes.size() != 1 || !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAnyOrNullableAny(supertypes.iterator().next()))) {
                int length4 = sb.length();
                if (length4 == 0 || sb.charAt(length4 - 1) != ' ') {
                    sb.append(' ');
                }
                sb.append(": ");
                kotlin.collections.CollectionsKt.joinTo(supertypes, sb, (r14 & 2) != 0 ? ", " : ", ", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1(descriptorRendererImpl) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$6
                    private final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.jvm.functions.Function1
                    public java.lang.Object invoke(java.lang.Object obj) {
                        return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj);
                    }

                    {
                        this.getHighSpeedVideoFpsRangesFor = descriptorRendererImpl;
                    }
                });
            }
        }
        descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(declaredTypeParameters, sb);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void access$renderConstructor(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, java.lang.StringBuilder sb) {
        boolean z;
        boolean z2;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor;
        java.util.ArrayList arrayList;
        descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, constructorDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null);
        if (descriptorRendererImpl.getHighSpeedVideoSizes.getRenderDefaultVisibility() || constructorDescriptor.getConstructedClass().getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED) {
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = constructorDescriptor.getVisibility();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visibility, "");
            if (descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(visibility, sb)) {
                z = true;
                descriptorRendererImpl.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) constructorDescriptor, sb);
                z2 = (descriptorRendererImpl.getRenderConstructorKeyword() && constructorDescriptor.isPrimary() && !z) ? false : true;
                if (z2) {
                    sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("constructor"));
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
                if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
                    if (z2) {
                        sb.append(" ");
                    }
                    kotlin.reflect.jvm.internal.impl.name.Name name2 = containingDeclaration.getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                    sb.append(descriptorRendererImpl.renderName(name2, true));
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = constructorDescriptor.getTypeParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
                    descriptorRendererImpl.Camera2StreamConfigurationMap((java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>) typeParameters, sb, false);
                }
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                descriptorRendererImpl.Camera2StreamConfigurationMap(valueParameters, constructorDescriptor.hasSynthesizedParameterNames(), sb);
                if (descriptorRendererImpl.getRenderConstructorDelegation() && !constructorDescriptor.isPrimary() && (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && (mo23889getUnsubstitutedPrimaryConstructor = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration).mo23889getUnsubstitutedPrimaryConstructor()) != null) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = mo23889getUnsubstitutedPrimaryConstructor.getValueParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters2, "");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : valueParameters2) {
                        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) obj;
                        if (!valueParameterDescriptor.declaresDefaultValue() && valueParameterDescriptor.getVarargElementType() == null) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = arrayList2;
                    if (!arrayList.isEmpty()) {
                        sb.append(" : ");
                        sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("this"));
                        sb.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList, ", ", "(", ")", 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$5
                            @Override // kotlin.jvm.functions.Function1
                            public java.lang.Object invoke(java.lang.Object obj2) {
                                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI();
                            }
                        }, 24, null));
                    }
                }
                if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
                    return;
                }
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = constructorDescriptor.getTypeParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters2, "");
                descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(typeParameters2, sb);
                return;
            }
        }
        z = false;
        descriptorRendererImpl.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) constructorDescriptor, sb);
        if (descriptorRendererImpl.getRenderConstructorKeyword()) {
        }
        if (z2) {
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters containingDeclaration2 = constructorDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "");
        if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters3 = constructorDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters3, "");
        descriptorRendererImpl.Camera2StreamConfigurationMap(valueParameters3, constructorDescriptor.hasSynthesizedParameterNames(), sb);
        if (descriptorRendererImpl.getRenderConstructorDelegation()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters22 = mo23889getUnsubstitutedPrimaryConstructor.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters22, "");
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            while (r0.hasNext()) {
            }
            arrayList = arrayList22;
            if (!arrayList.isEmpty()) {
            }
        }
        if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r9.getAlwaysRenderModifiers() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
    
        if (r9.getAlwaysRenderModifiers() != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void access$renderFunction(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.lang.StringBuilder sb) {
        boolean z;
        if (!descriptorRendererImpl.getStartFromName()) {
            if (!descriptorRendererImpl.getStartFromDeclarationKeyword()) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> contextReceiverParameters = functionDescriptor.getContextReceiverParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "");
                descriptorRendererImpl.getHighSpeedVideoFpsRangesFor(contextReceiverParameters, sb);
                descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, functionDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null);
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = functionDescriptor.getVisibility();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visibility, "");
                descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(visibility, sb);
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor2 = functionDescriptor;
                descriptorRendererImpl.Camera2StreamConfigurationMap(functionDescriptor2, sb);
                if (descriptorRendererImpl.getIncludeAdditionalModifiers()) {
                    descriptorRendererImpl.getHighSpeedVideoFpsRanges(functionDescriptor, sb);
                }
                descriptorRendererImpl.getHighSpeedVideoSizes(functionDescriptor2, sb);
                if (descriptorRendererImpl.getIncludeAdditionalModifiers()) {
                    boolean z2 = false;
                    if (functionDescriptor.isOperator()) {
                        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
                        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> collection = overriddenDescriptors;
                        if (!collection.isEmpty()) {
                            java.util.Iterator<T> it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it.next()).isOperator()) {
                                }
                            }
                        }
                        z = true;
                        if (functionDescriptor.isInfix()) {
                            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> overriddenDescriptors2 = functionDescriptor.getOverriddenDescriptors();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors2, "");
                            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> collection2 = overriddenDescriptors2;
                            if (!collection2.isEmpty()) {
                                java.util.Iterator<T> it2 = collection2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it2.next()).isInfix()) {
                                    }
                                }
                            }
                            z2 = true;
                        }
                        if (functionDescriptor.isTailrec()) {
                            sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("tailrec"));
                            sb.append(" ");
                        }
                        if (functionDescriptor.isSuspend()) {
                            sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("suspend"));
                            sb.append(" ");
                        }
                        if (functionDescriptor.isInline()) {
                            sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("inline"));
                            sb.append(" ");
                        }
                        if (z2) {
                            sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("infix"));
                            sb.append(" ");
                        }
                        if (z) {
                            sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("operator"));
                            sb.append(" ");
                        }
                    }
                    z = false;
                    if (functionDescriptor.isInfix()) {
                    }
                    if (functionDescriptor.isTailrec()) {
                    }
                    if (functionDescriptor.isSuspend()) {
                    }
                    if (functionDescriptor.isInline()) {
                    }
                    if (z2) {
                    }
                    if (z) {
                    }
                } else if (functionDescriptor.isSuspend()) {
                    sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("suspend"));
                    sb.append(" ");
                }
                descriptorRendererImpl.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) functionDescriptor2, sb);
                if (descriptorRendererImpl.getVerbose()) {
                    if (functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("fun"));
            sb.append(" ");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = functionDescriptor.getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
            descriptorRendererImpl.Camera2StreamConfigurationMap((java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>) typeParameters, sb, true);
            descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(functionDescriptor, sb);
        }
        kotlin.reflect.jvm.internal.impl.name.Name name2 = functionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        sb.append(descriptorRendererImpl.renderName(name2, true));
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
        descriptorRendererImpl.Camera2StreamConfigurationMap(valueParameters, functionDescriptor.hasSynthesizedParameterNames(), sb);
        descriptorRendererImpl.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) functionDescriptor, sb);
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = functionDescriptor.getReturnType();
        if (!descriptorRendererImpl.getWithoutReturnType() && (descriptorRendererImpl.getUnitReturnType() || returnType == null || !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnit(returnType))) {
            sb.append(": ");
            sb.append(returnType == null ? "[NULL]" : descriptorRendererImpl.renderType(returnType));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = functionDescriptor.getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters2, "");
        descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(typeParameters2, sb);
    }

    public static final /* synthetic */ void access$renderName(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.lang.StringBuilder sb, boolean z) {
        kotlin.reflect.jvm.internal.impl.name.Name name2 = declarationDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        sb.append(descriptorRendererImpl.renderName(name2, z));
    }

    public static final /* synthetic */ void access$renderPackageFragment(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, java.lang.StringBuilder sb) {
        descriptorRendererImpl.Camera2StreamConfigurationMap(packageFragmentDescriptor.getFqName(), "package-fragment", sb);
        if (descriptorRendererImpl.getDebugMode()) {
            sb.append(" in ");
            kotlin.reflect.jvm.internal.impl.name.Name name2 = packageFragmentDescriptor.getContainingDeclaration().getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            sb.append(descriptorRendererImpl.renderName(name2, false));
        }
    }

    public static final /* synthetic */ void access$renderPackageView(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor, java.lang.StringBuilder sb) {
        descriptorRendererImpl.Camera2StreamConfigurationMap(packageViewDescriptor.getFqName(), "package", sb);
        if (descriptorRendererImpl.getDebugMode()) {
            sb.append(" in context of ");
            kotlin.reflect.jvm.internal.impl.name.Name name2 = packageViewDescriptor.getModule().getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            sb.append(descriptorRendererImpl.renderName(name2, false));
        }
    }

    public static final /* synthetic */ void access$renderProperty(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, java.lang.StringBuilder sb) {
        if (!descriptorRendererImpl.getStartFromName()) {
            if (!descriptorRendererImpl.getStartFromDeclarationKeyword()) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "");
                descriptorRendererImpl.getHighSpeedVideoFpsRangesFor(contextReceiverParameters, sb);
                if (descriptorRendererImpl.getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, propertyDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null);
                    kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor backingField = propertyDescriptor.getBackingField();
                    if (backingField != null) {
                        descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, backingField, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.FIELD);
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
                    if (delegateField != null) {
                        descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, delegateField, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    if (descriptorRendererImpl.getPropertyAccessorRenderingPolicy() == kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.NONE) {
                        kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                        if (getter != null) {
                            descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, getter, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                        if (setter != null) {
                            descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, setter, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_SETTER);
                            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) valueParameters);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameterDescriptor);
                            descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, valueParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visibility, "");
                descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(visibility, sb);
                if (descriptorRendererImpl.getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.CONST) && propertyDescriptor.isConst()) {
                    sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("const"));
                    sb.append(" ");
                }
                descriptorRendererImpl.getHighSpeedVideoFpsRanges(propertyDescriptor, sb);
                kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor2 = propertyDescriptor;
                descriptorRendererImpl.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) propertyDescriptor2, sb);
                descriptorRendererImpl.getHighSpeedVideoSizes(propertyDescriptor2, sb);
                if (descriptorRendererImpl.getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit()) {
                    sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("lateinit"));
                    sb.append(" ");
                }
                descriptorRendererImpl.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) propertyDescriptor2, sb);
            }
            descriptorRendererImpl.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor) propertyDescriptor, sb, false);
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = propertyDescriptor.getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
            descriptorRendererImpl.Camera2StreamConfigurationMap((java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>) typeParameters, sb, true);
            descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(propertyDescriptor, sb);
        }
        kotlin.reflect.jvm.internal.impl.name.Name name2 = propertyDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        sb.append(descriptorRendererImpl.renderName(name2, true));
        sb.append(": ");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = propertyDescriptor.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        sb.append(descriptorRendererImpl.renderType(type));
        descriptorRendererImpl.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) propertyDescriptor, sb);
        descriptorRendererImpl.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor) propertyDescriptor, sb);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = propertyDescriptor.getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters2, "");
        descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(typeParameters2, sb);
    }

    public static final /* synthetic */ void access$renderTypeAlias(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, java.lang.StringBuilder sb) {
        descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(sb, typeAliasDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null);
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visibility, "");
        descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI(visibility, sb);
        descriptorRendererImpl.getHighSpeedVideoFpsRanges(typeAliasDescriptor, sb);
        sb.append(descriptorRendererImpl.getHighResolutionOutputSizeshNQ4ISI("typealias"));
        sb.append(" ");
        kotlin.reflect.jvm.internal.impl.name.Name name2 = typeAliasDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        sb.append(descriptorRendererImpl.renderName(name2, true));
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "");
        descriptorRendererImpl.Camera2StreamConfigurationMap((java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>) declaredTypeParameters, sb, false);
        descriptorRendererImpl.getHighSpeedVideoFpsRangesFor(typeAliasDescriptor, sb);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(descriptorRendererImpl.renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl) {
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer withOptions = descriptorRendererImpl.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$7
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.getOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(withOptions, "");
        return (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl) withOptions;
    }

    static /* synthetic */ kotlin.Unit getOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setExcludedTypeAnnotationClasses(kotlin.collections.SetsKt.plus((java.util.Set) descriptorRendererOptions.getExcludedTypeAnnotationClasses(), (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.extensionFunctionType, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.contextFunctionTypeParams})));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, java.lang.StringBuilder sb, boolean z) {
        if (z) {
            sb.append(getTextFormat().escape("<"));
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        if (typeParameterDescriptor.isReified()) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI("reified"));
            sb.append(" ");
        }
        java.lang.String label = typeParameterDescriptor.getVariance().getLabel();
        if (label.length() > 0) {
            sb.append(getHighResolutionOutputSizeshNQ4ISI(label));
            sb.append(" ");
        }
        getHighResolutionOutputSizeshNQ4ISI(sb, typeParameterDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null);
        kotlin.reflect.jvm.internal.impl.name.Name name2 = typeParameterDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        sb.append(renderName(name2, z));
        int size = typeParameterDescriptor.getUpperBounds().size();
        boolean z2 = true;
        if ((size > 1 && !z) || size == 1) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDefaultBound(next)) {
                sb.append(" : ");
                kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                sb.append(renderType(next));
            }
        } else if (z) {
            for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDefaultBound(kotlinType)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType);
                    sb.append(renderType(kotlinType));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(getTextFormat().escape(">"));
        }
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
        kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy classifierNamePolicy = descriptorRendererImpl.getClassifierNamePolicy();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor collection = kotlinBuiltIns.getCollection();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collection, "");
        return kotlin.text.StringsKt.substringBefore$default(classifierNamePolicy.renderClassifier(collection, descriptorRendererImpl), "Collection", (java.lang.String) null, 2, (java.lang.Object) null);
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
        kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy classifierNamePolicy = descriptorRendererImpl.getClassifierNamePolicy();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor array = kotlinBuiltIns.getArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        return kotlin.text.StringsKt.substringBefore$default(classifierNamePolicy.renderClassifier(array, descriptorRendererImpl), "Array", (java.lang.String) null, 2, (java.lang.Object) null);
    }

    static /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference ? ((kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable() : kotlinType;
    }

    static /* synthetic */ java.lang.CharSequence getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeProjection, "");
        if (typeProjection.isStarProjection()) {
            return "*";
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        java.lang.String renderType = descriptorRendererImpl.renderType(type);
        if (typeProjection.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(typeProjection.getProjectionKind());
            sb.append(' ');
            sb.append(renderType);
            renderType = sb.toString();
        }
        return renderType;
    }

    static /* synthetic */ java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI() {
        return "";
    }

    static /* synthetic */ java.lang.CharSequence getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType);
        return descriptorRendererImpl.renderType(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setWithoutTypeParameters(boolean z) {
        this.getHighSpeedVideoSizes.setWithoutTypeParameters(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setWithoutSuperTypes(boolean z) {
        this.getHighSpeedVideoSizes.setWithoutSuperTypes(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setWithDefinedIn(boolean z) {
        this.getHighSpeedVideoSizes.setWithDefinedIn(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setVerbose(boolean z) {
        this.getHighSpeedVideoSizes.setVerbose(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setTextFormat(kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat renderingFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderingFormat, "");
        this.getHighSpeedVideoSizes.setTextFormat(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setStartFromName(boolean z) {
        this.getHighSpeedVideoSizes.setStartFromName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setRenderCompanionObjectName(boolean z) {
        this.getHighSpeedVideoSizes.setRenderCompanionObjectName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setReceiverAfterName(boolean z) {
        this.getHighSpeedVideoSizes.setReceiverAfterName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setParameterNameRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "");
        this.getHighSpeedVideoSizes.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setModifiers(java.util.Set<? extends kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoSizes.setModifiers(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setExcludedTypeAnnotationClasses(java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoSizes.setExcludedTypeAnnotationClasses(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setDebugMode(boolean z) {
        this.getHighSpeedVideoSizes.setDebugMode(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy classifierNamePolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierNamePolicy, "");
        this.getHighSpeedVideoSizes.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setAnnotationArgumentsRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "");
        this.getHighSpeedVideoSizes.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    public final boolean getWithoutTypeParameters() {
        return this.getHighSpeedVideoSizes.getWithoutTypeParameters();
    }

    public final boolean getWithoutSuperTypes() {
        return this.getHighSpeedVideoSizes.getWithoutSuperTypes();
    }

    public final boolean getWithoutReturnType() {
        return this.getHighSpeedVideoSizes.getWithoutReturnType();
    }

    public final boolean getWithSourceFileForTopLevel() {
        return this.getHighSpeedVideoSizes.getWithSourceFileForTopLevel();
    }

    public final boolean getWithDefinedIn() {
        return this.getHighSpeedVideoSizes.getWithDefinedIn();
    }

    public final boolean getVerbose() {
        return this.getHighSpeedVideoSizes.getVerbose();
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.getHighSpeedVideoSizes.getValueParametersHandler();
    }

    public final boolean getUnitReturnType() {
        return this.getHighSpeedVideoSizes.getUnitReturnType();
    }

    public final boolean getUninferredTypeParameterAsName() {
        return this.getHighSpeedVideoSizes.getUninferredTypeParameterAsName();
    }

    public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType> getTypeNormalizer() {
        return this.getHighSpeedVideoSizes.getTypeNormalizer();
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat getTextFormat() {
        return this.getHighSpeedVideoSizes.getTextFormat();
    }

    public final boolean getStartFromName() {
        return this.getHighSpeedVideoSizes.getStartFromName();
    }

    public final boolean getStartFromDeclarationKeyword() {
        return this.getHighSpeedVideoSizes.getStartFromDeclarationKeyword();
    }

    public final boolean getSecondaryConstructorsAsPrimary() {
        return this.getHighSpeedVideoSizes.getSecondaryConstructorsAsPrimary();
    }

    public final boolean getRenderUnabbreviatedType() {
        return this.getHighSpeedVideoSizes.getRenderUnabbreviatedType();
    }

    public final boolean getRenderTypeExpansions() {
        return this.getHighSpeedVideoSizes.getRenderTypeExpansions();
    }

    public final boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.getHighSpeedVideoSizes.getRenderPrimaryConstructorParametersAsProperties();
    }

    public final boolean getRenderDefaultVisibility() {
        return this.getHighSpeedVideoSizes.getRenderDefaultVisibility();
    }

    public final boolean getRenderDefaultModality() {
        return this.getHighSpeedVideoSizes.getRenderDefaultModality();
    }

    public final boolean getRenderDefaultAnnotationArguments() {
        return this.getHighSpeedVideoSizes.getRenderDefaultAnnotationArguments();
    }

    public final boolean getRenderConstructorKeyword() {
        return this.getHighSpeedVideoSizes.getRenderConstructorKeyword();
    }

    public final boolean getRenderConstructorDelegation() {
        return this.getHighSpeedVideoSizes.getRenderConstructorDelegation();
    }

    public final boolean getRenderCompanionObjectName() {
        return this.getHighSpeedVideoSizes.getRenderCompanionObjectName();
    }

    public final boolean getRenderAbbreviatedTypeComments() {
        return this.getHighSpeedVideoSizes.getRenderAbbreviatedTypeComments();
    }

    public final boolean getReceiverAfterName() {
        return this.getHighSpeedVideoSizes.getReceiverAfterName();
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.getHighSpeedVideoSizes.getPropertyAccessorRenderingPolicy();
    }

    public final boolean getPresentableUnresolvedTypes() {
        return this.getHighSpeedVideoSizes.getPresentableUnresolvedTypes();
    }

    public final boolean getParameterNamesInFunctionalTypes() {
        return this.getHighSpeedVideoSizes.getParameterNamesInFunctionalTypes();
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.getHighSpeedVideoSizes.getParameterNameRenderingPolicy();
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.getHighSpeedVideoSizes.getOverrideRenderingPolicy();
    }

    public final boolean getNormalizedVisibilities() {
        return this.getHighSpeedVideoSizes.getNormalizedVisibilities();
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> getModifiers() {
        return this.getHighSpeedVideoSizes.getModifiers();
    }

    public final boolean getInformativeErrorType() {
        return this.getHighSpeedVideoSizes.getInformativeErrorType();
    }

    public final boolean getIncludePropertyConstant() {
        return this.getHighSpeedVideoSizes.getIncludePropertyConstant();
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.getHighSpeedVideoSizes.getIncludeEmptyAnnotationArguments();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.getHighSpeedVideoSizes.getIncludeAnnotationArguments();
    }

    public final boolean getIncludeAdditionalModifiers() {
        return this.getHighSpeedVideoSizes.getIncludeAdditionalModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getExcludedTypeAnnotationClasses() {
        return this.getHighSpeedVideoSizes.getExcludedTypeAnnotationClasses();
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getExcludedAnnotationClasses() {
        return this.getHighSpeedVideoSizes.getExcludedAnnotationClasses();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final boolean getEnhancedTypes() {
        return this.getHighSpeedVideoSizes.getEnhancedTypes();
    }

    public final boolean getEachAnnotationOnNewLine() {
        return this.getHighSpeedVideoSizes.getEachAnnotationOnNewLine();
    }

    public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.String> getDefaultParameterValueRenderer() {
        return this.getHighSpeedVideoSizes.getDefaultParameterValueRenderer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final boolean getDebugMode() {
        return this.getHighSpeedVideoSizes.getDebugMode();
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy getClassifierNamePolicy() {
        return this.getHighSpeedVideoSizes.getClassifierNamePolicy();
    }

    public final boolean getClassWithPrimaryConstructor() {
        return this.getHighSpeedVideoSizes.getClassWithPrimaryConstructor();
    }

    public final boolean getBoldOnlyForNamesInHtml() {
        return this.getHighSpeedVideoSizes.getBoldOnlyForNamesInHtml();
    }

    public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, java.lang.Boolean> getAnnotationFilter() {
        return this.getHighSpeedVideoSizes.getAnnotationFilter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.getHighSpeedVideoSizes.getAnnotationArgumentsRenderingPolicy();
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final boolean getAlwaysRenderModifiers() {
        return this.getHighSpeedVideoSizes.getAlwaysRenderModifiers();
    }

    public final boolean getActualPropertiesInPrimaryConstructor() {
        return this.getHighSpeedVideoSizes.getActualPropertiesInPrimaryConstructor();
    }
}
