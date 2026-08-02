package com.paypal.oslo.feature.pools.data.mapper;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u0011*\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00060\u000fj\u0002`\u0010*\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018*\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/mapper/PoolCommonMapper;", "", "<init>", "()V", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "toPoolAmount$pools_prodRelease", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "Lcom/paypal/oslo/feature/pools/data/mapper/PoolCommonMapper$PoolBuilderParams;", "params", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "buildPool$pools_prodRelease", "(Lcom/paypal/oslo/feature/pools/data/mapper/PoolCommonMapper$PoolBuilderParams;)Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "Lcom/paypal/oslo/feature/pools/graphql/type/MoneyPoolStatus;", "Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "toPoolStatus", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;)Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "toGraphQLStatus", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;)Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolUserRole;", "Lcom/paypal/oslo/feature/pools/graphql/type/MoneyPoolUserRole;", "toGraphQLUserRole", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;)Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolUserRole;", "", "MIN_PERCENTAGE", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "MAX_PERCENTAGE", "PoolBuilderParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolCommonMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper INSTANCE = new com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper();
    public static final float MAX_PERCENTAGE = 100.0f;
    public static final float MIN_PERCENTAGE = 0.0f;

    private PoolCommonMapper() {
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount toPoolAmount$pools_prodRelease(java.lang.Object currencyCode, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.String obj = currencyCode.toString();
        java.lang.Float floatOrNull = kotlin.text.StringsKt.toFloatOrNull(value);
        return new com.paypal.oslo.feature.pools.domain.models.PoolAmount(obj, floatOrNull != null ? floatOrNull.floatValue() : 0.0f);
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00060\u0007j\u0002`\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0010\u0010-\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001cJ\u0010\u00100\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b0\u0010'J\u0010\u00101\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b1\u0010'JÌ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010 R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bC\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bD\u0010 R\u001a\u0010\f\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bE\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\b\u000e\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bG\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010*R\u001a\u0010\u0012\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bJ\u0010*R\u001a\u0010\u0013\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bK\u0010*R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\bN\u0010\u001cR\u001a\u0010\u0017\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\b\u0017\u0010'R\u001a\u0010\u0018\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\b\u0018\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/mapper/PoolCommonMapper$PoolBuilderParams;", "", "", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "backgroundImageUrl", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "Lcom/paypal/oslo/feature/pools/graphql/type/MoneyPoolStatus;", "status", "targetDate", "contributionProgressPercentage", "link", "", "isEditable", "reportUrl", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "targetAmount", "availableBalance", "totalContributionAmount", "Lcom/paypal/oslo/feature/pools/domain/models/User;", "creator", "creatorName", "isContributionEnabled", "isTransferEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Lcom/paypal/oslo/feature/pools/domain/models/User;Ljava/lang/String;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Object;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "component6", "component7", "component8", "component9", "()Z", "component10", "component11", "()Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "component12", "component13", "component14", "()Lcom/paypal/oslo/feature/pools/domain/models/User;", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Lcom/paypal/oslo/feature/pools/domain/models/User;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/pools/data/mapper/PoolCommonMapper$PoolBuilderParams;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getDescription", "Ljava/lang/Object;", "getBackgroundImageUrl", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "getStatus", "getTargetDate", "getContributionProgressPercentage", "getLink", "Z", "getReportUrl", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "getTargetAmount", "getAvailableBalance", "getTotalContributionAmount", "Lcom/paypal/oslo/feature/pools/domain/models/User;", "getCreator", "getCreatorName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PoolBuilderParams {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.pools.domain.models.PoolAmount availableBalance;
        private final java.lang.Object backgroundImageUrl;
        private final java.lang.Object contributionProgressPercentage;
        private final com.paypal.oslo.feature.pools.domain.models.User creator;
        private final java.lang.String creatorName;
        private final java.lang.String description;
        private final java.lang.String id;
        private final boolean isContributionEnabled;
        private final boolean isEditable;
        private final boolean isTransferEnabled;
        private final java.lang.Object link;
        private final java.lang.String name;
        private final java.lang.Object reportUrl;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus status;
        private final com.paypal.oslo.feature.pools.domain.models.PoolAmount targetAmount;
        private final java.lang.Object targetDate;
        private final com.paypal.oslo.feature.pools.domain.models.PoolAmount totalContributionAmount;

        public PoolBuilderParams(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus moneyPoolStatus, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, boolean z, java.lang.Object obj5, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount3, com.paypal.oslo.feature.pools.domain.models.User user, java.lang.String str4, boolean z2, boolean z3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPoolStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolAmount2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolAmount3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
            this.id = str;
            this.name = str2;
            this.description = str3;
            this.backgroundImageUrl = obj;
            this.status = moneyPoolStatus;
            this.targetDate = obj2;
            this.contributionProgressPercentage = obj3;
            this.link = obj4;
            this.isEditable = z;
            this.reportUrl = obj5;
            this.targetAmount = poolAmount;
            this.availableBalance = poolAmount2;
            this.totalContributionAmount = poolAmount3;
            this.creator = user;
            this.creatorName = str4;
            this.isContributionEnabled = z2;
            this.isTransferEnabled = z3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.Object getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus getStatus() {
            return this.status;
        }

        public final java.lang.Object getTargetDate() {
            return this.targetDate;
        }

        public final java.lang.Object getContributionProgressPercentage() {
            return this.contributionProgressPercentage;
        }

        public final java.lang.Object getLink() {
            return this.link;
        }

        public final boolean isEditable() {
            return this.isEditable;
        }

        public final java.lang.Object getReportUrl() {
            return this.reportUrl;
        }

        public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getTargetAmount() {
            return this.targetAmount;
        }

        public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getAvailableBalance() {
            return this.availableBalance;
        }

        public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getTotalContributionAmount() {
            return this.totalContributionAmount;
        }

        public final com.paypal.oslo.feature.pools.domain.models.User getCreator() {
            return this.creator;
        }

        public final java.lang.String getCreatorName() {
            return this.creatorName;
        }

        public final boolean isContributionEnabled() {
            return this.isContributionEnabled;
        }

        public final boolean isTransferEnabled() {
            return this.isTransferEnabled;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.description;
            java.lang.Object obj = this.backgroundImageUrl;
            com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus moneyPoolStatus = this.status;
            java.lang.Object obj2 = this.targetDate;
            java.lang.Object obj3 = this.contributionProgressPercentage;
            java.lang.Object obj4 = this.link;
            boolean z = this.isEditable;
            java.lang.Object obj5 = this.reportUrl;
            com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = this.targetAmount;
            com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2 = this.availableBalance;
            com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount3 = this.totalContributionAmount;
            com.paypal.oslo.feature.pools.domain.models.User user = this.creator;
            java.lang.String str4 = this.creatorName;
            boolean z2 = this.isContributionEnabled;
            boolean z3 = this.isTransferEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PoolBuilderParams(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", description=");
            sb.append(str3);
            sb.append(", backgroundImageUrl=");
            sb.append(obj);
            sb.append(", status=");
            sb.append(moneyPoolStatus);
            sb.append(", targetDate=");
            sb.append(obj2);
            sb.append(", contributionProgressPercentage=");
            sb.append(obj3);
            sb.append(", link=");
            sb.append(obj4);
            sb.append(", isEditable=");
            sb.append(z);
            sb.append(", reportUrl=");
            sb.append(obj5);
            sb.append(", targetAmount=");
            sb.append(poolAmount);
            sb.append(", availableBalance=");
            sb.append(poolAmount2);
            sb.append(", totalContributionAmount=");
            sb.append(poolAmount3);
            sb.append(", creator=");
            sb.append(user);
            sb.append(", creatorName=");
            sb.append(str4);
            sb.append(", isContributionEnabled=");
            sb.append(z2);
            sb.append(", isTransferEnabled=");
            sb.append(z3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.String str = this.description;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.backgroundImageUrl;
            int hashCode4 = obj == null ? 0 : obj.hashCode();
            int hashCode5 = this.status.hashCode();
            java.lang.Object obj2 = this.targetDate;
            int hashCode6 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Object obj3 = this.contributionProgressPercentage;
            int hashCode7 = obj3 == null ? 0 : obj3.hashCode();
            int hashCode8 = this.link.hashCode();
            int hashCode9 = java.lang.Boolean.hashCode(this.isEditable);
            java.lang.Object obj4 = this.reportUrl;
            int hashCode10 = obj4 == null ? 0 : obj4.hashCode();
            com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = this.targetAmount;
            int hashCode11 = poolAmount == null ? 0 : poolAmount.hashCode();
            int hashCode12 = this.availableBalance.hashCode();
            int hashCode13 = this.totalContributionAmount.hashCode();
            int hashCode14 = this.creator.hashCode();
            java.lang.String str2 = this.creatorName;
            return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isContributionEnabled)) * 31) + java.lang.Boolean.hashCode(this.isTransferEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.PoolBuilderParams)) {
                return false;
            }
            com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.PoolBuilderParams poolBuilderParams = (com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.PoolBuilderParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, poolBuilderParams.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, poolBuilderParams.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, poolBuilderParams.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundImageUrl, poolBuilderParams.backgroundImageUrl) && this.status == poolBuilderParams.status && kotlin.jvm.internal.Intrinsics.areEqual(this.targetDate, poolBuilderParams.targetDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.contributionProgressPercentage, poolBuilderParams.contributionProgressPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.link, poolBuilderParams.link) && this.isEditable == poolBuilderParams.isEditable && kotlin.jvm.internal.Intrinsics.areEqual(this.reportUrl, poolBuilderParams.reportUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, poolBuilderParams.targetAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableBalance, poolBuilderParams.availableBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalContributionAmount, poolBuilderParams.totalContributionAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.creator, poolBuilderParams.creator) && kotlin.jvm.internal.Intrinsics.areEqual(this.creatorName, poolBuilderParams.creatorName) && this.isContributionEnabled == poolBuilderParams.isContributionEnabled && this.isTransferEnabled == poolBuilderParams.isTransferEnabled;
        }

        public final com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.PoolBuilderParams copy(java.lang.String id, java.lang.String name2, java.lang.String description, java.lang.Object backgroundImageUrl, com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus status, java.lang.Object targetDate, java.lang.Object contributionProgressPercentage, java.lang.Object link, boolean isEditable, java.lang.Object reportUrl, com.paypal.oslo.feature.pools.domain.models.PoolAmount targetAmount, com.paypal.oslo.feature.pools.domain.models.PoolAmount availableBalance, com.paypal.oslo.feature.pools.domain.models.PoolAmount totalContributionAmount, com.paypal.oslo.feature.pools.domain.models.User creator, java.lang.String creatorName, boolean isContributionEnabled, boolean isTransferEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableBalance, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalContributionAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creator, "");
            return new com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.PoolBuilderParams(id, name2, description, backgroundImageUrl, status, targetDate, contributionProgressPercentage, link, isEditable, reportUrl, targetAmount, availableBalance, totalContributionAmount, creator, creatorName, isContributionEnabled, isTransferEnabled);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsEditable() {
            return this.isEditable;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getLink() {
            return this.link;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getContributionProgressPercentage() {
            return this.contributionProgressPercentage;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getTargetDate() {
            return this.targetDate;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getIsTransferEnabled() {
            return this.isTransferEnabled;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getIsContributionEnabled() {
            return this.isContributionEnabled;
        }

        /* renamed from: component15, reason: from getter */
        public final java.lang.String getCreatorName() {
            return this.creatorName;
        }

        /* renamed from: component14, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.User getCreator() {
            return this.creator;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getTotalContributionAmount() {
            return this.totalContributionAmount;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getAvailableBalance() {
            return this.availableBalance;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getTargetAmount() {
            return this.targetAmount;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Object getReportUrl() {
            return this.reportUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool buildPool$pools_prodRelease(com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.PoolBuilderParams params) {
        java.lang.String obj;
        java.lang.Float floatOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        java.lang.String id = params.getId();
        java.lang.String name2 = params.getName();
        java.lang.String description = params.getDescription();
        java.lang.Object backgroundImageUrl = params.getBackgroundImageUrl();
        java.lang.String obj2 = backgroundImageUrl != null ? backgroundImageUrl.toString() : null;
        java.lang.String creatorName = params.getCreatorName();
        com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus = toPoolStatus(params.getStatus());
        com.paypal.oslo.feature.pools.domain.models.User creator = params.getCreator();
        com.paypal.oslo.feature.pools.domain.models.PoolAmount targetAmount = params.getTargetAmount();
        java.lang.Object targetDate = params.getTargetDate();
        java.lang.String obj3 = targetDate != null ? targetDate.toString() : null;
        com.paypal.oslo.feature.pools.domain.models.PoolAmount availableBalance = params.getAvailableBalance();
        com.paypal.oslo.feature.pools.domain.models.PoolAmount totalContributionAmount = params.getTotalContributionAmount();
        java.lang.Object contributionProgressPercentage = params.getContributionProgressPercentage();
        float coerceIn = (contributionProgressPercentage == null || (obj = contributionProgressPercentage.toString()) == null || (floatOrNull = kotlin.text.StringsKt.toFloatOrNull(obj)) == null) ? 0.0f : kotlin.ranges.RangesKt.coerceIn(floatOrNull.floatValue(), 0.0f, 100.0f);
        java.lang.String obj4 = params.getLink().toString();
        boolean isContributionEnabled = params.isContributionEnabled();
        boolean isTransferEnabled = params.isTransferEnabled();
        boolean isEditable = params.isEditable();
        java.lang.Object reportUrl = params.getReportUrl();
        return new com.paypal.oslo.feature.pools.domain.models.Pool(id, name2, description, obj2, creatorName, poolStatus, creator, targetAmount, obj3, availableBalance, totalContributionAmount, coerceIn, obj4, isTransferEnabled, isContributionEnabled, isEditable, reportUrl != null ? reportUrl.toString() : null);
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolStatus toPoolStatus(com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus moneyPoolStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPoolStatus, "");
        int i = com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.WhenMappings.$EnumSwitchMapping$0[moneyPoolStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.pools.domain.models.PoolStatus.CLOSED;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.pools.domain.models.PoolStatus.UNKNOWN__;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus toGraphQLStatus(com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolStatus, "");
        int i = com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.WhenMappings.$EnumSwitchMapping$1[poolStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus.ACTIVE;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus.CLOSED;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus.UNKNOWN__;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole toGraphQLUserRole(com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolUserRole, "");
        int i = com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.WhenMappings.$EnumSwitchMapping$2[poolUserRole.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole.CREATOR;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole.CONTRIBUTOR;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole.UNKNOWN__;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus.CLOSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.pools.domain.models.PoolStatus.values().length];
            try {
                iArr2[com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.pools.domain.models.PoolStatus.CLOSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.pools.domain.models.PoolStatus.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.pools.domain.models.PoolUserRole.values().length];
            try {
                iArr3[com.paypal.oslo.feature.pools.domain.models.PoolUserRole.CREATOR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.paypal.oslo.feature.pools.domain.models.PoolUserRole.CONTRIBUTOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[com.paypal.oslo.feature.pools.domain.models.PoolUserRole.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
