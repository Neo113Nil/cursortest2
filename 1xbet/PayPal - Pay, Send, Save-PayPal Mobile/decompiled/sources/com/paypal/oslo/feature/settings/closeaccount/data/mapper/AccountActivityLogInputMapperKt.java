package com.paypal.oslo.feature.settings.closeaccount.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog;)Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog$ReferenceId;", "Lcom/paypal/oslo/api/graphql/schema/type/ReferenceIdInput;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog$ReferenceId;)Lcom/paypal/oslo/api/graphql/schema/type/ReferenceIdInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountActivityLogInputMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput toGraphQLInput(com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog accountActivityLog) {
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType safeValueOf;
        java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId> referenceIds;
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty> dataProperties;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountActivityLog, "");
        com.paypal.oslo.api.graphql.schema.type.ActivityTypeInput activityTypeInput = new com.paypal.oslo.api.graphql.schema.type.ActivityTypeInput(accountActivityLog.getActivityTypeId(), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(accountActivityLog.getActivityTypeName()));
        java.lang.String initiatorId = accountActivityLog.getInitiatorId();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String initiatorType = accountActivityLog.getInitiatorType();
        java.util.ArrayList arrayList2 = null;
        if (initiatorType != null) {
            try {
                safeValueOf = com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.INSTANCE.safeValueOf(initiatorType);
            } catch (java.lang.IllegalArgumentException e) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
                java.lang.String message = e.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid ActivityInitiatorType: ");
                sb.append(initiatorType);
                sb.append(" - ");
                sb.append(message);
                logger.w(sb.toString(), kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap());
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorInput activityInitiatorInput = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorInput(initiatorId, companion.presentIfNotNull(safeValueOf), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(accountActivityLog.getInitiatorName()), null, null, null, null, 120, null);
            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
            referenceIds = accountActivityLog.getReferenceIds();
            if (referenceIds == null) {
                java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId> list = referenceIds;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Camera2StreamConfigurationMap((com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId) it.next()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            com.apollographql.apollo.api.Optional presentIfNotNull = companion2.presentIfNotNull(arrayList);
            com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(accountActivityLog.getSummaries());
            com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
            dataProperties = accountActivityLog.getDataProperties();
            if (dataProperties != null) {
                java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty> list2 = dataProperties;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty dataProperty : list2) {
                    arrayList4.add(new com.paypal.oslo.api.graphql.schema.type.DataPropertyInput(dataProperty.getKey(), dataProperty.getValue()));
                }
                arrayList2 = arrayList4;
            }
            return new com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput(null, null, activityTypeInput, activityInitiatorInput, presentIfNotNull, presentIfNotNull2, companion3.presentIfNotNull(arrayList2), 3, null);
        }
        safeValueOf = null;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorInput activityInitiatorInput2 = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorInput(initiatorId, companion.presentIfNotNull(safeValueOf), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(accountActivityLog.getInitiatorName()), null, null, null, null, 120, null);
        com.apollographql.apollo.api.Optional.Companion companion22 = com.apollographql.apollo.api.Optional.INSTANCE;
        referenceIds = accountActivityLog.getReferenceIds();
        if (referenceIds == null) {
        }
        com.apollographql.apollo.api.Optional presentIfNotNull3 = companion22.presentIfNotNull(arrayList);
        com.apollographql.apollo.api.Optional presentIfNotNull22 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(accountActivityLog.getSummaries());
        com.apollographql.apollo.api.Optional.Companion companion32 = com.apollographql.apollo.api.Optional.INSTANCE;
        dataProperties = accountActivityLog.getDataProperties();
        if (dataProperties != null) {
        }
        return new com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput(null, null, activityTypeInput, activityInitiatorInput2, presentIfNotNull3, presentIfNotNull22, companion32.presentIfNotNull(arrayList2), 3, null);
    }

    private static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdInput Camera2StreamConfigurationMap(com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId referenceId) {
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType;
        java.lang.String id = referenceId.getId();
        try {
            referenceIdType = com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.INSTANCE.safeValueOf(referenceId.getType());
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
            java.lang.String type = referenceId.getType();
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid ReferenceIdType: ");
            sb.append(type);
            sb.append(" - ");
            sb.append(message);
            logger.w(sb.toString(), kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap());
            referenceIdType = com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.UNKNOWN__;
        }
        return new com.paypal.oslo.api.graphql.schema.type.ReferenceIdInput(id, referenceIdType);
    }
}
