package io.ktor.serialization.kotlinx;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0003*\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "Lkotlinx/serialization/KSerializer;", "serializerForTypeInfo", "(Lkotlinx/serialization/modules/SerializersModule;Lio/ktor/util/reflect/TypeInfo;)Lkotlinx/serialization/KSerializer;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "guessSerializer", "(Ljava/lang/Object;Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/KSerializer;", "", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/Collection;Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/KSerializer;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerializerLookupKt {
    @kotlinx.serialization.ExperimentalSerializationApi
    @kotlinx.serialization.InternalSerializationApi
    public static final kotlinx.serialization.KSerializer<?> serializerForTypeInfo(kotlinx.serialization.modules.SerializersModule serializersModule, io.ktor.util.reflect.TypeInfo typeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeInfo, "");
        kotlin.reflect.KType kotlinType = typeInfo.getKotlinType();
        if (kotlinType != null) {
            kotlinx.serialization.KSerializer<?> serializerOrNull = kotlinType.getArguments().isEmpty() ? null : kotlinx.serialization.SerializersKt.serializerOrNull(serializersModule, kotlinType);
            if (serializerOrNull != null) {
                return serializerOrNull;
            }
        }
        kotlinx.serialization.KSerializer<?> contextual$default = kotlinx.serialization.modules.SerializersModule.getContextual$default(serializersModule, typeInfo.getType(), null, 2, null);
        if (contextual$default == null) {
            kotlinx.serialization.KSerializer<?> serializer = kotlinx.serialization.SerializersKt.serializer(typeInfo.getType());
            kotlin.reflect.KType kotlinType2 = typeInfo.getKotlinType();
            return (kotlinType2 == null || !kotlinType2.getIsMarkedNullable()) ? serializer : kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(serializer);
        }
        kotlin.reflect.KType kotlinType3 = typeInfo.getKotlinType();
        return (kotlinType3 == null || !kotlinType3.getIsMarkedNullable()) ? contextual$default : kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(contextual$default);
    }

    @io.ktor.utils.io.InternalAPI
    public static final kotlinx.serialization.KSerializer<java.lang.Object> guessSerializer(java.lang.Object obj, kotlinx.serialization.modules.SerializersModule serializersModule) {
        kotlinx.serialization.KSerializer<java.lang.Object> serializer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        if (obj == null) {
            serializer = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE));
        } else if (obj instanceof java.util.List) {
            serializer = kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(getHighSpeedVideoFpsRangesFor((java.util.Collection) obj, serializersModule));
        } else if (obj instanceof java.lang.Object[]) {
            java.lang.Object firstOrNull = kotlin.collections.ArraysKt.firstOrNull((java.lang.Object[]) obj);
            if (firstOrNull == null || (serializer = guessSerializer(firstOrNull, serializersModule)) == null) {
                serializer = kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE));
            }
        } else if (obj instanceof java.util.Set) {
            serializer = kotlinx.serialization.builtins.BuiltinSerializersKt.SetSerializer(getHighSpeedVideoFpsRangesFor((java.util.Collection) obj, serializersModule));
        } else if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            serializer = kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(getHighSpeedVideoFpsRangesFor(map.keySet(), serializersModule), getHighSpeedVideoFpsRangesFor(map.values(), serializersModule));
        } else {
            kotlinx.serialization.KSerializer<java.lang.Object> contextual$default = kotlinx.serialization.modules.SerializersModule.getContextual$default(serializersModule, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()), null, 2, null);
            serializer = contextual$default == null ? kotlinx.serialization.SerializersKt.serializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass())) : contextual$default;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "");
        return serializer;
    }

    private static final kotlinx.serialization.KSerializer<?> getHighSpeedVideoFpsRangesFor(java.util.Collection<?> collection, kotlinx.serialization.modules.SerializersModule serializersModule) {
        java.util.Collection<?> collection2 = collection;
        java.util.List filterNotNull = kotlin.collections.CollectionsKt.filterNotNull(collection2);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(filterNotNull, 10));
        java.util.Iterator it = filterNotNull.iterator();
        while (it.hasNext()) {
            arrayList.add(guessSerializer(it.next(), serializersModule));
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (hashSet.add(((kotlinx.serialization.KSerializer) obj).getDescriptor().getGetHighSpeedVideoSizes())) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        if (arrayList3.size() > 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            java.util.ArrayList arrayList4 = arrayList3;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            java.util.Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((kotlinx.serialization.KSerializer) it2.next()).getDescriptor().getGetHighSpeedVideoSizes());
            }
            sb.append(arrayList5);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        kotlinx.serialization.KSerializer<java.lang.String> kSerializer = (kotlinx.serialization.KSerializer) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) arrayList3);
        if (kSerializer == null) {
            kSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE);
        }
        if (kSerializer.getDescriptor().isNullable()) {
            return kSerializer;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(kSerializer, "");
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
            return kSerializer;
        }
        java.util.Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            if (it3.next() == null) {
                return kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kSerializer);
            }
        }
        return kSerializer;
    }
}
