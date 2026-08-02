package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailETATrackerSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "", "status", "Lcom/paypal/pds/components/TimelineState;", "getTimelineStateFromStatus", "(Ljava/lang/String;)Lcom/paypal/pds/components/TimelineState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailETATrackerSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailETATrackerSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailETATrackerSectionMapper();

    private TransactionDetailETATrackerSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment activityEtaProgressFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress etaProgress = input.getResult().getEtaProgress();
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone> milestones = (etaProgress == null || (activityEtaProgressFragment = etaProgress.getActivityEtaProgressFragment()) == null) ? null : activityEtaProgressFragment.getMilestones();
        return !(milestones == null || milestones.isEmpty());
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone> milestones;
        java.lang.String str;
        java.lang.String obj;
        java.lang.String displayDateTimeFormat$activity_prodRelease;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress etaProgress = input.getResult().getEtaProgress();
        java.util.ArrayList arrayList = null;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment activityEtaProgressFragment = etaProgress != null ? etaProgress.getActivityEtaProgressFragment() : null;
        int i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_payment_status_header;
        java.lang.String summary = activityEtaProgressFragment != null ? activityEtaProgressFragment.getSummary() : null;
        com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel = (summary == null || summary.length() == 0) ? null : new com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel(activityEtaProgressFragment.getSummary(), null, 2, null);
        if (activityEtaProgressFragment != null && (milestones = activityEtaProgressFragment.getMilestones()) != null) {
            java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone> list = milestones;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone milestone : list) {
                com.paypal.pds.components.TimelineState timelineStateFromStatus = INSTANCE.getTimelineStateFromStatus(milestone.getStatus().toString());
                java.lang.String description = milestone.getDescription();
                java.lang.String note = milestone.getNote();
                if (note != null && note.length() != 0) {
                    displayDateTimeFormat$activity_prodRelease = milestone.getNote();
                } else {
                    java.lang.Object milestoneTime = milestone.getMilestoneTime();
                    if (milestoneTime != null && (obj = milestoneTime.toString()) != null) {
                        displayDateTimeFormat$activity_prodRelease = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.toDisplayDateTimeFormat$activity_prodRelease(obj, input.getResult().getDisplayDateFormat());
                    } else {
                        str = null;
                        arrayList2.add(new com.paypal.pds.components.TimelineVerticalItem(description, timelineStateFromStatus, str, null, null, null, 56, null));
                    }
                }
                str = displayDateTimeFormat$activity_prodRelease;
                arrayList2.add(new com.paypal.pds.components.TimelineVerticalItem(description, timelineStateFromStatus, str, null, null, null, 56, null));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailEtaTrackerModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailEtaTrackerModel(arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList, null, descriptionAndLinkModel, java.lang.Integer.valueOf(i), true, 2, null));
    }

    public final com.paypal.pds.components.TimelineState getTimelineStateFromStatus(java.lang.String status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        int hashCode = status.hashCode();
        if (hashCode != 35394935) {
            if (hashCode != 1350822958) {
                if (hashCode == 1383663147 && status.equals("COMPLETED")) {
                    return com.paypal.pds.components.TimelineState.Success.INSTANCE;
                }
            } else if (status.equals("DECLINED")) {
                return com.paypal.pds.components.TimelineState.Alert.INSTANCE;
            }
        } else if (status.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS)) {
            return com.paypal.pds.components.TimelineState.INSTANCE.getInProgress();
        }
        return com.paypal.pds.components.TimelineState.INSTANCE.getNotStarted();
    }
}
