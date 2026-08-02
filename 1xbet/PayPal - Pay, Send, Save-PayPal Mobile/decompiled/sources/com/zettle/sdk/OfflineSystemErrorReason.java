package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason;", "", "<init>", "()V", "AmountLimitReached", "AmountTooHigh", "AmountTooLow", "DeviceNotSupported", "FeatureNotAvailable", "FeatureNotEnabled", "MaxTimeExceeded", "PaymentDuplicated", "ReaderNotSupported", "ReaderSoftwareOutdated", "StorageLimitReached", "TechnicalError", "Lcom/zettle/sdk/OfflineSystemErrorReason$AmountLimitReached;", "Lcom/zettle/sdk/OfflineSystemErrorReason$AmountTooHigh;", "Lcom/zettle/sdk/OfflineSystemErrorReason$AmountTooLow;", "Lcom/zettle/sdk/OfflineSystemErrorReason$DeviceNotSupported;", "Lcom/zettle/sdk/OfflineSystemErrorReason$FeatureNotAvailable;", "Lcom/zettle/sdk/OfflineSystemErrorReason$FeatureNotEnabled;", "Lcom/zettle/sdk/OfflineSystemErrorReason$MaxTimeExceeded;", "Lcom/zettle/sdk/OfflineSystemErrorReason$PaymentDuplicated;", "Lcom/zettle/sdk/OfflineSystemErrorReason$ReaderNotSupported;", "Lcom/zettle/sdk/OfflineSystemErrorReason$ReaderSoftwareOutdated;", "Lcom/zettle/sdk/OfflineSystemErrorReason$StorageLimitReached;", "Lcom/zettle/sdk/OfflineSystemErrorReason$TechnicalError;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class OfflineSystemErrorReason {
    private OfflineSystemErrorReason() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$FeatureNotEnabled;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FeatureNotEnabled extends com.zettle.sdk.OfflineSystemErrorReason {
        public static final com.zettle.sdk.OfflineSystemErrorReason.FeatureNotEnabled INSTANCE = new com.zettle.sdk.OfflineSystemErrorReason.FeatureNotEnabled();

        private FeatureNotEnabled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$FeatureNotAvailable;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FeatureNotAvailable extends com.zettle.sdk.OfflineSystemErrorReason {
        public static final com.zettle.sdk.OfflineSystemErrorReason.FeatureNotAvailable INSTANCE = new com.zettle.sdk.OfflineSystemErrorReason.FeatureNotAvailable();

        private FeatureNotAvailable() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$MaxTimeExceeded;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "", "maxOfflineSeconds", "<init>", "(Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Long;)Lcom/zettle/sdk/OfflineSystemErrorReason$MaxTimeExceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getMaxOfflineSeconds"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MaxTimeExceeded extends com.zettle.sdk.OfflineSystemErrorReason {
        private final java.lang.Long maxOfflineSeconds;

        public MaxTimeExceeded(java.lang.Long l) {
            super(null);
            this.maxOfflineSeconds = l;
        }

        public /* synthetic */ MaxTimeExceeded(java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l);
        }

        public final java.lang.Long getMaxOfflineSeconds() {
            return this.maxOfflineSeconds;
        }

        public final java.lang.String toString() {
            java.lang.Long l = this.maxOfflineSeconds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MaxTimeExceeded(maxOfflineSeconds=");
            sb.append(l);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Long l = this.maxOfflineSeconds;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.OfflineSystemErrorReason.MaxTimeExceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxOfflineSeconds, ((com.zettle.sdk.OfflineSystemErrorReason.MaxTimeExceeded) other).maxOfflineSeconds);
        }

        public final com.zettle.sdk.OfflineSystemErrorReason.MaxTimeExceeded copy(java.lang.Long maxOfflineSeconds) {
            return new com.zettle.sdk.OfflineSystemErrorReason.MaxTimeExceeded(maxOfflineSeconds);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Long getMaxOfflineSeconds() {
            return this.maxOfflineSeconds;
        }

        public static /* synthetic */ com.zettle.sdk.OfflineSystemErrorReason.MaxTimeExceeded copy$default(com.zettle.sdk.OfflineSystemErrorReason.MaxTimeExceeded maxTimeExceeded, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = maxTimeExceeded.maxOfflineSeconds;
            }
            return maxTimeExceeded.copy(l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MaxTimeExceeded() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$StorageLimitReached;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "", "maxCount", "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/zettle/sdk/OfflineSystemErrorReason$StorageLimitReached;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getMaxCount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StorageLimitReached extends com.zettle.sdk.OfflineSystemErrorReason {
        private final java.lang.Integer maxCount;

        public StorageLimitReached(java.lang.Integer num) {
            super(null);
            this.maxCount = num;
        }

        public /* synthetic */ StorageLimitReached(java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }

        public final java.lang.Integer getMaxCount() {
            return this.maxCount;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.maxCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StorageLimitReached(maxCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.maxCount;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.OfflineSystemErrorReason.StorageLimitReached) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxCount, ((com.zettle.sdk.OfflineSystemErrorReason.StorageLimitReached) other).maxCount);
        }

        public final com.zettle.sdk.OfflineSystemErrorReason.StorageLimitReached copy(java.lang.Integer maxCount) {
            return new com.zettle.sdk.OfflineSystemErrorReason.StorageLimitReached(maxCount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getMaxCount() {
            return this.maxCount;
        }

        public static /* synthetic */ com.zettle.sdk.OfflineSystemErrorReason.StorageLimitReached copy$default(com.zettle.sdk.OfflineSystemErrorReason.StorageLimitReached storageLimitReached, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = storageLimitReached.maxCount;
            }
            return storageLimitReached.copy(num);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StorageLimitReached() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$AmountTooHigh;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "", "maxAmount", "Ljava/util/Currency;", "currency", "<init>", "(Ljava/lang/Long;Ljava/util/Currency;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/util/Currency;", "copy", "(Ljava/lang/Long;Ljava/util/Currency;)Lcom/zettle/sdk/OfflineSystemErrorReason$AmountTooHigh;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Currency;", "getCurrency", "Ljava/lang/Long;", "getMaxAmount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AmountTooHigh extends com.zettle.sdk.OfflineSystemErrorReason {
        private final java.util.Currency currency;
        private final java.lang.Long maxAmount;

        public /* synthetic */ AmountTooHigh(java.lang.Long l, java.util.Currency currency, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : currency);
        }

        public final java.lang.Long getMaxAmount() {
            return this.maxAmount;
        }

        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        public AmountTooHigh(java.lang.Long l, java.util.Currency currency) {
            super(null);
            this.maxAmount = l;
            this.currency = currency;
        }

        public final java.lang.String toString() {
            java.lang.Long l = this.maxAmount;
            java.util.Currency currency = this.currency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountTooHigh(maxAmount=");
            sb.append(l);
            sb.append(", currency=");
            sb.append(currency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Long l = this.maxAmount;
            int hashCode = l == null ? 0 : l.hashCode();
            java.util.Currency currency = this.currency;
            return (hashCode * 31) + (currency != null ? currency.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.OfflineSystemErrorReason.AmountTooHigh)) {
                return false;
            }
            com.zettle.sdk.OfflineSystemErrorReason.AmountTooHigh amountTooHigh = (com.zettle.sdk.OfflineSystemErrorReason.AmountTooHigh) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.maxAmount, amountTooHigh.maxAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, amountTooHigh.currency);
        }

        public final com.zettle.sdk.OfflineSystemErrorReason.AmountTooHigh copy(java.lang.Long maxAmount, java.util.Currency currency) {
            return new com.zettle.sdk.OfflineSystemErrorReason.AmountTooHigh(maxAmount, currency);
        }

        /* renamed from: component2, reason: from getter */
        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Long getMaxAmount() {
            return this.maxAmount;
        }

        public static /* synthetic */ com.zettle.sdk.OfflineSystemErrorReason.AmountTooHigh copy$default(com.zettle.sdk.OfflineSystemErrorReason.AmountTooHigh amountTooHigh, java.lang.Long l, java.util.Currency currency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = amountTooHigh.maxAmount;
            }
            if ((i & 2) != 0) {
                currency = amountTooHigh.currency;
            }
            return amountTooHigh.copy(l, currency);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AmountTooHigh() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$AmountTooLow;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "", "minAmount", "Ljava/util/Currency;", "currency", "<init>", "(Ljava/lang/Long;Ljava/util/Currency;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/util/Currency;", "copy", "(Ljava/lang/Long;Ljava/util/Currency;)Lcom/zettle/sdk/OfflineSystemErrorReason$AmountTooLow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Currency;", "getCurrency", "Ljava/lang/Long;", "getMinAmount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AmountTooLow extends com.zettle.sdk.OfflineSystemErrorReason {
        private final java.util.Currency currency;
        private final java.lang.Long minAmount;

        public /* synthetic */ AmountTooLow(java.lang.Long l, java.util.Currency currency, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : currency);
        }

        public final java.lang.Long getMinAmount() {
            return this.minAmount;
        }

        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        public AmountTooLow(java.lang.Long l, java.util.Currency currency) {
            super(null);
            this.minAmount = l;
            this.currency = currency;
        }

        public final java.lang.String toString() {
            java.lang.Long l = this.minAmount;
            java.util.Currency currency = this.currency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountTooLow(minAmount=");
            sb.append(l);
            sb.append(", currency=");
            sb.append(currency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Long l = this.minAmount;
            int hashCode = l == null ? 0 : l.hashCode();
            java.util.Currency currency = this.currency;
            return (hashCode * 31) + (currency != null ? currency.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.OfflineSystemErrorReason.AmountTooLow)) {
                return false;
            }
            com.zettle.sdk.OfflineSystemErrorReason.AmountTooLow amountTooLow = (com.zettle.sdk.OfflineSystemErrorReason.AmountTooLow) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.minAmount, amountTooLow.minAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, amountTooLow.currency);
        }

        public final com.zettle.sdk.OfflineSystemErrorReason.AmountTooLow copy(java.lang.Long minAmount, java.util.Currency currency) {
            return new com.zettle.sdk.OfflineSystemErrorReason.AmountTooLow(minAmount, currency);
        }

        /* renamed from: component2, reason: from getter */
        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Long getMinAmount() {
            return this.minAmount;
        }

        public static /* synthetic */ com.zettle.sdk.OfflineSystemErrorReason.AmountTooLow copy$default(com.zettle.sdk.OfflineSystemErrorReason.AmountTooLow amountTooLow, java.lang.Long l, java.util.Currency currency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = amountTooLow.minAmount;
            }
            if ((i & 2) != 0) {
                currency = amountTooLow.currency;
            }
            return amountTooLow.copy(l, currency);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AmountTooLow() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$AmountLimitReached;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "", "totalLimit", "Ljava/util/Currency;", "currency", "<init>", "(Ljava/lang/Long;Ljava/util/Currency;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/util/Currency;", "copy", "(Ljava/lang/Long;Ljava/util/Currency;)Lcom/zettle/sdk/OfflineSystemErrorReason$AmountLimitReached;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Currency;", "getCurrency", "Ljava/lang/Long;", "getTotalLimit"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AmountLimitReached extends com.zettle.sdk.OfflineSystemErrorReason {
        private final java.util.Currency currency;
        private final java.lang.Long totalLimit;

        public /* synthetic */ AmountLimitReached(java.lang.Long l, java.util.Currency currency, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : currency);
        }

        public final java.lang.Long getTotalLimit() {
            return this.totalLimit;
        }

        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        public AmountLimitReached(java.lang.Long l, java.util.Currency currency) {
            super(null);
            this.totalLimit = l;
            this.currency = currency;
        }

        public final java.lang.String toString() {
            java.lang.Long l = this.totalLimit;
            java.util.Currency currency = this.currency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountLimitReached(totalLimit=");
            sb.append(l);
            sb.append(", currency=");
            sb.append(currency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Long l = this.totalLimit;
            int hashCode = l == null ? 0 : l.hashCode();
            java.util.Currency currency = this.currency;
            return (hashCode * 31) + (currency != null ? currency.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.OfflineSystemErrorReason.AmountLimitReached)) {
                return false;
            }
            com.zettle.sdk.OfflineSystemErrorReason.AmountLimitReached amountLimitReached = (com.zettle.sdk.OfflineSystemErrorReason.AmountLimitReached) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.totalLimit, amountLimitReached.totalLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, amountLimitReached.currency);
        }

        public final com.zettle.sdk.OfflineSystemErrorReason.AmountLimitReached copy(java.lang.Long totalLimit, java.util.Currency currency) {
            return new com.zettle.sdk.OfflineSystemErrorReason.AmountLimitReached(totalLimit, currency);
        }

        /* renamed from: component2, reason: from getter */
        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Long getTotalLimit() {
            return this.totalLimit;
        }

        public static /* synthetic */ com.zettle.sdk.OfflineSystemErrorReason.AmountLimitReached copy$default(com.zettle.sdk.OfflineSystemErrorReason.AmountLimitReached amountLimitReached, java.lang.Long l, java.util.Currency currency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = amountLimitReached.totalLimit;
            }
            if ((i & 2) != 0) {
                currency = amountLimitReached.currency;
            }
            return amountLimitReached.copy(l, currency);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AmountLimitReached() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$ReaderNotSupported;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ReaderNotSupported extends com.zettle.sdk.OfflineSystemErrorReason {
        public static final com.zettle.sdk.OfflineSystemErrorReason.ReaderNotSupported INSTANCE = new com.zettle.sdk.OfflineSystemErrorReason.ReaderNotSupported();

        private ReaderNotSupported() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$DeviceNotSupported;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DeviceNotSupported extends com.zettle.sdk.OfflineSystemErrorReason {
        public static final com.zettle.sdk.OfflineSystemErrorReason.DeviceNotSupported INSTANCE = new com.zettle.sdk.OfflineSystemErrorReason.DeviceNotSupported();

        private DeviceNotSupported() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$ReaderSoftwareOutdated;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ReaderSoftwareOutdated extends com.zettle.sdk.OfflineSystemErrorReason {
        public static final com.zettle.sdk.OfflineSystemErrorReason.ReaderSoftwareOutdated INSTANCE = new com.zettle.sdk.OfflineSystemErrorReason.ReaderSoftwareOutdated();

        private ReaderSoftwareOutdated() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$PaymentDuplicated;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PaymentDuplicated extends com.zettle.sdk.OfflineSystemErrorReason {
        public static final com.zettle.sdk.OfflineSystemErrorReason.PaymentDuplicated INSTANCE = new com.zettle.sdk.OfflineSystemErrorReason.PaymentDuplicated();

        private PaymentDuplicated() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/OfflineSystemErrorReason$TechnicalError;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/OfflineSystemErrorReason$TechnicalError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TechnicalError extends com.zettle.sdk.OfflineSystemErrorReason {
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TechnicalError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TechnicalError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.OfflineSystemErrorReason.TechnicalError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.zettle.sdk.OfflineSystemErrorReason.TechnicalError) other).message);
        }

        public final com.zettle.sdk.OfflineSystemErrorReason.TechnicalError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.zettle.sdk.OfflineSystemErrorReason.TechnicalError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.zettle.sdk.OfflineSystemErrorReason.TechnicalError copy$default(com.zettle.sdk.OfflineSystemErrorReason.TechnicalError technicalError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = technicalError.message;
            }
            return technicalError.copy(str);
        }
    }

    public /* synthetic */ OfflineSystemErrorReason(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
