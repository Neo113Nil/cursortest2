package com.paypal.oslo.feature.activity.domain.base.utils.extensions;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\b*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;", "Lcom/paypal/oslo/feature/activity/domain/base/alias/QueryActivityItemFragment;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$Transaction;", "mapToDomainActivityItem", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$Transaction;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "toActivityCounterPartyAmountInformation", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardInfo;", "toActivityRewardInfo", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardInfo;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitySubdomainFragment;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;", "toActivitySubdomain", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitySubdomainFragment;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;", "", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "toActivityActionItems", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;)Ljava/util/List;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/RedeemedRewardInfoItem;", "toActivityRedeemedRewardInfo"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityItemsDomainBaseResultExtensionsKt {
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction mapToDomainActivityItem(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment activityItemFragment) {
        java.lang.Object obj;
        com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivitySubdomainFragment activitySubdomainFragment;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragment activityPartnerFragment;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment;
        com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Credit credit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityItemFragment, "");
        java.lang.String id = activityItemFragment.getId();
        java.lang.String groupId = activityItemFragment.getGroupId();
        java.lang.String str = groupId == null ? "" : groupId;
        java.lang.String invoiceId = activityItemFragment.getInvoiceId();
        com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar = com.paypal.oslo.feature.activity.domain.common.extensions.ActivityAvatarMapperExtensionsKt.toCounterPartyAvatar(activityItemFragment.getAvatar().getActivityAvatarDetailFragment());
        java.lang.String displayName = activityItemFragment.getCounterparty().getActivityCounterpartyDetailFragment().getDisplayName();
        java.lang.String displayDateTimeFormat$activity_prodRelease = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.toDisplayDateTimeFormat$activity_prodRelease(activityItemFragment.getCreatedTime().toString(), activityItemFragment.getDisplayDateFormat());
        java.lang.String obj2 = activityItemFragment.getCreatedTime().toString();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation = toActivityCounterPartyAmountInformation(activityItemFragment);
        java.lang.String shortDescription = activityItemFragment.getShortDescription();
        java.lang.String displayStatus = activityItemFragment.getDisplayStatus();
        java.lang.String etaNote = activityItemFragment.getEtaNote();
        java.util.Iterator it = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new java.lang.String[]{activityItemFragment.getUserNote(), activityItemFragment.getSystemNote(), activityItemFragment.getTransactionNote()}).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.lang.String str2 = (java.lang.String) obj;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                break;
            }
        }
        java.lang.String str3 = (java.lang.String) obj;
        com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo activityRewardInfo = toActivityRewardInfo(activityItemFragment);
        com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection = activityItemFragment.getMoneyMovementDirection();
        if (moneyMovementDirection != null) {
            int i = com.paypal.oslo.feature.activity.domain.base.utils.extensions.ActivityItemsDomainBaseResultExtensionsKt.WhenMappings.$EnumSwitchMapping$0[moneyMovementDirection.ordinal()];
            if (i == 1) {
                credit = com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Credit.INSTANCE;
            } else if (i == 2) {
                credit = com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Debit.INSTANCE;
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                credit = com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown.INSTANCE;
            }
            activityMoneyMovementDirection = credit;
        } else {
            activityMoneyMovementDirection = null;
        }
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> activityActionItems = toActivityActionItems(activityItemFragment);
        com.paypal.oslo.api.graphql.schema.type.ActivityType type = activityItemFragment.getType();
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus status = activityItemFragment.getStatus();
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.ShipmentPackage> shipmentPackages = activityItemFragment.getShipmentPackages();
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> activityShipmentPackages = shipmentPackages != null ? com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityShipmentPackagesMapper.INSTANCE.toActivityShipmentPackages(shipmentPackages) : null;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Flags flags = activityItemFragment.getFlags();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags = (flags == null || (activityFlagsFragment = flags.getActivityFlagsFragment()) == null) ? null : com.paypal.oslo.feature.activity.domain.common.extensions.ActivityModelMapperExtensionsKt.toActivityFlags(activityFlagsFragment);
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Partner partner = activityItemFragment.getPartner();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo = (partner == null || (activityPartnerFragment = partner.getActivityPartnerFragment()) == null) ? null : com.paypal.oslo.feature.activity.domain.common.extensions.ActivityModelMapperExtensionsKt.toActivityPartnerInfo(activityPartnerFragment);
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Subdomain subdomain = activityItemFragment.getSubdomain();
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction(new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel(id, str, invoiceId, counterPartyAvatar, displayName, displayDateTimeFormat$activity_prodRelease, obj2, activityCounterPartyAmountInformation, shortDescription, displayStatus, etaNote, str3, activityRewardInfo, activityMoneyMovementDirection, activityActionItems, type, status, activityShipmentPackages, activityFlags, activityPartnerInfo, (subdomain == null || (activitySubdomainFragment = subdomain.getActivitySubdomainFragment()) == null) ? null : toActivitySubdomain(activitySubdomainFragment), activityItemFragment.getChannels(), activityItemFragment.getPurposes()), 0L, 2, null);
    }

    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation toActivityCounterPartyAmountInformation(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment activityItemFragment) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount amount;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment;
        java.lang.Object currencyCode;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount amount2;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment2;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity cryptoAssetQuantity;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.AmountInfo amountInfo;
        java.lang.String str = null;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment activityAmountInfoFragment = (activityItemFragment == null || (amountInfo = activityItemFragment.getAmountInfo()) == null) ? null : amountInfo.getActivityAmountInfoFragment();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation activityCryptoAssetQuantityInformation = (activityAmountInfoFragment == null || (cryptoAssetQuantity = activityAmountInfoFragment.getCryptoAssetQuantity()) == null || (activityCryptoAssetQuantityFragment = cryptoAssetQuantity.getActivityCryptoAssetQuantityFragment()) == null) ? null : com.paypal.oslo.feature.activity.domain.common.extensions.ActivityModelMapperExtensionsKt.toActivityCryptoAssetQuantityInformation(activityCryptoAssetQuantityFragment);
        java.lang.String value = (activityAmountInfoFragment == null || (amount2 = activityAmountInfoFragment.getAmount()) == null || (activityMoneyFragment2 = amount2.getActivityMoneyFragment()) == null) ? null : activityMoneyFragment2.getValue();
        if (activityAmountInfoFragment != null && (amount = activityAmountInfoFragment.getAmount()) != null && (activityMoneyFragment = amount.getActivityMoneyFragment()) != null && (currencyCode = activityMoneyFragment.getCurrencyCode()) != null) {
            str = currencyCode.toString();
        }
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation(value, str, activityAmountInfoFragment != null ? activityAmountInfoFragment.isAmountSettlementCanceled() : false, activityAmountInfoFragment != null ? activityAmountInfoFragment.isAmountNeutral() : false, activityCryptoAssetQuantityInformation);
    }

    public static final com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo toActivityRewardInfo(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment activityItemFragment) {
        com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus status;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Reward reward;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragment activityRewardDetailFragment = (activityItemFragment == null || (reward = activityItemFragment.getReward()) == null) ? null : reward.getActivityRewardDetailFragment();
        return new com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo(com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.INSTANCE.toRewardStatus((activityRewardDetailFragment == null || (status = activityRewardDetailFragment.getStatus()) == null) ? null : status.getRawValue()), activityRewardDetailFragment != null ? activityRewardDetailFragment.getDescription() : null, activityItemFragment != null ? toActivityRedeemedRewardInfo(activityItemFragment) : null, activityRewardDetailFragment != null ? activityRewardDetailFragment.getPoints() : null);
    }

    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain toActivitySubdomain(com.paypal.oslo.feature.activity.graphql.fragment.ActivitySubdomainFragment activitySubdomainFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySubdomainFragment, "");
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain(activitySubdomainFragment.getId(), activitySubdomainFragment.getType());
    }

    public static final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> toActivityActionItems(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment activityItemFragment) {
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Action> actions;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment;
        if (activityItemFragment == null || (actions = activityItemFragment.getActions()) == null) {
            arrayList = null;
        } else {
            java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Action> list = actions;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Action action : list) {
                com.paypal.oslo.api.graphql.schema.type.ActivityActionType type = action.getActivityActionsFragment().getType();
                java.lang.Object url = action.getActivityActionsFragment().getUrl();
                java.lang.String obj = url != null ? url.toString() : null;
                java.lang.String id = activityItemFragment.getId();
                java.lang.String groupId = activityItemFragment.getGroupId();
                java.lang.String invoiceId = activityItemFragment.getInvoiceId();
                com.paypal.oslo.api.graphql.schema.type.ActivityType type2 = activityItemFragment.getType();
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Flags flags = activityItemFragment.getFlags();
                arrayList2.add(new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel(type, obj, new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo(id, groupId, invoiceId, type2, (flags == null || (activityFlagsFragment = flags.getActivityFlagsFragment()) == null) ? null : com.paypal.oslo.feature.activity.domain.common.extensions.ActivityModelMapperExtensionsKt.toActivityFlags(activityFlagsFragment), toActivityCounterPartyAmountInformation(activityItemFragment), (java.lang.String) null, (java.lang.Boolean) null, activityItemFragment.getCreatedTime().toString(), 192, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    public static final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem> toActivityRedeemedRewardInfo(com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment activityItemFragment) {
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.RedeemedReward> redeemedRewards;
        if (activityItemFragment == null || (redeemedRewards = activityItemFragment.getRedeemedRewards()) == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.RedeemedReward> list = redeemedRewards;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragment redeemedRewardFragment = ((com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.RedeemedReward) it.next()).getRedeemedRewardFragment();
            arrayList.add(new com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem(redeemedRewardFragment.getPoints(), com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.INSTANCE.toActivityRewardType(redeemedRewardFragment.getType().getRawValue())));
        }
        return arrayList;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.CREDIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.DEBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
