package io.ktor.util.converters;

/* compiled from: ConversionService.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u0004\u0018\u00010\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00072\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/util/converters/DefaultConversionService;", "Lio/ktor/util/converters/ConversionService;", "<init>", "()V", "", "value", "", "", "toValues", "(Ljava/lang/Object;)Ljava/util/List;", "values", "Lio/ktor/util/reflect/TypeInfo;", "type", "fromValues", "(Ljava/util/List;Lio/ktor/util/reflect/TypeInfo;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "klass", "fromValue", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "convertPrimitives", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Ljava/lang/Object;", "typeName", "", "throwConversionException", "(Ljava/lang/String;)Ljava/lang/Void;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultConversionService implements io.ktor.util.converters.ConversionService {
    public static final io.ktor.util.converters.DefaultConversionService INSTANCE = new io.ktor.util.converters.DefaultConversionService();

    private DefaultConversionService() {
    }

    @Override // io.ktor.util.converters.ConversionService
    public java.util.List<java.lang.String> toValues(java.lang.Object value) {
        if (value == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<java.lang.String> platformDefaultToValues = io.ktor.util.converters.ConversionServiceJvmKt.platformDefaultToValues(value);
        if (platformDefaultToValues != null) {
            return platformDefaultToValues;
        }
        if (!(value instanceof java.lang.Iterable)) {
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass());
            if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE)) || kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float.TYPE)) || kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double.TYPE)) || kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long.TYPE)) || kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Short.TYPE)) || kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Character.TYPE)) || kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE)) || kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
                return kotlin.collections.CollectionsKt.listOf(value.toString());
            }
            throw new io.ktor.util.converters.DataConversionException("Class " + orCreateKotlinClass + " is not supported in default data conversion service");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.lang.Iterable) value).iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, INSTANCE.toValues(it.next()));
        }
        return arrayList;
    }

    @Override // io.ktor.util.converters.ConversionService
    public java.lang.Object fromValues(java.util.List<java.lang.String> values, io.ktor.util.reflect.TypeInfo type) {
        java.util.List<kotlin.reflect.KTypeProjection> arguments;
        kotlin.reflect.KTypeProjection kTypeProjection;
        kotlin.reflect.KType type2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        if (values.isEmpty()) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type.getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class)) || kotlin.jvm.internal.Intrinsics.areEqual(type.getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class))) {
            kotlin.reflect.KType kotlinType = type.getKotlinType();
            java.lang.Object classifier = (kotlinType == null || (arguments = kotlinType.getArguments()) == null || (kTypeProjection = (kotlin.reflect.KTypeProjection) kotlin.collections.CollectionsKt.single((java.util.List) arguments)) == null || (type2 = kTypeProjection.getType()) == null) ? null : type2.getClassifier();
            kotlin.reflect.KClass<?> kClass = classifier instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) classifier : null;
            if (kClass != null) {
                java.util.List<java.lang.String> list = values;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(INSTANCE.fromValue((java.lang.String) it.next(), kClass));
                }
                return arrayList;
            }
        }
        if (values.isEmpty()) {
            throw new io.ktor.util.converters.DataConversionException("There are no values when trying to construct single value " + type);
        }
        if (values.size() > 1) {
            throw new io.ktor.util.converters.DataConversionException("There are multiple values when trying to construct single value " + type);
        }
        return fromValue((java.lang.String) kotlin.collections.CollectionsKt.single((java.util.List) values), type.getType());
    }

    public final java.lang.Object fromValue(java.lang.String value, kotlin.reflect.KClass<?> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
        java.lang.Object convertPrimitives = convertPrimitives(klass, value);
        if (convertPrimitives != null) {
            return convertPrimitives;
        }
        java.lang.Object platformDefaultFromValues = io.ktor.util.converters.ConversionServiceJvmKt.platformDefaultFromValues(value, klass);
        if (platformDefaultFromValues != null) {
            return platformDefaultFromValues;
        }
        throwConversionException(klass.toString());
        throw new kotlin.KotlinNothingValueException();
    }

    private final java.lang.Object convertPrimitives(kotlin.reflect.KClass<?> klass, java.lang.String value) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(klass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE))) {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(value));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(klass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float.TYPE))) {
            return java.lang.Float.valueOf(java.lang.Float.parseFloat(value));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(klass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double.TYPE))) {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(value));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(klass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long.TYPE))) {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(value));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(klass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Short.TYPE))) {
            return java.lang.Short.valueOf(java.lang.Short.parseShort(value));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(klass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Character.TYPE))) {
            return java.lang.Character.valueOf(kotlin.text.StringsKt.single(value));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(klass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE))) {
            return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(value));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(klass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
            return value;
        }
        return null;
    }

    private final java.lang.Void throwConversionException(java.lang.String typeName) {
        throw new io.ktor.util.converters.DataConversionException("Type " + typeName + " is not supported in default data conversion service");
    }
}
