package com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType;", "", "Linear", "Avatar", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType$Avatar;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType$Linear;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType$None;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface OfferProgressType {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType$Linear;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType;", "", "percentCompleted", "percentRemaining", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType$Linear;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getPercentCompleted", "getPercentRemaining"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Linear implements com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType {
        public static final int $stable = 0;
        private final float percentCompleted;
        private final float percentRemaining;

        public Linear(float f, float f2) {
            this.percentCompleted = f;
            this.percentRemaining = f2;
        }

        public final float getPercentCompleted() {
            return this.percentCompleted;
        }

        public final float getPercentRemaining() {
            return this.percentRemaining;
        }

        public final java.lang.String toString() {
            float f = this.percentCompleted;
            float f2 = this.percentRemaining;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Linear(percentCompleted=");
            sb.append(f);
            sb.append(", percentRemaining=");
            sb.append(f2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Float.hashCode(this.percentCompleted) * 31) + java.lang.Float.hashCode(this.percentRemaining);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear linear = (com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear) other;
            return java.lang.Float.compare(this.percentCompleted, linear.percentCompleted) == 0 && java.lang.Float.compare(this.percentRemaining, linear.percentRemaining) == 0;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear copy(float percentCompleted, float percentRemaining) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear(percentCompleted, percentRemaining);
        }

        /* renamed from: component2, reason: from getter */
        public final float getPercentRemaining() {
            return this.percentRemaining;
        }

        /* renamed from: component1, reason: from getter */
        public final float getPercentCompleted() {
            return this.percentCompleted;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear linear, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = linear.percentCompleted;
            }
            if ((i & 2) != 0) {
                f2 = linear.percentRemaining;
            }
            return linear.copy(f, f2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType$Avatar;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType;", "", "progressValue", "maxValue", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType$Avatar;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getProgressValue", "getMaxValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Avatar implements com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType {
        public static final int $stable = 0;
        private final int maxValue;
        private final int progressValue;

        public Avatar(int i, int i2) {
            this.progressValue = i;
            this.maxValue = i2;
        }

        public final int getProgressValue() {
            return this.progressValue;
        }

        public final int getMaxValue() {
            return this.maxValue;
        }

        public final java.lang.String toString() {
            int i = this.progressValue;
            int i2 = this.maxValue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Avatar(progressValue=");
            sb.append(i);
            sb.append(", maxValue=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.progressValue) * 31) + java.lang.Integer.hashCode(this.maxValue);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar avatar = (com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar) other;
            return this.progressValue == avatar.progressValue && this.maxValue == avatar.maxValue;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar copy(int progressValue, int maxValue) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar(progressValue, maxValue);
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxValue() {
            return this.maxValue;
        }

        /* renamed from: component1, reason: from getter */
        public final int getProgressValue() {
            return this.progressValue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar avatar, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = avatar.progressValue;
            }
            if ((i3 & 2) != 0) {
                i2 = avatar.maxValue;
            }
            return avatar.copy(i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType$None;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None implements com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.None INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.None();

        public final int hashCode() {
            return 962250371;
        }

        private None() {
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.None)) {
                return false;
            }
            return true;
        }
    }
}
