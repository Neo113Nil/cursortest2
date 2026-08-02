package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;", "", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethod;", "redeemMethods", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRedeemMethods", "RedeemMethod", "RedeemMethodData", "RedeemType", "RedeemEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RedeemContent {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod> redeemMethods;

    public RedeemContent(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.redeemMethods = list;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod> getRedeemMethods() {
        return this.redeemMethods;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b&\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethod;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "redeemType", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "imageUrl", "buttonLabel", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethod;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "getRedeemType", "Ljava/lang/String;", "getTitle", "getDescription", "getImageUrl", "getButtonLabel", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RedeemMethod {
        public static final int $stable = 8;
        private final java.lang.String buttonLabel;
        private final java.lang.String description;
        private final androidx.navigation3.runtime.NavKey destination;
        private final java.lang.String imageUrl;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType;
        private final java.lang.String title;

        public RedeemMethod(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.navigation3.runtime.NavKey navKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.redeemType = redeemType;
            this.title = str;
            this.description = str2;
            this.imageUrl = str3;
            this.buttonLabel = str4;
            this.destination = navKey;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String getImageUrl() {
            return this.imageUrl;
        }

        public final java.lang.String getButtonLabel() {
            return this.buttonLabel;
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType = this.redeemType;
            java.lang.String str = this.title;
            java.lang.String str2 = this.description;
            java.lang.String str3 = this.imageUrl;
            java.lang.String str4 = this.buttonLabel;
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemMethod(redeemType=");
            sb.append(redeemType);
            sb.append(", title=");
            sb.append(str);
            sb.append(", description=");
            sb.append(str2);
            sb.append(", imageUrl=");
            sb.append(str3);
            sb.append(", buttonLabel=");
            sb.append(str4);
            sb.append(", destination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.redeemType.hashCode();
            int hashCode2 = this.title.hashCode();
            int hashCode3 = this.description.hashCode();
            int hashCode4 = this.imageUrl.hashCode();
            int hashCode5 = this.buttonLabel.hashCode();
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (navKey == null ? 0 : navKey.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod redeemMethod = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod) other;
            return this.redeemType == redeemMethod.redeemType && kotlin.jvm.internal.Intrinsics.areEqual(this.title, redeemMethod.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, redeemMethod.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, redeemMethod.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonLabel, redeemMethod.buttonLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, redeemMethod.destination);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType, java.lang.String title, java.lang.String description, java.lang.String imageUrl, java.lang.String buttonLabel, androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonLabel, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod(redeemType, title, description, imageUrl, buttonLabel, destination);
        }

        /* renamed from: component6, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getButtonLabel() {
            return this.buttonLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod redeemMethod, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemType = redeemMethod.redeemType;
            }
            if ((i & 2) != 0) {
                str = redeemMethod.title;
            }
            java.lang.String str5 = str;
            if ((i & 4) != 0) {
                str2 = redeemMethod.description;
            }
            java.lang.String str6 = str2;
            if ((i & 8) != 0) {
                str3 = redeemMethod.imageUrl;
            }
            java.lang.String str7 = str3;
            if ((i & 16) != 0) {
                str4 = redeemMethod.buttonLabel;
            }
            java.lang.String str8 = str4;
            if ((i & 32) != 0) {
                navKey = redeemMethod.destination;
            }
            return redeemMethod.copy(redeemType, str5, str6, str7, str8, navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b&\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethodData;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "redeemType", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "imageUrl", "buttonLabel", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethodData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "getRedeemType", "Ljava/lang/String;", "getTitle", "getDescription", "getImageUrl", "getButtonLabel", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RedeemMethodData {
        public static final int $stable = 8;
        private final java.lang.String buttonLabel;
        private final java.lang.String description;
        private final androidx.navigation3.runtime.NavKey destination;
        private final java.lang.String imageUrl;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType;
        private final java.lang.String title;

        public RedeemMethodData(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.navigation3.runtime.NavKey navKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.redeemType = redeemType;
            this.title = str;
            this.description = str2;
            this.imageUrl = str3;
            this.buttonLabel = str4;
            this.destination = navKey;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String getImageUrl() {
            return this.imageUrl;
        }

        public final java.lang.String getButtonLabel() {
            return this.buttonLabel;
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType = this.redeemType;
            java.lang.String str = this.title;
            java.lang.String str2 = this.description;
            java.lang.String str3 = this.imageUrl;
            java.lang.String str4 = this.buttonLabel;
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemMethodData(redeemType=");
            sb.append(redeemType);
            sb.append(", title=");
            sb.append(str);
            sb.append(", description=");
            sb.append(str2);
            sb.append(", imageUrl=");
            sb.append(str3);
            sb.append(", buttonLabel=");
            sb.append(str4);
            sb.append(", destination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.redeemType.hashCode();
            int hashCode2 = this.title.hashCode();
            int hashCode3 = this.description.hashCode();
            int hashCode4 = this.imageUrl.hashCode();
            int hashCode5 = this.buttonLabel.hashCode();
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (navKey == null ? 0 : navKey.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData redeemMethodData = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData) other;
            return this.redeemType == redeemMethodData.redeemType && kotlin.jvm.internal.Intrinsics.areEqual(this.title, redeemMethodData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, redeemMethodData.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, redeemMethodData.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonLabel, redeemMethodData.buttonLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, redeemMethodData.destination);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType, java.lang.String title, java.lang.String description, java.lang.String imageUrl, java.lang.String buttonLabel, androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonLabel, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData(redeemType, title, description, imageUrl, buttonLabel, destination);
        }

        /* renamed from: component6, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getButtonLabel() {
            return this.buttonLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData redeemMethodData, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemType = redeemMethodData.redeemType;
            }
            if ((i & 2) != 0) {
                str = redeemMethodData.title;
            }
            java.lang.String str5 = str;
            if ((i & 4) != 0) {
                str2 = redeemMethodData.description;
            }
            java.lang.String str6 = str2;
            if ((i & 8) != 0) {
                str3 = redeemMethodData.imageUrl;
            }
            java.lang.String str7 = str3;
            if ((i & 16) != 0) {
                str4 = redeemMethodData.buttonLabel;
            }
            java.lang.String str8 = str4;
            if ((i & 32) != 0) {
                navKey = redeemMethodData.destination;
            }
            return redeemMethodData.copy(redeemType, str5, str6, str7, str8, navKey);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "", "<init>", "(Ljava/lang/String;I)V", "USE_AT_CHECKOUT", "REDEEM_TO_BALANCE", "REDEEM_TO_SAVINGS", "REDEEM_TO_GIVING"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RedeemType {
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType REDEEM_TO_BALANCE;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType REDEEM_TO_GIVING;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType REDEEM_TO_SAVINGS;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType USE_AT_CHECKOUT;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType[] getHighSpeedVideoSizes;

        private RedeemType(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType("USE_AT_CHECKOUT", 0);
            USE_AT_CHECKOUT = redeemType;
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType2 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType("REDEEM_TO_BALANCE", 1);
            REDEEM_TO_BALANCE = redeemType2;
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType3 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType("REDEEM_TO_SAVINGS", 2);
            REDEEM_TO_SAVINGS = redeemType3;
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType4 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType("REDEEM_TO_GIVING", 3);
            REDEEM_TO_GIVING = redeemType4;
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType[] redeemTypeArr = {redeemType, redeemType2, redeemType3, redeemType4};
            getHighSpeedVideoSizes = redeemTypeArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(redeemTypeArr);
        }

        public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType[] values() {
            return (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemEligibility;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "redeemType", "", "isEligible", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;Z)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;Z)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemEligibility;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemType;", "getRedeemType", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RedeemEligibility {
        public static final int $stable = 0;
        private final boolean isEligible;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType;

        public RedeemEligibility(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            this.redeemType = redeemType;
            this.isEligible = z;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final boolean isEligible() {
            return this.isEligible;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType = this.redeemType;
            boolean z = this.isEligible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemEligibility(redeemType=");
            sb.append(redeemType);
            sb.append(", isEligible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.redeemType.hashCode() * 31) + java.lang.Boolean.hashCode(this.isEligible);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility redeemEligibility = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility) other;
            return this.redeemType == redeemEligibility.redeemType && this.isEligible == redeemEligibility.isEligible;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType, boolean isEligible) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility(redeemType, isEligible);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEligible() {
            return this.isEligible;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility redeemEligibility, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType redeemType, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemType = redeemEligibility.redeemType;
            }
            if ((i & 2) != 0) {
                z = redeemEligibility.isEligible;
            }
            return redeemEligibility.copy(redeemType, z);
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod> list = this.redeemMethods;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemContent(redeemMethods=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.redeemMethods.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemMethods, ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent) other).redeemMethods);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod> redeemMethods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemMethods, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent(redeemMethods);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod> component1() {
        return this.redeemMethods;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = redeemContent.redeemMethods;
        }
        return redeemContent.copy(list);
    }
}
