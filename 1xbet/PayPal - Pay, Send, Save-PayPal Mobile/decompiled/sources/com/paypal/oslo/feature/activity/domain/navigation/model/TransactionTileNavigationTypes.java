package com.paypal.oslo.feature.activity.domain.navigation.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;", "", "<init>", "()V", "Landroidx/navigation3/runtime/NavKey;", "getDestinationKey", "()Landroidx/navigation3/runtime/NavKey;", "destinationKey", "PackageTrackingNavigation", "PromotionalRewardNavigation", "XoomTransactionNavigation", "PackageTrackingLinkEmailNavigation", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$PackageTrackingLinkEmailNavigation;", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$PackageTrackingNavigation;", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$PromotionalRewardNavigation;", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$XoomTransactionNavigation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class TransactionTileNavigationTypes {
    public static final int $stable = 0;

    public abstract androidx.navigation3.runtime.NavKey getDestinationKey();

    private TransactionTileNavigationTypes() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$PackageTrackingNavigation;", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;", "Landroidx/navigation3/runtime/NavKey;", "destinationKey", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$PackageTrackingNavigation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PackageTrackingNavigation extends com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes {
        public static final int $stable = 0;
        private final androidx.navigation3.runtime.NavKey destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PackageTrackingNavigation(androidx.navigation3.runtime.NavKey navKey) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destinationKey = navKey;
        }

        @Override // com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes
        public final androidx.navigation3.runtime.NavKey getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PackageTrackingNavigation(destinationKey=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destinationKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingNavigation) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingNavigation) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingNavigation copy(androidx.navigation3.runtime.NavKey destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingNavigation(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingNavigation copy$default(com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingNavigation packageTrackingNavigation, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = packageTrackingNavigation.destinationKey;
            }
            return packageTrackingNavigation.copy(navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$PromotionalRewardNavigation;", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;", "Landroidx/navigation3/runtime/NavKey;", "destinationKey", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$PromotionalRewardNavigation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PromotionalRewardNavigation extends com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes {
        public static final int $stable = 0;
        private final androidx.navigation3.runtime.NavKey destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PromotionalRewardNavigation(androidx.navigation3.runtime.NavKey navKey) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destinationKey = navKey;
        }

        @Override // com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes
        public final androidx.navigation3.runtime.NavKey getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PromotionalRewardNavigation(destinationKey=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destinationKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PromotionalRewardNavigation) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PromotionalRewardNavigation) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PromotionalRewardNavigation copy(androidx.navigation3.runtime.NavKey destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PromotionalRewardNavigation(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PromotionalRewardNavigation copy$default(com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PromotionalRewardNavigation promotionalRewardNavigation, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = promotionalRewardNavigation.destinationKey;
            }
            return promotionalRewardNavigation.copy(navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$XoomTransactionNavigation;", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;", "Landroidx/navigation3/runtime/NavKey;", "destinationKey", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$XoomTransactionNavigation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class XoomTransactionNavigation extends com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes {
        public static final int $stable = 0;
        private final androidx.navigation3.runtime.NavKey destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public XoomTransactionNavigation(androidx.navigation3.runtime.NavKey navKey) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destinationKey = navKey;
        }

        @Override // com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes
        public final androidx.navigation3.runtime.NavKey getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("XoomTransactionNavigation(destinationKey=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destinationKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation copy(androidx.navigation3.runtime.NavKey destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation copy$default(com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation xoomTransactionNavigation, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = xoomTransactionNavigation.destinationKey;
            }
            return xoomTransactionNavigation.copy(navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$PackageTrackingLinkEmailNavigation;", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;", "Landroidx/navigation3/runtime/NavKey;", "destinationKey", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$PackageTrackingLinkEmailNavigation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PackageTrackingLinkEmailNavigation extends com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes {
        public static final int $stable = 0;
        private final androidx.navigation3.runtime.NavKey destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PackageTrackingLinkEmailNavigation(androidx.navigation3.runtime.NavKey navKey) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destinationKey = navKey;
        }

        @Override // com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes
        public final androidx.navigation3.runtime.NavKey getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PackageTrackingLinkEmailNavigation(destinationKey=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destinationKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingLinkEmailNavigation) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingLinkEmailNavigation) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingLinkEmailNavigation copy(androidx.navigation3.runtime.NavKey destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingLinkEmailNavigation(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingLinkEmailNavigation copy$default(com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingLinkEmailNavigation packageTrackingLinkEmailNavigation, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = packageTrackingLinkEmailNavigation.destinationKey;
            }
            return packageTrackingLinkEmailNavigation.copy(navKey);
        }
    }

    public /* synthetic */ TransactionTileNavigationTypes(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
