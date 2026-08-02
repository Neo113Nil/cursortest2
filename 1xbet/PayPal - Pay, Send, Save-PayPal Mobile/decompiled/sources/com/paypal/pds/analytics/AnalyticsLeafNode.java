package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00010B!\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001c\u001a\u00020\f2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R.\u0010*\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030)\u0012\u0004\u0012\u00020\u00050(0'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010."}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsLeafNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "", "key", "Lkotlin/Function0;", "Lcom/paypal/pds/analytics/AnalyticsLeafState;", "stateProvider", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "", "update", "(Lkotlin/jvm/functions/Function0;)V", "onAttach", "()V", "onObservedReadsChanged", "onDetach", "readLocals", "", "currentTimestamp", "()J", "Lkotlin/Function1;", "Lcom/paypal/pds/analytics/AnalyticsEventScope;", "Lcom/paypal/pds/analytics/AnalyticsEvent;", "Lkotlin/ExtensionFunctionType;", "creator", "track", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/pds/analytics/AnalyticsLeafNode$TraverseKey;", "traverseKey", "Lcom/paypal/pds/analytics/AnalyticsLeafNode$TraverseKey;", "getTraverseKey", "()Lcom/paypal/pds/analytics/AnalyticsLeafNode$TraverseKey;", "p0", "Lkotlin/jvm/functions/Function0;", "getStateProvider", "()Lkotlin/jvm/functions/Function0;", "", "", "Lcom/paypal/pds/analytics/TypedKey;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "Lcom/paypal/pds/analytics/AnalyticsProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/pds/analytics/AnalyticsProvider;", "getHighSpeedVideoFpsRangesFor", "TraverseKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public class AnalyticsLeafNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.node.TraversableNode {
    public static final int $stable = 8;
    private java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.paypal.pds.analytics.AnalyticsProvider getHighSpeedVideoFpsRangesFor;
    private kotlin.jvm.functions.Function0<? extends com.paypal.pds.analytics.AnalyticsLeafState> stateProvider;
    private final com.paypal.pds.analytics.AnalyticsLeafNode.TraverseKey traverseKey;

    public AnalyticsLeafNode(java.lang.Object obj, kotlin.jvm.functions.Function0<? extends com.paypal.pds.analytics.AnalyticsLeafState> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.traverseKey = new com.paypal.pds.analytics.AnalyticsLeafNode.TraverseKey(obj);
        this.stateProvider = function0;
        this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.emptyList();
        this.getHighSpeedVideoFpsRangesFor = com.paypal.pds.analytics.AnalyticsProviderStub.INSTANCE;
    }

    public /* synthetic */ AnalyticsLeafNode(java.lang.Object obj, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.Unit.INSTANCE : obj, (i & 2) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.analytics.AnalyticsLeafNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState;
                analyticsLeafState = com.paypal.pds.analytics.AnalyticsLeafState.None.INSTANCE;
                return analyticsLeafState;
            }
        } : function0);
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public com.paypal.pds.analytics.AnalyticsLeafNode.TraverseKey getTraverseKey() {
        return this.traverseKey;
    }

    public final kotlin.jvm.functions.Function0<com.paypal.pds.analytics.AnalyticsLeafState> getStateProvider() {
        return this.stateProvider;
    }

    public final void update(kotlin.jvm.functions.Function0<? extends com.paypal.pds.analytics.AnalyticsLeafState> stateProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateProvider, "");
        this.stateProvider = stateProvider;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new com.paypal.pds.analytics.AnalyticsLeafNode$onObservedReadsChanged$1(this));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.Camera2StreamConfigurationMap = com.paypal.pds.analytics.AnalyticsLeafElementKt.buildAnalyticsChain(this);
    }

    public void readLocals() {
        this.getHighSpeedVideoFpsRangesFor = (com.paypal.pds.analytics.AnalyticsProvider) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, com.paypal.pds.analytics.AnalyticsProviderKt.getLocalAnalyticsProvider());
    }

    public final long currentTimestamp() {
        return this.getHighSpeedVideoFpsRangesFor.currentTimestamp();
    }

    public final void track(kotlin.jvm.functions.Function1<? super com.paypal.pds.analytics.AnalyticsEventScope, ? extends com.paypal.pds.analytics.AnalyticsEvent> creator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creator, "");
        com.paypal.pds.analytics.AnalyticsProvider analyticsProvider = this.getHighSpeedVideoFpsRangesFor;
        if (com.paypal.pds.analytics.AnalyticsProviderKt.isStub(analyticsProvider)) {
            analyticsProvider = null;
        }
        if (analyticsProvider != null) {
            analyticsProvider.track(creator.invoke(new com.paypal.pds.analytics.AnalyticsEventScope(currentTimestamp(), getIsAttached() ? com.paypal.pds.analytics.AnalyticsLeafElementKt.buildAnalyticsChain(this) : this.Camera2StreamConfigurationMap)));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsLeafNode$TraverseKey;", "", "key", "<init>", "(Ljava/lang/Object;)V", "copy", "(Ljava/lang/Object;)Lcom/paypal/pds/analytics/AnalyticsLeafNode$TraverseKey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TraverseKey {
        public static final int $stable = 8;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        public TraverseKey(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TraverseKey(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.pds.analytics.AnalyticsLeafNode.TraverseKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((com.paypal.pds.analytics.AnalyticsLeafNode.TraverseKey) other).getHighResolutionOutputSizeshNQ4ISI);
        }

        public final com.paypal.pds.analytics.AnalyticsLeafNode.TraverseKey copy(java.lang.Object key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return new com.paypal.pds.analytics.AnalyticsLeafNode.TraverseKey(key);
        }

        public static /* synthetic */ com.paypal.pds.analytics.AnalyticsLeafNode.TraverseKey copy$default(com.paypal.pds.analytics.AnalyticsLeafNode.TraverseKey traverseKey, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = traverseKey.getHighResolutionOutputSizeshNQ4ISI;
            }
            return traverseKey.copy(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsLeafNode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
