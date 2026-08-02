package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"T", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lkotlin/Function0;", "block", "withComposeStackTrace", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;", "child", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/unit/Density;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/unit/Density;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNodeKt {
    private static final androidx.compose.ui.unit.Density getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.DensityKt.Density$default(1.0f, 0.0f, 2, null);

    public static final <T> T withComposeStackTrace(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (java.lang.Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public static final androidx.compose.ui.node.Owner requireOwner(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.node.Owner owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("LayoutNode should be attached to an owner");
        throw new kotlin.KotlinNothingValueException();
    }

    public static final void add(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.node.LayoutNode layoutNode2) {
        layoutNode.insertAt$ui(layoutNode.getChildren$ui().size(), layoutNode2);
    }
}
