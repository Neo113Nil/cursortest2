package com.paypal.oslo.feature.settings.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b!\"#$%&' B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "SavingsGoal", "Item", "TransferSettings", "SavingsNonGoal", "Item1", "TransferSettings1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutoSaveStatusesForPayPalSavingsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Companion INSTANCE = new com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "96bf7b1e8d534e4b6d949b380288b78a750dd4866c0a5d64e6c09559b3713dbe";
    public static final java.lang.String OPERATION_NAME = "AutoSaveStatusesForPayPalSavings";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.settings.graphql.adapter.AutoSaveStatusesForPayPalSavingsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.settings.graphql.selections.AutoSaveStatusesForPayPalSavingsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsGoal;", "savingsGoal", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsNonGoal;", "savingsNonGoal", "<init>", "(Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsGoal;Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsNonGoal;)V", "component1", "()Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsGoal;", "component2", "()Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsNonGoal;", "copy", "(Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsGoal;Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsNonGoal;)Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsGoal;", "getSavingsGoal", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsNonGoal;", "getSavingsNonGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal savingsGoal;
        private final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal savingsNonGoal;

        public Data(com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal savingsGoal, com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal savingsNonGoal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsGoal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsNonGoal, "");
            this.savingsGoal = savingsGoal;
            this.savingsNonGoal = savingsNonGoal;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal getSavingsGoal() {
            return this.savingsGoal;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal getSavingsNonGoal() {
            return this.savingsNonGoal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal savingsGoal = this.savingsGoal;
            com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal savingsNonGoal = this.savingsNonGoal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(savingsGoal=");
            sb.append(savingsGoal);
            sb.append(", savingsNonGoal=");
            sb.append(savingsNonGoal);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.savingsGoal.hashCode() * 31) + this.savingsNonGoal.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data data = (com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.savingsGoal, data.savingsGoal) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsNonGoal, data.savingsNonGoal);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data copy(com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal savingsGoal, com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal savingsNonGoal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsGoal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsNonGoal, "");
            return new com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data(savingsGoal, savingsNonGoal);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal getSavingsNonGoal() {
            return this.savingsNonGoal;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal getSavingsGoal() {
            return this.savingsGoal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data copy$default(com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data data, com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal savingsGoal, com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal savingsNonGoal, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsGoal = data.savingsGoal;
            }
            if ((i & 2) != 0) {
                savingsNonGoal = data.savingsNonGoal;
            }
            return data.copy(savingsGoal, savingsNonGoal);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsGoal;", "", "", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsGoal;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsGoal {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item> items;

        public SavingsGoal(java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsGoal(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal) other).items);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal copy(java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal(items);
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal copy$default(com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal savingsGoal, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = savingsGoal.items;
            }
            return savingsGoal.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$Item;", "", "", "name", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings;", "transferSettings", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings;)Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings;", "getTransferSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings transferSettings;

        public Item(java.lang.String str, com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings transferSettings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.transferSettings = transferSettings;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings getTransferSettings() {
            return this.transferSettings;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings transferSettings = this.transferSettings;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(name=");
            sb.append(str);
            sb.append(", transferSettings=");
            sb.append(transferSettings);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings transferSettings = this.transferSettings;
            return (hashCode * 31) + (transferSettings == null ? 0 : transferSettings.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item item = (com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferSettings, item.transferSettings);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item copy(java.lang.String name2, com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings transferSettings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item(name2, transferSettings);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings getTransferSettings() {
            return this.transferSettings;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item copy$default(com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item item, java.lang.String str, com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings transferSettings, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.name;
            }
            if ((i & 2) != 0) {
                transferSettings = item.transferSettings;
            }
            return item.copy(str, transferSettings);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings;", "", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;)Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferSettings {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus status;

        public TransferSettings(com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxScheduleStatus, "");
            this.status = moneyboxScheduleStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferSettings(status=");
            sb.append(moneyboxScheduleStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings) && this.status == ((com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings) other).status;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings copy(com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings(status);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings copy$default(com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings transferSettings, com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moneyboxScheduleStatus = transferSettings.status;
            }
            return transferSettings.copy(moneyboxScheduleStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsNonGoal;", "", "", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$Item1;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$SavingsNonGoal;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsNonGoal {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1> items;

        public SavingsNonGoal(java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsNonGoal(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal) other).items);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal copy(java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal(items);
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal copy$default(com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal savingsNonGoal, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = savingsNonGoal.items;
            }
            return savingsNonGoal.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$Item1;", "", "", "name", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings1;", "transferSettings", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings1;)Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$Item1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings1;", "getTransferSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item1 {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 transferSettings;

        public Item1(java.lang.String str, com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 transferSettings1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.transferSettings = transferSettings1;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 getTransferSettings() {
            return this.transferSettings;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 transferSettings1 = this.transferSettings;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item1(name=");
            sb.append(str);
            sb.append(", transferSettings=");
            sb.append(transferSettings1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 transferSettings1 = this.transferSettings;
            return (hashCode * 31) + (transferSettings1 == null ? 0 : transferSettings1.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1 item1 = (com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, item1.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferSettings, item1.transferSettings);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1 copy(java.lang.String name2, com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 transferSettings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1(name2, transferSettings);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 getTransferSettings() {
            return this.transferSettings;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1 copy$default(com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1 item1, java.lang.String str, com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 transferSettings1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item1.name;
            }
            if ((i & 2) != 0) {
                transferSettings1 = item1.transferSettings;
            }
            return item1.copy(str, transferSettings1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings1;", "", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;)Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$TransferSettings1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferSettings1 {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus status;

        public TransferSettings1(com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxScheduleStatus, "");
            this.status = moneyboxScheduleStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferSettings1(status=");
            sb.append(moneyboxScheduleStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1) && this.status == ((com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1) other).status;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 copy(com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1(status);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 copy$default(com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 transferSettings1, com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moneyboxScheduleStatus = transferSettings1.status;
            }
            return transferSettings1.copy(moneyboxScheduleStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutoSaveStatusesForPayPalSavingsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query AutoSaveStatusesForPayPalSavings { savingsGoal: moneyboxes(input: { filters: { category: SAVINGS_GOAL }  } ) { items { name transferSettings { status } } } savingsNonGoal: moneyboxes(input: { filters: { category: SAVINGS_NON_GOAL }  } ) { items { name transferSettings { status } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
