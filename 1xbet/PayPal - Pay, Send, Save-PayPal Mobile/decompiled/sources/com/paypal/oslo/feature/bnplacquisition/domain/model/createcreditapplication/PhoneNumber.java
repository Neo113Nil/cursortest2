package com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/PhoneNumber;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/PhoneType;", "type", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/PhoneType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/PhoneType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/PhoneType;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/PhoneNumber;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/PhoneType;", "getType", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PhoneNumber {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType type;
    private final java.lang.String value;

    public PhoneNumber(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType phoneType, java.lang.String str) {
        this.type = phoneType;
        this.value = str;
    }

    public /* synthetic */ PhoneNumber(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType phoneType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : phoneType, (i & 2) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType getType() {
        return this.type;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType phoneType = this.type;
        java.lang.String str = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneNumber(type=");
        sb.append(phoneType);
        sb.append(", value=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType phoneType = this.type;
        int hashCode = phoneType == null ? 0 : phoneType.hashCode();
        java.lang.String str = this.value;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber phoneNumber = (com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber) other;
        return this.type == phoneNumber.type && kotlin.jvm.internal.Intrinsics.areEqual(this.value, phoneNumber.value);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType type, java.lang.String value) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber(type, value);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber phoneNumber, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType phoneType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            phoneType = phoneNumber.type;
        }
        if ((i & 2) != 0) {
            str = phoneNumber.value;
        }
        return phoneNumber.copy(phoneType, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneNumber() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
