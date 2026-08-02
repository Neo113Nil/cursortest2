package kotlin.reflect.jvm.internal.impl.km.internal;

/* loaded from: classes5.dex */
public final class ReadersKt {
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmClass toKmClass$default(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r0, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return toKmClass(r0, nameResolver, z, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x029a, code lost:
    
        if (r15 == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.reflect.jvm.internal.impl.km.KmClass toKmClass(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r12, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, boolean z, java.util.List<? extends java.lang.Object> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.reflect.jvm.internal.impl.km.KmClass kmClass = new kotlin.reflect.jvm.internal.impl.km.KmClass();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = r12.getTypeTable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeTable, "");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion companion = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = r12.getVersionRequirementTable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "");
        kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext = new kotlin.reflect.jvm.internal.impl.km.internal.ReadContext(nameResolver, typeTable2, companion.create(versionRequirementTable), z, null, list, 16, null);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = r12.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        kotlin.reflect.jvm.internal.impl.km.internal.ReadContext withTypeParameters$kotlin_metadata = readContext.withTypeParameters$kotlin_metadata(typeParameterList);
        kmClass.setFlags$kotlin_metadata(r12.getFlags());
        kmClass.setName(withTypeParameters$kotlin_metadata.className$kotlin_metadata(r12.getFqName()));
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList2 = r12.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList2, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> typeParameters = kmClass.getTypeParameters();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameter);
            typeParameters.add(getHighSpeedVideoSizes(typeParameter, withTypeParameters$kotlin_metadata));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> supertypes = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.supertypes(r12, withTypeParameters$kotlin_metadata.getTypes());
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> supertypes2 = kmClass.getSupertypes();
        java.util.Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            supertypes2.add(getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it.next(), withTypeParameters$kotlin_metadata));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> constructorList = r12.getConstructorList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructorList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmConstructor> constructors = kmClass.getConstructors();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor : constructorList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(constructor);
            kotlin.reflect.jvm.internal.impl.km.KmConstructor kmConstructor = new kotlin.reflect.jvm.internal.impl.km.KmConstructor(constructor.getFlags());
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> valueParameters = kmConstructor.getValueParameters();
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter : valueParameterList) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameter);
                valueParameters.add(getHighSpeedVideoSizes(valueParameter, withTypeParameters$kotlin_metadata));
            }
            java.util.List<java.lang.Integer> versionRequirementList = constructor.getVersionRequirementList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionRequirementList, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> versionRequirements = kmConstructor.getVersionRequirements();
            for (java.lang.Integer num : versionRequirementList) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                versionRequirements.add(getHighSpeedVideoFpsRangesFor(num.intValue(), withTypeParameters$kotlin_metadata));
            }
            java.util.Iterator<T> it2 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
            while (it2.hasNext()) {
                ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it2.next()).readConstructorExtensions(kmConstructor, constructor, withTypeParameters$kotlin_metadata);
            }
            constructors.add(kmConstructor);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionList = r12.getFunctionList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(functionList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> propertyList = r12.getPropertyList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(propertyList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> typeAliasList = r12.getTypeAliasList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeAliasList, "");
        getHighResolutionOutputSizeshNQ4ISI(kmClass, functionList, propertyList, typeAliasList, withTypeParameters$kotlin_metadata);
        if (r12.hasCompanionObjectName()) {
            kmClass.setCompanionObject(withTypeParameters$kotlin_metadata.get(r12.getCompanionObjectName()));
        }
        java.util.List<java.lang.Integer> nestedClassNameList = r12.getNestedClassNameList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nestedClassNameList, "");
        java.util.List<java.lang.String> nestedClasses = kmClass.getNestedClasses();
        for (java.lang.Integer num2 : nestedClassNameList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
            nestedClasses.add(withTypeParameters$kotlin_metadata.get(num2.intValue()));
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> it3 = r12.getEnumEntryList().iterator();
        while (true) {
            if (it3.hasNext()) {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry next = it3.next();
                if (!next.hasName()) {
                    throw new kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException("No name for EnumEntry", null, 2, null);
                }
                kmClass.getEnumEntries().add(withTypeParameters$kotlin_metadata.get(next.getName()));
                java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEnumEntry> kmEnumEntries = kmClass.getKmEnumEntries();
                kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                kotlin.reflect.jvm.internal.impl.km.KmEnumEntry kmEnumEntry = new kotlin.reflect.jvm.internal.impl.km.KmEnumEntry(withTypeParameters$kotlin_metadata.get(next.getName()));
                java.util.Iterator<T> it4 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
                while (it4.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it4.next()).readEnumEntryExtensions(kmEnumEntry, next, withTypeParameters$kotlin_metadata);
                }
                kmEnumEntries.add(kmEnumEntry);
            } else {
                java.util.List<java.lang.Integer> sealedSubclassFqNameList = r12.getSealedSubclassFqNameList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sealedSubclassFqNameList, "");
                java.util.List<java.lang.String> sealedSubclasses = kmClass.getSealedSubclasses();
                for (java.lang.Integer num3 : sealedSubclassFqNameList) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(num3);
                    sealedSubclasses.add(withTypeParameters$kotlin_metadata.className$kotlin_metadata(num3.intValue()));
                }
                if (r12.hasInlineClassUnderlyingPropertyName()) {
                    kmClass.setInlineClassUnderlyingPropertyName(withTypeParameters$kotlin_metadata.get(r12.getInlineClassUnderlyingPropertyName()));
                }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type inlineClassUnderlyingType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.inlineClassUnderlyingType(r12, withTypeParameters$kotlin_metadata.getTypes());
                if (inlineClassUnderlyingType == null) {
                    if (r12.hasInlineClassUnderlyingPropertyName()) {
                        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> propertyList2 = r12.getPropertyList();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(propertyList2, "");
                        java.util.Iterator<T> it5 = propertyList2.iterator();
                        boolean z2 = false;
                        java.lang.Object obj = null;
                        while (true) {
                            if (it5.hasNext()) {
                                java.lang.Object next2 = it5.next();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) next2;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(property);
                                if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(property, withTypeParameters$kotlin_metadata.getTypes()) == null && kotlin.jvm.internal.Intrinsics.areEqual(withTypeParameters$kotlin_metadata.get(property.getName()), withTypeParameters$kotlin_metadata.get(r12.getInlineClassUnderlyingPropertyName()))) {
                                    if (z2) {
                                        break;
                                    }
                                    z2 = true;
                                    obj = next2;
                                }
                            }
                        }
                        obj = null;
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) obj;
                        if (property2 != null) {
                            inlineClassUnderlyingType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(property2, withTypeParameters$kotlin_metadata.getTypes());
                        }
                    }
                    inlineClassUnderlyingType = null;
                }
                kmClass.setInlineClassUnderlyingType(inlineClassUnderlyingType != null ? getHighSpeedVideoFpsRangesFor(inlineClassUnderlyingType, withTypeParameters$kotlin_metadata) : null);
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypes = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.contextReceiverTypes(r12, withTypeParameters$kotlin_metadata.getTypes());
                java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> contextReceiverTypes2 = kmClass.getContextReceiverTypes();
                java.util.Iterator<T> it6 = contextReceiverTypes.iterator();
                while (it6.hasNext()) {
                    contextReceiverTypes2.add(getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it6.next(), withTypeParameters$kotlin_metadata));
                }
                java.util.List<java.lang.Integer> versionRequirementList2 = r12.getVersionRequirementList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionRequirementList2, "");
                java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> versionRequirements2 = kmClass.getVersionRequirements();
                for (java.lang.Integer num4 : versionRequirementList2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(num4);
                    versionRequirements2.add(getHighSpeedVideoFpsRangesFor(num4.intValue(), withTypeParameters$kotlin_metadata));
                }
                java.util.Iterator<T> it7 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
                while (it7.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it7.next()).readClassExtensions(kmClass, r12, withTypeParameters$kotlin_metadata);
                }
                return kmClass;
            }
        }
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmPackage toKmPackage$default(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r0, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return toKmPackage(r0, nameResolver, z, list);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.KmPackage toKmPackage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r12, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, boolean z, java.util.List<? extends java.lang.Object> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.reflect.jvm.internal.impl.km.KmPackage kmPackage = new kotlin.reflect.jvm.internal.impl.km.KmPackage();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = r12.getTypeTable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeTable, "");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion companion = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = r12.getVersionRequirementTable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "");
        kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext = new kotlin.reflect.jvm.internal.impl.km.internal.ReadContext(nameResolver, typeTable2, companion.create(versionRequirementTable), z, null, list, 16, null);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionList = r12.getFunctionList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(functionList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> propertyList = r12.getPropertyList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(propertyList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> typeAliasList = r12.getTypeAliasList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeAliasList, "");
        getHighResolutionOutputSizeshNQ4ISI(kmPackage, functionList, propertyList, typeAliasList, readContext);
        java.util.Iterator<T> it = readContext.getExtensions$kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).readPackageExtensions(kmPackage, r12, readContext);
        }
        return kmPackage;
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer kmDeclarationContainer, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> list, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> list2, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> list3, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmFunction> functions = kmDeclarationContainer.getFunctions();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            functions.add(getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) it.next(), readContext));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmProperty> properties = kmDeclarationContainer.getProperties();
        java.util.Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            properties.add(toKmProperty((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) it2.next(), readContext));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeAlias> typeAliases = kmDeclarationContainer.getTypeAliases();
        java.util.Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            typeAliases.add(getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) it3.next(), readContext));
        }
    }

    public static final kotlin.reflect.jvm.internal.impl.km.KmLambda toKmLambda(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.reflect.jvm.internal.impl.km.KmLambda kmLambda = new kotlin.reflect.jvm.internal.impl.km.KmLambda();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = function.getTypeTable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeTable, "");
        kmLambda.setFunction(getHighSpeedVideoSizes(function, new kotlin.reflect.jvm.internal.impl.km.internal.ReadContext(nameResolver, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable), kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion.getEMPTY(), z, null, null, 48, null)));
        return kmLambda;
    }

    private static final kotlin.reflect.jvm.internal.impl.km.KmFunction getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.reflect.jvm.internal.impl.km.KmEffectType kmEffectType;
        kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind kmEffectInvocationKind;
        kotlin.reflect.jvm.internal.impl.km.KmFunction kmFunction = new kotlin.reflect.jvm.internal.impl.km.KmFunction(function.getFlags(), readContext.get(function.getName()));
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        kotlin.reflect.jvm.internal.impl.km.internal.ReadContext withTypeParameters$kotlin_metadata = readContext.withTypeParameters$kotlin_metadata(typeParameterList);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList2 = function.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList2, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> typeParameters = kmFunction.getTypeParameters();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameter);
            typeParameters.add(getHighSpeedVideoSizes(typeParameter, withTypeParameters$kotlin_metadata));
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(function, withTypeParameters$kotlin_metadata.getTypes());
        kmFunction.setReceiverParameterType(receiverType != null ? getHighSpeedVideoFpsRangesFor(receiverType, withTypeParameters$kotlin_metadata) : null);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> contextParameterList = function.getContextParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextParameterList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> contextParameters = kmFunction.getContextParameters();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter : contextParameterList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameter);
            contextParameters.add(getHighSpeedVideoSizes(valueParameter, withTypeParameters$kotlin_metadata));
        }
        if (function.getContextParameterList().isEmpty()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverTypeList, "");
            if (!contextReceiverTypeList.isEmpty()) {
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypes = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.contextReceiverTypes(function, withTypeParameters$kotlin_metadata.getTypes());
                java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> contextParameters2 = kmFunction.getContextParameters();
                java.util.Iterator<T> it = contextReceiverTypes.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.km.KmType highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it.next(), withTypeParameters$kotlin_metadata);
                    kotlin.reflect.jvm.internal.impl.km.KmValueParameter kmValueParameter = new kotlin.reflect.jvm.internal.impl.km.KmValueParameter(0, "_");
                    kmValueParameter.setType(highSpeedVideoFpsRangesFor);
                    contextParameters2.add(kmValueParameter);
                }
            }
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> valueParameters = kmFunction.getValueParameters();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter2 : valueParameterList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameter2);
            valueParameters.add(getHighSpeedVideoSizes(valueParameter2, withTypeParameters$kotlin_metadata));
        }
        kmFunction.setReturnType(getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(function, withTypeParameters$kotlin_metadata.getTypes()), withTypeParameters$kotlin_metadata));
        if (function.hasContract()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract = function.getContract();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contract, "");
            kotlin.reflect.jvm.internal.impl.km.KmContract kmContract = new kotlin.reflect.jvm.internal.impl.km.KmContract();
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect : contract.getEffectList()) {
                if (effect.hasEffectType()) {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType effectType = effect.getEffectType();
                    if (effectType == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    int i = kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.WhenMappings.$EnumSwitchMapping$4[effectType.ordinal()];
                    if (i == 1) {
                        kmEffectType = kotlin.reflect.jvm.internal.impl.km.KmEffectType.RETURNS_CONSTANT;
                    } else if (i == 2) {
                        kmEffectType = kotlin.reflect.jvm.internal.impl.km.KmEffectType.CALLS;
                    } else {
                        if (i != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        kmEffectType = kotlin.reflect.jvm.internal.impl.km.KmEffectType.RETURNS_NOT_NULL;
                    }
                    if (effect.hasKind()) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind kind = effect.getKind();
                        if (kind == null) {
                            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                        }
                        int i2 = kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.WhenMappings.$EnumSwitchMapping$5[kind.ordinal()];
                        if (i2 == 1) {
                            kmEffectInvocationKind = kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.AT_MOST_ONCE;
                        } else if (i2 == 2) {
                            kmEffectInvocationKind = kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.EXACTLY_ONCE;
                        } else {
                            if (i2 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            kmEffectInvocationKind = kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.AT_LEAST_ONCE;
                        }
                    } else {
                        kmEffectInvocationKind = null;
                    }
                    java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEffect> effects = kmContract.getEffects();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(effect);
                    kotlin.reflect.jvm.internal.impl.km.KmEffect kmEffect = new kotlin.reflect.jvm.internal.impl.km.KmEffect(kmEffectType, kmEffectInvocationKind);
                    java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> effectConstructorArgumentList = effect.getEffectConstructorArgumentList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(effectConstructorArgumentList, "");
                    java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEffectExpression> constructorArguments = kmEffect.getConstructorArguments();
                    for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression : effectConstructorArgumentList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(expression);
                        constructorArguments.add(getHighSpeedVideoSizes(expression, withTypeParameters$kotlin_metadata));
                    }
                    if (effect.hasConclusionOfConditionalEffect()) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression conclusionOfConditionalEffect = effect.getConclusionOfConditionalEffect();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(conclusionOfConditionalEffect, "");
                        kmEffect.setConclusion(getHighSpeedVideoSizes(conclusionOfConditionalEffect, withTypeParameters$kotlin_metadata));
                    }
                    effects.add(kmEffect);
                }
            }
            kmFunction.setContract(kmContract);
        }
        java.util.List<java.lang.Integer> versionRequirementList = function.getVersionRequirementList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionRequirementList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> versionRequirements = kmFunction.getVersionRequirements();
        for (java.lang.Integer num : versionRequirementList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            versionRequirements.add(getHighSpeedVideoFpsRangesFor(num.intValue(), withTypeParameters$kotlin_metadata));
        }
        java.util.Iterator<T> it2 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
        while (it2.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it2.next()).readFunctionExtensions(kmFunction, function, withTypeParameters$kotlin_metadata);
        }
        return kmFunction;
    }

    public static final kotlin.reflect.jvm.internal.impl.km.KmProperty toKmProperty(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
        kotlin.reflect.jvm.internal.impl.km.KmProperty kmProperty = new kotlin.reflect.jvm.internal.impl.km.KmProperty(property.getFlags(), readContext.get(property.getName()), getPropertyGetterFlags(property), getPropertySetterFlags(property));
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        kotlin.reflect.jvm.internal.impl.km.internal.ReadContext withTypeParameters$kotlin_metadata = readContext.withTypeParameters$kotlin_metadata(typeParameterList);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList2 = property.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList2, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> typeParameters = kmProperty.getTypeParameters();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameter);
            typeParameters.add(getHighSpeedVideoSizes(typeParameter, withTypeParameters$kotlin_metadata));
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(property, withTypeParameters$kotlin_metadata.getTypes());
        kmProperty.setReceiverParameterType(receiverType != null ? getHighSpeedVideoFpsRangesFor(receiverType, withTypeParameters$kotlin_metadata) : null);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> contextParameterList = property.getContextParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextParameterList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> contextParameters = kmProperty.getContextParameters();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter : contextParameterList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameter);
            contextParameters.add(getHighSpeedVideoSizes(valueParameter, withTypeParameters$kotlin_metadata));
        }
        if (property.getContextParameterList().isEmpty()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverTypeList, "");
            if (!contextReceiverTypeList.isEmpty()) {
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypes = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.contextReceiverTypes(property, withTypeParameters$kotlin_metadata.getTypes());
                java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> contextParameters2 = kmProperty.getContextParameters();
                java.util.Iterator<T> it = contextReceiverTypes.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.km.KmType highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it.next(), withTypeParameters$kotlin_metadata);
                    kotlin.reflect.jvm.internal.impl.km.KmValueParameter kmValueParameter = new kotlin.reflect.jvm.internal.impl.km.KmValueParameter(0, "_");
                    kmValueParameter.setType(highSpeedVideoFpsRangesFor);
                    contextParameters2.add(kmValueParameter);
                }
            }
        }
        if (property.hasSetterValueParameter()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter setterValueParameter = property.getSetterValueParameter();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setterValueParameter, "");
            kmProperty.setSetterParameter(getHighSpeedVideoSizes(setterValueParameter, withTypeParameters$kotlin_metadata));
        }
        kmProperty.setReturnType(getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(property, withTypeParameters$kotlin_metadata.getTypes()), withTypeParameters$kotlin_metadata));
        java.util.List<java.lang.Integer> versionRequirementList = property.getVersionRequirementList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionRequirementList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> versionRequirements = kmProperty.getVersionRequirements();
        for (java.lang.Integer num : versionRequirementList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            versionRequirements.add(getHighSpeedVideoFpsRangesFor(num.intValue(), withTypeParameters$kotlin_metadata));
        }
        java.util.Iterator<T> it2 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
        while (it2.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it2.next()).readPropertyExtensions(kmProperty, property, withTypeParameters$kotlin_metadata);
        }
        return kmProperty;
    }

    private static final kotlin.reflect.jvm.internal.impl.km.KmTypeAlias getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.reflect.jvm.internal.impl.km.KmTypeAlias kmTypeAlias = new kotlin.reflect.jvm.internal.impl.km.KmTypeAlias(typeAlias.getFlags(), readContext.get(typeAlias.getName()));
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        kotlin.reflect.jvm.internal.impl.km.internal.ReadContext withTypeParameters$kotlin_metadata = readContext.withTypeParameters$kotlin_metadata(typeParameterList);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList2 = typeAlias.getTypeParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterList2, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> typeParameters = kmTypeAlias.getTypeParameters();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameter);
            typeParameters.add(getHighSpeedVideoSizes(typeParameter, withTypeParameters$kotlin_metadata));
        }
        kmTypeAlias.setUnderlyingType(getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.underlyingType(typeAlias, withTypeParameters$kotlin_metadata.getTypes()), withTypeParameters$kotlin_metadata));
        kmTypeAlias.setExpandedType(getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.expandedType(typeAlias, withTypeParameters$kotlin_metadata.getTypes()), withTypeParameters$kotlin_metadata));
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmTypeAlias.getAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : annotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            annotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation, withTypeParameters$kotlin_metadata.getStrings()));
        }
        java.util.List<java.lang.Integer> versionRequirementList = typeAlias.getVersionRequirementList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionRequirementList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> versionRequirements = kmTypeAlias.getVersionRequirements();
        for (java.lang.Integer num : versionRequirementList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            versionRequirements.add(getHighSpeedVideoFpsRangesFor(num.intValue(), withTypeParameters$kotlin_metadata));
        }
        java.util.Iterator<T> it = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).readTypeAliasExtensions(kmTypeAlias, typeAlias, withTypeParameters$kotlin_metadata);
        }
        return kmTypeAlias;
    }

    private static final kotlin.reflect.jvm.internal.impl.km.KmValueParameter getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.reflect.jvm.internal.impl.km.KmValueParameter kmValueParameter = new kotlin.reflect.jvm.internal.impl.km.KmValueParameter(valueParameter.getFlags(), readContext.get(valueParameter.getName()));
        kmValueParameter.setType(getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(valueParameter, readContext.getTypes()), readContext));
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type varargElementType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.varargElementType(valueParameter, readContext.getTypes());
        kmValueParameter.setVarargElementType(varargElementType != null ? getHighSpeedVideoFpsRangesFor(varargElementType, readContext) : null);
        if (valueParameter.hasAnnotationParameterDefaultValue()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value annotationParameterDefaultValue = valueParameter.getAnnotationParameterDefaultValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationParameterDefaultValue, "");
            kmValueParameter.setAnnotationParameterDefaultValue(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotationArgument(annotationParameterDefaultValue, readContext.getStrings()));
        }
        java.util.Iterator<T> it = readContext.getExtensions$kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).readValueParameterExtensions(kmValueParameter, valueParameter, readContext);
        }
        return kmValueParameter;
    }

    private static final kotlin.reflect.jvm.internal.impl.km.KmTypeParameter getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.reflect.jvm.internal.impl.km.KmVariance kmVariance;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        if (variance == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        int i = kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            kmVariance = kotlin.reflect.jvm.internal.impl.km.KmVariance.IN;
        } else if (i == 2) {
            kmVariance = kotlin.reflect.jvm.internal.impl.km.KmVariance.OUT;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kmVariance = kotlin.reflect.jvm.internal.impl.km.KmVariance.INVARIANT;
        }
        boolean reified = typeParameter.getReified();
        kotlin.reflect.jvm.internal.impl.km.KmTypeParameter kmTypeParameter = new kotlin.reflect.jvm.internal.impl.km.KmTypeParameter(reified ? 1 : 0, readContext.get(typeParameter.getName()), typeParameter.getId(), kmVariance);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> upperBounds = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.upperBounds(typeParameter, readContext.getTypes());
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> upperBounds2 = kmTypeParameter.getUpperBounds();
        java.util.Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            upperBounds2.add(getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it.next(), readContext));
        }
        java.util.Iterator<T> it2 = readContext.getExtensions$kotlin_metadata().iterator();
        while (it2.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it2.next()).readTypeParameterExtensions(kmTypeParameter, typeParameter, readContext);
        }
        return kmTypeParameter;
    }

    private static final kotlin.reflect.jvm.internal.impl.km.KmType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeParameter typeParameter;
        kotlin.reflect.jvm.internal.impl.km.KmVariance kmVariance;
        kotlin.reflect.jvm.internal.impl.km.KmType kmType = new kotlin.reflect.jvm.internal.impl.km.KmType((type.getNullable() ? 1 : 0) + (type.getFlags() << 1));
        kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound = null;
        if (type.hasClassName()) {
            typeParameter = new kotlin.reflect.jvm.internal.impl.km.KmClassifier.Class(readContext.className$kotlin_metadata(type.getClassName()));
        } else if (type.hasTypeAliasName()) {
            typeParameter = new kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeAlias(readContext.className$kotlin_metadata(type.getTypeAliasName()));
        } else if (type.hasTypeParameter()) {
            typeParameter = new kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeParameter(type.getTypeParameter());
        } else if (type.hasTypeParameterName()) {
            java.lang.Integer typeParameterId$kotlin_metadata = readContext.getTypeParameterId$kotlin_metadata(type.getTypeParameterName());
            if (typeParameterId$kotlin_metadata == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No type parameter id for ");
                sb.append(readContext.get(type.getTypeParameterName()));
                throw new kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException(sb.toString(), null, 2, null);
            }
            typeParameter = new kotlin.reflect.jvm.internal.impl.km.KmClassifier.TypeParameter(typeParameterId$kotlin_metadata.intValue());
        } else {
            throw new kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
        }
        kmType.setClassifier(typeParameter);
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument : type.getArgumentList()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
            if (projection == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            int i = kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.WhenMappings.$EnumSwitchMapping$1[projection.ordinal()];
            if (i == 1) {
                kmVariance = kotlin.reflect.jvm.internal.impl.km.KmVariance.IN;
            } else if (i == 2) {
                kmVariance = kotlin.reflect.jvm.internal.impl.km.KmVariance.OUT;
            } else if (i == 3) {
                kmVariance = kotlin.reflect.jvm.internal.impl.km.KmVariance.INVARIANT;
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kmVariance = null;
            }
            if (kmVariance != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(argument);
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(argument, readContext.getTypes());
                if (type2 == null) {
                    throw new kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", null, 2, null);
                }
                kmType.getArguments().add(new kotlin.reflect.jvm.internal.impl.km.KmTypeProjection(kmVariance, getHighSpeedVideoFpsRangesFor(type2, readContext)));
            } else {
                kmType.getArguments().add(kotlin.reflect.jvm.internal.impl.km.KmTypeProjection.STAR);
            }
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type abbreviatedType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.abbreviatedType(type, readContext.getTypes());
        kmType.setAbbreviatedType(abbreviatedType != null ? getHighSpeedVideoFpsRangesFor(abbreviatedType, readContext) : null);
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type outerType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.outerType(type, readContext.getTypes());
        kmType.setOuterType(outerType != null ? getHighSpeedVideoFpsRangesFor(outerType, readContext) : null);
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type flexibleUpperBound = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.flexibleUpperBound(type, readContext.getTypes());
        if (flexibleUpperBound != null) {
            kmFlexibleTypeUpperBound = new kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound(getHighSpeedVideoFpsRangesFor(flexibleUpperBound, readContext), type.hasFlexibleTypeCapabilitiesId() ? readContext.get(type.getFlexibleTypeCapabilitiesId()) : null);
        }
        kmType.setFlexibleTypeUpperBound(kmFlexibleTypeUpperBound);
        java.util.Iterator<T> it = readContext.getExtensions$kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).readTypeExtensions(kmType, type, readContext);
        }
        return kmType;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement getHighSpeedVideoFpsRangesFor(int i, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind kmVersionRequirementVersionKind;
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel kmVersionRequirementLevel;
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement kmVersionRequirement = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement create = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Companion.create(i, readContext.getStrings(), readContext.getVersionRequirements$kotlin_metadata());
        if (create == null && !readContext.getIgnoreUnknownVersionRequirements$kotlin_metadata()) {
            throw new kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", null, 2, null);
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind kind = create != null ? create.getKind() : null;
        int i2 = kind == null ? -1 : kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.WhenMappings.$EnumSwitchMapping$2[kind.ordinal()];
        if (i2 == -1) {
            kmVersionRequirementVersionKind = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.UNKNOWN;
        } else if (i2 == 1) {
            kmVersionRequirementVersionKind = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.LANGUAGE_VERSION;
        } else if (i2 == 2) {
            kmVersionRequirementVersionKind = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.COMPILER_VERSION;
        } else {
            if (i2 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kmVersionRequirementVersionKind = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.API_VERSION;
        }
        kotlin.DeprecationLevel level = create != null ? create.getLevel() : null;
        int i3 = level == null ? -1 : kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.WhenMappings.$EnumSwitchMapping$3[level.ordinal()];
        if (i3 != -1) {
            if (i3 == 1) {
                kmVersionRequirementLevel = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.WARNING;
            } else if (i3 == 2) {
                kmVersionRequirementLevel = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.ERROR;
            } else if (i3 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kmVersionRequirement.setKind(kmVersionRequirementVersionKind);
            kmVersionRequirement.setLevel(kmVersionRequirementLevel);
            kmVersionRequirement.setErrorCode(create == null ? create.getErrorCode() : null);
            kmVersionRequirement.setMessage(create != null ? create.getMessage() : null);
            if (create != null || (r8 = create.getVersion()) == null) {
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version version = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version.INFINITY;
            }
            kmVersionRequirement.setVersion(new kotlin.reflect.jvm.internal.impl.km.KmVersion(version.component1(), version.component2(), version.component3()));
            return kmVersionRequirement;
        }
        kmVersionRequirementLevel = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.HIDDEN;
        kmVersionRequirement.setKind(kmVersionRequirementVersionKind);
        kmVersionRequirement.setLevel(kmVersionRequirementLevel);
        kmVersionRequirement.setErrorCode(create == null ? create.getErrorCode() : null);
        kmVersionRequirement.setMessage(create != null ? create.getMessage() : null);
        if (create != null) {
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version version2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version.INFINITY;
        kmVersionRequirement.setVersion(new kotlin.reflect.jvm.internal.impl.km.KmVersion(version2.component1(), version2.component2(), version2.component3()));
        return kmVersionRequirement;
    }

    private static final kotlin.reflect.jvm.internal.impl.km.KmEffectExpression getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        java.lang.Boolean bool;
        kotlin.reflect.jvm.internal.impl.km.KmEffectExpression kmEffectExpression = new kotlin.reflect.jvm.internal.impl.km.KmEffectExpression();
        kmEffectExpression.setFlags$kotlin_metadata(expression.getFlags());
        kmEffectExpression.setParameterIndex(expression.hasValueParameterReference() ? java.lang.Integer.valueOf(expression.getValueParameterReference()) : null);
        if (expression.hasConstantValue()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue constantValue = expression.getConstantValue();
            if (constantValue != null) {
                int i = kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.WhenMappings.$EnumSwitchMapping$6[constantValue.ordinal()];
                if (i == 1) {
                    bool = java.lang.Boolean.TRUE;
                } else if (i == 2) {
                    bool = java.lang.Boolean.FALSE;
                } else {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    bool = null;
                }
                kmEffectExpression.setConstantValue(new kotlin.reflect.jvm.internal.impl.km.KmConstantValue(bool));
            } else {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type isInstanceType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.isInstanceType(expression, readContext.getTypes());
        kmEffectExpression.setInstanceType(isInstanceType != null ? getHighSpeedVideoFpsRangesFor(isInstanceType, readContext) : null);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> andArgumentList = expression.getAndArgumentList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(andArgumentList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEffectExpression> andArguments = kmEffectExpression.getAndArguments();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression2 : andArgumentList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(expression2);
            andArguments.add(getHighSpeedVideoSizes(expression2, readContext));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> orArgumentList = expression.getOrArgumentList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(orArgumentList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEffectExpression> orArguments = kmEffectExpression.getOrArguments();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression3 : orArgumentList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(expression3);
            orArguments.add(getHighSpeedVideoSizes(expression3, readContext));
        }
        return kmEffectExpression;
    }

    public static final int getPropertyGetterFlags(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        return property.hasGetterFlags() ? property.getGetterFlags() : getDefaultPropertyAccessorFlags(property.getFlags());
    }

    public static final int getPropertySetterFlags(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        return property.hasSetterFlags() ? property.getSetterFlags() : getDefaultPropertyAccessorFlags(property.getFlags());
    }

    public static final int getDefaultPropertyAccessorFlags(int i) {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS.get(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.getAccessorFlags(bool.booleanValue(), kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY.get(i), kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY.get(i), false, false, false);
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.INV.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.values().length];
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.INV.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.STAR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.values().length];
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.COMPILER_VERSION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.API_VERSION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[kotlin.DeprecationLevel.values().length];
            try {
                iArr4[kotlin.DeprecationLevel.WARNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr4[kotlin.DeprecationLevel.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr4[kotlin.DeprecationLevel.HIDDEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.values().length];
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.CALLS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.values().length];
            try {
                iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.AT_MOST_ONCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.EXACTLY_ONCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.values().length];
            try {
                iArr7[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.TRUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr7[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.FALSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr7[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.NULL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }
}
