package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/paging/ActiveFlowTracker;", "", "Landroidx/paging/CachedPageEventFlow;", "cachedPageEventFlow", "", "onNewCachedEventFlow", "(Landroidx/paging/CachedPageEventFlow;)V", "Landroidx/paging/ActiveFlowTracker$FlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "onStart", "(Landroidx/paging/ActiveFlowTracker$FlowType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onComplete", "FlowType"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ActiveFlowTracker {
    java.lang.Object onComplete(androidx.paging.ActiveFlowTracker.FlowType flowType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void onNewCachedEventFlow(androidx.paging.CachedPageEventFlow<?> cachedPageEventFlow);

    java.lang.Object onStart(androidx.paging.ActiveFlowTracker.FlowType flowType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/paging/ActiveFlowTracker$FlowType;", "", "<init>", "(Ljava/lang/String;I)V", "PAGED_DATA_FLOW", "PAGE_EVENT_FLOW"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FlowType {
        public static final androidx.paging.ActiveFlowTracker.FlowType PAGED_DATA_FLOW;
        public static final androidx.paging.ActiveFlowTracker.FlowType PAGE_EVENT_FLOW;
        private static final /* synthetic */ androidx.paging.ActiveFlowTracker.FlowType[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private FlowType(java.lang.String str, int i) {
        }

        static {
            androidx.paging.ActiveFlowTracker.FlowType flowType = new androidx.paging.ActiveFlowTracker.FlowType("PAGED_DATA_FLOW", 0);
            PAGED_DATA_FLOW = flowType;
            androidx.paging.ActiveFlowTracker.FlowType flowType2 = new androidx.paging.ActiveFlowTracker.FlowType("PAGE_EVENT_FLOW", 1);
            PAGE_EVENT_FLOW = flowType2;
            androidx.paging.ActiveFlowTracker.FlowType[] flowTypeArr = {flowType, flowType2};
            getHighResolutionOutputSizeshNQ4ISI = flowTypeArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(flowTypeArr);
        }

        public static androidx.paging.ActiveFlowTracker.FlowType[] values() {
            return (androidx.paging.ActiveFlowTracker.FlowType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static androidx.paging.ActiveFlowTracker.FlowType valueOf(java.lang.String str) {
            return (androidx.paging.ActiveFlowTracker.FlowType) java.lang.Enum.valueOf(androidx.paging.ActiveFlowTracker.FlowType.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.paging.ActiveFlowTracker.FlowType> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }
}
