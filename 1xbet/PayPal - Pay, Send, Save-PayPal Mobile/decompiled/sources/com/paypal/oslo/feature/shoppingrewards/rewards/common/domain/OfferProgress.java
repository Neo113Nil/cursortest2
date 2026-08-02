package com.paypal.oslo.feature.shoppingrewards.rewards.common.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Discreet", "Continuous", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$Continuous;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$Discreet;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$None;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class OfferProgress {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$None;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class None extends com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None();

        public final int hashCode() {
            return 690096753;
        }

        private None() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None)) {
                return false;
            }
            return true;
        }
    }

    private OfferProgress() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$Discreet;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "", "progressValue", "maxProgressValue", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$Discreet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getProgressValue", "getMaxProgressValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Discreet extends com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress {
        public static final int $stable = 0;
        private final int maxProgressValue;
        private final int progressValue;

        public Discreet(int i, int i2) {
            super(null);
            this.progressValue = i;
            this.maxProgressValue = i2;
        }

        public final int getProgressValue() {
            return this.progressValue;
        }

        public final int getMaxProgressValue() {
            return this.maxProgressValue;
        }

        public final java.lang.String toString() {
            int i = this.progressValue;
            int i2 = this.maxProgressValue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Discreet(progressValue=");
            sb.append(i);
            sb.append(", maxProgressValue=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.progressValue) * 31) + java.lang.Integer.hashCode(this.maxProgressValue);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet discreet = (com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet) other;
            return this.progressValue == discreet.progressValue && this.maxProgressValue == discreet.maxProgressValue;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet copy(int progressValue, int maxProgressValue) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet(progressValue, maxProgressValue);
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxProgressValue() {
            return this.maxProgressValue;
        }

        /* renamed from: component1, reason: from getter */
        public final int getProgressValue() {
            return this.progressValue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet discreet, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = discreet.progressValue;
            }
            if ((i3 & 2) != 0) {
                i2 = discreet.maxProgressValue;
            }
            return discreet.copy(i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$Continuous;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "", "percentCompleted", "percentRemaining", "", "showProgressBar", "<init>", "(FFZ)V", "component1", "()F", "component2", "component3", "()Z", "copy", "(FFZ)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$Continuous;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getPercentCompleted", "getPercentRemaining", "Z", "getShowProgressBar"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Continuous extends com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress {
        public static final int $stable = 0;
        private final float percentCompleted;
        private final float percentRemaining;
        private final boolean showProgressBar;

        public Continuous(float f, float f2, boolean z) {
            super(null);
            this.percentCompleted = f;
            this.percentRemaining = f2;
            this.showProgressBar = z;
        }

        public /* synthetic */ Continuous(float f, float f2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, (i & 4) != 0 ? true : z);
        }

        public final float getPercentCompleted() {
            return this.percentCompleted;
        }

        public final float getPercentRemaining() {
            return this.percentRemaining;
        }

        public final boolean getShowProgressBar() {
            return this.showProgressBar;
        }

        public final java.lang.String toString() {
            float f = this.percentCompleted;
            float f2 = this.percentRemaining;
            boolean z = this.showProgressBar;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuous(percentCompleted=");
            sb.append(f);
            sb.append(", percentRemaining=");
            sb.append(f2);
            sb.append(", showProgressBar=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Float.hashCode(this.percentCompleted) * 31) + java.lang.Float.hashCode(this.percentRemaining)) * 31) + java.lang.Boolean.hashCode(this.showProgressBar);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous continuous = (com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous) other;
            return java.lang.Float.compare(this.percentCompleted, continuous.percentCompleted) == 0 && java.lang.Float.compare(this.percentRemaining, continuous.percentRemaining) == 0 && this.showProgressBar == continuous.showProgressBar;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous copy(float percentCompleted, float percentRemaining, boolean showProgressBar) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous(percentCompleted, percentRemaining, showProgressBar);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowProgressBar() {
            return this.showProgressBar;
        }

        /* renamed from: component2, reason: from getter */
        public final float getPercentRemaining() {
            return this.percentRemaining;
        }

        /* renamed from: component1, reason: from getter */
        public final float getPercentCompleted() {
            return this.percentCompleted;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous continuous, float f, float f2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = continuous.percentCompleted;
            }
            if ((i & 2) != 0) {
                f2 = continuous.percentRemaining;
            }
            if ((i & 4) != 0) {
                z = continuous.showProgressBar;
            }
            return continuous.copy(f, f2, z);
        }
    }

    public /* synthetic */ OfferProgress(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
