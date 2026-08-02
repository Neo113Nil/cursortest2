package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "ActivityItemFragment", "Counterparty", "AmountInfo", "Avatar", "Reward", "Action", "ShipmentPackage", "Flags", "Partner", "RedeemedReward", "Subdomain"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityItemFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$ActivityItemFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityItemFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.ActivityItemFragment INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.ActivityItemFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "groupId", "invoiceId", "createdTime", "displayDateFormat", "displayStatus", "moneyMovementDirection", "counterparty", "shortDescription", "amountInfo", "avatar", "channels", "purposes", "systemNote", "userNote", "transactionNote", "etaNote", "status", "type", "reward", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "shipmentPackages", "flags", "partner", "redeemedRewards", "subdomain"});
        public static final int $stable = 8;

        private ActivityItemFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
        
            if (r13 == null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
        
            if (r14 == null) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
        
            if (r21 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            if (r22 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x020c, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r31, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0217, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0218, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r31, "status");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0223, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0224, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r31, "avatar");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x022e, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x022f, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r31, "amountInfo");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0239, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x023a, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r31, "shortDescription");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0245, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0246, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r31, "counterparty");
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0250, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0251, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r31, "displayDateFormat");
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x025b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x025c, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r31, "createdTime");
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0266, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0267, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r31, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0271, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
        
            if (r4 == null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
        
            if (r7 == null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
        
            if (r8 == null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
        
            if (r11 == null) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
        
            if (r12 == null) goto L50;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.Object obj = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection = null;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Counterparty counterparty = null;
            java.lang.String str6 = null;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.AmountInfo amountInfo = null;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Avatar avatar = null;
            java.util.List list = null;
            java.util.List list2 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus = null;
            com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = null;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Reward reward = null;
            java.util.List list3 = null;
            java.util.List list4 = null;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Flags flags = null;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Partner partner = null;
            java.util.List list5 = null;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Subdomain subdomain = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        moneyMovementDirection = (com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.MoneyMovementDirection_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        counterparty = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Counterparty) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Counterparty.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str6 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        amountInfo = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.AmountInfo) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.AmountInfo.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        avatar = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Avatar) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Avatar.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityChannel_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityPurpose_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        str7 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        str8 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 15:
                        str9 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 16:
                        str10 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 17:
                        activityStatus = com.paypal.oslo.api.graphql.schema.type.adapter.ActivityStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 18:
                        activityType = com.paypal.oslo.api.graphql.schema.type.adapter.ActivityType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 19:
                        reward = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Reward) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Reward.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 20:
                        list3 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Action.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 21:
                        list4 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.ShipmentPackage.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 22:
                        flags = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Flags) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Flags.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 23:
                        partner = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Partner) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Partner.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 24:
                        list5 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.RedeemedReward.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 25:
                        subdomain = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Subdomain) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Subdomain.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("groupId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getGroupId());
            writer.name("invoiceId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getInvoiceId());
            writer.name("createdTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCreatedTime());
            writer.name("displayDateFormat");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getDisplayDateFormat());
            writer.name("displayStatus");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDisplayStatus());
            writer.name("moneyMovementDirection");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.MoneyMovementDirection_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getMoneyMovementDirection());
            writer.name("counterparty");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Counterparty.INSTANCE, true).toJson(writer, customScalarAdapters, value.getCounterparty());
            writer.name("shortDescription");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getShortDescription());
            writer.name("amountInfo");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.AmountInfo.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAmountInfo());
            writer.name("avatar");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Avatar.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAvatar());
            writer.name("channels");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityChannel_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getChannels());
            writer.name("purposes");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityPurpose_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getPurposes());
            writer.name("systemNote");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSystemNote());
            writer.name("userNote");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getUserNote());
            writer.name("transactionNote");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getTransactionNote());
            writer.name("etaNote");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getEtaNote());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.ActivityStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.ActivityType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("reward");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Reward.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getReward());
            writer.name(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Action.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getActions());
            writer.name("shipmentPackages");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.ShipmentPackage.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getShipmentPackages());
            writer.name("flags");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Flags.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getFlags());
            writer.name("partner");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Partner.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getPartner());
            writer.name("redeemedRewards");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.RedeemedReward.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getRedeemedRewards());
            writer.name("subdomain");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Subdomain.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getSubdomain());
        }
    }

    private ActivityItemFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$Counterparty;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Counterparty;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Counterparty;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Counterparty;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Counterparty implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Counterparty> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Counterparty INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Counterparty();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Counterparty() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Counterparty fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragmentImpl_ResponseAdapter.ActivityCounterpartyDetailFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Counterparty(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Counterparty value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragmentImpl_ResponseAdapter.ActivityCounterpartyDetailFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityCounterpartyDetailFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$AmountInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$AmountInfo;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$AmountInfo;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$AmountInfo;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmountInfo implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.AmountInfo> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.AmountInfo INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.AmountInfo();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AmountInfo() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.AmountInfo fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragmentImpl_ResponseAdapter.ActivityAmountInfoFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.AmountInfo(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.AmountInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragmentImpl_ResponseAdapter.ActivityAmountInfoFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityAmountInfoFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$Avatar;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Avatar;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Avatar;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Avatar;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Avatar implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Avatar> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Avatar INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Avatar();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Avatar() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Avatar fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragmentImpl_ResponseAdapter.ActivityAvatarDetailFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Avatar(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Avatar value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragmentImpl_ResponseAdapter.ActivityAvatarDetailFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityAvatarDetailFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$Reward;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Reward;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Reward;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Reward;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Reward implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Reward> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Reward INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Reward();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Reward() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Reward fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragmentImpl_ResponseAdapter.ActivityRewardDetailFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Reward(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Reward value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragmentImpl_ResponseAdapter.ActivityRewardDetailFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityRewardDetailFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Action;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Action;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Action;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Action> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Action INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Action();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Action() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Action fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragmentImpl_ResponseAdapter.ActivityActionsFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Action(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Action value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragmentImpl_ResponseAdapter.ActivityActionsFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityActionsFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$ShipmentPackage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$ShipmentPackage;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$ShipmentPackage;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$ShipmentPackage;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ShipmentPackage implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.ShipmentPackage> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.ShipmentPackage INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.ShipmentPackage();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ShipmentPackage() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.ShipmentPackage fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragmentImpl_ResponseAdapter.ActivityShipmentPackageItemFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.ShipmentPackage(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.ShipmentPackage value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragmentImpl_ResponseAdapter.ActivityShipmentPackageItemFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityShipmentPackageItemFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$Flags;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Flags;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Flags;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Flags;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Flags implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Flags> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Flags INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Flags();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Flags() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Flags fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragmentImpl_ResponseAdapter.ActivityFlagsFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Flags(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Flags value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragmentImpl_ResponseAdapter.ActivityFlagsFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityFlagsFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$Partner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Partner;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Partner;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Partner;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Partner implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Partner> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Partner INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Partner();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Partner() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Partner fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragmentImpl_ResponseAdapter.ActivityPartnerFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Partner(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Partner value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragmentImpl_ResponseAdapter.ActivityPartnerFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityPartnerFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$RedeemedReward;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$RedeemedReward;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$RedeemedReward;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$RedeemedReward;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RedeemedReward implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.RedeemedReward> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.RedeemedReward INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.RedeemedReward();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private RedeemedReward() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.RedeemedReward fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragmentImpl_ResponseAdapter.RedeemedRewardFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.RedeemedReward(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.RedeemedReward value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragmentImpl_ResponseAdapter.RedeemedRewardFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRedeemedRewardFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragmentImpl_ResponseAdapter$Subdomain;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Subdomain;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Subdomain;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment$Subdomain;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Subdomain implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Subdomain> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Subdomain INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragmentImpl_ResponseAdapter.Subdomain();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Subdomain() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Subdomain fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivitySubdomainFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivitySubdomainFragmentImpl_ResponseAdapter.ActivitySubdomainFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Subdomain(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Subdomain value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivitySubdomainFragmentImpl_ResponseAdapter.ActivitySubdomainFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivitySubdomainFragment());
        }
    }
}
