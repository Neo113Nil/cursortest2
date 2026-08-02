package com.paypal.oslo.feature.pools.data.mapper;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\n\u001a\u00020\t*\u00020\f¢\u0006\u0004\b\n\u0010\rJ\u0011\u0010\n\u001a\u00020\t*\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fJ\u0011\u0010\n\u001a\u00020\t*\u00020\u0010¢\u0006\u0004\b\n\u0010\u0011J\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/mapper/PoolDetailMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$MoneyPool;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "toPool", "(Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$MoneyPool;)Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TargetAmount;", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "toPoolAmount", "(Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TargetAmount;)Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TotalContributionAmount;", "(Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TotalContributionAmount;)Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AvailableBalance;", "(Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AvailableBalance;)Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AccountBalance;", "(Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AccountBalance;)Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Creator;", "Lcom/paypal/oslo/feature/pools/domain/models/User;", "toUser", "(Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Creator;)Lcom/paypal/oslo/feature/pools/domain/models/User;", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Name;", "Lcom/paypal/oslo/feature/pools/domain/models/UserName;", "toUserName", "(Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Name;)Lcom/paypal/oslo/feature/pools/domain/models/UserName;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolDetailMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.pools.data.mapper.PoolDetailMapper INSTANCE = new com.paypal.oslo.feature.pools.data.mapper.PoolDetailMapper();

    private PoolDetailMapper() {
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool toPool(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool moneyPool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPool, "");
        com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper poolCommonMapper = com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE;
        java.lang.String id = moneyPool.getId();
        java.lang.String name2 = moneyPool.getName();
        java.lang.String description = moneyPool.getDescription();
        java.lang.Object backgroundImageUrl = moneyPool.getBackgroundImageUrl();
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus status = moneyPool.getStatus();
        java.lang.Object targetDate = moneyPool.getTargetDate();
        java.lang.Object contributionProgressPercentage = moneyPool.getContributionProgressPercentage();
        java.lang.Object link = moneyPool.getLink();
        boolean isEditable = moneyPool.isEditable();
        java.lang.Object reportUrl = moneyPool.getReportUrl();
        com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount targetAmount = moneyPool.getTargetAmount();
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = targetAmount != null ? toPoolAmount(targetAmount) : null;
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2 = toPoolAmount(moneyPool.getAvailableBalance());
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount3 = toPoolAmount(moneyPool.getTotalContributionAmount());
        com.paypal.oslo.feature.pools.domain.models.User user = toUser(moneyPool.getCreator());
        com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name3 = moneyPool.getCreator().getName();
        java.lang.String fullName = name3 != null ? name3.getFullName() : null;
        com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata metadata = moneyPool.getMetadata();
        boolean z = metadata != null && metadata.isContributionEnabled();
        com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata metadata2 = moneyPool.getMetadata();
        return poolCommonMapper.buildPool$pools_prodRelease(new com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.PoolBuilderParams(id, name2, description, backgroundImageUrl, status, targetDate, contributionProgressPercentage, link, isEditable, reportUrl, poolAmount, poolAmount2, poolAmount3, user, fullName, z, metadata2 != null && metadata2.isTransferEnabled()));
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount toPoolAmount(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount targetAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
        return com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE.toPoolAmount$pools_prodRelease(targetAmount.getCurrencyCode(), targetAmount.getValue());
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount toPoolAmount(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount totalContributionAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalContributionAmount, "");
        return com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE.toPoolAmount$pools_prodRelease(totalContributionAmount.getCurrencyCode(), totalContributionAmount.getValue());
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount toPoolAmount(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance availableBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableBalance, "");
        return com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE.toPoolAmount$pools_prodRelease(availableBalance.getCurrencyCode(), availableBalance.getValue());
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount toPoolAmount(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance accountBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountBalance, "");
        return com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE.toPoolAmount$pools_prodRelease(accountBalance.getCurrencyCode(), accountBalance.getValue());
    }

    public final com.paypal.oslo.feature.pools.domain.models.User toUser(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator creator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creator, "");
        java.lang.String obj = creator.getId().toString();
        com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name2 = creator.getName();
        com.paypal.oslo.feature.pools.domain.models.UserName userName = name2 != null ? toUserName(name2) : null;
        java.lang.Object profilePhotoUrl = creator.getProfilePhotoUrl();
        java.lang.String obj2 = profilePhotoUrl != null ? profilePhotoUrl.toString() : null;
        com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance accountBalance = creator.getAccountBalance();
        return new com.paypal.oslo.feature.pools.domain.models.User(obj, userName, obj2, accountBalance != null ? toPoolAmount(accountBalance) : null);
    }

    public final com.paypal.oslo.feature.pools.domain.models.UserName toUserName(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.pools.domain.models.UserName(name2.getPrefix(), name2.getGivenName(), name2.getSurname(), name2.getMiddleName(), name2.getSuffix(), name2.getFullName());
    }
}
