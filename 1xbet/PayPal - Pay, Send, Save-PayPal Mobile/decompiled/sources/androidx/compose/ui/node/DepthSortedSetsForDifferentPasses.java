package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u000bJA\u0010\u0015\u001a\u00020\u000e2/\b\u0004\u0010\u0014\u001a)\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\u000e0\u0012H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010 \u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0011\u0010\"\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b!\u0010\u0018"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "affectsLookahead", "contains", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "(Landroidx/compose/ui/node/LayoutNode;)Z", "Landroidx/compose/ui/node/Invalidation;", "invalidation", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/Invalidation;)V", "remove", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "block", "popEach", "(Lkotlin/jvm/functions/Function3;)V", "isEmpty", "()Z", "isNotEmpty", "Landroidx/compose/ui/node/DepthSortedSet;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/node/DepthSortedSet;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getAffectsLookaheadMeasure", "affectsLookaheadMeasure"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.node.DepthSortedSet getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.node.DepthSortedSet getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.node.DepthSortedSet getHighSpeedVideoFpsRanges;

    public DepthSortedSetsForDifferentPasses(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.node.DepthSortedSet(z);
        this.getHighSpeedVideoFpsRanges = new androidx.compose.ui.node.DepthSortedSet(z);
        this.getHighSpeedVideoSizes = new androidx.compose.ui.node.DepthSortedSet(z);
    }

    public final boolean contains(androidx.compose.ui.node.LayoutNode node, boolean affectsLookahead) {
        boolean z = node.getLookaheadRoot() == null;
        boolean z2 = this.getHighSpeedVideoFpsRangesFor.contains(node) || this.getHighSpeedVideoFpsRanges.contains(node);
        return affectsLookahead ? !z && z2 : (z && z2) || this.getHighSpeedVideoSizes.contains(node);
    }

    public final boolean contains(androidx.compose.ui.node.LayoutNode node) {
        return this.getHighSpeedVideoFpsRangesFor.contains(node) || this.getHighSpeedVideoFpsRanges.contains(node) || this.getHighSpeedVideoSizes.contains(node);
    }

    public final void add(androidx.compose.ui.node.LayoutNode node, androidx.compose.ui.node.Invalidation invalidation) {
        int i = androidx.compose.ui.node.DepthSortedSetsForDifferentPasses.WhenMappings.$EnumSwitchMapping$0[invalidation.ordinal()];
        if (i == 1) {
            this.getHighSpeedVideoFpsRangesFor.add(node);
            this.getHighSpeedVideoSizes.add(node);
            return;
        }
        if (i == 2) {
            this.getHighSpeedVideoFpsRanges.add(node);
            this.getHighSpeedVideoSizes.add(node);
            return;
        }
        if (i == 3) {
            if (node.getLookaheadRoot() != null) {
                this.getHighSpeedVideoSizes.add(node);
                return;
            } else {
                this.getHighSpeedVideoFpsRangesFor.add(node);
                return;
            }
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (node.getLookaheadRoot() != null) {
            this.getHighSpeedVideoSizes.add(node);
        } else {
            this.getHighSpeedVideoFpsRanges.add(node);
        }
    }

    public final boolean remove(androidx.compose.ui.node.LayoutNode node) {
        return this.getHighSpeedVideoSizes.remove(node) || this.getHighSpeedVideoFpsRangesFor.remove(node) || this.getHighSpeedVideoFpsRanges.remove(node);
    }

    public final void popEach(kotlin.jvm.functions.Function3<? super androidx.compose.ui.node.LayoutNode, ? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> block) {
        androidx.compose.ui.node.LayoutNode pop;
        while (true) {
            boolean z = false;
            if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                pop = this.getHighSpeedVideoFpsRangesFor.pop();
                r2 = false;
                z = pop.getLookaheadRoot() != null;
            } else if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
                pop = this.getHighSpeedVideoFpsRanges.pop();
                if (pop.getLookaheadRoot() != null) {
                    z = true;
                }
            } else if (this.getHighSpeedVideoSizes.isEmpty()) {
                return;
            } else {
                pop = this.getHighSpeedVideoSizes.pop();
            }
            block.invoke(pop, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(r2));
        }
    }

    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRangesFor.isEmpty() && this.getHighSpeedVideoSizes.isEmpty() && this.getHighSpeedVideoFpsRanges.isEmpty();
    }

    public final boolean getAffectsLookaheadMeasure() {
        return (this.getHighSpeedVideoSizes.isEmpty() || this.getHighSpeedVideoFpsRangesFor.isEmpty()) ? false : true;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.node.Invalidation.values().length];
            try {
                iArr[androidx.compose.ui.node.Invalidation.LookaheadMeasurement.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.node.Invalidation.LookaheadPlacement.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.node.Invalidation.Measurement.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.node.Invalidation.Placement.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
