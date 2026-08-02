package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u00020\u000b2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u000b2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0016\u001a\u00020\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubSectionMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubTransactionItemUiModelMapper;", "transactionMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubTransactionItemUiModelMapper;)V", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "transactions", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivitySectionUiState;", "mapUpcomingSection", "(Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapPendingSection", "mapCompletedSection", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "p1", "p2", "", "p3", "getHighSpeedVideoSizes", "(Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubTransactionItemUiModelMapper;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityHubSectionMapper {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ActivityHubSectionMapper(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubTransactionItemUiModelMapper, "");
        this.getHighSpeedVideoFpsRanges = activityHubTransactionItemUiModelMapper;
    }

    public final java.lang.Object mapUpcomingSection(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction> list, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState> continuation) {
        java.util.ArrayList arrayList;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList2) {
                if (((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) obj2).getStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UPCOMING) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        return getHighSpeedVideoSizes(arrayList, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_upcoming), creditProductIdentifier, false, continuation);
    }

    public final java.lang.Object mapPendingSection(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction> list, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState> continuation) {
        return getHighSpeedVideoSizes(list, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_pending), creditProductIdentifier, false, continuation);
    }

    public final java.lang.Object mapCompletedSection(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction> list, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState> continuation) {
        return getHighSpeedVideoSizes(list, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_completed), creditProductIdentifier, true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction> list, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper$toSectionUiModel$1 activityHubSectionMapper$toSectionUiModel$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper$toSectionUiModel$1) {
            activityHubSectionMapper$toSectionUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper$toSectionUiModel$1) continuation;
            if ((activityHubSectionMapper$toSectionUiModel$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                activityHubSectionMapper$toSectionUiModel$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = activityHubSectionMapper$toSectionUiModel$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityHubSectionMapper$toSectionUiModel$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (list == null) {
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Error(uiString);
                    }
                    if (list.isEmpty()) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Hidden.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper = this.getHighSpeedVideoFpsRanges;
                    java.util.Locale locale = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier);
                    activityHubSectionMapper$toSectionUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    activityHubSectionMapper$toSectionUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiString);
                    activityHubSectionMapper$toSectionUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    activityHubSectionMapper$toSectionUiModel$1.getHighSpeedVideoFpsRangesFor = uiString;
                    activityHubSectionMapper$toSectionUiModel$1.Camera2StreamConfigurationMap = z;
                    activityHubSectionMapper$toSectionUiModel$1.getOutputMinFrameDuration = 1;
                    obj = activityHubTransactionItemUiModelMapper.mapList(list, z, locale, activityHubSectionMapper$toSectionUiModel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = activityHubSectionMapper$toSectionUiModel$1.Camera2StreamConfigurationMap;
                    uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) activityHubSectionMapper$toSectionUiModel$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready(uiString, (java.util.List) obj);
            }
        }
        activityHubSectionMapper$toSectionUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper$toSectionUiModel$1(this, continuation);
        java.lang.Object obj2 = activityHubSectionMapper$toSectionUiModel$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityHubSectionMapper$toSectionUiModel$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready(uiString, (java.util.List) obj2);
    }
}
