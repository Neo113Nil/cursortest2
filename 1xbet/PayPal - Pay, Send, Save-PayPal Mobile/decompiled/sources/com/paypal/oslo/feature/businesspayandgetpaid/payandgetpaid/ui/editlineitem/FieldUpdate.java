package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate;", "", "Quantity", "Description", "DiscountType", "DiscountAmount", "DiscountPercentage", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$Description;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$DiscountAmount;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$DiscountPercentage;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$DiscountType;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$Quantity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FieldUpdate {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$Quantity;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$Quantity;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Quantity implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate {
        public static final int $stable = 0;
        private final java.lang.String value;

        public Quantity(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Quantity(value=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Quantity) other).value);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Quantity copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Quantity(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Quantity copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Quantity quantity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = quantity.value;
            }
            return quantity.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$Description;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$Description;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Description implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate {
        public static final int $stable = 0;
        private final java.lang.String value;

        public Description(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Description(value=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Description) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Description) other).value);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Description copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Description(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Description copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Description description, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = description.value;
            }
            return description.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$DiscountType;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/DiscountType;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/DiscountType;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/DiscountType;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/DiscountType;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$DiscountType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/DiscountType;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DiscountType implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType value;

        public DiscountType(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType discountType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(discountType, "");
            this.value = discountType;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType discountType = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DiscountType(value=");
            sb.append(discountType);
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
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountType) && this.value == ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountType) other).value;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountType copy(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountType(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountType copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountType discountType, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType discountType2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                discountType2 = discountType.value;
            }
            return discountType.copy(discountType2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$DiscountAmount;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$DiscountAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DiscountAmount implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate {
        public static final int $stable = 0;
        private final java.lang.String value;

        public DiscountAmount(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DiscountAmount(value=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountAmount) other).value);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountAmount copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountAmount(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountAmount copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountAmount discountAmount, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = discountAmount.value;
            }
            return discountAmount.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$DiscountPercentage;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate$DiscountPercentage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DiscountPercentage implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate {
        public static final int $stable = 0;
        private final java.lang.String value;

        public DiscountPercentage(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DiscountPercentage(value=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountPercentage) other).value);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountPercentage copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountPercentage(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountPercentage copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountPercentage discountPercentage, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = discountPercentage.value;
            }
            return discountPercentage.copy(str);
        }
    }
}
