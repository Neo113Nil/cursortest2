package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* loaded from: classes5.dex */
public final class FunctionInvokeDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl {
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory Factory = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory(null);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isTailrec() {
        return false;
    }

    private FunctionInvokeDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor functionInvokeDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.INVOKE, kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
        setOperator(true);
        setSuspend(z);
        setHasStableParameterNames(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$CopyConfiguration] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor doSubstitute(kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration copyConfiguration) {
        boolean z;
        kotlin.reflect.jvm.internal.impl.name.Name name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(copyConfiguration, "");
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor functionInvokeDescriptor = (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor) super.doSubstitute(copyConfiguration);
        if (functionInvokeDescriptor == 0) {
            return null;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = functionInvokeDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next()).getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                if (kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type) != null) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = functionInvokeDescriptor.getValueParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters2, "");
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list2 = valueParameters2;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    java.util.Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it2.next()).getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "");
                        arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2));
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    int size = functionInvokeDescriptor.getValueParameters().size() - arrayList2.size();
                    if (size == 0) {
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters3 = functionInvokeDescriptor.getValueParameters();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters3, "");
                        java.util.List<kotlin.Pair> zip = kotlin.collections.CollectionsKt.zip(arrayList2, valueParameters3);
                        if (!(zip instanceof java.util.Collection) || !zip.isEmpty()) {
                            for (kotlin.Pair pair : zip) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual((kotlin.reflect.jvm.internal.impl.name.Name) pair.component1(), ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) pair.component2()).getName())) {
                                }
                            }
                        }
                        return functionInvokeDescriptor;
                    }
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters4 = functionInvokeDescriptor.getValueParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters4, "");
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list3 = valueParameters4;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor : list3) {
                        kotlin.reflect.jvm.internal.impl.name.Name name3 = valueParameterDescriptor.getName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
                        int index = valueParameterDescriptor.getIndex();
                        int i = index - size;
                        if (i >= 0 && (name2 = (kotlin.reflect.jvm.internal.impl.name.Name) arrayList2.get(i)) != null) {
                            name3 = name2;
                        }
                        arrayList3.add(valueParameterDescriptor.copy(functionInvokeDescriptor, name3, index));
                    }
                    java.util.ArrayList arrayList4 = arrayList3;
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration newCopyBuilder = functionInvokeDescriptor.newCopyBuilder(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.EMPTY);
                    java.util.ArrayList arrayList5 = arrayList2;
                    if (!arrayList5.isEmpty()) {
                        java.util.Iterator it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            if (((kotlin.reflect.jvm.internal.impl.name.Name) it3.next()) == null) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    ?? original = newCopyBuilder.setHasSynthesizedParameterNames(z).setValueParameters2((java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor>) arrayList4).setOriginal((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) functionInvokeDescriptor.getOriginal());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(original, "");
                    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor doSubstitute = super.doSubstitute(original);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(doSubstitute);
                    return doSubstitute;
                }
            }
        }
        return functionInvokeDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
        return new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor(declarationDescriptor, (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    public static final class Factory {
        private Factory() {
        }

        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor create(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor functionClassDescriptor, boolean z) {
            java.lang.String lowerCase;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionClassDescriptor, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = functionClassDescriptor.getDeclaredTypeParameters();
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor functionInvokeDescriptor = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor(functionClassDescriptor, null, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, z, null);
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor thisAsReceiverParameter = functionClassDescriptor.getThisAsReceiverParameter();
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> emptyList2 = kotlin.collections.CollectionsKt.emptyList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : declaredTypeParameters) {
                if (((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) obj).getVariance() != kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.CollectionsKt.withIndex(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withIndex, 10));
            for (kotlin.collections.IndexedValue indexedValue : withIndex) {
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory factory = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory;
                int index = indexedValue.getIndex();
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) indexedValue.getValue();
                java.lang.String asString = typeParameterDescriptor.getName().asString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(asString, "T")) {
                    lowerCase = "instance";
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(asString, "E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = asString.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                }
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
                kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(lowerCase);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
                kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = typeParameterDescriptor.getDefaultType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
                kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = defaultType;
                kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceElement, "");
                arrayList2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(functionInvokeDescriptor, null, index, empty, identifier, simpleType, false, false, false, null, sourceElement));
            }
            functionInvokeDescriptor.initialize((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, thisAsReceiverParameter, emptyList, emptyList2, (java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor>) arrayList2, (kotlin.reflect.jvm.internal.impl.types.KotlinType) ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlin.collections.CollectionsKt.last((java.util.List) declaredTypeParameters)).getDefaultType(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC);
            functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
            return functionInvokeDescriptor;
        }

        public /* synthetic */ Factory(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FunctionInvokeDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor functionInvokeDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z);
    }
}
