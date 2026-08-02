package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class Reflection {
    private static final kotlin.jvm.internal.ReflectionFactory Camera2StreamConfigurationMap;
    private static final kotlin.reflect.KClass[] getHighSpeedVideoSizes;

    static {
        kotlin.jvm.internal.ReflectionFactory reflectionFactory;
        try {
            reflectionFactory = (kotlin.jvm.internal.ReflectionFactory) java.lang.Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
            reflectionFactory = null;
        }
        if (reflectionFactory == null) {
            reflectionFactory = new kotlin.jvm.internal.ReflectionFactory();
        }
        Camera2StreamConfigurationMap = reflectionFactory;
        getHighSpeedVideoSizes = new kotlin.reflect.KClass[0];
    }

    public static kotlin.reflect.KClass createKotlinClass(java.lang.Class cls) {
        return Camera2StreamConfigurationMap.createKotlinClass(cls);
    }

    public static kotlin.reflect.KClass createKotlinClass(java.lang.Class cls, java.lang.String str) {
        return Camera2StreamConfigurationMap.createKotlinClass(cls, str);
    }

    public static kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class cls) {
        return Camera2StreamConfigurationMap.getOrCreateKotlinPackage(cls, "");
    }

    public static kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class cls, java.lang.String str) {
        return Camera2StreamConfigurationMap.getOrCreateKotlinPackage(cls, str);
    }

    public static kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class cls) {
        return Camera2StreamConfigurationMap.getOrCreateKotlinClass(cls);
    }

    public static kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class cls, java.lang.String str) {
        return Camera2StreamConfigurationMap.getOrCreateKotlinClass(cls, str);
    }

    public static kotlin.reflect.KClass[] getOrCreateKotlinClasses(java.lang.Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return getHighSpeedVideoSizes;
        }
        kotlin.reflect.KClass[] kClassArr = new kotlin.reflect.KClass[length];
        for (int i = 0; i < length; i++) {
            kClassArr[i] = getOrCreateKotlinClass(clsArr[i]);
        }
        return kClassArr;
    }

    public static java.lang.String renderLambdaToString(kotlin.jvm.internal.Lambda lambda) {
        return Camera2StreamConfigurationMap.renderLambdaToString(lambda);
    }

    public static java.lang.String renderLambdaToString(kotlin.jvm.internal.FunctionBase functionBase) {
        return Camera2StreamConfigurationMap.renderLambdaToString(functionBase);
    }

    public static kotlin.reflect.KFunction function(kotlin.jvm.internal.FunctionReference functionReference) {
        return Camera2StreamConfigurationMap.function(functionReference);
    }

    public static kotlin.reflect.KProperty0 property0(kotlin.jvm.internal.PropertyReference0 propertyReference0) {
        return Camera2StreamConfigurationMap.property0(propertyReference0);
    }

    public static kotlin.reflect.KMutableProperty0 mutableProperty0(kotlin.jvm.internal.MutablePropertyReference0 mutablePropertyReference0) {
        return Camera2StreamConfigurationMap.mutableProperty0(mutablePropertyReference0);
    }

    public static kotlin.reflect.KProperty1 property1(kotlin.jvm.internal.PropertyReference1 propertyReference1) {
        return Camera2StreamConfigurationMap.property1(propertyReference1);
    }

    public static kotlin.reflect.KMutableProperty1 mutableProperty1(kotlin.jvm.internal.MutablePropertyReference1 mutablePropertyReference1) {
        return Camera2StreamConfigurationMap.mutableProperty1(mutablePropertyReference1);
    }

    public static kotlin.reflect.KProperty2 property2(kotlin.jvm.internal.PropertyReference2 propertyReference2) {
        return Camera2StreamConfigurationMap.property2(propertyReference2);
    }

    public static kotlin.reflect.KMutableProperty2 mutableProperty2(kotlin.jvm.internal.MutablePropertyReference2 mutablePropertyReference2) {
        return Camera2StreamConfigurationMap.mutableProperty2(mutablePropertyReference2);
    }

    public static kotlin.reflect.KType typeOf(kotlin.reflect.KClassifier kClassifier) {
        return Camera2StreamConfigurationMap.typeOf(kClassifier, java.util.Collections.emptyList(), false);
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class cls) {
        return Camera2StreamConfigurationMap.typeOf(getOrCreateKotlinClass(cls), java.util.Collections.emptyList(), false);
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection kTypeProjection) {
        return Camera2StreamConfigurationMap.typeOf(getOrCreateKotlinClass(cls), java.util.Collections.singletonList(kTypeProjection), false);
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection kTypeProjection, kotlin.reflect.KTypeProjection kTypeProjection2) {
        return Camera2StreamConfigurationMap.typeOf(getOrCreateKotlinClass(cls), java.util.Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection... kTypeProjectionArr) {
        return Camera2StreamConfigurationMap.typeOf(getOrCreateKotlinClass(cls), kotlin.collections.ArraysKt.toList(kTypeProjectionArr), false);
    }

    public static kotlin.reflect.KType nullableTypeOf(kotlin.reflect.KClassifier kClassifier) {
        return Camera2StreamConfigurationMap.typeOf(kClassifier, java.util.Collections.emptyList(), true);
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class cls) {
        return Camera2StreamConfigurationMap.typeOf(getOrCreateKotlinClass(cls), java.util.Collections.emptyList(), true);
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection kTypeProjection) {
        return Camera2StreamConfigurationMap.typeOf(getOrCreateKotlinClass(cls), java.util.Collections.singletonList(kTypeProjection), true);
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection kTypeProjection, kotlin.reflect.KTypeProjection kTypeProjection2) {
        return Camera2StreamConfigurationMap.typeOf(getOrCreateKotlinClass(cls), java.util.Arrays.asList(kTypeProjection, kTypeProjection2), true);
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection... kTypeProjectionArr) {
        return Camera2StreamConfigurationMap.typeOf(getOrCreateKotlinClass(cls), kotlin.collections.ArraysKt.toList(kTypeProjectionArr), true);
    }

    public static kotlin.reflect.KTypeParameter typeParameter(java.lang.Object obj, java.lang.String str, kotlin.reflect.KVariance kVariance, boolean z) {
        return Camera2StreamConfigurationMap.typeParameter(obj, str, kVariance, z);
    }

    public static void setUpperBounds(kotlin.reflect.KTypeParameter kTypeParameter, kotlin.reflect.KType kType) {
        Camera2StreamConfigurationMap.setUpperBounds(kTypeParameter, java.util.Collections.singletonList(kType));
    }

    public static void setUpperBounds(kotlin.reflect.KTypeParameter kTypeParameter, kotlin.reflect.KType... kTypeArr) {
        Camera2StreamConfigurationMap.setUpperBounds(kTypeParameter, kotlin.collections.ArraysKt.toList(kTypeArr));
    }

    public static kotlin.reflect.KType platformType(kotlin.reflect.KType kType, kotlin.reflect.KType kType2) {
        return Camera2StreamConfigurationMap.platformType(kType, kType2);
    }

    public static kotlin.reflect.KType mutableCollectionType(kotlin.reflect.KType kType) {
        return Camera2StreamConfigurationMap.mutableCollectionType(kType);
    }

    public static kotlin.reflect.KType nothingType(kotlin.reflect.KType kType) {
        return Camera2StreamConfigurationMap.nothingType(kType);
    }
}
