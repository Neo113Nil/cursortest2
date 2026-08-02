package com.paypal.oslo.feature.debitcard.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003#$%B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$PosLimit;", "posLimit", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$AtmLimit;", "atmLimit", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$OtcLimit;", "otcLimit", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$PosLimit;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$AtmLimit;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$OtcLimit;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$PosLimit;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$AtmLimit;", "component3", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$OtcLimit;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$PosLimit;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$AtmLimit;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$OtcLimit;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$PosLimit;", "getPosLimit", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$AtmLimit;", "getAtmLimit", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$OtcLimit;", "getOtcLimit", "PosLimit", "AtmLimit", "OtcLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentLimitsFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit atmLimit;
    private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit otcLimit;
    private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit posLimit;

    public DebitInstrumentLimitsFragment(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit posLimit, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit atmLimit, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit otcLimit) {
        this.posLimit = posLimit;
        this.atmLimit = atmLimit;
        this.otcLimit = otcLimit;
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit getPosLimit() {
        return this.posLimit;
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit getAtmLimit() {
        return this.atmLimit;
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit getOtcLimit() {
        return this.otcLimit;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$PosLimit;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$PosLimit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PosLimit {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public PosLimit(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PosLimit(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit posLimit = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, posLimit.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, posLimit.value);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit posLimit, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = posLimit.currencyCode;
            }
            if ((i & 2) != 0) {
                str = posLimit.value;
            }
            return posLimit.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$AtmLimit;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$AtmLimit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AtmLimit {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AtmLimit(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AtmLimit(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit atmLimit = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, atmLimit.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, atmLimit.value);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit atmLimit, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = atmLimit.currencyCode;
            }
            if ((i & 2) != 0) {
                str = atmLimit.value;
            }
            return atmLimit.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$OtcLimit;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment$OtcLimit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OtcLimit {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public OtcLimit(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OtcLimit(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit otcLimit = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, otcLimit.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, otcLimit.value);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit otcLimit, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = otcLimit.currencyCode;
            }
            if ((i & 2) != 0) {
                str = otcLimit.value;
            }
            return otcLimit.copy(obj, str);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit posLimit = this.posLimit;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit atmLimit = this.atmLimit;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit otcLimit = this.otcLimit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentLimitsFragment(posLimit=");
        sb.append(posLimit);
        sb.append(", atmLimit=");
        sb.append(atmLimit);
        sb.append(", otcLimit=");
        sb.append(otcLimit);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit posLimit = this.posLimit;
        int hashCode = posLimit == null ? 0 : posLimit.hashCode();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit atmLimit = this.atmLimit;
        int hashCode2 = atmLimit == null ? 0 : atmLimit.hashCode();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit otcLimit = this.otcLimit;
        return (((hashCode * 31) + hashCode2) * 31) + (otcLimit != null ? otcLimit.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment debitInstrumentLimitsFragment = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.posLimit, debitInstrumentLimitsFragment.posLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.atmLimit, debitInstrumentLimitsFragment.atmLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.otcLimit, debitInstrumentLimitsFragment.otcLimit);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment copy(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit posLimit, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit atmLimit, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit otcLimit) {
        return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment(posLimit, atmLimit, otcLimit);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit getOtcLimit() {
        return this.otcLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit getAtmLimit() {
        return this.atmLimit;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit getPosLimit() {
        return this.posLimit;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment debitInstrumentLimitsFragment, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit posLimit, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit atmLimit, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit otcLimit, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            posLimit = debitInstrumentLimitsFragment.posLimit;
        }
        if ((i & 2) != 0) {
            atmLimit = debitInstrumentLimitsFragment.atmLimit;
        }
        if ((i & 4) != 0) {
            otcLimit = debitInstrumentLimitsFragment.otcLimit;
        }
        return debitInstrumentLimitsFragment.copy(posLimit, atmLimit, otcLimit);
    }
}
