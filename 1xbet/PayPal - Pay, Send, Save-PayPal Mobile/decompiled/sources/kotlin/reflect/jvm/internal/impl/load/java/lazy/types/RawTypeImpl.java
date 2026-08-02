package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* loaded from: classes5.dex */
public final class RawTypeImpl extends kotlin.reflect.jvm.internal.impl.types.FlexibleType implements kotlin.reflect.jvm.internal.impl.types.RawType {
    private RawTypeImpl(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2, boolean z) {
        super(simpleType, simpleType2);
        if (z) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.isSubtypeOf(simpleType, simpleType2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2) {
        this(simpleType, simpleType2, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType2, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return getLowerBound();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = getConstructor().mo23898getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        java.lang.Object[] objArr = 0;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
        if (classDescriptor == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Incorrect classifier: ");
            sb.append(getConstructor().mo23898getDeclarationDescriptor());
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = classDescriptor.getMemberScope(new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(memberScope, "");
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(getLowerBound().replaceAttributes(typeAttributes), getUpperBound().replaceAttributes(typeAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl makeNullableAsSpecified(boolean z) {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    private static final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = kotlinType.getArguments();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments, 10));
        java.util.Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.renderTypeProjection((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()));
        }
        return arrayList;
    }

    private static final java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, kotlin.text.Typography.less, false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.StringsKt.substringBefore$default(str, kotlin.text.Typography.less, (java.lang.String) null, 2, (java.lang.Object) null));
        sb.append(kotlin.text.Typography.less);
        sb.append(str2);
        sb.append(kotlin.text.Typography.greater);
        sb.append(kotlin.text.StringsKt.substringAfterLast$default(str, kotlin.text.Typography.greater, (java.lang.String) null, 2, (java.lang.Object) null));
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final java.lang.String render(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRenderer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        java.lang.String renderType = descriptorRenderer.renderType(getLowerBound());
        java.lang.String renderType2 = descriptorRenderer.renderType(getUpperBound());
        if (descriptorRendererOptions.getDebugMode()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("raw (");
            sb.append(renderType);
            sb.append("..");
            sb.append(renderType2);
            sb.append(')');
            return sb.toString();
        }
        if (getUpperBound().getArguments().isEmpty()) {
            return descriptorRenderer.renderFlexibleType(renderType, renderType2, kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(this));
        }
        java.util.List<java.lang.String> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(descriptorRenderer, getLowerBound());
        java.util.List<java.lang.String> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(descriptorRenderer, getUpperBound());
        java.util.List<java.lang.String> list = highResolutionOutputSizeshNQ4ISI;
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.getHighSpeedVideoFpsRangesFor((java.lang.String) obj);
            }
        }, 30, null);
        java.util.List<kotlin.Pair> zip = kotlin.collections.CollectionsKt.zip(list, highResolutionOutputSizeshNQ4ISI2);
        if (!(zip instanceof java.util.Collection) || !zip.isEmpty()) {
            for (kotlin.Pair pair : zip) {
                java.lang.String str = (java.lang.String) pair.getFirst();
                java.lang.String str2 = (java.lang.String) pair.getSecond();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(str, kotlin.text.StringsKt.removePrefix(str2, (java.lang.CharSequence) "out ")) && !kotlin.jvm.internal.Intrinsics.areEqual(str2, "*")) {
                    break;
                }
            }
        }
        renderType2 = getHighSpeedVideoFpsRangesFor(renderType2, joinToString$default);
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(renderType, joinToString$default);
        return kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor, renderType2) ? highSpeedVideoFpsRangesFor : descriptorRenderer.renderFlexibleType(highSpeedVideoFpsRangesFor, renderType2, kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.FlexibleType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType refineType = kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) getLowerBound());
        kotlin.jvm.internal.Intrinsics.checkNotNull(refineType, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType refineType2 = kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) getUpperBound());
        kotlin.jvm.internal.Intrinsics.checkNotNull(refineType2, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl((kotlin.reflect.jvm.internal.impl.types.SimpleType) refineType, (kotlin.reflect.jvm.internal.impl.types.SimpleType) refineType2, true);
    }

    static /* synthetic */ java.lang.CharSequence getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return "(raw) ".concat(java.lang.String.valueOf(str));
    }
}
