package com.paypal.oslo.feature.ads.data.models.smithy;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0012\u0082\u0001\u0005\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalUserIdentifier;", "asPaypal", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalUserIdentifier;", "asPaypalOrNull", "Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalPayerIdIdentifier;", "asPaypalPayerId", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalPayerIdIdentifier;", "asPaypalPayerIdOrNull", "Lcom/paypal/oslo/feature/ads/data/models/smithy/SmbIdentifier;", "asSmb", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/SmbIdentifier;", "asSmbOrNull", "Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;", "asVenmo", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;", "asVenmoOrNull", "Paypal", "PaypalPayerId", "Smb", "Venmo", "SdkUnknown", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$Paypal;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$PaypalPayerId;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$SdkUnknown;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$Smb;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$Venmo;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class UserIdentifier {
    public static final int $stable = 0;

    private UserIdentifier() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$Paypal;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalUserIdentifier;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalUserIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalUserIdentifier;", "copy", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalUserIdentifier;)Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$Paypal;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalUserIdentifier;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Paypal extends com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.ads.data.models.smithy.PayPalUserIdentifier value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paypal(com.paypal.oslo.feature.ads.data.models.smithy.PayPalUserIdentifier payPalUserIdentifier) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalUserIdentifier, "");
            this.value = payPalUserIdentifier;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalUserIdentifier getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.ads.data.models.smithy.PayPalUserIdentifier payPalUserIdentifier = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Paypal(value=");
            sb.append(payPalUserIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal copy(com.paypal.oslo.feature.ads.data.models.smithy.PayPalUserIdentifier value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalUserIdentifier getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal copy$default(com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal paypal, com.paypal.oslo.feature.ads.data.models.smithy.PayPalUserIdentifier payPalUserIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payPalUserIdentifier = paypal.value;
            }
            return paypal.copy(payPalUserIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$PaypalPayerId;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalPayerIdIdentifier;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalPayerIdIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalPayerIdIdentifier;", "copy", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalPayerIdIdentifier;)Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$PaypalPayerId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalPayerIdIdentifier;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaypalPayerId extends com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaypalPayerId(com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier payPalPayerIdIdentifier) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalPayerIdIdentifier, "");
            this.value = payPalPayerIdIdentifier;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier payPalPayerIdIdentifier = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaypalPayerId(value=");
            sb.append(payPalPayerIdIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId copy(com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId copy$default(com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId paypalPayerId, com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier payPalPayerIdIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payPalPayerIdIdentifier = paypalPayerId.value;
            }
            return paypalPayerId.copy(payPalPayerIdIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$Smb;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/SmbIdentifier;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/SmbIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/SmbIdentifier;", "copy", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/SmbIdentifier;)Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$Smb;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/SmbIdentifier;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Smb extends com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.ads.data.models.smithy.SmbIdentifier value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Smb(com.paypal.oslo.feature.ads.data.models.smithy.SmbIdentifier smbIdentifier) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smbIdentifier, "");
            this.value = smbIdentifier;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.SmbIdentifier getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.ads.data.models.smithy.SmbIdentifier smbIdentifier = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Smb(value=");
            sb.append(smbIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb copy(com.paypal.oslo.feature.ads.data.models.smithy.SmbIdentifier value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.ads.data.models.smithy.SmbIdentifier getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb copy$default(com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb smb, com.paypal.oslo.feature.ads.data.models.smithy.SmbIdentifier smbIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smbIdentifier = smb.value;
            }
            return smb.copy(smbIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$Venmo;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;", "copy", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;)Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$Venmo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Venmo extends com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Venmo(com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier venmoUserIdentifier) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(venmoUserIdentifier, "");
            this.value = venmoUserIdentifier;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier venmoUserIdentifier = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Venmo(value=");
            sb.append(venmoUserIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo copy(com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo copy$default(com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo venmo, com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier venmoUserIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                venmoUserIdentifier = venmo.value;
            }
            return venmo.copy(venmoUserIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier$SdkUnknown;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SdkUnknown extends com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.SdkUnknown INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.SdkUnknown();

        private SdkUnknown() {
            super(null);
        }
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalUserIdentifier asPaypal() {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return ((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal) this).getValue();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalUserIdentifier asPaypalOrNull() {
        com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal paypal = this instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal ? (com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Paypal) this : null;
        if (paypal != null) {
            return paypal.getValue();
        }
        return null;
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier asPaypalPayerId() {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return ((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId) this).getValue();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier asPaypalPayerIdOrNull() {
        com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId paypalPayerId = this instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId ? (com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId) this : null;
        if (paypalPayerId != null) {
            return paypalPayerId.getValue();
        }
        return null;
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.SmbIdentifier asSmb() {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return ((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb) this).getValue();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.SmbIdentifier asSmbOrNull() {
        com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb smb = this instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb ? (com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Smb) this : null;
        if (smb != null) {
            return smb.getValue();
        }
        return null;
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier asVenmo() {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return ((com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo) this).getValue();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier asVenmoOrNull() {
        com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo venmo = this instanceof com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo ? (com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.Venmo) this : null;
        if (venmo != null) {
            return venmo.getValue();
        }
        return null;
    }

    public /* synthetic */ UserIdentifier(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
