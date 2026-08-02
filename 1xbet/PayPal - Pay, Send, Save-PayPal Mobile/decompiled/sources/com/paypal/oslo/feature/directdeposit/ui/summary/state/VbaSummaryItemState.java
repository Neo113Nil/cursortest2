package com.paypal.oslo.feature.directdeposit.ui.summary.state;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/VbaSummaryItemState;", "", "", "routingNumber", "bankAccountNumber", "status", "directDebitStatus", "bankName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/VbaSummaryItemState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRoutingNumber", "getBankAccountNumber", "getStatus", "getDirectDebitStatus", "getBankName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class VbaSummaryItemState {
    public static final int $stable = 0;
    private final java.lang.String bankAccountNumber;
    private final java.lang.String bankName;
    private final java.lang.String directDebitStatus;
    private final java.lang.String routingNumber;
    private final java.lang.String status;

    public VbaSummaryItemState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.routingNumber = str;
        this.bankAccountNumber = str2;
        this.status = str3;
        this.directDebitStatus = str4;
        this.bankName = str5;
    }

    public final java.lang.String getRoutingNumber() {
        return this.routingNumber;
    }

    public final java.lang.String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final java.lang.String getDirectDebitStatus() {
        return this.directDebitStatus;
    }

    public /* synthetic */ VbaSummaryItemState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5);
    }

    public final java.lang.String getBankName() {
        return this.bankName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.routingNumber;
        java.lang.String str2 = this.bankAccountNumber;
        java.lang.String str3 = this.status;
        java.lang.String str4 = this.directDebitStatus;
        java.lang.String str5 = this.bankName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VbaSummaryItemState(routingNumber=");
        sb.append(str);
        sb.append(", bankAccountNumber=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(str3);
        sb.append(", directDebitStatus=");
        sb.append(str4);
        sb.append(", bankName=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.routingNumber.hashCode();
        int hashCode2 = this.bankAccountNumber.hashCode();
        int hashCode3 = this.status.hashCode();
        java.lang.String str = this.directDebitStatus;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.bankName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState)) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState vbaSummaryItemState = (com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, vbaSummaryItemState.routingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountNumber, vbaSummaryItemState.bankAccountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, vbaSummaryItemState.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.directDebitStatus, vbaSummaryItemState.directDebitStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, vbaSummaryItemState.bankName);
    }

    public final com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState copy(java.lang.String routingNumber, java.lang.String bankAccountNumber, java.lang.String status, java.lang.String directDebitStatus, java.lang.String bankName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
        return new com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState(routingNumber, bankAccountNumber, status, directDebitStatus, bankName);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getBankName() {
        return this.bankName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDirectDebitStatus() {
        return this.directDebitStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRoutingNumber() {
        return this.routingNumber;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState copy$default(com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState vbaSummaryItemState, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = vbaSummaryItemState.routingNumber;
        }
        if ((i & 2) != 0) {
            str2 = vbaSummaryItemState.bankAccountNumber;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = vbaSummaryItemState.status;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = vbaSummaryItemState.directDebitStatus;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = vbaSummaryItemState.bankName;
        }
        return vbaSummaryItemState.copy(str, str6, str7, str8, str5);
    }
}
