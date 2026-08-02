package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiDataMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/RewardsLandingData;", "domainData", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiData;", "toUiData", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/RewardsLandingData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiData;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/SectionData;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiDataMapper$SectionType;", "p0", "Landroidx/compose/ui/graphics/Color;", "p1", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/rewardsactionlistsection/RewardsActionListSectionUiData;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/SectionData;Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiDataMapper$SectionType;J)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/rewardsactionlistsection/RewardsActionListSectionUiData;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/SectionItemData;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/rewardsactionlistsection/CardUiData;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/SectionItemData;Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiDataMapper$SectionType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/rewardsactionlistsection/CardUiData;", "Companion", "SectionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsLandingUiDataMapper {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.Companion(null);
    private static final long getHighSpeedVideoSizes = androidx.compose.ui.graphics.ColorKt.Color(4284796671L);
    private static final java.util.List<com.paypal.pds.components.TabData> defaultTabs = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.TabData[]{new com.paypal.pds.components.TabData("Earn", null, null, 6, null), new com.paypal.pds.components.TabData("Redeem", null, null, 6, null), new com.paypal.pds.components.TabData(lib.android.paypal.com.magnessdk.c.b.i, null, null, 6, null), new com.paypal.pds.components.TabData("Benefits", null, null, 6, null)});

    @javax.inject.Inject
    public RewardsLandingUiDataMapper() {
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiData toUiData(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData domainData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainData, "");
        long Color = androidx.compose.ui.graphics.ColorKt.Color(domainData.getHeaderData().getTierColorHex());
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HeaderData headerData = domainData.getHeaderData();
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.header.RewardsHeaderUiData rewardsHeaderUiData = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.header.RewardsHeaderUiData(headerData.getTierName(), Color, headerData.getPoints(), headerData.getPointsDescription(), null);
        java.util.List<com.paypal.pds.components.TabData> list = defaultTabs;
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.TrackerData trackerData = domainData.getTrackerData();
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData trackerUiData = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData(trackerData.getCurrentTier(), trackerData.getPointsEarned(), trackerData.getMilestones(), trackerData.getTotalPoints());
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.SectionData earnSectionData = domainData.getEarnSectionData();
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.EarnScreenUiData earnScreenUiData = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.EarnScreenUiData(trackerUiData, earnSectionData != null ? Camera2StreamConfigurationMap(earnSectionData, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType.Camera2StreamConfigurationMap, Color) : null);
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.SectionData redeemSectionData = domainData.getRedeemSectionData();
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiData(rewardsHeaderUiData, list, earnScreenUiData, new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RedeemScreenUiData(redeemSectionData != null ? Camera2StreamConfigurationMap(redeemSectionData, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType.getHighSpeedVideoFpsRangesFor, Color) : null));
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiDataMapper$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "getHighSpeedVideoSizes", "J", "", "Lcom/paypal/pds/components/TabData;", "defaultTabs", "Ljava/util/List;", "getDefaultTabs", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<com.paypal.pds.components.TabData> getDefaultTabs() {
            return com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.defaultTabs;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData Camera2StreamConfigurationMap(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.SectionData sectionData, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType sectionType, long j) {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.SectionItemData> items = sectionData.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : items) {
            if (((com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.SectionItemData) obj).isCompleted()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.SectionItemData) it.next(), sectionType));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.SectionItemData> items2 = sectionData.getItems();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj2 : items2) {
            if (!((com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.SectionItemData) obj2).isCompleted()) {
                arrayList5.add(obj2);
            }
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
        java.util.Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList7.add(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.SectionItemData) it2.next(), sectionType));
        }
        java.util.ArrayList arrayList8 = arrayList7;
        return new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData(sectionData.getTitle(), sectionType == com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType.Camera2StreamConfigurationMap ? getHighSpeedVideoSizes : j, sectionData.getSeeMoreKey(), sectionData.getSeeLessKey(), sectionData.getSecondaryTitle(), sectionData.getItems().size() > sectionData.getDefaultVisibleCount(), sectionData.getDefaultVisibleCount(), arrayList4, arrayList8, null);
    }

    private static com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.CardUiData getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.SectionItemData sectionItemData, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType sectionType) {
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType trailingIconType;
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.HalfSheetUiData halfSheetUiData;
        java.lang.String title = sectionItemData.getTitle();
        java.lang.String description = sectionItemData.getDescription();
        java.lang.String iconUrl = sectionItemData.getIconUrl();
        java.lang.String actionType = sectionItemData.getActionType();
        java.lang.String actionUrl = sectionItemData.getActionUrl();
        boolean isCompleted = sectionItemData.isCompleted();
        if (isCompleted && sectionType == com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType.Camera2StreamConfigurationMap) {
            trailingIconType = com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType.Completed;
        } else {
            trailingIconType = (isCompleted && sectionType == com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType.getHighSpeedVideoFpsRangesFor) ? com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType.Details : com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType.Chevron;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType trailingIconType2 = trailingIconType;
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HalfSheetData halfSheetData = sectionItemData.getHalfSheetData();
        if (halfSheetData != null) {
            halfSheetUiData = new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.HalfSheetUiData(halfSheetData.getTitle(), halfSheetData.getDescription(), halfSheetData.getTermsKey(), halfSheetData.getCtaKey(), halfSheetData.getCtaActionUrl());
        } else {
            halfSheetUiData = new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.HalfSheetUiData("", "", "", "", "");
        }
        return new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.CardUiData(title, description, iconUrl, actionType, actionUrl, trailingIconType2, halfSheetUiData);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiDataMapper$SectionType;", "", "<init>", "(Ljava/lang/String;I)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class SectionType {
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType Camera2StreamConfigurationMap;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType[] getHighSpeedVideoSizes;

        static {
            com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType sectionType = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType("EARN", 0);
            Camera2StreamConfigurationMap = sectionType;
            com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType sectionType2 = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType("REDEEM", 1);
            getHighSpeedVideoFpsRangesFor = sectionType2;
            com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType[] sectionTypeArr = {sectionType, sectionType2};
            getHighSpeedVideoSizes = sectionTypeArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(sectionTypeArr);
        }

        private SectionType(java.lang.String str, int i) {
        }

        public static com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType[] values() {
            return (com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper.SectionType.class, str);
        }
    }
}
