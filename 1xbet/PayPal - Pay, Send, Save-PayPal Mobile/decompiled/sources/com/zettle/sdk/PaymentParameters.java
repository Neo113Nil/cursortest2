package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001<BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\\\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u0010\u001dR\u0011\u00102\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001b"}, d2 = {"Lcom/zettle/sdk/PaymentParameters;", "", "Lcom/zettle/sdk/TotalAmounts;", "amounts", "Ljava/util/UUID;", "authorizationRequestId", "Lcom/zettle/sdk/SoftDescriptor;", "softDescriptor", "Lcom/zettle/sdk/PaymentIntent;", "paymentIntent", "Lcom/zettle/sdk/TransactionMetadata;", "transactionMetadata", "Lcom/zettle/sdk/LocationAddress;", "locationAddress", "", "offlineFallbackTimeoutLimit", "<init>", "(Lcom/zettle/sdk/TotalAmounts;Ljava/util/UUID;Lcom/zettle/sdk/SoftDescriptor;Lcom/zettle/sdk/PaymentIntent;Lcom/zettle/sdk/TransactionMetadata;Lcom/zettle/sdk/LocationAddress;J)V", "component1", "()Lcom/zettle/sdk/TotalAmounts;", "component2", "()Ljava/util/UUID;", "component3", "()Lcom/zettle/sdk/SoftDescriptor;", "component4", "()Lcom/zettle/sdk/PaymentIntent;", "component5", "()Lcom/zettle/sdk/TransactionMetadata;", "component6", "()Lcom/zettle/sdk/LocationAddress;", "copy", "(Lcom/zettle/sdk/TotalAmounts;Ljava/util/UUID;Lcom/zettle/sdk/SoftDescriptor;Lcom/zettle/sdk/PaymentIntent;Lcom/zettle/sdk/TransactionMetadata;Lcom/zettle/sdk/LocationAddress;J)Lcom/zettle/sdk/PaymentParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/TotalAmounts;", "getAmounts", "Ljava/util/UUID;", "getAuthorizationRequestId", "Lcom/zettle/sdk/LocationAddress;", "getLocationAddress", "getOfflineFallbackTimeout", "()J", "offlineFallbackTimeout", "getHighSpeedVideoSizes", "J", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/PaymentIntent;", "getPaymentIntent", "Lcom/zettle/sdk/SoftDescriptor;", "getSoftDescriptor", "Lcom/zettle/sdk/TransactionMetadata;", "getTransactionMetadata", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PaymentParameters {
    public static final long OFFLINE_FALLBACK_TIMEOUT_DEFAULT = 15;
    public static final long OFFLINE_TIMEOUT_MAX = 60;
    public static final long OFFLINE_TIMEOUT_MIN = 1;
    private final com.zettle.sdk.TotalAmounts amounts;
    private final java.util.UUID authorizationRequestId;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;
    private final com.zettle.sdk.LocationAddress locationAddress;
    private final com.zettle.sdk.PaymentIntent paymentIntent;
    private final com.zettle.sdk.SoftDescriptor softDescriptor;
    private final com.zettle.sdk.TransactionMetadata transactionMetadata;

    public PaymentParameters(com.zettle.sdk.TotalAmounts totalAmounts, java.util.UUID uuid, com.zettle.sdk.SoftDescriptor softDescriptor, com.zettle.sdk.PaymentIntent paymentIntent, com.zettle.sdk.TransactionMetadata transactionMetadata, com.zettle.sdk.LocationAddress locationAddress, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentIntent, "");
        this.amounts = totalAmounts;
        this.authorizationRequestId = uuid;
        this.softDescriptor = softDescriptor;
        this.paymentIntent = paymentIntent;
        this.transactionMetadata = transactionMetadata;
        this.locationAddress = locationAddress;
        this.Camera2StreamConfigurationMap = j;
        if (j < 1) {
            this.Camera2StreamConfigurationMap = 1L;
        }
        if (this.Camera2StreamConfigurationMap > 60) {
            this.Camera2StreamConfigurationMap = 60L;
        }
    }

    public final com.zettle.sdk.TotalAmounts getAmounts() {
        return this.amounts;
    }

    public final java.util.UUID getAuthorizationRequestId() {
        return this.authorizationRequestId;
    }

    public final com.zettle.sdk.SoftDescriptor getSoftDescriptor() {
        return this.softDescriptor;
    }

    public /* synthetic */ PaymentParameters(com.zettle.sdk.TotalAmounts totalAmounts, java.util.UUID uuid, com.zettle.sdk.SoftDescriptor softDescriptor, com.zettle.sdk.PaymentIntent paymentIntent, com.zettle.sdk.TransactionMetadata transactionMetadata, com.zettle.sdk.LocationAddress locationAddress, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(totalAmounts, uuid, (i & 4) != 0 ? null : softDescriptor, (i & 8) != 0 ? com.zettle.sdk.PaymentIntent.Capture : paymentIntent, (i & 16) != 0 ? null : transactionMetadata, (i & 32) != 0 ? null : locationAddress, (i & 64) != 0 ? 15L : j);
    }

    public final com.zettle.sdk.PaymentIntent getPaymentIntent() {
        return this.paymentIntent;
    }

    public final com.zettle.sdk.TransactionMetadata getTransactionMetadata() {
        return this.transactionMetadata;
    }

    public final com.zettle.sdk.LocationAddress getLocationAddress() {
        return this.locationAddress;
    }

    /* renamed from: getOfflineFallbackTimeout, reason: from getter */
    public final long getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.TotalAmounts totalAmounts = this.amounts;
        java.util.UUID uuid = this.authorizationRequestId;
        com.zettle.sdk.SoftDescriptor softDescriptor = this.softDescriptor;
        com.zettle.sdk.PaymentIntent paymentIntent = this.paymentIntent;
        com.zettle.sdk.TransactionMetadata transactionMetadata = this.transactionMetadata;
        com.zettle.sdk.LocationAddress locationAddress = this.locationAddress;
        long j = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentParameters(amounts=");
        sb.append(totalAmounts);
        sb.append(", authorizationRequestId=");
        sb.append(uuid);
        sb.append(", softDescriptor=");
        sb.append(softDescriptor);
        sb.append(", paymentIntent=");
        sb.append(paymentIntent);
        sb.append(", transactionMetadata=");
        sb.append(transactionMetadata);
        sb.append(", locationAddress=");
        sb.append(locationAddress);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amounts.hashCode();
        int hashCode2 = this.authorizationRequestId.hashCode();
        com.zettle.sdk.SoftDescriptor softDescriptor = this.softDescriptor;
        int hashCode3 = softDescriptor == null ? 0 : softDescriptor.hashCode();
        int hashCode4 = this.paymentIntent.hashCode();
        com.zettle.sdk.TransactionMetadata transactionMetadata = this.transactionMetadata;
        int hashCode5 = transactionMetadata == null ? 0 : transactionMetadata.hashCode();
        com.zettle.sdk.LocationAddress locationAddress = this.locationAddress;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (locationAddress != null ? locationAddress.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.PaymentParameters)) {
            return false;
        }
        com.zettle.sdk.PaymentParameters paymentParameters = (com.zettle.sdk.PaymentParameters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amounts, paymentParameters.amounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.authorizationRequestId, paymentParameters.authorizationRequestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.softDescriptor, paymentParameters.softDescriptor) && this.paymentIntent == paymentParameters.paymentIntent && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionMetadata, paymentParameters.transactionMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.locationAddress, paymentParameters.locationAddress) && this.Camera2StreamConfigurationMap == paymentParameters.Camera2StreamConfigurationMap;
    }

    public final com.zettle.sdk.PaymentParameters copy(com.zettle.sdk.TotalAmounts amounts, java.util.UUID authorizationRequestId, com.zettle.sdk.SoftDescriptor softDescriptor, com.zettle.sdk.PaymentIntent paymentIntent, com.zettle.sdk.TransactionMetadata transactionMetadata, com.zettle.sdk.LocationAddress locationAddress, long offlineFallbackTimeoutLimit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationRequestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentIntent, "");
        return new com.zettle.sdk.PaymentParameters(amounts, authorizationRequestId, softDescriptor, paymentIntent, transactionMetadata, locationAddress, offlineFallbackTimeoutLimit);
    }

    /* renamed from: component6, reason: from getter */
    public final com.zettle.sdk.LocationAddress getLocationAddress() {
        return this.locationAddress;
    }

    /* renamed from: component5, reason: from getter */
    public final com.zettle.sdk.TransactionMetadata getTransactionMetadata() {
        return this.transactionMetadata;
    }

    /* renamed from: component4, reason: from getter */
    public final com.zettle.sdk.PaymentIntent getPaymentIntent() {
        return this.paymentIntent;
    }

    /* renamed from: component3, reason: from getter */
    public final com.zettle.sdk.SoftDescriptor getSoftDescriptor() {
        return this.softDescriptor;
    }

    /* renamed from: component2, reason: from getter */
    public final java.util.UUID getAuthorizationRequestId() {
        return this.authorizationRequestId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.TotalAmounts getAmounts() {
        return this.amounts;
    }
}
