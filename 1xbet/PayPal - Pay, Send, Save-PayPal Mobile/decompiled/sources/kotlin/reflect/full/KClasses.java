package kotlin.reflect.full;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\u001a!\u0010\u0003\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0006\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a+\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a!\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\r\u0010\u000e\"3\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008G¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\"%\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016\"!\u0010\u001b\u001a\u0004\u0018\u00010\u0007*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u000e\"\"\u0010 \u001a\u00020\u001c*\u0006\u0012\u0002\b\u00030\u00008GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001d\u0010\u001e\")\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b#\u0010$\")\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b'\u0010$\")\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b+\u0010\u0013\u001a\u0004\b*\u0010$\")\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b.\u0010\u0013\u001a\u0004\b-\u0010$\")\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b1\u0010\u0013\u001a\u0004\b0\u0010$\")\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b4\u0010\u0013\u001a\u0004\b3\u0010$\")\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b7\u0010\u0013\u001a\u0004\b6\u0010$\")\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b:\u0010\u0013\u001a\u0004\b9\u0010$\")\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b>\u0010\u0013\u001a\u0004\b=\u0010$\";\u0010C\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030@0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008G¢\u0006\f\u0012\u0004\bB\u0010\u0013\u001a\u0004\bA\u0010$\"?\u0010G\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030D0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008G¢\u0006\f\u0012\u0004\bF\u0010\u0013\u001a\u0004\bE\u0010$\";\u0010J\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030@0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008G¢\u0006\f\u0012\u0004\bI\u0010\u0013\u001a\u0004\bH\u0010$\"?\u0010M\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030D0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008G¢\u0006\f\u0012\u0004\bL\u0010\u0013\u001a\u0004\bK\u0010$\")\u0010R\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000N*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\bQ\u0010\u0013\u001a\u0004\bO\u0010P\"%\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001c0!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\bT\u0010\u0013\u001a\u0004\bS\u0010$\")\u0010X\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000!*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\bW\u0010\u0013\u001a\u0004\bV\u0010$"}, d2 = {"Lkotlin/reflect/KClass;", "base", "", "isSubclassOf", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Z", "derived", "isSuperclassOf", "", "T", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "cast", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast", "createInstance", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Lkotlin/reflect/KFunction;", "getPrimaryConstructor", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KFunction;", "getPrimaryConstructor$annotations", "(Lkotlin/reflect/KClass;)V", "primaryConstructor", "getCompanionObject", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KClass;", "getCompanionObject$annotations", "companionObject", "getCompanionObjectInstance", "getCompanionObjectInstance$annotations", "companionObjectInstance", "Lkotlin/reflect/KType;", "getDefaultType", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KType;", "getDefaultType$annotations", "defaultType", "", "Lkotlin/reflect/KCallable;", "getDeclaredMembers", "(Lkotlin/reflect/KClass;)Ljava/util/Collection;", "getDeclaredMembers$annotations", "declaredMembers", "getFunctions", "getFunctions$annotations", "functions", "getStaticFunctions", "getStaticFunctions$annotations", "staticFunctions", "getMemberFunctions", "getMemberFunctions$annotations", "memberFunctions", "getMemberExtensionFunctions", "getMemberExtensionFunctions$annotations", "memberExtensionFunctions", "getDeclaredFunctions", "getDeclaredFunctions$annotations", "declaredFunctions", "getDeclaredMemberFunctions", "getDeclaredMemberFunctions$annotations", "declaredMemberFunctions", "getDeclaredMemberExtensionFunctions", "getDeclaredMemberExtensionFunctions$annotations", "declaredMemberExtensionFunctions", "Lkotlin/reflect/KProperty0;", "getStaticProperties", "getStaticProperties$annotations", "staticProperties", "Lkotlin/reflect/KProperty1;", "getMemberProperties", "getMemberProperties$annotations", "memberProperties", "Lkotlin/reflect/KProperty2;", "getMemberExtensionProperties", "getMemberExtensionProperties$annotations", "memberExtensionProperties", "getDeclaredMemberProperties", "getDeclaredMemberProperties$annotations", "declaredMemberProperties", "getDeclaredMemberExtensionProperties", "getDeclaredMemberExtensionProperties$annotations", "declaredMemberExtensionProperties", "", "getSuperclasses", "(Lkotlin/reflect/KClass;)Ljava/util/List;", "getSuperclasses$annotations", "superclasses", "getAllSupertypes", "getAllSupertypes$annotations", "allSupertypes", "getAllSuperclasses", "getAllSuperclasses$annotations", "allSuperclasses"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KClasses {
    public static /* synthetic */ void getAllSuperclasses$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getAllSupertypes$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getCompanionObject$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getCompanionObjectInstance$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getDeclaredFunctions$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getDeclaredMemberExtensionFunctions$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getDeclaredMemberExtensionProperties$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getDeclaredMemberFunctions$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getDeclaredMemberProperties$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getDeclaredMembers$annotations(kotlin.reflect.KClass kClass) {
    }

    @kotlin.Deprecated(message = "This function creates a type which rarely makes sense for generic classes. For example, such type can only be used in signatures of members of that class. Use starProjectedType or createType() for clearer semantics.")
    public static /* synthetic */ void getDefaultType$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getFunctions$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getMemberExtensionFunctions$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getMemberExtensionProperties$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getMemberFunctions$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getMemberProperties$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getPrimaryConstructor$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getStaticFunctions$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getStaticProperties$annotations(kotlin.reflect.KClass kClass) {
    }

    public static /* synthetic */ void getSuperclasses$annotations(kotlin.reflect.KClass kClass) {
    }

    public static final <T> kotlin.reflect.KFunction<T> getPrimaryConstructor(kotlin.reflect.KClass<T> kClass) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Iterator<T> it = ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getConstructors().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) t;
            kotlin.jvm.internal.Intrinsics.checkNotNull(kFunction, "");
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor = ((kotlin.reflect.jvm.internal.DescriptorKFunction) kFunction).getDescriptor();
            kotlin.jvm.internal.Intrinsics.checkNotNull(descriptor, "");
            if (((kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) descriptor).isPrimary()) {
                break;
            }
        }
        return (kotlin.reflect.KFunction) t;
    }

    public static final kotlin.reflect.KClass<?> getCompanionObject(kotlin.reflect.KClass<?> kClass) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Iterator<T> it = kClass.getNestedClasses().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((kotlin.reflect.KClass) obj).isCompanion()) {
                break;
            }
        }
        return (kotlin.reflect.KClass) obj;
    }

    public static final java.lang.Object getCompanionObjectInstance(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.reflect.KClass<?> companionObject = getCompanionObject(kClass);
        if (companionObject != null) {
            return companionObject.getObjectInstance();
        }
        return null;
    }

    public static final kotlin.reflect.KType getDefaultType(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.reflect.KClass<?> kClass2 = kClass;
        java.util.List<kotlin.reflect.KTypeParameter> typeParameters = kClass.getTypeParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        java.util.Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.KTypeProjection(kotlin.reflect.KVariance.INVARIANT, kotlin.reflect.full.KClassifiers.createType$default((kotlin.reflect.KTypeParameter) it.next(), null, false, null, 7, null)));
        }
        return kotlin.reflect.full.KClassifiers.createType$default(kClass2, arrayList, false, null, 6, null);
    }

    public static final java.util.Collection<kotlin.reflect.KCallable<?>> getDeclaredMembers(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return ((kotlin.reflect.jvm.internal.KClassImpl.Data) ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue()).getDeclaredMembers();
    }

    public static final java.util.Collection<kotlin.reflect.KFunction<?>> getFunctions(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.KCallable<?>> members = kClass.getMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : members) {
            if (obj instanceof kotlin.reflect.KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.Collection<kotlin.reflect.KFunction<?>> getStaticFunctions(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> allStaticMembers = ((kotlin.reflect.jvm.internal.KClassImpl.Data) ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue()).getAllStaticMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allStaticMembers) {
            if (obj instanceof kotlin.reflect.KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.Collection<kotlin.reflect.KFunction<?>> getMemberFunctions(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> allNonStaticMembers = ((kotlin.reflect.jvm.internal.KClassImpl.Data) ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue()).getAllNonStaticMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allNonStaticMembers) {
            kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable = (kotlin.reflect.jvm.internal.DescriptorKCallable) obj;
            if ((!(descriptorKCallable.getDescriptor().getExtensionReceiverParameter() != null)) && (descriptorKCallable instanceof kotlin.reflect.KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.Collection<kotlin.reflect.KFunction<?>> getMemberExtensionFunctions(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> allNonStaticMembers = ((kotlin.reflect.jvm.internal.KClassImpl.Data) ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue()).getAllNonStaticMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allNonStaticMembers) {
            kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable = (kotlin.reflect.jvm.internal.DescriptorKCallable) obj;
            if (descriptorKCallable.getDescriptor().getExtensionReceiverParameter() != null && (descriptorKCallable instanceof kotlin.reflect.KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.Collection<kotlin.reflect.KFunction<?>> getDeclaredFunctions(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> declaredMembers = ((kotlin.reflect.jvm.internal.KClassImpl.Data) ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue()).getDeclaredMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : declaredMembers) {
            if (obj instanceof kotlin.reflect.KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.Collection<kotlin.reflect.KFunction<?>> getDeclaredMemberFunctions(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> declaredNonStaticMembers = ((kotlin.reflect.jvm.internal.KClassImpl.Data) ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue()).getDeclaredNonStaticMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : declaredNonStaticMembers) {
            kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable = (kotlin.reflect.jvm.internal.DescriptorKCallable) obj;
            if ((!(descriptorKCallable.getDescriptor().getExtensionReceiverParameter() != null)) && (descriptorKCallable instanceof kotlin.reflect.KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.Collection<kotlin.reflect.KFunction<?>> getDeclaredMemberExtensionFunctions(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> declaredNonStaticMembers = ((kotlin.reflect.jvm.internal.KClassImpl.Data) ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue()).getDeclaredNonStaticMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : declaredNonStaticMembers) {
            kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable = (kotlin.reflect.jvm.internal.DescriptorKCallable) obj;
            if (descriptorKCallable.getDescriptor().getExtensionReceiverParameter() != null && (descriptorKCallable instanceof kotlin.reflect.KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.Collection<kotlin.reflect.KProperty0<?>> getStaticProperties(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> allStaticMembers = ((kotlin.reflect.jvm.internal.KClassImpl.Data) ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue()).getAllStaticMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allStaticMembers) {
            kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable = (kotlin.reflect.jvm.internal.DescriptorKCallable) obj;
            if ((!(descriptorKCallable.getDescriptor().getExtensionReceiverParameter() != null)) && (descriptorKCallable instanceof kotlin.reflect.KProperty0)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> java.util.Collection<kotlin.reflect.KProperty1<T, ?>> getMemberProperties(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> allNonStaticMembers = ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue().getAllNonStaticMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : allNonStaticMembers) {
            kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable = (kotlin.reflect.jvm.internal.DescriptorKCallable) t;
            if ((!(descriptorKCallable.getDescriptor().getExtensionReceiverParameter() != null)) && (descriptorKCallable instanceof kotlin.reflect.KProperty1)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> java.util.Collection<kotlin.reflect.KProperty2<T, ?, ?>> getMemberExtensionProperties(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> allNonStaticMembers = ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue().getAllNonStaticMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : allNonStaticMembers) {
            kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable = (kotlin.reflect.jvm.internal.DescriptorKCallable) t;
            if (descriptorKCallable.getDescriptor().getExtensionReceiverParameter() != null && (descriptorKCallable instanceof kotlin.reflect.KProperty2)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> java.util.Collection<kotlin.reflect.KProperty1<T, ?>> getDeclaredMemberProperties(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> declaredNonStaticMembers = ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue().getDeclaredNonStaticMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : declaredNonStaticMembers) {
            kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable = (kotlin.reflect.jvm.internal.DescriptorKCallable) t;
            if ((!(descriptorKCallable.getDescriptor().getExtensionReceiverParameter() != null)) && (descriptorKCallable instanceof kotlin.reflect.KProperty1)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> java.util.Collection<kotlin.reflect.KProperty2<T, ?, ?>> getDeclaredMemberExtensionProperties(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.DescriptorKCallable<?>> declaredNonStaticMembers = ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getData().getValue().getDeclaredNonStaticMembers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : declaredNonStaticMembers) {
            kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable = (kotlin.reflect.jvm.internal.DescriptorKCallable) t;
            if (descriptorKCallable.getDescriptor().getExtensionReceiverParameter() != null && (descriptorKCallable instanceof kotlin.reflect.KProperty2)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final java.util.List<kotlin.reflect.KClass<?>> getSuperclasses(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.List<kotlin.reflect.KType> supertypes = kClass.getSupertypes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            kotlin.reflect.KClassifier classifier = ((kotlin.reflect.KType) it.next()).getClassifier();
            kotlin.reflect.KClass kClass2 = classifier instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) classifier : null;
            if (kClass2 != null) {
                arrayList.add(kClass2);
            }
        }
        return arrayList;
    }

    public static final java.util.Collection<kotlin.reflect.KType> getAllSupertypes(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.lang.Object dfs = kotlin.reflect.jvm.internal.impl.utils.DFS.dfs(kClass.getSupertypes(), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors() { // from class: kotlin.reflect.full.KClasses$$Lambda$0
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public java.lang.Iterable getNeighbors(java.lang.Object obj) {
                return kotlin.reflect.full.KClasses.getHighSpeedVideoFpsRangesFor((kotlin.reflect.KType) obj);
            }
        }, new kotlin.reflect.jvm.internal.impl.utils.DFS.VisitedWithSet(), new kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandlerWithListResult<kotlin.reflect.KType, kotlin.reflect.KType>() { // from class: kotlin.reflect.full.KClasses$allSupertypes$2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final boolean beforeChildren(kotlin.reflect.KType current) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
                ((java.util.LinkedList) this.result).add(current);
                return true;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dfs, "");
        return (java.util.Collection) dfs;
    }

    public static final java.util.Collection<kotlin.reflect.KClass<?>> getAllSuperclasses(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Collection<kotlin.reflect.KType> allSupertypes = getAllSupertypes(kClass);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(allSupertypes, 10));
        for (kotlin.reflect.KType kType : allSupertypes) {
            kotlin.reflect.KClassifier classifier = kType.getClassifier();
            kotlin.reflect.KClass kClass2 = classifier instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) classifier : null;
            if (kClass2 == null) {
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Supertype not a class: ".concat(java.lang.String.valueOf(kType)));
            }
            arrayList.add(kClass2);
        }
        return arrayList;
    }

    public static final boolean isSubclassOf(kotlin.reflect.KClass<?> kClass, final kotlin.reflect.KClass<?> kClass2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kClass2)) {
            return true;
        }
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(kClass);
        final kotlin.reflect.full.KClasses$isSubclassOf$1 kClasses$isSubclassOf$1 = new kotlin.jvm.internal.PropertyReference1Impl() { // from class: kotlin.reflect.full.KClasses$isSubclassOf$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return kotlin.reflect.full.KClasses.getSuperclasses((kotlin.reflect.KClass) obj);
            }
        };
        return kotlin.reflect.jvm.internal.impl.utils.DFS.ifAny(listOf, new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors(kClasses$isSubclassOf$1) { // from class: kotlin.reflect.full.KClasses$$Lambda$1
            private final kotlin.reflect.KProperty1 Camera2StreamConfigurationMap;

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public java.lang.Iterable getNeighbors(java.lang.Object obj) {
                return kotlin.reflect.full.KClasses.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, (kotlin.reflect.KClass) obj);
            }

            {
                this.Camera2StreamConfigurationMap = kClasses$isSubclassOf$1;
            }
        }, new kotlin.jvm.functions.Function1(kClass2) { // from class: kotlin.reflect.full.KClasses$$Lambda$2
            private final kotlin.reflect.KClass getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Boolean valueOf;
                valueOf = java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual((kotlin.reflect.KClass) obj, this.getHighSpeedVideoSizes));
                return valueOf;
            }

            {
                this.getHighSpeedVideoSizes = kClass2;
            }
        }).booleanValue();
    }

    public static final boolean isSuperclassOf(kotlin.reflect.KClass<?> kClass, kotlin.reflect.KClass<?> kClass2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass2, "");
        return isSubclassOf(kClass2, kClass);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T cast(kotlin.reflect.KClass<T> kClass, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        if (!kClass.isInstance(obj)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Value cannot be cast to ");
            sb.append(kClass.getGetHighResolutionOutputSizeshNQ4ISI());
            throw new kotlin.TypeCastException(sb.toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T safeCast(kotlin.reflect.KClass<T> kClass, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        if (!kClass.isInstance(obj)) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return obj;
    }

    public static final <T> T createInstance(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.Iterator<T> it = kClass.getConstructors().iterator();
        boolean z = false;
        T t = null;
        T t2 = null;
        while (true) {
            if (it.hasNext()) {
                T next = it.next();
                java.util.List<kotlin.reflect.KParameter> parameters = ((kotlin.reflect.KFunction) next).getParameters();
                if (!(parameters instanceof java.util.Collection) || !parameters.isEmpty()) {
                    java.util.Iterator<T> it2 = parameters.iterator();
                    while (it2.hasNext()) {
                        if (!((kotlin.reflect.KParameter) it2.next()).isOptional()) {
                            break;
                        }
                    }
                }
                if (z) {
                    break;
                }
                z = true;
                t2 = next;
            } else if (z) {
                t = t2;
            }
        }
        kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) t;
        if (kFunction == null) {
            throw new java.lang.IllegalArgumentException("Class should have a single no-arg constructor: ".concat(java.lang.String.valueOf(kClass)));
        }
        return (T) kFunction.callBy(kotlin.collections.MapsKt.emptyMap());
    }

    static /* synthetic */ java.lang.Iterable getHighSpeedVideoFpsRangesFor(kotlin.reflect.KType kType) {
        kotlin.reflect.KClassifier classifier = kType.getClassifier();
        kotlin.reflect.KClass<?> kClass = classifier instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) classifier : null;
        if (kClass == null) {
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Supertype not a class: ".concat(java.lang.String.valueOf(kType)));
        }
        java.util.List<kotlin.reflect.KType> supertypes = kClass.getSupertypes();
        if (kType.getArguments().isEmpty()) {
            return supertypes;
        }
        kotlin.reflect.jvm.internal.types.KTypeSubstitutor create = kotlin.reflect.jvm.internal.types.KTypeSubstitutor.INSTANCE.create(kClass, kType.getArguments());
        java.util.List<kotlin.reflect.KType> list = supertypes;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.KType kType2 : list) {
            kotlin.reflect.KType type = create.substitute(kType2).getType();
            if (type == null) {
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Incorrect type substitution: ".concat(java.lang.String.valueOf(kType2)));
            }
            arrayList.add(type);
        }
        return arrayList;
    }

    static /* synthetic */ java.lang.Iterable getHighSpeedVideoFpsRanges(kotlin.reflect.KProperty1 kProperty1, kotlin.reflect.KClass kClass) {
        return (java.lang.Iterable) kProperty1.invoke(kClass);
    }
}
