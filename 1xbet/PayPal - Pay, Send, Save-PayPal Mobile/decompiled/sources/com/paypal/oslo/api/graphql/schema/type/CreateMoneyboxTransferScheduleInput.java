package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateMoneyboxTransferScheduleInput;", "", "", "moneyboxId", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;", "transferSettings", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;)Lcom/paypal/oslo/api/graphql/schema/type/CreateMoneyboxTransferScheduleInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMoneyboxId", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;", "getTransferSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateMoneyboxTransferScheduleInput {
    private final java.lang.String moneyboxId;
    private final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput transferSettings;

    public CreateMoneyboxTransferScheduleInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxTransferSettingsInput, "");
        this.moneyboxId = str;
        this.transferSettings = moneyboxTransferSettingsInput;
    }

    public final java.lang.String getMoneyboxId() {
        return this.moneyboxId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput getTransferSettings() {
        return this.transferSettings;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.moneyboxId;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput = this.transferSettings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateMoneyboxTransferScheduleInput(moneyboxId=");
        sb.append(str);
        sb.append(", transferSettings=");
        sb.append(moneyboxTransferSettingsInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.moneyboxId.hashCode() * 31) + this.transferSettings.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreateMoneyboxTransferScheduleInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreateMoneyboxTransferScheduleInput createMoneyboxTransferScheduleInput = (com.paypal.oslo.api.graphql.schema.type.CreateMoneyboxTransferScheduleInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxId, createMoneyboxTransferScheduleInput.moneyboxId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferSettings, createMoneyboxTransferScheduleInput.transferSettings);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateMoneyboxTransferScheduleInput copy(java.lang.String moneyboxId, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput transferSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSettings, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateMoneyboxTransferScheduleInput(moneyboxId, transferSettings);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput getTransferSettings() {
        return this.transferSettings;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMoneyboxId() {
        return this.moneyboxId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreateMoneyboxTransferScheduleInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreateMoneyboxTransferScheduleInput createMoneyboxTransferScheduleInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = createMoneyboxTransferScheduleInput.moneyboxId;
        }
        if ((i & 2) != 0) {
            moneyboxTransferSettingsInput = createMoneyboxTransferScheduleInput.transferSettings;
        }
        return createMoneyboxTransferScheduleInput.copy(str, moneyboxTransferSettingsInput);
    }
}
