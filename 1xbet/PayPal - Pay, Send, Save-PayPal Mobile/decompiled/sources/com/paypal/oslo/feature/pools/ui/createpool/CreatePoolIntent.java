package com.paypal.oslo.feature.pools.ui.createpool;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAME_CHANGED, com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DESCRIPTION_CHANGED, com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_BACKGROUND_IMAGE_URL_CHANGED, com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_TARGET_AMOUNT_CHANGED, com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_TARGET_DATE_CHANGED, com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED, com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_CREATION_SUCCEEDED, com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_CREATION_FAILED, com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR, "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$BackgroundImageUrlChanged;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$CreationFailed;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$CreationSucceeded;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$DescriptionChanged;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$DismissError;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$NameChanged;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$SubmitClicked;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$TargetAmountChanged;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$TargetDateChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CreatePoolIntent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CreatePoolIntent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$NameChanged;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "", "poolName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$NameChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPoolName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NameChanged extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent {
        public static final int $stable = 0;
        private final java.lang.String poolName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NameChanged(java.lang.String str) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAME_CHANGED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.poolName = str;
        }

        public final java.lang.String getPoolName() {
            return this.poolName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.poolName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NameChanged(poolName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.poolName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.NameChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.poolName, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.NameChanged) other).poolName);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.NameChanged copy(java.lang.String poolName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolName, "");
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.NameChanged(poolName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPoolName() {
            return this.poolName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.NameChanged copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.NameChanged nameChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = nameChanged.poolName;
            }
            return nameChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$DescriptionChanged;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$DescriptionChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DescriptionChanged extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent {
        public static final int $stable = 0;
        private final java.lang.String description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DescriptionChanged(java.lang.String str) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DESCRIPTION_CHANGED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DescriptionChanged(description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DescriptionChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DescriptionChanged) other).description);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DescriptionChanged copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DescriptionChanged(description);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DescriptionChanged copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DescriptionChanged descriptionChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = descriptionChanged.description;
            }
            return descriptionChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$BackgroundImageUrlChanged;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$BackgroundImageUrlChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackgroundImageUrlChanged extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public BackgroundImageUrlChanged(java.lang.String str) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_BACKGROUND_IMAGE_URL_CHANGED, null);
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BackgroundImageUrlChanged(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.BackgroundImageUrlChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.BackgroundImageUrlChanged) other).url);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.BackgroundImageUrlChanged copy(java.lang.String url) {
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.BackgroundImageUrlChanged(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.BackgroundImageUrlChanged copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.BackgroundImageUrlChanged backgroundImageUrlChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = backgroundImageUrlChanged.url;
            }
            return backgroundImageUrlChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$TargetAmountChanged;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "amount", "<init>", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;)V", "component1", "()Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "copy", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$TargetAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TargetAmountChanged extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.pools.domain.models.PoolAmount amount;

        public TargetAmountChanged(com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_TARGET_AMOUNT_CHANGED, null);
            this.amount = poolAmount;
        }

        public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetAmountChanged(amount=");
            sb.append(poolAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = this.amount;
            if (poolAmount == null) {
                return 0;
            }
            return poolAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetAmountChanged) other).amount);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetAmountChanged copy(com.paypal.oslo.feature.pools.domain.models.PoolAmount amount) {
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetAmountChanged(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetAmountChanged copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetAmountChanged targetAmountChanged, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                poolAmount = targetAmountChanged.amount;
            }
            return targetAmountChanged.copy(poolAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$TargetDateChanged;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "", "date", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$TargetDateChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TargetDateChanged extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent {
        public static final int $stable = 0;
        private final java.lang.String date;

        public TargetDateChanged(java.lang.String str) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_TARGET_DATE_CHANGED, null);
            this.date = str;
        }

        public final java.lang.String getDate() {
            return this.date;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.date;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetDateChanged(date=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.date;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetDateChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.date, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetDateChanged) other).date);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetDateChanged copy(java.lang.String date) {
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetDateChanged(date);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDate() {
            return this.date;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetDateChanged copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetDateChanged targetDateChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = targetDateChanged.date;
            }
            return targetDateChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$SubmitClicked;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitClicked extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.SubmitClicked INSTANCE = new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.SubmitClicked();

        public final int hashCode() {
            return 2033470425;
        }

        private SubmitClicked() {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.SubmitClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$CreationSucceeded;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "pool", "<init>", "(Lcom/paypal/oslo/feature/pools/domain/models/Pool;)V", "component1", "()Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "copy", "(Lcom/paypal/oslo/feature/pools/domain/models/Pool;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$CreationSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getPool"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreationSucceeded extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.pools.domain.models.Pool pool;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreationSucceeded(com.paypal.oslo.feature.pools.domain.models.Pool pool) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_CREATION_SUCCEEDED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "");
            this.pool = pool;
        }

        public final com.paypal.oslo.feature.pools.domain.models.Pool getPool() {
            return this.pool;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pools.domain.models.Pool pool = this.pool;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreationSucceeded(pool=");
            sb.append(pool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.pool.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.pool, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded) other).pool);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded copy(com.paypal.oslo.feature.pools.domain.models.Pool pool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "");
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded(pool);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.Pool getPool() {
            return this.pool;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded creationSucceeded, com.paypal.oslo.feature.pools.domain.models.Pool pool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pool = creationSucceeded.pool;
            }
            return creationSucceeded.copy(pool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$CreationFailed;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "", "titleRes", "descriptionRes", "<init>", "(ILjava/lang/Integer;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/Integer;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$CreationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Ljava/lang/Integer;", "getDescriptionRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreationFailed extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent {
        public static final int $stable = 0;
        private final java.lang.Integer descriptionRes;
        private final int titleRes;

        public CreationFailed(int i, java.lang.Integer num) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_CREATION_FAILED, null);
            this.titleRes = i;
            this.descriptionRes = num;
        }

        public /* synthetic */ CreationFailed(int i, java.lang.Integer num, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num);
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final java.lang.Integer getDescriptionRes() {
            return this.descriptionRes;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            java.lang.Integer num = this.descriptionRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreationFailed(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.titleRes);
            java.lang.Integer num = this.descriptionRes;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed creationFailed = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed) other;
            return this.titleRes == creationFailed.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionRes, creationFailed.descriptionRes);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed copy(int titleRes, java.lang.Integer descriptionRes) {
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed(titleRes, descriptionRes);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed creationFailed, int i, java.lang.Integer num, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = creationFailed.titleRes;
            }
            if ((i2 & 2) != 0) {
                num = creationFailed.descriptionRes;
            }
            return creationFailed.copy(i, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent$DismissError;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissError extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DismissError INSTANCE = new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DismissError();

        public final int hashCode() {
            return 1839890804;
        }

        private DismissError() {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DismissError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CreatePoolIntent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
