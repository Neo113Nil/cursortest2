package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* loaded from: classes5.dex */
public final class ProtoTypeTableUtilKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> supertypes(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r3, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> supertypeList = r3.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList != null) {
            return supertypeList;
        }
        java.util.List<java.lang.Integer> supertypeIdList = r3.getSupertypeIdList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypeIdList, "");
        java.util.List<java.lang.Integer> list = supertypeIdList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.lang.Integer num : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            arrayList.add(typeTable.get(num.intValue()));
        }
        return arrayList;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type inlineClassUnderlyingType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r1, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (r1.hasInlineClassUnderlyingType()) {
            return r1.getInlineClassUnderlyingType();
        }
        if (r1.hasInlineClassUnderlyingTypeId()) {
            return typeTable.get(r1.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(argument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.get(argument.getTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type flexibleUpperBound(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return typeTable.get(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> upperBounds(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList != null) {
            return upperBoundList;
        }
        java.util.List<java.lang.Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBoundIdList, "");
        java.util.List<java.lang.Integer> list = upperBoundIdList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.lang.Integer num : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            arrayList.add(typeTable.get(num.intValue()));
        }
        return arrayList;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (function.hasReturnType()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType = function.getReturnType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
            return returnType;
        }
        if (function.hasReturnTypeId()) {
            return typeTable.get(function.getReturnTypeId());
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final boolean hasReceiver(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.get(function.getReceiverTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (property.hasReturnType()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType = property.getReturnType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
            return returnType;
        }
        if (property.hasReturnTypeId()) {
            return typeTable.get(property.getReturnTypeId());
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final boolean hasReceiver(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type receiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.get(property.getReceiverTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (valueParameter.hasType()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = valueParameter.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            return type;
        }
        if (valueParameter.hasTypeId()) {
            return typeTable.get(valueParameter.getTypeId());
        }
        throw new java.lang.IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type varargElementType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.get(valueParameter.getVarargElementTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type outerType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return typeTable.get(type.getOuterTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type abbreviatedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return typeTable.get(type.getAbbreviatedTypeId());
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type underlyingType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAlias, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (typeAlias.hasUnderlyingType()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(underlyingType, "");
            return underlyingType;
        }
        if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.get(typeAlias.getUnderlyingTypeId());
        }
        throw new java.lang.IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type expandedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAlias, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (typeAlias.hasExpandedType()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(expandedType, "");
            return expandedType;
        }
        if (typeAlias.hasExpandedTypeId()) {
            return typeTable.get(typeAlias.getExpandedTypeId());
        }
        throw new java.lang.IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type isInstanceType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        if (expression.hasIsInstanceType()) {
            return expression.getIsInstanceType();
        }
        if (expression.hasIsInstanceTypeId()) {
            return typeTable.get(expression.getIsInstanceTypeId());
        }
        return null;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypes(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r3, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypeList = r3.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList != null) {
            return contextReceiverTypeList;
        }
        java.util.List<java.lang.Integer> contextReceiverTypeIdList = r3.getContextReceiverTypeIdList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "");
        java.util.List<java.lang.Integer> list = contextReceiverTypeIdList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.lang.Integer num : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            arrayList.add(typeTable.get(num.intValue()));
        }
        return arrayList;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypes(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList != null) {
            return contextReceiverTypeList;
        }
        java.util.List<java.lang.Integer> contextReceiverTypeIdList = function.getContextReceiverTypeIdList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "");
        java.util.List<java.lang.Integer> list = contextReceiverTypeIdList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.lang.Integer num : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            arrayList.add(typeTable.get(num.intValue()));
        }
        return arrayList;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypes(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList != null) {
            return contextReceiverTypeList;
        }
        java.util.List<java.lang.Integer> contextReceiverTypeIdList = property.getContextReceiverTypeIdList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "");
        java.util.List<java.lang.Integer> list = contextReceiverTypeIdList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.lang.Integer num : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            arrayList.add(typeTable.get(num.intValue()));
        }
        return arrayList;
    }
}
