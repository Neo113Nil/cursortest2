package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxTransferScheduleInput;", "", "", "moneyboxId", "scheduleId", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;", "transferSettings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxTransferScheduleInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMoneyboxId", "getScheduleId", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;", "getTransferSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateMoneyboxTransferScheduleInput {
    private final java.lang.String moneyboxId;
    private final java.lang.String scheduleId;
    private final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput transferSettings;

    public UpdateMoneyboxTransferScheduleInput(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxTransferSettingsInput, "");
        this.moneyboxId = str;
        this.scheduleId = str2;
        this.transferSettings = moneyboxTransferSettingsInput;
    }

    public final java.lang.String getMoneyboxId() {
        return this.moneyboxId;
    }

    public final java.lang.String getScheduleId() {
        return this.scheduleId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput getTransferSettings() {
        return this.transferSettings;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.moneyboxId;
        java.lang.String str2 = this.scheduleId;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput = this.transferSettings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateMoneyboxTransferScheduleInput(moneyboxId=");
        sb.append(str);
        sb.append(", scheduleId=");
        sb.append(str2);
        sb.append(", transferSettings=");
        sb.append(moneyboxTransferSettingsInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.moneyboxId.hashCode() * 31) + this.scheduleId.hashCode()) * 31) + this.transferSettings.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput updateMoneyboxTransferScheduleInput = (com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxId, updateMoneyboxTransferScheduleInput.moneyboxId) && kotlin.jvm.internal.Intrinsics.areEqual(this.scheduleId, updateMoneyboxTransferScheduleInput.scheduleId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferSettings, updateMoneyboxTransferScheduleInput.transferSettings);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput copy(java.lang.String moneyboxId, java.lang.String scheduleId, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput transferSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduleId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSettings, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput(moneyboxId, scheduleId, transferSettings);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput getTransferSettings() {
        return this.transferSettings;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getScheduleId() {
        return this.scheduleId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMoneyboxId() {
        return this.moneyboxId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput updateMoneyboxTransferScheduleInput, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updateMoneyboxTransferScheduleInput.moneyboxId;
        }
        if ((i & 2) != 0) {
            str2 = updateMoneyboxTransferScheduleInput.scheduleId;
        }
        if ((i & 4) != 0) {
            moneyboxTransferSettingsInput = updateMoneyboxTransferScheduleInput.transferSettings;
        }
        return updateMoneyboxTransferScheduleInput.copy(str, str2, moneyboxTransferSettingsInput);
    }
}
