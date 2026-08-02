package com.paypal.oslo.core.network.graphql.error;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/apollographql/apollo/api/Operation$Data;", "T", "", "", "criticalFields", "", "registerCriticalFields", "(Ljava/util/List;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CriticalFieldsRegistryKt {
    public static final /* synthetic */ <T extends com.apollographql.apollo.api.Operation.Data> void registerCriticalFields(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.paypal.oslo.core.network.graphql.error.CriticalFieldsRegistry criticalFieldsRegistry = com.paypal.oslo.core.network.graphql.error.CriticalFieldsRegistry.INSTANCE;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        criticalFieldsRegistry.register(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.apollographql.apollo.api.Operation.Data.class), list);
    }
}
