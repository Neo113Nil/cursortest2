package com.paypal.oslo.core.network.graphql.error;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0012\u0010\u0003R.\u0010\u0016\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CriticalFieldsRegistry;", "", "<init>", "()V", "Lkotlin/reflect/KClass;", "Lcom/apollographql/apollo/api/Operation$Data;", "dataClass", "", "", "criticalFields", "", "register", "(Lkotlin/reflect/KClass;Ljava/util/List;)V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getCriticalFields$graphql_release", "(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/util/List;", "getRegisteredFields", "(Lkotlin/reflect/KClass;)Ljava/util/List;", "clear$graphql_release", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CriticalFieldsRegistry {
    public static final com.paypal.oslo.core.network.graphql.error.CriticalFieldsRegistry INSTANCE = new com.paypal.oslo.core.network.graphql.error.CriticalFieldsRegistry();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.concurrent.ConcurrentHashMap<kotlin.reflect.KClass<? extends com.apollographql.apollo.api.Operation.Data>, java.util.List<java.lang.String>> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentHashMap<>();

    private CriticalFieldsRegistry() {
    }

    public final void register(kotlin.reflect.KClass<? extends com.apollographql.apollo.api.Operation.Data> dataClass, java.util.List<java.lang.String> criticalFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(criticalFields, "");
        getHighResolutionOutputSizeshNQ4ISI.put(dataClass, criticalFields);
    }

    public final java.util.List<java.lang.String> getCriticalFields$graphql_release(com.apollographql.apollo.api.Operation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<java.lang.String> list = getHighResolutionOutputSizeshNQ4ISI.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(data.getClass()));
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public final java.util.List<java.lang.String> getRegisteredFields(kotlin.reflect.KClass<? extends com.apollographql.apollo.api.Operation.Data> dataClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataClass, "");
        java.util.List<java.lang.String> list = getHighResolutionOutputSizeshNQ4ISI.get(dataClass);
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public final void clear$graphql_release() {
        getHighResolutionOutputSizeshNQ4ISI.clear();
    }
}
