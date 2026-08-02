package com.paypal.oslo.feature.pools.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/mapper/CreatePoolMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/pools/graphql/CreatePoolsMoneyPoolMutation$MoneyPool;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "toPool", "(Lcom/paypal/oslo/feature/pools/graphql/CreatePoolsMoneyPoolMutation$MoneyPool;)Lcom/paypal/oslo/feature/pools/domain/models/Pool;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreatePoolMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.pools.data.mapper.CreatePoolMapper INSTANCE = new com.paypal.oslo.feature.pools.data.mapper.CreatePoolMapper();

    private CreatePoolMapper() {
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool toPool(com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.MoneyPool moneyPool) {
        com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper poolCommonMapper;
        com.paypal.oslo.feature.pools.domain.models.UserName userName;
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount;
        java.lang.String str;
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2;
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount3;
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPool, "");
        com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper poolCommonMapper2 = com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE;
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
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.TargetAmount targetAmount = moneyPool.getTargetAmount();
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount$pools_prodRelease = targetAmount != null ? com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE.toPoolAmount$pools_prodRelease(targetAmount.getCurrencyCode(), targetAmount.getValue()) : null;
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.AvailableBalance availableBalance = moneyPool.getAvailableBalance();
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount$pools_prodRelease2 = com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE.toPoolAmount$pools_prodRelease(availableBalance.getCurrencyCode(), availableBalance.getValue());
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.TotalContributionAmount totalContributionAmount = moneyPool.getTotalContributionAmount();
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount$pools_prodRelease3 = com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE.toPoolAmount$pools_prodRelease(totalContributionAmount.getCurrencyCode(), totalContributionAmount.getValue());
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.Creator creator = moneyPool.getCreator();
        java.lang.String obj = creator.getId().toString();
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.Name name3 = creator.getName();
        if (name3 != null) {
            poolCommonMapper = poolCommonMapper2;
            userName = new com.paypal.oslo.feature.pools.domain.models.UserName(name3.getPrefix(), name3.getGivenName(), name3.getSurname(), name3.getMiddleName(), name3.getSuffix(), name3.getFullName());
        } else {
            poolCommonMapper = poolCommonMapper2;
            userName = null;
        }
        java.lang.Object profilePhotoUrl = creator.getProfilePhotoUrl();
        if (profilePhotoUrl != null) {
            java.lang.String obj2 = profilePhotoUrl.toString();
            poolAmount = poolAmount$pools_prodRelease3;
            str = obj2;
        } else {
            poolAmount = poolAmount$pools_prodRelease3;
            str = null;
        }
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.AccountBalance accountBalance = creator.getAccountBalance();
        if (accountBalance != null) {
            poolAmount3 = poolAmount$pools_prodRelease2;
            poolAmount2 = poolAmount$pools_prodRelease;
            poolAmount4 = com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE.toPoolAmount$pools_prodRelease(accountBalance.getCurrencyCode(), accountBalance.getValue());
        } else {
            poolAmount2 = poolAmount$pools_prodRelease;
            poolAmount3 = poolAmount$pools_prodRelease2;
            poolAmount4 = null;
        }
        com.paypal.oslo.feature.pools.domain.models.User user = new com.paypal.oslo.feature.pools.domain.models.User(obj, userName, str, poolAmount4);
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.Name name4 = moneyPool.getCreator().getName();
        java.lang.String fullName = name4 != null ? name4.getFullName() : null;
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.Metadata metadata = moneyPool.getMetadata();
        boolean z = metadata != null && metadata.isContributionEnabled();
        com.paypal.oslo.feature.pools.graphql.CreatePoolsMoneyPoolMutation.Metadata metadata2 = moneyPool.getMetadata();
        return poolCommonMapper.buildPool$pools_prodRelease(new com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.PoolBuilderParams(id, name2, description, backgroundImageUrl, status, targetDate, contributionProgressPercentage, link, isEditable, reportUrl, poolAmount2, poolAmount3, poolAmount, user, fullName, z, metadata2 != null && metadata2.isTransferEnabled()));
    }
}
