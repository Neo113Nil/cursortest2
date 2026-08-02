package com.paypal.oslo.feature.wallet.me.domain.bnpl;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan;", "", "ContextualLabel", "AlmostComplete", "OnTrack", "PastDue", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING, "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$AlmostComplete;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$OnTrack;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$Pending;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface BnplPlan {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "", "<init>", "(Ljava/lang/String;I)V", "ALMOST_COMPLETE", "DELINQUENT", "HARDSHIP", "PAST_DUE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "PENDING_FRAUD", "SNOOZE_PENDING", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ContextualLabel {
        public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel ALMOST_COMPLETE;
        public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel DELINQUENT;
        public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel HARDSHIP;
        public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel PAST_DUE;
        public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel PENDING;
        public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel PENDING_FRAUD;
        public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel SNOOZE_PENDING;
        public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel UNKNOWN;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel[] getHighSpeedVideoSizes;

        private ContextualLabel(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel = new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel("ALMOST_COMPLETE", 0);
            ALMOST_COMPLETE = contextualLabel;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel2 = new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel("DELINQUENT", 1);
            DELINQUENT = contextualLabel2;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel3 = new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel("HARDSHIP", 2);
            HARDSHIP = contextualLabel3;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel4 = new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel("PAST_DUE", 3);
            PAST_DUE = contextualLabel4;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel5 = new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 4);
            PENDING = contextualLabel5;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel6 = new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel("PENDING_FRAUD", 5);
            PENDING_FRAUD = contextualLabel6;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel7 = new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel("SNOOZE_PENDING", 6);
            SNOOZE_PENDING = contextualLabel7;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel8 = new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel("UNKNOWN", 7);
            UNKNOWN = contextualLabel8;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel[] contextualLabelArr = {contextualLabel, contextualLabel2, contextualLabel3, contextualLabel4, contextualLabel5, contextualLabel6, contextualLabel7, contextualLabel8};
            getHighSpeedVideoSizes = contextualLabelArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(contextualLabelArr);
        }

        public static com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel[] values() {
            return (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJP\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b)\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$AlmostComplete;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan;", "", "accountId", "merchantName", "product", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "currentBalance", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "contextualLabel", "merchantLogoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component5", "()Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$AlmostComplete;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId", "getMerchantName", "getProduct", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getCurrentBalance", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "getContextualLabel", "getMerchantLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AlmostComplete implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan {
        public static final int $stable = 0;
        private final java.lang.String accountId;
        private final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money currentBalance;
        private final java.lang.String merchantLogoUrl;
        private final java.lang.String merchantName;
        private final java.lang.String product;

        public AlmostComplete(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            this.accountId = str;
            this.merchantName = str2;
            this.product = str3;
            this.currentBalance = money;
            this.contextualLabel = contextualLabel;
            this.merchantLogoUrl = str4;
        }

        public /* synthetic */ AlmostComplete(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, money, (i & 16) != 0 ? null : contextualLabel, (i & 32) != 0 ? null : str4);
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final java.lang.String getProduct() {
            return this.product;
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getCurrentBalance() {
            return this.currentBalance;
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel getContextualLabel() {
            return this.contextualLabel;
        }

        public final java.lang.String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountId;
            java.lang.String str2 = this.merchantName;
            java.lang.String str3 = this.product;
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.currentBalance;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel = this.contextualLabel;
            java.lang.String str4 = this.merchantLogoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AlmostComplete(accountId=");
            sb.append(str);
            sb.append(", merchantName=");
            sb.append(str2);
            sb.append(", product=");
            sb.append(str3);
            sb.append(", currentBalance=");
            sb.append(money);
            sb.append(", contextualLabel=");
            sb.append(contextualLabel);
            sb.append(", merchantLogoUrl=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.accountId.hashCode();
            int hashCode2 = this.merchantName.hashCode();
            int hashCode3 = this.product.hashCode();
            int hashCode4 = this.currentBalance.hashCode();
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel = this.contextualLabel;
            int hashCode5 = contextualLabel == null ? 0 : contextualLabel.hashCode();
            java.lang.String str = this.merchantLogoUrl;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete almostComplete = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, almostComplete.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, almostComplete.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, almostComplete.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentBalance, almostComplete.currentBalance) && this.contextualLabel == almostComplete.contextualLabel && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantLogoUrl, almostComplete.merchantLogoUrl);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete copy(java.lang.String accountId, java.lang.String merchantName, java.lang.String product, com.paypal.oslo.feature.wallet.common.domain.model.Money currentBalance, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String merchantLogoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentBalance, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete(accountId, merchantName, product, currentBalance, contextualLabel, merchantLogoUrl);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel getContextualLabel() {
            return this.contextualLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getCurrentBalance() {
            return this.currentBalance;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete almostComplete, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = almostComplete.accountId;
            }
            if ((i & 2) != 0) {
                str2 = almostComplete.merchantName;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = almostComplete.product;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                money = almostComplete.currentBalance;
            }
            com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = money;
            if ((i & 16) != 0) {
                contextualLabel = almostComplete.contextualLabel;
            }
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel2 = contextualLabel;
            if ((i & 32) != 0) {
                str4 = almostComplete.merchantLogoUrl;
            }
            return almostComplete.copy(str, str5, str6, money2, contextualLabel2, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016Jp\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b\n\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b2\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b3\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$OnTrack;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan;", "", "accountId", "merchantName", "product", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "nextPaymentDue", "nextPaymentDueDate", "", "isDueToday", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "contextualLabel", "merchantLogoUrl", "currentPaymentDue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/lang/String;ZLcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component5", "component6", "()Z", "component7", "()Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/lang/String;ZLcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$OnTrack;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId", "getMerchantName", "getProduct", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getNextPaymentDue", "getNextPaymentDueDate", "Z", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "getContextualLabel", "getMerchantLogoUrl", "getCurrentPaymentDue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTrack implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan {
        public static final int $stable = 0;
        private final java.lang.String accountId;
        private final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money currentPaymentDue;
        private final boolean isDueToday;
        private final java.lang.String merchantLogoUrl;
        private final java.lang.String merchantName;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money nextPaymentDue;
        private final java.lang.String nextPaymentDueDate;
        private final java.lang.String product;

        public OnTrack(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.lang.String str4, boolean z, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str5, com.paypal.oslo.feature.wallet.common.domain.model.Money money2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.accountId = str;
            this.merchantName = str2;
            this.product = str3;
            this.nextPaymentDue = money;
            this.nextPaymentDueDate = str4;
            this.isDueToday = z;
            this.contextualLabel = contextualLabel;
            this.merchantLogoUrl = str5;
            this.currentPaymentDue = money2;
        }

        public /* synthetic */ OnTrack(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.lang.String str4, boolean z, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str5, com.paypal.oslo.feature.wallet.common.domain.model.Money money2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, money, str4, z, (i & 64) != 0 ? null : contextualLabel, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : money2);
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final java.lang.String getProduct() {
            return this.product;
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getNextPaymentDue() {
            return this.nextPaymentDue;
        }

        public final java.lang.String getNextPaymentDueDate() {
            return this.nextPaymentDueDate;
        }

        public final boolean isDueToday() {
            return this.isDueToday;
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel getContextualLabel() {
            return this.contextualLabel;
        }

        public final java.lang.String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getCurrentPaymentDue() {
            return this.currentPaymentDue;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountId;
            java.lang.String str2 = this.merchantName;
            java.lang.String str3 = this.product;
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.nextPaymentDue;
            java.lang.String str4 = this.nextPaymentDueDate;
            boolean z = this.isDueToday;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel = this.contextualLabel;
            java.lang.String str5 = this.merchantLogoUrl;
            com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = this.currentPaymentDue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTrack(accountId=");
            sb.append(str);
            sb.append(", merchantName=");
            sb.append(str2);
            sb.append(", product=");
            sb.append(str3);
            sb.append(", nextPaymentDue=");
            sb.append(money);
            sb.append(", nextPaymentDueDate=");
            sb.append(str4);
            sb.append(", isDueToday=");
            sb.append(z);
            sb.append(", contextualLabel=");
            sb.append(contextualLabel);
            sb.append(", merchantLogoUrl=");
            sb.append(str5);
            sb.append(", currentPaymentDue=");
            sb.append(money2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.accountId.hashCode();
            int hashCode2 = this.merchantName.hashCode();
            int hashCode3 = this.product.hashCode();
            int hashCode4 = this.nextPaymentDue.hashCode();
            int hashCode5 = this.nextPaymentDueDate.hashCode();
            int hashCode6 = java.lang.Boolean.hashCode(this.isDueToday);
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel = this.contextualLabel;
            int hashCode7 = contextualLabel == null ? 0 : contextualLabel.hashCode();
            java.lang.String str = this.merchantLogoUrl;
            int hashCode8 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.currentPaymentDue;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (money != null ? money.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack onTrack = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, onTrack.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, onTrack.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, onTrack.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextPaymentDue, onTrack.nextPaymentDue) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextPaymentDueDate, onTrack.nextPaymentDueDate) && this.isDueToday == onTrack.isDueToday && this.contextualLabel == onTrack.contextualLabel && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantLogoUrl, onTrack.merchantLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentPaymentDue, onTrack.currentPaymentDue);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack copy(java.lang.String accountId, java.lang.String merchantName, java.lang.String product, com.paypal.oslo.feature.wallet.common.domain.model.Money nextPaymentDue, java.lang.String nextPaymentDueDate, boolean isDueToday, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String merchantLogoUrl, com.paypal.oslo.feature.wallet.common.domain.model.Money currentPaymentDue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextPaymentDue, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextPaymentDueDate, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack(accountId, merchantName, product, nextPaymentDue, nextPaymentDueDate, isDueToday, contextualLabel, merchantLogoUrl, currentPaymentDue);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getCurrentPaymentDue() {
            return this.currentPaymentDue;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel getContextualLabel() {
            return this.contextualLabel;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsDueToday() {
            return this.isDueToday;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNextPaymentDueDate() {
            return this.nextPaymentDueDate;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getNextPaymentDue() {
            return this.nextPaymentDue;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u00010BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012JZ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b/\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue$Type;", "type", "", "accountId", "merchantName", "product", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "overdueAmount", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "contextualLabel", "merchantLogoUrl", "<init>", "(Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue$Type;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component6", "()Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "component7", "copy", "(Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue$Type;", "getType", "Ljava/lang/String;", "getAccountId", "getMerchantName", "getProduct", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getOverdueAmount", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "getContextualLabel", "getMerchantLogoUrl", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PastDue implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan {
        public static final int $stable = 0;
        private final java.lang.String accountId;
        private final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel;
        private final java.lang.String merchantLogoUrl;
        private final java.lang.String merchantName;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money overdueAmount;
        private final java.lang.String product;
        private final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type type;

        public PastDue(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type type, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            this.type = type;
            this.accountId = str;
            this.merchantName = str2;
            this.product = str3;
            this.overdueAmount = money;
            this.contextualLabel = contextualLabel;
            this.merchantLogoUrl = str4;
        }

        public /* synthetic */ PastDue(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type type, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(type, str, str2, str3, money, (i & 32) != 0 ? null : contextualLabel, (i & 64) != 0 ? null : str4);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type getType() {
            return this.type;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final java.lang.String getProduct() {
            return this.product;
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getOverdueAmount() {
            return this.overdueAmount;
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel getContextualLabel() {
            return this.contextualLabel;
        }

        public final java.lang.String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue$Type;", "", "<init>", "(Ljava/lang/String;I)V", "DELINQUENT", "PAST_DUE"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Type {
            public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type DELINQUENT;
            public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type PAST_DUE;
            private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
            private static final /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type[] getHighSpeedVideoSizes;

            private Type(java.lang.String str, int i) {
            }

            static {
                com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type type = new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type("DELINQUENT", 0);
                DELINQUENT = type;
                com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type type2 = new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type("PAST_DUE", 1);
                PAST_DUE = type2;
                com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type[] typeArr = {type, type2};
                getHighSpeedVideoSizes = typeArr;
                getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(typeArr);
            }

            public static com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type[] values() {
                return (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type[]) getHighSpeedVideoSizes.clone();
            }

            public static com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type valueOf(java.lang.String str) {
                return (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type.class, str);
            }

            public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type> getEntries() {
                return getHighSpeedVideoFpsRanges;
            }
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type type = this.type;
            java.lang.String str = this.accountId;
            java.lang.String str2 = this.merchantName;
            java.lang.String str3 = this.product;
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.overdueAmount;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel = this.contextualLabel;
            java.lang.String str4 = this.merchantLogoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PastDue(type=");
            sb.append(type);
            sb.append(", accountId=");
            sb.append(str);
            sb.append(", merchantName=");
            sb.append(str2);
            sb.append(", product=");
            sb.append(str3);
            sb.append(", overdueAmount=");
            sb.append(money);
            sb.append(", contextualLabel=");
            sb.append(contextualLabel);
            sb.append(", merchantLogoUrl=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            int hashCode2 = this.accountId.hashCode();
            int hashCode3 = this.merchantName.hashCode();
            int hashCode4 = this.product.hashCode();
            int hashCode5 = this.overdueAmount.hashCode();
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel = this.contextualLabel;
            int hashCode6 = contextualLabel == null ? 0 : contextualLabel.hashCode();
            java.lang.String str = this.merchantLogoUrl;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue pastDue = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue) other;
            return this.type == pastDue.type && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, pastDue.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, pastDue.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, pastDue.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.overdueAmount, pastDue.overdueAmount) && this.contextualLabel == pastDue.contextualLabel && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantLogoUrl, pastDue.merchantLogoUrl);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue copy(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type type, java.lang.String accountId, java.lang.String merchantName, java.lang.String product, com.paypal.oslo.feature.wallet.common.domain.model.Money overdueAmount, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String merchantLogoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overdueAmount, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue(type, accountId, merchantName, product, overdueAmount, contextualLabel, merchantLogoUrl);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel getContextualLabel() {
            return this.contextualLabel;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getOverdueAmount() {
            return this.overdueAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getProduct() {
            return this.product;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue pastDue, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type type, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                type = pastDue.type;
            }
            if ((i & 2) != 0) {
                str = pastDue.accountId;
            }
            java.lang.String str5 = str;
            if ((i & 4) != 0) {
                str2 = pastDue.merchantName;
            }
            java.lang.String str6 = str2;
            if ((i & 8) != 0) {
                str3 = pastDue.product;
            }
            java.lang.String str7 = str3;
            if ((i & 16) != 0) {
                money = pastDue.overdueAmount;
            }
            com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = money;
            if ((i & 32) != 0) {
                contextualLabel = pastDue.contextualLabel;
            }
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel2 = contextualLabel;
            if ((i & 64) != 0) {
                str4 = pastDue.merchantLogoUrl;
            }
            return pastDue.copy(type, str5, str6, str7, money2, contextualLabel2, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$Pending;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan;", "", "accountId", "merchantName", "product", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "contextualLabel", "merchantLogoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$Pending;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId", "getMerchantName", "getProduct", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "getContextualLabel", "getMerchantLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pending implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan {
        public static final int $stable = 0;
        private final java.lang.String accountId;
        private final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel;
        private final java.lang.String merchantLogoUrl;
        private final java.lang.String merchantName;
        private final java.lang.String product;

        public Pending(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.accountId = str;
            this.merchantName = str2;
            this.product = str3;
            this.contextualLabel = contextualLabel;
            this.merchantLogoUrl = str4;
        }

        public /* synthetic */ Pending(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : contextualLabel, (i & 16) != 0 ? null : str4);
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final java.lang.String getProduct() {
            return this.product;
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel getContextualLabel() {
            return this.contextualLabel;
        }

        public final java.lang.String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountId;
            java.lang.String str2 = this.merchantName;
            java.lang.String str3 = this.product;
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel = this.contextualLabel;
            java.lang.String str4 = this.merchantLogoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pending(accountId=");
            sb.append(str);
            sb.append(", merchantName=");
            sb.append(str2);
            sb.append(", product=");
            sb.append(str3);
            sb.append(", contextualLabel=");
            sb.append(contextualLabel);
            sb.append(", merchantLogoUrl=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.accountId.hashCode();
            int hashCode2 = this.merchantName.hashCode();
            int hashCode3 = this.product.hashCode();
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel = this.contextualLabel;
            int hashCode4 = contextualLabel == null ? 0 : contextualLabel.hashCode();
            java.lang.String str = this.merchantLogoUrl;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending pending = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, pending.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, pending.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, pending.product) && this.contextualLabel == pending.contextualLabel && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantLogoUrl, pending.merchantLogoUrl);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending copy(java.lang.String accountId, java.lang.String merchantName, java.lang.String product, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String merchantLogoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending(accountId, merchantName, product, contextualLabel, merchantLogoUrl);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel getContextualLabel() {
            return this.contextualLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending pending, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pending.accountId;
            }
            if ((i & 2) != 0) {
                str2 = pending.merchantName;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = pending.product;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                contextualLabel = pending.contextualLabel;
            }
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel contextualLabel2 = contextualLabel;
            if ((i & 16) != 0) {
                str4 = pending.merchantLogoUrl;
            }
            return pending.copy(str, str5, str6, contextualLabel2, str4);
        }
    }
}
