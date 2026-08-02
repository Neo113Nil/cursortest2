package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SetDebitInstrumentPinInput;", "", "", "instrumentId", "pin", "Lcom/paypal/oslo/api/graphql/schema/type/DebitAcquisitionFlowIntent;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/DebitAcquisitionFlowIntent;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitAcquisitionFlowIntent;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/DebitAcquisitionFlowIntent;)Lcom/paypal/oslo/api/graphql/schema/type/SetDebitInstrumentPinInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "Ljava/lang/Object;", "getPin", "Lcom/paypal/oslo/api/graphql/schema/type/DebitAcquisitionFlowIntent;", "getFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SetDebitInstrumentPinInput {
    private final com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent flowType;
    private final java.lang.String instrumentId;
    private final java.lang.Object pin;

    public SetDebitInstrumentPinInput(java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent debitAcquisitionFlowIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitAcquisitionFlowIntent, "");
        this.instrumentId = str;
        this.pin = obj;
        this.flowType = debitAcquisitionFlowIntent;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.Object getPin() {
        return this.pin;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent getFlowType() {
        return this.flowType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        java.lang.Object obj = this.pin;
        com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent debitAcquisitionFlowIntent = this.flowType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetDebitInstrumentPinInput(instrumentId=");
        sb.append(str);
        sb.append(", pin=");
        sb.append(obj);
        sb.append(", flowType=");
        sb.append(debitAcquisitionFlowIntent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.instrumentId.hashCode() * 31) + this.pin.hashCode()) * 31) + this.flowType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput setDebitInstrumentPinInput = (com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, setDebitInstrumentPinInput.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, setDebitInstrumentPinInput.pin) && this.flowType == setDebitInstrumentPinInput.flowType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput copy(java.lang.String instrumentId, java.lang.Object pin, com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent flowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        return new com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput(instrumentId, pin, flowType);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent getFlowType() {
        return this.flowType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getPin() {
        return this.pin;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput copy$default(com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput setDebitInstrumentPinInput, java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent debitAcquisitionFlowIntent, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = setDebitInstrumentPinInput.instrumentId;
        }
        if ((i & 2) != 0) {
            obj = setDebitInstrumentPinInput.pin;
        }
        if ((i & 4) != 0) {
            debitAcquisitionFlowIntent = setDebitInstrumentPinInput.flowType;
        }
        return setDebitInstrumentPinInput.copy(str, obj, debitAcquisitionFlowIntent);
    }
}
