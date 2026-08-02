package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/ui/node/DelegatableNode;", "createPlatformRippleNode-TDGSqEk", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/DelegatableNode;", "createPlatformRippleNode"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Ripple_androidKt {
    /* renamed from: createPlatformRippleNode-TDGSqEk, reason: not valid java name */
    public static final androidx.compose.ui.node.DelegatableNode m2867createPlatformRippleNodeTDGSqEk(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.functions.Function0<androidx.compose.material.ripple.RippleAlpha> function0) {
        return new androidx.compose.material.ripple.AndroidRippleNode(interactionSource, z, f, colorProducer, function0, null);
    }

    public static final /* synthetic */ androidx.compose.material.ripple.RippleContainer access$createAndAttachRippleContainerIfNeeded(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof androidx.compose.material.ripple.RippleContainer) {
                return (androidx.compose.material.ripple.RippleContainer) childAt;
            }
        }
        androidx.compose.material.ripple.RippleContainer rippleContainer = new androidx.compose.material.ripple.RippleContainer(viewGroup.getContext());
        viewGroup.addView(rippleContainer);
        return rippleContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final /* synthetic */ android.view.ViewGroup access$findNearestViewGroup(android.view.View view) {
        while (!(view instanceof android.view.ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof android.view.View)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't find a valid parent for ");
                sb.append(view);
                sb.append(". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            view = parent;
        }
        return (android.view.ViewGroup) view;
    }
}
