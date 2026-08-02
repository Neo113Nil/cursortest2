package com.ingo.sdk.android.ux.feature.history.list;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR,\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010)\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010("}, d2 = {"Lcom/ingo/sdk/android/ux/feature/history/list/HistoryListFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/ingo/sdk/android/ux/feature/history/list/TransactionHistoryViewModelImpl;", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/android/ux/feature/history/list/TransactionHistoryViewModelImpl;", "", "", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionHistoryResponse;", "getInputFormats", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableState;", "", "Lcom/ingo/sdk/android/ux/viewprovider/DateHeaderCell;", "", "Lcom/ingo/sdk/android/ux/viewprovider/HistoryCell;", "getOutputFormats", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Z", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HistoryListFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int defaultPageSize = 30;
    public static final int defaultStartingPage = 1;
    public static final int $stable = 8;
    private final com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl Camera2StreamConfigurationMap = new com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl(null, 1, null);

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Integer, com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.util.Map<com.ingo.sdk.android.ux.viewprovider.DateHeaderCell, java.util.List<com.ingo.sdk.android.ux.viewprovider.HistoryCell>>> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.MapsKt.emptyMap(), null, 2, null);
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges = 1;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.runtime.MutableState<java.lang.String> getOutputFormats = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI = true;

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionList;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl transactionHistoryViewModelImpl = this.Camera2StreamConfigurationMap;
        com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment = this;
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(historyListFragment, transactionHistoryViewModelImpl.getFailure(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.m10663$r8$lambda$XU7vAIW5FOD3ZGTUtR0a5DVdE(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        });
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(historyListFragment, transactionHistoryViewModelImpl.getHistoryResponseData(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.$r8$lambda$8_VoILEtqc4PVt4qWour6zASyso(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.this, (com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse) obj);
            }
        });
        this.Camera2StreamConfigurationMap.getTransactionHistory(this.getHighSpeedVideoFpsRanges, 30, this.getOutputFormats.getValue());
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-944541046, true, new com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$onCreateView$1$1(this, composeView)));
        return composeView;
    }

    /* renamed from: $r8$lambda$48pslU-npPoGF2YLuGARQcsth1U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10662$r8$lambda$48pslUnpPoGF2YLuGARQcsth1U(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment) {
        historyListFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(historyListFragment.getHighResolutionOutputSizeshNQ4ISI.isEmpty()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8_VoILEtqc4PVt4qWour6zASyso(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment, com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse transactionHistoryResponse) {
        com.ingo.sdk.android.ux.viewprovider.DateHeaderCell dateHeaderCell;
        if (transactionHistoryResponse != null) {
            historyListFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
            historyListFragment.getHighResolutionOutputSizeshNQ4ISI.put(java.lang.Integer.valueOf(historyListFragment.getHighSpeedVideoFpsRanges), transactionHistoryResponse);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator<T> it = historyListFragment.getHighSpeedVideoFpsRangesFor.getValue().entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                int i = -1;
                int i2 = 0;
                for (java.lang.Object obj : (java.lang.Iterable) entry2.getValue()) {
                    if (i2 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    if (((com.ingo.sdk.android.ux.viewprovider.HistoryCell) obj) instanceof com.ingo.sdk.android.ux.viewprovider.LoadingCell) {
                        i = i2;
                    }
                    i2++;
                }
                if (i >= 0) {
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Removing Loading Cell At Index ".concat(java.lang.String.valueOf(i)), null, 2, null);
                    java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) entry2.getValue());
                    mutableList.remove(i);
                    linkedHashMap.put(entry2.getKey(), mutableList);
                }
            }
            for (com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails : transactionHistoryResponse.getTransactions()) {
                java.util.Date date$default = com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProviderKt.toDate$default(transactionDetails.getCheckDetails().getCheckSubmissionDateUTC(), null, null, 3, null);
                if (date$default != null) {
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.setTime(date$default);
                    int i3 = calendar.get(2);
                    int i4 = calendar.get(1);
                    java.util.Iterator it2 = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            dateHeaderCell = null;
                            break;
                        }
                        dateHeaderCell = (com.ingo.sdk.android.ux.viewprovider.DateHeaderCell) it2.next();
                        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                        calendar2.setTime(dateHeaderCell.getDate());
                        int i5 = calendar2.get(2);
                        int i6 = calendar2.get(1);
                        if (i5 == i3 && i6 == i4) {
                            break;
                        }
                    }
                    if (dateHeaderCell != null) {
                        java.util.List list = (java.util.List) linkedHashMap.get(dateHeaderCell);
                        java.util.List mutableList2 = list != null ? kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list) : null;
                        if (mutableList2 != null) {
                            mutableList2.add(new com.ingo.sdk.android.ux.viewprovider.TransactionCell(transactionDetails));
                        }
                        if (mutableList2 != null) {
                            linkedHashMap.put(dateHeaderCell, mutableList2);
                        }
                    } else {
                        java.lang.String displayName = calendar.getDisplayName(2, 2, java.util.Locale.getDefault());
                        if (displayName == null) {
                            displayName = "";
                        }
                        linkedHashMap.put(new com.ingo.sdk.android.ux.viewprovider.DateHeaderCell(displayName, date$default), kotlin.collections.CollectionsKt.listOf(new com.ingo.sdk.android.ux.viewprovider.TransactionCell(transactionDetails)));
                    }
                }
            }
            if (transactionHistoryResponse.getTransactions().size() == 30 && !linkedHashMap.keySet().isEmpty()) {
                java.util.List list2 = (java.util.List) linkedHashMap.get(kotlin.collections.CollectionsKt.last(linkedHashMap.keySet()));
                java.util.List mutableList3 = list2 != null ? kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list2) : null;
                if (mutableList3 != null) {
                    mutableList3.add(new com.ingo.sdk.android.ux.viewprovider.LoadingCell());
                }
                if (mutableList3 != null) {
                    linkedHashMap.put(kotlin.collections.CollectionsKt.last(linkedHashMap.keySet()), mutableList3);
                }
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "There are more results, adding loading cell", null, 2, null);
            } else {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "There are NOT more results", null, 2, null);
                historyListFragment.getInputSizeshNQ4ISI = false;
            }
            historyListFragment.getHighSpeedVideoFpsRanges++;
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Updating List State", null, 2, null);
            historyListFragment.getHighSpeedVideoFpsRangesFor.setValue(linkedHashMap);
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), historyListFragment.getHighSpeedVideoFpsRangesFor.getValue().toString(), null, 2, null);
            if (!transactionHistoryResponse.getTransactions().isEmpty()) {
                historyListFragment.getOutputFormats.setValue(((com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails) kotlin.collections.CollectionsKt.last((java.util.List) transactionHistoryResponse.getTransactions())).getTransactionReferenceNumber());
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Updating currentTransactionReferenceNumber ".concat(java.lang.String.valueOf(historyListFragment.getOutputFormats)), null, 2, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KFJl4x1MjWUVNyClfmu4_LALwS8(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment) {
        historyListFragment.Camera2StreamConfigurationMap.getTransactionHistory(historyListFragment.getHighSpeedVideoFpsRanges, 30, historyListFragment.getOutputFormats.getValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RR1DcObngck3HSIepPlTtFVmC5U(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment) {
        historyListFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(historyListFragment.getHighResolutionOutputSizeshNQ4ISI.isEmpty()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XU7vAIW5-FOD3ZGTUtR0a5DV-dE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10663$r8$lambda$XU7vAIW5FOD3ZGTUtR0a5DVdE(final com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        historyListFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
        if (failure != null && (failure instanceof com.ingo.sdk.kotlin.common.core.exception.ApiFailure)) {
            java.lang.Throwable throwable = ((com.ingo.sdk.kotlin.common.core.exception.ApiFailure) failure).getThrowable();
            if (throwable instanceof com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) {
                com.ingo.sdk.kotlin.common.model.ApiErrorThrowable apiErrorThrowable = (com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) throwable;
                apiErrorThrowable.getErrorResponse();
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.exitOnUnplannedApiError$default(historyListFragment, failure, com.ingo.sdk.kotlin.common.constants.IngoModules.TRANSACTION_HISTORY, apiErrorThrowable, null, 8, null);
            } else {
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedExceptionWithRetry$default(historyListFragment, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.$r8$lambda$KFJl4x1MjWUVNyClfmu4_LALwS8(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.this);
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.m10662$r8$lambda$48pslUnpPoGF2YLuGARQcsth1U(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.this);
                    }
                }, com.ingo.sdk.kotlin.common.constants.IngoModules.TRANSACTION_HISTORY, false, null, 16, null);
            }
        } else {
            com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedExceptionWithRetry$default(historyListFragment, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.$r8$lambda$wPBzYWV58ChM7pQHJWCVxyKY4r8(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.this);
                }
            }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.$r8$lambda$RR1DcObngck3HSIepPlTtFVmC5U(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.this);
                }
            }, com.ingo.sdk.kotlin.common.constants.IngoModules.TRANSACTION_HISTORY, false, null, 16, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wPBzYWV58ChM7pQHJWCVxyKY4r8(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment) {
        historyListFragment.Camera2StreamConfigurationMap.getTransactionHistory(historyListFragment.getHighSpeedVideoFpsRanges, 30, historyListFragment.getOutputFormats.getValue());
        return kotlin.Unit.INSTANCE;
    }
}
