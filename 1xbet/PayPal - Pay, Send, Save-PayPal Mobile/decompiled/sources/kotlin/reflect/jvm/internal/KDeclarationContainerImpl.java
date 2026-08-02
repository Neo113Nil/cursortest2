package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 =2\u00020\u0001:\u0003>?=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00182\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010 \u001a\u0004\u0018\u00010\u001d*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00182\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b \u0010!J/\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#*\u0006\u0012\u0002\b\u00030\u00162\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\u0006\u0010&\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\u0006\u0010&\u001a\u00020\u0010¢\u0006\u0004\b.\u0010-J;\u00101\u001a\u0002002\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160/2\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\"2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0004\b1\u00102J\u001f\u0010$\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001bH\u0002¢\u0006\u0004\b$\u00104J+\u00101\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u00105R\u0018\u00108\u001a\u0006\u0012\u0002\b\u00030\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u0002090\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "", "index", "getLocalProperty", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "", "signature", "findPropertyDescriptor", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findFunctionDescriptor", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "Ljava/lang/Class;", "p0", "", "p1", "p2", "", "p3", "Ljava/lang/reflect/Method;", "Camera2StreamConfigurationMap", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "getHighSpeedVideoSizes", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "desc", "findMethodBySignature", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "isMember", "findDefaultMethod", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "findConstructorBySignature", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;Ljava/util/List;Z)V", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;", "(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;", "(Ljava/lang/String;II)Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructorDescriptors", "Companion", "Data", "FunctionJvmDescriptor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class KDeclarationContainerImpl implements kotlin.jvm.internal.ClassBasedDeclarationContainer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Companion INSTANCE = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Companion(null);
    private static final java.lang.Class<?> getHighSpeedVideoFpsRangesFor = java.lang.Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
    private static final kotlin.text.Regex LOCAL_PROPERTY_SIGNATURE = new kotlin.text.Regex("<v#(\\d+)>");

    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor> getConstructorDescriptors();

    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2);

    public abstract kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getLocalProperty(int index);

    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getProperties(kotlin.reflect.jvm.internal.impl.name.Name name2);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public abstract class Data {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getHighSpeedVideoFpsRangesFor;

        public Data() {
            this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.KDeclarationContainerImpl.this) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$$Lambda$0
                private final kotlin.reflect.jvm.internal.KDeclarationContainerImpl getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData orCreateModule;
                    orCreateModule = kotlin.reflect.jvm.internal.ModuleByClassLoaderKt.getOrCreateModule(this.getHighSpeedVideoSizes.getJClass());
                    return orCreateModule;
                }

                {
                    this.getHighSpeedVideoSizes = r1;
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData getModuleData() {
            T value = this.getHighSpeedVideoFpsRangesFor.getValue(this, getHighSpeedVideoFpsRanges[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            return (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData) value;
        }
    }

    protected java.lang.Class<?> getMethodOwner() {
        java.lang.Class<?> wrapperByPrimitive = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        return wrapperByPrimitive == null ? getJClass() : wrapperByPrimitive;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor findPropertyDescriptor(java.lang.String name2, java.lang.String signature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "");
        kotlin.text.MatchResult matchEntire = LOCAL_PROPERTY_SIGNATURE.matchEntire(signature);
        if (matchEntire != null) {
            java.lang.String str = matchEntire.getDestructured().getMatch().getGroupValues().get(1);
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor localProperty = getLocalProperty(java.lang.Integer.parseInt(str));
            if (localProperty != null) {
                return localProperty;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Local property #");
            sb.append(str);
            sb.append(" not found in ");
            sb.append(getJClass());
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
        }
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(name2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> properties = getProperties(identifier);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : properties) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapPropertySignature((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj).getCamera2StreamConfigurationMap(), signature)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Property '");
            sb2.append(name2);
            sb2.append("' (JVM signature: ");
            sb2.append(signature);
            sb2.append(") not resolved in ");
            sb2.append(this);
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb2.toString());
        }
        if (arrayList2.size() == 1) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) arrayList2);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : arrayList2) {
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj2).getVisibility();
            java.lang.Object obj3 = linkedHashMap.get(visibility);
            if (obj3 == null) {
                obj3 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(visibility, obj3);
            }
            ((java.util.List) obj3).add(obj2);
        }
        final kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$0 kDeclarationContainerImpl$$Lambda$0 = new kotlin.jvm.functions.Function2() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$0
            @Override // kotlin.jvm.functions.Function2
            public java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                return java.lang.Integer.valueOf(kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility) obj4, (kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility) obj5));
            }
        };
        java.util.Collection values = kotlin.collections.MapsKt.toSortedMap(linkedHashMap, new java.util.Comparator(kDeclarationContainerImpl$$Lambda$0) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$1
            private final kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRanges;

            @Override // java.util.Comparator
            public int compare(java.lang.Object obj4, java.lang.Object obj5) {
                int intValue;
                intValue = ((java.lang.Number) this.getHighSpeedVideoFpsRanges.invoke(obj4, obj5)).intValue();
                return intValue;
            }

            {
                this.getHighSpeedVideoFpsRanges = kDeclarationContainerImpl$$Lambda$0;
            }
        }).values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
        java.util.List list = (java.util.List) kotlin.collections.CollectionsKt.last(values);
        if (list.size() == 1) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) kotlin.collections.CollectionsKt.first(list);
        }
        kotlin.reflect.jvm.internal.impl.name.Name identifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(name2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier2, "");
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(getProperties(identifier2), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$2
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj4) {
                return kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj4);
            }
        }, 30, null);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Property '");
        sb3.append(name2);
        sb3.append("' (JVM signature: ");
        sb3.append(signature);
        sb3.append(") not resolved in ");
        sb3.append(this);
        sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb3.append(joinToString$default.length() == 0 ? " no members found" : com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE.concat(java.lang.String.valueOf(joinToString$default)));
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb3.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor findFunctionDescriptor(java.lang.String name2, java.lang.String signature) {
        java.util.List functions;
        java.util.ArrayList arrayList;
        java.lang.String getHighSpeedVideoFpsRangesFor2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(name2, "<init>")) {
            functions = kotlin.collections.CollectionsKt.toList(getConstructorDescriptors());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : functions) {
                kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) obj;
                if (constructorDescriptor.isPrimary()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
                    if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration)) {
                        java.lang.String getHighSpeedVideoFpsRangesFor3 = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(constructorDescriptor).getGetHighSpeedVideoFpsRangesFor();
                        if (!kotlin.text.StringsKt.startsWith$default(getHighSpeedVideoFpsRangesFor3, "constructor-impl", false, 2, (java.lang.Object) null) || !kotlin.text.StringsKt.endsWith$default(getHighSpeedVideoFpsRangesFor3, ")V", false, 2, (java.lang.Object) null)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid signature of ");
                            sb.append(constructorDescriptor);
                            sb.append(": ");
                            sb.append(getHighSpeedVideoFpsRangesFor3);
                            throw new java.lang.IllegalArgumentException(sb.toString().toString());
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(kotlin.text.StringsKt.removeSuffix(getHighSpeedVideoFpsRangesFor3, (java.lang.CharSequence) "V"));
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters containingDeclaration2 = constructorDescriptor.getContainingDeclaration();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "");
                        sb2.append(kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.toJvmDescriptor(containingDeclaration2));
                        getHighSpeedVideoFpsRangesFor2 = sb2.toString();
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoFpsRangesFor2, signature)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                getHighSpeedVideoFpsRangesFor2 = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(constructorDescriptor).getGetHighSpeedVideoFpsRangesFor();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoFpsRangesFor2, signature)) {
                }
            }
            arrayList = arrayList2;
        } else {
            kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(name2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
            functions = getFunctions(identifier);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : functions) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj2).getGetHighSpeedVideoFpsRangesFor(), signature)) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = arrayList3;
        }
        if (arrayList.size() != 1) {
            java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(functions, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$3
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj3) {
                    return kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj3);
                }
            }, 30, null);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Function '");
            sb3.append(name2);
            sb3.append("' (JVM signature: ");
            sb3.append(signature);
            sb3.append(") not resolved in ");
            sb3.append(this);
            sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb3.append(joinToString$default.length() == 0 ? " no members found" : com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE.concat(java.lang.String.valueOf(joinToString$default)));
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb3.toString());
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) arrayList);
    }

    private final java.lang.reflect.Method Camera2StreamConfigurationMap(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>[] clsArr, java.lang.Class<?> cls2, boolean z) {
        java.lang.reflect.Method Camera2StreamConfigurationMap;
        if (z) {
            clsArr[0] = cls;
        }
        java.lang.reflect.Method highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(cls, str, clsArr, cls2);
        if (highSpeedVideoFpsRangesFor != null) {
            return highSpeedVideoFpsRangesFor;
        }
        java.lang.Class<? super java.lang.Object> superclass = cls.getSuperclass();
        if (superclass != null && (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(superclass, str, clsArr, cls2, z)) != null) {
            return Camera2StreamConfigurationMap;
        }
        java.lang.Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interfaces, "");
        for (java.lang.Class<?> cls3 : interfaces) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls3);
            java.lang.reflect.Method Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(cls3, str, clsArr, cls2, z);
            if (Camera2StreamConfigurationMap2 != null) {
                return Camera2StreamConfigurationMap2;
            }
            if (z) {
                java.lang.ClassLoader safeClassLoader = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(cls3);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls3.getName());
                sb.append("$DefaultImpls");
                java.lang.Class<?> tryLoadClass = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt.tryLoadClass(safeClassLoader, sb.toString());
                if (tryLoadClass != null) {
                    clsArr[0] = cls3;
                    java.lang.reflect.Method highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(tryLoadClass, str, clsArr, cls2);
                    if (highSpeedVideoFpsRangesFor2 != null) {
                        return highSpeedVideoFpsRangesFor2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>[] clsArr, java.lang.Class<?> cls2) {
        java.lang.reflect.Method method;
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.Intrinsics.areEqual(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
            java.lang.reflect.Method[] methodArr = declaredMethods;
            int length = methodArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methodArr[i];
                java.lang.reflect.Method method2 = method;
                if (kotlin.jvm.internal.Intrinsics.areEqual(method2.getName(), str) && kotlin.jvm.internal.Intrinsics.areEqual(method2.getReturnType(), cls2) && java.util.Arrays.equals(method2.getParameterTypes(), clsArr)) {
                    break;
                }
                i++;
            }
            return method;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    private static java.lang.reflect.Constructor<?> getHighSpeedVideoSizes(java.lang.Class<?> cls, java.util.List<? extends java.lang.Class<?>> list) {
        try {
            java.lang.Class[] clsArr = (java.lang.Class[]) list.toArray(new java.lang.Class[0]);
            return cls.getDeclaredConstructor((java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    public final java.lang.reflect.Method findMethodBySignature(java.lang.String name2, java.lang.String desc) {
        java.lang.reflect.Method Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desc, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(name2, "<init>")) {
            return null;
        }
        kotlin.reflect.jvm.internal.KDeclarationContainerImpl.FunctionJvmDescriptor highSpeedVideoSizes = getHighSpeedVideoSizes(desc, true);
        java.lang.Class<?>[] clsArr = (java.lang.Class[]) highSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.toArray(new java.lang.Class[0]);
        java.lang.Class<?> cls = highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
        java.lang.reflect.Method Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(getMethodOwner(), name2, clsArr, cls, false);
        if (Camera2StreamConfigurationMap2 != null) {
            return Camera2StreamConfigurationMap2;
        }
        if (!getMethodOwner().isInterface() || (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(java.lang.Object.class, name2, clsArr, cls, false)) == null) {
            return null;
        }
        return Camera2StreamConfigurationMap;
    }

    public final java.lang.reflect.Method findDefaultMethod(java.lang.String name2, java.lang.String desc, boolean isMember) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desc, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(name2, "<init>")) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (isMember) {
            arrayList.add(getJClass());
        }
        kotlin.reflect.jvm.internal.KDeclarationContainerImpl.FunctionJvmDescriptor highSpeedVideoSizes = getHighSpeedVideoSizes(desc, true);
        getHighResolutionOutputSizeshNQ4ISI((java.util.List<java.lang.Class<?>>) arrayList, (java.util.List<? extends java.lang.Class<?>>) highSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI, false);
        java.lang.Class<?> methodOwner = getMethodOwner();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(name2);
        sb.append("$default");
        java.lang.String obj = sb.toString();
        java.lang.Class<?>[] clsArr = (java.lang.Class[]) arrayList.toArray(new java.lang.Class[0]);
        java.lang.Class<?> cls = highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
        return Camera2StreamConfigurationMap(methodOwner, obj, clsArr, cls, isMember);
    }

    public final java.lang.reflect.Constructor<?> findConstructorBySignature(java.lang.String desc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desc, "");
        return getHighSpeedVideoSizes(getJClass(), getHighSpeedVideoSizes(desc, false).getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.reflect.Constructor<?> findDefaultConstructor(java.lang.String desc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desc, "");
        java.lang.Class<?> jClass = getJClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        getHighResolutionOutputSizeshNQ4ISI((java.util.List<java.lang.Class<?>>) arrayList, (java.util.List<? extends java.lang.Class<?>>) getHighSpeedVideoSizes(desc, false).getHighResolutionOutputSizeshNQ4ISI, true);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return getHighSpeedVideoSizes(jClass, arrayList);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.util.List<java.lang.Class<?>> p0, java.util.List<? extends java.lang.Class<?>> p1, boolean p2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.lastOrNull((java.util.List) p1), getHighSpeedVideoFpsRangesFor)) {
            p1 = p1.subList(0, p1.size() - 1);
        }
        p0.addAll(p1);
        int size = (p1.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            java.lang.Class<?> cls = java.lang.Integer.TYPE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls, "");
            p0.add(cls);
        }
        java.lang.Class cls2 = p2 ? getHighSpeedVideoFpsRangesFor : java.lang.Object.class;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls2);
        p0.add(cls2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0007¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;", "", "", "Ljava/lang/Class;", "p0", "p1", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Ljava/lang/Class;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class FunctionJvmDescriptor {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.lang.Class<?> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final java.util.List<java.lang.Class<?>> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public FunctionJvmDescriptor(java.util.List<? extends java.lang.Class<?>> list, java.lang.Class<?> cls) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighResolutionOutputSizeshNQ4ISI = list;
            this.getHighSpeedVideoFpsRangesFor = cls;
        }
    }

    private final kotlin.reflect.jvm.internal.KDeclarationContainerImpl.FunctionJvmDescriptor getHighSpeedVideoSizes(java.lang.String p0, boolean p1) {
        int indexOf$default;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 1;
        while (true) {
            if (p0.charAt(i) != ')') {
                int i2 = i;
                while (p0.charAt(i2) == '[') {
                    i2++;
                }
                char charAt = p0.charAt(i2);
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "VZCBSIFJD", charAt, false, 2, (java.lang.Object) null)) {
                    indexOf$default = i2 + 1;
                } else if (charAt == 'L') {
                    indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) p0, ';', i, false, 4, (java.lang.Object) null) + 1;
                } else {
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(java.lang.String.valueOf(p0)));
                }
                arrayList.add(getHighResolutionOutputSizeshNQ4ISI(p0, i, indexOf$default));
                i = indexOf$default;
            } else {
                return new kotlin.reflect.jvm.internal.KDeclarationContainerImpl.FunctionJvmDescriptor(arrayList, p1 ? getHighResolutionOutputSizeshNQ4ISI(p0, i + 1, p0.length()) : null);
            }
        }
    }

    private final java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, int p1, int p2) {
        char charAt = p0.charAt(p1);
        if (charAt == 'F') {
            return java.lang.Float.TYPE;
        }
        if (charAt == 'L') {
            java.lang.ClassLoader safeClassLoader = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(getJClass());
            java.lang.String substring = p0.substring(p1 + 1, p2 - 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.Class<?> loadClass = safeClassLoader.loadClass(kotlin.text.StringsKt.replace$default(substring, kotlinx.io.files.FileSystemKt.UnixPathSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 4, (java.lang.Object) null));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
            return loadClass;
        }
        if (charAt == 'S') {
            return java.lang.Short.TYPE;
        }
        if (charAt == 'V') {
            java.lang.Class<?> cls = java.lang.Void.TYPE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls, "");
            return cls;
        }
        if (charAt == 'I') {
            return java.lang.Integer.TYPE;
        }
        if (charAt == 'J') {
            return java.lang.Long.TYPE;
        }
        if (charAt == 'Z') {
            return java.lang.Boolean.TYPE;
        }
        if (charAt == '[') {
            return kotlin.reflect.jvm.internal.UtilKt.createArrayType(getHighResolutionOutputSizeshNQ4ISI(p0, p1 + 1, p2));
        }
        switch (charAt) {
            case 'B':
                return java.lang.Byte.TYPE;
            case 'C':
                return java.lang.Character.TYPE;
            case 'D':
                return java.lang.Double.TYPE;
            default:
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(java.lang.String.valueOf(p0)));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Class;", "getHighSpeedVideoSizes", "Lkotlin/text/Regex;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.text.Regex getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return kotlin.reflect.jvm.internal.KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static /* synthetic */ int Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility2) {
        java.lang.Integer compare = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.compare(descriptorVisibility, descriptorVisibility2);
        if (compare != null) {
            return compare.intValue();
        }
        return 0;
    }

    static /* synthetic */ java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.DEBUG_TEXT.render(propertyDescriptor));
        sb.append(com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR);
        sb.append(kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapPropertySignature(propertyDescriptor).getCamera2StreamConfigurationMap());
        return sb.toString();
    }

    static /* synthetic */ java.lang.CharSequence getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.DEBUG_TEXT.render(functionDescriptor));
        sb.append(com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR);
        sb.append(kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(functionDescriptor).getGetHighSpeedVideoFpsRangesFor());
        return sb.toString();
    }
}
