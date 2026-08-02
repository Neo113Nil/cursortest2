package com.paypal.oslo.feature.activity.domain.ledger.remote.mock;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u0007*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/remote/mock/ActivityLedgerGraphQLMockTestResults;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment$Item;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserSectionedActivitiesQuery$Data;", "Lcom/paypal/oslo/feature/activity/domain/base/alias/SectionedActivitiesQueryData;", "toSectionedActivitiesQueryData", "(Ljava/util/List;)Lcom/paypal/oslo/feature/activity/graphql/GetUserSectionedActivitiesQuery$Data;", "fetchActivityLedgerGraphQLMockResults", "()Ljava/util/List;", "getActivityPageItems", "Lcom/paypal/oslo/feature/activity/domain/ledger/remote/ActivityItemsResult;", "getMockActivityItemsResult", "()Lcom/paypal/oslo/feature/activity/domain/ledger/remote/ActivityItemsResult;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "Camera2StreamConfigurationMap", "AvatarType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerGraphQLMockTestResults {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final com.paypal.oslo.api.graphql.schema.type.ActivityType Camera2StreamConfigurationMap = com.paypal.oslo.api.graphql.schema.type.ActivityType.MONEY_REQUEST;

    private ActivityLedgerGraphQLMockTestResults() {
    }

    public final com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Data toSectionedActivitiesQueryData(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Data(new com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Upcoming("", new com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment(new com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page("", new com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment(list, "", false)), java.lang.Integer.valueOf(list.size()))), new com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Pending("", new com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment(new com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page("", new com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment(list, "", false)), java.lang.Integer.valueOf(list.size()))), new com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Completed("", new com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment(new com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page("", new com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment(list, "", false)), java.lang.Integer.valueOf(list.size()))));
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> fetchActivityLedgerGraphQLMockResults() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item[]{getHighResolutionOutputSizeshNQ4ISI(this, "1", "10", null, null, null, null, null, null, null, null, null, null, null, null, null, com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.ALL, null, null, null, null, null, 16646140), getHighResolutionOutputSizeshNQ4ISI(this, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "20", null, null, null, null, null, null, null, null, null, null, null, null, null, com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.IMAGE, null, null, null, null, null, 16646140), getHighResolutionOutputSizeshNQ4ISI(this, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "30", null, null, null, null, null, null, null, null, null, null, null, null, null, com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.INITIALS, null, null, null, null, null, 16646140), getHighResolutionOutputSizeshNQ4ISI(this, "4", "40", null, null, null, null, null, null, null, null, null, null, null, null, null, com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.ICON, null, null, null, null, null, 16646140), getHighResolutionOutputSizeshNQ4ISI(this, "5", "50", null, null, null, null, null, null, null, null, null, null, null, null, null, com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.GENERIC, null, null, null, null, null, 16646140), getHighResolutionOutputSizeshNQ4ISI(this, "89", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.STRING_VALUE_NINETY, null, null, null, null, null, null, null, null, null, null, null, null, null, com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.NONE, null, null, null, null, null, 16646140), getHighResolutionOutputSizeshNQ4ISI(this, "7", "70", null, null, null, null, null, null, null, null, null, null, null, null, null, com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.INITIALS, null, "", null, null, "InitialsActivityAvatar", 11927548), getHighResolutionOutputSizeshNQ4ISI(this, "8", "80", null, null, null, null, null, null, null, null, null, null, null, null, null, com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.ICON, null, null, "", null, "IconActivityAvatar", 11403260), getHighResolutionOutputSizeshNQ4ISI(this, "9", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.STRING_VALUE_NINETY, null, null, null, null, null, null, null, null, null, null, null, null, null, com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.GENERIC, null, null, null, "", "GenericActivityAvatar", 10354684)});
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> getActivityPageItems() {
        return fetchActivityLedgerGraphQLMockResults();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult getMockActivityItemsResult() {
        com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Data sectionedActivitiesQueryData = toSectionedActivitiesQueryData(getActivityPageItems());
        com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Upcoming upcoming = sectionedActivitiesQueryData.getUpcoming();
        java.util.List list = null;
        java.lang.Object[] objArr = 0;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment activitiesFragment = upcoming != null ? upcoming.getActivitiesFragment() : null;
        com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Pending pending = sectionedActivitiesQueryData.getPending();
        return new com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult(new com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.SectionedActivitiesQueriesResult(activitiesFragment, pending != null ? pending.getActivitiesFragment() : null, sectionedActivitiesQueryData.getCompleted().getActivitiesFragment()), list, 2, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/remote/mock/ActivityLedgerGraphQLMockTestResults$AvatarType;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "IMAGE", "INITIALS", "ICON", "GENERIC", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AvatarType {
        public static final com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType ALL;
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType GENERIC;
        public static final com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType ICON;
        public static final com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType IMAGE;
        public static final com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType INITIALS;
        public static final com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType NONE;
        private static final /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType[] getHighSpeedVideoFpsRangesFor;

        private AvatarType(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType avatarType = new com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType("ALL", 0);
            ALL = avatarType;
            com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType avatarType2 = new com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType("IMAGE", 1);
            IMAGE = avatarType2;
            com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType avatarType3 = new com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType("INITIALS", 2);
            INITIALS = avatarType3;
            com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType avatarType4 = new com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType("ICON", 3);
            ICON = avatarType4;
            com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType avatarType5 = new com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType("GENERIC", 4);
            GENERIC = avatarType5;
            com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType avatarType6 = new com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType("NONE", 5);
            NONE = avatarType6;
            com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType[] avatarTypeArr = {avatarType, avatarType2, avatarType3, avatarType4, avatarType5, avatarType6};
            getHighSpeedVideoFpsRangesFor = avatarTypeArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(avatarTypeArr);
        }

        public static com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType[] values() {
            return (com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType) java.lang.Enum.valueOf(com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    private static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults activityLedgerGraphQLMockTestResults, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType avatarType, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, int i) {
        java.lang.String str19 = (i & 1) != 0 ? "dummyId" : str;
        java.lang.String str20 = (i & 2) != 0 ? "dummyGroupId" : str2;
        java.lang.String str21 = (i & 4) != 0 ? "2025-01-01T00:00:00.000Z" : str3;
        java.lang.String str22 = (i & 8) != 0 ? "MMM dd, yyyy" : str4;
        java.lang.String str23 = (i & 16) != 0 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE : str5;
        java.lang.String str24 = (i & 32) != 0 ? "John Doe" : str6;
        java.lang.String str25 = (i & 64) != 0 ? "john.doe@example.com" : str7;
        java.lang.String str26 = (i & 128) != 0 ? "Dummy transaction" : str8;
        java.lang.String str27 = (i & 256) != 0 ? "USD" : str9;
        java.lang.String str28 = (i & 512) != 0 ? "100.00" : str10;
        java.lang.String str29 = (i & 4096) != 0 ? "System note" : str11;
        java.lang.String str30 = (i & 8192) != 0 ? "User note" : str12;
        java.lang.String str31 = (i & 16384) != 0 ? "ETA note" : str13;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus2 = (32768 & i) != 0 ? com.paypal.oslo.api.graphql.schema.type.ActivityStatus.COMPLETED : activityStatus;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType2 = (65536 & i) != 0 ? Camera2StreamConfigurationMap : activityType;
        java.lang.String str32 = (262144 & i) != 0 ? "https://example.com/avatar.png" : str14;
        java.lang.String str33 = (524288 & i) != 0 ? "JD" : str15;
        java.lang.String str34 = (1048576 & i) != 0 ? "icon_name" : str16;
        java.lang.String str35 = (2097152 & i) != 0 ? "generic_icon" : str17;
        java.lang.String str36 = (i & 4194304) != 0 ? "Avatar" : str18;
        java.lang.String str37 = str26;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Counterparty counterparty = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Counterparty("", new com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment(str24, str25, null, null));
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.AmountInfo amountInfo = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.AmountInfo("", new com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment(new com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount("Money", new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment(str27, str28)), null, false, false));
        int i2 = com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.WhenMappings.$EnumSwitchMapping$0[avatarType.ordinal()];
        com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment imageActivityAvatarFragment = (i2 == 1 || i2 == 2) ? new com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment(str32, new com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar(""), null) : null;
        int i3 = com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.WhenMappings.$EnumSwitchMapping$0[avatarType.ordinal()];
        com.paypal.oslo.feature.activity.graphql.fragment.InitialsActivityAvatarFragment initialsActivityAvatarFragment = (i3 == 1 || i3 == 3) ? new com.paypal.oslo.feature.activity.graphql.fragment.InitialsActivityAvatarFragment(str33, null) : null;
        int i4 = com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.WhenMappings.$EnumSwitchMapping$0[avatarType.ordinal()];
        com.paypal.oslo.feature.activity.graphql.fragment.IconActivityAvatarFragment iconActivityAvatarFragment = (i4 == 1 || i4 == 4) ? new com.paypal.oslo.feature.activity.graphql.fragment.IconActivityAvatarFragment(str34) : null;
        int i5 = com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.WhenMappings.$EnumSwitchMapping$0[avatarType.ordinal()];
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item("", new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment(str19, str20, null, str21, str22, str23, null, counterparty, str37, amountInfo, new com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment.Avatar("", new com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment(str36, (i5 == 1 || i5 == 5) ? new com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragment(str35) : null, iconActivityAvatarFragment, imageActivityAvatarFragment, initialsActivityAvatarFragment)), null, null, str29, str30, "Transaction completed successfully", str31, activityStatus2, activityType2, null, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, null));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.values().length];
            try {
                iArr[com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.IMAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.INITIALS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.ICON.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.AvatarType.GENERIC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
