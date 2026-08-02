package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxTransferScheduleInput;", "", "", "moneyboxId", "scheduleId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxTransferScheduleInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMoneyboxId", "getScheduleId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeleteMoneyboxTransferScheduleInput {
    private final java.lang.String moneyboxId;
    private final java.lang.String scheduleId;

    public DeleteMoneyboxTransferScheduleInput(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.moneyboxId = str;
        this.scheduleId = str2;
    }

    public final java.lang.String getMoneyboxId() {
        return this.moneyboxId;
    }

    public final java.lang.String getScheduleId() {
        return this.scheduleId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.moneyboxId;
        java.lang.String str2 = this.scheduleId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteMoneyboxTransferScheduleInput(moneyboxId=");
        sb.append(str);
        sb.append(", scheduleId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.moneyboxId.hashCode() * 31) + this.scheduleId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput deleteMoneyboxTransferScheduleInput = (com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxId, deleteMoneyboxTransferScheduleInput.moneyboxId) && kotlin.jvm.internal.Intrinsics.areEqual(this.scheduleId, deleteMoneyboxTransferScheduleInput.scheduleId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput copy(java.lang.String moneyboxId, java.lang.String scheduleId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduleId, "");
        return new com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput(moneyboxId, scheduleId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getScheduleId() {
        return this.scheduleId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMoneyboxId() {
        return this.moneyboxId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput copy$default(com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput deleteMoneyboxTransferScheduleInput, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deleteMoneyboxTransferScheduleInput.moneyboxId;
        }
        if ((i & 2) != 0) {
            str2 = deleteMoneyboxTransferScheduleInput.scheduleId;
        }
        return deleteMoneyboxTransferScheduleInput.copy(str, str2);
    }
}
