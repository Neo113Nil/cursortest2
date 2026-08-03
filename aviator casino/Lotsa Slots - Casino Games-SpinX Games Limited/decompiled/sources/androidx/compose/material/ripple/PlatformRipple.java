package androidx.compose.material.ripple;

/* compiled from: Ripple.android.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\fJI\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/ripple/PlatformRipple;", "Landroidx/compose/material/ripple/Ripple;", "bounded", "", com.helpshift.proactive.InAppViewConstants.RADIUS, "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "findNearestViewGroup", "Landroid/view/ViewGroup;", "(Landroidx/compose/runtime/Composer;I)Landroid/view/ViewGroup;", "rememberUpdatedRippleInstance", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformRipple extends androidx.compose.material.ripple.Ripple {
    public /* synthetic */ PlatformRipple(boolean z, float f, androidx.compose.runtime.State state, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state);
    }

    private PlatformRipple(boolean z, float f, androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        super(z, f, state, null);
    }

    @Override // androidx.compose.material.ripple.Ripple
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public androidx.compose.material.ripple.RippleIndicationInstance mo1592rememberUpdatedRippleInstance942rkJo(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> color, androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> rippleAlpha, androidx.compose.runtime.Composer composer, int i) {
        android.view.View view;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "color");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        composer.startReplaceableGroup(331259447);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberUpdatedRippleInstance)P(2!1,3:c#ui.unit.Dp)64@2484L22,90@3354L160:Ripple.android.kt#vhb33q");
        android.view.ViewGroup findNearestViewGroup = findNearestViewGroup(composer, (i >> 15) & 14);
        composer.startReplaceableGroup(1643267286);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "67@2658L133");
        if (findNearestViewGroup.isInEditMode()) {
            composer.startReplaceableGroup(-3686552);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(interactionSource) | composer.changed(this);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material.ripple.CommonRippleIndicationInstance(z, f, color, rippleAlpha, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            return (androidx.compose.material.ripple.CommonRippleIndicationInstance) rememberedValue;
        }
        composer.endReplaceableGroup();
        int childCount = findNearestViewGroup.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                view = null;
                break;
            }
            view = findNearestViewGroup.getChildAt(i2);
            if (view instanceof androidx.compose.material.ripple.RippleContainer) {
                break;
            }
            i2++;
        }
        if (view == null) {
            android.content.Context context = findNearestViewGroup.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "view.context");
            view = new androidx.compose.material.ripple.RippleContainer(context);
            findNearestViewGroup.addView(view);
        }
        composer.startReplaceableGroup(-3686095);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(interactionSource) | composer.changed(this) | composer.changed(view);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.material.ripple.AndroidRippleIndicationInstance(z, f, color, rippleAlpha, (androidx.compose.material.ripple.RippleContainer) view, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return (androidx.compose.material.ripple.AndroidRippleIndicationInstance) rememberedValue2;
    }

    private final android.view.ViewGroup findNearestViewGroup(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1737891121);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(findNearestViewGroup)105@4003L7:Ripple.android.kt#vhb33q");
        androidx.compose.runtime.ProvidableCompositionLocal<android.view.View> localView = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localView);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        while (!(consume instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = ((android.view.View) consume).getParent();
            if (!(parent instanceof android.view.View)) {
                throw new java.lang.IllegalArgumentException(("Couldn't find a valid parent for " + consume + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parent, "parent");
            consume = parent;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) consume;
        composer.endReplaceableGroup();
        return viewGroup;
    }
}
