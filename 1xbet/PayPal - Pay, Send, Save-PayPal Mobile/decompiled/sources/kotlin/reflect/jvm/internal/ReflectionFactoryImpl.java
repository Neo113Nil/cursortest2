package kotlin.reflect.jvm.internal;

/* loaded from: classes5.dex */
public class ReflectionFactoryImpl extends kotlin.jvm.internal.ReflectionFactory {
    @Override // kotlin.jvm.internal.ReflectionFactory
    public void setUpperBounds(kotlin.reflect.KTypeParameter kTypeParameter, java.util.List<kotlin.reflect.KType> list) {
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KClass createKotlinClass(java.lang.Class cls) {
        return new kotlin.reflect.jvm.internal.KClassImpl(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KClass createKotlinClass(java.lang.Class cls, java.lang.String str) {
        return new kotlin.reflect.jvm.internal.KClassImpl(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class cls, java.lang.String str) {
        return kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinPackage(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class cls) {
        return kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class cls, java.lang.String str) {
        return kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public java.lang.String renderLambdaToString(kotlin.jvm.internal.Lambda lambda) {
        return renderLambdaToString((kotlin.jvm.internal.FunctionBase) lambda);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public java.lang.String renderLambdaToString(kotlin.jvm.internal.FunctionBase functionBase) {
        kotlin.reflect.KFunction<?> reflect = kotlin.reflect.jvm.ReflectLambdaKt.reflect(functionBase);
        if (reflect != null) {
            return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.INSTANCE.renderLambda(reflect);
        }
        return super.renderLambdaToString(functionBase);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KFunction function(kotlin.jvm.internal.FunctionReference functionReference) {
        kotlin.reflect.KDeclarationContainer owner = functionReference.getOwner();
        return new kotlin.reflect.jvm.internal.DescriptorKFunction(owner instanceof kotlin.reflect.jvm.internal.KDeclarationContainerImpl ? (kotlin.reflect.jvm.internal.KDeclarationContainerImpl) owner : kotlin.reflect.jvm.internal.EmptyContainerForLocal.INSTANCE, functionReference.getGetHighSpeedVideoFpsRanges(), functionReference.getSignature(), functionReference.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KProperty0 property0(kotlin.jvm.internal.PropertyReference0 propertyReference0) {
        kotlin.reflect.KDeclarationContainer owner = propertyReference0.getOwner();
        return new kotlin.reflect.jvm.internal.DescriptorKProperty0(owner instanceof kotlin.reflect.jvm.internal.KDeclarationContainerImpl ? (kotlin.reflect.jvm.internal.KDeclarationContainerImpl) owner : kotlin.reflect.jvm.internal.EmptyContainerForLocal.INSTANCE, propertyReference0.getGetHighSpeedVideoFpsRanges(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KMutableProperty0 mutableProperty0(kotlin.jvm.internal.MutablePropertyReference0 mutablePropertyReference0) {
        kotlin.reflect.KDeclarationContainer owner = mutablePropertyReference0.getOwner();
        return new kotlin.reflect.jvm.internal.DescriptorKMutableProperty0(owner instanceof kotlin.reflect.jvm.internal.KDeclarationContainerImpl ? (kotlin.reflect.jvm.internal.KDeclarationContainerImpl) owner : kotlin.reflect.jvm.internal.EmptyContainerForLocal.INSTANCE, mutablePropertyReference0.getGetHighSpeedVideoFpsRanges(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KProperty1 property1(kotlin.jvm.internal.PropertyReference1 propertyReference1) {
        kotlin.reflect.KDeclarationContainer owner = propertyReference1.getOwner();
        return new kotlin.reflect.jvm.internal.DescriptorKProperty1(owner instanceof kotlin.reflect.jvm.internal.KDeclarationContainerImpl ? (kotlin.reflect.jvm.internal.KDeclarationContainerImpl) owner : kotlin.reflect.jvm.internal.EmptyContainerForLocal.INSTANCE, propertyReference1.getGetHighSpeedVideoFpsRanges(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KMutableProperty1 mutableProperty1(kotlin.jvm.internal.MutablePropertyReference1 mutablePropertyReference1) {
        kotlin.reflect.KDeclarationContainer owner = mutablePropertyReference1.getOwner();
        return new kotlin.reflect.jvm.internal.DescriptorKMutableProperty1(owner instanceof kotlin.reflect.jvm.internal.KDeclarationContainerImpl ? (kotlin.reflect.jvm.internal.KDeclarationContainerImpl) owner : kotlin.reflect.jvm.internal.EmptyContainerForLocal.INSTANCE, mutablePropertyReference1.getGetHighSpeedVideoFpsRanges(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KProperty2 property2(kotlin.jvm.internal.PropertyReference2 propertyReference2) {
        kotlin.reflect.KDeclarationContainer owner = propertyReference2.getOwner();
        return new kotlin.reflect.jvm.internal.DescriptorKProperty2(owner instanceof kotlin.reflect.jvm.internal.KDeclarationContainerImpl ? (kotlin.reflect.jvm.internal.KDeclarationContainerImpl) owner : kotlin.reflect.jvm.internal.EmptyContainerForLocal.INSTANCE, propertyReference2.getGetHighSpeedVideoFpsRanges(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KMutableProperty2 mutableProperty2(kotlin.jvm.internal.MutablePropertyReference2 mutablePropertyReference2) {
        kotlin.reflect.KDeclarationContainer owner = mutablePropertyReference2.getOwner();
        return new kotlin.reflect.jvm.internal.DescriptorKMutableProperty2(owner instanceof kotlin.reflect.jvm.internal.KDeclarationContainerImpl ? (kotlin.reflect.jvm.internal.KDeclarationContainerImpl) owner : kotlin.reflect.jvm.internal.EmptyContainerForLocal.INSTANCE, mutablePropertyReference2.getGetHighSpeedVideoFpsRanges(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KType typeOf(kotlin.reflect.KClassifier kClassifier, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z) {
        if (kClassifier instanceof kotlin.jvm.internal.ClassBasedDeclarationContainer) {
            return kotlin.reflect.jvm.internal.CachesKt.getOrCreateKType(((kotlin.jvm.internal.ClassBasedDeclarationContainer) kClassifier).getJClass(), list, z);
        }
        return kotlin.reflect.full.KClassifiers.createType(kClassifier, list, z, java.util.Collections.emptyList());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KTypeParameter typeParameter(java.lang.Object obj, java.lang.String str, kotlin.reflect.KVariance kVariance, boolean z) {
        java.util.List<kotlin.reflect.KTypeParameter> typeParameters;
        if (obj instanceof kotlin.reflect.KClass) {
            typeParameters = ((kotlin.reflect.KClass) obj).getTypeParameters();
        } else if (obj instanceof kotlin.reflect.KCallable) {
            typeParameters = ((kotlin.reflect.KCallable) obj).getTypeParameters();
        } else {
            throw new java.lang.IllegalArgumentException("Type parameter container must be a class or a callable: ".concat(java.lang.String.valueOf(obj)));
        }
        for (kotlin.reflect.KTypeParameter kTypeParameter : typeParameters) {
            if (kTypeParameter.getCamera2StreamConfigurationMap().equals(str)) {
                return kTypeParameter;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Type parameter ");
        sb.append(str);
        sb.append(" is not found in container: ");
        sb.append(obj);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KType platformType(kotlin.reflect.KType kType, kotlin.reflect.KType kType2) {
        return kotlin.reflect.jvm.internal.types.TypeOfImplKt.createPlatformKType(kType, kType2);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KType mutableCollectionType(kotlin.reflect.KType kType) {
        return kotlin.reflect.jvm.internal.types.TypeOfImplKt.createMutableCollectionKType(kType);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public kotlin.reflect.KType nothingType(kotlin.reflect.KType kType) {
        return kotlin.reflect.jvm.internal.types.TypeOfImplKt.createNothingType(kType);
    }

    public static void clearCaches() {
        kotlin.reflect.jvm.internal.CachesKt.clearCaches();
        kotlin.reflect.jvm.internal.ModuleByClassLoaderKt.clearModuleByClassLoaderCache();
    }
}
